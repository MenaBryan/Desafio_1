import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class V1 extends javax.swing.JFrame {
    
 TreeNode root = new TreeNode("Pacientes");
      
        
   
    public V1() {
        initComponents();
        
         root.children.add(new TreeNode("Género"));
        root.children.add(new TreeNode("Sangre"));
        root.children.add(new TreeNode("Presión"));
        root.children.get(0).children.add(new TreeNode("Hombre"));
        root.children.get(0).children.add(new TreeNode("Mujer"));
        root.children.get(1).children.add(new TreeNode("A"));
        root.children.get(1).children.add(new TreeNode("B"));
        root.children.get(1).children.add(new TreeNode("AB"));
        root.children.get(1).children.add(new TreeNode("O"));
        root.children.get(2).children.add(new TreeNode("Alta"));
        root.children.get(2).children.add(new TreeNode("Media"));
        root.children.get(2).children.add(new TreeNode("Baja"));
    }

    public static class TreeNode{
        String val;
        List<TreeNode> children = new LinkedList<>();

        TreeNode(String data){
            val = data;
        }

        TreeNode(String data,List<TreeNode> child){
            val = data;
            children = child;
        }
    }
    
    
    private static void printNAryTree(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                TreeNode node = queue.poll();
                assert node != null;
                System.out.print(node.val + " ");
                for (TreeNode item : node.children) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbGenero = new javax.swing.JComboBox<>();
        cmbSangre = new javax.swing.JComboBox<>();
        cmbPresion = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDiagnosticar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDiagnostico = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(148, 188, 225));
        setForeground(new java.awt.Color(136, 182, 235));

        cmbGenero.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        cmbSangre.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cmbSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));

        cmbPresion.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cmbPresion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("Nombre del paciente");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("Género");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setText("Tipo de sangre");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setText("Nivel de presión arterial");

        btnDiagnosticar.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        btnDiagnosticar.setText("Diagnosticar");
        btnDiagnosticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticarActionPerformed(evt);
            }
        });

        txtaDiagnostico.setEditable(false);
        txtaDiagnostico.setColumns(20);
        txtaDiagnostico.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtaDiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtaDiagnostico);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Desafio 1 Programación con estructuras de datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnDiagnosticar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel5)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnDiagnosticar)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
      
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnDiagnosticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticarActionPerformed
        
        String Nombre = txtNombre.getText();
        String Genero = cmbGenero.getSelectedItem().toString();
        String Sangre = cmbSangre.getSelectedItem().toString();
        String Presion = cmbPresion.getSelectedItem().toString();
        int nGenero;
        int nSangre;
        int nPresion;
        
        String Diagnostico;
        
     if (Nombre.isEmpty() || Nombre == null){
         Diagnostico = "Ingrese un paciente";
         txtaDiagnostico.setText(Diagnostico);
     }
     else{
        
        switch(Genero){
            case "Hombre":
                nGenero = 0;
                break;
            case "Mujer":
                nGenero= 1;
                break;
            default:
                nGenero = 0;
        }
        
        
        switch (Sangre){
            case "A":
                nSangre = 0;
                
            switch(Presion){
            case "Baja":               
                Diagnostico = "Las personas con Tipo de sangre A tienen un 5% de"
                       + "\n"+"probabilidades de padecer una enfermedad cardiaca,"
                       + "\n"+"junto a la presión arterial baja, puede causar mareos,"
                       + "\n"+ "desmayos y llevar poco oxígeno al cerebro pudiendo "
                        + "\n"+ "ocasionarle daños. "
                        + "\n"+ "\n"+ "\n"+"Se estima que el 24% de salvadoreños es sangre tipo A";
               txtaDiagnostico.setText(Diagnostico);
                break;
            case "Media":
                Diagnostico = "Las personas con Tipo de sangre A tienen un 5% de "
                            + "\n"+ "probabilidades de padecer una enfermedad cardiaca, "
                            + "\n"+ "una presión arterial media es considerado lo normal, "
                            + "\n"+ "\n"+ "\n"+ "el 24% de salvadoreños tienen sangre de tipo A";
               txtaDiagnostico.setText(Diagnostico);
                break;
            case "Alta":
                Diagnostico = "Las personas con Tipo de sangre A tienen un 5% de "
                        + "\n"+ "probabilidades de padecer una enfermedad cardiaca, "
                        + "\n"+ "la presión arterial alta puede producir aneurismas, "
                        + "\n"+ "ataque cardiaco, dolor en el pecho y daño en las arterias, "
                        + "\n"+ "\n"+ "\n"+ "el 24% de salvadoreños tienen sangre de tipo A";
                txtaDiagnostico.setText(Diagnostico);
                break;
        }
                break;
                
                
                
                
            case "B":
                nSangre = 1;
                 switch(Presion){
            case "Baja":               
                Diagnostico = "Las personas con Tipo de sangre B tienen un 11% de "
                       + "\n" + "probabilidades de padecer una enfermedad cardiaca, "
                       + "\n" + "junto a la presión arterial baja, puede causar mareos, "
                        + "\n"+ "desmayos y llevar poco oxígeno al cerebro pudiendo "
                        + "\n"+ "ocasionarle daños, "
                        + "\n"+ "\n"+ "\n"+ "se estima que el 11.7% de salvadoreños es sangre tipo B";
               txtaDiagnostico.setText(Diagnostico);
                break;
            case "Media":
                Diagnostico = "Las personas con Tipo de sangre B tienen un 11% de "
                        + "\n"+ "probabilidades de padecer una enfermedad cardiaca, "
                       + "\n" + "una presión arterial media es considerado lo normal. "
                        + "\n"+ "\n"+ "\n"+ "el 11.7% de salvadoreños tienen sangre de tipo B";
                txtaDiagnostico.setText(Diagnostico);
                break;
            case "Alta":
                Diagnostico = "Las personas con Tipo de sangre B tienen un 11% de "
                        + "\n"+ "probabilidades de padecer una enfermedad cardiaca, "
                        + "\n"+ "la presión arterial alta puede producir aneurismas, "
                        + "\n"+ "ataque cardiaco, dolor en el pecho y daño en las arterias. "
                        + "\n"+ "\n"+ "\n"+ "El 11.7% de salvadoreños tienen sangre de tipo B";
               txtaDiagnostico.setText(Diagnostico);
                break;
        }
                 
                 
                 
                 
                break;
            case "AB":
                nSangre = 2;
                switch(Presion){
            case "Baja":               
                Diagnostico = "Las personas con Tipo de sangre AB tienen un 23% de "
                        + "\n"+ "probabilidades de padecer una enfermedad cardiaca, "
                        + "\n"+ "junto a la presión arterial baja, puede causar mareos, "
                        + "\n"+ "desmayos y llevar poco oxígeno al cerebro pudiendo "
                        + "\n"+ "ocasionarle daños."
                        + "\n"+ "\n"+ "\n"+ "Se estima que el 1.3% de salvadoreños es sangre tipo AB";
                txtaDiagnostico.setText(Diagnostico);
                break;
            case "Media":
                Diagnostico = "Las personas con Tipo de sangre AB tienen un 23% de "
                       + "\n" + "probabilidades de padecer una enfermedad cardiaca, "
                        + "\n"+ "una presión arterial media es considerado lo normal. "
                        + "\n"+ "\n"+ "\n"+ "El 1.3% de salvadoreños tienen sangre de tipo AB";
                txtaDiagnostico.setText(Diagnostico);
                break;
            case "Alta":
                Diagnostico = "Las personas con Tipo de sangre AB tienen un 23% de probabilidades de "
                       + "\n" + "padecer una enfermedad cardiaca, la presión arterial alta puede "
                       + "\n" + "producir aneurismas, ataque cardiaco, dolor en el pecho "
                        + "\n"+ "y daño en las arterias."
                       + "\n"+ "\n"+ "\n" + "El 1.3% de salvadoreños tienen sangre de tipo B";
               txtaDiagnostico.setText(Diagnostico);
                break;
        }
                break;
                
                
                
                
            case "O":
                nSangre = 3;
                switch(Presion){
            case "Baja":               
                Diagnostico = "Las personas con Tipo de sangre O son propensos a padecer "
                       + "\n" + "trastornos hemorrágicos, junto a la presión arterial baja, "
                       + "\n" + "puede causar mareos, desmayos y llevar poco oxígeno al cerebro"
                       + "\n" + "pudiendo ocasionarle daño. "
                       + "\n"+ "\n"+ "\n" + "Se estima que el 63% de salvadoreños es sangre tipo O";
                txtaDiagnostico.setText(Diagnostico);
                break;
            case "Media":
                Diagnostico = "Las personas con Tipo de sangre O son propensos a padecer "
                        + "\n"+ "trastornos hemorrágicos, una presión arterial media es "
                        + "\n"+ "considerado lo normal."
                      + "\n"+ "\n"+ "\n"  + " El 1.3% de salvadoreños tienen sangre de tipo O";
                txtaDiagnostico.setText(Diagnostico);
                break;
            case "Alta":
                Diagnostico = "Las personas con Tipo de sangre O son propensos a padecer "
                       + "\n" + "trastornos hemorrágicos, la presión arterial alta puede "
                       + "\n" + "producir aneurismas, ataque cardiaco, dolor en el pecho y "
                       + "\n" + "daño en las arterias. "
                      + "\n"  + "El 1.3% de salvadoreños tienen sangre de tipo O";
               txtaDiagnostico.setText(Diagnostico);
                break;
        }
                break;
            default: nSangre = 0;
        }
        
        switch(Presion){
            case "Baja":
                nPresion =0;
                break;
            case "Media":
                nPresion =1;
                break;
            case "Alta":
                nPresion =2;
                break;
            default: nPresion =0;
        }
          
       
         root.children.get(0).children.get(nGenero).children.add(new TreeNode(Nombre));
         root.children.get(1).children.get(nSangre).children.add(new TreeNode(Nombre));
         root.children.get(2).children.get(nPresion).children.add(new TreeNode(Nombre));
         
         printNAryTree(root);
       
         
        
        
        
      
     }
        
        
        
        
        
    }//GEN-LAST:event_btnDiagnosticarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnosticar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbPresion;
    private javax.swing.JComboBox<String> cmbSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDiagnostico;
    // End of variables declaration//GEN-END:variables
}



