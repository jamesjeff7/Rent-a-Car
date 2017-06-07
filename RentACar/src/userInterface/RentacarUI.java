package userInterface;

import core.*;

public class RentacarUI extends javax.swing.JFrame
{
    /**
     * Creates new form RentacarUI
     */
    public RentacarUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        welcomeLabel = new javax.swing.JLabel();
        rentButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenu();
        rentalsMenu = new javax.swing.JMenu();
        newRentalMenu = new javax.swing.JMenuItem();
        newReturnRentalMenu = new javax.swing.JMenuItem();
        viewRentalMenu = new javax.swing.JMenuItem();
        inventoryMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        customerDataMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        welcomeLabel.setText("Welcome to Rent-a-Car");

        rentButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rentButton.setText("Return a car");
        rentButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rentButtonActionPerformed(evt);
            }
        });

        returnButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        returnButton.setText("Rent a car");
        returnButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                returnButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        newMenu.setText("New...");
        fileMenu.add(newMenu);

        menuBar.add(fileMenu);

        rentalsMenu.setText("Rentals");

        newRentalMenu.setText("New Rental...");
        newRentalMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newRentalMenuActionPerformed(evt);
            }
        });
        rentalsMenu.add(newRentalMenu);

        newReturnRentalMenu.setText("Return Rental...");
        rentalsMenu.add(newReturnRentalMenu);

        viewRentalMenu.setText("View Rental...");
        rentalsMenu.add(viewRentalMenu);

        menuBar.add(rentalsMenu);

        inventoryMenu.setText("Inventory");

        jMenuItem1.setText("Add inventory...");
        inventoryMenu.add(jMenuItem1);

        jMenuItem2.setText("Search Inventory...");
        inventoryMenu.add(jMenuItem2);

        jMenuItem5.setText("View Inventory...");
        inventoryMenu.add(jMenuItem5);

        menuBar.add(inventoryMenu);

        customerDataMenu.setText("Customer Data");

        jMenuItem3.setText("Add customer...");
        customerDataMenu.add(jMenuItem3);

        jMenuItem4.setText("Search customer...");
        customerDataMenu.add(jMenuItem4);

        jMenuItem6.setText("View customers...");
        customerDataMenu.add(jMenuItem6);

        menuBar.add(customerDataMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(welcomeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Code when newRental menu is pressed
    private void newRentalMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newRentalMenuActionPerformed
    {//GEN-HEADEREND:event_newRentalMenuActionPerformed
        new newRentalUI();
    }//GEN-LAST:event_newRentalMenuActionPerformed

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rentButtonActionPerformed
    {//GEN-HEADEREND:event_rentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_returnButtonActionPerformed
    {//GEN-HEADEREND:event_returnButtonActionPerformed
        new newRentalUI();
    }//GEN-LAST:event_returnButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu customerDataMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu inventoryMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu newMenu;
    private javax.swing.JMenuItem newRentalMenu;
    private javax.swing.JMenuItem newReturnRentalMenu;
    private javax.swing.JButton rentButton;
    private javax.swing.JMenu rentalsMenu;
    private javax.swing.JButton returnButton;
    private javax.swing.JMenuItem viewRentalMenu;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
