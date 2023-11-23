import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {

             int num = sc.nextInt();
            int newNum = 0, reminder, temp;
            temp = num;
            //Reverse the digit's of the number.
            while(temp != 0){
                  reminder = temp % 10;
                  newNum = newNum*10 + reminder;
                  temp = temp/10;
            
            //Check if reverse of all digit's of the number
            //is equal to the given number or not.
            if(newNum == num){
                  System.out.println(num +" is palindrome.");
            }else{
                  System.out.println(num +" is not palindrome.");
            }
      }   
    }
