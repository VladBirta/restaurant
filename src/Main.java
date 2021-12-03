import javax.swing.JOptionPane;


public class Main{
    public static String FullName;
    public static int ContactDetails;
    public static String Address;
    public static double Price;

    //Menu Item Cost

    //food
    public static double Burger = 18.50;
    public static double Pasta = 20.00;
    public static double Pizza = 25.00;

    //drink
    public static double Water = 3.50;
    public static double Fanta = 6.50;
    public static double Lemonade = 10.00;

    //desert
    public static double Lava_cake = 6.70;
    public static double Pancakes = 6.50;
    public static double Icecream = 6.00;

    //sides
    public static double French_fries = 4.50;
    public static double Rice = 4.50;
    public static double Mashed_potatoes = 4.50;

    //Menu Items Names
    public static String Food;
    public static String Drinks;
    public static String Deserts;
    public static String Sides;

    public static void main (String[] args){
        FullName = JOptionPane.showInputDialog(null, "Please, enter your full name:");
        Address = JOptionPane.showInputDialog(null, "Please, enter your address:");
        ContactDetails = Integer.valueOf(JOptionPane.showInputDialog(null, "Please, enter your number:"));

        int FoodItems = Integer.valueOf(JOptionPane.showInputDialog(null, "Now, choose your food item below: " +
                                                                                                "\n 1) Burger" +
                                                                                                "\n 2) Pasta"+
                                                                                                "\n 3) Pizza"));

        int DrinkItems = Integer.valueOf(JOptionPane.showInputDialog(null, "Now, choose your drink item below: " +
                                                                                                "\n 1) Water" +
                                                                                                "\n 2) Fanta"+
                                                                                                "\n 3) Lemonade"));

        int DesertItems = Integer.valueOf(JOptionPane.showInputDialog(null, "Now, choose your desert item below: " +
                                                                                                "\n 1) Lava cake" +
                                                                                                "\n 2) Pancakes"+
                                                                                                "\n 3) Icecream"));

        int SideItems = Integer.valueOf(JOptionPane.showInputDialog(null, "Now, choose your sides items below: " +
                                                                                                "\n 1) French fries" +
                                                                                                "\n 2) Rice"+
                                                                                                "\n 3) Smashed potatoes"));

        switch (SideItems){
            case 1 :
                Price = Price + 18.50;
                Sides = "French fries";
                break;
            case 2 :
                Price = Price + 20.00;
                Sides = "Rice";
                break;
            case 3 :
                Price = Price + 25.00;
                Sides = "Smashed potatoes";
                break;
        }

        switch (DesertItems){
            case 1 :
                Price = Price + 18.50;
                Deserts = "Lava cake";
                break;
            case 2 :
                Price = Price + 20.00;
                Deserts = "Pancakes";
                break;
            case 3 :
                Price = Price + 25.00;
                Deserts = "Icecream";
                break;
        }

        switch (FoodItems){
            case 1 :
                Price = Price + 18.50;
                Food = "Burger";
                break;
            case 2 :
                Price = Price + 20.00;
                Food = "Pasta";
                break;
            case 3 :
                Price = Price + 25.00;
                Food = "Pizza";
                break;
        }

        switch (DrinkItems){
            case 1 :
                Price = Price + 3.50;
                Drinks = "Water";
                break;
            case 2 :
                Price = Price + 6.50;
                Drinks = "Fanta";
                break;
            case 3 :
                Price = Price + 10.00;
                Drinks = "Lemonade";
                break;
        }

        System.out.println("The Receipt for the order: " +
                "\n Your Food Choice: " + Food +
                "\n Your Drink Choice: " + Drinks +
                "\n Your Desert Choice: " + Deserts +
                "\n Price: " + Price);

        System.out.println(" By: " + FullName);
        System.out.println(" Address:" + Address);
        System.out.println(" Number:" + ContactDetails);


    }

}
