import java.util.Scanner;

public class Project {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] basket = new String[10];
    public static int totalCost = 0;
    public static int numOfOrders = 0;
    public static String[] burgers = {"Chicken hamburger - 590 ",
            "Beef hamburger - 790 ",
            "Chicken cheeseburger - 790 ",
            "Beef cheeseburger - 890 ",
            "Double chicken hamburger - 990 ",
            "Double chicken cheeseburger - 1090",
            "Double beef hamburger - 1090",
            "Double beef cheeseburger - 1190",
            "Mixed hamburger - 1090",
            "Mixed cheeseburger - 1190"};

    public static String[] hotDogs = {"Spicy hot dog - 590 ",
            "Hot dog - 590 "};
    public static String fries = "French fries - 390 ";

    public static String[] drinks = {
            "Coca-cola 0.5l - 250 ",
            "Fanta 0.5l - 250 ",
            "Sprite 0.5l - 250 ",
            "Fuse tea 0.5l - 250 ",
            "Bon aqua 0.5l - 250 ",
            "Raspberry compote 0.3l - 250 ",
            "Currant compote 0.3l - 250 ",
            "Piko pulpy 0.5l - 350 "
    };

    public static String[] sauces = {
            "Ketchup - 100 ",
            "Cheese sauce - 100 ",
            "Sauce BBQ - 100 ",
            "Spicy sauce - 50 ",
            "Mustard sauce - 100 "
    };

    public static String[] additives = {"Jalapeno - 100 ",
            "Cheese - 150 "};

    public static void printMenu() {
        System.out.println("0. Exit menu.");
        System.out.println("1. Burgers.");
        System.out.println("2. Hot dogs.");
        System.out.println("3. French fries");
        System.out.println("4. Drinks.");
        System.out.println("5. Sauces.");
        System.out.println("6. Additives.");
        System.out.println("7. Clear basket.");
        System.out.println("8. Check basket.");
    }

    public static void burgersMenu() {
        System.out.println("0. Exit menu.");
        System.out.println("1. " + burgers[0]);
        System.out.println("2. " + burgers[1]);
        System.out.println("3. " + burgers[2]);
        System.out.println("4. " + burgers[3]);
        System.out.println("5. " + burgers[4]);
        System.out.println("6. " + burgers[5]);
        System.out.println("7. " + burgers[6]);
        System.out.println("8. " + burgers[7]);
        System.out.println("9. " + burgers[8]);
        System.out.println("10. " + burgers[9]);
        System.out.print("Choose a burger: ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                basket[numOfOrders++] += burgers[0];
                totalCost += 590;
                break;
            case 2:
                basket[numOfOrders++] += burgers[1];
                totalCost += 790;
                break;
            case 3:
                basket[numOfOrders++] += burgers[2];
                totalCost += 790;
                break;
            case 4:
                basket[numOfOrders++] += burgers[3];
                totalCost += 890;
                break;
            case 5:
                basket[numOfOrders++] += burgers[4];
                totalCost += 990;
                break;
            case 6:
                basket[numOfOrders++] += burgers[5];
                totalCost += 1090;
                break;
            case 7:
                basket[numOfOrders++] += burgers[6];
                totalCost += 1090;
                break;
            case 8:
                basket[numOfOrders++] += burgers[7];
                totalCost += 1190;
                break;
            case 9:
                basket[numOfOrders++] += burgers[8];
                totalCost += 1090;
                break;
            case 10:
                basket[numOfOrders++] += burgers[9];
                totalCost += 1190;
                break;
        }
    }

    public static void hotDogsMenu() {
        System.out.println("0. Exit menu.");
        System.out.println("1. " + hotDogs[0]);
        System.out.println("2. " + hotDogs[1]);

        System.out.print("Choose a hot dog: ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                basket[numOfOrders++] += hotDogs[0];
                totalCost += 590;
                break;
            case 2:
                basket[numOfOrders++] += hotDogs[1];
                totalCost += 590;
                break;
        }
    }

    public static void frenchFries() {

        System.out.println("0. Exit menu.");
        System.out.println("1. " + fries);

        System.out.print("Choose french fries: ");
        int n = scanner.nextInt();
        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                basket[numOfOrders++] += burgers[0];
                totalCost += 390;
                break;
        }
    }

    public static void drinksMenu() {
        System.out.println("0. Exit menu.");
        System.out.println("1. " + drinks[0]);
        System.out.println("2. " + drinks[1]);
        System.out.println("3. " + drinks[2]);
        System.out.println("4. " + drinks[3]);
        System.out.println("5. " + drinks[4]);
        System.out.println("6. " + drinks[5]);
        System.out.println("7. " + drinks[6]);
        System.out.println("8. " + drinks[7]);

        System.out.print("Choose a drink: ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                basket[numOfOrders++] += drinks[0];
                totalCost += 250;
                break;
            case 2:
                basket[numOfOrders++] += drinks[1];
                totalCost += 250;
                break;
            case 3:
                basket[numOfOrders++] += drinks[2];
                totalCost += 250;
                break;
            case 4:
                basket[numOfOrders++] += drinks[3];
                totalCost += 250;
                break;
            case 5:
                basket[numOfOrders++] += drinks[4];
                totalCost += 250;
                break;
            case 6:
                basket[numOfOrders++] += drinks[5];
                totalCost += 250;
                break;
            case 7:
                basket[numOfOrders++] += drinks[6];
                totalCost += 250;
                break;
            case 8:
                basket[numOfOrders++] += drinks[7];
                totalCost += 350;
                break;
        }
    }

    public static void saucesMenu() {
        System.out.println("0. Exit menu.");
        System.out.println("1. " + sauces[0]);
        System.out.println("2. " + sauces[1]);
        System.out.println("3. " + sauces[2]);
        System.out.println("4. " + sauces[3]);
        System.out.println("5. " + sauces[4]);

        System.out.print("Choose a sauce: ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                basket[numOfOrders++] += sauces[0];
                totalCost += 100;
                break;
            case 2:
                basket[numOfOrders++] += sauces[1];
                totalCost += 100;
                break;
            case 3:
                basket[numOfOrders++] += sauces[2];
                totalCost += 100;
                break;
            case 4:
                basket[numOfOrders++] += sauces[3];
                totalCost += 50;
                break;
            case 5:
                basket[numOfOrders++] += sauces[4];
                totalCost += 100;
                break;
        }
    }

    public static void additivesMenu() {
        System.out.println("0. Exit menu.");
        System.out.println("1. " + additives[0]);
        System.out.println("2. " + additives[1]);
        System.out.print("Choose a burger: ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                basket[numOfOrders++] += additives[0];
                totalCost += 100;
                break;
            case 2:
                basket[numOfOrders++] += additives[1];
                totalCost += 150;
                break;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            basket[i] = "";
        }

        System.out.println("Hi there! \n" +
                "Welcome to the menu of \"Salam Bro\" " +
                "Fast Food Station.\n" +
                "Here you can see our menu below.");
        while (true) {
            printMenu();
            System.out.print("Choose one: ");
            int n = scanner.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    burgersMenu();
                    break;
                case 2:
                    hotDogsMenu();
                    break;
                case 3:
                    frenchFries();
                    break;
                case 4:
                    drinksMenu();
                    break;
                case 5:
                    saucesMenu();
                    break;
                case 6:
                    additivesMenu();
                    break;
                case 7:
                    for (int i = 0; i < basket.length; i++) {
                        basket[i] = "";
                        totalCost = 0;
                    }
                    break;
                case 8:
                    if (basket[0] == "") {
                        System.out.println("Basket is empty");
                        System.out.println("Total price: " + totalCost + " kzt\n");
                    } else {
                        System.out.println("Basket:");
                        for (int i = 0; i < basket.length; i++) {
                            if (basket[i] != null && basket[i] != "")
                                System.out.println(basket[i]);
                        }
                        System.out.println();
                        System.out.println("Total price: " + totalCost + " kzt\n");
                        break;
                    }
            }
        }
    }
}

