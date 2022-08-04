package main.Java.com.refresher.Encryptor;

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        String secretText;
        String decodedText;
        StringBuilder reverse_A = new StringBuilder();
        StringBuilder reverse_B = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        // Checks if length of secretText is greater than 3
        while (true) {
            System.out.print("Enter text to be decoded: ");
            secretText = scanner.nextLine();
            if (secretText.length() > 3)
                break;
            System.out.println("Text to be decoded should have more than three characters");
        }
        System.out.println("Currently decoding the texts .........");
        // Divides secretText into 2.
        String A = secretText.substring(0, secretText.length()/2);
        String B = secretText.substring(secretText.length() /2);
        // Reverses the string.
        A = reverse_A.append(A).reverse().toString().toLowerCase()
                .replaceAll("1", "a")
                .replaceAll("5", "e")
                .replaceAll("3", "i")
                .replaceAll("2", "o")
                .replaceAll("4","u");
        B = reverse_B.append(B).reverse().toString().toLowerCase()
                .replaceAll("1", "a")
                .replaceAll("5", "e")
                .replaceAll("3", "i")
                .replaceAll("2", "o")
                .replaceAll("4","u");
        decodedText = B+A;
        System.out.println("The encoded text is: " + decodedText);
    }
}
