package files;
import java.io.*;
class BFiles {
    public static void main(String[] args) throws IOException{
        
        int x = 10;
        System.out.println(0/0);
        Student[] students = 
        {
            
            new Student(1,"Ahmed"),
            new Student(2,"Mohamed"),
            new Student(3,"Ali"),
        
        };
    
        ObjectInputStream fout = new ObjectInputStream(new FileInputStream("o.txt"));
        for(int i = 0;i<2;i++)
        {
            try {

                Student m = (Student) fout.readObject();
                System.out.println(m.name);  
            }catch(Exception e) {

            }
        }
        // DataOutputStream fout = new DataOutputStream(new FileOutputStream("file.dat"));
        // fout.writeInt(65);
        // fout.close();
        // DataInputStream fin = new DataInputStream(new FileInputStream("file.txt"));
        // System.out.println(fin.readInt());
    
    }
}
