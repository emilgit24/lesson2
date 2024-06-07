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

        // TASK4
    }
}