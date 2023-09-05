public class test{
    public static void main(String args[]){
        String t = "John Jacob Astor, 1763, 1848";
        Token t1 = new Token(t);
        // System.out.println(t1.Tokenize());        
        // System.out.println(t1.Tokenize());        
        // System.out.println(t1.Tokenize());       

        // CVS cvs = new CVS();
        // cvs.addline(t);
        // System.out.println(cvs.getEntry(1, 2));

        //Come Back to this.
        String t2 = "John \"Jacob,\" Astor, 1763, 1848";
        // t1.newBuffer(t2);
        // System.out.println(t1.Tokenize());
        // System.out.println(t1.Tokenize());
        // System.out.println(t1.Tokenize());

        CVS cvs = new CVS();
        cvs.addline(t2);
        System.out.println(cvs.getEntry(1, 1));
        
        // for(int i = 0; i < t.length(); i++){
        //     System.out.println(t.charAt(i));
        // }
    }
}