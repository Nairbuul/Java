public class tester {
    public static void main(String args[]){
        String test = "Hello World";
        System.out.println(test.charAt(4));
        int test2 = 95014;
        System.out.println("A: " + test2%10);
        System.out.println("B: " + (test2%100)/10);
        System.out.println("C: " + (test2%1000)/100);
        System.out.println("C: " + (test2%10000)/1000);
        System.out.println("D: " + test2/10000);

        PostalBarCode t = new PostalBarCode(95014);
        System.out.println(t.PostalEncoder());

        PostalBarCode t2 = new PostalBarCode("||:|:::|:|:||::::::||:|::||");
        System.out.println(t2.PostalDecoder());


        /* 
        |:|:: 9
        :|:|: 5
        ||::: 0
        :::|| 1
        :|::| 4
        */

        /* Book Example. for 95014
         *    9         5       0        1     4       1
         * | [|:|::] [:|:|:] [||:::] [:::||] [:|::|] [:::||] |
         */
    }
}
