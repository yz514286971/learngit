package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Cal extends JFrame{

	/**
	 * �����񲼾�ʵ�ֻ�������ui
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal tt=new Cal();
	}
	JTextField jtf=null;//�ı���
	//�����������  ���ж���  ��������
	JButton jbt[]=new JButton[15];//���10������ 0-9
	//jpanel(�������񲼾�)  container(���ñ߽粼��)  JFrame(��������)
	public Cal(){
		jtf=new JTextField();
		//�����ı���  ֻ��  ���ܱ༭
		jtf.setEditable(true);
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(4, 4, 10, 10));
		Container container=this.getContentPane();//��������װ�� jpanel
		//�õ��Ǳ߽粼��
		container.add(jtf,BorderLayout.NORTH);
		container.add(jp,BorderLayout.CENTER);
		//container.setLayout(new GridLayout(4, 4, 10, 10));
		//this.setLayout(new GridLayout(4, 4, 10, 10));
		for(int i=0;i<10;i++){
			jbt[i]=new JButton(String.valueOf(i));//String.valueOf(����)�����ͱ��String
			jp.add(jbt[i]);
		}
		jbt[10]=new JButton("+");
		jp.add(jbt[10]);
		jbt[11]=new JButton("-");
		jp.add(jbt[11]);
		jbt[12]=new JButton("*");
		jp.add(jbt[12]);
		jbt[13]=new JButton("/");
		jp.add(jbt[13]);
		jbt[14]=new JButton("=");
		jp.add(jbt[14]);
		this.setTitle("������");
		this.setBounds(200, 200, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}

