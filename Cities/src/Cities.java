import java.util.Scanner;
import java.util.Vector;

/**
 * Created by bobvv on 3/19/17.
 */
public class  Cities {
    Vector cities = new Vector();
    int number_of_cities = 0;
    public void addcity(String city)
    {
        //to add cities with input
        cities.addElement(city);
        number_of_cities++;
    }
    public boolean inputcity(){
        Scanner sc = new Scanner(System.in);
        String newcity = sc.next();
        addcity(newcity);
        if(citiesended())
            return false;
        return true;
    }
    public boolean citiesended(){
        //check if user is done with adding cities
        System.out.println("Are your cities ended? [Y/N]");
        Scanner scc = new Scanner(System.in);
        String isended = scc.next();
        if(isended.equals("Y"))
            return true;
        System.out.println("Write the new city name then");
        return false;
    }
    public String citiesquestions(Vector cities,int citynumber){
        //making questions based on binary search
        int max = citynumber;
        int min = 1;
        int mid = ( max + min ) / 2;
        Scanner scanner = new Scanner(System.in);
        for (int i = min - 1 ; i < mid ; i ++)
            System.out.println(cities.elementAt(i) + " ");
        while(max > min)
        {
            String bs = scanner.next();
            if(bs.equals("Y")) {
                max = mid;
                mid = (max + min )/ 2;
                if(min == mid && min == max)
                    break;
                if(min == mid)
                    System.out.println("Is your city " + cities.elementAt(min - 1) +" [Y/N]");
                else
                {
                    for (int i = min - 1 ; i < mid ; i ++)
                        System.out.println(cities.elementAt(i) + " ");
                }
            }
            else {
                min = mid + 1;
                mid = (max + min) / 2;
                if(min == mid && min == max)
                    break;
                if(min == mid)
                    System.out.println("Is your city " + cities.elementAt(min - 1) +" [Y/N]");
                else
                {
                    for (int i = min - 1 ; i < mid ; i ++)
                        System.out.println(cities.elementAt(i) + " ");
                }
            }
        }
        return (String)(cities.elementAt(max-1));
    }

    public static void main(String[] args) {
        Cities test = new Cities();
        while(test.inputcity());
        String result = test.citiesquestions(test.cities,test.number_of_cities);
        System.out.println("your city is " + result);
    }
}
