
//Given an unsorted Array find maximum value of A[j] - A[i] where j>i..in O(n) time
//


public static int getMaXdifference (int a[]) {
    
    int maxDifference = 0;
    int min = a[0];
    
    for(int i=1;i<a.length;i++)
    {
        int current = a[i];

        if(current < min) {
            min = a[i];
            minpos = i;
        }
        else {
            int diff = current - min;
            if(diff > maxDifference)
            {
              maxDifference = diff;
              //store the position
              posi = minpos;
              posj = i;
            }
        }
    }
    return maxDifference;
}
