package shiyan2;

public class Courses {
    int number;
    String Coursesname;
    String place;
    float time;
    float score;

    public Courses(String coursesname, int number, String place, float time, float score) {
        this.Coursesname = coursesname;
        this.number = number;
        this.place = place;
        this.time = time;
        this.score = score;
    }

    public String toString() {
        return Coursesname+    "(课程信息)" + "     课程编号：" + number + "   上课地点：" + place
                + "    课程时间：" + time + "小时" + "     课程学分：" + score + "分";
    }
}