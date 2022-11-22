import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Consumer;


class consumer{
    Scanner reader  = new Scanner(System.in);

    static int teaPrice = 10;
    static int coffeePrice = 15;
    static int snacksPrice = 10;
    int totalPrice = 0;

    int teaQt;
    int coffeQt;
    int snacksQt;

    String name;

    long phNo;

    consumer()
    {

        System.out.println("***ORDER MENU***\n" +
                "Enter Option:\n" +
                "1.Tea \n" +
                "2.Coffee \n" +
                "3.Snacks \n" +
                "4.Generate Bill ");



        while (true){
            System.out.println("Enter the option");
            int selectedItem = reader.nextInt();
            switch (selectedItem){
                case 1:
                    System.out.println("Enter quantity of Tea:");
                    teaQt = reader.nextInt();
                    totalPrice += teaPrice*teaQt;
                    break;
                case 2:
                    System.out.println("Enter quantity of Coffee:");
                    coffeQt = reader.nextInt();
                    totalPrice += coffeePrice*coffeQt;
                    break;
                case 3:
                    System.out.println("Enter quantity of Snacks:");
                    snacksQt = reader.nextInt();
                    totalPrice += snacksPrice*snacksQt;
                    break;
                case 4:
                    System.out.println("Total price ="+totalPrice);
                    return;

            }
        }

    }




}
public class hotelBill {

    public static void main(String[] args) {

        ArrayList <consumer> consumerArrayList = new ArrayList<consumer>();



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
                    consumerArrayList.add(c1);

                case 2:
                    Scanner reader = new Scanner(System.in);
                    System.out.println("Enter your name : ");
                    consumerArrayList.get(0).name = reader.next();
                    System.out.println("Enter your phone number ");
                    consumerArrayList.get(0).phNo = reader.nextLong();

                    System.out.println("----Bill----");
                    System.out.println("Name : "+ consumerArrayList.get(0).name);
                    System.out.println("Number : "+consumerArrayList.get(0).phNo);
                    System.out.println("------------------");
                    System.out.println("Tea * "+consumerArrayList.get(0).teaQt+" = "+consumer.teaPrice*consumerArrayList.get(0).teaQt);
                    System.out.println("Tea * "+consumerArrayList.get(0).coffeQt+" = "+consumer.coffeePrice*consumerArrayList.get(0).teaQt);
                    System.out.println("Tea * "+consumerArrayList.get(0).snacksQt+" = "+consumer.snacksPrice*consumerArrayList.get(0).teaQt);
                    System.out.println("---------------------");
                    System.out.println("Total Price = "+consumerArrayList.get(0).totalPrice);

                    //TODO
                    // idly    *   2==60rs
                    //poori     *   2==60rs
                    //Your total bill=120
                    //Thank you

                case 3:
                    System.out.println("/n/n"+consumerArrayList.get(0).name+" : "+consumerArrayList.get(0).totalPrice+"/n/n");
                case 4:
                    System.exit(0);

            }
        }
    }
}

