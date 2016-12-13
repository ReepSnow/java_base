package cn.snow.generic;

public class Complex {

	public <T> void swap(T arr[],int pos1,int pos2){
		T temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
	public <T> void reverse(T arr[]){
		
		int start = 0;
		int end = arr.length-1;
		while(true){
			if(start>=end)
				break;
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
