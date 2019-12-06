import java.io.*;

class Member {
    String name;
    int age, grade;
    double bast, waist, hip;
}

class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, n;
        Member[] m;

        System.out.println("アイドルを結成しよう！");

        while (true) {
            System.out.println("----------------------");
            System.out.println("部員を追加しますか？");
            System.out.println("はい->1");
            System.out.println("いいえ->1以外");
            n = Integer.parseInt(read.readLine());
            if (n == 1) {
                System.out.println("部員を追加！");
            }else{
                System.out.println("終了するよ！");
                break;
            }
        }
    }
}