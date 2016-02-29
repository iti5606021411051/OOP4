import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ass4 extends JFrame
{
	JTextArea All = new JTextArea();
	JTextArea Output = new JTextArea();
	JButton button1 = new JButton("Sec3");
	JButton button2 = new JButton("Sec4");
	JButton button3 = new JButton("Sec5");
	JButton button4 = new JButton("Exit");

	JPanel n = new JPanel();
	
	int [][] sec3,sec4,sec5;
	String[][] m;
	int a=0;
	Random rand = new Random();
	
	public ass4(String num)
	{
		super(num);
		button1.addActionListener(new ButtonList());
		n.add(button1);
		button2.addActionListener(new ButtonList());
		n.add(button2);
		button3.addActionListener(new ButtonList());
		n.add(button3);
		button4.addActionListener(new ButtonList());
		n.add(button4);
		
		add(n);
	}
	
	public String OOPSec3()
	{
		String n1;
		sec3 = new int[40][5];
		m = new String[40][2];
		
		n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\tPoint\n";
		for(int i=0;i<sec3.length;i++)
		{
			n1 = n1+(i+1)+"\t";
			for(int j=0;j<sec3[0].length;j++)
			{
				if(j <2)
				{
					sec3[i][j] = rand.nextInt(31);
				}
				else if(j == 2)
				{
					sec3[i][j] = rand.nextInt(16);
				}
				else if(j == 3)
				{
					sec3[i][j] = rand.nextInt(21);
				}
				else
				{
					sec3[i][j] = rand.nextInt(6);
				}
				a = a + sec3[i][j];
				n1 = n1 + sec3[i][j]+"\t";
			}
			n1=n1+"\n";
			m[i][0] = Integer.toString(a);
			a = 0;
		}
		return n1;
	}
	
	public String OOPSec4()
	{
		String n1;
		sec4 = new int[20][4];
		m = new String[20][2];
		
		n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\n";
		for(int i=0;i<sec4.length;i++)
		{
			n1 = n1+(i+1)+"\t";
			for(int j=0;j<sec4[0].length;j++)
			{
				if(j<2)
				{
					sec4[i][j] = rand.nextInt(31);
				}
				else
				{
					sec4[i][j] = rand.nextInt(21);
				}
				a = a + sec4[i][j];
				n1 = n1 + sec4[i][j]+"\t";
			}
			n1=n1+"\n";
			m[i][0] = Integer.toString(a);
			a = 0;
			
		}
		return n1;
	}
	
	
	
	public String OOPSec5()
	{
		
		String n1;
		sec5 = new int[50][6];
		m = new String[50][2];
		
		n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\tTest\tPoint\n";
		for(int i=0;i<sec5.length;i++)
		{
			n1 = n1+(i+1)+"\t";
			for(int j=0;j<sec5[0].length;j++)
			{
				if(j<2)
				{
					sec5[i][j] = rand.nextInt(31);
				}
				else if(j == 2)
				{
					sec5[i][j] = rand.nextInt(16);
				}
				else if(j < 5)
				{
					sec5[i][j] = rand.nextInt(11);
				}
				else
				{
					sec5[i][j] = rand.nextInt(6);
				}
				a = a + sec5[i][j];
				n1 = n1 + sec5[i][j]+"\t";
			}
			n1=n1+"\n";
			m[i][0] = Integer.toString(a);
			a = 0;
		}
		return n1;
	}
	
	public void Calc()
	{
		int b=0;
		for(int i=0;i<m.length;i++)
		{
			b = Integer.parseInt(m[i][0]);
			for(int j=1;j == 1;j++)
			{
				if(b >=80 && b<=100)
				{
					m[i][j] = "A";
				}
				else if(b >=75 && b<=79)
				{
					m[i][j] = "B+";
				}
				else if(b >=70 && b<=74)
				{
					m[i][j] = "B";
				}
				else if(b >=65 && b<=69)
				{
					m[i][j] = "C+";
				}
				else if(b >=60 && b<=64)
				{
					m[i][j] = "C";
				}
				else if(b >=55 && b<=59)
				{
					m[i][j] = "D+";
				}
				else if(b >=50 && b<=54)
				{
					m[i][j] = "D";
				}
				else if(b >=0 && b<= 49)
				{
					m[i][j] = "F";
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Error","MEssage",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		}
		
	}
	
	public String Print()
	{
		String name="";
		name = "Number\tResult\tGrade\n";
		for(int i=0;i<m.length;i++)
		{
			for(int j=1;j==1;j++)
			{
				name = name +(i+1)+"\t"+ m[i][0]+"\t"+m[i][1];
			}
			name = name +"\n";
		}
		return name;
	}
	
	
	
	public class ButtonList implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == button1)
			{
				All.setText(OOPSec3());
				Calc();
				Output.setText(Print());
				JOptionPane.showMessageDialog(null,All,"Message",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,Output,"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(e.getSource() == button2)
			{
				All.setText(OOPSec4());
				Calc();
				Output.setText(Print());
				JOptionPane.showMessageDialog(null,All,"Message",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,Output,"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(e.getSource() == button3)
			{
				All.setText(OOPSec5());
				Calc();
				Output.setText(Print());
				JOptionPane.showMessageDialog(null,All,"Message",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,Output,"Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(e.getSource() == button4)
			{
				JOptionPane.showMessageDialog(null,"Exit","Message",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
	}

	

	public static void main(String[] args) 
	{

		ass4 s1 = new ass4("Enter ProGram");
		s1.setSize(300,80);
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s1.setVisible(true);
		
	}
	

}
