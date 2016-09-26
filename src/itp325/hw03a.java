package itp325;

public class hw03a 
{
    public static void main(String[] args) 
    {
    	int count = 0;
       for(int i = 1; i <= 1000000; i++)
       {
         if (isPrimeNumber(i))
         {
        	 if(count == 10001){
        		 System.out.println(i);
        	 }
        	 else{
        		 count++;
        	 }
            
         }
       }
    }


    public static boolean isPrimeNumber(int i) {
        int factors = 0;
        int j = 1;

        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
  }
}