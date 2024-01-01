import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chance = 3;
        int randomNum = random();

        System.out.println("======================================================");
        System.out.println("Guess The Number");
        System.out.println("Menebak angka dari 1 - 10");
        System.out.println("======================================================");

        while (chance >= 1) {
            int inputNum = input(sc);

            if (inputNum > 10 || inputNum == 0) {
                System.out.println("alert: Anda kalah");
                System.out.println("alert: Angka yang berikan melewati batas!");
                chance = 0;

            } else if (inputNum < randomNum) {
                System.out.println("alert: Angka yang anda berikan terlalu rendah!");
                chance--;


                if ( chance == 0 ) {
                    System.out.println("alert: Anda kalah");
                } else {
                    System.out.println("alert: Kesempatannmu tersisa " + chance);
                    System.out.println("======================================================");
                }


            } else if (inputNum > randomNum) {
                System.out.println("alert: Angka yang anda berikan terlalu tinggi!");
                chance--;


                if ( chance == 0 ) {
                    System.out.println("alert: Anda kalah!");
                } else {
                    System.out.println("alert: Kesempatannmu tersisa " + chance);
                    System.out.println("======================================================");
                }

            } else {
                System.out.println("Selamat anda menang! Angkanya adalah " + randomNum);
                chance = 0;
            }

        }

        sc.close();
    }

    public static int random() {
        return (int) Math.floor(Math.random() * 10) + 1 ;
    }

    public static int input(Scanner sc) {
        System.out.print("Masukkan angka : ");

        return sc.nextInt();
    }

}
