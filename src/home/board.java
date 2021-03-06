
package home;

import solver.MainSolver;
import solver.PathCreator;
import detail.DetailIMG;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Albertus Kelvin
 */
public class board extends javax.swing.JFrame {

    // timer attributes
    int mm, ss;
    String preMM, preSS;
    boolean viewDone;
    static Timer timer;
    
    // matrix of wordament 
    private char[][] matrix = new char[4][4];
    
    // location of dictionary
    private final String dictLOC;
    
    // final point of found words
    private Integer finalPoint;
    
    // final result of found words
    private List<String> finalResult;
    
    // total point of found words
    private List<Integer> totalPoint;
    
    // cell path
    private List<PathCreator> cellPath;
    
    // solver's object pointer
    MainSolver ms;
    
    /**
     * Creates new form board
     * @param dictLOC location of dictionary
     */
    public board(String dictLOC) {
        initComponents();
        this.dictLOC = dictLOC;  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_title = new javax.swing.JLabel();
        jPanel_matrix = new javax.swing.JPanel();
        jText_00 = new javax.swing.JTextField();
        jText_02 = new javax.swing.JTextField();
        jText_01 = new javax.swing.JTextField();
        jText_03 = new javax.swing.JTextField();
        jText_10 = new javax.swing.JTextField();
        jText_11 = new javax.swing.JTextField();
        jText_12 = new javax.swing.JTextField();
        jText_13 = new javax.swing.JTextField();
        jText_20 = new javax.swing.JTextField();
        jText_21 = new javax.swing.JTextField();
        jText_22 = new javax.swing.JTextField();
        jText_23 = new javax.swing.JTextField();
        jText_30 = new javax.swing.JTextField();
        jText_31 = new javax.swing.JTextField();
        jText_32 = new javax.swing.JTextField();
        jText_33 = new javax.swing.JTextField();
        jButton_solve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_foundwords = new javax.swing.JTable();
        jLabel_totaltitle = new javax.swing.JLabel();
        jLabel_totalvalue = new javax.swing.JLabel();
        jButton_show = new javax.swing.JButton();
        jPanel_timer = new javax.swing.JPanel();
        jLabel_timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_title.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel_title.setText("Wordament Solver");

        jPanel_matrix.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matrix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18))); // NOI18N

        jText_00.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_00.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_02.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_02.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_01.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_01.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_03.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jText_10.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_10.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_11.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_11.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_12.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_12.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_13.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_13.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_20.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_20.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_21.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_21.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_22.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_22.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_23.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_23.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_30.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_30.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_31.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_31.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_32.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_32.setMargin(new java.awt.Insets(2, 2, 2, 10));

        jText_33.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jText_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jText_33.setMargin(new java.awt.Insets(2, 2, 2, 10));

        javax.swing.GroupLayout jPanel_matrixLayout = new javax.swing.GroupLayout(jPanel_matrix);
        jPanel_matrix.setLayout(jPanel_matrixLayout);
        jPanel_matrixLayout.setHorizontalGroup(
            jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_matrixLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_matrixLayout.createSequentialGroup()
                        .addComponent(jText_00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel_matrixLayout.createSequentialGroup()
                        .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_matrixLayout.createSequentialGroup()
                        .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jText_21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_matrixLayout.createSequentialGroup()
                        .addComponent(jText_01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jText_02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel_matrixLayout.setVerticalGroup(
            jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_matrixLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel_matrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jText_00.getAccessibleContext().setAccessibleName("");

        jButton_solve.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton_solve.setText("Solve");
        jButton_solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_solveActionPerformed(evt);
            }
        });

        jTable_foundwords.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTable_foundwords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Words", "Point"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_foundwords);

        jLabel_totaltitle.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel_totaltitle.setText("Total points:");

        jLabel_totalvalue.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel_totalvalue.setText("0");

        jButton_show.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton_show.setText("Show");
        jButton_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showActionPerformed(evt);
            }
        });

        jPanel_timer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Timer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N

        jLabel_timer.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel_timer.setText("02:00");

        javax.swing.GroupLayout jPanel_timerLayout = new javax.swing.GroupLayout(jPanel_timer);
        jPanel_timer.setLayout(jPanel_timerLayout);
        jPanel_timerLayout.setHorizontalGroup(
            jPanel_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_timerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_timer)
                .addGap(80, 80, 80))
        );
        jPanel_timerLayout.setVerticalGroup(
            jPanel_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_timer, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel_matrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_solve, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel_title)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel_totaltitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_totalvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_title)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel_matrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_timer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_solve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_totalvalue)
                        .addComponent(jLabel_totaltitle)))
                .addGap(38, 38, 38)
                .addComponent(jButton_show, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Show the error message based on it's type
     * @param checkType the error type
     */
    private void showErrorMessage(String checkType) {
        if (checkType.equals("board")) {
            JOptionPane.showMessageDialog(this, "A cell can only contains one character", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
    * Show the success message when all of valid words successfully
    * found
    */
    public void showDoneMessage() {
        JOptionPane.showMessageDialog(this, "Done!", "Solver status", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Validate the board's element.
     * The board is valid if each cell has a value and the length of the value is 1,
     * otherwise it's invalid
     */
    private boolean validateBoard() {
        
        boolean valid = true;
        
        // first row
        if (!(jText_00.getText().length() == 1) || !(jText_01.getText().length() == 1) || !(jText_02.getText().length() == 1) || !(jText_03.getText().length() == 1)) {
            valid = false;
        } 
        
        // second row
        if (valid) {
            if (!(jText_10.getText().length() == 1) || !(jText_11.getText().length() == 1) || !(jText_12.getText().length() == 1) || !(jText_13.getText().length() == 1)) {
                valid = false;
            } 
        }
        
        // third row
        if (valid) {
            if (!(jText_20.getText().length() == 1) || !(jText_21.getText().length() == 1) || !(jText_22.getText().length() == 1) || !(jText_23.getText().length() == 1)) {
                valid = false;
            }
        }
        
        // fourth row
        if (valid) {
            if (!(jText_30.getText().length() == 1) || !(jText_31.getText().length() == 1) || !(jText_32.getText().length() == 1) || !(jText_33.getText().length() == 1)) {
                valid = false;
            }
        }
        
        return valid;
    }
    
    /**
     * Initialize array of char (matrix) with the
     * value from jTextField
     */
    private void initMatrix() {
        // first row
        matrix[0][0] = jText_00.getText().charAt(0);
        matrix[0][1] = jText_01.getText().charAt(0);
        matrix[0][2] = jText_02.getText().charAt(0);
        matrix[0][3] = jText_03.getText().charAt(0);
        
        // second row
        matrix[1][0] = jText_10.getText().charAt(0);
        matrix[1][1] = jText_11.getText().charAt(0);
        matrix[1][2] = jText_12.getText().charAt(0);
        matrix[1][3] = jText_13.getText().charAt(0);
        
        // third row
        matrix[2][0] = jText_20.getText().charAt(0);
        matrix[2][1] = jText_21.getText().charAt(0);
        matrix[2][2] = jText_22.getText().charAt(0);
        matrix[2][3] = jText_23.getText().charAt(0);
        
        // fourth row
        matrix[3][0] = jText_30.getText().charAt(0);
        matrix[3][1] = jText_31.getText().charAt(0);
        matrix[3][2] = jText_32.getText().charAt(0);
        matrix[3][3] = jText_33.getText().charAt(0);
    }
    
    /**
     * Start the solving process
     * @param evt 
     */
    private void jButton_solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_solveActionPerformed
        
        boolean boardValidity;
        
        boardValidity = validateBoard();
        if (boardValidity) {
            initMatrix();
            
            // disable the Solve and Show button
            jButton_solve.setEnabled(false);
            jButton_show.setEnabled(false);
            
            // initialize the timer attribute
            mm = 2;
            ss = 0;
            viewDone = false;
            
            // create timer task for decrement time
            TimerTask timerTask = new TimerTask() {

                @Override
                public void run() {
            
                    if (ss == 0) {
                        ss = 59;
                        mm--;
                    } else {
                        ss--;
                    }
                    
                }
            };
            
            // create thread to print the timer    
            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {
                    while (true) {
                        try {
                            
                            if ((mm == 0 && ss == 0) || (viewDone)) {
                                // end the timer
                                timer.cancel();
                                
                                // show the success message
                                showDoneMessage();
                                
                                // enable the Solve and Show button
                                jButton_solve.setEnabled(true);
                                jButton_show.setEnabled(true);
                                
                                break;
                            }
                            
                            if (mm < 10) {
                                preMM = "0";
                            } else {
                                preMM = "";
                            }
                            if (ss < 10) {
                                preSS = "0";
                            } else {
                                preSS = "";
                            }
                            
                            jLabel_timer.setText(preMM + Integer.toString(mm) + " : " + preSS + Integer.toString(ss));
                            Thread.sleep(550);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                   
                }
            });

            timer = new Timer("MyTimer");
            timer.scheduleAtFixedRate(timerTask, 1, 550);
            t.start();
            
            // create a solver's object
            ms = new MainSolver(matrix, dictLOC);
            
            try {
                    
                // solve the wordament
                ms.solve();
                
                // get the found words
                finalResult = ms.getResult();

                // get the total points
                totalPoint = ms.getTotalPoint();
            
                // get the cumulated total points (final point)
                finalPoint = ms.getFinalPoint();
                  
                // show the words on table
                new View().showResult();
                
                // get the cell path
                cellPath = ms.getCellPath();
                        
            } catch (IOException e) {}
            
        } else {
            showErrorMessage("board");
        }
    }//GEN-LAST:event_jButton_solveActionPerformed

    private void jButton_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showActionPerformed
        
        // KAMUS
        Integer[] matchID;
        int idxRow = jTable_foundwords.getSelectedRow();
        
        // ALGORITMA
        if(idxRow != -1) {
            // get the word
            String clickedElmt_word = (jTable_foundwords.getModel().getValueAt(idxRow, 1).toString());
        
            List<PathCreator> fPC = new ArrayList<PathCreator>();
            int counter = 0;
            int comparedID = 0;
            for (PathCreator pc : cellPath) {
                if (pc.word.equals(clickedElmt_word)) {
                    if (counter == 0) {
                        counter = 1;
                        comparedID = pc.id;
                        fPC.add(pc);
                        //System.out.println(pc.id + " " + pc.word + " " + pc.idx + ", " + pc.idy);
                    } else {
                        if (pc.id == comparedID) {
                            fPC.add(pc);
                            //System.out.println(pc.id + " " + pc.word + " " + pc.idx + ", " + pc.idy);
                        }
                    }
                }
            }
            
            int[] idxfPC = new int[fPC.size()];
            for (int i = 0; i < fPC.size(); i++) {
                idxfPC[i] = i;
            }
            
            PathCreator.possibleID = new ArrayList<Integer[]>();
            PathCreator.chosenfPC = fPC;
            PathCreator.model = matrix;
            PathCreator.Permute(idxfPC, 0);
            matchID = PathCreator.getPath();
            
            DetailIMG DI = new DetailIMG(fPC, matchID);
            DI.setVisible(true);
            
            // show the path of how to find the related word
            DI.showHowTo();
        } else {
            JOptionPane.showMessageDialog(this, "Choose one row from the table to see the detail", "No row chosen", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton_showActionPerformed

    /**
     * Class View
     * Responsible to show all outputs on the board
     */
    private class View {
        
        /**
         * Clear all elements on table
         */
        public void clearTable() {
            DefaultTableModel model = (DefaultTableModel) jTable_foundwords.getModel();
            model.setRowCount(0);
        }
        
        /**
        * Show the found words on table, including
        * their ID, body, and point
        */
        public void showWordsOnTable() {
            
            // KAMUS 
            Object[][] data = new Object[finalResult.size()][3];
            String[] header = {"ID", "Words", "Point"};
            DefaultTableModel model = (DefaultTableModel) jTable_foundwords.getModel();
            
            // ALGORITMA
            
            // clear the table
            clearTable();
            
            Thread tt = new Thread(new Runnable() {

                @Override
                public void run() {

                    // fill the data object with all of the found words
                    for (int i = 0; i < finalResult.size(); i++) {
                        data[i][0] = i;
                        data[i][1] = finalResult.get(i);
                        data[i][2] = totalPoint.get(i);

                        // insert a row
                        final Object dati0 = data[i][0];
                        final Object dati1 = data[i][1];
                        final Object dati2 = data[i][2];

                        model.addRow(new Object[]{dati0, dati1, dati2});

                        try {
                            Thread.sleep(150);
                        } catch(InterruptedException ie) {}

                    }

                    viewDone = true;
                    
                }
            });
                
            tt.start();
                
            
            // update isi tabel foundwords
            /*
            jTable_foundwords.setModel(new DefaultTableModel(data, header) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            });
            */
            
        }
        
        /**
         * Show total points on label
         */
        public void showTotalPoints() {
            jLabel_totalvalue.setText(Integer.toString(finalPoint));
        }
        
        /**
         * Show all final outputs
         */
        public void showResult() {
            
            // show results on table
            showWordsOnTable();
            
            // show total points
            showTotalPoints();
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board(args[0]).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_show;
    private javax.swing.JButton jButton_solve;
    private javax.swing.JLabel jLabel_timer;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_totaltitle;
    private javax.swing.JLabel jLabel_totalvalue;
    private javax.swing.JPanel jPanel_matrix;
    private javax.swing.JPanel jPanel_timer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_foundwords;
    private javax.swing.JTextField jText_00;
    private javax.swing.JTextField jText_01;
    private javax.swing.JTextField jText_02;
    private javax.swing.JTextField jText_03;
    private javax.swing.JTextField jText_10;
    private javax.swing.JTextField jText_11;
    private javax.swing.JTextField jText_12;
    private javax.swing.JTextField jText_13;
    private javax.swing.JTextField jText_20;
    private javax.swing.JTextField jText_21;
    private javax.swing.JTextField jText_22;
    private javax.swing.JTextField jText_23;
    private javax.swing.JTextField jText_30;
    private javax.swing.JTextField jText_31;
    private javax.swing.JTextField jText_32;
    private javax.swing.JTextField jText_33;
    // End of variables declaration//GEN-END:variables
}
