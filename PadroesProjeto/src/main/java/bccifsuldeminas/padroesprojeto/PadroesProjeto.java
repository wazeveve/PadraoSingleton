/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bccifsuldeminas.padroesprojeto;

/**
 *
 * @author 202211000034
 */
public class PadroesProjeto {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        

        // Escrevendo as mensagens no arquivo do log
        logger.log("Iniciando aplicação");
        logger.log("Carregando configurações...");
        logger.log("Testando conexão no banco de dados...");
        logger1.log("[#########-------------------------------------------] 17%");
        logger1.log("[############----------------------------------------] 25%");
        logger1.log("[################------------------------------------] 34%");
        logger1.log("[#########################---------------------------] 58%");
        logger1.log("[##############################----------------------] 68%");
        logger2.log("Erro ao conectar ao banco de dados!");
        logger2.log("Encerrando aplicação");
        System.out.println(logger2 + " " + logger);
        // Finaliza o logger para liberar o recurso do arquivo
        logger.close();
    }
}
