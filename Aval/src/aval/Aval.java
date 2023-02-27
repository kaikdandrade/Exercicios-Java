package Aval;

import Control.PopUp;
import Model.DatabaseModel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Aval extends javax.swing.JFrame {

    private DatabaseModel dbModel = new DatabaseModel();

    public Aval() {
        initComponents();
        setLocationRelativeTo(null);

        JTableHeader header = tableRead.getTableHeader();
        header.setFont(new Font("cambria", 400, 16));
        DefaultTableCellRenderer tableHeader = (DefaultTableCellRenderer) header.getDefaultRenderer();
        tableHeader.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer tableCell = new DefaultTableCellRenderer();
        tableCell.setHorizontalAlignment(SwingConstants.CENTER);
        for (int colInit = 0; colInit < tableRead.getColumnModel().getColumnCount(); colInit++) {
            tableRead.getColumnModel().getColumn(colInit).setCellRenderer(tableCell);
        }

        panelRead();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameContent = new javax.swing.JInternalFrame();
        panelMain = new javax.swing.JPanel();
        panelRead = new javax.swing.JPanel();
        scrollRead = new javax.swing.JScrollPane();
        tableRead = new javax.swing.JTable();
        btnReadView = new javax.swing.JButton();
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
        panelViewUpdate = new javax.swing.JPanel();
        labelViewUpdate1 = new javax.swing.JLabel();
        btnViewUpdateDelete = new javax.swing.JButton();
        btnViewUpdateEdit = new javax.swing.JButton();
        txtViewUpdateTitle = new javax.swing.JTextField();
        txtViewUpdateAuthor = new javax.swing.JTextField();
        txtViewUpdateISBN = new javax.swing.JFormattedTextField();
        spinnerViewUpdatePags = new javax.swing.JSpinner();
        txtViewUpdateId = new javax.swing.JTextField();
        labelViewUpdate2 = new javax.swing.JLabel();
        labelViewUpdate3 = new javax.swing.JLabel();
        labelViewUpdate4 = new javax.swing.JLabel();
        labelViewUpdate5 = new javax.swing.JLabel();
        txtViewUpdatePrice = new javax.swing.JFormattedTextField();
        labelViewUpdate6 = new javax.swing.JLabel();
        btnViewUpdateEnter = new javax.swing.JButton();
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
                "ID", "Title", "Author", "ISBN", "Páginas", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        if (tableRead.getColumnModel().getColumnCount() > 0) {
            tableRead.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        btnReadView.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnReadView.setText("Editar Livro");
        btnReadView.setAlignmentY(0.0F);
        btnReadView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReadView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReadView.setFocusable(false);
        btnReadView.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnReadView.setMaximumSize(new java.awt.Dimension(130, 30));
        btnReadView.setMinimumSize(new java.awt.Dimension(130, 30));
        btnReadView.setPreferredSize(new java.awt.Dimension(130, 30));
        btnReadView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReadLayout = new javax.swing.GroupLayout(panelRead);
        panelRead.setLayout(panelReadLayout);
        panelReadLayout.setHorizontalGroup(
            panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollRead, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(panelReadLayout.createSequentialGroup()
                        .addComponent(btnReadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelReadLayout.setVerticalGroup(
            panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnReadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollRead, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelRead, "panelRead");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
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
                                .addComponent(txtCreatePrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labelCreate1)
                    .addComponent(labelCreate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        panelCreateLayout.setVerticalGroup(
            panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
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
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panelMain.add(panelCreate, "panelCreate");

        panelViewUpdate.setBackground(new java.awt.Color(0, 71, 171));

        labelViewUpdate1.setFont(new java.awt.Font("Cambria", 0, 26)); // NOI18N
        labelViewUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        labelViewUpdate1.setText("Visualizar Registro:");

        btnViewUpdateDelete.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnViewUpdateDelete.setText("Deletar");
        btnViewUpdateDelete.setAlignmentY(0.0F);
        btnViewUpdateDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewUpdateDelete.setFocusable(false);
        btnViewUpdateDelete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnViewUpdateDelete.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        btnViewUpdateDelete.setMinimumSize(new java.awt.Dimension(80, 30));
        btnViewUpdateDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        btnViewUpdateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateDeleteActionPerformed(evt);
            }
        });

        btnViewUpdateEdit.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnViewUpdateEdit.setText("Editar");
        btnViewUpdateEdit.setAlignmentY(0.0F);
        btnViewUpdateEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewUpdateEdit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnViewUpdateEdit.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        btnViewUpdateEdit.setMinimumSize(new java.awt.Dimension(80, 30));
        btnViewUpdateEdit.setPreferredSize(new java.awt.Dimension(80, 30));
        btnViewUpdateEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateEditActionPerformed(evt);
            }
        });

        txtViewUpdateTitle.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtViewUpdateTitle.setAlignmentX(0.0F);
        txtViewUpdateTitle.setAlignmentY(0.0F);
        txtViewUpdateTitle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtViewUpdateTitle.setMinimumSize(new java.awt.Dimension(230, 30));
        txtViewUpdateTitle.setPreferredSize(new java.awt.Dimension(230, 30));

        txtViewUpdateAuthor.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtViewUpdateAuthor.setAlignmentX(0.0F);
        txtViewUpdateAuthor.setAlignmentY(0.0F);
        txtViewUpdateAuthor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtViewUpdateAuthor.setMinimumSize(new java.awt.Dimension(230, 30));
        txtViewUpdateAuthor.setPreferredSize(new java.awt.Dimension(230, 30));

        try {
            txtViewUpdateISBN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###-####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtViewUpdateISBN.setAlignmentX(0.0F);
        txtViewUpdateISBN.setAlignmentY(0.0F);
        txtViewUpdateISBN.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtViewUpdateISBN.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtViewUpdateISBN.setMinimumSize(new java.awt.Dimension(230, 30));
        txtViewUpdateISBN.setPreferredSize(new java.awt.Dimension(230, 30));

        spinnerViewUpdatePags.setAlignmentX(0.0F);
        spinnerViewUpdatePags.setAlignmentY(0.0F);
        spinnerViewUpdatePags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spinnerViewUpdatePags.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        spinnerViewUpdatePags.setMinimumSize(new java.awt.Dimension(100, 26));
        spinnerViewUpdatePags.setName(""); // NOI18N
        spinnerViewUpdatePags.setPreferredSize(new java.awt.Dimension(100, 26));

        txtViewUpdateId.setEditable(false);
        txtViewUpdateId.setBackground(new java.awt.Color(0, 71, 171));
        txtViewUpdateId.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtViewUpdateId.setForeground(new java.awt.Color(0, 71, 171));
        txtViewUpdateId.setActionCommand("<Not Set>");
        txtViewUpdateId.setAlignmentX(0.0F);
        txtViewUpdateId.setAlignmentY(0.0F);
        txtViewUpdateId.setBorder(null);
        txtViewUpdateId.setCaretColor(new java.awt.Color(0, 71, 171));
        txtViewUpdateId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtViewUpdateId.setDisabledTextColor(new java.awt.Color(0, 71, 171));
        txtViewUpdateId.setFocusable(false);
        txtViewUpdateId.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtViewUpdateId.setMaximumSize(new java.awt.Dimension(50, 50));
        txtViewUpdateId.setMinimumSize(new java.awt.Dimension(50, 50));
        txtViewUpdateId.setPreferredSize(new java.awt.Dimension(50, 50));
        txtViewUpdateId.setSelectedTextColor(new java.awt.Color(0, 71, 171));

        labelViewUpdate2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelViewUpdate2.setForeground(new java.awt.Color(255, 255, 255));
        labelViewUpdate2.setText("Título:");

        labelViewUpdate3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelViewUpdate3.setForeground(new java.awt.Color(255, 255, 255));
        labelViewUpdate3.setText("Autor:");

        labelViewUpdate4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelViewUpdate4.setForeground(new java.awt.Color(255, 255, 255));
        labelViewUpdate4.setText("ISBN:");

        labelViewUpdate5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelViewUpdate5.setForeground(new java.awt.Color(255, 255, 255));
        labelViewUpdate5.setText("Páginas:");

        txtViewUpdatePrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤¤#,##0.00"))));
        txtViewUpdatePrice.setAlignmentX(0.0F);
        txtViewUpdatePrice.setAlignmentY(0.0F);
        txtViewUpdatePrice.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        txtViewUpdatePrice.setMinimumSize(new java.awt.Dimension(100, 26));
        txtViewUpdatePrice.setName(""); // NOI18N
        txtViewUpdatePrice.setPreferredSize(new java.awt.Dimension(100, 26));

        labelViewUpdate6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelViewUpdate6.setForeground(new java.awt.Color(255, 255, 255));
        labelViewUpdate6.setText("Valor:");

        btnViewUpdateEnter.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnViewUpdateEnter.setText("Salvar");
        btnViewUpdateEnter.setAlignmentY(0.0F);
        btnViewUpdateEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewUpdateEnter.setFocusable(false);
        btnViewUpdateEnter.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnViewUpdateEnter.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        btnViewUpdateEnter.setMinimumSize(new java.awt.Dimension(80, 30));
        btnViewUpdateEnter.setPreferredSize(new java.awt.Dimension(80, 30));
        btnViewUpdateEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewUpdateLayout = new javax.swing.GroupLayout(panelViewUpdate);
        panelViewUpdate.setLayout(panelViewUpdateLayout);
        panelViewUpdateLayout.setHorizontalGroup(
            panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewUpdateLayout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewUpdateLayout.createSequentialGroup()
                        .addComponent(txtViewUpdateId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewUpdateLayout.createSequentialGroup()
                        .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelViewUpdateLayout.createSequentialGroup()
                                .addComponent(labelViewUpdate6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelViewUpdateLayout.createSequentialGroup()
                                        .addComponent(txtViewUpdatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130))
                                    .addGroup(panelViewUpdateLayout.createSequentialGroup()
                                        .addComponent(btnViewUpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnViewUpdateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewUpdateLayout.createSequentialGroup()
                                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelViewUpdateLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelViewUpdate2)
                                                .addComponent(labelViewUpdate3))
                                            .addComponent(labelViewUpdate4)))
                                    .addComponent(labelViewUpdate5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtViewUpdateISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtViewUpdateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtViewUpdateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(spinnerViewUpdatePags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelViewUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(205, Short.MAX_VALUE))))
            .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewUpdateLayout.createSequentialGroup()
                    .addContainerGap(415, Short.MAX_VALUE)
                    .addComponent(btnViewUpdateEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(205, 205, 205)))
        );
        panelViewUpdateLayout.setVerticalGroup(
            panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtViewUpdateId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(labelViewUpdate1)
                .addGap(18, 18, 18)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelViewUpdate2)
                    .addComponent(txtViewUpdateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewUpdateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViewUpdate3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewUpdateISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViewUpdate4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerViewUpdatePags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViewUpdate5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewUpdatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViewUpdate6))
                .addGap(18, 18, 18)
                .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewUpdateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewUpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(panelViewUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewUpdateLayout.createSequentialGroup()
                    .addContainerGap(345, Short.MAX_VALUE)
                    .addComponent(btnViewUpdateEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(125, 125, 125)))
        );

        panelMain.add(panelViewUpdate, "panelViewUpdate");

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
                .addGap(5, 5, 5))
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
                .addComponent(frameContent)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReadActionPerformed
        panelRead();
    }//GEN-LAST:event_menuItemReadActionPerformed

    private void menuItemCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateActionPerformed
        panelCreate();
    }//GEN-LAST:event_menuItemCreateActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        // Se clicar em "Sim"...
        if (PopUp.showConfirm("Fazer logout:", "Deseja realmente fechar o aplicativo?")) {
            // ... fecha/sai do aplicativo
            System.exit(0);
        }
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    private void btnViewUpdateEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateEditActionPerformed
        btnViewUpdateEdit.setVisible(false);
        btnViewUpdateEnter.setVisible(true);
        blockTextFields(true, txtViewUpdateTitle, txtViewUpdateAuthor, txtViewUpdateISBN, txtViewUpdatePrice);
        spinnerViewUpdatePags.setEnabled(true);
    }//GEN-LAST:event_btnViewUpdateEditActionPerformed

    private void btnReadViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadViewActionPerformed
        int selected = tableRead.getSelectedRow();
        if (selected < 0) {
            PopUp.showAlert("Selecione um item primeiro.");

        } else {
            // Capta o id da linha selecionada
            int selectedId = (int) tableRead.getModel().getValueAt(selected, 0);
            panelView(selectedId);
        }
    }//GEN-LAST:event_btnReadViewActionPerformed

    private void btnViewUpdateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateDeleteActionPerformed
        if (verifyTextFields(txtViewUpdateId)) {
            // Verifica se o usuário confirmou a exclusão do registro
            if (PopUp.showConfirm("Aviso:", "Deseja realmente excluir este registro?")) {
                if (PopUp.showConfirmAlert("Isso Será permanente! Isto é sem volta!\\nAo proseguir automaticamente você assina o termo de responsabilidade...\nIsto é qualquer problema gerado por conta da exclusão desse dado cabe apenas a você!")) {
                    dbModel.delete(Integer.parseInt(txtViewUpdateId.getText()));
                    panelRead();
                }
            }
        }
    }//GEN-LAST:event_btnViewUpdateDeleteActionPerformed

    private void btnViewUpdateEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateEnterActionPerformed
        if (verifyTextFields(txtViewUpdateId, txtViewUpdatePrice, txtViewUpdateTitle, txtViewUpdateAuthor, txtViewUpdateISBN) && !spinnerViewUpdatePags.getValue().equals(0)) {
            String id = txtViewUpdateId.getText();
            String title = txtViewUpdateTitle.getText();
            String author = txtViewUpdateAuthor.getText();
            String isbn = txtViewUpdateISBN.getText();
            int pags = (int) txtViewUpdatePrice.getValue();
            String price = txtViewUpdatePrice.getText();
            dbModel.update(id, title, author, isbn, pags, price);
            panelRead();
        }
    }//GEN-LAST:event_btnViewUpdateEnterActionPerformed

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
    private javax.swing.JButton btnReadView;
    private javax.swing.JButton btnViewUpdateDelete;
    private javax.swing.JButton btnViewUpdateEdit;
    private javax.swing.JButton btnViewUpdateEnter;
    private javax.swing.JInternalFrame frameContent;
    private javax.swing.JLabel labelCreate1;
    private javax.swing.JLabel labelCreate2;
    private javax.swing.JLabel labelCreate3;
    private javax.swing.JLabel labelCreate4;
    private javax.swing.JLabel labelCreate5;
    private javax.swing.JLabel labelCreate6;
    private javax.swing.JLabel labelCreate7;
    private javax.swing.JLabel labelViewUpdate1;
    private javax.swing.JLabel labelViewUpdate2;
    private javax.swing.JLabel labelViewUpdate3;
    private javax.swing.JLabel labelViewUpdate4;
    private javax.swing.JLabel labelViewUpdate5;
    private javax.swing.JLabel labelViewUpdate6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemCreate;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenuItem menuItemRead;
    private javax.swing.JPanel panelCreate;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRead;
    private javax.swing.JPanel panelViewUpdate;
    private javax.swing.JScrollPane scrollRead;
    private javax.swing.JSpinner spinnerCreatePags;
    private javax.swing.JSpinner spinnerViewUpdatePags;
    private javax.swing.JTable tableRead;
    private javax.swing.JTextField txtCreateAuthor;
    private javax.swing.JFormattedTextField txtCreateISBN;
    private javax.swing.JFormattedTextField txtCreatePrice;
    private javax.swing.JTextField txtCreateTitle;
    private javax.swing.JTextField txtViewUpdateAuthor;
    private javax.swing.JFormattedTextField txtViewUpdateISBN;
    private javax.swing.JTextField txtViewUpdateId;
    private javax.swing.JFormattedTextField txtViewUpdatePrice;
    private javax.swing.JTextField txtViewUpdateTitle;
    // End of variables declaration//GEN-END:variables

    public void openCard(String cardName) {
        java.awt.CardLayout card = (java.awt.CardLayout) panelMain.getLayout();
        card.show(panelMain, cardName);
    }

    public boolean verifyTextFields(javax.swing.JTextField... fields) {
        for (javax.swing.JTextField field : fields) {
            if (field.getText().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void clearTextFields(javax.swing.JTextField... fields) {
        for (javax.swing.JTextField field : fields) {
            if (!field.getText().equals("")) {
                field.setText("");
            }
        }
    }

    public void blockTextFields(boolean block, javax.swing.JTextField... fields) {
        for (javax.swing.JTextField field : fields) {
            field.setEnabled(block);
        }
    }

    private void panelRead() {
        DefaultTableModel tableModel = (DefaultTableModel) tableRead.getModel();

        // Apaga as linhas da tabela para evitar colisão de dados
        tableModel.setNumRows(0);

        List<Object[]> data = dbModel.readAll();

        for (Object[] rowData : data) {
            tableModel.addRow(rowData);
        }

        // Dá um reset na varíavel por questão de segurança
        data = null;

        openCard("panelRead");
    }

    public void panelView(int id) {

        blockTextFields(false, txtViewUpdateAuthor, txtViewUpdateISBN, txtViewUpdatePrice, txtViewUpdateTitle);
        spinnerViewUpdatePags.setEnabled(false);
        List<Object[]> data = dbModel.read(id);

        for (Object[] line : data) {
            txtViewUpdateId.setText(line[0].toString());
            txtViewUpdateTitle.setText(line[1].toString());
            txtViewUpdateAuthor.setText(line[2].toString());
            txtViewUpdateISBN.setText(line[3].toString());
            int spinner = Integer.parseInt(line[4].toString());
            spinnerViewUpdatePags.setValue(spinner);
            txtViewUpdatePrice.setText(line[5].toString());
        }

        btnViewUpdateEnter.setVisible(false);
        openCard("panelViewUpdate");
    }

    public void panelCreate() {
        clearTextFields(txtCreateAuthor, txtCreateISBN, txtCreatePrice, txtCreateTitle);
        openCard("panelCreate");
    }
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
