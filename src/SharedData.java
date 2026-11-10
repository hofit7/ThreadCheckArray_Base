import java.util.ArrayList;

/**
 * A class that represents shared data between different parts of a program.
 */
public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructs a new instance of SharedData with the given array and value of b.
     *
     * @param array an array of integers
     * @param b the value of b
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
        // Initialize the winArray using the size() of the ArrayList
        this.winArray = new boolean[array.size()];
    }

    /**
     * Returns the winArray.
     *
     * @return the winArray
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the winArray.
     *
     * @param winArray the new winArray to set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the array of integers.
     *
     * @return the array of integers
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Returns the value of b.
     *
     * @return the value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the flag.
     *
     * @return the flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag to the given value.
     *
     * @param flag the new value of flag to set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
