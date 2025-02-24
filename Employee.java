public class Employee implements java.io.Serializable{
public String name;
public String address;
public transient int SSN;
public int number;


public String toString(){
return "name is : "+this.name+" address is : "+this.address+" SSN is : "+this.SSN+" number is : "+this.number;
}

}