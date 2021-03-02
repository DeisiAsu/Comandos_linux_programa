public class listaComandos {

	String Comando[] = new String [26];
	String Descripcion[] = new String [26];
	

     listaComandos(){
    	 
     Comando[0] = "cd";
     Comando[1] = "ls";
     Comando[2] = "pwd";
     Comando[3] = "-l";
     Comando[4] = "-al";
     Comando[5] = "mkdir";
     Comando[6] = "rmdir";
     Comando[7] = "cp";
     Comando[8] = "touch";
     Comando[9] = "cat";
     Comando[10] = "head";
     Comando[11] = "tail";
     Comando[12] = "rm";
     Comando[13] = "mv";
     Comando[14] = "nano";
     Comando[15] = "vim";
     Comando[16] = "grep";
     Comando[17] = "ps";
     Comando[18] = "clear";
     Comando[19] = "nl";

     Comando[20] = "-";
     Comando[21] = "d";
     Comando[22] = "r";
     Comando[23] = "w";
     Comando[24] = "x";
     Comando[25] = "chmod";

     Descripcion [0] = "Se utiliza luego del comando agrega el nombre del directorio y encuentra la carpeta.";
     Descripcion [1] = "permite desplegar un listado del contenido de la carpeta actual, tambi�n puedes especificar la carpeta .";
     Descripcion[2] = "muestra la direcci�n actual en que te encuentras.";
     Descripcion [3] = "muestra m�s detallen en la lista.";
     Descripcion [4] = "permite realizar las dos opciones anteriores declarado en una misma opci�n.";
     Descripcion[5] = "permite crear un directorio nuevo";
     Descripcion [6] = "permite eliminar un directorio, pero no se puede eliminar si tiene contenido.";
     Descripcion[7] = "permite copiar un archivo especifico el nombre  del archivo y el lugar donde se moviliza";
     Descripcion [8] = "con este comando se crea un documento .txt";
     Descripcion [9] = "podemos crear un .txt y ver el contenido de un archivo";
     Descripcion[10] = "el comando head seguido del nombre de un archivo muestra el contenido de las primeras l�neas.";
     Descripcion [11] = "este comando realiza todo lo contrario del comando head.";
     Descripcion[12] = "permite eliminar un archivo, espec�fico luego del comando el nombre del archivo con su extensi�n.";
     Descripcion [13] = "permite movilizar un archivo de un directorio a otro.";
     Descripcion[14] = "permite crear un documento de texto y editarlo su interfaz es m�s simple de utilizar.";
     Descripcion [15] = "permite crear un documento editable de texto.";
     Descripcion [16] = "Encuentra una palabra en espec�fico";
     Descripcion [17] = "mostrar� los procesos que se est�n ejecutando en la terminal actual.";
     Descripcion [18] = "Permite limpiar la terminal";
     Descripcion [19] = "";
     Descripcion [20] = "el guion (-) indica que es un archivo com�n ya sea un ejecutable o un documento de cualquier extensi�n.";
     Descripcion [21] = "este signo indica que el elemento enlistado es un directorio com�n mente conocido como carpeta.";
     Descripcion [22] = "esto indica que tiene permiso de lectura seg�n el grupo a quien este asignado";
     Descripcion [23] = "indica que tiene permiso de escritura.";
     Descripcion [24] = "si el archivo fuera un ejecutable podr�as ver si se tiene permiso de ejecuci�n deun directorio";
     Descripcion [25] = "Para permitir ya sea la lectura, la escritura y ejecuci�n del documento"; 
     
     
    
     
     }
     
     public void buscarComandos(String comando) {
    	 listaComandos lista = new listaComandos ();
    	 String ingresado = comando;
    	 
    	 for(int i=0;i < lista.Comando.length; i++) {
    		 
    		 if (ingresado.equals(lista.Comando[i])){
    			 System.out.println ("     "+Descripcion[i]); 
    		 }
    		 
    	 }
    	 
     }
}
