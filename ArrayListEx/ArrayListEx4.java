import java.util.ArrayList;

class ArrayListEx4
{
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(10);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		arr1.add(20);
		arr1.add(60);
		arr1.add(70);

		System.out.println(arr1);
		int indx=arr1.size();

		for(int i=0;i<indx;i++)
		{
			for(int j=i+1;j<indx;j++)
			{
				int ele1=arr1.get(i);
				int ele2=arr1.get(j);
				if(ele1==ele2)
				{
					arr1.remove(Integer.valueOf(ele1));
					indx--;
				}
			}
		}

		System.out.println(arr1);

		
	}
}