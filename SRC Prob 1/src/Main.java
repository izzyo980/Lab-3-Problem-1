//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int getLargest(int arr[], int sz){
        int iterate1= 0;
        int iterate2= 0;
        int largest= 0;
        while (iterate1 < sz - 1){
            iterate2++;
            if (iterate2 == sz){
                iterate1++;
                iterate2 = iterate1;
                continue;
            }
            int product = arr [iterate1] * arr[iterate2];
            if (product > largest )
                largest = product;
        }
        return largest;
    }
}
//The Big O notation for Problem 1 would come out to be O(sz^2). The outer loop runs while iterate1 is less than sz-1 while the inner loop is directly affected by the first int value’s amount of increments.