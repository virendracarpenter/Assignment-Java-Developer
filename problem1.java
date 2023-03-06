public class Main  
{  
  static int minmax(int a[], int b[])  
  {  
    int c=0;  
    int d=0;  
    for(int i=0;i<a.length;i++)  
    {  
      if(a[i]>b[i])  
      {  
        c=Math.max(c,a[i]);  
        d=Math.max(d,b[i]);  
      }  
      else  
      {   
        c=Math.max(c,b[i]);  
        d=Math.max(d,a[i]);  
      }  
      return c*d;  
    }  
    public static void main(String[] args){  
      int a[]={8,7,9,6,5,6,6,5,6,4,6,7,8,5,4,3,2,1,4,5,6,7,8,7,8};  
      int b[]={2,4,5,6,7,6,7,8,9,8,7,6,7,6,5,4,3,2,3,4,5,5,5,4,5};  
      System.out.println(minmax(a, b));  
    }  
  }  
}  
