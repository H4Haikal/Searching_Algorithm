
public class LinearSearchTest {
    public static void main(String[] args) {
        LinearSearch objLinearSearch = new LinearSearch();
        int[] intArray = {10, 50, 30, 70, 80, 20, 90, 40};
        int key = 30;
        
        
        int keyIndex = objLinearSearch.search(intArray, intArray.length, key);
        System.out.println("Key "+key+" is at intArray["+keyIndex+"]");
    }
}
