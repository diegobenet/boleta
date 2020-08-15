/**************************************************************

Autor: Diego Elizondo Benet
Fecha: 27/09/2019
Objetivo: Registrar las materias con sus calificaciones y faltas de un alumno en su boleta.

***************************************************************/

//Principal
import java.io.*;
import java.text.DecimalFormat;
//aqui empieza la clase principal
class Principal
{
//aqui empieza el main
   public static void main(String arg[])
   {
      //Crea 6 objetos Materia
      Materia m1 = new Materia(Principal.nombre(), Principal.crn(), Principal.parcial(), Principal.parcial(), Principal.parcial(), Principal.faltas(), Principal.faltas(), Principal.faltas());
      Materia m2 = new Materia(Principal.nombre(), Principal.crn(), Principal.parcial(), Principal.parcial(), Principal.parcial(), Principal.faltas(), Principal.faltas(), Principal.faltas());
      Materia m3 = new Materia(Principal.nombre(), Principal.crn(), Principal.parcial(), Principal.parcial(), Principal.parcial(), Principal.faltas(), Principal.faltas(), Principal.faltas());
      Materia m4 = new Materia(Principal.nombre(), Principal.crn(), Principal.parcial(), Principal.parcial(), Principal.parcial(), Principal.faltas(), Principal.faltas(), Principal.faltas());
      Materia m5 = new Materia(Principal.nombre(), Principal.crn(), Principal.parcial(), Principal.parcial(), Principal.parcial(), Principal.faltas(), Principal.faltas(), Principal.faltas());
      Materia m6 = new Materia(Principal.nombre(), Principal.crn(), Principal.parcial(), Principal.parcial(), Principal.parcial(), Principal.faltas(), Principal.faltas(), Principal.faltas());

      Boleta b1 = new Boleta(Principal.matricula(), Principal.periodo(), m1, m2, m3, m4, m5, m6); //crea objeto Boleta
      
      System.out.println(b1); //despliega el valor de Boleta b1
   }
   //metodo para que el usuario ingrese el nombre de la materia
   public static String nombre()
   {
      System.out.println("Ingrese el nombre de la materia");
      return Lectura.readString();
      //metodo para que el usuario ingrese su calificacion
   }public static byte parcial()
   {
      System.out.println("Ingrese la calificacion de la materia");
      return Lectura.readByte();
   }
   //metodo para que el usuario ingrese sus faltas
   public static byte faltas()
   {
         System.out.println("Ingrese las faltas de la materia");
       return Lectura.readByte();
   }
   //metodo para que el usuario ingrese el crn
   public static short crn()
   {
      System.out.println("Crn de la materia");
      return Lectura.readShort();
   }
   //metodo para que el usuario ingrese la matricula
   public static int matricula()
   {
      System.out.println("Matricula de alumno");
      return Lectura.readInt();
   }
   //metodo para que el usuario ingrese el periodo
   public static String periodo()
   {
      System.out.println("Ingrese el periodo");
      return Lectura.readString();
   }
   
}
//aqui empieza la clase boleta
class Boleta{
   private int matricula;
   private String periodo;
   private Materia m1;
   private Materia m2;
   private Materia m3;
   private Materia m4;
   private Materia m5;
   private Materia m6;
//Metodo constructor de boleta
public Boleta(int matricula, String periodo, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5, Materia m6){
   setMatricula(matricula);
   setPeriodo(periodo);
   
   setM1(m1);
   setM2(m2);
   setM3(m3);
   setM4(m4);
   setM5(m5);
   setM6(m6);
}
//Metodos sets George ----------------------------------------------------------------------------------------------------------------------
public void setMatricula (int matricula) {
  this.matricula = matricula;
}

// HERNAN GONZALEZ
// Alejandro
public Materia getM6() {
   return m6;
}

//Brad
public int getMatricula() {
	return matricula;
}
//Brad
public String getPeriodo() {
	return periodo;
}
public void setPeriodo(String periodo) {
   this.periodo=periodo;
}

public void setM1(Materia m1) {
   this.m1=m1;
}

public void setM2(Materia m2) {
   this.m2=m2;
}

// DIEGO PADILLA y DIEGO ELIZONDO
public void setM3(Materia m3) {
   this.m3 = m3;
}

public void setM4(Materia m4) {
   this.m4 = m4;
}

public void setM5(Materia m5) {
   this.m5 = m5;
}

public void setM6(Materia m6) {
   this.m6 = m6;
}

// Alejandro
public Materia getM1() {
   return m1;
}
	
// Alejandro
public Materia getM2() {
   return m2;
}

// Alejandro
public Materia getM3() {
   return m3;
}

// Alejandro
public Materia getM4() {
   return m4;
}

// Alejandro
public Materia getM5() {
   return m5;
}
   //metodo para calcular el promedio por parcial.
public double[] promParcial(){
   double [] p = new double[3];
   p[0] = (double)(m1.getCPar1() + m2.getCPar1() + m3.getCPar1() + m4.getCPar1() + m5.getCPar1() + m6.getCPar1())/6;
   p[1] = (double)(m1.getCPar2() + m2.getCPar2() + m3.getCPar2() + m4.getCPar2() + m5.getCPar2() + m6.getCPar2())/6;
   p[2] = (double)(m1.getCPar3() + m2.getCPar3() + m3.getCPar3() + m4.getCPar3() + m5.getCPar3() + m6.getCPar3())/6;
   return p;
}
//metodo para calcular las faltas por parcial
public int[] faltasParcial(){
   int[] f = new int[3];
   f[0] = m1.getFPar1() + m2.getFPar1() + m3.getFPar1() + m4.getFPar1() + m5.getFPar1() + m6.getFPar1();
   f[1] = m1.getFPar2() + m2.getFPar2() + m3.getFPar2() + m4.getFPar2() + m5.getFPar2() + m6.getFPar2();
   f[2] = m1.getFPar3() + m2.getFPar3() + m3.getFPar3() + m4.getFPar3() + m5.getFPar3() + m6.getFPar3();
   return f;
}
//metodo para calcular el promedio global, de todas las materias
public double promGlobal(){
   double p = (m1.promMateria()+m2.promMateria()+m3.promMateria()+m4.promMateria()+m5.promMateria()+m6.promMateria())/6;
   return p;
}
//metodo para calcular el total de faltas, de todos los parciales y materias.
public int faltasTotales(){
   int ft = m1.faltasMateria()+m2.faltasMateria()+m3.faltasMateria()+m4.faltasMateria()+m5.faltasMateria()+m6.faltasMateria();
   return ft;
}
public String toString(){
   DecimalFormat o = new DecimalFormat("0.00");
   int cont=0; //contador para contar la palabra mas grande.
   String[] p = {m1.getNombreM(),m2.getNombreM(),m3.getNombreM(),m4.getNombreM(),m5.getNombreM(),m6.getNombreM()}; //arreglo para poner las descripciones de las preguntas.
   while(cont<=m1.getNombreM().length() || cont<=m2.getNombreM().length() || cont<=m3.getNombreM().length() || cont<=m4.getNombreM().length() || cont<=m5.getNombreM().length() || cont<=m6.getNombreM().length()){ //Loop para contar la palabra mas grande.
      cont++;
   }
   for(int i=0;i<=5;i++){ //Loop para crear los espacios correspondientes en las descripciones
      int espacios = cont; //Variable espacios para no cambiar el contador.
      int e = p[i].length(); //Variable e para que se quede estatica.
      while(e<=espacios){
         p[i]+=" ";
         espacios--;
      }
   }
   
   String esp=""; //Crea espacios para desplegar la calificacion
   int espacios = cont; //Variable espacios para no cambiar el contador.
   while(3<=espacios){ //loop para crear los espacios de calificacion:
      esp=" "+esp;
      espacios--;
   }

   String[] c1 = {String.valueOf(m1.getCPar1()),String.valueOf(m2.getCPar1()),String.valueOf(m3.getCPar1()),String.valueOf(m4.getCPar1()),String.valueOf(m5.getCPar1()),String.valueOf(m6.getCPar1())}; //arreglo para poner las descripciones de las preguntas.
   String[] cp1 = {"","","","","",""}; //arreglo para colocar los espacios necesarios de cada materia, del primer parcial
   int cont2 =3;
   for(int i=0;i<=5;i++){
      int e = c1[i].length(); //variable espPar1 para
      int f = cont2; //variable f para no utilizar el cont2.
      while(e<=f){
         cp1[i]+=" ";
         f--;
      }
   }
   
   String[] c2 = {String.valueOf(m1.getCPar2()),String.valueOf(m2.getCPar2()),String.valueOf(m3.getCPar2()),String.valueOf(m4.getCPar2()),String.valueOf(m5.getCPar2()),String.valueOf(m6.getCPar2())}; //arreglo para poner las descripciones de las preguntas.
   String[] cp2 = {"","","","","",""};//arreglo para colocar los espacios necesarios de cada materia, del segundo parcial
   for(int i=0;i<=5;i++){//loop para arreglar espacios tipo columna
      int e = c2[i].length();
      int f = cont2;
      while(e<=f){
         cp2[i]+=" ";
         f--;
      }
   }
   String[] c3 = {String.valueOf(m1.getCPar3()),String.valueOf(m2.getCPar3()),String.valueOf(m3.getCPar3()),String.valueOf(m4.getCPar3()),String.valueOf(m5.getCPar3()),String.valueOf(m6.getCPar3())}; //arreglo para poner las descripciones de las preguntas.
   String[] cp3 = {"","","","","",""};//arreglo para colocar los espacios necesarios de cada materia, del tercer parcial
   for(int i=0;i<=5;i++){ //loop para arreglar espacios tipo columna
      int e = c3[i].length();
      int f = cont2;
      while(e<=f){
         cp3[i]+=" ";
         f--;
      }
   }
   String[] cf = {String.valueOf(m1.promMateria()),String.valueOf(m2.promMateria()),String.valueOf(m3.promMateria()),String.valueOf(m4.promMateria()),String.valueOf(m5.promMateria()),String.valueOf(m6.promMateria())}; //arreglo para poner las descripciones de las preguntas.
   String[] cpf = {"","","","","",""};//arreglo para colocar los espacios necesarios de cada materia, del tercer parcial
   for(int i=0;i<=5;i++){//loop para arreglar espacios tipo columna
      int e = cf[i].length();
      int f = cont2;
      while(e<=f){
         cpf[i]+=" ";
         f--;
      }
   }
              
   String esp1="                ";
   String esp2="      ";
   return "matricula: "+matricula+"\t\t Periodo Escolar: "+periodo+"\n"+"\n"+
           "Materia"+esp+"parcial 1"+esp1+"parcial 2"+esp1+"parcial 3"+esp1+"cal final"+"            "+"CRN"+"\n"+
           p[0]+"calif="+m1.getCPar1()+" faltas="+m1.getFPar1()+esp2+cp1[0]+"calif="+m1.getCPar2()+" faltas="+m1.getFPar2()+esp2+cp2[0]+"calif="+m1.getCPar3()+" faltas="+m1.getFPar3()+esp2+cp3[0]+"calif="+m1.promMateria()+" faltas="+m1.faltasMateria()+esp2+cpf[0]+m1.getCrn()+"\n"+
           p[1]+"calif="+m2.getCPar1()+" faltas="+m2.getFPar1()+esp2+cp1[1]+"calif="+m2.getCPar2()+" faltas="+m2.getFPar2()+esp2+cp2[1]+"calif="+m2.getCPar3()+" faltas="+m2.getFPar3()+esp2+cp3[1]+"calif="+m2.promMateria()+" faltas="+m2.faltasMateria()+esp2+cpf[1]+m2.getCrn()+"\n"+
           p[2]+"calif="+m3.getCPar1()+" faltas="+m3.getFPar1()+esp2+cp1[2]+"calif="+m3.getCPar2()+" faltas="+m3.getFPar2()+esp2+cp2[2]+"calif="+m3.getCPar3()+" faltas="+m3.getFPar3()+esp2+cp3[2]+"calif="+m3.promMateria()+" faltas="+m3.faltasMateria()+esp2+cpf[2]+m3.getCrn()+"\n"+    
           p[3]+"calif="+m4.getCPar1()+" faltas="+m4.getFPar1()+esp2+cp1[3]+"calif="+m4.getCPar2()+" faltas="+m4.getFPar2()+esp2+cp2[3]+"calif="+m4.getCPar3()+" faltas="+m4.getFPar3()+esp2+cp3[3]+"calif="+m4.promMateria()+" faltas="+m4.faltasMateria()+esp2+cpf[3]+m4.getCrn()+"\n"+
           p[4]+"calif="+m5.getCPar1()+" faltas="+m5.getFPar1()+esp2+cp1[4]+"calif="+m5.getCPar2()+" faltas="+m5.getFPar2()+esp2+cp2[4]+"calif="+m5.getCPar3()+" faltas="+m5.getFPar3()+esp2+cp3[4]+"calif="+m5.promMateria()+" faltas="+m5.faltasMateria()+esp2+cpf[4]+m5.getCrn()+"\n"+
           p[5]+"calif="+m6.getCPar1()+" faltas="+m6.getFPar1()+esp2+cp1[5]+"calif="+m6.getCPar2()+" faltas="+m6.getFPar2()+esp2+cp2[5]+"calif="+m6.getCPar3()+" faltas="+m6.getFPar3()+esp2+cp3[5]+"calif="+m6.promMateria()+" faltas="+m6.faltasMateria()+esp2+cpf[5]+m6.getCrn()+"\n\n"+
           esp+" Prom="+o.format(promParcial()[0])+" faltas="+faltasParcial()[0]+esp2+"Prom="+o.format(promParcial()[1])+" faltas="+faltasParcial()[0]+esp2+"Prom="+o.format(promParcial()[2])+" faltas="+faltasParcial()[0]+esp2+" Prom="+o.format(promGlobal())+" faltas="+faltasTotales();
}
}
//se crea clase Materia
class Materia{
private String nombreM;
private short crn;
private int cPar1;
private int cPar2;
private int cPar3;
private int fPar1;
private int fPar2;
private int fPar3;
//constructor de Materia
public Materia(String nombreM,short crn, int cPar1, int cPar2, int cPar3, int fPar1, int fPar2, int fPar3){
   setNombreM(nombreM);
   setCrn(crn);
   setCPar1(cPar1);
   setCPar2(cPar2);
   setCPar3(cPar3);
   setFPar1(fPar1);
   setFPar2(fPar2);
   setFPar3(fPar3);
}
//sets y gets
public void setNombreM(String nombreM){
   this.nombreM=nombreM;
}
public String getNombreM(){
   return nombreM;
}
public void setCrn(short crn){
   this.crn=crn;
}
public short getCrn(){
   return crn;
}
public void setCPar1(int cPar1){
   this.cPar1=cPar1;
}
public int getCPar1(){
   return cPar1;
}
public void setCPar2(int cPar2){
   this.cPar2=cPar2;
}
public int getCPar2(){
   return cPar2;
}
public void setCPar3(int cPar3){
   this.cPar3=cPar3;
}
public int getCPar3(){
   return cPar3;
}
public void setFPar1(int fPar1){
   this.fPar1=fPar1;
}
public int getFPar1(){
   return fPar1;
}
public void setFPar2(int fPar2){
   this.fPar2=fPar2;
}
public int getFPar2(){
   return fPar2;
}
public void setFPar3(int fPar3){
   this.fPar3=fPar3;
}
public int getFPar3(){
   return fPar3;
}
//metodo para calcular promedio de cada materia
public int promMateria(){
   int p= (cPar1+cPar2+cPar3)/3;
   return p;
}
//metodo para calcular faltas totales por materia
public int faltasMateria(){
   int f= fPar1 + fPar2 + fPar3;
   return f;
}
}
//INT
class Lectura{
public static int readInt(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g="0";}
   
   int g2=Integer.parseInt(g);
   return g2;   
}

//BYTE
public static byte readByte(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g="0";}
   
   byte g2=Byte.parseByte(g);
   return g2;   
}

//SHORT
public static short readShort(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g="0";}
   
   short g2=Short.parseShort(g);
   return g2;   
}

//LONG
public static long readLong(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g="0";}
   
   long g2=Long.parseLong(g);
   return g2;   
}

//FLOAT
public static float readFloat(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g="0";}
   
   float g2=Float.parseFloat(g);
   return g2;   
   }
   
//DOUBLE
public static double readDouble(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g="0";}
   
   double g2=Double.parseDouble(g);
   return g2;   
}

//STRING
public static String readString(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g=" ";}
  
   return g;   
}

//CHAR
public static char readChar(){
   String g;
   DataInputStream w=new DataInputStream(System.in);
   try{
      g=w.readLine();
   }
   catch(IOException e){g=" ";}
   
   char g2= g.charAt(0);
   return g2;   
}}
