package pokedex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eyad 
 */
public class AddPokemon extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    Connection con;
    Statement statement;
    PreparedStatement prepStatement;
    ResultSet rs;
    

    public AddPokemon(myDBCon connect) {
        initComponents();
        con = connect.getCon();
        // center form in screen 
        this.setLocationRelativeTo(null);
        // set all error labels to invisible
        lblIDError.setVisible(false);
        lblNameError.setVisible(false);
        lblTypeError.setVisible(false);
        //populate Gen, Reg, Pre-Ev, and Type combo boxes 
        try {
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // populate valid mgr numbers 
            rs = statement.executeQuery("SELECT name FROM type ORDER BY name ASC");
            // populate Type combo boxes
            // Adding null to allow just 1 Type to be selected
            cmbType2.addItem(null);
            while (rs.next()) {
                cmbType1.addItem(rs.getString("name"));
                cmbType2.addItem(rs.getString("name"));
            }
            
            // get and populate valid regions 
            rs = statement.executeQuery("SELECT name FROM region ORDER BY name ASC");
            while (rs.next()) {
                cmbReg.addItem(rs.getString("name"));
            }
            
            // get and populate valid Pre-evolutions 
            rs = statement.executeQuery("SELECT pokedexID FROM pokemon ORDER BY pokedexID ASC");
            while (rs.next()) {
                cmbPreEv.addItem(rs.getString("pokedexID"));
            }
            
            // get and populate valid generations
            for(String gen: generations){
                
            }

            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPokedexID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbGen = new javax.swing.JComboBox<>();
        cmbPreEv = new javax.swing.JComboBox<>();
        btnAddNewPokemon = new javax.swing.JButton();
        lblIDError = new javax.swing.JLabel();
        lblTypeError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        cmbType1 = new javax.swing.JComboBox<>();
        cmbType2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbReg = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Pokemon");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PokedexID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Type 1:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Generation:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Pre-Evolution:");

        txtPokedexID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbGen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbPreEv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddNewPokemon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewPokemon.setText("Add New");
        btnAddNewPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewPokemonActionPerformed(evt);
            }
        });

        lblIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblIDError.setText("error label");

        lblTypeError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblTypeError.setForeground(new java.awt.Color(255, 0, 0));
        lblTypeError.setText("error label");

        lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText("error label");

        cmbType1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbType2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Type 2:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Region:");

        cmbReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPokedexID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(cmbGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPreEv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(132, 132, 132))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblTypeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblIDError, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(btnAddNewPokemon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPokedexID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTypeError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPreEv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addComponent(btnAddNewPokemon)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    void clearErrorLabels() {
        lblIDError.setText("");
        lblIDError.setVisible(false);
        lblNameError.setText("");
        lblNameError.setVisible(false);
        lblTypeError.setText("");
        lblTypeError.setVisible(false);
    }

    boolean isValidData() {

        clearErrorLabels();
        boolean result = true;
        if (txtPokedexID.getText().trim().isEmpty() || !isInteger(txtPokedexID.getText().trim())) {
            if (txtPokedexID.getText().trim().isEmpty()) {
                lblIDError.setText("Invalid. Cannot be empty.");
            } else if (!isInteger(txtPokedexID.getText().trim())) {
                lblIDError.setText("Invalid. Must be integer.");
            }

            lblIDError.setVisible(true);
            result = false;
        }

        if (txtName.getText().trim().isEmpty() || (txtName.getText().trim().length() > 10)) {
            if (txtName.getText().trim().isEmpty()) {
                lblNameError.setText("Invalid. Cannot be empty.");
            } else if ((txtName.getText().trim().length() > 10)) {
                lblNameError.setText("Invalid. Must be < 10 chars.");
            }

            lblNameError.setVisible(true);
            result = false;
        }

        return result;
    }

    void clearInputBoxes() {
        txtPokedexID.setText("");
        txtName.setText("");
        cmbPreEv.setSelectedIndex(0);
        cmbGen.setSelectedIndex(0);
        cmbType1.setSelectedIndex(0);
        cmbType2.setSelectedIndex(0);
        cmbReg.setSelectedIndex(0);
    }

    private void btnAddNewPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewPokemonActionPerformed
        // TODO add your handling code here:

        try {
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (isValidData()) {
                prepStatement = con.prepareStatement("INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (? , ? , ?, ? , ? , ?, ?, ?)");
                //prepStatement.setInt(1, Integer.parseInt(txtPokedexID.getText()));
                //prepStatement.setString(2, txtName.getText().toUpperCase());
                //prepStatement.setString(3, txtJob.getText().toUpperCase());
                //prepStatement.setInt(4, Integer.parseInt(cmbGen.getSelectedItem().toString()));
                //prepStatement.setString(5, ftxtHiredate.getText());
                //prepStatement.setInt(6, Integer.parseInt(txtSalary.getText()));
                //prepStatement.setInt(7, Integer.parseInt(txtComm.getText()));
                //prepStatement.setInt(8, Integer.parseInt(cmbPreEv.getSelectedItem().toString()));
                int result = prepStatement.executeUpdate();
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New pokemon added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    clearInputBoxes();
                } else {
                    // check validation errors 
                }

                rs.close();
                statement.close();
                prepStatement.close();
            } else {

                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new employee.");
        }
    }//GEN-LAST:event_btnAddNewPokemonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewPokemon;
    private javax.swing.JComboBox<String> cmbGen;
    private javax.swing.JComboBox<String> cmbPreEv;
    private javax.swing.JComboBox<String> cmbReg;
    private javax.swing.JComboBox<String> cmbType1;
    private javax.swing.JComboBox<String> cmbType2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIDError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblTypeError;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPokedexID;
    // End of variables declaration//GEN-END:variables
}
