package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         int fahrenheit = 0;
        float celsius = 0.0F;
         
         for(int i=0; i<args.length ; i++)
       {
      
            try{fahrenheit = Integer.parseInt(args[i]);  // en cas d'erreur 
        
            celsius= fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
         }
            catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());}                                                                       // impos�s
        }
      
      
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       float i= (5*(f-32))/9.0F;
       float d=((int) (i*10))/10.0F;
        return (float)d ;  // � compl�ter  en rempla�ant la valeur retourn�e par la fonction de conversion
       // ...
     }

}
