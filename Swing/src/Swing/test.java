package Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test b=new test();
	}
	JButton	x;
	public test(){
		for(int i=0;i<10;i++){
				x=new JButton(i+"");
				this.add(x);
			}
		this.setLayout(new FlowLayout(FlowLayout.CENTER));//�������
		this.setTitle("��ʽ����");
		this.setBounds(200, 200, 300, 200);//������λ�úͿ���
		//���ô��岻���������ק
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	}
	



