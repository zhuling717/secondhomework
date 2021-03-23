package homework;



import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

class create {
    private String name;
    private int life;
    private int atk;
    private int fy;

    public void st(String name, int life, int atk, int fy) {
        this.setName(name);
        this.setLife(life);
        this.setAtk(atk);
        this.setFy(fy);

    }

    private void setFy(int fy) {
        fy = this.fy;
    }

    private void setAtk(int atk) {
        atk = this.atk;
    }

    private void setLife(int life) {
        life = this.life;
    }

    private void setName(String name) {
        name = this.name;
    }

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }

    public int getFy() {
        return fy;
    }

    public int getLife() {
        return life;
    }

    public String name() {
        Scanner n = new Scanner(System.in);
        ;
        AtomicReference<String> sn = new AtomicReference<>(n.nextLine());
        return sn.get();
    }

    public int num() {
        Scanner nu = new Scanner(System.in);
        AtomicInteger n = new AtomicInteger(nu.nextInt());
        return n.get();
    }

    public void in(String n) {
        System.out.println("请创建一个" + n + "角色");
        name = name();
        System.out.println("请为你的角色添加属性：");
        System.out.println(n + "生命值  ");
        life = num();
        System.out.println(n + "攻击力  ");
        atk = num();
        System.out.println(n + "防御力  ");
        fy = num();
    }
}
    class Character extends create{
     public void in(){
         super.in("战士");
    }

}
class Griffin extends create{
    public void in(){
        super.in("暗影兽");
    }
}
class fight{
    int k;
    public fight(){
    k=0;
    }


    public  void battle() {

        Character a=new Character();
        a.in();
        Griffin  g=new Griffin();
        g.in();
    System.out.println("玩家需要输入的信息：");
    System.out.println("| 属性   | 字段类型及约束 | 说明  ");
    System.out.println("| ------ | -------------- | -------------------------------------------------- |");
    System.out.println("| 名称   | String（1-50） |             " + a.getName()+ "                               |");
    System.out.println("| 生命值 | int（1-999）   |      " + a.getLife() + "                              |");
    System.out.println("| 攻击力 | int（1-999）   |       " + a.getAtk() + "            |");
    System.out.println(" 防御力 | int（1-999）   | " + a.getFy()+ "         |");
    System.out.println("怪物需要输入的信息：");
    System.out.println("| 属性   | 字段类型及约束 | 说明  ");
    System.out.println("| ------ | -------------- | -------------------------------------------------- |");
    System.out.println("| 名称   | String（1-50） |            " + g.getName() + "                              |");
    System.out.println("| 生命值 | int（1-999）   |      " + g.getLife() + "                              |");
    System.out.println("| 攻击力 | int（1-999）   |       " + g.getAtk() + "            |");
    System.out.println(" 防御力 | int（1-999）   | " + g.getFy() + "         |");
       int b=a.getLife();
       int j=1;
       int y=g.getLife();
       int x=a.getLife();
       int i;
        for ( i = 1; i >= 0; i++) {

            System.out.println("第" + i + "回合");

                while (j == 1) {
                    System.out.print(a.getName() + "=攻击=>" + g.getName() + ",");
                    int e = a.getAtk() - g.getFy();
                    if (a.getAtk() > g.getFy()) {
                        y = y - e;
                        System.out.println(g.getName()+ "受到" + e + "点伤害");
                        System.out.println("人：给点力，不然我要飘了！");
                    } else {

                        y = y- 1;
                        System.out.println(g.getName() + "受到" + 1 + "点伤害");
                        System.out.println("人：什么怪这么强！");
                    }
                    j++;
                    if ( y== 0||y<0) {
                        System.out.println("战斗结束" + g.getName() + "==胜利");

                        break;
                    }
                }
                System.out.println(g.getName() + "=攻击=>" + a.getName());
                int e = g.getAtk() - a.getFy();
                if (g.getAtk() > a.getFy()) {

                    x = x - e;
                    System.out.println(a.getName() + "受到" + e + "点伤害");
                    System.out.println("兽：吱吱吱!");
                } else {

                    x = x - 1;
                    System.out.println(a.getName() + "受到" + 1 + "点伤害");
                    System.out.println("人：我初入江湖，给点力啊！");
                }

              if (x < 0||x == 0) {
                System.out.println("战斗结束" + a.getName() + "==胜利");

                System.out.println(a.getName()+"的血量回复到"+b);
                  System.out.println("得到123经验，升级！");
                  System.out.println("| 名称   | String（1-50） |             " + a.getName()+ "                               |");
                  System.out.println("| 生命值 | int（1-999）   |      " + (a.getLife()+12) + "                              |");
                  System.out.println("| 攻击力 | int（1-999）   |       " + (a.getAtk()+3) + "            |");
                  System.out.println(" 防御力 | int（1-999）   | " + (a.getFy()+2)+ "         |");
                break;
            }
            j=1;
        }
        System.out.println("一共进行了"+i+"回合");


    }
}
public class wordg {

    public static void main(String[] args) {
        fight q = new fight();
        System.out.println("============================================");
        System.out.println("战斗阶段：");
        q.battle();
    }
}