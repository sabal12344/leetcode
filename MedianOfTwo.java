/*
 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwo {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total_size = nums1.length + nums2.length;
        int [] merger = new int[total_size];
        int i,j;

        
            for(i=0;i<nums1.length;i++){
                merger[i]=nums1[i];

            }
            for(j=0,i=nums1.length;j<nums2.length;j++,i++){
                merger[i]=nums2[j];
            }
        
       

    for(i=0;i<merger.length-1;i++){//the merge of two sorted arrays may or may not be sorted
        for(j=i+1;j<merger.length;j++){
            if(merger[i]>merger[j]){
                int temp = merger[i];
                merger[i]=merger[j];
                merger[j]=temp;
            }
        }
    }
double median;
if(merger.length%2==1){
    
    median = merger[(merger.length+1)/2-1];
    
}
else{
    
    median = (merger[(merger.length/2)-1] + merger[(merger.length/2)])/2.0;
}
return median;



}
static void display(int n, int []a1){
    System.out.print("\na"+n+" : ");
    for(int i=0;i<a1.length;i++){
    System.out.print(a1[i] + " ");
  }


}

public static void main(String[] args) {

  int [] a1 ={4,7,9,10,11,13,99};
  
 
  display(1,a1);
  
  int [] a2 = {8,94};


  display(2,a2);

  int [] a3 ={1,1,1,1,22};
 
  display(3,a3);

  System.out.println("\n\nThe median of a1 and a2 combined is "+ findMedianSortedArrays(a1,a2));
  System.out.println("The median of a3 and a2 combined is "+ findMedianSortedArrays(a2,a3));
  System.out.println("The median of a1 and a3 combined is "+ findMedianSortedArrays(a1,a3));
  
    



}



}
