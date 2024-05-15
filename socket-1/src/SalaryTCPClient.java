import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.Socket; //ネットワーク関連のパッケージを利用する
import java.util.Scanner;

public class SalaryTCPClient {

    public static void main(String arg[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5000など) → ");
            int port = scanner.nextInt();
            System.out.println("localhostの" + port + "番ポートに接続を要求します");
            Socket socket = new Socket("localhost", port);
            System.out.println("接続されました");

            System.out.println("あなたの今月のお給料を送ります。");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("日給を入力してください。↓");
            String message = scanner.next();
            int daysalary = Integer.parseInt(message);
            System.out.println("勤務日数を入力してください。 ↓");
            String content = scanner.next();
            int workdays = Integer.parseInt(content);
            scanner.close();

            SalaryPresent present = new SalaryPresent();
            present.setMessage(message);
            present.setContent(content);
            present.setDaysalary(daysalary);
            present.setWorkdays(workdays);

            oos.writeObject(present);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            SalaryPresent okaeshiPresent = (SalaryPresent) ois.readObject();

            String replayMsg = okaeshiPresent.getMessage();
            System.out.println("サーバからのメッセージは" + replayMsg);

            ois.close();
            oos.close();
            socket.close();

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.err.println("ポート番号が不正か、サーバが起動していません");
            System.err.println("サーバが起動しているか確認してください");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}
