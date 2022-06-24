/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author sotel
 */
public class TestUserProfile {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is your name?");
    String userName = input.next();
    
    System.out.println("What is your favourite genre?");
    System.out.println("Comedy");
    System.out.println("Drama");
    System.out.println("Action");
    System.out.println("Mystery");
    String favGenre = input.next();
    
    UserProfile newUser = new UserProfile(userName, favGenre);
    
    System.out.println("User Profile is created!");
    }
}
