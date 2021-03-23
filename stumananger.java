package type;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class stumananger {
    public static void main(String[] args) {
        ArrayList<student> array=new ArrayList<student>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统----------");
            System.out.println("1，添加学生");
            System.out.println("2，删除学生");
            System.out.println("3，修改学生");
            System.out.println("4，查看所有学生");
            System.out.println("5，查找学生");
            System.out.println("6，退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    AddStu(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    removestu(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    changestu(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findstu(array);
                    break;
                case "5":
                    System.out.println("查找学生");
                    searchstu(array);
                    break;
                case "6":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }
    public static void AddStu(ArrayList<student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid=sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age=sc.nextLine();
        System.out.println("请输入学生地址：");
        String address=sc.nextLine();

        student s=new student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加成功");
    }
    public static void findstu(ArrayList<student> array){
        if(array.size()==0){
            System.out.println("无信息，请添加再查询！");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t地址：");
        for (int i = 0; i <array.size() ; i++) {
            student st=array.get(i);
            System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getAge()+"岁\t"+st.getAddress());
        }
    }
    public static void removestu(ArrayList<student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除学生的学号：");
        String sid=sc.nextLine();


        for (int i = 0; i <array.size() ; i++) {
           student s=array.get(i);
           if(s.getSid().equals(sid)){
               array.remove(i);
               break;
           }
        }
        System.out.println("删除成功");
    }
    public static void changestu(ArrayList<student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号");
        String sid=sc.nextLine();

        System.out.println("请输入新学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入新学生年龄");
        String age=sc.nextLine();
        System.out.println("请输入新学生地址");
        String address=sc.nextLine();

        student s=new student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int i = 0; i <array.size() ; i++) {
            student st=array.get(i);
            if(st.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

        System.out.println("修改成功");
    }
    public static void searchstu(ArrayList<student> array){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入你要查找的学号：");
        String sid=in.nextLine();
        for (int i = 0; i <array.size() ; i++) {
           student se=array.get(i);
           if(se.getSid().equals(sid)){
               System.out.println("学号\t\t\t姓名\t\t年龄\t\t地址：");
               System.out.println(se.getSid()+"\t"+se.getName()+"\t"+se.getAge()+"岁\t"+se.getAddress());
           }
        }
    }
}