import java.util.Scanner;

public class MadLibExercise {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a MadLib exercise");
        System.out.println("Enter a name: ");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Give me your name: ");
        String yourName = userInput.nextLine();

        System.out.printf("This the story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
    }
}
