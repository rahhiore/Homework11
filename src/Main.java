import java.util.Scanner;

public class Main {
    int distance;
    int year;
    int OS;
    Scanner scanner = new Scanner(System.in);
    public void menu () {
        byte task = scanner.nextByte();
        switch (task) {
            case 0:
                task1();
                System.out.println();
                task2();
                System.out.println();
                task3();
                System.out.println();
                break;
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            default:
                scanner.close();
        }
    }
    public static void main(String[] args) {
        System.out.println("Choose a task, if U wanna chose all task, just put 0");
        Main main = new Main();
        main.menu();
    }
    public void task1() {
        System.out.println("Now U can put any year for check leap year");
        this.year = scanner.nextInt();
        isLeapYear(year);

    }
    public static void isLeapYear(int year) {
        if(year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public void task2() {
        System.out.println("For task 2, U can check suitable for your phone. " +
                "Put 0 or 1, where 0 is iOS and 1 is Android system.");
        this.OS = scanner.nextInt();
        System.out.println("Also, check how old your phone, just put year of your phone.");
        this.year = scanner.nextInt();
        while (OS > 1 || OS < 0) {
            System.out.println("You put wrong number, try again put 0 or 1");
            this.OS = scanner.nextInt();
        }
        while (year > 2023 || year < 0) {
            System.out.println("You put wrong year, try again");
            this.year = scanner.nextInt();
        }
        System.out.println(isSuitable(year) + " для " + chooseOS(OS));
    }
    public static String isSuitable(int year) {
        if (year == 2023) {
            return "Можно использовать обычную версию";
        } else {
            return "Необходимо скачать облегченную версию";
        }
    }
    public static String chooseOS(int OS) {
        if (OS == 0) {
            return "iOS";
        } else if (OS == 1) {
            return "Android";
        }
        return "Anything going wrong";
    }
    public void task3() {
        System.out.println("Thanks for using Our bank, could You tell to us how long you are, in km?");
        this.distance = scanner.nextInt();
        while (distance < 0) {
            System.out.println("Are You sure? Please, try again without minus");
            this.distance = scanner.nextInt();
        }
        checkDistance(distance);
    }
    public static void checkDistance(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (distance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (distance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка невозможна");
        }
    }
}