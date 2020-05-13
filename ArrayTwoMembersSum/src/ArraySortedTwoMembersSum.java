import java.util.HashSet;

public class ArraySortedTwoMembersSum {
    public static void main(String[] args) {
        int array[] = {-100, -34, -28, -4, 0, 2, 14, 15, 43, 78, 92};
        int sum = 10;
        findPairs (array, sum);

    }

    private static void findPairs(int[] array, int sum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int temp = sum - array[i];
            if (hashSet.contains(temp)){
                System.out.println("pair is " + temp + " + " + array[i]);
            }
            hashSet.add(array[i]);
        }
    }
}
