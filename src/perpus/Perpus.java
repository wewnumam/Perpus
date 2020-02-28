package perpus;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Perpus extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    
    public boolean databaru;

    /**
     * Creates new form CRUD
     */
    
    private void GetPeminjaman(){ // menampilkan data dari database
        try {
            Connection conn =(Connection)perpus.koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from peminjaman");
            tabel_peminjaman.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    
    private void GetBuku(){ // menampilkan data dari database
        try {
            Connection conn =(Connection)perpus.koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from buku");
            tabel_buku.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    
    private void GetSiswa(){ // menampilkan data dari database
        try {
            Connection conn =(Connection)perpus.koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from siswa");
            tabel_siswa.setModel(DbUtils.resultSetToTableModel(sql));
        }
        catch (SQLException | HeadlessException e) {
        }
    }
    
    public Perpus() {
        initComponents();
        GetPeminjaman();
        GetBuku();
        GetSiswa();
        databaru=true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("pwpb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bukuQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Buku b");
        bukuList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bukuQuery.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_peminjaman = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        pinj_nis = new javax.swing.JTextField();
        pinj_nama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pinj_kode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pinj_judul = new javax.swing.JTextField();
        hapus_pinj = new javax.swing.JButton();
        ubah_pinj = new javax.swing.JButton();
        tambah_pinj = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pinj_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        tahun = new javax.swing.JTextField();
        pengarang = new javax.swing.JTextField();
        tambah_buku = new javax.swing.JButton();
        hapus_buku = new javax.swing.JButton();
        ubah_buku = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();
        label_id = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        label_nis = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        label_nama = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        label_jurusan = new javax.swing.JLabel();
        jurusan = new javax.swing.JTextField();
        label_alamat = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        label_jk = new javax.swing.JLabel();
        jk = new javax.swing.JTextField();
        tambah_siswa = new javax.swing.JButton();
        hapus_siswa = new javax.swing.JButton();
        ubah_siswa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel_peminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_peminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_peminjaman);

        jLabel9.setText("NIS");

        jLabel10.setText("Nama");

        jLabel11.setText("Kode");

        jLabel12.setText("Judul");

        hapus_pinj.setText("hapus");
        hapus_pinj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_pinjActionPerformed(evt);
            }
        });

        ubah_pinj.setText("ubah");
        ubah_pinj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_pinjActionPerformed(evt);
            }
        });

        tambah_pinj.setText("tambah");
        tambah_pinj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_pinjActionPerformed(evt);
            }
        });

        jLabel13.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(hapus_pinj))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ubah_pinj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tambah_pinj))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pinj_nama)
                                .addComponent(pinj_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pinj_judul)
                                .addComponent(pinj_nis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pinj_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pinj_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pinj_nis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pinj_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pinj_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pinj_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah_pinj)
                    .addComponent(hapus_pinj)
                    .addComponent(ubah_pinj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("peminjaman", jPanel1);

        tabel_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_bukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_buku);

        jLabel2.setText("Kode Buku");

        jLabel3.setText("Judul Buku");

        jLabel4.setText("Tahun Terbit");

        jLabel5.setText("Pengarang");

        tambah_buku.setText("tambah");
        tambah_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_bukuActionPerformed(evt);
            }
        });

        hapus_buku.setText("hapus");
        hapus_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_bukuActionPerformed(evt);
            }
        });

        ubah_buku.setText("ubah");
        ubah_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_bukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(hapus_buku))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addComponent(ubah_buku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambah_buku))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(judul)
                        .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah_buku)
                            .addComponent(hapus_buku)
                            .addComponent(ubah_buku))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("buku", jPanel2);

        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_siswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_siswa);

        label_id.setText("id");

        label_nis.setText("NIS");

        label_nama.setText("Nama");

        label_jurusan.setText("Jurusan");

        label_alamat.setText("Alamat");

        label_jk.setText("Jenis Kelamin");

        tambah_siswa.setText("tambah");
        tambah_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_siswaActionPerformed(evt);
            }
        });

        hapus_siswa.setText("hapus");
        hapus_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_siswaActionPerformed(evt);
            }
        });

        ubah_siswa.setText("ubah");
        ubah_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_siswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nis)
                    .addComponent(label_nama)
                    .addComponent(label_jurusan)
                    .addComponent(label_alamat)
                    .addComponent(label_jk)
                    .addComponent(label_id)
                    .addComponent(hapus_siswa))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(alamat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jurusan)
                        .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nis)
                        .addComponent(nama)
                        .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ubah_siswa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambah_siswa)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_id)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nis)
                            .addComponent(nis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nama)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_jurusan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_alamat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_jk)
                            .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah_siswa)
                            .addComponent(hapus_siswa)
                            .addComponent(ubah_siswa))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("siswa", jPanel3);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("APLIKASI PERPUSTAKAAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambah_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_bukuActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into buku values('"+kode.getText()+"','"+judul.getText()+"','"+tahun.getText()+"','"+pengarang.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetBuku();
    }//GEN-LAST:event_tambah_bukuActionPerformed

    private void hapus_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_bukuActionPerformed
        // TODO add your handling code here:
        try { // hapus data
            String sql ="delete from buku where kode='"+kode.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data akan dihapus?");
        } catch (SQLException | HeadlessException e) {}
        GetBuku();
    }//GEN-LAST:event_hapus_bukuActionPerformed

    private void ubah_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_bukuActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "update buku SET kode='"+kode.getText()+"',judul='"+judul.getText()+"',tahun='"+tahun.getText()+"',pengarang='"+pengarang.getText()+"' where kode='"+kode.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil diubah");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetBuku();
    }//GEN-LAST:event_ubah_bukuActionPerformed

    private void tambah_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_siswaActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into siswa values('"+id.getText()+"','"+nis.getText()+"','"+nama.getText()+"','"+jurusan.getText()+"','"+alamat.getText()+"','"+jk.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
         } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
         }
        GetSiswa();
    }//GEN-LAST:event_tambah_siswaActionPerformed

    private void hapus_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_siswaActionPerformed
        // TODO add your handling code here:
        try { // hapus data
            String sql ="delete from siswa where id='"+id.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data akan dihapus?");
            databaru=true;
            id.setText("");
            nis.setText("");
            nama.setText("");
            jurusan.setText("");
            alamat.setText("");
            jk.setText("");
        } catch (SQLException | HeadlessException e) {}
        GetSiswa();
    }//GEN-LAST:event_hapus_siswaActionPerformed

    private void ubah_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_siswaActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update siswa SET nis='"+nis.getText()+"',nama='"+nama.getText()+"',jurusan='"+jurusan.getText()+"',alamat='"+alamat.getText()+"',jk='"+jk.getText()+"' where nis='"+nis.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil diubah");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetSiswa();
    }//GEN-LAST:event_ubah_siswaActionPerformed

    private void hapus_pinjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_pinjActionPerformed
        // TODO add your handling code here:
        try { // hapus data
            String sql ="delete from peminjaman where id='"+pinj_id.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data akan dihapus?");
        } catch (SQLException | HeadlessException e) {}
        GetPeminjaman();
    }//GEN-LAST:event_hapus_pinjActionPerformed

    private void ubah_pinjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_pinjActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update peminjaman SET id='"+pinj_id.getText()+"',nis='"+pinj_nis.getText()+"',nama='"+pinj_nama.getText()+"',kode='"+pinj_kode.getText()+"',judul='"+pinj_judul.getText()+"' where id='"+pinj_id.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil diubah");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetPeminjaman();
    }//GEN-LAST:event_ubah_pinjActionPerformed

    private void tambah_pinjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_pinjActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into peminjaman values('"+pinj_id.getText()+"','"+pinj_nis.getText()+"','"+pinj_nama.getText()+"','"+pinj_kode.getText()+"','"+pinj_judul.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)perpus.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        GetPeminjaman();
    }//GEN-LAST:event_tambah_pinjActionPerformed

    private void tabel_peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_peminjamanMouseClicked
        // TODO add your handling code here:
        pinj_id.setText(tabel_peminjaman.getValueAt(tabel_peminjaman.getSelectedRow(), 0).toString());
        pinj_nis.setText(tabel_peminjaman.getValueAt(tabel_peminjaman.getSelectedRow(), 1).toString());
        pinj_nama.setText(tabel_peminjaman.getValueAt(tabel_peminjaman.getSelectedRow(), 2).toString());
        pinj_kode.setText(tabel_peminjaman.getValueAt(tabel_peminjaman.getSelectedRow(), 3).toString());
        pinj_judul.setText(tabel_peminjaman.getValueAt(tabel_peminjaman.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tabel_peminjamanMouseClicked

    private void tabel_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_bukuMouseClicked
        // TODO add your handling code here:
        kode.setText(tabel_buku.getValueAt(tabel_buku.getSelectedRow(), 0).toString());
        judul.setText(tabel_buku.getValueAt(tabel_buku.getSelectedRow(), 1).toString());
        tahun.setText(tabel_buku.getValueAt(tabel_buku.getSelectedRow(), 2).toString());
        pengarang.setText(tabel_buku.getValueAt(tabel_buku.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabel_bukuMouseClicked

    private void tabel_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_siswaMouseClicked
        // TODO add your handling code here:
        id.setText(tabel_siswa.getValueAt(tabel_siswa.getSelectedRow(), 0).toString());
        nis.setText(tabel_siswa.getValueAt(tabel_siswa.getSelectedRow(), 1).toString());
        nama.setText(tabel_siswa.getValueAt(tabel_siswa.getSelectedRow(), 2).toString());
        jurusan.setText(tabel_siswa.getValueAt(tabel_siswa.getSelectedRow(), 3).toString());
        alamat.setText(tabel_siswa.getValueAt(tabel_siswa.
                getSelectedRow(), 4).toString());
        jk.setText(tabel_siswa.getValueAt(tabel_siswa.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tabel_siswaMouseClicked

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
            java.util.logging.Logger.getLogger(Perpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perpus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private java.util.List<perpus.Buku> bukuList;
    private javax.persistence.Query bukuQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton hapus_buku;
    private javax.swing.JButton hapus_pinj;
    private javax.swing.JButton hapus_siswa;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jk;
    private javax.swing.JTextField judul;
    private javax.swing.JTextField jurusan;
    private javax.swing.JTextField kode;
    private javax.swing.JLabel label_alamat;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_jk;
    private javax.swing.JLabel label_jurusan;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_nis;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JTextField pengarang;
    private javax.swing.JTextField pinj_id;
    private javax.swing.JTextField pinj_judul;
    private javax.swing.JTextField pinj_kode;
    private javax.swing.JTextField pinj_nama;
    private javax.swing.JTextField pinj_nis;
    private javax.swing.JTable tabel_buku;
    private javax.swing.JTable tabel_peminjaman;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JTextField tahun;
    private javax.swing.JButton tambah_buku;
    private javax.swing.JButton tambah_pinj;
    private javax.swing.JButton tambah_siswa;
    private javax.swing.JButton ubah_buku;
    private javax.swing.JButton ubah_pinj;
    private javax.swing.JButton ubah_siswa;
    // End of variables declaration//GEN-END:variables
}