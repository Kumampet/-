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
        Member[] members;

        System.out.println("アイドルを結成しよう！");

        while (true) {
            System.out.println("----------------------");
            System.out.println("部員を追加しますか？");
            System.out.println("はい->1");
            System.out.println("いいえ->1以外");
            n = Integer.parseInt(read.readLine());
            if (n == 1) {
                // メンバーオブジェクトの生成
                num++;
                memner[num] = new Member();

                // 生成たメンバーの名前を入力
                System.out.println("名前を決めてあげてね！");
                members[num].name = read.readLine();
                System.out.println("新しいメンバーが加入したよ！");
            }else{
                System.out.println("終了するよ！");
                break;
            }
        }
    }
}