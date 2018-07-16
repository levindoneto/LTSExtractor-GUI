
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author lgtneto
 */
public class MainPanel extends javax.swing.JFrame {

    /**
     * Create new form MainPanel
     */
    public MainPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        specificationButton = new javax.swing.JButton();
        filterLabel = new javax.swing.JLabel();
        specificationLabel = new javax.swing.JLabel();
        refinementLabel = new javax.swing.JLabel();
        panelLabel = new javax.swing.JLabel();
        listOfLogsLabel = new javax.swing.JLabel();
        filterButton = new javax.swing.JButton();
        listOfLogsButton = new javax.swing.JButton();
        actionLabel = new javax.swing.JLabel();
        refinementButton = new javax.swing.JButton();
        callModeActionButton = new javax.swing.JRadioButton();
        terminationModeActionButton = new javax.swing.JRadioButton();
        enterModeActionButton = new javax.swing.JRadioButton();
        toolbar = new javax.swing.JMenuBar();
        fileToolbarButton = new javax.swing.JMenu();
        editToolbarButton = new javax.swing.JMenu();
        helpToolbarButton = new javax.swing.JMenu();
        aboutToolbarButton = new javax.swing.JMenu();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTextArea.setColumns(20);
        panelTextArea.setRows(5);
        jScrollPane2.setViewportView(panelTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 620, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 163, -1, -1));

        specificationButton.setBackground(new java.awt.Color(176, 190, 197));
        specificationButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        specificationButton.setText("Upload File");
        specificationButton.setToolTipText("Specification to be included in the model file in one of the formats allowed by the LTSA tool");
        specificationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                specificationButtonMouseClicked(evt);
            }
        });
        specificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specificationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(specificationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 173, -1));

        filterLabel.setBackground(new java.awt.Color(55, 71, 79));
        filterLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        filterLabel.setForeground(new java.awt.Color(255, 255, 255));
        filterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterLabel.setText("Filter");
        filterLabel.setOpaque(true);
        getContentPane().add(filterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 32));

        specificationLabel.setBackground(new java.awt.Color(55, 71, 79));
        specificationLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        specificationLabel.setForeground(new java.awt.Color(255, 255, 255));
        specificationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        specificationLabel.setText("Specification");
        specificationLabel.setOpaque(true);
        getContentPane().add(specificationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 310, 32));

        refinementLabel.setBackground(new java.awt.Color(55, 71, 79));
        refinementLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        refinementLabel.setForeground(new java.awt.Color(255, 255, 255));
        refinementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refinementLabel.setText("                                                   Refinement");
        refinementLabel.setOpaque(true);
        getContentPane().add(refinementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 621, 32));

        panelLabel.setBackground(new java.awt.Color(55, 71, 79));
        panelLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panelLabel.setForeground(new java.awt.Color(255, 255, 255));
        panelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelLabel.setText("Panel");
        panelLabel.setToolTipText("Panel with the output given by the LTSE tool");
        panelLabel.setOpaque(true);
        getContentPane().add(panelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 620, 32));

        listOfLogsLabel.setBackground(new java.awt.Color(55, 71, 79));
        listOfLogsLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listOfLogsLabel.setForeground(new java.awt.Color(255, 255, 255));
        listOfLogsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listOfLogsLabel.setText("List of Logs");
        listOfLogsLabel.setOpaque(true);
        getContentPane().add(listOfLogsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 310, 32));

        filterButton.setBackground(new java.awt.Color(176, 190, 197));
        filterButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filterButton.setText("Upload File");
        filterButton.setToolTipText("Name of \".flt\" file containing the names of actions to be included in the model");
        filterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterButtonMouseClicked(evt);
            }
        });
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(filterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 173, -1));

        listOfLogsButton.setBackground(new java.awt.Color(176, 190, 197));
        listOfLogsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listOfLogsButton.setText("Upload File");
        listOfLogsButton.setToolTipText("List of names of \".log\" files containing each one execution trace with context information");
        listOfLogsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOfLogsButtonMouseClicked(evt);
            }
        });
        listOfLogsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfLogsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(listOfLogsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 173, -1));

        actionLabel.setBackground(new java.awt.Color(55, 71, 79));
        actionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        actionLabel.setForeground(new java.awt.Color(255, 255, 255));
        actionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actionLabel.setText("Action");
        actionLabel.setToolTipText(" Determines how actions related to method calls/execution are represented and interpreted");
        actionLabel.setOpaque(true);
        getContentPane().add(actionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 621, 32));

        refinementButton.setBackground(new java.awt.Color(176, 190, 197));
        refinementButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        refinementButton.setText("Upload File");
        refinementButton.setToolTipText("Name of \".ref\" file containing the names of attributes to be included in context information");
        refinementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refinementButtonMouseClicked(evt);
            }
        });
        refinementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refinementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(refinementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 173, -1));

        buttonGroup1.add(callModeActionButton);
        callModeActionButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        callModeActionButton.setSelected(false);
        callModeActionButton.setText("Call Mode");
        callModeActionButton.setToolTipText("Action name \"m\" represents the call of the corresponding method m");
        callModeActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callModeActionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(callModeActionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        buttonGroup1.add(terminationModeActionButton);
        terminationModeActionButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        terminationModeActionButton.setText("Termination Mode");
        terminationModeActionButton.setToolTipText("Action name \"m\" represents the termination of the corresponding method m");
        terminationModeActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminationModeActionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(terminationModeActionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        buttonGroup1.add(enterModeActionButton);
        enterModeActionButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enterModeActionButton.setText("Enter Mode");
        enterModeActionButton.setToolTipText("action name \"m.enter\" represents the beginning of the execution of corresponding method m, whereas \"m.exit\" represents the end of the execution");
        getContentPane().add(enterModeActionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        fileToolbarButton.setText("File");
        fileToolbarButton.setToolTipText("File menu");
        fileToolbarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        toolbar.add(fileToolbarButton);

        editToolbarButton.setText("Edit");
        editToolbarButton.setToolTipText("Edit menu");
        toolbar.add(editToolbarButton);

        helpToolbarButton.setText("Help");
        helpToolbarButton.setToolTipText("Page with help on how to use the tool");
        toolbar.add(helpToolbarButton);

        aboutToolbarButton.setText("About");
        aboutToolbarButton.setToolTipText("Information about the tool");
        toolbar.add(aboutToolbarButton);

        setJMenuBar(toolbar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void specificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specificationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specificationButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterButtonActionPerformed

    private void listOfLogsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfLogsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listOfLogsButtonActionPerformed

    private void refinementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refinementButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refinementButtonActionPerformed

    private void filterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseClicked
        File filterFile = getFileFromUser(); 
    }//GEN-LAST:event_filterButtonMouseClicked

    private void refinementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refinementButtonMouseClicked
        File refinementFile = getFileFromUser(); 
    }//GEN-LAST:event_refinementButtonMouseClicked

    private void listOfLogsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOfLogsButtonMouseClicked
        File listOfLogsFile = getFileFromUser(); 
    }//GEN-LAST:event_listOfLogsButtonMouseClicked

    private void specificationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specificationButtonMouseClicked
        File specificationFile = getFileFromUser();
    }//GEN-LAST:event_specificationButtonMouseClicked

    private void callModeActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callModeActionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_callModeActionButtonActionPerformed

    private void terminationModeActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminationModeActionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terminationModeActionButtonActionPerformed

    private File getFileFromUser() {                                          
        JFileChooser fileChooser = new JFileChooser();
        // Set current directory
        fileChooser.setCurrentDirectory(
            new File(System.getProperty("user.home"))
        );
        // Show up the dialog:
        int show = fileChooser.showOpenDialog(this);
        if (JFileChooser.APPROVE_OPTION == show) {
            return fileChooser.getSelectedFile();
        }   
        return null; // if no file has been selected
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutToolbarButton;
    private javax.swing.JLabel actionLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JRadioButton callModeActionButton;
    private javax.swing.JMenu editToolbarButton;
    private javax.swing.JRadioButton enterModeActionButton;
    private javax.swing.JMenu fileToolbarButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JMenu helpToolbarButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listOfLogsButton;
    private javax.swing.JLabel listOfLogsLabel;
    private javax.swing.JLabel panelLabel;
    private javax.swing.JTextArea panelTextArea;
    private javax.swing.JButton refinementButton;
    private javax.swing.JLabel refinementLabel;
    private javax.swing.JButton specificationButton;
    private javax.swing.JLabel specificationLabel;
    private javax.swing.JRadioButton terminationModeActionButton;
    private javax.swing.JMenuBar toolbar;
    // End of variables declaration//GEN-END:variables
}
