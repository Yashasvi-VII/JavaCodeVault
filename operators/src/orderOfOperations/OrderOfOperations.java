package orderOfOperations;

public class OrderOfOperations {
    public static void main(String[] args) {
        System.out.println(4-3*2);

        // In case of same operators, order is from left to right.
        System.out.println(9/3/3);

        System.out.println(9/(3/3));

        System.out.println(9/(3/3 +2));

    }
}
