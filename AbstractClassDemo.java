public class AbstractClassDemo {
    public static void main(String[] args) {
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        System.out.println();
        lebah1.bergerak();
        System.out.println();
        lebah1.bernapas();
    }
}