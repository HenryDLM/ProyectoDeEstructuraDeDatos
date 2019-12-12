
import java.io.IOException;
import javax.swing.JOptionPane;
public class InfoDoctores extends javax.swing.JFrame {
    
    private NodoLista cabeza;   //Se crea un objeto inicial de tipo NodoLis
    private NodoLista ultimo;
    private NodoLSC inicioLSC;
    private NodoLSC finLSC;

    public InfoDoctores() {
        initComponents();
        setTitle("INFROMACION DOCTORES");
        setSize(1056, 386);
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
       }catch(Error e){
        JOptionPane.showMessageDialog(null,"Datos erroneos!");
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
    
    public void llenarLSC(InfoDoctor dato){
        NodoLSC n=new NodoLSC();
        n.setElementoLSC(dato);
        if(vaciaLSC()){
            inicioLSC=n;
            finLSC=n;
            finLSC.setSiguienteLSC(inicioLSC);
        }else if(dato.getID()<inicioLSC.getElementoLSC().getID()){
            n.setSiguienteLSC(inicioLSC);
            inicioLSC=n;
            finLSC.setSiguienteLSC(inicioLSC);
        }else if(dato.getID()>=finLSC.getElementoLSC().getID()){
            finLSC.setSiguienteLSC(n);
            finLSC=finLSC.getSiguienteLSC();
            finLSC.setSiguienteLSC(inicioLSC);
        }else{
            NodoLSC aux=inicioLSC;
            while((aux.getSiguienteLSC()!=null)&&(aux.getSiguienteLSC().getElementoLSC().getID()<dato.getID())){
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
        jButton3 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(944, 648));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 21, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad de Pacientes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(txtNomIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 19, 320, -1));
        jPanel1.add(txtIdIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 59, 320, -1));
        jPanel1.add(txtPaciIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 97, 320, -1));

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 11, 510, 231));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Volver");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 140, 40));

        btnImprimir.setBackground(new java.awt.Color(51, 51, 255));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir Lista Doble Circular");
        btnImprimir.setBorder(null);
        btnImprimir.setBorderPainted(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, 40));

        btnImprimir1.setBackground(new java.awt.Color(51, 51, 255));
        btnImprimir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir1.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir1.setText("Imprimir Lista Simple Circular");
        btnImprimir1.setBorder(null);
        btnImprimir1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 230, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Información Doctores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        imprimirLSC();
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimirLista();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Inicio reg = new Inicio();
        reg.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

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
            s=s+aux.getElementoLSC().getNombre()+"="+aux.getElementoLSC().getID()+"="+aux.getElementoLSC().getCantidaddepacientes()+" => ";
            aux=aux.getSiguienteLSC();
            while(aux!=inicioLSC){
                s=s+aux.getElementoLSC().getNombre()+"="+aux.getElementoLSC().getID()+"="+aux.getElementoLSC().getCantidaddepacientes()+" => ";
                aux=aux.getSiguienteLSC();
            }
            JOptionPane.showMessageDialog(null, "La lista simple circular contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Lista simple circular vacía!");
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
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
