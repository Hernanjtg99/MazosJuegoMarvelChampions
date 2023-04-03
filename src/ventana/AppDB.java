/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;
import java.sql.*;
import javax.swing.JOptionPane;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
/**
 *
 * @author herna
 */
public class AppDB extends javax.swing.JFrame {

    /**
     * Creates new form AppDB
     */
    public AppDB() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtsuperheroname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        botonregistro = new javax.swing.JButton();
        botonmodificar = new javax.swing.JButton();
        botoneliminar = new javax.swing.JButton();
        botonbuscar = new javax.swing.JButton();
        txtbuscarmazo = new javax.swing.JTextField();
        labelstatus = new javax.swing.JLabel();
        botonpdf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsuperheroname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuperheronameActionPerformed(evt);
            }
        });
        getContentPane().add(txtsuperheroname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, -1));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SuperHeroe");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo de Deck");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 30));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, -1));

        botonregistro.setText("Registrar");
        botonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroActionPerformed(evt);
            }
        });
        getContentPane().add(botonregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        botoneliminar.setText("Eliminar");
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botoneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));
        getContentPane().add(txtbuscarmazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, -1));

        labelstatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelstatus.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 352, 280, 30));

        botonpdf.setText("PDF");
        botonpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpdfActionPerformed(evt);
            }
        });
        getContentPane().add(botonpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 130, 20));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 230, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marvel_Comics_.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistroActionPerformed
       
     try
     {
         //Realizar la conexion
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/marveldb","root","");
        //Ingresar sentencia sql
        PreparedStatement pst = cn.prepareStatement("insert into decks values (?,?,?,?)");
        
        pst.setString(1, "0");
        pst.setString(2, txtusuario.getText().trim());
        pst.setString(3, txtsuperheroname.getText().trim());
        pst.setString(4, txtcodigo.getText().trim());
        
        pst.executeUpdate();
        
        txtsuperheroname.setText("");
        txtcodigo.setText("");
        txtusuario.setText("");
        labelstatus.setText("Se ha registrado tu mazo");
        
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
    }//GEN-LAST:event_botonregistroActionPerformed

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
     try
     {
         String modIDheroe= txtbuscarmazo.getText();
         Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/marveldb","root","");
       //  PreparedStatement pst = cn.prepareStatement("update decks set SuperHeroe = ?,  Codigo = ? , Usuario =? where SuperHeroe= '"+modnombreheroe+"'");
          PreparedStatement pst = cn.prepareStatement("update decks set SuperHeroe = ?,  Codigo = ? , Usuario =? where ID= "+modIDheroe);
         pst.setString(1,txtsuperheroname.getText().trim());
         pst.setString(2, txtcodigo.getText().trim());
         pst.setString(3, txtusuario.getText().trim());
         
         pst.executeUpdate();
         
         labelstatus.setText("Mazo modificado");
         
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
     
        try
        {
         // String busquedanombre= txtbuscarmazo.getText();       
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/marveldb","root","");
        // PreparedStatement pst = cn.prepareStatement("select * from decks where SuperHeroe = '"+busquedanombre+"'");
                  PreparedStatement pst = cn.prepareStatement("select * from decks where ID = ?");
        pst.setString(1, txtbuscarmazo.getText());
         
              ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
                txtsuperheroname.setText(rs.getString("SuperHeroe"));
                txtcodigo.setText(rs.getString("Codigo"));
                 txtusuario.setText(rs.getString("Usuario"));
            }else
                    {
                        JOptionPane.showMessageDialog(null, "Mazo no encontrado");
                    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
    
        
             try
     {
         String eliminarheroe= txtbuscarmazo.getText();
         Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/marveldb","root","");
         PreparedStatement pst = cn.prepareStatement("delete from decks where ID= "+eliminarheroe);
         

         
         pst.executeUpdate();
         
         labelstatus.setText("Mazo Eliminado");
         
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void txtsuperheronameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuperheronameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuperheronameActionPerformed

    private void botonpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpdfActionPerformed
    
         Document documento= new Document();
        try
    {
       String ruta = System.getProperty("user.home");
       PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/OneDrive/Escritorio/MazosMarvel.pdf"));
      
        Image header = Image.getInstance("src/Imagenes/Marvel_Logo.jpg");
       header.scaleToFit(650,250);
       header.setAlignment(Chunk.ALIGN_CENTER);
       
       Paragraph parrafo= new Paragraph();
       parrafo.setAlignment(Paragraph.ALIGN_CENTER);
       parrafo.add("Mazos Generados por Hernan \n\n");
       parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD, BaseColor.DARK_GRAY));
       parrafo.add("Mazos Marvel Champions LCG \n\n");
       
       
       
       documento.open();
       documento.add(header);
       documento.add(parrafo);
       

       
       PdfPTable tabla = new PdfPTable(3);
             tabla.addCell("Usuario");
            tabla.addCell("SuperHeroe");
            tabla.addCell("Codigo");
            
            try
            {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/marveldb","root","");
                PreparedStatement pst = cn.prepareStatement("select Usuario,Superheroe,Codigo from decks ");
               // pst.setString(1, txtbuscarmazo.getText());
                ResultSet rs = pst.executeQuery();
                
                if(rs.next())
                {
                    do
                    {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        
                    }while(rs.next());
                    documento.add(tabla);
                }
            }catch(DocumentException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
         documento.close();
        JOptionPane.showMessageDialog(null,"PDF con Codigos de mazo creados");
    }catch(Exception e)
    {
        
    }
    }//GEN-LAST:event_botonpdfActionPerformed

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
            java.util.logging.Logger.getLogger(AppDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JButton botonpdf;
    private javax.swing.JButton botonregistro;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelstatus;
    private javax.swing.JTextField txtbuscarmazo;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtsuperheroname;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables



}
