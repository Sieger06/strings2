import java.time.LocalDate;

public class Main {

    public static final int CURRENT_YEAR = LocalDate.now().getYear();

    public static void determineLeapYear(int year){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year + " год является високосным");
            }else {
                System.out.println(year + " год не является високосным");
            }
    }

    public static void printAppVersionInstallMessage(int clientOS, int clientDeviseYear){
        boolean unsupportedDevice = isUnsupportedDevice(clientDeviseYear);
        printAppVersionInstallResult(clientOS, unsupportedDevice);
    }

    private static String getClientOS(int clientOS){
        if (clientOS == 0){
            return "iOS";
        } else if (clientOS == 1){
            return "Android";
        }
        return "Your OS";
    }


    private static boolean isUnsupportedDevice(int clientDeviseYear){
        return clientDeviseYear < CURRENT_YEAR;
    }

    private static void printAppVersionInstallResult(int clientOS, boolean unsupportedDevice){
        if(unsupportedDevice){
            System.out.println("Установите облегчённую версию приложения для " + getClientOS(clientOS) + " по ссылке");
        }else {
            System.out.println("Установите версию приложения для " + getClientOS(clientOS) + " по ссылке");
        }
    }

    public static void deliveryDays (int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней " + deliveryDays);
        }
        if(deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDays++;
            System.out.println("Потребуется дней " + deliveryDays );
        }
        if(deliveryDistance > 60){
            deliveryDays++;
            System.out.println("Потребуется дней " + deliveryDays);
        }
    }

    public static void main(String[] args) {

        int year = 2018;
        determineLeapYear(year);

        printAppVersionInstallMessage(0, 2010);

        deliveryDays(60);
    }
}