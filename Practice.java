import java.io.File;
import java.io.IOException;

public class Practice{
    public static void main(String[] args) {
        File myFile=new File("Tabel.txt");
        try{
            myFile.createNewFile();
        }catch (IOException e){
            System.out.println("Exception ");
        }
    }
        }