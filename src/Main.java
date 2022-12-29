import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String decision;
        do {
            Scanner keyInt = new Scanner(System.in);
            Scanner keyString = new Scanner(System.in);
            int age;
            String genre;
            System.out.println("Enter your age(int):");
            age = keyInt.nextInt();
            System.out.println("What is your favourite game genre?(String)");
            genre = keyString.nextLine();
            switch (genre) {
                case ("roguelike") -> {
                    if (age <= 6) {
                        System.out.println("Try playing (Soul Knight)");
                    } else if (age > 6 && age < 18) {
                        System.out.println("Try playing (Crypt of the Necrodancer)");
                    } else {
                        System.out.println("Try playing (The binding of Isaac)");
                    }
                }
                case ("rpg") -> {
                    if (age <= 6) {
                        System.out.println("Try playing (Legend of Zelda: Link's awakening)");
                    } else if (age > 6 && age < 18) {
                        System.out.println("Try playing (Fallout 4)");
                    } else {
                        System.out.println("Try playing (The Elder Scrolls V: Skyrim)");
                    }
                }
                case ("adventure") -> {
                    if (age <= 6) {
                        System.out.println("Try playing (New Super Mario Bros. Deluxe)");
                    } else if (age > 6 && age < 18) {
                        System.out.println("Portal 2");
                    } else {
                        System.out.println("Assasin's Creed Rogue");
                    }
                }
                case ("horror") -> {
                    if (age <= 6) {
                        System.out.println("Sorry, you are too young for this category");
                    } else if (age > 6 && age < 18) {
                        System.out.println("Try playing (Five Nights at Freddy's)");
                    } else {
                        System.out.println("Try playing (Until Dawn)");
                    }
                }
                case ("shooter") -> {
                    if (age <= 6) {
                        System.out.println("Try playing (Pixel Gun 3D)");
                    } else if (age > 6 && age < 18) {
                        System.out.println("Try playing (Overwatch 2)");
                    } else {
                        System.out.println("Try playing (Call of Duty: Black Ops 3)");
                    }
                }
                default -> System.out.println("Sorry, we don't have this genre");
            }
            System.out.println("Do you want to repeat the dialogue?\nType y if yes.\nType anything else to leave");
            decision = keyString.nextLine();
        }
        while(decision.toLowerCase().equals("y"));
        System.out.println("Thanks for visiting GameStop!");
    }
}