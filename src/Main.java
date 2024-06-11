public class Main {
    public static void main(String[] args) {

        // TASK 4.1

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }

        // TAKS 4.2

        int clientDeviceYear = 2015;

        if (clientDeviceYear <= 2015) {
            if (clientOS == 0) {
                System.out.println("link for old IOS is xxx");
            } else {
                System.out.println("Link for old Android is yyyy");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("IOS");
            } else {
                System.out.println("Android");
            }
        }

        // TASK 4.3

        int year = 2015;

        if (year % 4 == 0) {
            System.out.println(year + "visokosniy god");
        } else {
            System.out.println(year + " ne viskosniy");
        }

        // TASK5

        int month = 13;

        switch (month) {
            case 1: case 2: case 3:
                System.out.println("Winter");
                break;
            case 4: case 5: case 6:
                System.out.println("Spring");
                break;
            case 7: case 8: case 9:
                System.out.println("Summer");
                break;
            case 10: case 11: case 12:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such months");
        }
    }
}