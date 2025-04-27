import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] bookInventory = new Book[]{
                new Book(1, "914-6-7334-2609-4", "Playworld by Adam Ross", false, " "),
                new Book(2, "820-6-7334-2609-4", "Mothers and Sons by Adam Haslett", false, " "),
                new Book(3, "701-6-7334-2609-4", "Vantage Point by Sarah Sligar", false, " "),
                new Book(4, "656-6-7334-2609-4", "Homeseeking by Karissa Chen", false, " "),
                new Book(5, "5514-6-7334-2609-4", "The Visitor by Maeve Brennan, introduction by Lynne Tillman", false, " "),
                new Book(6, "414-6-7334-2609-4", "The Motherload by Sarah Hoover", false, " "),
                new Book(7, "314-6-7334-2609-4", "Isola by Allegra Goodman", false, " "),
                new Book(8, "214-6-7334-2609-4", "The Echoes by Evie Wyld", false, " "),
                new Book(9, "114-6-7334-2609-4", "Show Don't Tell by Curtis Sittenfeld", false, " "),
                new Book(10, "014-6-7334-2609-4", "Gliff by Ali Smith", false, " "),
                new Book(11, "114-6-7334-2609-4", "Love in Exile by Shon Faye", false, " "),
                new Book(12, "214-6-7334-2609-4", "Lion by Sonya Wagler", false, " "),
                new Book(13, "314-6-7334-2609-4", "No fault by Haley Mlotek", false, " "),
                new Book(14, "414-6-7334-2609-4", "Twist by Colum McCann", false, " "),
                new Book(15, "514-6-7334-2609-4", "Perfection by Vincenzo Latronico", false, " "),
                new Book(16, "614-6-7334-2609-4", "Early Thirties by Josh Duboff", false, " "),
                new Book(17, "714-6-7334-2609-4", "Tilt by Emma Pattee", false, " "),
                new Book(18, "814-6-7334-2609-4", "Trauma Plot by Jamie Hood", false, " "),
                new Book(19, "914-6-7334-2609-4", "Stop Me If You've Heard This One by Kristen Arnett", false, " "),
                new Book(20, "103-6-7334-2609-4", "Sister Europe by Nell Zink", false, " ")};


        while (true) { 

            System.out.println("\n---------------------------------------------------------\n");

            System.out.println(" 1 - Show Available Books");

            System.out.println(" 2 - Show Checked Out Books");

            System.out.println(" 3 - Exit");

            System.out.print("Choose one of the above options: (1, 2, or 3) ");

            String userAnswer1 = scanner.nextLine().trim();

            if (userAnswer1.equals("1")) {

                System.out.println("\n---------------------------------------------------------");

                System.out.println("\nAvailable Books:\n");

                displayAvailableBooks(bookInventory);

                System.out.println("\n---------------------------------------------------------\n");

                System.out.println("CO - Check Out Book");

                System.out.println("RTHS - Return To Home Screen");

                System.out.print("Choose one of the above options: (CO or RTHS) ");

                String userAnswer2 = scanner.nextLine().trim();

                if (userAnswer2.equalsIgnoreCase("co")) {

                    System.out.println("\n---------------------------------------------------------\n");

                    System.out.print("Select a Book To Check Out (Enter Book ID Number): ");

                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter your Name: ");

                    String userName = scanner.nextLine().trim();

                    System.out.println("\n---------------------------------------------------------\n");

                    for (Book book : bookInventory) {

                        if (id == book.getId()) {

                            book.checkOut(userName);

                        }
                    }

                }


            } else if (userAnswer1.equals("2")) {

                System.out.println("\n---------------------------------------------------------");

                System.out.println("\nChecked Out Books:\n");

                displayCheckedOutBooks(bookInventory);

                System.out.println("\n---------------------------------------------------------\n");

                System.out.println("C - Check In a Book");

                System.out.println("X - Return To Home Screen");

                System.out.print("Choose one of the above options: (C or X) ");

                String userAnswer3 = scanner.nextLine().trim();

                if (userAnswer3.equalsIgnoreCase("c")) {

                    System.out.println("\n---------------------------------------------------------\n");

                    System.out.print("Enter ID Number for Book You Wish to Check In: ");

                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("\n---------------------------------------------------------\n");

                    for (Book book : bookInventory) {

                        if (id == book.getId()) {

                            book.checkIn();

                        }
                    }


                }

            } else {

                break;

            }


        }


    }


    public static void displayAvailableBooks(Book[] bookInventory){
        for (Book book : bookInventory) {

            if (!book.getIsCheckedOut()) {

                System.out.println("ID: " + book.getId() + " | " + "ISBN: " +
                        book.getIsbn() + " | " + "Title: " + book.getTitle());

            }


        }

    }

    public static void displayCheckedOutBooks(Book[] bookInventory) {

        for (Book book : bookInventory) {

            if (book.getIsCheckedOut()) {

                System.out.println("ID: " + book.getId() + " | " + "ISBN: " +
                        book.getIsbn() + " | " + "Title: " + book.getTitle() + " | " + "Checked Out To: " + book.getCheckedOutTo());

            }


        }
    }

}
