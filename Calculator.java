import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Calculator{
    public static int calculateSum(String fileName) throws IOException{
        Path path = Path.of(fileName);
        String content = Files.readString(path);
        String[] num = content.split("\n");
        int result = 0;
        for(int i = 0;i<num.length-1;i++){
            result += Integer.parseInt(num[i]);
        }
        return result;
    }
}