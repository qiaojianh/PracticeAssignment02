public class BinaryRecursiveSearch implements Practice2Search{
	public int search(int [] arr, int target){

		int min = 0;
		int max = arr.length -1;

		do{
			int mid = (min+max)/2;

			if (arr[mid] == target) {
				return mid;
			}
			if ( arr[mid] < target) {
				min = mid + 1;
			}
			else{
				max = mid - 1;
			}


		}while(max >= min);
		return -1;

	}

	public String searchName(){
		return "BinarySearchRecursive";
	}
}