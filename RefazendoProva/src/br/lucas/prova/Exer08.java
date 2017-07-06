package br.lucas.prova;

public class Exer08 {

	public static void execute(Integer ii){
		char[] c = String.valueOf(ii).toCharArray();
		int j = 0;
		for(char cc : c){
			int i = Integer.parseInt(String.valueOf(cc));
			if(i > j){
				j = i;
			}else{
				j--;
			}
		}
		System.out.print(j);
	}
	
	public static void main(String[] args) {
		execute(160477);
	}
	
}
