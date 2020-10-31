package shiyan2;

public class Teacher extends Personnel {  //子类
    String lesson;
    public Teacher(int number, String name, char sex, String lesson){
        super(number,name,sex);
        this.lesson = lesson;
    }

    public String toString(){
        return "Teacher(教师信息):" +"  编号：" + number
                + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }
    }




