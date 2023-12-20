//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola Mundo desde Java");
        //var - Inferencia de tipos en Java
        var miVariableEntera = 10;
        System.out.println(miVariableEntera);

        var miVariableCadena = "Hola";
        //sout + tabulador // soutv + tabulador
        System.out.println("miVariableCadena = " + miVariableCadena);

        
        //CONCATENACION
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println(i+j);
        //si primero tenemos numeros y luego una cadena primero se realiza la suma y luego concatena la cadena
        System.out.println(i+j+usuario);
        System.out.println(i+usuario+j);
        //si primero encuentra una cadena todo lo demas lo va a tomar como una cadena
        System.out.println(usuario+i+j);
        //modificamos la prioridaz consiguiendo que primero se sumen los numeros
        System.out.println(usuario+(i+j));
        
        
        //CARACTERES ESPECIALES
        var nombre = "Laura";
        System.out.println("Nueva linea: \n"+ nombre);
        System.out.println("Tabulador: \t"+ nombre);
        //Se retrocede un caracter atras
        System.out.println("Retroceso: \b"+ nombre);
        System.out.println("Retroceso:\b\b"+ nombre);
        //Comilla doble dentro de una cadena
        System.out.println("Comilla doble: \""+ nombre+ "\"");
    }

}
