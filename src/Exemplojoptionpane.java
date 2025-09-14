
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplojoptionpane extends JFrame { 
    private JButton escrever;
    private JButton fechar;
   
    public Exemplojoptionpane(){  
        super("Teste do Componente OptionPane");   
        
        escrever = new JButton("Clique aqui para escrever");      
        fechar = new JButton("Fechar");       

        Container pane = this.getContentPane(); 
        pane.setLayout(null);  

        pane.add(escrever);   
        pane.add(fechar);

        escrever.setBounds(20,30,200,35);   
        fechar.setBounds(20,90,150,35);
       
        /**Definindo os eventos/ações**/
        escrever.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
                buttonEscreverActionPerformed(b);
            }                  
        });
       
        fechar.addActionListener (new ActionListener(){
             public void actionPerformed(ActionEvent b){
                buttonConfirmActionPerformed(b);
            }
        });
       
        this.setSize(400,310);
        this.setContentPane(pane);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    private void buttonEscreverActionPerformed(ActionEvent b){
        // Caixa de texto para o usuário digitar
        String resposta = JOptionPane.showInputDialog(
                this, 
                "Digite seu nome:", 
                "Entrada de Texto", 
                JOptionPane.QUESTION_MESSAGE
        );

        // Exibe depois o que o usuário digitou (opcional)
        if (resposta != null && !resposta.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você digitou: " + resposta);
        }
    }

    private void buttonConfirmActionPerformed(ActionEvent b){
        int retorno = JOptionPane.showConfirmDialog(
                this,
                "Deseja fechar?",
                "Fechar",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
       
        if (retorno == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }
           
    public static void main(String[] args) {
        new Exemplojoptionpane();  
    }            
}
