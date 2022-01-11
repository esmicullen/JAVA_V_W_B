package test.inheritance;

public class RunStu {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name = "김윤서";
		stu1.weight = 50;
		stu1.height = 168;
		stu1.stuId = 1102;
		stu1.gra = 1;
		stu1.ban = 1;
		
		stu1.sleep();
		stu1.wakeup();
		stu1.walk();
		stu1.eat();
		stu1.study();
		stu1.play();
		
	}

}
