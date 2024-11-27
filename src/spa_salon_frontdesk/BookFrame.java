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

public class BookFrame extends javax.swing.JFrame {

    public BookFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cbAmPm = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnSalonServices = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSpaServices = new javax.swing.JButton();
        tfTotal = new javax.swing.JTextField();
        cbDay = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCustomerName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfChange = new javax.swing.JTextField();
        tfCash = new javax.swing.JTextField();
        cbTime = new javax.swing.JComboBox<>();
        btnPay = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbPrefGender = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableService.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service ID", "Service Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableService.setGridColor(new java.awt.Color(204, 204, 204));
        tableService.setRowHeight(35);
        tableService.setShowGrid(true);
        tableService.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableService);
        if (tableService.getColumnModel().getColumnCount() > 0) {
            tableService.getColumnModel().getColumn(0).setResizable(false);
            tableService.getColumnModel().getColumn(1).setResizable(false);
            tableService.getColumnModel().getColumn(1).setPreferredWidth(5);
            tableService.getColumnModel().getColumn(2).setResizable(false);
            tableService.getColumnModel().getColumn(2).setPreferredWidth(15);
            tableService.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cbAmPm.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbAmPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        cbAmPm.setSelectedIndex(-1);

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel12.setText("Time:");

        btnSalonServices.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnSalonServices.setText("Spa Services");
        btnSalonServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalonServicesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel1.setText("Total:");

        btnSpaServices.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnSpaServices.setText("Salon Services");
        btnSpaServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpaServicesActionPerformed(evt);
            }
        });

        tfTotal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        cbDay.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        cbDay.setSelectedIndex(-1);

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel11.setText("Day:");

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel2.setText("Customer Name:");

        tfCustomerName.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel10.setText("Change:");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel3.setText("Cash:");

        tfChange.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        tfCash.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        cbTime.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00", "11:00", "10:00", "9:00", "8:00", "7:00", "6:00", "5:00", "4:00", "3:00", "2:00", "1:00", " " }));
        cbTime.setSelectedIndex(-1);

        btnPay.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel13.setText("Prefered Gender:");

        cbPrefGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbPrefGender.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(cbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10)
                                .addComponent(tfChange)
                                .addComponent(tfCustomerName)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(cbDay, 0, 243, Short.MAX_VALUE)
                                .addComponent(tfTotal))
                            .addComponent(jLabel3)
                            .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSpaServices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalonServices, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPrefGender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpaServices)
                    .addComponent(btnSalonServices))
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPrefGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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
    private boolean isSpaSelected = false;
    private boolean isSalonSelected = false;

    private void btnSalonServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalonServicesActionPerformed
        loadSpaServices();
        isSpaSelected = true;
        isSalonSelected = false;
    }//GEN-LAST:event_btnSalonServicesActionPerformed

    private void btnSpaServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpaServicesActionPerformed
        loadSalonServices();
        isSpaSelected = false;
        isSalonSelected = true;
    }//GEN-LAST:event_btnSpaServicesActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        try {
            // Retrieve the data from the text fields and combo boxes
            String customer = tfCustomerName.getText().trim();
            String totalText = tfTotal.getText().trim();
            String cashText = tfCash.getText().trim();
            String day = (String) cbDay.getSelectedItem();  // Get selected day from combo box
            String time = (String) cbTime.getSelectedItem();  // Get selected time from combo box
            String amPm = (String) cbAmPm.getSelectedItem();  // Get selected AM/PM from combo box
            String preferredGender = (String) cbPrefGender.getSelectedItem();  // Get selected preferred gender

            // Check if any required field is empty
            if (customer.isEmpty() || totalText.isEmpty() || cashText.isEmpty()
                    || day == null || time == null || amPm == null || preferredGender == null) {
                JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if validation fails
            }

            // Parse the total and cash values to ensure they are valid numbers
            double total = Double.parseDouble(totalText);
            double cash = Double.parseDouble(cashText);

            // Check if the cash provided is sufficient
            if (cash < total) {
                JOptionPane.showMessageDialog(this, "Insufficient cash! Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if cash is insufficient
            }

            // Calculate the change
            double change = cash - total;
            tfChange.setText(String.format("%.2f", change));  // Display the calculated change

            // Gather selected services
            StringBuilder selectedServices = new StringBuilder();
            DefaultTableModel model = (DefaultTableModel) tableService.getModel(); // Assuming you have a JTable for services
            for (int i = 0; i < model.getRowCount(); i++) {
                boolean isSelected = (boolean) model.getValueAt(i, 0);  // Assuming the first column is a checkbox
                if (isSelected) {
                    String serviceName = (String) model.getValueAt(i, 2);  // Assuming the name is in the third column (index 2)
                    if (selectedServices.length() > 0) {
                        selectedServices.append(", ");  // Add a comma separator if there are already selected services
                    }
                    selectedServices.append(serviceName);
                }
            }

            // Debugging: Verify which service is selected
            System.out.println("isSpaSelected: " + isSpaSelected);
            System.out.println("isSalonSelected: " + isSalonSelected);

            // Prepare the query depending on whether Spa or Salon is selected
            String insertQuery = null;
            String tableName = "";  // Variable to store table name

            // Check whether Spa or Salon is selected
            if (isSpaSelected) {
                insertQuery = "INSERT INTO tableSpaBookings (Name, Day, Time, `Assigned Employee`, totalPrice, services) VALUES (?, ?, ?, ?, ?, ?)";
                tableName = "Spa"; // For display purposes
            } else if (isSalonSelected) {
                insertQuery = "INSERT INTO tableSalonBookings (Name, Day, Time, `Assigned Employee`, totalPrice, services) VALUES (?, ?, ?, ?, ?, ?)";
                tableName = "Salon"; // For display purposes
            }

            // Debugging: Check the insert query
            System.out.println("Insert Query: " + insertQuery);

            // If neither spa nor salon service is selected, show an error
            if (insertQuery == null) {
                JOptionPane.showMessageDialog(this, "Please select either spa or salon services.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Database connection details
            String url = "jdbc:mysql://localhost:3306/spa_salon";
            String dbUser = "root";
            String dbPassword = "";

            try (Connection con = DriverManager.getConnection(url, dbUser, dbPassword); PreparedStatement pst = con.prepareStatement(insertQuery)) {

                pst.setString(1, customer);  // Customer Name
                pst.setString(2, day);        // Day
                pst.setString(3, time + " " + amPm); // Time (AM/PM)
                pst.setString(4, preferredGender); // Preferred Gender
                pst.setDouble(5, total);      // Total Price
                pst.setString(6, selectedServices.toString()); // Services (comma-separated list of selected services)

                // Execute the insert query
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Booking details saved successfully to " + tableName + " bookings!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error saving booking details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Build the receipt message
            String receiptMessage = "********** RECEIPT **********\n"
                    + "Customer: " + customer + "\n"
                    + "Day: " + day + ", Time: " + time + " " + amPm + "\n"
                    + "Preferred Gender: " + preferredGender + "\n"
                    + "Selected Services:\n"
                    + selectedServices.toString() + "\n"
                    + "Total: $" + String.format("%.2f", total) + "\n"
                    + "Cash: $" + String.format("%.2f", cash) + "\n"
                    + "Change: $" + String.format("%.2f", change) + "\n"
                    + "****************************";

            // Display the receipt in a JOptionPane
            JOptionPane.showMessageDialog(this, receiptMessage, "Receipt", JOptionPane.INFORMATION_MESSAGE);

            // Clear all text fields after the payment is processed
            tfCustomerName.setText("");
            tfTotal.setText("");
            tfCash.setText("");
            tfChange.setText("");

            // Reset combo boxes to their default selected value (first item or any default item)
            cbDay.setSelectedIndex(-1);  // Reset to the first item
            cbTime.setSelectedIndex(-1);  // Reset to the first item
            cbAmPm.setSelectedIndex(-1);  // Reset to the first item
            cbPrefGender.setSelectedIndex(-1); // Reset preferred gender

            // Reset the JTable (optional, if needed)
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(false, i, 0);  // Uncheck all the checkboxes
            }

        } catch (NumberFormatException ex) {
            // Catch and handle invalid number input (e.g., non-numeric values)
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for total and cash.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Catch SQL exceptions or other unexpected exceptions
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void loadSalonServices() {
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
            autoResizeSalonTableColumns(tableService);

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

    private void autoResizeSalonTableColumns(JTable tableService) {
        final int margin = 5; // Add some margin for better visibility

        // Iterate through each column
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

    private void loadSpaServices() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        try {
            // Establishing a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);

            // Query to select services from the database
            String query = "SELECT * FROM spa_services";
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
            autoResizeSpaTableColumns(tableService);

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

    private void autoResizeSpaTableColumns(JTable tableService) {
        final int margin = 5; // Add some margin for better visibility

        // Iterate through each column
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
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSalonServices;
    private javax.swing.JButton btnSpaServices;
    private javax.swing.JComboBox<String> cbAmPm;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbPrefGender;
    private javax.swing.JComboBox<String> cbTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfChange;
    private javax.swing.JTextField tfCustomerName;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

}
