import java.util.Scanner;

public class storyTaller {
    //write a program to make a story taller in java
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Inputs
        System.out.println("Enter the lead character name:");
        String mcname = sc.nextLine();
        System.out.println("Enter the lead character's friend name:");
        String friname = sc.nextLine();
        System.out.println("Enter the pet name:");
        String petname = sc.nextLine();

        // Introduction
        System.out.println("Long ago, in the peaceful village of Eldoria, lived a young hero named " + mcname +
                ".\nOne morning, " + mcname + " and their loyal friend " + friname + ", along with their companion " + petname +
                ", discovered a glowing map under an old tree.\nThe map pointed to the legendary Crystal of Lumaria, a magical stone believed to grant great power.");

        // First Choice
        System.out.println("Choose: \n1 for The Whispering Forest \n2 for The Misty Mountains");
        int path = sc.nextInt();

        if (path == 1) {

            System.out.println("The Whispering Forest was dark but full of life. Strange voices echoed around " + mcname + ". Suddenly, a hooded figure appeared…");
            System.out.println("Choose between: \n1 for Talk to the hooded figure \n2 for Run away quietly");
            int choose = sc.nextInt();

            if (choose == 1) {

                System.out.println("The hooded figure reveals he is a guardian trying to protect the forest.\nHe warns that the crystal is cursed.\nHe gives a magical lantern.");
                System.out.println("Do you accept the lantern? \n1 for Yes \n2 for No");
                int accept = sc.nextInt();

                if (accept == 1) {
                    System.out.println("The lantern protects them, and they reach the cave safely.\nThey find the crystal, but it glows warmly, granting wisdom instead of power.\nGood Ending: The Wise Guardian");
                } else {
                    System.out.println("Without light, they wander in darkness and get stuck in an endless illusion.\nEnding: Lost in Darkness");
                }

            } else {

                System.out.println("They escape but fall into a hidden underground tunnel.\nThey meet a group of friendly dwarves.");
                System.out.println("Do you: \n1 for Trust dwarves \n2 for Try to escape the tunnel");
                int trust = sc.nextInt();

                if (trust == 1) {
                    System.out.println("The dwarves guide them to the crystal and help destroy its curse.\nGood Ending: The Crystal’s Purifier");
                } else {
                    System.out.println("The tunnel collapses and blocks the way forever.\nEnding: Trapped Underground");
                }
            }

        } else {

            // Misty Mountains
            System.out.println("The Misty Mountains were freezing and steep. " + mcname + ", " + friname + " and " + petname +
                    " struggled against the cold winds. Suddenly, they hear a loud roar!");

            System.out.println("Do you: \n1 for Follow the sound \n2 for Hide behind a rock");
            int roar = sc.nextInt();

            if (roar == 1) {
                System.out.println("You find an injured ice dragon. \nDo you: \n1 Help the dragon \n2 Leave it and continue climbing");
                int dragon = sc.nextInt();

                if (dragon == 1) {
                    System.out.println("The dragon becomes an ally and flies you to the crystal. \nBest Ending: Dragon’s Blessing");
                } else {
                    System.out.println("The dragon gets angry later and blocks your path. \nEnding: Frozen Fate");
                }

            } else {
                System.out.println("You discover a secret cave entrance. \nDo you: \n1 Enter the cave \n2 Set up a camp outside");
                int cave = sc.nextInt();

                if (cave == 1) {
                    System.out.println("Inside the cave you find ancient warnings and decide to return home safely. \nEnding: The Safe Return");
                } else {
                    System.out.println("A snowstorm buries your camp. \nEnding: Buried in Snow");
                }
            }
        }
    }
}
