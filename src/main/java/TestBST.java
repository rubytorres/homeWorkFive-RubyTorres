public class TestBST {
    public static void main(String[] args) {
        // Create a BST
        BST<String> tree = new BST<>();
        tree.insert("Green");
        tree.insert("Mabel");
        tree.insert("Teal");
        tree.insert("Blue");
        tree.insert("Jade");
        tree.insert("Purple"); // Insert Purple to the tree
        tree.insert("Danube");

        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        // Search for an element
        System.out.print("\nIs Purple in the tree? " +
                tree.search("Purple"));

        // Get a path from the root to Purple
        System.out.print("\nA path from the root to Purple is: ");
        java.util.ArrayList<BST.TreeNode<String>> path
                = tree.path("Purple");
        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();

        //--------------------------------------------
        System.out.println("\n---------Testing methods with intTree2---------");
        Integer[] numbers2 = {10, 3, 14, 20, 8, 9, 11};
        BST<Integer> intTree2 = new BST<>(numbers2);
        //Test for task 6
        //Height of tree should be 3
        System.out.println("Height of tree: " + intTree2.height());

        //Test for task 7
        //Nmmber of leaves should be 3
        System.out.println("Number of leaves in tree: " +  intTree2.countLeaves());

        //Test for task 8
        //Smallest element in tree should be 3
        System.out.println("Smallest element in tree is: " + intTree2.min());

        //Biggest element in tree should be 20
        System.out.println("Biggest element in tree is: " + intTree2.max());

        //Test for task 9
        //Should print [3, 8, 9, 10, 11, 14, 20]
        System.out.println("Tree sorted: " + intTree2.toSortedList());

        //Test for task 10
        //This tree should not be balanced
        System.out.println("Tree is balanced: " + intTree2.isBalanced());




    }
}