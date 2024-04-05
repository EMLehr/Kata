import java.lang.reflect.Array;
import java.util.ArrayList;

public class Converter
{

    //This won't work
    //I need to create an array list where it adds an I for each number of the int
    //Then make a method to turn every chunk of five I into a V
    //Then every two V into an X
    //Etc. for M, L, C, whatever other roman numerals
    //Maybe a method to find an integer with a 4 or 9 in the ones place and edit the methods appropriately?

    ArrayList roman = new ArrayList<String>();
    private ArrayList listone;
    private ArrayList listtwo;


    public String intToRoman(int i)
    {
        boolean hasFive = false;
        boolean hasFour = false;
        String romanNumeral = "";
        int j = 0;
        while(j != i)
        {
            roman.add("I");
            j++;
        }




        //Make V
        hasFive=checkForFive(roman);

        while(hasFive==true)
        {
            roman=convertToV(roman);

            hasFive = checkForFive(roman);
        }

        hasFour = checkForFour(roman);
        while(hasFour==true)
        {

            roman=convertToIV(roman);

            hasFour = checkForFour(roman);

        }

        boolean hasTen=checkForTen(roman);
        while(hasTen)
        {
            roman=convertToX(roman);
            hasTen=checkForTen(roman);
        }



        //Convert ArrayList to string
        int arraySize = roman.size();
        int k = 0;
        while(k<arraySize)
        {

            romanNumeral=romanNumeral+roman.get(k);
            k++;
        }
        System.out.println("TEST"+romanNumeral);
        return romanNumeral;

    }



    private ArrayList convertToV(ArrayList roman)
    {
        int size = roman.size();
        ArrayList<String> newList = new ArrayList<>();


        if(size>=5)
        {
            int i=0;
            while(i<5)
            {
                roman.remove(i);
                i++;
            }
            System.out.println(roman);
            roman.add("V");

        }
        else
        {
          return newList;
        }
        return newList;
    }

    public boolean checkForFive(ArrayList roman)
    {
        ArrayList<String> checker = new ArrayList<>();
        checker.add("I");
        checker.add("I");
        checker.add("I");
        checker.add("I");
        checker.add("I");

        int size = roman.size();

        ArrayList<String> romanChecker=new ArrayList<>();
        if(size>=5)
        {



            //get first 5 index entries of roman and put into romanChecker
            romanChecker.add((String) roman.get(0));
            romanChecker.add((String) roman.get(1));
            romanChecker.add((String) roman.get(2));
            romanChecker.add((String) roman.get(3));
            romanChecker.add((String) roman.get(4));

        }

        if(checker.equals(romanChecker))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private ArrayList convertToIV(ArrayList roman)
    {
        int size = roman.size();
        if(size>=4)
        {
            int i=0;
            while(i<4 )
            {
                roman.remove(0);
                i++;
            }
            roman.add("IV");
        }
        return roman;
    }

    private boolean checkForFour(ArrayList roman)
    {
        ArrayList<String> checker = new ArrayList<>();
        checker.add("I");
        checker.add("I");
        checker.add("I");
        checker.add("I");


        if(checker.equals(roman))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean checkForTen(ArrayList roman)
    {
        ArrayList<String> checker = new ArrayList<>();
        checker.add("V");
        checker.add("V");


        int size = roman.size();

        ArrayList<String> romanChecker=new ArrayList<>();
        if(size>2)
        {
            //get first 5 index entries of roman and put into romanChecker
            romanChecker.add((String) roman.get(0));
            romanChecker.add((String) roman.get(1));


        }
        if(checker.equals(romanChecker))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public ArrayList convertToX(ArrayList roman)
    {
        int size = roman.size();
        ArrayList<String> newList = new ArrayList<>();


        if(size>=5)
        {
            int i=0;
            while(i<2)
            {
                roman.remove(0);
                i++;
            }

            newList.add("X");

            int newSize = roman.size();
            int k=0;
            while(k!=newSize)
            {
                newList.add((String) roman.get(k));
                k++;
            }

        }
        else
        {
            return newList;
        }
        return newList;
    }





    public String fixingthenine(ArrayList romanNumeralFiveHundred,ArrayList romanNumeralHundreds)
    {   this.listone=romanNumeralFiveHundred;
        this.listtwo=romanNumeralHundreds;
        String checker = "DCD";
        String checkee="";
        checkee=checkee+listone.get(0);
        checkee=checkee+listtwo.get(0);
        checkee=checkee+listtwo.get(1);
        System.out.println(checkee);
        return checkee;
    }
}


