package activities;

public class MulTable {
    public static void main(String[] args) {
        int [][] mTable = new int[10][10];
        for (int row=0; row<mTable.length; row++) {
            for (int col=0; col< mTable.length; col++) {
                mTable[row][col] = (row+1)*(col+1);
            }
        }

        for (int[] ints : mTable) {
            for (int col = 0; col < mTable.length; col++) {
                System.out.print(ints[col] + " ");
                if (ints[col] < 10)
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}
