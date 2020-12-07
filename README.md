# Java-1
实验三
一、实验目的
1、学会定义类中的属性和方法
2、掌握面向对象的类设计方法（属性、方法）
3、掌握类的继承用法，通过构造方法实例化对象；
4、学会使用super()，用于实例化子类；
5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中


二、实验要求
实验说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
实验对象：
人员（编号、姓名、性别）
教师（编号、姓名、性别、所授课程）
学生（编号、姓名、性别、所选课程）
课程（编号、课程名称、上课地点、时间、授课教师）
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
3.编写实验报告。


三、流程图




四、核心代码
这部分代码是与选课退课部分相关的代码，利用if先判断是否选到课，然后用while判断是否能退课（没选的课不能退），用break结束循环。
System.out.println("请输入1,2,3进行退课: ");
        int y = in.nextInt();

        while (x == 1)       // 确保只能退已选课程
            if (y == 1) {
                a = e;
                System.out.println("已退课: " + e);
                System.out.println(b);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (x == 2)
            if (y == 2) {
                a = f;
                System.out.println("已退课: " + f);
                System.out.println(c);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (x == 3)
            if (y == 3) {
                a = g;
                System.out.println("已退课: " + g);
                System.out.println(d);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }
五、实验过程
1.先确定Personnel为父类，Teacher和Student为子类， 并用用extends继承父类的属性和方法。
2.确定每个类所拥有的属性并依据属性进行类型定义。
3.利用super函数调用父类的构造方法，实例化子类。
4.用this关键字给每一个变量传递它们的值。
5.在父类Personnel和Courses类里利用toString来返回字符串本身，生成值。
6. 利用Scanner来获取用户的输入，跟if一起实现判断选课和退课的操作，利用while和break对于退课环节加深处理。
7.最后将所有需要的信息输出出来。
六、实验结果



