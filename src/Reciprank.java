import java.util.HashMap;
import java.util.Map;

public class Reciprank {

    // Creating this function to calculate score of the R1,R2 etc.

    static String R1="D1, D2, D3, D4, D5, D6";

   static String R2="D2,D5,D6, D7, D8,D9, D10, D11 ";

    static String R3="D1, D2, D5";

    static String R4= "D1, D2, D8, D10,D12";

// Creating a scoring function
    public static Map<String, Double> rankreturn(String list)
    {
        Map<String,Double>scores= new HashMap<String,Double>();

        Double rank=0.0;

        Double score;
        Double len= Double.valueOf(list.length());

        for(int i=0;i<scores.size();i++){


            score= (len-rank)/len;

          scores.put(String.valueOf(i),score);
            rank += 1.0;
        }


        return scores;

    }

    public static void main (String[] args)
    {

        Reciprank rc= new Reciprank();

        rc.rankreturn(R1);

        rc.rankreturn(R2);

        rc.rankreturn(R3);

        rc.rankreturn(R4);




    }
}


