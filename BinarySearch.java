
public class BinarySearch {

    public int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1; // 9

        while (low <= high) {
            System.out.println("Searching in range [" + low + ", " + high + "]");
            int mid = low + (high - low) / 2;
            System.out.println("Middle index: " + mid + ", Middle value: " + arr[mid]);

            if (arr[mid] == key) {
                System.out.println(key + " found at index " + mid);
                return mid;
            } else if (arr[mid] > key) {
                System.out.println(key + " is smaller than " + arr[mid] + ", searching in the left subarray.");
                high = mid - 1; // Correctly updating high
            } else {

                System.out.println(key+" is larger than " + arr[mid] + ", searching in the right subarray.");
                low = mid + 1; // Correctly updating low
            }
            System.out.println();
        }
        return -1;
    }

    public int recursiveBinarySearch(int arr[], int l, int r, int x) {
        System.out.println("Searching in range [" + l + ", " + r + "]");

        if (r >= l) {
            int mid = l + (r - l) / 2;
            System.out.println("Middle index: " + mid + ", Middle value: " + arr[mid]);

            // If the element is present at the middle itself
            if (arr[mid] == x) {
                System.out.println(x + " found at index " + mid);
                System.out.println();
                return mid;
            }

            // If the element is smaller than mid, search in the left subarray
            if (arr[mid] > x) {
                System.out.println(x + " is smaller than " + arr[mid] + ", searching in the left subarray.");
                System.out.println();
                return recursiveBinarySearch(arr, l, mid - 1, x);
            }

            // Otherwise, search in the right subarray
            System.out.println(x + " is larger than " + arr[mid] + ", searching in the right subarray.");
            System.out.println();
            return recursiveBinarySearch(arr, mid + 1, r, x);

        }

        // We reach here when the element is not present in the array
        System.out.println("Element not found in the array.");
        return -1;
    }

}
