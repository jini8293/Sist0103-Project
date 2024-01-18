package day09;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Event03 extends JFrame implements ActionListener
{
	private JTextField text;
	private JTextArea memo;
	public Event03()
	{
		setTitle("메시지 보내기");
		setLayout(new BorderLayout());
		text=new JTextField(30);
		memo=new JTextArea(10,30);
		text.addActionListener(this);
		memo.setEditable(false);
		add(text,BorderLayout.PAGE_END);
		add(memo,BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String inputText = text.getText();
        memo.append("send: "+inputText + "\n");
        text.selectAll();
	}
}

public class day09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Event03 e03=new Event03();
	}

}
