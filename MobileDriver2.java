import java.util.*;

class Mobile 
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
}

class SortByDescPrice implements Comparator<Mobile>
{
			public int compare(Mobile obj1,Mobile obj2)
			{
				if(obj1.price>obj2.price) return -1;
				else if(obj1.price<obj2.price) return 1;
				else return 0;
			}
}

class SortByDescBrand implements Comparator<Mobile>
{
			public int compare(Mobile obj1,Mobile obj2)
			{
				return obj2.brand.compareTo(obj1.brand);
			}
}

class SortByDescModel implements Comparator<Mobile>
{
			public int compare(Mobile obj1,Mobile obj2)
			{
				return obj2.model.compareTo(obj1.model);
			}
}

class MobileDriver2
{
  public static void main(String[] args) {

  	TreeSet<Mobile> set=new TreeSet<>(new SortByDescModel());
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