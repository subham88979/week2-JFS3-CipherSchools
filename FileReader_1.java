public class FileReader_1 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("/Users/saha8/Desktop/text.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}