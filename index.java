import java.util.Scanner;
public class index {

	public static void main(String[] args) {
		
		listaComandos  todoComados = new listaComandos ();

        System.out.println ("--COMANDOS--");
        System.out.println ("---------------------");
        System.out.println ("Ingresa el comando que buscas: ");
        System.out.println ("-------------------------");
      
        boolean ProgramaOn =true;
        do {
        	Scanner encontarComado = new Scanner(System.in);
        	System.out.println("Comando:  ");
        	String user = encontarComado.nextLine();
    
        	if(user.equals("")) {
        		System.out.println("Ingresa un comado");
        	}else if (user.equals("exit")){
        			ProgramaOn =false;
        	}else{
        		todoComados.buscarComandos(user);
        	}
        }while(ProgramaOn);
     	
	}

}
