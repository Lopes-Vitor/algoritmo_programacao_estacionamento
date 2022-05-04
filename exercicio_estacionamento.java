package exercicios;
import java.util.Scanner;

public class exercicio_estacionamento {

	public static void main(String[] args) {
		//Declarando a variavel
		int res; 
		
		//Declarando o scanner
        Scanner leitor = new Scanner(System.in); 
        
        //Imprimindo uma pergunta para saber se a pessoa e idosa, pcd, gestante ou nenhuma das alternativas
        System.out.print("Digite (1) se for idoso, (2) se for gestante, (3) se for pcd e (4) nenhuma das alternativas"); 
        //Leitura do valor entrado
        res = leitor.nextInt(); 
        
      //utilizando a estrutura condicional IF para ver se a pessoa vai poder estacionar ou nao
        if(res==1 || res==2 || res==3){ 
            System.out.print("Pode estacionar");
        }
        else{ 
            System.out.print("Nao pode estacionar");
        }
        
    }
}