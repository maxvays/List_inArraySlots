/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    int[] list;
    int size;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        list = new int[10];
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return size;
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
        if(size == list.length) expand();
        list[size++] = value;
        return true;
    }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
        // System.out.println( "expand... (for debugging)");
        int[] doubledArray = new int[list.length * 2];
        for(int i = 0; i < size; i++){
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
}
