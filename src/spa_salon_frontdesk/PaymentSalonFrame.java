package spa_salon_frontdesk;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class PaymentSalonFrame extends javax.swing.JFrame {

    public PaymentSalonFrame() {
        initComponents();
        loadServices();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tfChange = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCustomerName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        tfCash = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPrefGender = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableService.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Services ID", "Service Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableService.setRowHeight(35);
        tableService.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableService);
        if (tableService.getColumnModel().getColumnCount() > 0) {
            tableService.getColumnModel().getColumn(0).setResizable(false);
            tableService.getColumnModel().getColumn(1).setResizable(false);
            tableService.getColumnModel().getColumn(2).setResizable(false);
            tableService.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel7.setText("Total:");

        tfTotal.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel8.setText("Customer Name:");

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel9.setText("Cash:");

        btnPay.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnPay.setText("Pay");
        btnPay.setPreferredSize(new java.awt.Dimension(70, 30));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel10.setText("Change:");

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel11.setText("Prefered Gender:");

        cbPrefGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbPrefGender.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfChange)
                    .addComponent(tfCustomerName)
                    .addComponent(tfCash, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(tfTotal)
                    .addComponent(cbPrefGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPrefGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // Check if at least one service is selected and get the total price
        DefaultTableModel model = (DefaultTableModel) tableService.getModel();
        double totalPrice = 0.0;
        boolean serviceSelected = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            if ((Boolean) model.getValueAt(i, 0)) {  // Check if service is selected
                serviceSelected = true;
                double price = (Double) model.getValueAt(i, 5);  // Get the price of the selected service
                totalPrice += price;  // Add the price to totalPrice
            }
        }

        if (!serviceSelected) {
            JOptionPane.showMessageDialog(this, "No services selected. Please select at least one service.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Get inputs from the text fields
        String customerName = tfCustomerName.getText().trim();
        String cashInput = tfCash.getText().trim();
        String assignedEmployee = (String) cbPrefGender.getSelectedItem(); // Get selected assigned employee

// Check if tfCustomerName, tfCash, or assignedEmployee is empty/invalid
        if (customerName.isEmpty() || cashInput.isEmpty() || assignedEmployee == null || assignedEmployee.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Customer Name, Cash, and Assigned Employee fields cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Parse cash as double
            double cash = Double.parseDouble(cashInput);

            // Check if cash is sufficient
            if (cash < totalPrice) {
                JOptionPane.showMessageDialog(this, "Insufficient cash. Please enter a sufficient amount.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calculate change
            double change = cash - totalPrice;

            // Display change in tfChange
            tfChange.setText(String.format("%.2f", change));

            // Insert payment details into the database
            String url = "jdbc:mysql://localhost:3306/spa_salon"; // Update with your database credentials
            String user = "root";
            String password = "";
            String insertQuery = "INSERT INTO paymentsSalon (customerName, serviceName, totalPrice, `Assigned Employee`) VALUES (?, ?, ?, ?)";

            try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(insertQuery)) {

                // Loop through the selected services and add them to the batch
                for (int i = 0; i < model.getRowCount(); i++) {
                    if ((Boolean) model.getValueAt(i, 0)) { // Check if service is selected
                        String serviceName = (String) model.getValueAt(i, 2);  // Service name column
                        double servicePrice = (Double) model.getValueAt(i, 5);  // Service price column

                        // Insert each selected service into the database
                        pst.setString(1, customerName);
                        pst.setString(2, serviceName);
                        pst.setDouble(3, servicePrice);
                        pst.setString(4, assignedEmployee); // Add assigned employee to the database
                        pst.addBatch();  // Add to batch for batch execution
                    }
                }
                pst.executeBatch();  // Execute the batch insert
            }

            // Display a success message
            JOptionPane.showMessageDialog(this,
                    "Payment Successful!\n"
                    + "Customer Name: " + customerName + "\n"
                    + "Assigned Employee: " + assignedEmployee + "\n"
                    + "Total: $" + String.format("%.2f", totalPrice) + "\n"
                    + "Cash: $" + String.format("%.2f", cash) + "\n"
                    + "Change: $" + String.format("%.2f", change),
                    "Payment Complete", JOptionPane.INFORMATION_MESSAGE);

            // Reset all text fields and deselect services
            resetFields();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid cash amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnPayActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        AllSalonServicesFrame assf = new AllSalonServicesFrame();
        assf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    private void resetFields() {
        // Clear all text fields
        tfCustomerName.setText("");
        tfCash.setText("");
        tfTotal.setText("0.00");
        tfChange.setText("");
        cbPrefGender.setSelectedIndex(-1);
        // Deselect all services
        DefaultTableModel model = (DefaultTableModel) tableService.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(false, i, 0); // Uncheck all checkboxes
        }
    }

    private void loadServices() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        try {
            // Establishing a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);

            // Query to select services from the database
            String query = "SELECT * FROM salon_services";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            // Define the table model
            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Select", "ID", "Name", "Description", "Available", "Price"}, 0
            ) {
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    // Make the first column (checkbox) as a boolean type
                    return (columnIndex == 0) ? Boolean.class : super.getColumnClass(columnIndex);
                }
            };

            // Load data from the database into the table model
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description"); // Retrieve description
                String available = rs.getString("available"); // Retrieve availability status (Yes/No)
                double price = rs.getDouble("price");

                // Add data to the table
                model.addRow(new Object[]{false, id, name, description, available, price}); // Initial checkbox state is false
            }

            // Set the model to the table
            tableService.setModel(model);
            autoResizeTableColumns(tableService);

            // Adding action listener to handle checkbox selection/deselection
            tableService.getModel().addTableModelListener(e -> {
                int row = e.getFirstRow();
                int col = e.getColumn();
                if (col == 0) { // Checkbox column
                    boolean isSelected = (Boolean) tableService.getValueAt(row, col);
                    String availability = (String) tableService.getValueAt(row, 4); // "Available" column
                    double price = (Double) tableService.getValueAt(row, 5); // "Price" column

                    if ("No".equals(availability) && isSelected) {
                        // If the service is not available and the checkbox is selected, unselect it and show error
                        tableService.setValueAt(false, row, col); // Uncheck the box
                        JOptionPane.showMessageDialog(null, "Service Not Available", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // If a service is selected, deselect all other checkboxes
                        if (isSelected) {
                            // Deselect all other rows
                            for (int i = 0; i < model.getRowCount(); i++) {
                                if (i != row) {
                                    tableService.setValueAt(false, i, 0); // Uncheck all other checkboxes
                                }
                            }
                        }

                        // Update tfTotal to show the price of the selected service
                        if (isSelected) {
                            tfTotal.setText(String.format("%.2f", price)); // Update tfTotal with the selected price
                        } else {
                            tfTotal.setText(""); // Clear tfTotal if unselected
                        }
                    }
                }
            });

            // Close the resources
            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void autoResizeTableColumns(JTable tableService) {
        TableColumnModel columnModel = tableService.getColumnModel();
        for (int column = 0; column < tableService.getColumnCount(); column++) {
            int width = 0;
            for (int row = 0; row < tableService.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableService.getCellRenderer(row, column);
                Component c = tableService.prepareRenderer(cellRenderer, row, column);
                width = Math.max(c.getPreferredSize().width + 1, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        PaymentSalonFrame cf = new PaymentSalonFrame();
        cf.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPay;
    private javax.swing.JComboBox<String> cbPrefGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfChange;
    private javax.swing.JTextField tfCustomerName;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
