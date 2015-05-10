package reva.careercup.solutions;
/*Given a array of numbers, for each element give the product of
  every other number. eg 1 2 4 3--> 24 12 6 8*/
public class Mul_remai_nos {
	
	public static void multipy(int[] a)
	{
		int multi_result = 1;
		for(int i : a)
		{	
			multi_result = multi_result*i;
			
		}
		for(int j=0;j< a.length;j++)
		{
			
			a[j] = multi_result/a[j];
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] a	 = {1,2,4,3};
		int [] output = new int[a.length];
		change(a,output);
	}
	 public static void change(int [] arr, int [] output)
	    {
	        int len = arr.length;
	        
	        int left = 1,right =1;
	        for(int i = 0; i < len; i ++)
	        {
	            output[i]= 1;
	        }
	        for(int i = 0 ; i < len; i ++)
	        {
	           output[i] *= left;
	           output[len-i-1]*=right;
	           left*=arr[i];
	           right*=arr[len-i-1];
	        
	        }
	        
	        for(int j : output)
	            System.out.print(j + " ");
	        
	    }

}
