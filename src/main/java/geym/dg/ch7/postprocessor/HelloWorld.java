package geym.dg.ch7.postprocessor;

public class HelloWorld {
   private String message;
   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
