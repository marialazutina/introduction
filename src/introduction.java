import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class introduction {
    public static void main(String[] args){

        int [] nums = new int[]{1,2,3};
        System.out.println(rotateLeft3(nums));
    }
    public static int[] rotateLeft3(int[] nums) {


        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i+1];
            break;


        }
        return nums;
    }

//exercise 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter you annual income: ");
//        double income = scanner.nextDouble();
//        calculateTax(income);
//
//    }
//
//    public static void calculateTax(double income){
//        if(income <= 85528.00){
//            double taxSum = income * 0.18 - 556.02;
//            System.out.println(taxSum);
//        }else if(income > 85528.00){
//            double surplus = income - 85528.00;
//            double taxSum = 14839.02 + surplus * 0.32;
//            System.out.println(taxSum);
//        }
//    }
// exercise 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter temperature in Celsius: ");
//        float tempInCelsius = scanner.nextFloat();
//        System.out.println("Temperature in Farhenheit equals to: "+checkTemperature(tempInCelsius));
//
//    }
//
//    public static float checkTemperature(float tempInCelsius){
//        return (float) (1.8 * tempInCelsius + 32.0f);
//    }
// exercise 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your height in cm: ");
//        int personsHeight = scanner.nextInt();
//        System.out.println("Please enter your weight in kg: ");
//        float personsWeight = scanner.nextFloat();
//        checkPerson(personsHeight, personsWeight);
//
//    }
//
//    public static void checkPerson(int height, float weight){
//
//        if(height > 150 && weight < 180){
//            System.out.println("Fasten your seatbelt!");
//        }else{
//            System.out.println("I'm sorry you can't go!");
//        }
//    }
}







//   public static String getHiddenCard(String cardNumber, int starsCount) {
//        var visibleDigitsLine = cardNumber.substring(12);
//        return "*".repeat(starsCount) + visibleDigitsLine;
//    }
//
//    public static String getHiddenCard(String cardNumber) {
//        return App.getHiddenCard(cardNumber, 4);
//    }