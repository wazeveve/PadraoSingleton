/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bccifsuldeminas.padroesprojeto;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
  private static Logger instance; 
  private FileWriter fileWriter;
  private boolean logToFile;
  
  
  private Logger() {
      try{
          fileWriter = new FileWriter("c/app.log", true); //Gera um arquivo para poder salvar o log
          logToFile = true; //Alterna entre mostar o log no arquivo ou no console
      }catch(IOException e){
          e.printStackTrace(); //caso erro, ira exibir no console
          logToFile = false;
      }
  } 

  public static Logger getInstance() {
    if (instance == null)
      instance = new Logger();
    return instance; //cria uma unica instancia para o logger, evitando que seja possivel usar o new Logger
  }
  
  public void log(String message){
      if(logToFile){
          writeToFile(message); //Usado para escrever no arquivo, como um console.log
      } else {
          System.out.println(message); // Exibe no console caso tenha dado erro.
      }
  }
  
  private void writeToFile(String message){
      try{
          fileWriter.write(message + "\n");
          fileWriter.flush(); //Garante que o o texto seja gravado no arquivo instantaneamente
      } catch(IOException e){
          e.printStackTrace();
      }
  }
  
  public void close(){
      try{
          if (fileWriter != null){
              fileWriter.close(); //Fecha o arquivo no fim da utilização
          }
      } catch(IOException e) {
          e.printStackTrace();
      }
  }
  


}

