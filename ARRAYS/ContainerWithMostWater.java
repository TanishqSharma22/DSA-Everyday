/*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49. */

package ARRAYS;
public class ContainerWithMostWater {
    public int waterArea(int[] height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;
        while(lp < rp){
            int wid = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int currWater = wid * ht;
            maxWater = Math.max(maxWater, currWater);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int[] hight = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater obj = new ContainerWithMostWater();
        System.out.println(obj.waterArea(hight));
    }
    
}
