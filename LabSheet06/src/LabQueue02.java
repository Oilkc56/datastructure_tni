import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some message: ");
        String message = input.next();

        System.out.println();
        System.out.println("Check Palindrome by Deque = "
                + (checkByDeque(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Check Palindrome by Stack = "
                + (checkByStack(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));

    }

    public static boolean checkByDeque(String message) {
        Deque<Character> letters = new ArrayDeque<Character>();

        // write your code below here
        for (int i = 0 ; i < message.length(); i++){
            letters.offer(message.toLowerCase().charAt(i));
        }

        for (int i = 0 ; i < message.length()/2 ; i++){
            if (letters.peek() != letters.peekLast()){
                return false;
            }
            letters.poll();
            letters.pollLast();
        }
        return true;
    }

    public static boolean checkByStack(String message) {
        Queue<Character> queue = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();

        // write your code below here
        for (int i = 0 ; i < message.length(); i++){
            queue.offer(message.toLowerCase().charAt(i));
            stack.push(message.toLowerCase().charAt(i));
        }
        for (int i = 0 ; i < message.length()/2 ; i++){
            if (queue.peek() != stack.peek()){
                return false;
            }
            queue.poll();
            stack.pop();
        }
        return true;


    }

}