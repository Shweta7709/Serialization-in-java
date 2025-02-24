import java.io.*;
public class SerializeDemo{

public static void main(String[]args){
Employee e = new Employee();
e.name ="Shweta";
e.address = "Mount Road,Thenampet,Chennai";
e.SSN = 1122333;
e.number = 101;
try{
FileOutputStream fileOut = new FileOutputStream("employee.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(e);
out.close();
fileOut.close();
System.out.printf("Serialized data is saved in employee.ser");
}

catch(IOException i){
i.printStackTrace();

}

}
}