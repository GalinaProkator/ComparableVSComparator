import javax.swing.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String strUserNum = JOptionPane.showInputDialog("Please enter a number");
        int userNum = Integer.parseInt(strUserNum);
        while (userNum != -1) {
            numbers.add(userNum);

            strUserNum = JOptionPane.showInputDialog("Please enter a number");
            userNum = Integer.parseInt(strUserNum);
        }

        for (int num : numbers) {
            System.out.print(num +" ");
        }

        System.out.println(" ");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println(" ");

//    --------------------

        Set<Integer> numbersSet = new HashSet<>();
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rnd.nextInt(101);
            numbersSet.add(num);
        }
        System.out.println("Total amount of different numbers: "+ numbersSet.size());
    }
}