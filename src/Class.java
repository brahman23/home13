import java.util.Arrays;

public class Class {
    final private int number;
    final private String sun;
    final private int[] s;
    public Class (int number,String sun,int...s){
        this.number=number;
        this.sun=sun;
        this.s=s;
    }

    public int getNumber() {
        return number;
    }

    public String getSun() {
        return sun;
    }

    public int[] getS() {
        return s;
    }

    @Override
    public String toString() {
        return (" "+number+" "+ sun+" "+ Arrays.toString(s));
    }
}
