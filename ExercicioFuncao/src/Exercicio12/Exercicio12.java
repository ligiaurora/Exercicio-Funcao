package Exercicio12;

public class Exercicio12 {
public static void main(String args[]){
		
		String letras= "palavra";
		System.out.println(inverso(letras)); 
	
	 }
	
	public static String inverso (String inverso) {
	
		char[] ch = new char[inverso.length()];
		
        for (int i = 0; i < inverso.length(); i++) {
            ch[i] = inverso.charAt(i);
        }
        
        String resultado = "";
        for (int i = inverso.length()-1; i >= 0; i--) {
        	resultado = resultado + ch[i];
        }
        return resultado;
	
	}
	
}
