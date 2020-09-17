package PackegeTateti.PackegeTateti;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class claseTateti extends JFrame implements ActionListener{
    JLabel titulo,juUno,juDos,resJuUno,resJuDos,turno,resTurno ;
    
  
    JButton botones[];
    
    Boolean ganador = false;

    
    
    JButton botonSalir,botonReiniciar,empezar,
            boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
    
    
    
    public claseTateti(){
    	
    	
    	botones = new JButton[9];
   
    	

    	
    	for (int i = 0; i <   botones.length; i++) {
    		System.out.println(i);
    		botones[i] = new JButton();
    		
    		
    		switch(i) {
    		  case 0:
    			  botones[i].setBounds(100, 150, 50, 35);
    			  break;
    		  case 1:
    			  botones[i].setBounds(175, 150, 50, 35);
    			  break;
    		  case 2:
    			  botones[i].setBounds(250, 150, 50, 35);
    			  break;
    		  case 3:
    			  botones[i].setBounds(100, 200, 50, 35);
    			  break;   			  
    		  case 4:
    			  botones[i].setBounds(175, 200, 50, 35);
    			  break;
    		  case 5:
    			  botones[i].setBounds(250, 200, 50, 35);
    			  break;
    		  case 6:
    			  botones[i].setBounds(100, 250, 50, 35);
    			  break;
    		  case 7:
    			  botones[i].setBounds(175, 250, 50, 35);
    			  break;
    		  case 8:
    			  botones[i].setBounds(250, 250, 50, 35);
    			  break;
    		}
    			
    		
    		add(botones[i]);
    		botones[i].addActionListener(this);
        
    	}
    	
    	
    	
    	
    	
    	
        
        setLayout(null);
        //JLabel
        titulo=new JLabel("Tateti");
        titulo.setBounds(150,-50,100,200);
        add(titulo);
        
        juUno=new JLabel("Jugador 1: ");
        juUno.setBounds(375,-50,100,200);
        add(juUno);
        
        juDos=new JLabel("Jugador 2: ");
        juDos.setBounds(375,-25,100,200);
        add(juDos);
        
        resJuUno=new JLabel("X");
        resJuUno.setBounds(440,-50,100,200);
        add(resJuUno);
        
        resJuDos=new JLabel("O");
        resJuDos.setBounds(440,-25,100,200);
        add(resJuDos);
        
        turno=new JLabel("Turno de: ");
        turno.setBounds(125,225,100,200);
        add(turno);
        
        resTurno=new JLabel("");
        resTurno.setBounds(185,225,100,200);
        add(resTurno);
        
        //JButton
        botonSalir=new JButton("Salir");
        botonSalir.setBounds(400, 300, 60, 25);
        add(botonSalir);
        botonSalir.addActionListener(this);
        
        empezar=new JButton("Empezar");
        empezar.setBounds(375, 100, 85, 25);
        add(empezar);
        empezar.addActionListener(this);
        
        botonReiniciar=new JButton("Reiniciar");
        botonReiniciar.setBounds(387, 250, 85, 25);
        add(botonReiniciar);
        botonReiniciar.addActionListener(this);
        
    }
    
    
    
    
    public void isWinner(  ) {
    	
    	
    	int[][] tateti = new int[8][3];
    	
		tateti[0][0] = 0;
		tateti[0][1] = 1;
		tateti[0][2] = 2;

		tateti[1][0] = 3;
		tateti[1][1] = 4;
		tateti[1][2] = 5;

		tateti[2][0] = 6;
		tateti[2][1] = 7;
		tateti[2][2] = 8;

		tateti[3][0] = 0;
		tateti[3][1] = 3;
		tateti[3][2] = 6;

		tateti[4][0] = 1;
		tateti[4][1] = 4;
		tateti[4][2] = 7;

		tateti[5][0] = 2;
		tateti[5][1] = 5;
		tateti[5][2] = 8;

		tateti[6][0] = 0;
		tateti[6][1] = 4;
		tateti[6][2] = 8;

		tateti[7][0] = 2;
		tateti[7][1] = 4;
		tateti[7][2] = 6;
    	
    
    	  
		  
    	
    	
    	
    	  for (int i = 0; i <   tateti.length; i++) {
    		  
    		  
    		  int ta = tateti[i][0];
    		  int te = tateti[i][1];
    		  int ti = tateti[i][2];
    		  
    		  
    		  if(botones[ta].getText() == "X" && botones[te].getText() == "X" && botones[ti].getText() == "X" ) {    			  
    			  JOptionPane.showMessageDialog(rootPane, " Gano el X");
    			  ganador = true;
    		  }
    		  if(botones[ta].getText() == "O" && botones[te].getText() == "O" && botones[ti].getText() == "O" ) {    			  
    			  System.out.println("");
    			   JOptionPane.showMessageDialog(rootPane, " Gano el O");
    			  ganador = true;
    		  }
    		  
    		  
    		  
    		  
    		  
    		  
    	  }
    	
    	
    	
    	
    	
    	
    
    	
    }
    
    
    
    
    
    
    
    
    public void actionPerformed(ActionEvent evento){
       
        if(evento.getSource()==botonSalir){
            //this.setVisible(false);
            System.exit(0);
        }
        

        
        
		if (evento.getSource() == botonReiniciar) {
			ganador = false;
			resTurno.setText("");

			for (int i = 0; i < botones.length; i++) {

				botones[i].setText("");

			}

		}
        
        
        
        
        
        if(evento.getSource()==empezar){
           
            String [] jugRandom={juUno.getText(), juDos.getText()};
            
            
            
            int resRandom=(int)Math.round(Math.random()*1);
            
            
            String empieza = jugRandom[resRandom];

            if(empieza.equals(juUno.getText())){
                resTurno.setText("X");
            }if(empieza.equals(juDos.getText())){
                resTurno.setText("O");
            }
            JOptionPane.showMessageDialog(rootPane, " Empieza: "+empieza);
            
             
        }
        
        
        
        
        
        Object botonPresionado = evento.getSource();
        
        
        
        for (int i = 0; i <   botones.length; i++) {
        	
        	 if(botonPresionado==botones[i] && !ganador) {
        		 
        		
        		 
        		 if(resTurno.getText() != "") {			 
        			 if(botones[i].getText() == ""){
        				 botones[i].setText(resTurno.getText());
        				 resTurno.setText( resTurno.getText() == "X" ? "O" : "X"   );
        				 System.out.println("El boton presionado fue el numero "+i);
        			 }
        			 
        		 }
        		 
        		 	     		 	
        		isWinner();
        		 
        		 
        	 }
        	
        	
        }
        
        
        
        
   
  

        
    
        }

    public static void main(String[] args){
        claseTateti ventanaTateti = new claseTateti();
        ventanaTateti.setBounds(100,100,500,400);
        ventanaTateti.setVisible(true);
        ventanaTateti.setLocationRelativeTo(null);
        ventanaTateti.setResizable(false);
    }
    

}