import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chance = 3;
        int randomNum = random();


        System.out.println("Menebak angka dari 1 - 10");

        while (chance >= 1) {
            int inputNum = input(sc);

            if (inputNum < randomNum) {
                System.out.println("Terlalu rendah");
                chance--;


                if ( chance == 0 ) {
                    System.out.println("Anda kalah");
                } else {
                    System.out.println("Kesempatannmu tersisa " + chance);
                }


            } else if (inputNum > 10) {
                System.out.println("Angka yang berikan melewati batas");
                chance = 0;

            } else if (inputNum > randomNum) {
                System.out.println("Terlalu tinggi");
                chance--;


                if ( chance == 0 ) {
                    System.out.println("Anda kalah");
                } else {
                    System.out.println("Kesempatannmu tersisa " + chance);
                }

            } else {
                System.out.println("Anda benar");
                chance = 0;
            }

        }
    }

    public static int random() {
        return (int) Math.floor(Math.random() * 10) + 1 ;
    }

    public static int input(Scanner sc) {
        System.out.print("Masukkan angka : ");

        return sc.nextInt();
    }

}
