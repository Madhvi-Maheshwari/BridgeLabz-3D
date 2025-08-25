package Practice;

public class mergeArrays {

	public static void main(String[] args) {
		int arr [] = {2,3,4,5};
		int arr1 [] = {6,7,8,9,10};
		int arrMerge[] = new int [arr.length + arr1.length];
		int len=0;
		while(len<arrMerge.length) {
			for(int i=0;i<arr.length;i++) {
				arrMerge[len] = arr[i];
				len++;
			}
			for(int i=0;i<arr1.length;i++) {
				arrMerge[len] = arr1[i];
				len++;
			}
		}
		
		for(int i=0;i<arrMerge.length;i++) {
			System.out.print(arrMerge[i]+" ");
		}
		

	}

}
