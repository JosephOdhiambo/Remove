package array;

public class Remove {

    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 9;
        A[1] = 6;
        A[2] = 10;
        A[3] = 12;
        A[4] = 7;
        A[5] = 5;
        System.out.println("Before Deletion");
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }

        System.out.println("After deletion--");
        for (int x : A) {
            System.out.print(x + " ");
           
        }
        System.out.println();
    }
}
