package shiyan2;

public class Student extends Personnel {  //子类
    public Student(int number, String name, char sex){
        super(number,name,sex);
    }
    public String toString(){
        return "Student(学生信息):  姓名：" + name
                + "    学号：" + number + "   性别：" + sex ;
    }
    }


