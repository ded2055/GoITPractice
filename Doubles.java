package goit.task4_3;


public class Doubles {
    public Double parse(String s) {
        try{
            return Double.valueOf(s);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
