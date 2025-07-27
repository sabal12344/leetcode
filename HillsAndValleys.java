
import java.util.Scanner;
public class HillsAndValleys {
     public static int countHillValley(int[] nums) {
        int final_index = nums.length - 1;
        int answer=0;
        int more_than_left=0, more_than_right=0;//2 for true, 5 for false
        
        for(int i =1; i<=final_index-1; i++){
           for(int j=i;j>=0;j--){//left side tracker
            if(nums[j]!= nums[i]){
                if(nums[j]<nums[i])
                more_than_left = 2;
                else
                more_than_left = 5;
                break;
            }
           }
           for(int k=i;k<=final_index;k++){//right side tracker
           if(nums[k]!=nums[i]){
            if(nums[k]<nums[i])
            more_than_right =2;
            else
            more_than_right = 5;
            break;
           }
           }

           if(nums[i]!=nums[i-1]){
             if((more_than_left==5 && more_than_right==5)||(more_than_left==2 && more_than_right==2)){
                answer++;
             }

           }
          

        
    }
    return answer;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of your array : ");
    int size = sc.nextInt();
    int []array = new int [size];
    System.out.println("Now enter those "+size+" numbers :\n");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("\n\n"+countHillValley(array)+" hills or valleys are seen in your array. Thanks you!");

}
    
}
