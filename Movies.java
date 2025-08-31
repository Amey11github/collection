import java.util.*;

class Movies implements Comparable<Movies>
{
	String movieName;
	double price;

	public Movies(String movieName,double price)
	{
		this.movieName=movieName;
		this.price=price;
	}

	public String toString()
	{
		return "MovieName : "+this.movieName+" , Price : "+this.price;
	}

    @Override
	public int compareTo(Movies o)
	{
		if(this.price==o.price)
		{
			return 0;
		}
		else if(this.price>o.price)
		{
			return 1;
		}
		else{
			return -1;
		}
	}

	public static void main(String[] args) {

		ArrayList<Movies> movies=new ArrayList<>();
		movies.add(new Movies("coolie",123.89));
		movies.add(new Movies("sholay",564.89));
		movies.add(new Movies("baaghi 4",566.89));
		movies.add(new Movies("kgf",56.789));
		movies.add(new Movies("saiyaara",5665.89));

		System.out.println(movies);

		System.out.println();


		System.out.println("After Sorting : ");

		Collections.sort(movies);
		System.out.println(movies);

		
	}
}