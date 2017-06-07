/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenu();
        rentalsMenu = new javax.swing.JMenu();
        newRentalMenu = new javax.swing.JMenuItem();
        newReturnRentalMenu = new javax.swing.JMenuItem();
        viewRentalMenu = new javax.swing.JMenuItem();
        inventoryMenu = new javax.swing.JMenu();
        customerDataMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to Rent-a-Car");

        fileMenu.setText("File");

        newMenu.setText("New...");
        fileMenu.add(newMenu);

        jMenuBar1.add(fileMenu);

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

        jMenuBar1.add(rentalsMenu);

        inventoryMenu.setText("Inventory");
        jMenuBar1.add(inventoryMenu);

        customerDataMenu.setText("Customer Data");
        jMenuBar1.add(customerDataMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Code when newRental menu is pressed
    private void newRentalMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newRentalMenuActionPerformed
    {//GEN-HEADEREND:event_newRentalMenuActionPerformed
        newRentalUI.display();
    }//GEN-LAST:event_newRentalMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu customerDataMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu inventoryMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu newMenu;
    private javax.swing.JMenuItem newRentalMenu;
    private javax.swing.JMenuItem newReturnRentalMenu;
    private javax.swing.JMenu rentalsMenu;
    private javax.swing.JMenuItem viewRentalMenu;
    // End of variables declaration//GEN-END:variables
}
