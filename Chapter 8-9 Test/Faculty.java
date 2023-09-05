public class Faculty extends Person{
    String Faculty_ID;
    int YearsOfTeaching;

    public Faculty (){

    }

    public Faculty(String name, String address, String phoneNum, String Faculty_ID, int YearsOfTeaching){
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNum(phoneNum);
        this.Faculty_ID = Faculty_ID;
        this.YearsOfTeaching = YearsOfTeaching;
    }

    public String toString(){
        return (String) name + '\t' + address + '\t' + phoneNum + '\t' + Faculty_ID + '\t' + YearsOfTeaching;
    }
}
