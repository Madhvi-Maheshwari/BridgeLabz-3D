package Practice;

public class copyEle {
	public static void main(String args[]) {
		int arr [] = {2,3,5,7,9};
		int arr2[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
