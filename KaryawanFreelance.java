public class KaryawanFreelance extends Karyawan {
    public int jumlahProyek;
    public double upahPerProyek;

    public void hitungData(String n, double g, int jp, double up){
        nama = n;
        gajiPokok = g;
        jumlahProyek = jp;
        upahPerProyek = up;
    }

    public double hitungTotalGaji(){
        return gajiPokok + (jumlahProyek * upahPerProyek);
    }
}
