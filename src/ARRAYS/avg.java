package ARRAYS;

public class avg {
	
	public static float average(int [] arr) {
	    float avg;
	    int sum=0;
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		avg = (float)sum/n;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,4,5,6,32};
		System.out.println(average(arr));
	}
}
