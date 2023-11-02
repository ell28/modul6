package view;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.*;

import model.dataPenduduk;
public class outputAllKTP {
    public outputAllKTP(dataPenduduk ktp) {
        JFrame frame = new JFrame("Lihat KTP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(35, 2));
        frame.add(panel);

        // NIK
        JLabel nikLabel = new JLabel("NIK");
        JLabel nikValueLabel = new JLabel(ktp.getNik());

        // Nama
        JLabel namaLabel = new JLabel("Nama");
        JLabel namaValueLabel = new JLabel(ktp.getNama());

        // Tempat Lahir
        JLabel tempatLahirLabel = new JLabel("Tempat Lahir");
        JLabel tempatLahirValueLabel = new JLabel(ktp.getTempatLahir());

        // Tanggal Lahir
        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir");
        JLabel tanggalLahirValueLabel = new JLabel(ktp.getTanggalLahir());

        // Jenis Kelamin
        JLabel jenisKelaminLabel = new JLabel("Jenis Kelamin");
        JLabel jenisKelaminValueLabel = new JLabel(ktp.getJenisKelamin());

        // Golongan Darah
        JLabel golDarahLabel = new JLabel("Golongan Darah");
        JLabel golDarahValueLabel = new JLabel(ktp.getGolDarah());

        // Alamat
        JLabel alamatLabel = new JLabel("Alamat");
        JLabel alamatValueLabel = new JLabel(ktp.getAlamat());

        // RT/RW
        JLabel rtRwLabel = new JLabel("RT/RW");
        JLabel rtRwValueLabel = new JLabel(ktp.getRtRw());

        // Kel/Desa
        JLabel kelDesaLabel = new JLabel("Kel/Desa");
        JLabel kelDesaValueLabel = new JLabel(ktp.getKelDesa());

        // Kecamatan
        JLabel kecamatanLabel = new JLabel("Kecamatan");
        JLabel kecamatanValueLabel = new JLabel(ktp.getKecamatan());

        // Agama
        JLabel agamaLabel = new JLabel("Agama");
        JLabel agamaValueLabel = new JLabel(ktp.getAgama());

        // Status Perkawinan
        JLabel statusPerkawinanLabel = new JLabel("Status Perkawinan");
        JLabel statusPerkawinanValueLabel = new JLabel(ktp.getStatusPerkawinan());

        // Pekerjaan
        JLabel pekerjaanLabel = new JLabel("Pekerjaan");
        JLabel pekerjaanValueLabel = new JLabel(ktp.getPekerjaan());

        // Kewarganegaraan
        JLabel kewarganegaraanLabel = new JLabel("Kewarganegaraan");
        JLabel kewarganegaraanValueLabel = new JLabel(ktp.getKewarganegaraan());

        // Foto
        JLabel fotoLabel = new JLabel("Foto");
        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon(ktp.getFoto()).getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));

        // Tanda Tangan
        JLabel tandaTanganLabel = new JLabel("Tanda tangan");
        ImageIcon tandaTanganIcon = new ImageIcon(
                new ImageIcon(ktp.getTandaTangan()).getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));

        // Berlaku Hingga
        JLabel provinsiPembuatanLabel = new JLabel("Provinsi Pembuatan");
        JLabel provinsiPembuatanValueLabel = new JLabel(ktp.getProvinsiPembuatan());

        // Kota Pembuatan
        JLabel kotaPembuatanLabel = new JLabel("Kota Pembuatan");
        JLabel kotaPembuatanValueLabel = new JLabel(ktp.getKotaPembuatan());

        // Tanggal Pembuatan
        JLabel tanggalPembuatanLabel = new JLabel("Tanggal Pembuatan");
        JLabel tanggalPembuatanValueLabel = new JLabel(ktp.getTanggalPembuatan());

        // Provinsi Pembuatan
        JLabel provinsiPembuatJLabel = new JLabel("Provinsi Pembuatan");
        JLabel provinsiPembuatValueJLabel = new JLabel(ktp.getProvinsiPembuatan());

        panel.add(nikLabel);
        panel.add(nikValueLabel);
        panel.add(namaLabel);
        panel.add(namaValueLabel);
        panel.add(tempatLahirLabel);
        panel.add(tempatLahirValueLabel);
        panel.add(tanggalLahirLabel);
        panel.add(tanggalLahirValueLabel);
        panel.add(jenisKelaminLabel);
        panel.add(jenisKelaminValueLabel);
        panel.add(golDarahLabel);
        panel.add(golDarahValueLabel);
        panel.add(alamatLabel);
        panel.add(alamatValueLabel);
        panel.add(rtRwLabel);
        panel.add(rtRwValueLabel);
        panel.add(kelDesaLabel);
        panel.add(kelDesaValueLabel);
        panel.add(kecamatanLabel);
        panel.add(kecamatanValueLabel);
        panel.add(agamaLabel);
        panel.add(agamaValueLabel);
        panel.add(statusPerkawinanLabel);
        panel.add(statusPerkawinanValueLabel);
        panel.add(pekerjaanLabel);
        panel.add(pekerjaanValueLabel);
        panel.add(kewarganegaraanLabel);
        panel.add(kewarganegaraanValueLabel);
        panel.add(fotoLabel);
        panel.add(new JLabel(imageIcon));
        panel.add(tandaTanganLabel);
        panel.add(new JLabel(tandaTanganIcon));
        panel.add(kotaPembuatanLabel);
        panel.add(kotaPembuatanValueLabel);
        panel.add(tanggalPembuatanLabel);
        panel.add(tanggalPembuatanValueLabel);
        panel.add(provinsiPembuatJLabel);
        panel.add(provinsiPembuatValueJLabel);

        frame.setVisible(true);
    }
}
