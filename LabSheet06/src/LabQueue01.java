import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue01 {

    static void main() {
        Queue<Integer> q = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < 5 ; i++){
            System.out.print("Enqueue: ");
            q.offer(scanner.nextInt());
        }
        System.out.println(q);

        while (!q.isEmpty()){
            System.out.println("Calling number: " + q.peek());
            System.out.println("Providing service number: " + q.poll());
            System.out.println();
        }
        System.out.println("Queue => " + q);







    }



}
