public class BinarySearchTest {
    public static void main(String[] args) {
        int[] intArray = {2,5,8,12,16,23,38,56,72,91};
        int key = 23;
        int low = 0;
        int high = intArray.length-1;
        BinarySearch objBinarySearch = new BinarySearch();
        
        System.out.println("Iterative Binary Search");
        int keyIndex = objBinarySearch.binarySearch(intArray, key);
        System.out.println("\nKey "+key+" is found at intArray["+keyIndex+"]");
        
        System.out.println("\n\nRecursive Binary Search");
        int keyIndex2 = objBinarySearch.recursiveBinarySearch(intArray, low, high, key);
        System.out.println("Key "+key+" is found at intArray["+keyIndex2+"]");
     
        
    }
}
