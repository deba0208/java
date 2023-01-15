package Arrays;

import java.util.Arrays;

public class implementArray {
    private int[] array;
    private int count;
    public implementArray(int length) {
        array = new int[length];
    }

    public void add(int item){
        if(isFull())
            throw new IllegalArgumentException();
        array[count++] = item;
    }

    private boolean isFull(){
        return count == array.length;
    }

    public String toString(){

        var content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }

}
