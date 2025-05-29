import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("lower.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("upper.txt"));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line.toUpperCase());
                bw.newLine();
            }
            br.close();
            bw.close();
            BufferedReader reader = new BufferedReader(new FileReader("upper.txt"));
            while((line=reader.readLine())!=null){
                System.out.println(line);;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}