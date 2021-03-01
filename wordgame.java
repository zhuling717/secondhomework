package homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

class word{
   private String name;
   private int life;
   private int atk;
   private int fy;
   public void st(){}
   public void st(String name,int life,int atk,int fy){
   this.setName(name);
   this.setLife(life);
   this.setAtk(atk);
   this.setFy(fy);

   }

   private void setFy(int fy) {
        fy=this.fy;
   }
   private void setAtk(int atk) {
      atk=this.atk;
   }

   private void setLife(int life) {
      life=this.life;
   }

   private void setName(String name) {
      name=this.name;
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
}
class guai extends word{
   private String name1;
   private int life1;
   private int atk1;
   private int fy1;
   public void st(){}
   public void st(String name1,int life1,int atk1,int fy1){
      this.setName1(name1);
      this.setLife1(life1);
      this.setAtk1(atk1);
      this.setFy1(fy1);

   }

   private void setFy1(int fy1) {
      fy1=this.fy1;
   }
   private void setAtk1(int atk1) {
      atk1=this.atk1;
   }

   private void setLife1(int life1) {
      life1=this.life1;
   }

   private void setName1(String name1) {
      name1=this.name1;
   }

   public String getName1() {
      return name1;
   }

   public int getAtk1() {
      return atk1;
   }

   public int getFy1() {
      return fy1;
   }

   public int getLife1() {
      return life1;
   }
}

public class wordgame extends guai{

   public void main(String[] args) {
      inword();
      inguai();
      System.out.println("玩家需要输入的信息：");
      System.out.println("| 属性   | 字段类型及约束 | 说明  ");
      System.out.println("| ------ | -------------- | -------------------------------------------------- |");
      System.out.println("| 名称   | String（1-50） |            "+getName()+"                              |");
      System.out.println("| 生命值 | int（1-999）   |      "+getLife()+"                              |");
      System.out.println("| 攻击力 | int（1-999）   |       "+getAtk()+"            |");
      System.out.println(" 防御力 | int（1-999）   | "+getFy()+"         |");
      System.out.println("怪物需要输入的信息：");
      System.out.println("| 属性   | 字段类型及约束 | 说明  ");
      System.out.println("| ------ | -------------- | -------------------------------------------------- |");
      System.out.println("| 名称   | String（1-50） |            "+getName1()+"                              |");
      System.out.println("| 生命值 | int（1-999）   |      "+getLife1()+"                              |");
      System.out.println("| 攻击力 | int（1-999）   |       "+getAtk1()+"            |");
      System.out.println(" 防御力 | int（1-999）   | "+getFy1()+"         |");
      System.out.println("============================================");
      System.out.println("战斗阶段：");
      battle();
   }
   public void inword(){
      Scanner in = new Scanner(System.in);
      System.out.println("请输入主角名字：");
      String  name = in.nextLine();
      System.out.println("请输入"+name+"生命：");
      int life=in.nextInt();
      System.out.println("请输入"+name+"攻击：");
      int atk=in.nextInt();
      System.out.println("请输入"+name+"防御");
      int fy=in.nextInt();
   }
   public void inguai(){
      Scanner in = new Scanner(System.in);
      System.out.println("请输入怪兽类别：");
      String  name1 = in.nextLine();
      System.out.println("请输入"+name1+"生命：");
      int life1=in.nextInt();
      System.out.println("请输入"+name1+"攻击：");
      int atk1=in.nextInt();
      System.out.println("请输入"+name1+"防御");
      int fy1=in.nextInt();
   }
   public void battle(){
      String a=getName();
      String a1=getName1();
      int b=getLife();
      int b2=b;
      int b1=getLife1();
      int c=getAtk();
      int c1=getAtk1();
      int d=getFy();
      int d1=getFy1();
      for (int i = 1; i>=0 ; i++) {

         System.out.println("第"+i+"回合");
         for (int j = 1; j <=2 ; j++) {
            while(j==1){
               System.out.print(a+"=攻击=>"+a1+",");
               int e=c-d1;
               if(c>d1){
                  b1=b1-e;
                  System.out.println(a1+"受到"+e+"点伤害");
               }else{
                  b1=b1-1;
                  System.out.println(a1+"受到"+1+"点伤害");
               }

            }
            System.out.println(a1+"=攻击=>"+a);
            int e=c1-d;
            if(c1>d){
               b=b-e;
               System.out.println(a+"受到"+e+"点伤害");
            }else{
               b=b-1;
               System.out.println(a+"受到"+1+"点伤害");
            }

         }
         if(b==0){
            System.out.println("战斗结束"+a1+"==胜利");
            break;
         }else if(b1==0){
            System.out.println("战斗结束"+a+"==胜利");
            break;
         }
      }
      if(b!=0){
          b=0+b2;
      }
   }
}
