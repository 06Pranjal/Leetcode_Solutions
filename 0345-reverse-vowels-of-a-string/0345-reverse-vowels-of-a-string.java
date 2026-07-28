class Solution {
    public String reverseVowels(String s) {

        char[] arr=s.toCharArray();
        
        solve(arr,0,arr.length-1);
        
        return new String(arr);
    }

    private void solve(char[] arr,int left,int right){

        if(left>=right){
            return;
        }

        

        if(Character.toLowerCase(arr[left])!='a'&& Character.toLowerCase(arr[left])!='i'&&Character.toLowerCase(arr[left])!='e'&&Character.toLowerCase(arr[left])!='o'&&Character.toLowerCase(arr[left])!='u'){
            solve(arr,left+1,right);
            return;
        }
        
        if(Character.toLowerCase(arr[right])!='a'&&Character.toLowerCase(arr[right])!='i'&&Character.toLowerCase(arr[right])!='e'&&Character.toLowerCase(arr[right])!='o'&&Character.toLowerCase(arr[right])!='u'){
            solve(arr,left,right-1);
            return;
        }

        
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

        solve(arr,left+1,right-1);

    }
}