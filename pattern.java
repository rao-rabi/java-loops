public class pattern {
    public static void main(String[] args) {
        // print the pattern of solid rectangle of stars
        // *****
        // *****
        // *****
        // *****
        System.out.println("The solid rectangle pattern is as follows: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // print the pattern of hollow rectangle of stars
        // *****
        // *   *
        // *   *
        // *****
        System.out.println("The solid rectangle hollow pattern is as follows: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // print the patttern of half pyramid
        // *
        // **
        // ***
        // ****
        System.out.println("The half pyramid pattern is as follows: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // print the reverse patttern of half pyramid
        // ****
        // ***
        // **
        // *

        System.out.println("The half reverse pyramid pattern is as follows: ");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // print the inverted patttern of half pyramid(180deg rotated)
        // *
        // **
        // ***
        // ****

        System.out.println("The half inverted pyramid pattern is as follows: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // print the patttern
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        System.out.println("The pattern is as follows: ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
