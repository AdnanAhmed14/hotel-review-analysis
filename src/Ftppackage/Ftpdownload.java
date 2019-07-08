/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ftppackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author comp
 */
public class Ftpdownload extends javax.swing.JFrame {

    String fileName="";
    public Ftpdownload() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Download");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(690, 210, 140, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("FTP File Download");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 30, 138, 19);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ftppackage/down.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
    	
    	try
    	{
    		FileInputStream fis=new FileInputStream("fTPUplaodCloud//CDataset.txt");
    		byte bb[]=new byte[fis.available()];
    		fis.read(bb);
    		fis.close();
    		String fdata=new String(bb);
    		
    		FileOutputStream fos=new FileOutputStream("alltweetsfinal.txt");
    		fos.write(fdata.getBytes());
    		fos.close();
    		Thread.sleep(2000);
    		
    		JOptionPane.showMessageDialog(null, "Offline Data Downloaded Successfully.");
    		
    		
    		
    		
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    	
//        String server = "files.000webhost.com";
//        int port = 21;
//        String user = "sentimentalanalysis";
//        String pass = "testing1234";
//        FTPClient ftpClient = new FTPClient();
//        try {
//            ftpClient.connect(server, port);
//            ftpClient.login(user, pass);
//            ftpClient.enterLocalPassiveMode();
// 
//            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
// 
//            // APPROACH #1: uploads first file using an InputStream
//            
//            File firstLocalFile = new File("alltweetsfinal.txt");
//             Runtime.getRuntime().exec("notepad alltweetsfinal.txt");
//            System.out.println("Start reading");
//            String firstRemoteFile = "fresh1.txt"; 
//            
//            //String localFile = "D:/test.txt";
//            //String remoteFile = "fresh.txt";
//            OutputStream outputStream = new FileOutputStream(firstLocalFile);
// 
//            System.out.println("Start Downloaded first file");
//            //boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
//            boolean done = ftpClient.retrieveFile(firstRemoteFile, outputStream);
//            
//            System.out.println(done);
//            outputStream.close();
//            if (done) {
//                System.out.println("The first file is Downloaded successfully.");
//                JOptionPane.showMessageDialog(null, "file is Downloaded successfully");
//                Runtime.getRuntime().exec("notepad alltweetsfinal.txt");
//            }
//            
//            
//            
// 
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (ftpClient.isConnected()) {
//                    ftpClient.logout();
//                    ftpClient.disconnect();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(Ftpdownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ftpdownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ftpdownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ftpdownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           Ftpdownload ff=new Ftpdownload();
           ff.setVisible(true);
           ff.setSize(1000, 670);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
