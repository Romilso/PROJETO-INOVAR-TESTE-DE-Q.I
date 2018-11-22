package teste3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
 
public class Principal extends JFrame {
 
    private JPanel contentPane;
    private JTextField resposta1;
    private JButton botaoEnviarResposta;
    String resposta = null;
    int pontos = 0;
    int index = 0;
    boolean dcontinuar = true;
    int desejoDeContinuar = 0;
    int b = 0;
    int i = 0;
    private JButton PULAR;
    private JLabel lblDica;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
 
    
    /**
     * Launch the application.
     */
    
    //COMANDO GERADOS AUTOMATICAMANTE AO SELECIONAR UMA CLASSE DO TIPO JFRAME
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {

                
                try {
                    Principal frame = new Principal();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
 
    public Principal() {
 
        ArrayList<Descobrir> descobrir = new ArrayList<>();
 
        
        Descobrir input1 = new Descobrir();
        input1.setFrasedescobrir("26 letras no alfabeto");
        input1.setDicafrase("26 L no A");
        descobrir.add(input1);
 
        Descobrir input2 = new Descobrir();
        input2.setFrasedescobrir("7 dias na semana");
        input2.setDicafrase(" 7 D na S");
        descobrir.add(input2);
        
        Descobrir input3 = new Descobrir();
        input3.setFrasedescobrir("7 maravilhas do mundo");
        input3.setDicafrase(" 7 M do M");
        descobrir.add(input3);
        
        Descobrir input4 = new Descobrir();
        input4.setFrasedescobrir("12 signos do zodíaco");
        input4.setDicafrase(" 12 S do Z");
        descobrir.add(input4);
        
        Descobrir input5 = new Descobrir();
        input5.setFrasedescobrir("66 livros da bíblia");
        input5.setDicafrase(" 66 L da B");
        descobrir.add(input5);
        
        Descobrir input6 = new Descobrir();
        input6.setFrasedescobrir("52 cartas no baralho (sem os coringas)");
        input6.setDicafrase(" 52 C no B (S os C)");
        descobrir.add(input6);
        
        Descobrir input7 = new Descobrir();
        input7.setFrasedescobrir("4 cores na bandeira brasileira");
        input7.setDicafrase(" 4 C na B B");
        descobrir.add(input7);
        
        Descobrir input8 = new Descobrir();
        input8.setFrasedescobrir("18 buracos num campo de golfe");
        input8.setDicafrase(" 18 B num C de G");
        descobrir.add(input8);
        
        Descobrir input9 = new Descobrir();
        input9.setFrasedescobrir("39 livros no velho testamento");
        input9.setDicafrase(" 39 L no V T");
        descobrir.add(input9);
        
        Descobrir input10 = new Descobrir();
        input10.setFrasedescobrir("5 dedos num pé");
        input10.setDicafrase(" 5 D num P");
        descobrir.add(input10);
      
        Descobrir input11 = new Descobrir();
        input11.setFrasedescobrir("90 graus num ângulo reto");
        input11.setDicafrase(" 90 G num Â R");
        descobrir.add(input11);
        
        Descobrir input12 = new Descobrir();
        input12.setFrasedescobrir("0 graus celsius é a temperatura de congelamento da água");
        input12.setDicafrase(" 0 G C é a T de C da Á");
        descobrir.add(input12);
        
        Descobrir input13 = new Descobrir();
        input13.setFrasedescobrir("5 jogadores em um time de basquete");
        input13.setDicafrase(" 5 J em um T D B");
        descobrir.add(input13);
        
        Descobrir input14 = new Descobrir();
        input14.setFrasedescobrir("3 rodas num triciclo");
        input14.setDicafrase(" 3 R num T");
        descobrir.add(input14);
        
        Descobrir input15 = new Descobrir();
        input15.setFrasedescobrir("100 centavos num real");
        input15.setDicafrase(" 100 C num R");
        descobrir.add(input15);
        
        Descobrir input16 = new Descobrir();
        input16.setFrasedescobrir("11 jogadores num time de futebol");
        input16.setDicafrase(" 11 J num T D F");
        descobrir.add(input16);
        
        Descobrir input17 = new Descobrir();
        input17.setFrasedescobrir("12 meses num ano");
        input17.setDicafrase(" 12 M num A");
        descobrir.add(input17);
        
        Descobrir input18 = new Descobrir();
        input18.setFrasedescobrir("4 rodas tem um carro");
        input18.setDicafrase(" 4 R T um C");
        descobrir.add(input18);
        
        Descobrir input19 = new Descobrir();
        input19.setFrasedescobrir("29 dias em fevereiro em um ano bissexto");
        input19.setDicafrase(" 29 D em F em um A B");
        descobrir.add(input19);
        
        Descobrir input20 = new Descobrir();
        input20.setFrasedescobrir("27 livros no novo testamento");
        input20.setDicafrase(" 27 L no N T");
        descobrir.add(input20);
        
        Descobrir input21 = new Descobrir();
        input21.setFrasedescobrir("365 dias no ano");
        input21.setDicafrase(" 365 D no A");
        descobrir.add(input21);
        
        Descobrir input22 = new Descobrir();
        input22.setFrasedescobrir("10 dedos em 2 mãos");
        input22.setDicafrase(" 10 D em 2 M");
        descobrir.add(input22);
        
        Descobrir input23 = new Descobrir();
        input23.setFrasedescobrir("52 semanas num ano");
        input23.setDicafrase(" 52 S num A");
        descobrir.add(input23);
        
        Descobrir input24 = new Descobrir();
        input24.setFrasedescobrir("9 vidas num gato");
        input24.setDicafrase(" 9 V num G");
        descobrir.add(input24);
        
        Descobrir input25 = new Descobrir();
        input25.setFrasedescobrir("60 minutos numa hora");
        input25.setDicafrase(" 60 M numa H");
        descobrir.add(input25);
        
        Descobrir input26 = new Descobrir();
        input26.setFrasedescobrir("64 casas num tabuleiro de xadrez");
        input26.setDicafrase(" 64 C num T De X");
        descobrir.add(input26);
        
        Descobrir input27 = new Descobrir();
        input27.setFrasedescobrir("3 estados na região sul");
        input27.setDicafrase(" 3 E na R S");
        descobrir.add(input27);
        
        Descobrir input28 = new Descobrir();
        input28.setFrasedescobrir("1 bola branca num jogo de sinuca");
        input28.setDicafrase(" 1 B B num J de S");
        descobrir.add(input28);
        
        Descobrir input29 = new Descobrir();
        input29.setFrasedescobrir("1000 anos em um milênio");
        input29.setDicafrase(" 1000 A em um M");
        descobrir.add(input29);
        
        Descobrir input30 = new Descobrir();
        input30.setFrasedescobrir("12 ovos numa duzia");
        input30.setDicafrase(" 12 O numa D");
        descobrir.add(input30);
        
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
 
        resposta1 = new JTextField();
        resposta1.setBounds(111, 134, 194, 20);
        contentPane.add(resposta1);
        resposta1.setColumns(10); 
 
        // COLOCANDO O CONTEUDO DA VARIAVEL DICA  DA CLASSE NA VARIAVEL JLABEL DICA
        JLabel dica = new JLabel(descobrir.get(0).getDicafrase() );
               dica.setBounds(160, 105, 112, 23);
        contentPane.add(dica);
 
        botaoEnviarResposta = new JButton("CONFIRMAR RESPOSTA");
       
        
        // BOTÃO CONFIRMAR RESPOSTA COM O CLICK DO BOTÃO
        botaoEnviarResposta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
 
 
            	        //PEGA OS DADOS DO CAMPO DE TEXTO DA RESPOSTA
            	        //FAZ A COMPARAÇÃO DA RESPOSTA COM A PALAVRA CADASTRADA NO ARRAY LIST
            	
                        if (resposta1.getText().equals(descobrir.get(index).getFrasedescobrir())) {
                        
                        //VARIÁVEL DE CONTROLE DO INDEXADOR 
                            index = index + 1;
                        //VARIÁVEL DE CONTROLE DA PONTUAÇÃO
                            pontos = pontos + 1;
                            
                            desejoDeContinuar = JOptionPane
                                    .showConfirmDialog(null,
                                            "\n       ****    CORRETO       ****    \n\nPONTUAÇÃO: " + pontos
                                                    + " \n\n Deseja continuar?",
                                            "Continua", JOptionPane.OK_CANCEL_OPTION);
                            if ( desejoDeContinuar == JOptionPane.OK_OPTION ) {
                                System.out.println( "OK" );
                            } else{
                            	System.exit(0);
                            }
             
                           //ENQUANTO O INDEXADOR FOR MENOR QUE O TAMANHGO DO ARRAY LIST
                           if( index < descobrir.size()  ){
                         
                         //SETA A JLABEL 
                         dica.setText(descobrir.get(index).getDicafrase()); 
                           resposta1.setText(""); 
                        	  
                        	   
                           }else{
                           
                        	   JOptionPane.showMessageDialog(null, "\n ***** ZEROU O JOGO *****");
                        	   System.out.println("ola");
                        	   System.exit(1);
                           }
                 
                           //___________________________________________________________________________________________
                           if(index == 5){
                        	   JOptionPane.showMessageDialog(null, "NÍVEL DE INTELIGÊNCIA CONQUISTADO: \n PREJUDICADO");
                           } else if(index == 10){
                        	   JOptionPane.showMessageDialog(null, "NÍVEL DE INTELIGÊNCIA CONQUISTADO: \n TA NA MÉDIA");
                           }
                           else if(index == 15){
                        	   JOptionPane.showMessageDialog(null, "NÍVEL DE INTELIGÊNCIA CONQUISTADO: \n ESPERTINHO");
                           }
                           
                           else if(index == 20){
                        	   JOptionPane.showMessageDialog(null, "NÍVEL DE INTELIGÊNCIA CONQUISTADO: \n INTELIGENTE PACAS");
                           }
                           else if(index == 30){
                        	   JOptionPane.showMessageDialog(null, "NÍVEL DE INTELIGÊNCIA: \n OI EINSTEIN");
                           }
                           //___________________________________________________________________________________________
                           
 
                        } else {
                           int i = JOptionPane.showConfirmDialog(null, "\n ERRADO \n Deseja continuar?", null, JOptionPane.OK_OPTION, 
                                   JOptionPane.INFORMATION_MESSAGE );
                            	if ( i == JOptionPane.OK_OPTION ) {
                                System.out.println( "OK" );
                            } else{
                            	System.exit(0);
                            }
                            }
                        }

        });
 
        botaoEnviarResposta.setBounds(111, 171, 194, 23);
        contentPane.add(botaoEnviarResposta);
 
        JLabel lblJogoTesteInteligncia = new JLabel("     JOGO TESTE DE INTELIG\u00CANCIA");
        lblJogoTesteInteligncia.setBounds(24, 23, 400, 35);
        lblJogoTesteInteligncia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        contentPane.add(lblJogoTesteInteligncia);
        
     // BOTÃO PULAR DE FASE COM O CLICK DO BOTÃO
 
        
        PULAR = new JButton("PULAR FASE");
        PULAR.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		 // ENCREMENTA O INDEXADOR
        		index = index +1;
        		// ATUALIZA A DICA COM A PRÓXIMA D
        		  dica.setText(descobrir.get(index).getDicafrase()); 
        	}
        });
        PULAR.setBounds(111, 216, 194, 23);
        contentPane.add(PULAR);
        
        lblDica = new JLabel("DICA:");
        lblDica.setBounds(112, 109, 41, 14);
        contentPane.add(lblDica);
        
        lblNewLabel = new JLabel("DICA: ");
        lblNewLabel.setBounds(111, 69, 46, 14);
        contentPane.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("24 H no D");
        lblNewLabel_1.setBounds(185, 69, 61, 14);
        contentPane.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("RESPOSTA: ");
        lblNewLabel_2.setBounds(111, 84, 77, 14);
        contentPane.add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel("24 horas no dia");
        lblNewLabel_3.setBounds(185, 84, 97, 14);
        contentPane.add(lblNewLabel_3);
    }
}
