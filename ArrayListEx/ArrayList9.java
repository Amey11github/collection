import java.util.*;

class ArrayList9
{
	public static void main(String[] args) {

		ArrayList<Integer> arr1=new ArrayList<>();
		

		arr1.add(10);
		arr1.add(20);
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);

		int len=arr1.size();
		boolean b[]=new boolean[len];

		for(int i=0;i<len;i++)
		{
			if (b[i])
                continue;
			int cnt=1;
			for(int j=i+1;j<len;j++)
			{
				if(arr1.get(i).equals(arr1.get(j)) && !b[j])
				{
					cnt++;
					b[j]=true;
				}
			}

			System.out.println(arr1.get(i)+" : "+cnt);
		}

		
	}
}