
import javax.swing.JOptionPane;
public class InfoDoctores extends javax.swing.JFrame {
    
    private NodoLista cabeza;   //Se crea un objeto inicial de tipo NodoLis
    private NodoLista ultimo;
    private NodoLSC inicioLSC;
    private NodoLSC finLSC;

    public InfoDoctores() {
        initComponents();
        setTitle("INFROMACION DOCTORES");
        setSize(805,650);
        setResizable(false);
        setLocationRelativeTo(null); 
        this.cabeza=null;
        this.ultimo=null;
        this.inicioLSC=null;
        this.finLSC=null;
    }
    
    public void limpiar(){
        txtIdIns.setText("");
        txtNomIns.setText("");
        txtPaciIns.setText("");
    }

    public boolean vaciaL(){
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean vaciaLSC(){
        if(inicioLSC==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void llenarLista(){
        try{
        if(txtNomIns.getText().isEmpty()||txtIdIns.getText().isEmpty()||txtPaciIns.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta información");
        }else{
        String nombre=txtNomIns.getText();
        int Id= Integer.parseInt(txtIdIns.getText());
        int paci=Integer.parseInt(txtPaciIns.getText());
        InfoDoctor ins = new InfoDoctor(nombre, Id, paci);
                
        InfoDoctor i=new InfoDoctor(nombre, Id, paci);
        i.setNombre(nombre);
        i.setID(Id);
        i.setCantidaddepacientes(paci);
        NodoLista n=new NodoLista();
        n.setDato(i);
        if(vaciaL()){
            cabeza=n;
            ultimo=cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if(i.getID()<cabeza.getDato().getID()){
            n.setNext(cabeza);
            cabeza=n;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if(i.getID()>=ultimo.getDato().getID()){
            ultimo.setNext(n);
            ultimo=ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else{
            NodoLista aux=cabeza;
            while(aux.getNext().getDato().getID()<i.getID()){
                aux=aux.getNext();
            }
            n.setNext(aux.getNext());
            n.setBack(aux);
            aux.setNext(n);
            aux.getNext().setBack(n);
        }
        
        }
       }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Datos erroneos");
       }
    }
    
    public void copiarLDCaLSC(){
        NodoLista aux=cabeza;
        if(aux!=null){
            llenarLSC(aux.getDato());
            aux=aux.getNext();
            while(aux!=cabeza){
                llenarLSC(aux.getDato());
                aux=aux.getNext();
            }
        }
    }
    
    public void llenarLSC(InfoDoctor elementoLSC){
        NodoLSC n=new NodoLSC();
        n.setElementoLSC(elementoLSC);
        if(vaciaLSC()){
            inicioLSC=n;
            finLSC=inicioLSC;
            finLSC.setSiguienteLSC(inicioLSC);
        }else if(elementoLSC.getID()<inicioLSC.getElementoLSC().getID()){
            n.setSiguienteLSC(inicioLSC);
            inicioLSC=n;
            finLSC.setSiguienteLSC(inicioLSC);
        }else if(elementoLSC.getID()>=finLSC.getElementoLSC().getID()){
            finLSC.setSiguienteLSC(n);
            finLSC = finLSC.getSiguienteLSC();
            finLSC.setSiguienteLSC(inicioLSC);
        }else{
            NodoLSC aux=inicioLSC;
            while(aux.getSiguienteLSC().getElementoLSC().getID()<elementoLSC.getID()){
                aux=aux.getSiguienteLSC();
            }
            n.setSiguienteLSC(aux.getSiguienteLSC());
            aux.setSiguienteLSC(n);
            finLSC.setSiguienteLSC(inicioLSC);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomIns = new javax.swing.JTextField();
        txtIdIns = new javax.swing.JTextField();
        txtPaciIns = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanta = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        txtElimina = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(944, 648));

        jLabel1.setText("NOMBRE DEL DOCTOR");

        jLabel2.setText("ID");

        jLabel3.setText("CANTIDAD DE PACIENTES");

        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtPanta.setEditable(false);
        txtPanta.setBackground(new java.awt.Color(0, 0, 0));
        txtPanta.setColumns(20);
        txtPanta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPanta.setRows(5);
        txtPanta.setWrapStyleWord(true);
        txtPanta.setAutoscrolls(false);
        txtPanta.setBorder(null);
        txtPanta.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPanta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPanta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPanta.setEnabled(false);
        txtPanta.setOpaque(false);
        jScrollPane1.setViewportView(txtPanta);

        btnEliminar.setText("Eliminar ID");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir Lista Doble Circular");
        btnImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnImprimir1.setText("Imprimir Lista Simple Circular");
        btnImprimir1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Información Doctores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnImprimir)
                        .addGap(50, 50, 50)
                        .addComponent(btnImprimir1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(jLabel4)
                            .addGap(180, 180, 180))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomIns)
                                    .addComponent(txtIdIns)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPaciIns, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(txtElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(261, 261, 261)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPaciIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar)
                        .addComponent(txtElimina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        llenarLista();
        limpiar();
        copiarLDCaLSC();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void imprimirLista(){
        String s="";
        if(vaciaL()==false){
            NodoLista aux=cabeza;
            s=s+aux.getDato().getNombre()+" "+aux.getDato().getID()+" "+aux.getDato().getCantidaddepacientes()+" <==> ";
            aux=aux.getNext();
            while(aux!=cabeza){
                s=s+aux.getDato().getNombre()+" "+aux.getDato().getID()+" "+aux.getDato().getCantidaddepacientes()+" <==> ";
                aux=aux.getNext();
            }
            txtPanta.setText(s);
        }
    }
    
    public void imprimirLSC(){
        String s="";
        if(vaciaLSC()==false){
            NodoLSC aux=inicioLSC;
            s=s+aux.getElementoLSC().getNombre()+"=="+aux.getElementoLSC().getID()+"=="+aux.getElementoLSC().getCantidaddepacientes()+" ==> ";
            aux=aux.getSiguienteLSC();
            while(aux!=inicioLSC){
                s=s+aux.getElementoLSC().getNombre()+"=="+aux.getElementoLSC().getID()+"=="+aux.getElementoLSC().getCantidaddepacientes()+" ==> ";
                aux=aux.getSiguienteLSC();
            }
            JOptionPane.showMessageDialog(null, "La lista simple circular contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Lista simple circular vacía!");
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
        Inicio reg = new Inicio();
        reg.setVisible(true);
          dispose();

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        System.exit(0); // metodo para salir 


          // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimirLista();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        imprimirLSC();
    }//GEN-LAST:event_btnImprimir1ActionPerformed

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
            java.util.logging.Logger.getLogger(InfoDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoDoctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtElimina;
    private javax.swing.JTextField txtIdIns;
    private javax.swing.JTextField txtNomIns;
    private javax.swing.JTextField txtPaciIns;
    private javax.swing.JTextArea txtPanta;
    // End of variables declaration//GEN-END:variables

    double getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
