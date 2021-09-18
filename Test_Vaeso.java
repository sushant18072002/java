import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int min(int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE; //initailize with infinity
        Arrays.sort(array);         //sorted array
        for (int i=0; i<= N-M;i++)
            result = Math.min(result, array[i + M - 1] - array[i]);    //extract min
        return result;
    }

    static int find(int res,int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE; //initailize with infinity
        for(int i=0; i<=N; i++)
        {
            //result = Math.min(result, array[i + M - 1] - array[i]);
            if(result>array[i + M - 1] - array[i]){
                result=array[i + M - 1] - array[i];
            }
            if (res==result)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String goodies[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };

        int n = array.length;
        System.out.println("Enter the number of employees");
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int r=min(array, n,m);
        System.out.println("Number of the employees:"+m);
        int s=find(r,array,n,m);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i=s;i<s+m;i++)
            System.out.println(goodies[i]);
        System.out.println("\n");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is: "+r);
    }
}
