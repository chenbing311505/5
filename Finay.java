package work;

public class Finay {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int w;
        StringBuffer str2 = null;
        Handle xms = new Handle();
        StringBuffer str1 = xms.Read();
        Homework one = new Homework();
        str2 = one.HW(str1);
        Handle.Write(str2);

        System.out.println("请输入要查询的字符：");
        String z = input.next();
        w = xms.getCharMaps(z,str1);

        System.out.println("******************学生信息*********************");
        Student xm = new Student();
        xm.setName("王小明");
        xm.setAge(20);
        xm.setNumber(2019666888);
        xm.setSex("男");
        System.out.println("学生姓名:" + xm.getName());
        System.out.println("学生年龄:" + xm.getAge());
        System.out.println("学生编号:" + xm.getNumber());
        System.out.println("学生性别:" + xm.getSex());

        System.out.println("作业处理完成");
        System.out.println(z + "出现的次数为："+ z + "次");
    }

}
