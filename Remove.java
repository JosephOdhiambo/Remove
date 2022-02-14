package array;

public class Remove {

    public static void main(String[] args) {
        int A[] = new int[10];
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        A[6] = 5;
        System.out.println("Before Deletion");
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 2; i < A.length; i++) {
            A[i - 1] = A[i];
        }

        System.out.println("After deletion");
        for (int x : A) {
            System.out.print(x + " ");
           
        }
        System.out.println();
    }
}
