/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author DUAN
 */
/*
class Solution4{
    public double findMedianSortedArrays(int[] A, int[] B) {
	    int m = A.length, n = B.length;
	    int l = (m + n + 1) / 2;
	    int r = (m + n + 2) / 2;
	    return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
	}

public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
	if (aStart > A.length - 1) return B[bStart + k - 1];            
	if (bStart > B.length - 1) return A[aStart + k - 1];                
	if (k == 1) return Math.min(A[aStart], B[bStart]);
	
	int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
	if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1]; 
	if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];        
	
	if (aMid < bMid) 
	    return getkth(A, aStart + k/2, B, bStart,k - k/2);// Check: aRight + bLeft 
	else 
	    return getkth(A, aStart,B, bStart + k/2, k - k/2);// Check: bRight + aLeft
 }
}
*/

/*class Solution4{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int x = nums1.length;
        int y = nums2.length;
        
        int low = 0;
        int high = x;
        while(low <= high)
        {
            int partitionX = (low + high)/2;
            int partitionY = (x+y+1)/2-partitionX;
            
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE:nums1[partitionX-1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE:nums2[partitionX];
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE:nums1[partitionY-1];
            int minRightY = (partitionY == x) ? Integer.MAX_VALUE:nums2[partitionY];
            if(maxLeftX <= minRightY && maxLeftY <= minRightX)
            {
                if((x + y)%2 == 0)
                {
                    return ((double)Math.max(maxLeftX, maxLeftY)+Math.min(minRightX, minRightY))/2;
                }else{
                    return (double)Math.max(maxLeftX,maxLeftY);
            }
            }else if(maxLeftX > minRightY){
                high = partitionX-1;
                    }else {
                    low = partitionX+1;
                    }
        }  
    //throw new IllegalArgumentException();
    return 0.0;
    }
}*/
class Solution4{
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}


public class P4 {
    public static void main(String[] args){
     Solution4 solution=new Solution4();
     int[] data1 = {1,5,7};
     int[] data2 = {2,4,8};
     System.out.println(solution.findMedianSortedArrays(data1,data2));
    }
}

