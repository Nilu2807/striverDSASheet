class selectionSort {
	
	public static void selection_Sort(int[] arr, int n) {
//		int[] arr = {4,2,6,8,10};
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int nums : arr)
		System.out.print(nums+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 5;
		
		int[] arr = {6, 2, 8, 4,10};
		int n = arr.length;
		selection_Sort(arr,n);

	}

}
