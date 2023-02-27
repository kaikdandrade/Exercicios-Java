package Aval;

import Control.PopUp;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Aval extends javax.swing.JFrame {

    public Aval() {
        initComponents();
        setLocationRelativeTo(null);

        JTableHeader header = tableRead.getTableHeader();
        header.setFont(new Font("cambria", 400, 16));
        DefaultTableCellRenderer tableHeader = (DefaultTableCellRenderer) header.getDefaultRenderer();
        tableHeader.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer tableCell = new DefaultTableCellRenderer();
        tableCell.setHorizontalAlignment(SwingConstants.CENTER);
        for(int colInit = 0; colInit < tableRead.getColumnModel().getColumnCount(); colInit++) {
            tableRead.getColumnModel().getColumn(colInit).setCellRenderer(tableCell);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameContent = new javax.swing.JInternalFrame();
        panelMain = new javax.swing.JPanel();
        panelRead = new javax.swing.JPanel();
        scrollRead = new javax.swing.JScrollPane();
        tableRead = new javax.swing.JTable();
        btnReadEdit = new javax.swing.JButton();
        panelCreate = new javax.swing.JPanel();
        labelCreate1 = new javax.swing.JLabel();
        labelCreate2 = new javax.swing.JLabel();
        btnCreateEnter = new javax.swing.JButton();
        btnCreateClear = new javax.swing.JButton();
        txtCreateAuthor = new javax.swing.JTextField();
        txtCreateTitle = new javax.swing.JTextField();
        txtCreatePrice = new javax.swing.JFormattedTextField();
        txtCreateISBN = new javax.swing.JFormattedTextField();
        spinnerCreatePags = new javax.swing.JSpinner();
        labelCreate3 = new javax.swing.JLabel();
        labelCreate4 = new javax.swing.JLabel();
        labelCreate5 = new javax.swing.JLabel();
        labelCreate6 = new javax.swing.JLabel();
        labelCreate7 = new javax.swing.JLabel();
        panelUpdate = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemRead = new javax.swing.JMenuItem();
        menuItemCreate = new javax.swing.JMenuItem();
        menuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avaliação");
        setBackground(new java.awt.Color(0, 71, 171));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setName("frame"); // NOI18N

        frameContent.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frameContent.setVisible(true);

        panelMain.setLayout(new java.awt.CardLayout());

        panelRead.setBackground(new java.awt.Color(0, 71, 171));

        tableRead.setAutoCreateRowSorter(true);
        tableRead.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tableRead.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "ISBN", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRead.setAlignmentX(0.0F);
        tableRead.setAlignmentY(0.0F);
        tableRead.setColumnSelectionAllowed(true);
        tableRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableRead.setRowHeight(25);
        tableRead.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableRead.setShowGrid(true);
        tableRead.getTableHeader().setResizingAllowed(false);
        tableRead.getTableHeader().setReorderingAllowed(false);
        scrollRead.setViewportView(tableRead);
        tableRead.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnReadEdit.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnReadEdit.setText("Editar Livro");
        btnReadEdit.setAlignmentY(0.0F);
        btnReadEdit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReadEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReadEdit.setFocusable(false);
        btnReadEdit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnReadEdit.setMaximumSize(new java.awt.Dimension(130, 30));
        btnReadEdit.setMinimumSize(new java.awt.Dimension(130, 30));
        btnReadEdit.setPreferredSize(new java.awt.Dimension(130, 30));

        javax.swing.GroupLayout panelReadLayout = new javax.swing.GroupLayout(panelRead);
        panelRead.setLayout(panelReadLayout);
        panelReadLayout.setHorizontalGroup(
            panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollRead, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(panelReadLayout.createSequentialGroup()
                        .addComponent(btnReadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelReadLayout.setVerticalGroup(
            panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnReadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollRead, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelRead, "card2");

        panelCreate.setBackground(new java.awt.Color(0, 71, 171));

        labelCreate1.setFont(new java.awt.Font("Cambria", 0, 26)); // NOI18N
        labelCreate1.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate1.setText("Novo Livro:");

        labelCreate2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelCreate2.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate2.setText("<html>Forneça os dados abaixo para realizar o cadastro deste livro,  <br/>lembre-se de preencher os campo corretamente.</html>");

        btnCreateEnter.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnCreateEnter.setText("Salvar");
        btnCreateEnter.setAlignmentY(0.0F);
        btnCreateEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateEnter.setFocusable(false);
        btnCreateEnter.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCreateEnter.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        btnCreateEnter.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCreateEnter.setPreferredSize(new java.awt.Dimension(80, 30));

        btnCreateClear.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnCreateClear.setText("Limpar");
        btnCreateClear.setAlignmentY(0.0F);
        btnCreateClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateClear.setFocusable(false);
        btnCreateClear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCreateClear.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        btnCreateClear.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCreateClear.setPreferredSize(new java.awt.Dimension(80, 30));

        txtCreateAuthor.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtCreateAuthor.setAlignmentX(0.0F);
        txtCreateAuthor.setAlignmentY(0.0F);
        txtCreateAuthor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCreateAuthor.setMinimumSize(new java.awt.Dimension(130, 30));
        txtCreateAuthor.setPreferredSize(new java.awt.Dimension(130, 30));

        txtCreateTitle.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtCreateTitle.setAlignmentX(0.0F);
        txtCreateTitle.setAlignmentY(0.0F);
        txtCreateTitle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCreateTitle.setMinimumSize(new java.awt.Dimension(230, 30));
        txtCreateTitle.setPreferredSize(new java.awt.Dimension(230, 30));

        txtCreatePrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        txtCreatePrice.setAlignmentX(0.0F);
        txtCreatePrice.setAlignmentY(0.0F);
        txtCreatePrice.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtCreatePrice.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCreatePrice.setMinimumSize(new java.awt.Dimension(100, 26));
        txtCreatePrice.setPreferredSize(new java.awt.Dimension(100, 26));

        try {
            txtCreateISBN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###-####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCreateISBN.setAlignmentX(0.0F);
        txtCreateISBN.setAlignmentY(0.0F);
        txtCreateISBN.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtCreateISBN.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCreateISBN.setMinimumSize(new java.awt.Dimension(230, 30));
        txtCreateISBN.setPreferredSize(new java.awt.Dimension(230, 30));

        spinnerCreatePags.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        spinnerCreatePags.setAlignmentX(0.0F);
        spinnerCreatePags.setAlignmentY(0.0F);
        spinnerCreatePags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spinnerCreatePags.setMinimumSize(new java.awt.Dimension(100, 26));
        spinnerCreatePags.setPreferredSize(new java.awt.Dimension(100, 26));

        labelCreate3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelCreate3.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate3.setText("Título:");

        labelCreate4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelCreate4.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate4.setText("Páginas:");

        labelCreate5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelCreate5.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate5.setText("Autor:");

        labelCreate6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelCreate6.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate6.setText("ISBN:");

        labelCreate7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelCreate7.setForeground(new java.awt.Color(255, 255, 255));
        labelCreate7.setText("Valor:");

        javax.swing.GroupLayout panelCreateLayout = new javax.swing.GroupLayout(panelCreate);
        panelCreate.setLayout(panelCreateLayout);
        panelCreateLayout.setHorizontalGroup(
            panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateLayout.createSequentialGroup()
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCreate5)
                                .addComponent(labelCreate3))
                            .addComponent(labelCreate6)
                            .addComponent(labelCreate4)
                            .addComponent(labelCreate7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelCreateLayout.createSequentialGroup()
                                    .addComponent(btnCreateEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCreateClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCreateISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCreateAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCreateTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spinnerCreatePags, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCreatePrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCreate1)
                            .addComponent(labelCreate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 157, Short.MAX_VALUE))
        );
        panelCreateLayout.setVerticalGroup(
            panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(labelCreate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCreate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCreate3)
                    .addComponent(txtCreateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCreate5))
                .addGap(12, 12, 12)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreateISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCreate6))
                .addGap(12, 12, 12)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerCreatePags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCreate4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCreate7))
                .addGap(18, 18, 18)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panelMain.add(panelCreate, "panelCreate");

        panelUpdate.setBackground(new java.awt.Color(0, 71, 171));

        javax.swing.GroupLayout panelUpdateLayout = new javax.swing.GroupLayout(panelUpdate);
        panelUpdate.setLayout(panelUpdateLayout);
        panelUpdateLayout.setHorizontalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        panelUpdateLayout.setVerticalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        panelMain.add(panelUpdate, "card4");

        javax.swing.GroupLayout frameContentLayout = new javax.swing.GroupLayout(frameContent.getContentPane());
        frameContent.getContentPane().setLayout(frameContentLayout);
        frameContentLayout.setHorizontalGroup(
            frameContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameContentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        frameContentLayout.setVerticalGroup(
            frameContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameContentLayout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        menuFile.setText("Arquivo");

        menuItemRead.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/icon_read.png"))); // NOI18N
        menuItemRead.setText("Ler Dados");
        menuItemRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReadActionPerformed(evt);
            }
        });
        menuFile.add(menuItemRead);

        menuItemCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/icon_new.png"))); // NOI18N
        menuItemCreate.setText("Novo Registro");
        menuItemCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateActionPerformed(evt);
            }
        });
        menuFile.add(menuItemCreate);

        menuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuItemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/icon_logout.png"))); // NOI18N
        menuItemLogout.setText("Logout");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        menuFile.add(menuItemLogout);

        menuBar.add(menuFile);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameContent)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameContent))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemReadActionPerformed

    private void menuItemCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateActionPerformed
        openCard("panelCreate");
    }//GEN-LAST:event_menuItemCreateActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        // Se clicar em "Sim"...
        if (PopUp.showConfirm("Fazer logout:", "Deseja realmente fechar o aplicativo?")) {
            // ... fecha/sai do aplicativo
            System.exit(0);
        }
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateClear;
    private javax.swing.JButton btnCreateEnter;
    private javax.swing.JButton btnReadEdit;
    private javax.swing.JInternalFrame frameContent;
    private javax.swing.JLabel labelCreate1;
    private javax.swing.JLabel labelCreate2;
    private javax.swing.JLabel labelCreate3;
    private javax.swing.JLabel labelCreate4;
    private javax.swing.JLabel labelCreate5;
    private javax.swing.JLabel labelCreate6;
    private javax.swing.JLabel labelCreate7;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemCreate;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenuItem menuItemRead;
    private javax.swing.JPanel panelCreate;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRead;
    private javax.swing.JPanel panelUpdate;
    private javax.swing.JScrollPane scrollRead;
    private javax.swing.JSpinner spinnerCreatePags;
    private javax.swing.JTable tableRead;
    private javax.swing.JTextField txtCreateAuthor;
    private javax.swing.JFormattedTextField txtCreateISBN;
    private javax.swing.JFormattedTextField txtCreatePrice;
    private javax.swing.JTextField txtCreateTitle;
    // End of variables declaration//GEN-END:variables

    public void openCard(String cardName) {
        java.awt.CardLayout card = (java.awt.CardLayout) panelMain.getLayout();
        card.show(panelMain, cardName);
    }

//    private void readAll() {
//        try {
//            DefaultTableModel tableModel = (DefaultTableModel) tableRead.getModel();
//
//            // Apaga as linhas da tabela
//            tableModel.setNumRows(0);
//
//            // Conecta ao banco
//            conn = dbConnection.connect();
//            String sql = "SELECT g_id, g_type, g_name, g_platform, g_media, g_status FROM game WHERE g_status != 'del'";
//
//            // Prepara, filtra e sanitiza o SQL e depois executa
//            pstm = conn.prepareStatement(sql);
//            res = pstm.executeQuery();
//
//            while (res.next()) {
//                tableModel.addRow(new Object[]{
//                    res.getInt("g_id"),
//                    res.getString("g_type"),
//                    res.getString("g_name"),
//                    res.getString("g_platform"),
//                    res.getString("g_media"),
//                    res.getString("g_status")
//                });
//            }
//        } catch (SQLException error) {
//            PopUps.showError("Main.readAll\n" + error);
//        } finally {
//            dbConnection.dbClose(conn, pstm, res);
//        }
//    }
//
//    private void loadSelected(String action) {
//        try {
//            int selected = tableRead.getSelectedRow();
//            if (selected < 0) {
//                PopUps.showAlert("Selecione um item primeiro.");
//            } else {
//                // Capta o id da linha selecionada
//                int selectedId = (int) tableRead.getModel().getValueAt(selected, 0);
//                String sql = "SELECT * FROM game WHERE g_id = ? AND g_status != 'del'";
//
//                // Conecta ao banco de dados
//                conn = dbConnection.connect();
//
//                // Prepara, filtra e sanitiza o SQL e dps executa
//                pstm = conn.prepareStatement(sql);
//
//                // Substitui o "?" na query pelo Id do registro
//                pstm.setInt(1, selectedId);
//
//                // Executa a query e armazena resultado(s) em res
//                res = pstm.executeQuery();
//
//                // Carrega o método correto de acordo com a ação escolhida → action
//                switch (action) {
//                    case "view" ->
//                        viewData(res);
//                    case "edit" ->
//                        editData(res);
//                    default ->
//                        PopUps.showAlert("Nenhum registro foi selecinado.");
//                }
//            }
//        } catch (SQLException error) {
//            PopUps.showError("Main.loadSelected\n" + error);
//        } finally {
//            dbConnection.dbClose(conn, pstm, res);
//        }
//    }
//
//    private void viewData(ResultSet res) {
//        // Desabilita os campos...
//        txtViewStatus.setEditable(false);
//        txtViewId.setEditable(false);
//        txtViewType.setEditable(false);
//        txtViewName.setEditable(false);
//        txtViewPlatform.setEditable(false);
//        txtViewMedia.setEditable(false);
//        txtViewSinopse.setEditable(false);
//
//        try {
//            res.next();
//            txtViewId.setText(res.getString("g_id"));
//            String txtDateView = "Data e Hora de registro: ";
//            txtViewDate.setText(txtDateView + "[" + res.getString("g_date") + "]");
//            txtViewType.setText(res.getString("g_type"));
//            txtViewName.setText(res.getString("g_name"));
//            txtViewPlatform.setText(res.getString("g_platform"));
//            txtViewMedia.setText(res.getString("g_media"));
//            txtViewSinopse.setText(res.getString("g_sinopse"));
//            txtViewStatus.setText(res.getString("g_status"));
//
//            // Verifica o status do registro e seleciona o checkbox respectivo
//            if (!res.getString("g_status").equals("on")) {
//                checkboxEditStatusOff.setSelected(true);
//            } else {
//                checkboxEditStatusOn.setSelected(true);
//            }
//            openCard("panelView");
//
//        } catch (SQLException error) {
//            PopUps.showError("Main.viewData\n" + error);
//        } finally {
//            dbConnection.dbClose(null, null, res);
//        }
//    }
//
//    private void editData(ResultSet res) {
//        // Desabilita o campo ID
//        txtEditId.setEditable(false);
//        try {
//            res.next();
//            txtEditId.setText(res.getString("g_id"));
//            txtEditType.setText(res.getString("g_type"));
//            txtEditName.setText(res.getString("g_name"));
//            txtEditPlatform.setText(res.getString("g_platform"));
//            txtEditMedia.setText(res.getString("g_media"));
//            txtEditSinopse.setText(res.getString("g_sinopse"));
//
//            openCard("panelEdit");
//
//        } catch (SQLException error) {
//            PopUps.showError("Main.editData\n" + error);
//        } finally {
//            dbConnection.dbClose(null, null, res);
//        }
//    }
//
//    private void deleteData(int dataId) {
//        int liabilityContract = PopUps.showConfirm("Oooops!", "Deseja Excluir esse registro?");
//        if (liabilityContract == 0) {
//            liabilityContract = PopUps.showConfirmAlert("Realmente Deseja excluir esse registro.\nIsso Será permanente! Isto é sem volta!\nAo clicar em proseguir automaticamente você assina o termo de responsabilidade...\nIsto é qualquer problema gerado por conta da exclusão desse dado cabe apenas a você!");
//        }
//
//        if (liabilityContract == 0) {
//            try {
//                String sql = "UPDATE game SET g_status = 'del' WHERE g_id = ?";
//
//                // Conecta ao banco de dados
//                conn = dbConnection.connect();
//
//                // Prepara, filtra e sanitiza o SQL e depois executa
//                pstm = conn.prepareStatement(sql);
//                // Substitui "?" pelo id do registro
//                pstm.setInt(1, dataId);
//                pstm.executeUpdate();
//
//                // Atualiza a listagem de registros e volta para panelRead
//                readAll();
//                openCard("panelRead");
//
//            } catch (SQLException error) {
//                PopUps.showError("Main.deleteData\n" + error);
//            } finally {
//                dbConnection.dbClose(conn, pstm, null);
//            }
//        }
//    }
//
//    public void updateData() {
//        int dialogButton = PopUps.showConfirm("Confirmação:", "Deseja salvar as alterações?");
//
//        if (dialogButton == 0) {
//            try {
//                String sql = "UPDATE game SET g_type = ?, g_name = ?, g_platform = ?, g_media = ?, g_sinopse = ?, g_status = ? WHERE g_id = ?";
//
//                // Conecta com o banco de dados
//                conn = dbConnection.connect();
//
//                // Prepara, filtra e sanitiza o sql e depois executa a query
//                pstm = conn.prepareStatement(sql);
//
//                // Substitui os "?" no SQL pelos valores corretos
//                pstm.setString(7, txtEditId.getText());
//                pstm.setString(1, txtEditType.getText());
//                pstm.setString(2, txtEditName.getText());
//                pstm.setString(3, txtEditPlatform.getText());
//                pstm.setString(4, txtEditMedia.getText());
//                pstm.setString(5, txtEditSinopse.getText());
//
//                if (checkboxEditStatusOn.getSelectedObjects() != null) {
//                    pstm.setString(6, "on");
//                } else if (checkboxEditStatusOff != null) {
//                    pstm.setString(6, "off");
//                }
//
//                pstm.executeUpdate();
//
//                // Atualiza a listagem de registros e volta para panelRead
//                readAll();
//                openCard("panelRead");
//
//            } catch (SQLException error) {
//                PopUps.showError("Main.deleteData\n" + error);
//            } finally {
//                dbConnection.dbClose(conn, pstm, null);
//            }
//        }
//    }
//
//    public void exitApp() {
//        int dialogButton = PopUps.showConfirm("Saindo...", "Sair do aplicativo?");
//
//        if (dialogButton == 0) {
//            System.exit(0);
//        }
//    }
//
//    public void formRefresh(int dataId) {
//        try {
//            String sql = "SELECT * FROM game WHERE g_id = ? AND g_status != 'del'";
//
//            // Conecta ao banco de dados
//            conn = dbConnection.connect();
//
//            // Prepara, filtra e sanitiza o SQL e dps executa
//            pstm = conn.prepareStatement(sql);
//
//            // Substitui o "?" na query pelo Id do registro
//            pstm.setInt(1, dataId);
//
//            // Executa a query e armazena resultado(s) em res
//            res = pstm.executeQuery();
//            res.next();
//
//            txtEditId.setText(res.getString("g_id"));
//            txtEditType.setText(res.getString("g_type"));
//            txtEditName.setText(res.getString("g_name"));
//            txtEditPlatform.setText(res.getString("g_platform"));
//            txtEditMedia.setText(res.getString("g_media"));
//            txtEditSinopse.setText(res.getString("g_sinopse"));
//
//            // Verifica o status do registro e seleciona o checkbox respectivo
//            if (!res.getString("g_status").equals("on")) {
//                checkboxEditStatusOff.setSelected(true);
//            } else {
//                checkboxEditStatusOn.setSelected(true);
//            }
//        } catch (SQLException error) {
//            PopUps.showError("Main.refresh\n" + error);
//        } finally {
//            dbConnection.dbClose(conn, pstm, res);
//        }
//    }
//
//    public void formClear() {
//        txtCreateType.setText("");
//        txtCreateName.setText("");
//        txtCreatePlatform.setText("");
//        txtCreateMedia.setText("");
//        txtCreateSinopse.setText("");
//    }
//
//    public void createData() {
//        try {
//            String sql = "INSERT INTO game(g_date, g_type, g_name, g_platform, g_media, g_sinopse, g_status) VALUES (?, ?, ?, ?, ?, ?, 'on')";
//
//            // Conecta ao banco de dados
//            conn = dbConnection.connect();
//
//            // Prepara, filtra e sanitiza o sql e depois executa a query
//            pstm = conn.prepareStatement(sql);
//
//            // Captar a data e a hora do registro
//            String localDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
//
//            // Substitui os "?" no SQL pelos valores corretos
//            pstm.setString(1, localDate);
//            pstm.setString(2, txtCreateType.getText());
//            pstm.setString(3, txtCreateName.getText());
//            pstm.setString(4, txtCreatePlatform.getText());
//            pstm.setString(5, txtCreateMedia.getText());
//            pstm.setString(6, txtCreateSinopse.getText());
//
//            // Executa, filta e sanitiza o sql e depois executa a query
//            pstm.executeUpdate();
//
//            // Limpa os campos
//            formClear();
//
//            // Atualiza a listagem de registros e volta para o panelRead
//            readAll();
//            openCard("panelRead");
//
//        } catch (SQLException error) {
//            PopUps.showError("Main.CreateData\n" + error);
//        } finally {
//            dbConnection.dbClose(conn, pstm, null);
//        }
//    }
//            int selected = tableRead.getSelectedRow();
//        if (selected < 0) {
//            PopUps.showAlert("Selecione um item primeiro.");
//        } else {
//            // Capta o id da linha selecionada
//            int selectedId = (int) tableRead.getModel().getValueAt(selected, 0);
//            deleteData(selectedId);
//        }
}
