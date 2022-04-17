package ThiCuoiKy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileService {
    public static void writeToFile(List <HangHoa> hangHoa) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("HangHoa.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(hangHoa);
        objectOutputStream.flush();   
        objectOutputStream.close();
        fileOutputStream.close();
       

    }
    public static List<HangHoa> readFile() throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("HangHoa.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (List<HangHoa>) objectInputStream.readObject();
    }
}
