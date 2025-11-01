public class KaryawanTetap extends Karyawan {
    public double tunjangan;

    public void hitungData(String n, double g, double t){
        nama = n;
        gajiPokok = g;
        tunjangan = t;
    }

    public double hitungTotalGaji(){
        return gajiPokok + tunjangan;
    }
}
