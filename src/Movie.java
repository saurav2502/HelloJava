import java.util.*;

public class Movie  {
    private double rating;
    private String name;
    private int year;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

}

class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        double rate_1 = m1.getRating();
        double rate_2 = m2.getRating();
        if (rate_1 < rate_2) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        int res = m1.getName().compareTo(m2.getName());
        return m1.getName().compareTo(m2.getName());
    }
}

class Main {
    public static void main(String[] args) {
        /*ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));
        System.out.println("Sorted by name");*/
        Map<Double, String> map = new HashMap();
        map.put(8.3d,"Force");
        map.put(8.7d,"Empire");
        map.put(8.2d,"Star");
        TreeMap<Double, String> sorted = new TreeMap<>(map);
        Set<Map.Entry<Double, String>>set = sorted.entrySet();
//        RatingCompare ratingCompare = new RatingCompare();
        /*NameCompare nameCompare = new NameCompare();

        Collections.sort(set, nameCompare);*/
        /*for (Movie movie: list)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());*/
        Comparator<Map.Entry<Double,String>>comparator = new Comparator<Map.Entry<Double, String>>() {
            @Override
            public int compare(Map.Entry<Double, String> o1, Map.Entry<Double, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        List<Map.Entry<Double, String>>list = new ArrayList<>(set);
        Collections.sort(list,comparator);
        Collections.reverse(list);
        for(Map.Entry<Double, String> entry : list){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
