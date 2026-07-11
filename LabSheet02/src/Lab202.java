import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        //เพิ่มเข้าArrayList
        for (int nums : initial_numbers){
            numbers.add(nums);
        }

        //รับค่าต่อท้าย
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput number you wanna add in Arraylist : ");
        numbers.add(scanner.nextInt());


        //รับต่อตามเลขท้ายนศ **9**
        System.out.print("\nInput number you wanna add in Arraylist : ");
        numbers.add(9,scanner.nextInt());


        //ลบเลขใน numbers ตำแหน่งตามเลขรองท้ายนศ **6**
        numbers.remove(6);


        //อัปเดตวันที่เรียน **10** เข้าไปใน numbers ในตำแหน่งเลขก่อนรองสุดท้ายนศ **1**
        numbers.set(1,10);


        //แสดงผลสุดท้าย
        System.out.println("\nFinal result\n" + numbers);

    }


}
