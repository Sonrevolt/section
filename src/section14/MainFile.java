package section14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFile {

    // Hàm tạo và ghi nội dung vào file
    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("The content has been written to the file: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
    // Hàm đọc nội dung từ file
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi đọc file: " + e.getMessage());
        }
        return content.toString();
    }

    // Hàm append nội dung vào file
    public static void appendToFile(String fileName, String additionalContent) {
        String existingContent = readFile(fileName).trim();
        String updatedContent = existingContent + additionalContent;
        writeFile(fileName, updatedContent);
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String initialContent = "Hello Trung Tâm Java - File";
        String appendContent = ". I am here";

        // Ghi nội dung ban đầu vào file
        writeFile(fileName, initialContent);

        // Đọc và hiển thị nội dung hiện tại của file
        System.out.println("Content in file:");
        System.out.println(readFile(fileName));

        // Append nội dung mới và ghi lại vào file
        appendToFile(fileName, appendContent);

        // Đọc và hiển thị nội dung mới của file
        System.out.println("Content after append:");
        System.out.println(readFile(fileName));
    }
}

