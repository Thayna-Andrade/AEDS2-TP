import java.util.Scanner;

public class TP02Q5 {
    public static boolean eAnagrama(String str,String str1,int tamanho, int tamanho1){ //Função para inverter a String original
        boolean resp = false;                                                          //Inicio a variavél de resposta como falsa
        if(tamanho == tamanho1){ 
            boolean achou[] = new boolean[tamanho];                                    //Compara se o tamanho das duas é igual
            for(int i = 0; i < tamanho; i++){  
                                                                                        //Laço para pegar o primeiro caractere da string
                for(int j =0; j < tamanho; j++){                                       //Laço para percorrer a segunda string
                    if(str.charAt(i) == str1.charAt(j) && !(achou[j])){          //Compara se o caractere da string1 é igual ao caractere da string2
                        resp = true;
                        achou[j] = true;                                               //Se o caractere for igual a resposta recebe verdadeiro e sai da condição
                        j = tamanho;
                    }else{                                                             //Se o tamanho não for igual retorna falso
                        resp = false;
                    }
                }

            }
        }
        if(resp){
            return true;                                                               //Retorna veradadeira se a resposta for verdadeira
        }else{
            return false;                                                              //Como a variavél é inicializada como false e não passa pelo if ela retorna como falsa;
        }
        
		
	}

    public static String cortaString1(String str, int tamanho){                        //String para cortar a primeira parte da String
        int novo = -1;
        for(int i = 0; i < tamanho; i++){                                              //Passa pela string procurando o '-' e coloca o index dele na variavel
            if(str.charAt(i) == '-'){                                                               
                novo = i;       
                i = tamanho;                                                          //Atribui a i o valor do tamanho para sair do laço  
            }
        }
        String parte = str.substring(0, (novo - 1));                                 //Cria uma nova String que recebe a substring
        return parte;                                                                //Retorna a nova String com a primeira parte da String
    }

    public static String cortaString2(String str, int tamanho){                     //Faz a mesma coisa que a outra função porém retornar uma string com a segunda parte da string
        int index = -1;
        for(int i = 0; i < tamanho; i++){
            if(str.charAt(i) == '-'){
                index = i;
                i = tamanho;
            }
        }
        String parte = str.substring((index + 2), tamanho);
        return parte;
    }

    public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);

		int tamanho, tamanho1, tamanho2;                                        // Variaveis para receber o tamanho da string
        boolean resposta;                                                       // Variavel para receber a resposta final

        while(sc.hasNext()){
            String String = (sc.nextLine()).toLowerCase();                      //Criação e leitura da primeira string
            tamanho = String.length();                                          //Coloca o tamanho da String dentro da variavel tamanho
            if (String.equals("fim")) {
                break;
            }else{
                String String1 = cortaString1(String, tamanho), String2 = cortaString2(String, tamanho); //

		        tamanho1 = String1.length();                                   // Coloca o tamanho da string1 dentro da variavel tamanho1
		        tamanho2 = String2.length();                                   // Coloca o tamanho da string2 dentro da variavel tamanho2

		        resposta = eAnagrama(String2, String1, tamanho1, tamanho2);    // Chama a função ieAnagrama
		
		        if(resposta){                                                  // Checa se a resposta é verdadeira ou falsa e printa sim ou não de acordo com o pedido na questão
                    System.out.println("SIM");
;                }else{
                    System.out.println("N\u00C3O");
                }
            }
        }

		
		sc.close();
    }

}
