import java.util.ArrayList;

public class DataBase {
    //private int i = 0;
    private int i = 0;
    private ArrayList lines = new ArrayList();

    public void add(String[] line){
        lines.add(line);
    }
    public boolean isFinished(){
        return i+1 == lines.size();
    }
    public String[] getLine(){
        return (String[]) lines.get(i++);
    }
    public void reset(){
        i = 0;
    }
}
