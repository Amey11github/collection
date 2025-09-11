import java.util.*;

class Mobile implements Comparable<Mobile>
{
	String brand;
	String model;
	double price;

	Mobile(String brand,String model,double price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}

	public String toString()
	{
		return brand+"-"+model+"-"+price;
	}

	public int compareTo(Mobile obj)
	{
		if(this.price>obj.price) return 1;
		else if(this.price<obj.price) return -1;
		else return 0;
	}

}

class MobileDriver
{
  public static void main(String[] args) {

  	TreeSet<Mobile> set=new TreeSet<>();
  	set.add(new Mobile("Vivo","T1 5G ",18000));
  	set.add(new Mobile("Samsung","A5 ",21000));
  	set.add(new Mobile("Vivo","T4 5G ",10000));
  	set.add(new Mobile("Poco","XT 5G ",81000));
  	set.add(new Mobile("Oppo","Reno 6 ",35000));

  	for( Mobile mob : set)
  	{
  		System.out.println(mob);
  	}
  }
	
}