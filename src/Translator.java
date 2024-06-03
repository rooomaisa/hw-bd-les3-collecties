import java.util.HashMap;
import java.util.Map;

public class Translator {
    private  HashMap<Integer, String> numericAlpha = new HashMap<>();

//    private HashMap<Integer,String> numericAlpha;

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i],alphabetic[i]);
        }
    }


    public HashMap<Integer, String> getNumericAlpha() {
        return numericAlpha;
    }

    public void setNumericAlpha(HashMap<Integer, String> numericAlpha) {
        this.numericAlpha = numericAlpha;
    }

    public String translate(Integer number){
        return numericAlpha.get(number);
    }




}




