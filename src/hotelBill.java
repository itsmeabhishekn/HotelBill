import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Consumer;


class consumer{
    Scanner reader  = new Scanner(System.in);

    static int teaPrice = 10;
    static int coffeePrice = 15;
    static int snacksPrice = 10;
    int totalPrice = 0;

    consumer()
    {

        System.out.println("***ORDER MENU***\n" +
                "Enter Option:\n" +
                "1.Tea \n" +
                "2.Coffee \n" +
                "3.Snacks \n" +
                "4.Back");



        while (true){
            System.out.println("Enter the option");
            int selectedItem = reader.nextInt();
            switch (selectedItem){
                case 1:
                    System.out.println("Enter quantity of Tea:");
                    int teaQt = reader.nextInt();
                    totalPrice += teaPrice*teaQt;
                    break;
                case 2:
                    System.out.println("Enter quantity of Coffee:");
                    int coffeQt = reader.nextInt();
                    totalPrice += coffeePrice*coffeQt;
                    break;
                case 3:
                    System.out.println("Enter quantity of Snacks:");
                    int snacksQt = reader.nextInt();
                    totalPrice += snacksPrice*snacksQt;
                    break;
                case 4:
                    System.out.println("Total price ="+totalPrice);
                    return;

            }
        }

    }


    void generateBill(consumer c1)
    {
        System.out.println(c1.totalPrice);
    }

}
public class hotelBill {

    public static void main(String[] args) {

        ArrayList <hotelBill> h1 = new ArrayList<hotelBill>();



        while (true) {
            System.out.println("----MENU----\n" +
                    "Enter Option:\n" +
                    "1.Order Menu \n" +
                    "2.Generate Bill \n" +
                    "3.View All Transactions \n" +
                    "4.Exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    consumer c1 = new consumer();
                    h1.add(hotelBill c1);

                case 2:
                    c1.generateBill();
                case 3:
                case 4:

            }
        }
    }
}

