/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package redesneurais;



/**
 *
 * @author Caio
 */
public class RedesNeurais {

    /**
     * @param args the command line arguments
     */
        private static Janela Hebb = new Janela();
        private static JanelaXO XO = new JanelaXO();
        
        public static Janela getHebb()
        {     

            return Hebb;
        }
        
        public static JanelaXO getXO()
        {     

            return XO;
        }
        

    public static void main(String[] args) {
            getHebb().setVisible(true);
         
        }
}
