public class JavaBasic4Challange {
    public static void main(String[] args){
        konversiNilai(90);
    }

    static void konversiNilai(int nilai){
        System.out.print("Hasil : ");
        if (nilai >= 0 && nilai <= 20) {
            System.out.println("E");
        } else if (nilai >= 21 && nilai <= 40) {
            System.out.println("D");
        } else if (nilai >= 41 && nilai <= 60) {
            System.out.println("C");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("B");
        } else if (nilai >= 81 && nilai <= 100) {
            System.out.println("A");
        }else {
            System.out.println("nilai salah");
        }

    }

}