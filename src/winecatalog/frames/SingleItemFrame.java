/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winecatalog.frames;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import winecatalog.WineCatalog;
import winecatalog.object.WineObject;

/**
 *
 * @author wans8
 */
public class SingleItemFrame extends javax.swing.JFrame {

    public static SingleItemFrame frame = new SingleItemFrame();
    /**
     * Creates new form SingleItemFrame
     */
    
    WineObject wine = new WineObject();
    HomeFrame frH;
    
    public SingleItemFrame() {
        initComponents();  
    }
    
    public SingleItemFrame(WineObject obj, HomeFrame fr) throws IOException {
        initComponents();  
        wine = obj;
        frH = fr;
        setContent();
    }
    
    public void setContent() throws MalformedURLException, IOException {
        URL imgUrl = new URL(wine.getPic());
        Image imageFile = ImageIO.read(imgUrl);
        image.setIcon(new ImageIcon(imageFile));
        head_title.setText(wine.getName());
        country.setText(wine.getCountry());
        company.setText(wine.getCompany());
        color.setText(wine.getColor());
        grape.setText(wine.getGrape());
        sugar.setText(wine.getSugar());
        year.setText(wine.getYear() + "г.");
        alcho.setText(wine.getAlcohol() + "%");
        price.setText(wine.getPrice() + "р.");
        
        String oldDesc = wine.getDescription();
        if (oldDesc.length() <= 50) {
            description.setText(oldDesc);
        } else {
            description.setText("<html>" + oldDesc.substring(0, 50) + "<br>" + oldDesc.substring(51, oldDesc.length()) + "</html>");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        head_title = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        sugar = new javax.swing.JLabel();
        company = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        grape = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        alcho = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        addCart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 745));
        setPreferredSize(new java.awt.Dimension(650, 745));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(176, 0, 29));

        head_title.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        head_title.setForeground(new java.awt.Color(255, 255, 255));
        head_title.setText("Каталог");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(head_title, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_title, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, 320));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel1.setText("Цвет:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel2.setText("Страна:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel3.setText("Сахар:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel4.setText("Производитель:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 140, 30));

        country.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 190, 30));

        sugar.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(sugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 190, 30));

        company.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 190, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel8.setText("Виноград:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 140, 30));

        color.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 190, 30));

        grape.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(grape, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 190, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel11.setText("Описание:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, 30));

        description.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        description.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 370, 130));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel13.setText("Год:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 140, 30));

        year.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 190, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel15.setText("Алкоголь:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 140, 30));

        alcho.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        jPanel1.add(alcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 190, 30));

        jPanel3.setBackground(new java.awt.Color(176, 0, 29));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe WP Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Цена:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 90));

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 310, 90));

        addCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Add_Shopping_Cart_32px_1.png"))); // NOI18N
        addCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartMouseClicked(evt);
            }
        });
        jPanel3.add(addCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 650, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartMouseClicked
        // TODO add your handling code here
      frH.shoppingCart.add(wine);
      frH.cartCount.setText(String.valueOf(frH.shoppingCart.size()));
    }//GEN-LAST:event_addCartMouseClicked

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
            java.util.logging.Logger.getLogger(SingleItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCart;
    private javax.swing.JLabel alcho;
    private javax.swing.JLabel color;
    private javax.swing.JLabel company;
    private javax.swing.JLabel country;
    private javax.swing.JLabel description;
    private javax.swing.JLabel grape;
    private javax.swing.JLabel head_title;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel price;
    private javax.swing.JLabel sugar;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
