


package zaratmabarlıveframeli;
import java.util.*;
import javax.swing.*;

public class OyunEkranı extends javax.swing.JFrame {

int deger , durum , b1 , hakkı;
 
    public OyunEkranı(String ad1, String ad2 , int a , int b) {
        initComponents();
        oyuncu1.setText(ad1);
        oyuncu2.setText(ad2);
        deger = a ;
        durum = b;
        buton2.setVisible(false);
        if ( durum == 1){
            b1 = deger / 2;
            oyu1bar.setMaximum(deger);
            oyu1bar.setValue(b1);
            bar1.setText(""+ (b1));
            bar2.setText(""+ (b1));
            hak.setVisible(false);
        }
         if ( durum == 2){            
             b1 = deger*10 ;
             oyu1bar.setMaximum(b1*2);
             oyu1bar.setValue(b1);
             hakkı = deger ;      
            bar1.setText(""+ (b1));
            bar2.setText(""+ (b1));
            hak.setText("" + hakkı);
            hak.setVisible(true);
        }
         
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        oyuncu1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oyuncu2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        oyu1z2 = new javax.swing.JLabel();
        oyu1z1 = new javax.swing.JLabel();
        oyu2z2 = new javax.swing.JLabel();
        oyu2z1 = new javax.swing.JLabel();
        oyu1bar = new javax.swing.JProgressBar();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        hak = new javax.swing.JLabel();
        buton1 = new javax.swing.JButton();
        buton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Oyuncu1 Adı =");

        oyuncu1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oyuncu1.setText("------------------");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Oyuncu2 Adı =");

        oyuncu2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oyuncu2.setText("---------------------");

        jLabel5.setText("ZAR 1 =");

        jLabel6.setText("ZAR 2 =");

        jLabel7.setText("ZAR 2 =");

        jLabel8.setText("ZAR 1 =");

        oyu1z2.setText("0");

        oyu1z1.setText("0");

        oyu2z2.setText("0");

        oyu2z1.setText("0");

        bar1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bar1.setText("0");

        bar2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bar2.setText("0");

        hak.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        hak.setText("0");

        buton1.setBackground(new java.awt.Color(255, 0, 0));
        buton1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        buton1.setText("ZAR AT");
        buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton1ActionPerformed(evt);
            }
        });

        buton2.setBackground(new java.awt.Color(255, 200, 0));
        buton2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        buton2.setText("ANASAYFAYA DÖN");
        buton2.setToolTipText("");
        buton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oyu1z2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(oyu1z1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oyuncu1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oyu2z2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(oyu2z1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oyuncu2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addComponent(oyu1bar, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(hak, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(bar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buton1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(oyuncu1)
                    .addComponent(oyuncu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(oyu1z1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(oyu1z2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oyu2z1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(oyu2z2)))
                .addGap(18, 18, 18)
                .addComponent(oyu1bar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hak, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buton2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int o1z1 , o1z2 , o2z1 , o2z2 ,top1 , top2   ;
    Random rast = new Random();
    
    private void buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton1ActionPerformed
    o1z1 = rast.nextInt(15)+1;
    o1z2 = rast.nextInt(15)+1;
    o2z1 = rast.nextInt(15)+1;
    o2z2 = rast.nextInt(15)+1;
    
    oyu1z1.setText(""+o1z1);
    oyu1z2.setText(""+o1z2);
    oyu2z1.setText(""+o2z1);
    oyu2z2.setText(""+o2z2);
    
    top1= o1z1 + o1z2;
    top2= o2z1 + o2z2; 
    
    if(durum == 1 )
    {
        if(top1>top2)
{   
    b1 = b1 + (top1-top2) ;
    bar1.setText("" + b1);
    bar2.setText("" + (deger-b1));
    oyu1bar.setValue(b1);
    
}
  
if(top2>top1)
{
    b1 = b1 - (top2-top1) ;
    bar1.setText("" + b1);
    bar2.setText("" + (oyu1bar.getMaximum() -b1));
    oyu1bar.setValue(b1);
}
   
if(oyu1bar.getValue() <= 0)
{
    bar1.setText("0");
    bar2.setText(""+ deger);
    JOptionPane.showMessageDialog(this," !!! KAZANAN " + oyuncu2.getText() + " TEBRİKLER!!!" );
    buton1.setEnabled(false);
    buton2.setVisible(true);
    
    
}
if(oyu1bar.getValue() >= deger)
{
    bar1.setText("" + deger);
    bar2.setText("0");
    JOptionPane.showMessageDialog(this," !!! KAZANAN " + oyuncu1.getText() + " TEBRİKLER!!!" );
    buton1.setEnabled(false);
    buton2.setVisible(true);
    
}
    }
    if(durum == 2 )
    {
        hak.setVisible(true);
        hakkı = hakkı - 1;
        hak.setText("" + hakkı);
        if(top1>top2)
{   
    b1 = b1 + (top1-top2) ;
    bar1.setText("" + b1);
    bar2.setText("" + (oyu1bar.getMaximum()-b1));
    oyu1bar.setValue(b1);
   
}
  
if(top2>top1)
{
    b1 = b1 - (top2-top1) ;
    bar1.setText("" + b1);
    bar2.setText("" + (oyu1bar.getMaximum()-b1));
    oyu1bar.setValue(b1);
}
   
if(hakkı == 0)
{
    if(b1 > (deger*10) ){
    JOptionPane.showMessageDialog(this," !!! KAZANAN " + oyuncu1.getText() + " TEBRİKLER!!!" );
    buton1.setEnabled(false);
    buton2.setVisible(true);
    }
    if(b1 < (deger*10)){
    JOptionPane.showMessageDialog(this," !!! KAZANAN " + oyuncu2.getText() + " TEBRİKLER!!!" );
    buton1.setEnabled(false);
    buton2.setVisible(true);
    }
    
}

    }
    }//GEN-LAST:event_buton1ActionPerformed

    private void buton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton2ActionPerformed
        Basla basla = new Basla();
        
        this.setVisible(false);
        basla.setVisible(true);
    }//GEN-LAST:event_buton2ActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(OyunEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Basla().setVisible(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JButton buton1;
    private javax.swing.JButton buton2;
    private javax.swing.JLabel hak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar oyu1bar;
    private javax.swing.JLabel oyu1z1;
    private javax.swing.JLabel oyu1z2;
    private javax.swing.JLabel oyu2z1;
    private javax.swing.JLabel oyu2z2;
    private javax.swing.JLabel oyuncu1;
    private javax.swing.JLabel oyuncu2;
    // End of variables declaration//GEN-END:variables
}
