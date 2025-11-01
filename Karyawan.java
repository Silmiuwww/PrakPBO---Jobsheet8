public abstract class Karyawan {
    public String nama;
    public double gajiPokok;

    public abstract double hitungTotalGaji();

    public void tampilInfo(){
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Total gaji    : Rp" + hitungTotalGaji());
    }
}
