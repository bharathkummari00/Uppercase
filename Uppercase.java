import java.util.Scanner;
public class Uppercase {
    public static void main(String[] args){
        Scanner src = new Scanner (System.in);
        String input = src.nextLine();
        
        String upper = input.toUpperCase();
        System.out.println(upper);
        System.out.println(upper.length());
        System.out.println("Enter index value to replace :");
        int place = src.nextInt();
        System.out.println("Enter a character to replace : ");
        char newChar = src.next().charAt(0);
        StringBuilder sb = new StringBuilder(input);
        sb.setCharAt(place, newChar);
        System.out.println("Modified String : "+sb.toString());

        System.out.println("Enter the starting index : ");
        int start = src.nextInt();
        System.out.println("Enter the Ending index : ");
        int end = src.nextInt();
        if( start >= 0 && end < input.length()){
            String sub = input.substring(start, end);
            System.out.println("The Substring is : " + sub);
        }else{
            System.out.println("Please select the proper value of start and end for the proper extracting");
        }
        src.close();
    }
}
