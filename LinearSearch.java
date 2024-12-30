//a.	Name : Haikal Danial Bin Mohd ROhaiza
//b.	Program: SMSK(SE
//c.	Course : CSF3104
//d.	Lab : MP2
//e.	Date : 30/12/2024

public class LinearSearch {
    //arr[] is the array
    //N is size
    //x is target element
    public int search(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                System.out.println("Step "+(i+1)+": Key found.");
                return i;
            }
            System.out.println("Step "+(i+1)+": Key not found.");
        }
        return -1;
    }

}
