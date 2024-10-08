public class App {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        /* 
        for (int num = 1; num <= 5; num++) {
            for (int counter = 1; counter <= 4; counter++) {
                System.out.print(num);
            }
            System.out.println();
        }
        */
    }

    public static void practice1() {
        for (int i = 1; i <= 5; i++) {
            for (int counter = 1; counter <= i; counter++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void practice2() {
        for (int i = 1; i <= 5; i++) {
            for (int dot = 1; dot <= (5-i); dot++) {
                System.out.print(".");
            }
            for (int counter = 1; counter <= i; counter++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void practice3() {
        for (int i = 1; i <= 5; i++) {
            for (int dot = 1; dot <= (5-i); dot++) {
                System.out.print(".");
            }
            System.out.print(i);

            for (int x = 5-i; x < 4 ; x++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}