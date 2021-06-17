
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class TestStudent {

	
	/*
	 * 3.�ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�ţ�������������Ϣ�������������Ϊexit�˳���
	 * �������ѧ����Ϣ�ֱ��װ��һ��Student�����У��ٽ�ÿ��Student������뵽һ�������У�
	 * Ҫ�󼯺��е�Ԫ�ذ��������С��������
	 * ���������ϣ���������ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ�С�
	 *
	 *���ܵ�
	 *  Scanner
	 *  ����
	 *  ����
	 *  ��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<>();
		System.out.println("������ѧ����Ϣ�������¸�ʽ��1001#����#20");
		while(true){
			String info = sc.nextLine();
			if("exit".equals(info)){
				break;
			}
			//�и��ַ���
			String[] str = info.split("#");
			//�ֱ��ȡ������Ϣ
			Student student = new Student(str[0], str[1], Integer.parseInt(str[2]));
			//�������װ������
			ts.add(student);
		}
		//�����ַ����������
		BufferedWriter bw = null;
		try {
			 bw = new BufferedWriter(new FileWriter("Student.docx"));
			 //��������
			 bw.write("ѧ��\t����\t����");
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
		System.out.println("ѧ����Ϣ¼�����");
		
		
	}
}
