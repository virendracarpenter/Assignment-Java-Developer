import java.util.*;
public class Main
{
  static double shortest_distance(int ar[], String s)
  {
    int a=ar[0], b=ar[1];
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='N')
      {
        a++;
      }
      else if(s.charAt(i)=='S')
      {
        a--;
      }
      else if(s.charAt(i)=='E')
      {
        b++;
      }
      else if(s.charAt(i)=='W')
     {
      b--;
     }
    }
    return Math.sqrt(Math.pow(a-ar[0],2)+Math.pow(b-ar[1],2));
  }
  public static void main(String[] args){
    int ar[]={1,2};
    System.out.println(shortest_distance(ar,"NEWS"));
  }
}
