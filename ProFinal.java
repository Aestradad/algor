import java.util.Scanner;
public class ProFinal{
public static void main(String[] args) {
String guardar = " ";
int p = 0,p2 = 0,codigo = 0, seleccion = 0;
Scanner leer = new Scanner(System.in);
while(true){
System.out.println("Menu Principal");
System.out.println("Suma");
System.out.println("Resta");
System.out.println("Multiplicacion");
System.out.println("Division");
System.out.println("Bitacora");
System.out.println("Eliminar B.");
System.out.println("Salir");
System.out.print("elija la opcion");
seleccion = leer.nextInt();
System.out.println("");
switch(seleccion){
case 1: System.out.println("eligio\"suma \"");
System.out.print("Primer Numero: ");
p = leer.nextInt();
System.out.print(" Segundo Numero: ");
p2 = leer.nextInt();
codigo = p+p2;
System.out.println(""); 
System.out.print("el resultado es: " + codigo);
guardar += +p+"+"+p2+"="+codigo;
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" "); break;
case 2: System.out.println("eligio\" Resta \"");
System.out.print("Primer Numero: ");
p = leer.nextInt();
System.out.print("Segundo Numero: ");
p2 = leer.nextInt();
codigo = p-p2;
System.out.println(" "); 
System.out.print("Resultado: " + codigo);
guardar += +p+"-"+p2+"="+codigo;
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" "); break;
case 3: System.out.println("eligio \" Multiplicacion \"");
System.out.print("Primer Numero: ");
p = leer.nextInt();
System.out.print("Segundo Numero: ");
p2 = leer.nextInt();
codigo = p*p2;
System.out.println(""); 
System.out.print("Resultado: " + codigo);
guardar += +p+"*"+p2+"="+codigo;
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" ");  break;    
case 4: System.out.println("eligio\" Division \"");
System.out.print("Primer Numero: ");
p = leer.nextInt();
System.out.print("Segundo Numero: ");
p2 = leer.nextInt();
if(p2 > 0){
codigo = p/p2;
System.out.println(""); 
System.out.print("resultado: " + codigo);
guardar += +p+"/"+p2+"="+codigo;
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" ");  }
else{ System.out.println(" ");
System.out.println("+error");
guardar += +p+"/"+p2+"=error";
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" "); } break;
case 5: System.out.println("eligio \" bitacora\"");
System.out.println(guardar);
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" "); break;    
case 6: System.out.println("eligio \" Eliminar B. \"");
System.out.println("quiere Eliminar bitacora");
System.out.println("1 Continuar 2 volver menu principal");
p = leer.nextInt();
if(p== 1){ System.out.println("eliminado con exito");
guardar = " ";
System.out.println("presione cualquier numero para volver al menu");
leer.nextInt();
System.out.println(" ");}
else if(p == 2){}
else{System.out.println("colocar 1 o 2"); } break;    
case 7: System.exit(0);
System.out.println(" "); break;        
default: System.out.print("numero mayor a 7 no valido");
System.out.println(" "); break;}}}}