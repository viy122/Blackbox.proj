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
import javax.swing.table.TableColumn;

public class ManageSalonServicesFrame extends javax.swing.JFrame {

    public ManageSalonServicesFrame() {
        initComponents();
        loadServices();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfServiceName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDescription = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbAvailable = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfEmployeeName = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableService.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service ID", "Service Name", "Description", "Available", "Employee Name", "Gender", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            tableService.getColumnModel().getColumn(4).setResizable(false);
            tableService.getColumnModel().getColumn(5).setResizable(false);
            tableService.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel4.setText("Salon Sevices");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 416));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel2.setText("Price:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel1.setText("Service Name:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel5.setText("Description:");

        btnUpdate.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel6.setText("Available:");

        cbAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cbAvailable.setSelectedIndex(-1);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel7.setText("Employee Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPrice)
                    .addComponent(tfServiceName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(tfDescription)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAvailable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEmployeeName))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap(105, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tableService.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tableService.getModel();
            int serviceId = (int) model.getValueAt(selectedRow, 0);

            String url = "jdbc:mysql://localhost:3306/spa_salon";
            String user = "root";
            String password = "";

            try {
                Connection con = DriverManager.getConnection(url, user, password);

                // Delete query
                String deleteQuery = "DELETE FROM salon_services WHERE id = ?";
                PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
                deleteStmt.setInt(1, serviceId);
                int rowsAffected = deleteStmt.executeUpdate();

                if (rowsAffected > 0) {
                    // Reset auto-increment and reorder IDs
                    String resetCountQuery = "SET @count = 0;";
                    String reorderQuery = "UPDATE salon_services SET id = (@count := @count + 1);";
                    String resetAutoIncrementQuery = "ALTER TABLE salon_services AUTO_INCREMENT = 1;";

                    PreparedStatement resetCountStmt = con.prepareStatement(resetCountQuery);
                    PreparedStatement reorderStmt = con.prepareStatement(reorderQuery);
                    PreparedStatement resetAutoIncrementStmt = con.prepareStatement(resetAutoIncrementQuery);

                    resetCountStmt.execute();
                    reorderStmt.execute();
                    resetAutoIncrementStmt.execute();

                    // Reset the input fields after successful deletion
                    tfServiceName.setText("");   // Clear Service Name field
                    tfPrice.setText("");         // Clear Price field
                    tfDescription.setText("");   // Clear Description field

                    // Reload the services in the table
                    loadServices();

                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Service deleted and IDs reordered successfully.",
                            "Success",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);

                    resetCountStmt.close();
                    reorderStmt.close();
                    resetAutoIncrementStmt.close();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Failed to delete the service.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                }

                deleteStmt.close();
                con.close();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "An error occurred while deleting the service.",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select a service to delete.",
                    "Warning",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tableService.getSelectedRow();  // Get selected row in the table

        if (selectedRow != -1) {  // If a row is selected
            // Get the updated values from the text fields and combo boxes
            String newName = tfServiceName.getText().trim();
            String newPriceStr = tfPrice.getText().trim();
            String newDescription = tfDescription.getText().trim();
            String newEmployeeName = tfEmployeeName.getText().trim();  // Employee Name from text field
            String newAvailable = (String) cbAvailable.getSelectedItem(); // Availability selection from combo box

            // Validation: Check if any required fields are empty
            if (newName.isEmpty() || newPriceStr.isEmpty() || newDescription.isEmpty() || newEmployeeName.isEmpty() || newAvailable == null) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "All fields (Service Name, Price, Description, Employee Name, and Available) are required.",
                        "Warning",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                double newPrice = Double.parseDouble(newPriceStr); // Parse price from string to double

                DefaultTableModel model = (DefaultTableModel) tableService.getModel();
                int serviceId = (int) model.getValueAt(selectedRow, 0);  // Get the service ID from the selected row (column 0)

                // Database connection
                String url = "jdbc:mysql://localhost:3306/spa_salon";  // Database URL
                String user = "root";  // Database username
                String password = "";  // Database password

                Connection con = DriverManager.getConnection(url, user, password);

                // SQL query to update the service information in the database
                String updateQuery = "UPDATE salon_services SET Name = ?, Price = ?, Description = ?, `Employee Name` = ?, Available = ? WHERE id = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setString(1, newName);         // Set the service name
                updateStmt.setDouble(2, newPrice);       // Set the price
                updateStmt.setString(3, newDescription); // Set the description
                updateStmt.setString(4, newEmployeeName); // Set the employee name
                updateStmt.setString(5, newAvailable);   // Set the availability (either Yes or No)
                updateStmt.setInt(6, serviceId);         // Set the service ID for the WHERE clause

                // Execute the update query
                int rowsAffected = updateStmt.executeUpdate();

                // If update is successful
                if (rowsAffected > 0) {
                    // Refresh the table with updated data
                    loadServices();

                    // Clear input fields after a successful update
                    tfServiceName.setText("");
                    tfPrice.setText("");
                    tfDescription.setText("");
                    tfEmployeeName.setText("");  // Clear Employee Name field
                    cbAvailable.setSelectedIndex(-1); // Reset available combo box

                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Service updated successfully.",
                            "Success",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Failed to update the service. Please check the service name or other details.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                }

                // Close statement and connection
                updateStmt.close();
                con.close();
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Price must be a valid number.",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Database error occurred: " + e.getMessage(),
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select a service from the table to update.",
                    "Warning",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    private void loadServices() {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/spa_salon"; // Database URL
        String user = "root"; // Database username
        String password = ""; // Database password

        try (
                // Establishing a connection to the database
                Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement("SELECT * FROM salon_services"); ResultSet rs = pst.executeQuery()) {

            // Accessing the table model for `tableService`
            DefaultTableModel model = (DefaultTableModel) tableService.getModel();
            model.setRowCount(0); // Clear existing rows in the table

            // Iterating through the result set to populate the table
            while (rs.next()) {
                int id = rs.getInt("id"); // Retrieve the service ID
                String serviceName = rs.getString("name"); // Retrieve the service name
                String description = rs.getString("description"); // Retrieve the service description
                String available = rs.getString("Available"); // Retrieve availability status (Yes/No)
                String employeeName = rs.getString("Employee Name"); // Retrieve employee name
                String gender = rs.getString("Gender"); // Retrieve gender
                double price = rs.getDouble("price"); // Retrieve the service price

                // Add the retrieved data as a new row in the table
                model.addRow(new Object[]{id, serviceName, description, available, employeeName, gender, price});
            }

            // Auto-resize table columns based on content
            autoResizeTableColumns(tableService);

        } catch (Exception e) {
            // Handle SQL-related errors
            JOptionPane.showMessageDialog(null, "Error fetching data from the database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Print the stack trace for debugging
        }

// Add a ListSelectionListener to handle row selection
        tableService.getSelectionModel().addListSelectionListener(e -> {
            // Ensure that a row is selected and not just the header
            if (!e.getValueIsAdjusting() && tableService.getSelectedRow() != -1) {
                // Get the selected row index
                int selectedRow = tableService.getSelectedRow();

                // Retrieve values from the selected row
                DefaultTableModel model = (DefaultTableModel) tableService.getModel();
                int id = (int) model.getValueAt(selectedRow, 0); // Column 0 is the ID
                String serviceName = (String) model.getValueAt(selectedRow, 1); // Column 1 is the service name
                String description = (String) model.getValueAt(selectedRow, 2); // Column 2 is the description
                String available = (String) model.getValueAt(selectedRow, 3); // Column 3 is the availability status
                String employeeName = (String) model.getValueAt(selectedRow, 4); // Column 4 is the employee name
                String gender = (String) model.getValueAt(selectedRow, 5); // Column 5 is the gender
                double price = (Double) model.getValueAt(selectedRow, 6); // Column 6 is the price

                // Set the values into the text fields
                tfServiceName.setText(serviceName);  // Display service name in the tfServiceName text field
                tfDescription.setText(description);  // Display description in the tfDescription text field
                tfPrice.setText(String.valueOf(price)); // Display price in the tfPrice text field
                tfEmployeeName.setText(employeeName);  // Display employee name in the tfEmployeeName text field
                // Display gender in the cbGender combo box
                cbAvailable.setSelectedItem(available);  // Display availability status in the cbAvailable combo box

                // If you want to display the ID in a label or text field for further use, you can add it as well:
                // Assuming tfId is a TextField for displaying the ID
            }
        });

    }

    private void autoResizeTableColumns(JTable tableService) {
        final int margin = 5; // Add some margin for better visibility

        for (int column = 0; column < tableService.getColumnCount(); column++) {
            TableColumn tableColumn = tableService.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            // Get the header width
            TableCellRenderer headerRenderer = tableService.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableService, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            // Get the maximum width of cells in the column
            for (int row = 0; row < tableService.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableService.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableService, tableService.getValueAt(row, column), false, false, row, column);
                preferredWidth = Math.max(preferredWidth, cellComp.getPreferredSize().width + margin);

                // Ensure it does not exceed maxWidth
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            // Set the preferred width for the column
            tableColumn.setPreferredWidth(preferredWidth);
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
        ManageSalonServicesFrame msf = new ManageSalonServicesFrame();
        msf.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfEmployeeName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfServiceName;
    // End of variables declaration//GEN-END:variables
}
