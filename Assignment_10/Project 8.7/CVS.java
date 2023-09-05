import java.util.*;

import javax.xml.crypto.Data;
public class CVS {

    int rows;
    int columns ;
    ArrayList<DataCapsule> CVS;

    public CVS(){
        this.rows = 0;
        this.columns = 3;
        this.CVS = new ArrayList<DataCapsule>();
    }
    
    public int rows(){return CVS.size();}
    public int columns(){return columns;}

    public void addline(String line){
        Token tokenizer = new Token(line);
        String name = tokenizer.Tokenize();
        String dob = tokenizer.Tokenize();
        String dod = tokenizer.Tokenize();
        DataCapsule temp = new DataCapsule(name, dob, dod);
        CVS.add(temp);
    }

    public String getEntry(int row, int column){
        return CVS.get(row-1).getColumn(column-1);
    }
}
