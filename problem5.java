import java.util.*;
public class Main
{
  public static boolean isPerfectNumber(int num) 
  {
    int sum = 0;
    for (int i = 1; i <= num/2; i++) {
        if (num % i == 0)
        sum += i;
        }
    }
    return sum == num;
  }
  public static void main(String[] args){
    int ar=8;
    System.out.println(shortest_distance(ar));
  }
}
