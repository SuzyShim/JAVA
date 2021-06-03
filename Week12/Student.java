public class Student implements Comparable<Student> {
	
	private String id;
	private String name;
	private Integer age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student s) {
		//��Ҫ���� ������������
		int num = this.getAge()-s.getAge();
		//��Ҫ����1 ������ͬ��ѧ�Ų�һ����ͬ
		num = num==0?this.getId().compareTo(s.getId()):num;
		//��Ҫ����2 ���䣬ѧ����ͬ��������һ����ͬ
		num = num==0?this.getName().compareTo(s.getName()):num;
		
		return num;
	}
	
	

}

