package first_year.new;

import java.util.Scanner;

public class App {

    // Global variables
    private static int[][] planeSeats = null;
    private static int[] pricePerRow = null;

    public static void main(String[] args) {
        System.out.println("Welcome to Flying Java!");
        initialiseRows();
        runMenu();
        Payment[] payments = new Payment[100]; 
    }

    public static void initialiseRows() {
        planeSeats = new int[4][]; // total rows - multidimensional array
        planeSeats[0] = new int[16]; // row 1 - initialised at 0 all available
        planeSeats[1] = new int[22]; // row 2 - initialised at 0 all available
        planeSeats[2] = new int[22]; // row 3 - initialised at 0 all available
        planeSeats[3] = new int[16]; // row 4 - initialised at 0 all available

        pricePerRow = new int[4];
        pricePerRow[0] = 50;
        pricePerRow[1] = 80;
        pricePerRow[2] = 80;
        pricePerRow[3] = 50;
    }

    public static void runMenu() {
        int option;
        boolean cont = true;

        while (cont) {
            option = getOption();
            switch (option) {
                case 0:
                    cont = false;
                    break;
                case 1:
                    buyTicket();
                    break;
                case 2:
                    showSeatingArea();
                    break;
                default:
                    System.out.println("Option not available. Please select a valid option.");
            }
        }
    }

    private static int getOption() {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        int option = -1;

        do {
            System.out.println();
            System.out.println("+---------------------------------------------+");
            System.out.println("|                 MAIN MENU                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("| 1) Buy a plane ticket                       |");
            System.out.println("| 2) Show seating area and available seats    |");
            System.out.println("| 0) Quit                                     |");
            System.out.println("+---------------------------------------------+");
            System.out.print("Please select an option: ");
            try {
                option = input.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("This option is not valid.");
                input.next(); // clear scanner buffer
            }
        } while (!valid);
        return option;
    }

    private static void buyTicket() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the email address: ");
        String email = input.nextLine();
        System.out.print("Enter row number: ");
        int row = input.nextInt() - 1;
        if ((row >= 0 )&& (row <= 3)){
            System.out.print("Enter seat number: ");
            int seat = input.nextInt() - 1;
    
            // Check if the seat is available or not
            if (planeSeats[row][seat] == 0) {
                planeSeats[row][seat] = 1;
                System.out.println("Purchase successful.");
                double PaymentAmount = 0.0;
                switch (row):
                    case 0:
                        PaymentAmount = 50;
                        break;
                    case 1:
                        PaymentAmount = 80;
                        break;
                    case 2:
                        PaymentAmount = 80;
                        break;
                    case 3:     
                        PaymentAmount = 50;
                        break;
                }
                showSeatingArea();
                Payment payment = new Payment(email, PaymentAmount);
                payment.printPaymentAmount();
                for (int i = 0; i < payments.length; i++) {
                    if (payments[i] == null) {
                        payments[i] = payment;
                        break;
                    } 
                }
            } else {
                System.out.println("This seat is already taken.");
            }
        }
    }

    private static void showSeatingArea() {
        int rows = planeSeats.length;
        char aisle = '|';

        System.out.println("=".repeat(76));
        System.out.println("                          PLANE SEATING MAP                         ");
        System.out.println("=".repeat(76));

        for (int row = 0; row < rows; row++) {
            System.out.print("Row " + (row + 1) + " (£" + pricePerRow[row] + ") ");
            int seatsPerRow = planeSeats[row].length;

            for (int seat = 0; seat < seatsPerRow; seat++) {
                if (seat == 9) {
                    System.out.print(" " + aisle + " ");
                }

                if (planeSeats[row][seat] == 0) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }

        System.out.println("=".repeat(76));
        System.out.println("LEGEND: [O] = Seat available, [X] = Seat not available, | = Aisle");
        System.out.println("=".repeat(76));
        System.out.println();
    }
    public static String searchPayments(String email){
        for (int i = 0; i<payments.length;i++){
            if (payments[i] != null && payments[i].getEmail().equals(emmail)){
                return payments[i].getEmail() 
            }
            else{
                System.out.println("No payment found for this email address.");
                return null;
            }
        }
    }
    public void saveToFile(){
        try {
            FileWriter writer = new FileWriter("payments.txt", true);
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] != null) {
                    writer.write(payments[i].getEmail() + "," + payments[i].getPaymentAmount() + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file.");
            e.printStackTrace();
        }
    }
}
