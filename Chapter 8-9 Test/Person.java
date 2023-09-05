public class Person {
    String address; 
    String name;
    String phoneNum;


    public Person(){
        System.out.println("he");
        this.address = new String();
        this.name = new String();
        this.phoneNum = new String();
    }

    public Person(String name, String address, String phoneNum){
        this.address = address;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    //Accessor methods
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    //Mutator Methods
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }   

    public String toString(){
        return (String) name + '\t' + address + '\t' + phoneNum;
    }
}