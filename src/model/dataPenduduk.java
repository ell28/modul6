package model;

public class dataPenduduk {
    private String nik;
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private String golDarah;
    private String alamat;
    private String rtRw;
    private String kelDesa;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String foto;
    private String tandaTangan;
    private String berlakuHingga;
    private String kotaPembuatan;
    private String tanggalPembuatan;
    private String provinsiPembuatan = "Republik Harapan Bangsa";

    public String getAgama() {
        return agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public String getFoto() {
        return foto;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public String getKotaPembuatan() {
        return kotaPembuatan;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getProvinsiPembuatan() {
        return provinsiPembuatan;
    }

    public String getRtRw() {
        return rtRw;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public String getTandaTangan() {
        return tandaTangan;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    public void setRtRw(String rtRw) {
        this.rtRw = rtRw;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTandaTangan(String tandaTangan) {
        this.tandaTangan = tandaTangan;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }

    public void setProvinsiPembuatan(String provinsiPembuatan) {
        this.provinsiPembuatan = provinsiPembuatan;
    }
    public dataPenduduk() {

    }
    public dataPenduduk(String nik, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin, String golDarah, String alamat, String rtRw, String kelDesa, String kecamatan, String agama, String statusPerkawinan, String pekerjaan, String kewarganegaraan, String foto, String tandaTangan, String berlakuHingga, String kotaPembuatan, String tanggalPembuatan, String provinsiPembuatan) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.alamat = alamat;
        this.rtRw = rtRw;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.foto = foto;
        this.tandaTangan = tandaTangan;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatan = kotaPembuatan;
        this.tanggalPembuatan = tanggalPembuatan;
        this.provinsiPembuatan = provinsiPembuatan;
    }
}
