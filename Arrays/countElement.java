package Practice;

public class countElement {
	public static void main(String args[]) {
	int arr[] = {3,5,7,3,6,3,2};
	int ele =3;
	int cnt = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==ele) {
			cnt++;
		}
	}
	System.out.println(cnt);
}
}
