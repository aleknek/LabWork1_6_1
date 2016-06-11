
public class Main {

    public static void main(String[] args) {

        int[] array = new int[15];

        for (int i = 2, index = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }
        System.out.print("Array of even numbers are: [");
        for (int element : array) {
            System.out.print(array[array.length - 1] == element ? element + "" : element + ", ");
        }
        System.out.println("]");
    }
}

