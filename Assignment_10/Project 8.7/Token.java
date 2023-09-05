import java.util.*;
public class Token {
    
    String Buffer;
    String token;
    int position;
    int table[][] = new int[4][4];

    final String AlphabetAndNumbers = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    final String QuotationMarks = "\"\"";

    HashMap<Character, Integer> t = new HashMap<Character, Integer>();

    public Token(){
        this.Buffer = new String();
        this.token = new String();
        this.position = 0;
        initSTM();
        initHashMap();
    }

    public Token(String tokenizeMe){
        this.Buffer = tokenizeMe;
        this.token = new String();
        this.position = 0;
        initSTM();
        initHashMap();
    }

    public void newBuffer(String s){
        this.Buffer = s;
        this.token = new String();
        this.position = 0;
    }

    private void initHashMap(){
        for(int i = 0; i < AlphabetAndNumbers.length()-1; i++){
            t.put(AlphabetAndNumbers.charAt(i),1);
        }
        t.put(',',2);
        for(int j = 0; j < QuotationMarks.length()-1; j++){
            t.put(QuotationMarks.charAt(j),3);
        }
      }

    private void initSTM(){
        //Column 0 = success states.
        table[0][0] = -1;
        table[1][0] = -1;
        table[2][0] = 3;
        table[3][0] = -1;

        //Column 1 = valid inputs (chars/numerals).
        table[0][1] = 1;
        table[1][1] = 1;
        table[2][1] = -1;
        table[3][1] = 3;

        //Column 2 = ,
        table[0][2] = 2;
        table[1][2] = 2;
        table[2][2] = -1;
        table[3][2] = 3;

        //Column 3 = " "
        table[0][3] = 3;
        table[1][3] = 3;
        table[2][3] = -1;
        table[3][3] = 1;
    }

    public String getToken(){
        return new String();
    }

    public String Tokenize(){
        int state = 0;
        
        if(state < 0){
            return new String();
        }
        
        state = table[state][t.get(Buffer.charAt(position))];
        while((state >= 0 && state != 2 && position < Buffer.length()-1)){
            token += Buffer.charAt(position);
            position++;
            state = table[state][t.get(Buffer.charAt(position))];
        }

        if(position == Buffer.length()-1){
            token += Buffer.charAt(position);
        }

        position++;
        String temp = token;
        token = new String();
        return temp;
    }
}
