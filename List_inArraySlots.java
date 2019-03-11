/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here

	private int[] list;
	private int numberOfElements;

	private static final int INITIAL_CAPACITY = 10;


    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
	list = new int[INITIAL_CAPACITY];
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return numberOfElements;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
    	String output = "[";
		for(int i : list) {
		    output += i + ", ";
		}
		output += "]";
		return output;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int value) {
        if(numberOfElements == list.length) expand();
        list[numberOfElements++] = value;
        return true;
    }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
        // System.out.println( "expand... (for debugging)");
        int[] doubledArray = new int[list.length * 2];
        for(int i = 0; i < numberOfElements; i++){
            doubledArray[i] = list[i];
        }
        list = doubledArray;
   // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during 
              // development, the programmer must verify that 
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     }


    public int get(int index) {
	return list[index];
    }

    public int set(int index, int newValue) {
	int[] newArray = new int[list.length + 1];
	int oldValue = list[index];
	for(int i = 0; i < numberOfElements; i++){
	    if (i == index) {
		newArray[i] = newValue;
	    }
	    else {
		newArray[i] = list[i];
	    }
	}
	list = newArray;
	return oldValue;
    }

    public int remove (int index) {
	int oldValue = list[index];
	int[] newArray = new int[list.length - 1];
	for(int i = 0; i < numberOfElements; i++) {
	    if (i < index) {
		newArray[i] = list[i];
	    }
	    else {
		newArray[i] = list[i+1];
	    }
	}
	list = newArray;
	numberOfElements -= 1;
	return oldValue;
    }

    

   
}
