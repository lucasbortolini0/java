package multiplicacao;
import java.security.SecureRandom;
import java.util.Scanner;


public class Multiplicacao {
	private static final SecureRandom numerosAleatorios = new SecureRandom();

	public static void main (String[] args) 
        {
		int primeiro = 1 + numerosAleatorios.nextInt(9);
		int segundo = 1 + numerosAleatorios.nextInt(9);
		
        System.out.println("Quanto é " + primeiro + "X" + segundo + "?");
        
        int conta = primeiro * segundo;
        
        Scanner entrada = new Scanner(System.in);
        int resposta;
        
        System.out.println("Digite sua resposta: ");
        resposta = entrada.nextInt();
        
                
        
        
        if(conta == resposta){
            System.out.println("Ta SERTO");                
	}else{
              
        
        while(resposta !=(primeiro * segundo)){
            System.out.println("ERROOUUU. Tenta denovo");
            System.out.println("Quanto é " + primeiro + "X" + segundo + "?");
            resposta = entrada.nextInt();
       
            }
        System.out.println("Ta SERTO");          
        }
             
    }
}
