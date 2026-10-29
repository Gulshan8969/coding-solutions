class Solution {
	public static boolean isPalindrome(int[] arr) {
		// code here
		// int[] newarr= new int[arr.length];
		// for(int i=0;i<arr.length;i++)
		// {
		//     newarr[i]=arr[arr.length-1-i];
		// }
		// for(int i=0;i<arr.length;i++)
		// {
		//     if(arr[i]!=newarr[i])
		//     {
		//     return false;
		//     }
		// }
		// return true;
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			if (arr[i] != arr[j])
				return false;
		}
		return true;
		
	}
}
