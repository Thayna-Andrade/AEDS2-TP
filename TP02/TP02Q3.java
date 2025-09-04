import java.util.*;
public class TP02Q3 {

	public static void iverterstring(String str, int tamanho){ //Função para inverter a String original
		StringBuilder novaString = new StringBuilder();
		if(tamanho > 0){
			for (int i = tamanho-1; i >= 0; i--) { //Laço para percorrer a String de trás para frente
    		novaString.append(str.charAt(i));
		}
		}
		System.out.println(novaString.toString());//Printa a string invertida
		
	}
    public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);

		int tamanho; // Variavel para receber o tamanho da string
		
		while(sc.hasNext()){
			String originalString = sc.nextLine(); //Criação e leitura da string original
			tamanho = originalString.length(); // Coloca o tamanho da string original dentro da variavel tamanho
			if(originalString.equals("FIM")){
				break;
			}
			iverterstring(originalString, tamanho); // Chama a função invertstring
		}
		
		
		
		
		sc.close();

}
}