import java.awt.Component;

import javax.swing.JOptionPane;

public class BurmaShave {

	public static void main(String[] args) {
		Component frame = null;
		// TODO Auto-generated method stub
		String[] msg = {"YOU CAN DRIVE","A MILE A MINUTE","BUT THERE IS NO","FUTURE IN IT","BURMA SHAVE"};
	
		
		for(int i=0; i<msg.length; i++)
		JOptionPane.showMessageDialog(frame,
			    msg[i]);

	}

}
