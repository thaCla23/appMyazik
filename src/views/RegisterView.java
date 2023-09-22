package views;

import controllers.UserController;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.User;

public class RegisterView extends javax.swing.JFrame {
    
    Statement st = null;
    Connection con = null;

    public RegisterView() {
        initComponents();
    }

    private void cekdataMhs(){
        try{
            if (txtName.getText().equals("") || cboxProdi.getSelectedItem().equals("Choose a category") || txtPassword.getText().equals("")||txtUsername.getText().equals("")||cboxAsrama.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(this,"Data Tidak Boleh Ada Yang Kosong","pesan",JOptionPane.WARNING_MESSAGE);
            }
            
            else{
                st = con.createStatement();
                
                String simpan = "insert into user(ROLE, nama, Prodi, Kelas, Asrama, Username, PASSWORD) values('"+btnMahasiswa.getText()+"','"+txtName.getText()+"','"+cboxProdi.getSelectedItem()+"','"+cboxKelas.getSelectedItem()+"','"+cboxAsrama.getSelectedItem()+"','"+txtUsername.getText()+"','"+String.valueOf(txtPassword.getText())+"')";
                int SA= st.executeUpdate(simpan);
                JOptionPane.showMessageDialog(this,"Registration Successfully", "pesan", JOptionPane.INFORMATION_MESSAGE);
                }
        }

        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"account already exists","message",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void cekdataDosen(){
        try{
            if (txtNamaDosen.getText().equals("") || cboxKelasDosen.getSelectedItem().equals("Choose a category") || txtPasswordDosen.getText().equals("")||txtUsernameDosen.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Tidak Boleh Kosong","pesan",JOptionPane.ERROR_MESSAGE);
                hapuslayarDosen();
            }
            
            else{
                st = con.createStatement();
                String simpan = "insert into user(ROLE, nama, Prodi, Kelas, Asrama, Username, PASSWORD) values('"+btnDosen.getText()+"','"+txtNamaDosen.getText()+"',NULL ,'"+cboxKelasDosen.getSelectedItem()+"',NULL ,'"+txtUsername.getText()+"','"+String.valueOf(txtPassword.getText())+"')";
                st=con.createStatement();
                int SA= st.executeUpdate(simpan);
                JOptionPane.showMessageDialog(this,"Registration Successfully");
                }
        }

        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"account already exists","message",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            hapuslayarDosen();
        }
    }
    
    private void cekDataKeasramaan(){
        try{
            if (txtNamaKeasramaan.getText().equals("") || cboxAsramaKeasramaan.getSelectedItem().equals("Choose a category") || txtPasswordKeasramaan.getText().equals("")||txtUsernameKeasramaan.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Data Tidak Boleh Kosong","pesan",JOptionPane.ERROR_MESSAGE);
                hapuslayarKeasramaan();
            }
            
            else{
                st = con.createStatement();
                String simpan = "insert into user(ROLE, nama, Prodi, Kelas, Asrama, Username, PASSWORD) values('"+btnKeasramaan.getText()+"','"+txtNamaKeasramaan.getText()+"',NULL ,NULL, '"+cboxAsramaKeasramaan.getSelectedItem().equals("Choose a category")+"', NULL ,'"+txtUsernameKeasramaan.getText()+"','"+String.valueOf(txtPasswordKeasramaan.getText())+"')";
                st=con.createStatement();
                int SA= st.executeUpdate(simpan);
                JOptionPane.showMessageDialog(this,"Registration Successfully");
                }
        }

        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"account already exists","message",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            hapuslayarKeasramaan();
        }
    }
    
    private void hapuslayarMhs() {
       txtName.setText("");
       txtUsername.setText("");
       txtPassword.setText("");
       cboxProdi.setSelectedItem("Choose a category");
       cboxKelas.setSelectedItem("choose a category");
       cboxAsrama.setSelectedItem("Choose a category");
    }
    
    private void hapuslayarDosen() {
       txtNamaDosen.setText("");
       txtUsernameDosen.setText("");
       txtPasswordDosen.setText("");
       cboxKelasDosen.setSelectedItem("Choose a category");
    }
    
    private void hapuslayarKeasramaan() {
       txtNamaKeasramaan.setText("");
       txtUsernameKeasramaan.setText("");
       txtPasswordKeasramaan.setText("");
       cboxAsramaKeasramaan.setSelectedItem("Choose a category");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pnlUtama = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlGbr = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnMahasiswa = new javax.swing.JButton();
        btnDosen = new javax.swing.JButton();
        btnKeasramaan = new javax.swing.JButton();
        pnlRegister = new javax.swing.JPanel();
        pnlRegisterMhs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboxProdi = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cboxAsrama = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cboxKelas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnRegisterMhs = new javax.swing.JButton();
        pnlRegisterDosen = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtNamaDosen = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtUsernameDosen = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cboxKelasDosen = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtPasswordDosen = new javax.swing.JTextField();
        btnRegisterDosen = new javax.swing.JButton();
        pnlRegisterKeasramaan = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNamaKeasramaan = new javax.swing.JTextField();
        txtUsernameKeasramaan = new javax.swing.JTextField();
        cboxAsramaKeasramaan = new javax.swing.JComboBox<>();
        txtPasswordKeasramaan = new javax.swing.JTextField();
        btnRegisterKeasramaan = new javax.swing.JButton();

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Password");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlUtama.setBackground(new java.awt.Color(255, 255, 255));
        pnlUtama.setPreferredSize(new java.awt.Dimension(1030, 600));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/myazikLogo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Have an account?");

        btnSignIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(0, 102, 102));
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("REGISTER");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Register as");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Already have an account? Login here");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaper-hd-mac.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlGbrLayout = new javax.swing.GroupLayout(pnlGbr);
        pnlGbr.setLayout(pnlGbrLayout);
        pnlGbrLayout.setHorizontalGroup(
            pnlGbrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGbrLayout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jLabel14))
            .addComponent(jLabel16)
        );
        pnlGbrLayout.setVerticalGroup(
            pnlGbrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
            .addComponent(jLabel16)
        );

        btnMahasiswa.setBackground(new java.awt.Color(0, 102, 102));
        btnMahasiswa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        btnMahasiswa.setText("Mahasiswa");
        btnMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMahasiswaMouseClicked(evt);
            }
        });

        btnDosen.setBackground(new java.awt.Color(0, 102, 102));
        btnDosen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnDosen.setText("Dosen");
        btnDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDosenMouseClicked(evt);
            }
        });
        btnDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosenActionPerformed(evt);
            }
        });

        btnKeasramaan.setBackground(new java.awt.Color(0, 102, 102));
        btnKeasramaan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKeasramaan.setForeground(new java.awt.Color(255, 255, 255));
        btnKeasramaan.setText("Keasramaan");
        btnKeasramaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeasramaanMouseClicked(evt);
            }
        });

        pnlRegister.setLayout(new java.awt.CardLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Nama");

        txtName.setBackground(new java.awt.Color(0, 102, 102));
        txtName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Prodi");

        cboxProdi.setBackground(new java.awt.Color(0, 102, 102));
        cboxProdi.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cboxProdi.setForeground(new java.awt.Color(255, 255, 255));
        cboxProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a category", "S1 Informatika", "S1 Teknik Elektro", "S1 Sistem Informasi", "S1 Manajemen Rekayasa", "S1 Teknik Bioproses", "D4 Teknologi Rekayasa Perangkat Lunak", "D3 Teknologi Informasi", "D3 Teknik Komputer" }));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setText("Asrama");

        cboxAsrama.setBackground(new java.awt.Color(0, 102, 102));
        cboxAsrama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cboxAsrama.setForeground(new java.awt.Color(255, 255, 255));
        cboxAsrama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a category","Rusunawa 1", "Rusunawa 2", "Rusunawa 3", "Rusunawa 4", "Kapernaum", "Silo", "Pniel", "Antiokhia" }));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("Username");

        txtUsername.setBackground(new java.awt.Color(0, 102, 102));
        txtUsername.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setText("Password");

        txtPassword.setBackground(new java.awt.Color(0, 102, 102));
        txtPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cboxKelas.setBackground(new java.awt.Color(0, 102, 102));
        cboxKelas.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cboxKelas.setForeground(new java.awt.Color(255, 255, 255));
        cboxKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a category", "11IF1", "11IF2", "11SI1", "11SI2", "11TE1", "11TE2", "11TB1", "11TB2", "11MR1", "11MR2", "11TRPL1", "11TRPL2", "11TRPL3", "11TK1", "11TK2", "11TI1", "11TI2",
            "12IF1", "12IF2", "12SI1", "12SI2", "12TE1", "12TE2", "12TB1", "12TB2", "12MR1", "12MR2", "12TRPL1", "12TRPL2", "12TRPL3", "12TK1", "12TK2", "12TI1", "12TI2",
            "13IF1", "13IF2", "13SI1", "13SI2", "13TE1", "13TE2", "13TB1", "13TB2", "13MR1", "13MR2", "13TRPL1", "13TRPL2", "13TRPL3", "13TK1", "13TK2", "13TI1", "13TI2",
            "14IF1", "14IF2", "14SI1", "14SI2", "14TE1", "14TE2", "14TB1", "14TB2", "14MR1", "14MR2", "14TRPL1", "14TRPL2", "14TRPL3", "14TK1", "14TK2", "14TI1", "14TI2"}));
cboxKelas.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboxKelasActionPerformed(evt);
    }
    });

    jLabel10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel10.setText("Kelas");

    btnRegisterMhs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnRegisterMhs.setForeground(new java.awt.Color(0, 102, 102));
    btnRegisterMhs.setText("Sign Up");
    btnRegisterMhs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegisterMhsActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnlRegisterMhsLayout = new javax.swing.GroupLayout(pnlRegisterMhs);
    pnlRegisterMhs.setLayout(pnlRegisterMhsLayout);
    pnlRegisterMhsLayout.setHorizontalGroup(
        pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlRegisterMhsLayout.createSequentialGroup()
            .addGroup(pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterMhsLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(txtName)
                        .addComponent(txtUsername)
                        .addComponent(cboxAsrama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlRegisterMhsLayout.createSequentialGroup()
                            .addGroup(pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(cboxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGap(40, 40, 40)
                            .addGroup(pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboxKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addComponent(txtPassword)))
                .addGroup(pnlRegisterMhsLayout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(btnRegisterMhs)))
            .addGap(160, 160, 160))
    );
    pnlRegisterMhsLayout.setVerticalGroup(
        pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlRegisterMhsLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(jLabel10))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlRegisterMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cboxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboxKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cboxAsrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addComponent(btnRegisterMhs)
            .addGap(26, 26, 26))
    );

    pnlRegister.add(pnlRegisterMhs, "card2");

    jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel15.setText("Nama");

    txtNamaDosen.setBackground(new java.awt.Color(0, 102, 102));
    txtNamaDosen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txtNamaDosen.setForeground(new java.awt.Color(255, 255, 255));

    jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel17.setText("Kelas Wali");

    txtUsernameDosen.setBackground(new java.awt.Color(0, 102, 102));
    txtUsernameDosen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txtUsernameDosen.setForeground(new java.awt.Color(255, 255, 255));
    txtUsernameDosen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUsernameDosenActionPerformed(evt);
        }
    });

    jLabel18.setText("jLabel18");

    jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel19.setText("Username");

    cboxKelasDosen.setBackground(new java.awt.Color(0, 102, 102));
    cboxKelasDosen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cboxKelasDosen.setForeground(new java.awt.Color(255, 255, 255));
    cboxKelasDosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a category", "11IF1", "11IF2", "11SI1", "11SI2", "11TE1", "11TE2", "11TB1", "11TB2", "11MR1", "11MR2", "11TRPL1", "11TRPL2", "11TRPL3", "11TK1", "11TK2", "11TI1", "11TI2",
        "12IF1", "12IF2", "12SI1", "12SI2", "12TE1", "12TE2", "12TB1", "12TB2", "12MR1", "12MR2", "12TRPL1", "12TRPL2", "12TRPL3", "12TK1", "12TK2", "12TI1", "12TI2",
        "13IF1", "13IF2", "13SI1", "13SI2", "13TE1", "13TE2", "13TB1", "13TB2", "13MR1", "13MR2", "13TRPL1", "13TRPL2", "13TRPL3", "13TK1", "13TK2", "13TI1", "13TI2",
        "14IF1", "14IF2", "14SI1", "14SI2", "14TE1", "14TE2", "14TB1", "14TB2", "14MR1", "14MR2", "14TRPL1", "14TRPL2", "14TRPL3", "14TK1", "14TK2", "14TI1", "14TI2" }));

jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
jLabel20.setText("Password");

txtPasswordDosen.setBackground(new java.awt.Color(0, 102, 102));
txtPasswordDosen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
txtPasswordDosen.setForeground(new java.awt.Color(255, 255, 255));

btnRegisterDosen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
btnRegisterDosen.setForeground(new java.awt.Color(0, 102, 102));
btnRegisterDosen.setText("Sign Up");
btnRegisterDosen.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnRegisterDosenActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout pnlRegisterDosenLayout = new javax.swing.GroupLayout(pnlRegisterDosen);
    pnlRegisterDosen.setLayout(pnlRegisterDosenLayout);
    pnlRegisterDosenLayout.setHorizontalGroup(
        pnlRegisterDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterDosenLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19)
            .addGap(413, 413, 413))
        .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
            .addGroup(pnlRegisterDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(pnlRegisterDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(txtNamaDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(cboxKelasDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(pnlRegisterDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsernameDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(364, 364, 364)
                            .addComponent(jLabel18))
                        .addComponent(txtPasswordDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(btnRegisterDosen)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnlRegisterDosenLayout.setVerticalGroup(
        pnlRegisterDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNamaDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlRegisterDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlRegisterDosenLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel17)
                    .addGap(18, 18, 18)
                    .addComponent(cboxKelasDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel19)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtUsernameDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel20)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtPasswordDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
            .addComponent(btnRegisterDosen)
            .addGap(30, 30, 30))
    );

    pnlRegister.add(pnlRegisterDosen, "card3");

    jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel21.setText("Nama");

    jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel22.setText("Asrama");

    jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel23.setText("Username");

    jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel24.setText("Password");

    txtNamaKeasramaan.setBackground(new java.awt.Color(0, 102, 102));
    txtNamaKeasramaan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txtNamaKeasramaan.setForeground(new java.awt.Color(255, 255, 255));

    txtUsernameKeasramaan.setBackground(new java.awt.Color(0, 102, 102));
    txtUsernameKeasramaan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txtUsernameKeasramaan.setForeground(new java.awt.Color(255, 255, 255));
    txtUsernameKeasramaan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUsernameKeasramaanActionPerformed(evt);
        }
    });

    cboxAsramaKeasramaan.setBackground(new java.awt.Color(0, 102, 102));
    cboxAsramaKeasramaan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cboxAsramaKeasramaan.setForeground(new java.awt.Color(255, 255, 255));
    cboxAsramaKeasramaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a category","Rusunawa 1", "Rusunawa 2", "Rusunawa 3", "Rusunawa 4", "Kapernaum", "Silo", "Pniel", "Antiokhia" }));

    txtPasswordKeasramaan.setBackground(new java.awt.Color(0, 102, 102));
    txtPasswordKeasramaan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txtPasswordKeasramaan.setForeground(new java.awt.Color(255, 255, 255));

    btnRegisterKeasramaan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnRegisterKeasramaan.setForeground(new java.awt.Color(0, 102, 102));
    btnRegisterKeasramaan.setText("Sign Up");
    btnRegisterKeasramaan.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnRegisterKeasramaanMouseClicked(evt);
        }
    });
    btnRegisterKeasramaan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegisterKeasramaanActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnlRegisterKeasramaanLayout = new javax.swing.GroupLayout(pnlRegisterKeasramaan);
    pnlRegisterKeasramaan.setLayout(pnlRegisterKeasramaanLayout);
    pnlRegisterKeasramaanLayout.setHorizontalGroup(
        pnlRegisterKeasramaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlRegisterKeasramaanLayout.createSequentialGroup()
            .addGap(45, 45, 45)
            .addGroup(pnlRegisterKeasramaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel24)
                .addComponent(jLabel23)
                .addComponent(jLabel21)
                .addComponent(txtNamaKeasramaan)
                .addComponent(jLabel22)
                .addComponent(cboxAsramaKeasramaan, 0, 400, Short.MAX_VALUE)
                .addComponent(txtUsernameKeasramaan)
                .addComponent(txtPasswordKeasramaan))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterKeasramaanLayout.createSequentialGroup()
            .addContainerGap(207, Short.MAX_VALUE)
            .addComponent(btnRegisterKeasramaan)
            .addGap(188, 188, 188))
    );
    pnlRegisterKeasramaanLayout.setVerticalGroup(
        pnlRegisterKeasramaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlRegisterKeasramaanLayout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addComponent(jLabel21)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNamaKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel22)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cboxAsramaKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel23)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtUsernameKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel24)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtPasswordKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
            .addComponent(btnRegisterKeasramaan)
            .addGap(40, 40, 40))
    );

    pnlRegister.add(pnlRegisterKeasramaan, "card4");

    javax.swing.GroupLayout pnlUtamaLayout = new javax.swing.GroupLayout(pnlUtama);
    pnlUtama.setLayout(pnlUtamaLayout);
    pnlUtamaLayout.setHorizontalGroup(
        pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlUtamaLayout.createSequentialGroup()
            .addComponent(pnlGbr, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(pnlUtamaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(370, 370, 370))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUtamaLayout.createSequentialGroup()
                    .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlUtamaLayout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUtamaLayout.createSequentialGroup()
                                .addComponent(btnMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlUtamaLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)))
                    .addGap(158, 158, 158)
                    .addComponent(jLabel7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    pnlUtamaLayout.setVerticalGroup(
        pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlUtamaLayout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel6)
                .addComponent(jLabel5))
            .addGap(11, 11, 11)
            .addComponent(jLabel3)
            .addGap(4, 4, 4)
            .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUtamaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addComponent(pnlRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addGap(12, 12, 12))
        .addComponent(pnlGbr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(pnlUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(pnlUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void cboxKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxKelasActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginView().setVisible(true);
    }/*
    }                    pnlUtama//GEN-LAST:event_btnSignInActionPerformed
*/
UserController uc = new UserController();
    private void btnRegisterMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterMhsActionPerformed
        // TODO add your handling code here:
        String rolemhs;
        String jurmhs;
        String kelasmhs;
        String asramamhs;
        String name;
        String usernamemhs;
        String pwmhs;
        
        rolemhs = btnMahasiswa.getText();
        jurmhs = (String) cboxProdi.getSelectedItem();
        kelasmhs = (String) cboxKelas.getSelectedItem();
        asramamhs = (String) cboxAsrama.getSelectedItem();
        name = txtName.getText();
        usernamemhs = txtUsername.getText();
        pwmhs = txtPassword.getText();

        User pengguna = new User(0, rolemhs, name, jurmhs, kelasmhs, asramamhs,usernamemhs, pwmhs, null);
        cekdataMhs();
        if(uc.insert(pengguna)){
            JOptionPane.showMessageDialog(this,"Registration Successfully","Pesan",JOptionPane.PLAIN_MESSAGE);
            this.dispose();
            new LoginView().setVisible(true);
        }

    }//GEN-LAST:event_btnRegisterMhsActionPerformed

    private void btnMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMahasiswaMouseClicked
   // TODO add your handling code here:
        pnlRegister.removeAll();
        pnlRegister.repaint();
        pnlRegister.revalidate();
        
        // add panel
        
        pnlRegister.add(pnlRegisterMhs);
        pnlRegister.repaint();
        pnlRegister.revalidate();
   
    }//GEN-LAST:event_btnMahasiswaMouseClicked

    private void btnDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDosenMouseClicked
        // TODO add your handling code here:
        pnlRegister.removeAll();
        pnlRegister.repaint();
        pnlRegister.revalidate();
        
        // add panel
        
        pnlRegister.add(pnlRegisterDosen);
        pnlRegister.repaint();
        pnlRegister.revalidate();
   
    }//GEN-LAST:event_btnDosenMouseClicked

    private void btnKeasramaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeasramaanMouseClicked
        pnlRegister.removeAll();
        pnlRegister.repaint();
        pnlRegister.revalidate();
        
        // add panel
        
        pnlRegister.add(pnlRegisterKeasramaan);
        pnlRegister.repaint();
        pnlRegister.revalidate();
    }//GEN-LAST:event_btnKeasramaanMouseClicked

    private void btnDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDosenActionPerformed

    private void txtUsernameDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameDosenActionPerformed

    private void btnRegisterKeasramaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterKeasramaanActionPerformed
        // TODO add your handling code here:
        String rolekeasramaan;
    //    String jurmhs;
    //    String kelasdosen;
        String asramakeasramaan;
        String namakeasramaan;
        String usernamekeasramaan;
        String pwkeasramaan;
        
        rolekeasramaan = btnKeasramaan.getText();
    //    jurmhs = (String) cboxProdi.getSelectedItem();
    //    kelasdosen = (String) cboxKelasDosen.getSelectedItem();
        asramakeasramaan = (String) cboxAsramaKeasramaan.getSelectedItem();
        namakeasramaan = txtNamaKeasramaan.getText();
        usernamekeasramaan = txtUsernameKeasramaan.getText();
        pwkeasramaan = txtPasswordKeasramaan.getText();

        User pengguna = new User(0, rolekeasramaan, namakeasramaan, null, null, asramakeasramaan,usernamekeasramaan, pwkeasramaan, null);
        cekDataKeasramaan();
        if(uc.insert(pengguna)){
            JOptionPane.showMessageDialog(this,"Registration Successfully");
            this.dispose();
            new LoginView().setVisible(true);
        }
    }//GEN-LAST:event_btnRegisterKeasramaanActionPerformed

    private void btnRegisterKeasramaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterKeasramaanMouseClicked
    
    }//GEN-LAST:event_btnRegisterKeasramaanMouseClicked

    private void btnRegisterDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDosenActionPerformed
    // TODO add your handling code here:
        String roledosen;
    //    String jurmhs;
        String kelasdosen;
    //    String asramamhs;
        String namadosen;
        String usernamedosen;
        String pwdosen;
        
        roledosen = btnDosen.getText();
    //    jurmhs = (String) cboxProdi.getSelectedItem();
        kelasdosen = (String) cboxKelasDosen.getSelectedItem();
    //    asramamhs = (String) cboxAsrama.getSelectedItem();
        namadosen = txtNamaDosen.getText();
        usernamedosen = txtUsernameDosen.getText();
        pwdosen = txtPasswordDosen.getText();

        User pengguna = new User(0, roledosen, namadosen, null, kelasdosen, null,usernamedosen, pwdosen, null);
        cekdataDosen();
        if(uc.insert(pengguna)){
            JOptionPane.showMessageDialog(this,"Registration Successfully");
            this.dispose();
            new LoginView().setVisible(true);
        }
    }//GEN-LAST:event_btnRegisterDosenActionPerformed

    private void txtUsernameKeasramaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameKeasramaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameKeasramaanActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDosen;
    private javax.swing.JButton btnKeasramaan;
    private javax.swing.JButton btnMahasiswa;
    private javax.swing.JButton btnRegisterDosen;
    private javax.swing.JButton btnRegisterKeasramaan;
    private javax.swing.JButton btnRegisterMhs;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JComboBox<String> cboxAsrama;
    private javax.swing.JComboBox<String> cboxAsramaKeasramaan;
    private javax.swing.JComboBox<String> cboxKelas;
    private javax.swing.JComboBox<String> cboxKelasDosen;
    private javax.swing.JComboBox<String> cboxProdi;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlGbr;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPanel pnlRegisterDosen;
    private javax.swing.JPanel pnlRegisterKeasramaan;
    private javax.swing.JPanel pnlRegisterMhs;
    private javax.swing.JPanel pnlUtama;
    private javax.swing.JTextField txtNamaDosen;
    private javax.swing.JTextField txtNamaKeasramaan;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordDosen;
    private javax.swing.JTextField txtPasswordKeasramaan;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameDosen;
    private javax.swing.JTextField txtUsernameKeasramaan;
    // End of variables declaration//GEN-END:variables
}
