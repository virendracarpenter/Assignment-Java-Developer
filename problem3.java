import java.util.*;
public class Main
{
    static ArrayList<ArrayList<String>> combination_sort(ArrayList<String> s)
    {
        ArrayList<String> L1=new ArrayList();
        ArrayList<String> L2=new ArrayList();
        ArrayList<ArrayList<String>> result=new ArrayList();
        HashMap<Character,ArrayList<Integer>> map=new HashMap<Character,ArrayList<Integer>>();
        ArrayList<Integer> ss;
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(String i:s)
        {
            pq.add(i.charAt(0));
            ss=map.get(i.charAt(0));
            if(ss==null)
            {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.add(Integer.parseInt(i.substring(1)));
                map.put(i.charAt(0),temp);
            }
            else
            {
                ss.add(Integer.parseInt(i.substring(1)));
                map.put(i.charAt(0),ss);
            }
        }
        char c='0';
        while(pq.size()>0)
        {
            if(c!=pq.peek())
            {
                c=pq.peek();
            }
            else
            {
                pq.poll();
                continue;
            }
            ArrayList<Integer> temp1=map.get(c);
            ArrayList<String> temp=new ArrayList<>();
            for(int i:temp1)
            {
                temp.add(c+String.valueOf(i));
            }
            L1.addAll(temp);
            Collections.sort(temp1, Collections.reverseOrder());
            temp.clear();
            for(int i:temp1)
            {
                temp.add(c+String.valueOf(i));
            }
            L2.addAll(temp);
            pq.poll();
        }
        result.add(L1);
        result.add(L2);
        return result;
    }
	public static void main(String[] args) {
	    ArrayList<String> s=new ArrayList<String>(Arrays.asList("d34","g54", "d12", "b87", "g1", "c65", "g40", "g5", "d77"));
	    
		System.out.println(combination_sort(s));
	}
}
