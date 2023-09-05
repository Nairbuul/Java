import java.util.Scanner;
public class test {
    public static void main(String args[]){
        String placeHolder[] = new String[2];                               //String array that holds the inputs.
        Scanner scanner = new Scanner(System.in);                           //Inputs.

        System.out.println("Input V for volume conversion\n" + "Input M for mass conversion\n" + "Input D for distance conversion\n" );
        
        //Case asking user if they want to convert volumetric/mass/distance units.
        switch(scanner.nextLine().toUpperCase()){
            case "V":{
                //Showing all the available units.
                System.out.println("Enter an integer representing the unit");
                for(int i = 0; i < 9; i++){
                    System.out.println(i + ": " + unitConversion.volumetricUnits[i]);
                }

                //Asking user to choose two units.
                for(int i = 0; i < 2; i++){
                    int t = scanner.nextInt();
                    //In the case that the user inputs an out of bounds index we'll continue asking for inputs.
                    if(t > 9){
                        System.out.println("Invalid input: " +  i);
                        i--;
                    }
                    //If the inputs are valid we'll store them in our string array.
                    else{
                        placeHolder[i] = unitConversion.volumetricUnits[t];
                    }
                }

                //Ask user for input.
                System.out.println("Enter a value (decimals allowed): ");
                double value = scanner.nextInt();
                
                //Printing out the results up to the 5 decimal places.
                System.out.println(value + " " + placeHolder[0]);
                System.out.printf("%.5f", unitConversion.convert(value, placeHolder[0], placeHolder[1]));
                System.out.println(" " + placeHolder[1]); 
                
                //Leaving the switch case.
                break; 
            }
            case "D":{
                //Showing all the available units.
                System.out.println("Enter an integer representing the unit");
                for(int i = 0; i < 6; i++){
                    System.out.println(i + ": " + unitConversion.distanceUnits[i]);
                }

                //Asking user to choose two units.
                for(int i = 0; i < 2; i++){
                    int t = scanner.nextInt();
                    //In the case that the user inputs an out of bounds index we'll continue asking for inputs.
                    if(t > 5){
                        System.out.println("Invalid input: " +  i);
                        i--;
                    }
                    //If the inputs are valid we'll store them in our string array.
                    else{
                        placeHolder[i] = unitConversion.distanceUnits[t];
                    }
                }

                //Ask user for input.
                System.out.println("Enter a value (decimals allowed): ");
                double value = scanner.nextInt();
                
                //Printing out the results up to the 5 decimal places.
                System.out.println(value + " " + placeHolder[0]);
                System.out.printf("%.5f", unitConversion.convert(value, placeHolder[0], placeHolder[1]));
                System.out.println(" " + placeHolder[1]); 
                
                break;
            }
            case "M":{
                //Showing all the available units.
                System.out.println("Enter an integer representing the unit");
                for(int i = 0; i < 4; i++){
                    System.out.println(i + ": " + unitConversion.massUnits[i]);
                }

                //Asking user to choose two units.
                for(int i = 0; i < 2; i++){
                    int t = scanner.nextInt();
                    //In the case that the user inputs an out of bounds index we'll continue asking for inputs.
                    if(t > 3){
                        System.out.println("Invalid input: " +  i);
                        i--;
                    }
                    //If the inputs are valid we'll store them in our string array.
                    else{
                        placeHolder[i] = unitConversion.massUnits[t];
                    }
                }

                //Ask user for input.
                System.out.println("Enter a value (decimals allowed): ");
                double value = scanner.nextInt();
                
                //Printing out the results up to the 5 decimal places.
                System.out.println(value + " " + placeHolder[0]);
                System.out.printf("%.5f", unitConversion.convert(value, placeHolder[0], placeHolder[1]));
                System.out.println(" " + placeHolder[1]); 

                //Leaving the switch statement.
                break;
            }
        }
    }
}
