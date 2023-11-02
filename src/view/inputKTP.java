package view;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.*;

import model.dataPenduduk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class inputKTP {
    public inputKTP() {
        // Create frame
        JFrame frame = new JFrame("Form Data KTP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.setLocationRelativeTo(null);

        // Panel utama
        JPanel panel = new JPanel(new GridLayout(35, 2));


        // Label dan TextField NIK
        JLabel nikLabel = new JLabel("NIK:");
        JTextField nikTextField = new JTextField(20);

        // Label dan TextField Nama
        JLabel namaLabel = new JLabel("Nama:");
        JTextField namaTextField = new JTextField(20);

        // Label dan TextField Tempat Lahir
        JLabel tempatLahirLabel = new JLabel("Tempat Lahir:");
        JTextField tempatLahirTextField = new JTextField(20);

        // Label dan DatePicker Tanggal Lahir
        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir:");
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);


        // Label dan Radio Jenis Kelamin
        JLabel jenisKelaminLabel = new JLabel("Jenis Kelamin:");
        JRadioButton priaRadioButton = new JRadioButton("Pria");
        JRadioButton wanitaRadioButton = new JRadioButton("Wanita");
        ButtonGroup jenisKelaminGroup = new ButtonGroup();
        jenisKelaminGroup.add(priaRadioButton);
        jenisKelaminGroup.add(wanitaRadioButton);

        // Label dan RadioButton Golongan Darah
        JLabel golDarahLabel = new JLabel("Golongan Darah:");
        JRadioButton golA = new JRadioButton("A");
        JRadioButton golB = new JRadioButton("B");
        JRadioButton golO = new JRadioButton("O");
        JRadioButton golAB = new JRadioButton("AB");
        ButtonGroup golDarahGroup = new ButtonGroup();
        golDarahGroup.add(golA);
        golDarahGroup.add(golB);
        golDarahGroup.add(golO);
        golDarahGroup.add(golAB);

        // Label dan TextArea Alamat
        JLabel alamatLabel = new JLabel("Alamat:");
        JTextArea alamatTextArea = new JTextArea(4, 20);
        alamatTextArea.setLineWrap(true);

        // Label dan TextField RT/RW
        JLabel rtRwLabel = new JLabel("RT/RW:");
        JTextField rtRwTextField = new JTextField(10);

        // Label dan TextField Kel/Desa
        JLabel kelDesaLabel = new JLabel("Kel/Desa:");
        JTextField kelDesaTextField = new JTextField(20);

        // Label dan TextField Kecamatan
        JLabel kecamatanLabel = new JLabel("Kecamatan:");
        JTextField kecamatanTextField = new JTextField(20);

        // Label dan ComboBox untuk Agama
        JLabel agamaLabel = new JLabel("Agama:");
        String[] agama = {"Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu"};
        JComboBox agamaComboBox = new JComboBox(agama);

        // Label dan ComboBox Status Perkawinan
        JLabel statusPerkawinanLabel = new JLabel("Status Perkawinan:");
        String[] statusPerkawinan = {"Belum Menikah", "Menikah", "Janda/Duda"};
        JComboBox statusPerkawinanComboBox = new JComboBox(statusPerkawinan);

        // Label dan TextField Pekerjaan
        JLabel pekerjaanLabel = new JLabel("Pekerjaan:");
        JCheckBox karyawanCheckBox = new JCheckBox("Karyawan Swasta");
        JCheckBox pnsCheckBox = new JCheckBox("PNS");
        JCheckBox wiraswastaCheckBox = new JCheckBox("Wiraswasta");
        JCheckBox akademisiCheckBox = new JCheckBox("Akademisi");
        JCheckBox pengangguranCheckBox = new JCheckBox("Pengangguran");


        //Untuk yang pengangguran
        pengangguranCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pengangguranCheckBox.isSelected()) {
                    karyawanCheckBox.setEnabled(false);
                    pnsCheckBox.setEnabled(false);
                    wiraswastaCheckBox.setEnabled(false);
                    akademisiCheckBox.setEnabled(false);
                } else {
                    karyawanCheckBox.setEnabled(true);
                    pnsCheckBox.setEnabled(true);
                    wiraswastaCheckBox.setEnabled(true);
                    akademisiCheckBox.setEnabled(true);
                }
            }
        });

        //WNI
        JLabel kewarganegaraanLabel = new JLabel("Kewarganegaraan:");
        JRadioButton wniRadioButton = new JRadioButton("WNI");
        JRadioButton wnaRadioButton = new JRadioButton("WNA");
        JTextField wnaTextField = new JTextField(15);
        wnaTextField.setVisible(false);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(wniRadioButton);
        buttonGroup.add(wnaRadioButton);

        //WNA
        wnaRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (wnaRadioButton.isSelected()) {
                    wnaTextField.setVisible(true);
                } else {
                    wnaTextField.setVisible(false);
                }
            }
        });

        //Foto
        JLabel fotoLabel = new JLabel("Foto:");
        JButton fotoButton = new JButton("Pilih Foto");
        // File fotoKTPFile = null;
        JLabel labelDisplayFoto = new JLabel();
        fotoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    labelDisplayFoto.setText(fileChooser.getSelectedFile().getAbsolutePath());
                }else {
                    JOptionPane.showMessageDialog(frame, "Pemilihan file dibatalkan.");
                }
            }
        });
        if(labelDisplayFoto != null){
            labelDisplayFoto.setIcon(new ImageIcon(
                    new ImageIcon(labelDisplayFoto.getText())
                            .getImage()
                            .getScaledInstance(300, 150,java.awt.Image.SCALE_SMOOTH)
            ));
        }

        //Tanda Tangan
        JLabel tandaTanganLabel = new JLabel("Tanda Tangan:");
        JButton tandaTanganButton = new JButton("Pilih Tanda Tangan");
        JLabel labelDisplayTandaTangan = new JLabel();
        tandaTanganButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    labelDisplayTandaTangan.setText(fileChooser.getSelectedFile().getAbsolutePath());

                }else {
                    JOptionPane.showMessageDialog(frame, "Pemilihan file dibatalkan.");
                }
            }
        });
        if(labelDisplayTandaTangan != null){
            labelDisplayTandaTangan.setIcon(new ImageIcon(
                    new ImageIcon(labelDisplayTandaTangan.getText())
                            .getImage()
                            .getScaledInstance(300, 150,java.awt.Image.SCALE_SMOOTH)
            ));
        }

        //Berlaku Hingga
        JLabel berlakuHinggaLabel = new JLabel("Berlaku Hingga:");
        JTextField berlakuHinggaTextField = new JTextField(20);

        //Kota pembuatan
        JLabel kotaPembuatanLabel = new JLabel("Kota Pembuatan:");
        JTextField kotaPembuatanTextField = new JTextField(20);

        //Tanggal Pembuatan KTP
        JLabel tanggalPembuatanLabel = new JLabel("Tanggal Pembuatan KTP:");
        Date tanggalSaatIni = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalDiformat = sdf.format(tanggalSaatIni);
        JLabel tanggalPembuatanTextField = new JLabel(tanggalDiformat);

        //Provinsi Pembuatan KTP
        JLabel provinsiPembuatanLabel = new JLabel("Provinsi Pembuatan KTP:");
        JTextField provinsiPembuatanTextField = new JTextField("Republik Harapan Bangsa");

        // Simpan
        JButton simpanButton = new JButton("Simpan");
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nik = nikTextField.getText();
                String nama = namaTextField.getText();
                String tempatLahir = tempatLahirTextField.getText();
                String tanggalLahir = datePicker.getJFormattedTextField().getText();
                String jenisKelamin = priaRadioButton.isSelected() ? "Pria" : "Wanita";
                String golDarah = golA.isSelected() ? "A" : golB.isSelected() ? "B" : golO.isSelected() ? "O" : "AB";
                String alamat = alamatTextArea.getText();
                String rtRw = rtRwTextField.getText();
                String kelDesa = kelDesaTextField.getText();
                String kecamatan = kecamatanTextField.getText();
                String agama = agamaComboBox.getSelectedItem().toString();
                String statusPerkawinan = statusPerkawinanComboBox.getSelectedItem().toString();
                String pekerjaan = karyawanCheckBox.isSelected() ? "Karyawan Swasta" : pnsCheckBox.isSelected() ? "PNS" : wiraswastaCheckBox.isSelected() ? "Wiraswasta" : akademisiCheckBox.isSelected() ? "Akademisi" : "Pengangguran";
                String kewarganegaraan = wniRadioButton.isSelected() ? "WNI" : "WNA";
                String foto = labelDisplayFoto.getText();
                String tandaTangan = labelDisplayTandaTangan.getText();
                String berlakuHingga = berlakuHinggaTextField.getText();
                String kotaPembuatan = kotaPembuatanTextField.getText();
                String tanggalPembuatan = tanggalPembuatanTextField.getText();
                String provinsiPembuatan = provinsiPembuatanTextField.getText();

                if (nik.isEmpty() || nama.isEmpty() || tempatLahir.isEmpty() || tanggalLahir.isEmpty() || jenisKelamin.isEmpty() || golDarah.isEmpty() || alamat.isEmpty() || rtRw.isEmpty() || kelDesa.isEmpty() || kecamatan.isEmpty() || agama.isEmpty() || statusPerkawinan.isEmpty() || pekerjaan.isEmpty() || kewarganegaraan.isEmpty() || foto.isEmpty() || tandaTangan.isEmpty() || berlakuHingga.isEmpty() || kotaPembuatan.isEmpty() || tanggalPembuatan.isEmpty() || provinsiPembuatan.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Ada data yang kosong. Mohon isi semua data.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    new inputKTP();
                } else {
                    dataPenduduk hasil = new dataPenduduk(nik, nama, tempatLahir, tanggalLahir, jenisKelamin, golDarah, alamat, rtRw, kelDesa, kecamatan, agama, statusPerkawinan, pekerjaan, kewarganegaraan, foto, tandaTangan, berlakuHingga, kotaPembuatan, tanggalPembuatan, provinsiPembuatan);
                    new outputAllKTP(hasil);
                }
                frame.dispose();
            }
        });



        // add komponen ke panel
        panel.add(nikLabel);
        panel.add(nikTextField);
        panel.add(namaLabel);
        panel.add(namaTextField);
        panel.add(tempatLahirLabel);
        panel.add(tempatLahirTextField);
        panel.add(tanggalLahirLabel);
        panel.add(datePicker);
        panel.add(jenisKelaminLabel);
        panel.add(priaRadioButton);
        panel.add(new JLabel(""));
        panel.add(wanitaRadioButton);
        panel.add(golDarahLabel);
        panel.add(golA);
        panel.add(new JLabel(""));
        panel.add(golB);
        panel.add(new JLabel(""));
        panel.add(golO);
        panel.add(new JLabel(""));
        panel.add(golAB);
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(alamatLabel);
        panel.add(alamatTextArea);
        panel.add(rtRwLabel);
        panel.add(rtRwTextField);
        panel.add(kelDesaLabel);
        panel.add(kelDesaTextField);
        panel.add(kecamatanLabel);
        panel.add(kecamatanTextField);
        panel.add(agamaLabel);
        panel.add(agamaComboBox);
        panel.add(statusPerkawinanLabel);
        panel.add(statusPerkawinanComboBox);
        panel.add(pekerjaanLabel);
        panel.add(new JLabel(""));
        panel.add(karyawanCheckBox);
        panel.add(pnsCheckBox);
        panel.add(wiraswastaCheckBox);
        panel.add(akademisiCheckBox);
        panel.add(pengangguranCheckBox);
        panel.add(new JLabel(""));
        panel.add(kewarganegaraanLabel);
        panel.add(wniRadioButton);
        panel.add(new JLabel(""));
        panel.add(wnaRadioButton);
        panel.add(new JLabel(""));
        panel.add(wnaTextField);
        panel.add(fotoLabel);
        panel.add(fotoButton);
        panel.add(new JLabel(""));
        panel.add(labelDisplayFoto);
        panel.add(tandaTanganLabel);
        panel.add(tandaTanganButton);
        panel.add(new JLabel(""));
        panel.add(labelDisplayTandaTangan);
        panel.add(berlakuHinggaLabel);
        panel.add(berlakuHinggaTextField);
        panel.add(kotaPembuatanLabel);
        panel.add(kotaPembuatanTextField);
        panel.add(tanggalPembuatanLabel);
        panel.add(tanggalPembuatanTextField);
        panel.add(provinsiPembuatanLabel);
        panel.add(provinsiPembuatanTextField);





        // add tombol simpan ke dalam panel
        panel.add(simpanButton);

        // add panel dalam frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
