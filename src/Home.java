import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener
{
	private JButton compose,breakmsg;

	Home()
	{
		super("Steganography");
		Container con=getContentPane();
		con.setLayout(null);
                JLabel bck;
                ImageIcon img=new ImageIcon("C:\\Users\\HP\\Desktop\\project\\steg.jpg");
                bck=new JLabel("",img,JLabel.CENTER);
                bck.setBounds(0, 0,1280,818);
                add(bck);
		compose=new JButton("ENCODE");
		compose.addActionListener(this);
		compose.setBounds(400,550,150,50);
                compose.setFont(new Font("Arial",Font.BOLD,25));
		breakmsg=new JButton("DECODE");
		breakmsg.addActionListener(this);
		breakmsg.setBounds(650,550,150,50);
                breakmsg.setFont(new Font("Arial",Font.BOLD,25));
		con.add(compose);
		con.add(breakmsg);
	}

        @Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==compose)
		{
			this.dispose();
			ComposePage cp=new ComposePage();
			cp.setSize(1035,790);
			cp.setVisible(true);
		}

		if(ae.getSource()==breakmsg)
		{
			this.dispose();
			BreakPage bp=new BreakPage();
			bp.setSize(1035,790);
			bp.setVisible(true);
		}
	}
	
	public static void main(String args[])
	{
		Home h=new Home();
                JFrame f=new JFrame();
               // f.getContentPane().setBackground(Color.red);
		h.setSize(1280,1024);
		h.setVisible(true);
	}
}