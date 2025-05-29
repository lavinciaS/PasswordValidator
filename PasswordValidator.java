
/**
 * Description:Password Strength Checker: This program checks if a user's password meets specific security criteria, 
 * including length, uppercase/lowercase letters, special characters, and more.
 *
 * @author Lavincia S. 
 * @version May 29, 2025
 */

/**
 * Password Critera: 
 * 8 to 10 characters
 * one upper case letter
 * one lower case 
 * 2 special characters 
 * any numerials 
 */
import java.util.Scanner;
public class PasswordValidator{

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        boolean isValid = false;

        while(!isValid ){
            System.out.print("Please enter password: ");
            String password = stdin.nextLine();
            //Step 1: Check Length and print message 
            int length = password.length(); // gets how many characters are in the password
            if( length >=8 && length <=10){
                System.out.println("This password length is valid.");
            } else{
                System.out.println("Invalid Length!");
                System.out.println("Example password: Ab!@1234");
            }

            //Step 2: Loop through characters and counts types 
            int upperCount = 0;
            int lowerCount = 0;
            int specialCount = 0;
            int numberCount = 0;

            for(int i = 0; i < password.length(); i++){
                char c = password.charAt(i); //get one character at a time 

                if(Character.isUpperCase(c)){
                    upperCount++;
                }else if(Character.isLowerCase(c)){
                    lowerCount++;
                } else if( Character.isDigit(c)){
                    numberCount++;
                } else{ 
                    specialCount++; //everything else is treated as special
                }

            }
            //step 3: combine all checks 
            if(
            password.length() >= 8 && password.length() <= 10 && 
            upperCount >= 1 &&
            lowerCount >= 1 &&
            specialCount >= 2
            ){
                isValid = true;
            }else{
                System.out.println("Criteria: 8-10 characters, at least 1 uppercase, 1 lowercase, and 2 special characters.");

            }

            //Step 4: give feedback of missing characters needed
            if (length < 8 || length > 10) {
                System.out.println("- Password must be between 8 and 10 characters.");
            }
            if(upperCount == 0){
                System.out.println("Missing an uppercase letter.");
            }
            if (lowerCount == 0 ){
                System.out.println("Missing a lowercase letter.");
            }
            if (specialCount < 2 ){
                System.out.println("Not enough special characters.");
            }
        }

        //Finally close it 
        stdin.close();

    }
}
