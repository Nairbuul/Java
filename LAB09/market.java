import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class market {
    ArrayList<customer> clientele = new ArrayList<customer>();
    Scanner input = new Scanner(System.in);

    /**
     * Constructor responsible for asking for user input and 
     * constructign the Arraylist.
     */
    public market(){
        userInput();
    }
    
    /**
     * Ask for userinput to initialize a container obj 
     * and input into an array list
     */
    private void userInput(){
        String cont = new String();
        while(!cont.equals("N")){
            System.out.println();
            System.out.println("Enter customer first name, and the amount they spent seperated by a space.");
            customer temp = new customer(input.next(), input.nextDouble());
            addSale(temp);
            
            System.out.println();
            System.out.println("Continue (Y/N)");
            cont = input.next().toUpperCase();
        }
    }

    /**
     * adding objecter into the array list.
     * @param client obj to be added to the array list.
     */
    private void addSale(customer client){
        clientele.add(client);
    }

    /**
     * Constructing a new array list to return.
     * @param n number of top customers we want.
     * @return Arraylist of size n of the top customers
     */
    public ArrayList<customer>nameOfBestCustomer(int n){
        //Check that'll return an empty list if the argument
        //is <= 0
        if(n <= 0)
            return new ArrayList();

        System.out.println("A" + clientele);
        Collections.sort(clientele, new sorter());
        System.out.println("B" + clientele);
        
        //Check that'll return the array list if the argument 
        //is greater or equal to the clientele list.
        if(n >= clientele.size())
            return clientele;

        //Constructing new arraylist that'll store only the 
        //specified amount of top customers.
        ArrayList<customer> temp = new ArrayList<customer>();
        for(int i = 0; i < n; i ++){
            temp.add(clientele.get(i));
        }

        return temp;
    }

}
