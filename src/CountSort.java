import java.util.Scanner;

public class CountSort {
    public static void Sort(int[] Array)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i< Array.length;i++)
        {
            if(Array[i]>max)
            {
                max=Array[i];
            }
            if(Array[i]<min)
            {
                min=Array[i];
            }

        }
        int [] count=new int[max+1];
        for(int i=0;i< Array.length;i++)
        {
            count[Array[i]]++;
        }
        for(int i=0;i<=max;i++)
        {
            int index=count[i];
            for(int j=0;j<index;j++)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Size= scanner.nextInt();
        int [] Array=new int[Size];
        for(int i=0;i<Size;i++)
        {
            Array[i]= scanner.nextInt();
        }
        Sort(Array);
    }
}
