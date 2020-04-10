import java.io.*;
import java.util.Scanner;

public class SumInAFile {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong : " + sum);

        } catch (Exception e) {
            System.out.println("File loi hoac khong ton tai");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao duong dan cua file : ");
        String path = scanner.nextLine();
        SumInAFile sumCal = new SumInAFile();

        sumCal.readFileText(path);

    }
}
