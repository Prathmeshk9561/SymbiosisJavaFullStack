class overload{
	public void add(int []arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] += arr[i]+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
	public void add(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = arr1[i]+ arr2[i];
		}
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
public class fun_overload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = {1,2,3,4,5,6};
		int []arr2 = {1,2,3,4,5,6};
		overload o = new overload(); 
		o.add(arr1);
		o.add(arr1, arr2);
	}

}
