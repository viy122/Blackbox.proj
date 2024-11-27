package spa_salon_frontdesk;

import java.awt.Component;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Bookings extends javax.swing.JFrame {

    public Bookings() {
        initComponents();
        loadTableSalonBookings();
        loadTableSpaBookings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookingsSalon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBookingsSpa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        tableBookingsSalon.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tableBookingsSalon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Day", "Time", "Assined Employee", "Total Price", "Services"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBookingsSalon.setRowHeight(35);
        tableBookingsSalon.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableBookingsSalon);
        if (tableBookingsSalon.getColumnModel().getColumnCount() > 0) {
            tableBookingsSalon.getColumnModel().getColumn(0).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(1).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(2).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(3).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(4).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(5).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(6).setResizable(false);
        }

        tableBookingsSpa.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tableBookingsSpa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Day", "Time", "Assined Employee", "Total Price", "Services"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBookingsSpa.setRowHeight(35);
        tableBookingsSpa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableBookingsSpa);
        if (tableBookingsSpa.getColumnModel().getColumnCount() > 0) {
            tableBookingsSpa.getColumnModel().getColumn(0).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(1).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(2).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(3).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(4).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(5).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void loadTableSalonBookings() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";  // Your database URL
        String user = "root";  // Your database username
        String password = "";  // Your database password

        String query = "SELECT * FROM tableSalonBookings";  // Updated query to fetch all fields, including assignedEmployee

        try (
                // Establish connection to the database
                Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            // Create a table model with column names
            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"ID", "Name", "Day", "Time", "Assigned Employee", "Total Price", "Services"}, 0
            );

            // Iterate through the result set and add data to the model
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                String day = rs.getString("Day");
                String time = rs.getString("Time");
                String assignedEmployee = rs.getString("Assigned Employee");  // Fetch the assigned employee
                double totalPrice = rs.getDouble("totalPrice");
                String services = rs.getString("services");

                // Format services if multiple services are stored as a comma-separated string
                if (services != null && !services.isEmpty()) {
                    services = String.join(", ", services.split(","));
                }

                // Add the row to the model
                model.addRow(new Object[]{id, name, day, time, assignedEmployee, totalPrice, services});
            }

            // Set the table model to the JTable to display the data
            tableBookingsSalon.setModel(model);

            // Auto-resize columns based on the content
            for (int i = 0; i < tableBookingsSalon.getColumnCount(); i++) {
                TableColumn column = tableBookingsSalon.getColumnModel().getColumn(i);
                int preferredWidth = 0;

                // Loop through all rows to determine the maximum width of the column
                for (int j = 0; j < tableBookingsSalon.getRowCount(); j++) {
                    int width = tableBookingsSalon.getCellRenderer(j, i)
                            .getTableCellRendererComponent(tableBookingsSalon, tableBookingsSalon.getValueAt(j, i), false, false, j, i)
                            .getPreferredSize().width;

                    preferredWidth = Math.max(preferredWidth, width);
                }

                // Set the column width with a little extra padding
                column.setPreferredWidth(preferredWidth + 10);
            }

            // Set auto-resize mode for all columns
            autoResizeSalonTableColumns(tableBookingsSalon);

        } catch (Exception e) {
            // Show an error message if something goes wrong
            JOptionPane.showMessageDialog(null, "Error loading data from database.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();  // Log the error for debugging
        }
    }
    
    private void autoResizeSalonTableColumns(JTable tableBookings) {
        final int margin = 5; // Add some margin for better visibility

        // Iterate through each column
        for (int column = 0; column < tableBookings.getColumnCount(); column++) {
            TableColumn tableColumn = tableBookings.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            // Get the header width
            TableCellRenderer headerRenderer = tableBookings.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableBookings, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            // Get the maximum width of cells in the column
            for (int row = 0; row < tableBookings.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableBookings.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableBookings, tableBookings.getValueAt(row, column), false, false, row, column);
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
    private void loadTableSpaBookings() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";  // Your database URL
        String user = "root";  // Your database username
        String password = "";  // Your database password

        String query = "SELECT * FROM tableSpaBookings";  // Updated query to fetch all fields, including assignedEmployee

        try (
                // Establish connection to the database
                Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            // Create a table model with column names
            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"ID", "Name", "Day", "Time", "Assigned Employee", "Total Price", "Services"}, 0
            );

            // Iterate through the result set and add data to the model
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                String day = rs.getString("Day");
                String time = rs.getString("Time");
                String assignedEmployee = rs.getString("Assigned Employee");  // Fetch the assigned employee
                double totalPrice = rs.getDouble("totalPrice");
                String services = rs.getString("services");

                // Format services if multiple services are stored as a comma-separated string
                if (services != null && !services.isEmpty()) {
                    services = String.join(", ", services.split(","));
                }

                // Add the row to the model
                model.addRow(new Object[]{id, name, day, time, assignedEmployee, totalPrice, services});
            }

            // Set the table model to the JTable to display the data
            tableBookingsSpa.setModel(model);

            // Auto-resize columns based on the content
            for (int i = 0; i < tableBookingsSpa.getColumnCount(); i++) {
                TableColumn column = tableBookingsSpa.getColumnModel().getColumn(i);
                int preferredWidth = 0;

                // Loop through all rows to determine the maximum width of the column
                for (int j = 0; j < tableBookingsSpa.getRowCount(); j++) {
                    int width = tableBookingsSpa.getCellRenderer(j, i)
                            .getTableCellRendererComponent(tableBookingsSpa, tableBookingsSpa.getValueAt(j, i), false, false, j, i)
                            .getPreferredSize().width;

                    preferredWidth = Math.max(preferredWidth, width);
                }

                // Set the column width with a little extra padding
                column.setPreferredWidth(preferredWidth + 10);
            }

            // Set auto-resize mode for all columns
            autoResizeTableColumns(tableBookingsSpa);

        } catch (Exception e) {
            // Show an error message if something goes wrong
            JOptionPane.showMessageDialog(null, "Error loading data from database.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();  // Log the error for debugging
        }
    }

    private void autoResizeTableColumns(JTable tableBookingsSpa) {
        final int margin = 5; // Add some margin for better visibility

        // Iterate through each column
        for (int column = 0; column < tableBookingsSpa.getColumnCount(); column++) {
            TableColumn tableColumn = tableBookingsSpa.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            // Get the header width
            TableCellRenderer headerRenderer = tableBookingsSpa.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableBookingsSpa, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            // Get the maximum width of cells in the column
            for (int row = 0; row < tableBookingsSpa.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableBookingsSpa.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableBookingsSpa, tableBookingsSpa.getValueAt(row, column), false, false, row, column);
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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Bookings bs = new Bookings();
        bs.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBookingsSalon;
    private javax.swing.JTable tableBookingsSpa;
    // End of variables declaration//GEN-END:variables
}
