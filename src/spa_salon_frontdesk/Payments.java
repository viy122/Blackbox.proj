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

public class Payments extends javax.swing.JFrame {

    public Payments() {
        initComponents();
        loadSpaPayments();
        loadSalonPayments();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalonPayments = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SpaPayments = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SalonPayments.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        SalonPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Services Name", "Total Price", "Assigned Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SalonPayments.setRowHeight(35);
        SalonPayments.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SalonPayments);
        if (SalonPayments.getColumnModel().getColumnCount() > 0) {
            SalonPayments.getColumnModel().getColumn(0).setResizable(false);
            SalonPayments.getColumnModel().getColumn(1).setResizable(false);
            SalonPayments.getColumnModel().getColumn(2).setResizable(false);
            SalonPayments.getColumnModel().getColumn(3).setResizable(false);
            SalonPayments.getColumnModel().getColumn(4).setResizable(false);
        }

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        SpaPayments.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        SpaPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Services Name", "Total Price", "Assigned Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SpaPayments.setRowHeight(35);
        SpaPayments.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(SpaPayments);
        if (SpaPayments.getColumnModel().getColumnCount() > 0) {
            SpaPayments.getColumnModel().getColumn(0).setResizable(false);
            SpaPayments.getColumnModel().getColumn(1).setResizable(false);
            SpaPayments.getColumnModel().getColumn(2).setResizable(false);
            SpaPayments.getColumnModel().getColumn(3).setResizable(false);
            SpaPayments.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void loadSalonPayments() {
        String url = "jdbc:mysql://localhost:3306/spa_salon"; // Database URL
        String user = "root"; // Database user
        String password = ""; // Database password

// Updated query to include 'Assigned Employee'
        String query = "SELECT customerID, customerName, serviceName, totalPrice, `Assigned Employee` FROM paymentsSalon";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            // Get the DefaultTableModel for the table
            DefaultTableModel model = (DefaultTableModel) SalonPayments.getModel();
            model.setRowCount(0); // Clear the table before loading new data

            // Loop through the result set and add rows to the table
            while (rs.next()) {
                int customerID = rs.getInt("customerID"); // Get customer ID
                String customerName = rs.getString("customerName"); // Get customer name
                String serviceName = rs.getString("serviceName"); // Get service name
                double totalPrice = rs.getDouble("totalPrice"); // Get total price
                String assignedEmployee = rs.getString("Assigned Employee"); // Get assigned employee

                // Add the data to the table
                model.addRow(new Object[]{customerID, customerName, serviceName, totalPrice, assignedEmployee});
            }

            // Apply auto-resize for the columns based on content
            autoResizeSalonTableColumns(SalonPayments);

            // Optionally, set the auto-resize mode for all columns
            SalonPayments.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database error while loading payments.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Print the stack trace for debugging
        }

    }

    private void autoResizeSalonTableColumns(JTable table) {
        final int margin = 5; // Add some margin for better visibility

        // Iterate through each column
        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            // Get the header width
            TableCellRenderer headerRenderer = table.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(table, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            // Get the maximum width of cells in the column
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(table, table.getValueAt(row, column), false, false, row, column);
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

    private void loadSpaPayments() {
        String url = "jdbc:mysql://localhost:3306/spa_salon"; // Database URL
        String user = "root"; // Database user
        String password = ""; // Database password

// Updated query to include 'Assigned Employee'
        String query = "SELECT customerID, customerName, serviceName, totalPrice, `Assigned Employee` FROM paymentsSpa";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            // Get the DefaultTableModel for the table
            DefaultTableModel model = (DefaultTableModel) SpaPayments.getModel();
            model.setRowCount(0); // Clear the table before loading new data

            // Loop through the result set and add rows to the table
            while (rs.next()) {
                int customerID = rs.getInt("customerID"); // Get customer ID
                String customerName = rs.getString("customerName"); // Get customer name
                String serviceName = rs.getString("serviceName"); // Get service name
                double totalPrice = rs.getDouble("totalPrice"); // Get total price
                String assignedEmployee = rs.getString("Assigned Employee"); // Get assigned employee

                // Add the data to the table
                model.addRow(new Object[]{customerID, customerName, serviceName, totalPrice, assignedEmployee});
            }

            // Apply auto-resize for the columns based on content
            autoResizeSpaTableColumns(SpaPayments);

            // Optionally, set the auto-resize mode for all columns
            SalonPayments.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database error while loading payments.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Print the stack trace for debugging
        }

    }

    private void autoResizeSpaTableColumns(JTable table) {
        final int margin = 5; // Add some margin for better visibility

        // Iterate through each column
        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            // Get the header width
            TableCellRenderer headerRenderer = table.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(table, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            // Get the maximum width of cells in the column
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(table, table.getValueAt(row, column), false, false, row, column);
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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SalonPayments;
    private javax.swing.JTable SpaPayments;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
