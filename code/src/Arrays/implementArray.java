package Arrays;

public class implementArray {
    private int[] array;
    private int count;
    public implementArray(int length) {
        array = new int[length];
    }

    public void add(int item){
        array[count++] = item;
    }
}
