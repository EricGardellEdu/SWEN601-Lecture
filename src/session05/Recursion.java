package session;

public class Recursion {
    public static void main(String[] args) {
//        countUp(10);
        int [] test = new int[] {2, 10, 12, 9, 36, 28, 93, 45, 6};
        System.out.println(searchArr(test, 9, 0));
    }

    public static void countDown( int n ) {
        do {
            System.out.println(n);
            n --;
        } while (n >= 0 );
    }

    public static void countDownRec( int n ) {
        System.out.println(n);
        if (n > 0 ) {
            countDown(n - 1);
        }
    }

    public static void countUp(int n) {
        if ( n > 0)
            countUp(n - 1); // keep call countUp recursively until we reach zero
        System.out.println(n); // the first time this is reached will be inside the call for which n=0
    }

    public static boolean searchArr( int [] arr, int target, int index) {
        if (arr[index]==target)
            return true;
        else {
            if (index+1 == arr.length)
                return false;
            return searchArr(arr, target, index+1);
        }
    }
}
