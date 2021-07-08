package tennis;


	import javax.swing.*;    
	public class Tennis_GUI {  
	public static void main(String[] args) {  
	    JFrame f=new JFrame("Button Example"); 
	    
	    JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30);  
	    f.add(b);
	    JButton c=new JButton("Click Here");  
	    c.setBounds(50,100,95,30);  
	    f.add(c);
	    
	    
	    
	    
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  
	}  
