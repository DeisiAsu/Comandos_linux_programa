import java.util.Scanner;
public class index {

	public static void main(String[] args) {

		listaComandos  todoComados = new listaComandos ();

        System.out.println ("*    --COMANDOS--   *");
        System.out.println ("---------------------");
        System.out.println ("Ingresa el comando que buscas: ");
        System.out.println (" *Se encontrar los comando que necesite "
        	+ " y si no tienes en mente que comando buscar utilizar la variable Lista *");

        String Lista = "LISTA";
        boolean ProgramaOn =true;
        do {
        	Scanner encontarComado = new Scanner(System.in);
        	System.out.println("Comando:  ");
        	String user = encontarComado.nextLine();


        	if(user.equals("")) {
                 System.out.println("Ingresa un comado");
                 System.out.println("*Intenta de  nuevo*");
                 
        	 }else if (user.equals("exit")){
        		 System.out.println("Adios Feliz día ");
                     ProgramaOn =false;

      
        	 }else if(user.equals("Lista")) {
                	System.out.println("LISTA: " +
                			"\"cd\"\r\n" +
                			"\"ls\"\r\n" +
                			"\"pwd\"\r\n" +
                			"\"-l\"\r\n" +
                			"\"-al\"\r\n" +
                			"\"mkdir\"\r\n" +
                			"\"rmdir\"\r\n" +
                			"\"cp\"\r\n" +
                			"\"touch\"\r\n" +
                			"\"cat\"\r\n" +
                			"\"head\"\r\n" +
                			"\"tail\"\r\n" +
                			"\"rm\"\r\n" +
                			"\"mv\"\r\n" +
                			"\"nano\"\r\n" +
                			"\"vim\"\r\n" +
                			"\"grep\"\r\n" +
                			"\"ps\"\r\n" +
                			"\"clear\"\r\n" +
                			"\"nl\"\r\n" +
                			"\"-\"\r\n" +
                			"\"d\"\r\n" +
                			"\"r\"\r\n" +
                			"\"w\"\r\n" +
                			"\"x\"\r\n" +
                			"\"chmod\"\r\n" +
                			"");

               }else{
            	   todoComados.buscarComandos(user);	
 			}

        }while(ProgramaOn);
	}

}
