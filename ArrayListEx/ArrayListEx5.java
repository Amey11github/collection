import java.util.ArrayList;

class ArrayListEx5
{
  public static void main(String[] args) {
  	ArrayList<Integer> arr1=new ArrayList<>();
  	arr1.add(10);
  	arr1.add(20);
  	arr1.add(30);
  	arr1.add(40);
  	arr1.add(50);
  	arr1.add(60);
  	arr1.add(70);

  	int sum=0,avg=0;

  	for(int i=0;i<arr1.size();i++)
  	{
  		int ele=arr1.get(i);
  		sum+=ele;
  	}
  	System.out.println("sum : "+sum);
  	System.out.println("average : "+sum/arr1.size());


  }
}