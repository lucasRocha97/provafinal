package br.lucas.prova;

interface Show{
	void show(Integer num);
}

class A implements Show{
	@Override
	public void show(Integer num){
		String str = String.valueOf(num);
		int result = Integer.parseInt(str.substring(5,6));
		if(result > 10){
			result = result % 10;
		}
		System.out.println(result);
	}
}

class B extends A{
	public void show(Integer num){
		super.show(num +1000);
	}
}

public class Exer05{
	public static void main(String[] args) {
		execute(160477);
	}
	
	public static void execute(Integer num){
		Show s = new B();
		s.show(num);
	}
}
