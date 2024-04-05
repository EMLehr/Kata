import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConverterTwo
{
   //public static ArrayList<String> romanNumerals;
    public static int num;
    public static ArrayList<String> romanNumeralHundreds;

    public static ArrayList<String> romanNumeralFiveHundred;
    public static ArrayList<String> romanNumeralTens;
    public static ArrayList<String> romanNumeralOnes;
    public static ArrayList<String> romanNumeralFives;
    public static ArrayList<String> combinedOnes;
    public static ArrayList<String> romanNumerals;
    public static ArrayList<String> romanNumeralFifty;


    public int setNumber(int i)
    {
        num=i;
        return num;
    }

    public ArrayList checkForFifty()
    {
        ArrayList<String> romanNumeralFifty = new ArrayList<>();
        if(num>=50)
        {
            romanNumeralFifty.add("L");
            num=num-50;
        }

        return romanNumeralFifty;
    }

    public ArrayList checkForTens()
    {
        ArrayList<String> romanNumeralTens = new ArrayList<>();
        if((num<50)&&(num>=10))
        {

            while(num>=10)
            {
                romanNumeralTens.add("X");
                num=num-10;
            }
        }

        romanNumeralTens=checkForForty(romanNumeralTens);

        return romanNumeralTens;
    }

    public ArrayList checkForFives()
    {
        ArrayList<String> romanNumeralFives = new ArrayList<>();
        if(num>=5)
        {
            romanNumeralFives.add("V");
            num=num-5;
        }
       // System.out.println(romanNumeralFives);
        return romanNumeralFives;
    }

    public ArrayList checkForThousand()
    {
        ArrayList<String> romanNumerals = new ArrayList<>();
        if(num>=1000)
        {
            while(num>=1000)
            {
                romanNumerals.add("M");
                num=num-1000;
            }
        }
      // System.out.println(romanNumerals);
        return romanNumerals;
    }

    public ArrayList checkForFiveHundred()
    {
        ArrayList<String> romanNumeralFiveHundred = new ArrayList<>();
        if((num>=500)&&(num<1000))
        {
           romanNumeralFiveHundred.add("D");
           num=num-500;
        }
      //  System.out.println(romanNumeralFiveHundred);


        return romanNumeralFiveHundred;
    }

    public ArrayList checkForHundred()
    {
        ArrayList<String> romanNumeralHundreds = new ArrayList<>();
        if(num>=100)
        {
            while(num>=100)
            {
                romanNumeralHundreds.add("C");
                num=num-100;
            }
        }


        romanNumeralHundreds=checkForFourHundred(romanNumeralHundreds);
       // System.out.println(romanNumeralHundreds);
        return romanNumeralHundreds;
    }

    public ArrayList checkForOne()
    {
        ArrayList<String> romanNumeralOnes = new ArrayList<>();
        while(num!=0)
        {
            romanNumeralOnes.add("I");
            num=num-1;
        }
        romanNumeralOnes=checkForFour(romanNumeralOnes);
       //System.out.println(romanNumeralOnes);
        Converter user = new Converter();
        //String newList=user.fixingthenine(romanNumeralFiveHundred,romanNumeralHundreds);
        //System.out.println(newList);
        return romanNumeralOnes;
    }

    public ArrayList checkForFourHundred(ArrayList romanNumeralHundreds)
    {
        int size = romanNumeralHundreds.size();
        if(size==4)
        {
            romanNumeralHundreds.remove(0);
            romanNumeralHundreds.remove(0);
            romanNumeralHundreds.remove(0);
            romanNumeralHundreds.remove(0);

            romanNumeralHundreds.add("CD");

        }
        return romanNumeralHundreds;
    }

    public ArrayList checkForForty(ArrayList romanNumeralTens)
    {
        int size = romanNumeralTens.size();
        if(size==4)
        {
            romanNumeralTens.remove(0);
            romanNumeralTens.remove(0);
            romanNumeralTens.remove(0);
            romanNumeralTens.remove(0);

            romanNumeralTens.add("XL");

        }
        return romanNumeralTens;
    }

    public ArrayList<String> checkForFour(ArrayList romanNumeralOnes)
    {
        int size = romanNumeralOnes.size();
        if(size==4)
        {
            romanNumeralOnes.remove(0);
            romanNumeralOnes.remove(0);
            romanNumeralOnes.remove(0);
            romanNumeralOnes.remove(0);
            romanNumeralOnes.add("IV");
        }
        return romanNumeralOnes;
    }




    /*public ArrayList<String> combineOnes(ArrayList<String> romanNumeralOnes,ArrayList<String> romanNumeralFives)
    {

        ArrayList<String> combinedOnes = new ArrayList();
        combinedOnes.add(String.valueOf(romanNumeralOnes));
        combinedOnes.add(String.valueOf(romanNumeralFives));

        return combinedOnes;
    }*/

  /* public ArrayList<String> combineLists(ArrayList romanNumerals,ArrayList romanNumeralHundreds,ArrayList romanNumeralTens, ArrayList romanNumeralOnes, ArrayList romanNumeralFives, ArrayList romanNumeralFiveHundred, ArrayList romanNumeralFifty)
   {
       int thousandSize=romanNumerals.size();
       int hundredSize=romanNumeralHundreds.size();
       int fiveHundredSize=romanNumeralFiveHundred.size();
       int fiftySize = romanNumeralFifty.size();
       int tenSize=romanNumeralTens.size();
       int fiveSize=romanNumeralFives.size();
       int oneSize=romanNumeralOnes.size();

       ArrayList<String> newList = new ArrayList<>();
       int i =0;
       while(i<thousandSize)
       {
           String character = (String) romanNumerals.get(i);
           newList.add(character);
           i++;
       }
       int k=0;
       while(k<fiveHundredSize)
       {
           String character = (String) romanNumeralFiveHundred.get(k);
           newList.add(character);
           k++;
       }
       return newList;
   }*/

   public String use(int i)
    {
        setNumber(i);
        ArrayList<String> thousands= checkForThousand();

        ArrayList<String> fiveHund=checkForFiveHundred();
        ArrayList<String> hundreds=checkForHundred();
        ArrayList<String> fifty=checkForFifty();
        ArrayList<String> tens=checkForTens();
        ArrayList<String> fives = checkForFives();
        ArrayList<String> ones=checkForOne();

        String onesPlace ="";
        int k=0;
        if(fives.size()>0)
        {
            while(k<fives.size())
            {
                onesPlace=onesPlace+fives.get(k);
                k++;
            }

        }
        k=0;
        if(ones.size()>0)
        {
            while(k<ones.size())
            {
                onesPlace=onesPlace+ones.get(k);
                k++;
            }
        }
        k=0;

        if (onesPlace.equals("VIV"))
        {
            onesPlace="IX";
        }






        String hundredsPlace="";
        if(fiveHund.size()>0)
        {
            while(k<fiveHund.size())
            {
                hundredsPlace=hundredsPlace+fiveHund.get(k);
                k++;
            }

        }
        k=0;
        if(hundreds.size()>0)
        {
            while(k<hundreds.size())
            {
                hundredsPlace=hundredsPlace+hundreds.get(k);
                k++;
            }
        }
        k=0;

        if (hundredsPlace.equals("DCD"))
        {
            hundredsPlace="CM";
        }




        String tensPlace="";
        if(fifty.size()>0)
        {
            while(k<fifty.size())
            {
                tensPlace=tensPlace+fifty.get(k);
                k++;
            }

        }
        k=0;
        if(tens.size()>0)
        {
            while(k<tens.size())
            {
                tensPlace=tensPlace+tens.get(k);
                k++;
            }
        }
        k=0;

        if (tensPlace.equals("LXL"))
        {
            tensPlace="XC";
        }


        String thousandsPlace="";
        if(thousands.size()>0)
        {
            while(k<thousands.size())
            {
                thousandsPlace=thousandsPlace+thousands.get(k);
                k++;
            }
        }
        k=0;



        String fullList=thousandsPlace+hundredsPlace+tensPlace+onesPlace;
        return fullList;
    }




}
