/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.TaiKhoan;
import Repository.Auth;
import Repository.MsgBox;
import Service.TaiKhoanService;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author hoanh
 */
public class DangNhapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapJFrame
     */
    public DangNhapJFrame() {
        initComponents();
        init();
        ChaoJDialog chao = new ChaoJDialog(this, true);
        chao.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        lblQuenMK = new javax.swing.JLabel();
        lblDisable = new javax.swing.JLabel();
        lblShow = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(751, 494));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(347, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Đăng Nhập");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 39, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Hello! Bắt đầu làm việc nào");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 93, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Mã NV");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 136, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Mật Khẩu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 234, -1, -1));

        txtMaNV.setForeground(new java.awt.Color(51, 51, 255));
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 287, 31));

        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 266, 287, 31));

        lblQuenMK.setText("Quên mật khẩu ?");
        lblQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseClicked(evt);
            }
        });
        jPanel1.add(lblQuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        lblDisable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/8541830_eye_slash_icon (1).png"))); // NOI18N
        lblDisable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisableMouseClicked(evt);
            }
        });
        jPanel1.add(lblDisable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        lblShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/8541829_eye_vision_view_icon (1).png"))); // NOI18N
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });
        jPanel1.add(lblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Đăng Nhập");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 42));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Kết Thúc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, 42));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        this.dangNhap();
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void lblQuenMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseClicked
        // TODO add your handling code here:
        new QuenMKJdialog(this, true).setVisible(true);
    }//GEN-LAST:event_lblQuenMKMouseClicked

    private void lblDisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisableMouseClicked
        // TODO add your handling code here:
        txtMatKhau.setEchoChar((char) 0);
        lblDisable.setVisible(false);
        lblDisable.setEnabled(false);
        lblShow.setEnabled(true);
        lblShow.setEnabled(true);
    }//GEN-LAST:event_lblDisableMouseClicked

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        // TODO add your handling code here:

        txtMatKhau.setEchoChar((char) 8226);
        lblDisable.setVisible(true);
        lblDisable.setEnabled(true);
        lblShow.setEnabled(false);
        lblShow.setEnabled(false);
    }//GEN-LAST:event_lblShowMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dangNhap();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ketThuc();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDisable;
    private javax.swing.JLabel lblQuenMK;
    private javax.swing.JLabel lblShow;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
 private void init() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // Ngăn chặn việc đóng cửa sổ bằng nút "X"
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ketThuc(); // 
            }
        });
    }

    TaiKhoanService dao = new TaiKhoanService();

    private void dangNhap() {
        String maNV = txtMaNV.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        TaiKhoan nv = dao.selectByIdtk(maNV);
        if (nv == null) {
            MsgBox.alert(this, "Sai tên đăng nhập!");
        } else if (!matKhau.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Sai mật khẩu!");
        } else {
            Auth.User = nv;
            BanAoSoMi banAoSoMi = new BanAoSoMi();
            banAoSoMi.show();
            dispose();
            this.dispose();
        }
    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc ứng dựng?")) {
            System.exit(0);
        }
    }

    private boolean kiemTraDangNhap() {
        // Code để kiểm tra thông tin đăng nhập
        // Trả về true nếu đăng nhập thành công, ngược lại trả về false
        // Đây là nơi bạn thực hiện kiểm tra thông tin đăng nhập, ví dụ như xác thực từ cơ sở dữ liệu
        // Ví dụ:
        // Nếu thông tin đăng nhập hợp lệ:
        // return true;
        // Ngược lại:
        // return false;
        return true; // Hoặc return false;
    }

    // Phương thức lấy MaNV từ cơ sở dữ liệu
    private String layMaNVTuCoSoDuLieu() {
        String maNV = null;
        // Code để truy vấn cơ sở dữ liệu và lấy MaNV
        // Ví dụ: Kết nối và truy vấn cơ sở dữ liệu để lấy MaNV
        // Sau khi lấy được MaNV, gán vào biến maNV
        // Ví dụ:
        // maNV = "NV123"; // Giả sử MaNV lấy từ cơ sở dữ liệu là "NV123"
        return maNV; // Trả về MaNV sau khi lấy thành công
    }

    // Gọi phương thức lấy MaNV khi cần thiết (ví dụ khi người dùng đăng nhập thành công)
    public String layMaNhanVien() {
        String maNV = null;
        // Thực hiện đăng nhập và lấy MaNV sau khi đăng nhập thành công
        if (kiemTraDangNhap()) { // Gọi phương thức kiểm tra thông tin đăng nhập
            maNV = layMaNVTuCoSoDuLieu(); // Gọi phương thức lấy MaNV từ cơ sở dữ liệu
        }
        return maNV; // Trả về MaNV sau khi lấy thành công
    }

}
