import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String user, password;
        while (count < 3) {
            System.out.println("nhap user");
            user = input.nextLine();
            System.out.println("nhap mat khau");
            password = input.nextLine();
            if (user.equals("admin") && password.equals("123456")) {
                showMenu();
                break;
            } else {
                count++;
                System.out.println("User hoac password khong dung vui long nhap lai.");
            }
        }
        if (count == 3) {
            System.out.println("nhap sai qua nhieu");
        }
    }

    public static void showMenu() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the drawIsoscelesTriangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                int width,height;
                System.out.println("nhap chieu cao");
                width = input.nextInt();
                System.out.println("nhap chieu rong");
                height =input.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int side;
                System.out.print("Nhập cạnh góc vuông 1: ");
                side = input.nextInt();
                for (int i = 0; i <= side ; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int height1 ,base;
                System.out.println("nhap chieu cao");
                height1 = input.nextInt();
                System.out.println("nhap day cua tam giac");
                base =input.nextInt();
                for (int i = 0; i < height1; i++) {
                    for (int j = 0; j < base - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 0:
                break;
        }
    }
}




