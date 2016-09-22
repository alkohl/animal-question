import java.util.Scanner;

/**
 * Created by sunnior on 9/22/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入记录信息:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            sb.append(str);
            sb.append("\n");
        }

        String historyData = sb.toString();
        System.out.println("输出为:");
        System.out.println(historyData);
    }
}
