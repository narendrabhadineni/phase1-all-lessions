package bubblesort;

public class bubblesort {
	   public static void main(String[] args){

		     int[] arr= {15,23,25,8,10,12,14};
		     bubbleSort(arr);
		     for(int i=0;i<arr.length;i++){

		        System.out.println(arr[i]);
		        }
		    }

		    public static void bubbleSort(int[] arr){
		        int len = arr.length;
		        int temp = 0;
		        for(int i=0;i<len;i++){
		            for (int j=1;j<(len);j++){
		                if(arr[j-1]>arr[j]){
		                temp = arr[j-1];
		                arr[j-1]= arr[j];
		                arr[j]= temp;

		                }


		            }

		        }

		    }

		}


