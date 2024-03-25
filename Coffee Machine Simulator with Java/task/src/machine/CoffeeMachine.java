package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public  int money = 550;
    public  int water = 400;
    public  int milk = 540;
    public  int beans = 120;
    public  int cups = 9;

    public  void remaining() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money\n" );
    }

    public  void menu() {
        Scanner scanner = new Scanner(System.in);
        int loopMenu = 0;

        while (loopMenu == 0) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = scanner.next();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    loopMenu = 1;
            }

        }
        scanner.close();

    }
    public  void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();

        switch (choice) {
            case "1":
                // espresso
                if (water < 250) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (beans < 16) {
                    System.out.println("Sorry, not enough beans!\n");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else {
                    water -= 250;
                    beans -= 16;
                    cups -= 1;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                break;
            case "2":
                // latte
                if (water < 350) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (beans < 20) {
                    System.out.println("Sorry, not enough beans!\n");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                break;
            case "3":
                // cappuccino
                if (water < 200) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (beans < 12) {
                    System.out.println("Sorry, not enough beans!\n");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                break;
            case "back":
            default:
                break;
        }
    }

    public  void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWrite how how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        water += addWater;

        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        milk += addMilk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();
        beans += addBeans;

        System.out.println("Write how many disposable cups you want to add:\n");
        int addCups = scanner.nextInt();
        cups += addCups;

    }

    public  void take() {
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }

    public static void main(String[] args) {
        CoffeeMachine machine1 = new CoffeeMachine();
        machine1.menu();
        
    }

}


