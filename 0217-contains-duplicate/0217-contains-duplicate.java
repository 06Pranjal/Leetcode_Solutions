public class Solution {
    boolean containsDuplicate(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int x=arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]==x){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     Solution c=new Solution();
    //     if(c.containsDuplicate(new int[]{1,2,3,-1})==true)
    //     System.out.println("true");
    //     else
    //     System.out.println("false");
    // }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;

}
}
