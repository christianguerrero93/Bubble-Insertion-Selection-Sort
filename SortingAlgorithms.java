
public class SortingAlgorithms {
	
	public static void selectionSort(int [] arr){
		for(int i=0; i<arr.length-1; i++){		//start at 0...go through the array
			//find the next smallest
			int indexOfNextSmall = findSmallest(i, arr);
			swapValues(arr, i,indexOfNextSmall);//swap with the smallest
		}	
	}
	
	private static int findSmallest(int start, int[] anArr){
		int min = anArr[start];
		int indexOfMin = start;
		for(int i = start+1; i<anArr.length; i++ ){
			if(anArr[i] < min){ //anArr[i] < anArr[indexOfMin]
				min = anArr[i];//indexOfMin = i  set new minimum ...found a smaller value
				indexOfMin = i;//update index of min
			}
		}
		return indexOfMin;
	}
	
	public static void insertionSort(int [] arr){
		//start from 2nd location
		for(int i=1; i<arr.length; i++){
			int curr = arr[i];//store the curr val
			int j = i;
			while(j>0 && arr[j-1]>curr){//head back toward 0 index
				arr[j] = arr[j-1];//shift values
				j--;
			}
			arr[j]= curr;
		}
		
	}
	
	public static void bubbleSort(int[] arr){
		boolean notSorted = true;
		while(notSorted){
			notSorted=false;//assume sorted until proven otherwise
			for(int i=0; i<arr.length -1; i++){//go through and compare curr to next
				int j=i+1;//index of next
				if(arr[i] > arr[j]){//curr val > next val
					swapValues(arr, i, j);//swap values via location
					notSorted = true;// come back into the array again when done with inner for loop
				}
			}
		}
	}
	private static void swapValues(int [] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
