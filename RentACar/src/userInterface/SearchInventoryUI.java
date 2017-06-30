/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import core.CarInventorySystem;
import core.Vehicle;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon
 */
public class SearchInventoryUI extends javax.swing.JPanel {
    
    boolean unitTesting = true;

    /**
     * Creates new form SearchInventoryUI
     */
    public SearchInventoryUI() {
        initComponents();
        
        // Adds an "OK" and "CANCEL" dialog
        int result = JOptionPane.showConfirmDialog(null, this, "Search Inventory",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        // Logic for OKAY or CANCEL button press
        if (result == JOptionPane.OK_OPTION) 
        {
            
            // When OK is pressed, input logic here to store data to database
            // BUG: All input fields must be entered or application will crash
            // TODO: Check user input. Before closing. Must be implemented with a custom dialog
//            String first = firstNameField.getText();
//            String last = lastNameField.getText();
//            int age = Integer.parseInt(ageField.getText());
//            String email = emailField.getText();
//            String phone = phoneField.getText();
            
            // For debugging purposes:
            // System.out.println(first + " " + last);
            
            if(ValidateInput()) {
                int searchID = Integer.parseInt(searchIDField.getText());
                
                //KEEP these lines
//                if(!unitTesting) {
//                    CarInventorySystem inventory = new CarInventorySystem();
//                    Vehicle foundVehicle = inventory.SearchVehicle(searchID);
//                
//                    if(foundVehicle != null) {
//                        JOptionPane.showMessageDialog(null, "Found vehicle: " + 
//                                foundVehicle.getYear() + " " + foundVehicle.getMake() + 
//                                " " + foundVehicle.getModel() + " " + 
//                                foundVehicle.getColor() + " " + 
//                                foundVehicle.getCarClass() + " for a daily price of $" + 
//                                foundVehicle.getDailyPrice(), "Vehicle Found", 
//                                JOptionPane.INFORMATION_MESSAGE);
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null, 
//                                "Error: The requested vehicle was not found. "
//                                        + "Please try again.", "Error", 
//                                        JOptionPane.ERROR_MESSAGE);
//                    }
//                }
            }
            else {
                JOptionPane.showMessageDialog(null, "The field is blank. "
                        + "Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
//            Customer addedCustomer = new Customer();
//            addedCustomer.setFirstName(first);
//            addedCustomer.setLastName(last);
//            addedCustomer.setAge(age);
//            addedCustomer.setPhoneNumber(phone);
//            addedCustomer.setEmailAddress(email);
//            addedCustomer.StoreCustomer();
            
//            CustomerStorageSystem customerSystem = new CustomerStorageSystem();
//            customerSystem.RegisterCustomer(first, last, age, phone, email);
        } 
        else 
        {
            System.out.println("Cancelled");
        }
    }
    
    private boolean ValidateInput() {
        return !searchIDField.getText().isEmpty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchIDField = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel1.setText("ID Number");

        searchIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(searchIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIDFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField searchIDField;
    // End of variables declaration//GEN-END:variables
}
