
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class TestStudent {

	
	/*
	 * 3.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
	 * 将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，
	 * 要求集合中的元素按照年龄大小正序排序；
	 * 最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。
	 *
	 *技能点
	 *  Scanner
	 *  对象
	 *  集合
	 *  流
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<>();
		System.out.println("请输入学生信息按照如下格式：1001#张三#20");
		while(true){
			String info = sc.nextLine();
			if("exit".equals(info)){
				break;
			}
			//切割字符串
			String[] str = info.split("#");
			//分别获取属性信息
			Student student = new Student(str[0], str[1], Integer.parseInt(str[2]));
			//将对象封装到集合
			ts.add(student);
		}
		//创建字符缓冲输出流
		BufferedWriter bw = null;
		try {
			 bw = new BufferedWriter(new FileWriter("Student.docx"));
			 //遍历集合
			 bw.write("学号\t姓名\t年龄");
			 bw.newLine();
			 for(Student stu:ts){
				bw.write(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge());
				bw.newLine();
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("学生信息录入完毕");
		
		
	}
}

