package main.Java.com.refresher.Encryptor;

import java.util.Scanner;


public class Encoder {

    public static void main(String[] args) {
        String secretText, encodedText;
        StringBuilder reverse_A = new StringBuilder();
        StringBuilder reverse_B = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        // Checks if length of secretText is greater than 3
        while (true) {
            System.out.print("Enter Text: ");
            secretText = scanner.nextLine();
            if (secretText.length() > 3)
                break;
            System.out.println("Text to be encoded should have more than three characters");
        }
        System.out.println("Currently encoding the texts .........");
        // Divides secretText into 2.
        String A = secretText.substring(0, secretText.length()/2);
        String B = secretText.substring(secretText.length() /2);
        // Reverses the string.
        A = reverse_A.append(A).reverse().toString().toLowerCase()
                .replaceAll("a", "1")
                .replaceAll("e", "5")
                .replaceAll("i", "3")
                .replaceAll("o", "2")
                .replaceAll("u","4");
        B = reverse_B.append(B).reverse().toString().toLowerCase()
                .replaceAll("a", "1")
                .replaceAll("e", "5")
                .replaceAll("i", "3")
                .replaceAll("o", "2")
                .replaceAll("u","4");
        encodedText = B+A;
        System.out.println("The encoded text is: " + encodedText);
    }
}
