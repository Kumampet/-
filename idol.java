import java.io.*;

class Members {
    String name, grade, sex;
    int age, month, day;
    double bast, waist, hip, hight;
}

class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, n;
        Members[] members = new Members[10000];

        System.out.println("アイドルを結成しよう！");

        while (true) {
            System.out.println("----------------------");
            System.out.println("どうしますか？");
            System.out.println("メンバーを追加する-> 1");
            System.out.println("登録されているメンバーを見る-> 2");
            System.out.println("終了する-> 1,2以外");
            n = Integer.parseInt(read.readLine());
            if (n == 1) {
                // メンバーオブジェクトの生成
                members[num] = new Members();

                // 生成たメンバーの性別を入力
                System.out.println("性別は？(0: 男の子！, 1: 女の子！)");
                if (Integer.parseInt(read.readLine()) == 0) {
                    members[num].sex = "男の子";
                } else {
                    members[num].sex = "女の子";
                }

                // 生成たメンバーの名前を入力
                System.out.println("名前は？");
                members[num].name = read.readLine();

                // 生成したメンバーの年齢を入力
                System.out.println("年齢は？");
                members[num].age = Integer.parseInt(read.readLine());

                // 生成したメンバーの学年を入力
                System.out.println("学年は？");
                members[num].grade = read.readLine();

                // 生成したメンバーの身長を入力
                System.out.println("身長は？");
                members[num].hight = Integer.parseInt(read.readLine());

                // 生成したメンバーのスリーサイズを入力
                System.out.println("スリーサイズは？");
                System.out.println("ばすと！");
                members[num].bast = Integer.parseInt(read.readLine());
                System.out.println("うぇすと！");
                members[num].waist = Integer.parseInt(read.readLine());
                System.out.println("ひっぷ！");
                members[num].hip = Integer.parseInt(read.readLine());

                // 誕生日を入力
                System.out.println("誕生日はいつ？");
                System.out.println("何月生まれ？");
                members[num].month = Integer.parseInt(read.readLine());
                System.out.println(members[num].month + "月の何日生まれ？");
                members[num].day = Integer.parseInt(read.readLine());

                System.out.println("---------------------------------------");
                System.out.println("---------------------------------------");
                System.out.println("----------これで間違いない？-------------");
                System.out.println("---------------------------------------");
                System.out.println("---------------------------------------");

                System.out.println("名前：" + members[num].name);
                System.out.println("性別：" + members[num].sex);
                System.out.println("年齢：" + members[num].age);
                System.out.println("身長：" + members[num].hight);
                System.out.println("バスト：" + members[num].bast);
                System.out.println("ウェスト：" + members[num].waist);
                System.out.println("ヒップ：" + members[num].hip);
                System.out.println("誕生日：" + members[num].month + "月 " + members[num].day + "日");

                System.out.println("---------------------------------------");
                System.out.println("大丈夫！-> 1, ダメ！-> 1以外");
                System.out.println("---------------------------------------");
                if (Integer.parseInt(read.readLine()) == 1) {
                    num++;
                    System.out.println("新しいメンバーが加入したよ！");
                } else {
                    System.out.println("もう一回入力しなおしてね");

                }
            } else if (n == 2) {
                // 登録メンバーの表示
                if (num == 0) {
                    System.out.println("まだ一人もいないよ！");
                } else {
                    for (int i = 0; i < num; i++) {

                        System.out.println("-----------" + (i+1) + "人目-----------");
                        System.out.println("名前：" + members[i].name);
                        System.out.println("性別：" + members[i].sex);
                        System.out.println("年齢：" + members[i].age);
                        System.out.println("身長：" + members[i].hight);
                        System.out.println("バスト：" + members[i].bast);
                        System.out.println("ウェスト：" + members[i].waist);
                        System.out.println("ヒップ：" + members[i].hip);
                        System.out.println("誕生日：" + members[i].month + "月 " + members[i].day + "日");
                    }
                }
            } else {
                System.out.println("終了するよ！");
                break;
            }
        }
    }
}