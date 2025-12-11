/**
 * Optional / extra credit: BST helper methods.
 */
public class BSTExercises {

    /**
     * Builds a BST<Integer> by inserting the elements of the array in order.
     * See the assignment handout for the expected behavior.
     */
    public static BST<Integer> fromArray(int[] values) {
        // TODO: implement Task 11 (optional)
        if(values == null){
            throw new IllegalArgumentException();
        }
        BST<Integer> result = new BST<>(); //New BST<Integer>
        for(int element : values){
            result.insert(element); //inserts all the values in array into the BST
        }
        return result; //resulting tree
    }

}
