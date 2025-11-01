public class DemoKaryawan {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap();
        kt.hitungData("Nadia", 3000000, 1000000);

        kt.hitungTotalGaji(); 
        kt.tampilInfo();     
        System.out.println();

        KaryawanFreelance kf = new KaryawanFreelance();
        kf.hitungData("Putra", 2000000, 5, 500000);
        
        kf.hitungTotalGaji();; 
        kf.tampilInfo();
    }
}

