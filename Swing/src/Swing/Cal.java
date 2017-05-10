package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Cal extends JFrame{

	/**
	 * 用网格布局实现机算器的ui
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal tt=new Cal();
	}
	JTextField jtf=null;//文本框
	//即有数组概念  又有对象  对象数组
	JButton jbt[]=new JButton[15];//存放10个数字 0-9
	//jpanel(设置网格布局)  container(设置边界布局)  JFrame(顶级容器)
	public Cal(){
		jtf=new JTextField();
		//设置文本框  只读  不能编辑
		jtf.setEditable(true);
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(4, 4, 10, 10));
		Container container=this.getContentPane();//容器用来装载 jpanel
		//用的是边界布局
		container.add(jtf,BorderLayout.NORTH);
		container.add(jp,BorderLayout.CENTER);
		//container.setLayout(new GridLayout(4, 4, 10, 10));
		//this.setLayout(new GridLayout(4, 4, 10, 10));
		for(int i=0;i<10;i++){
			jbt[i]=new JButton(String.valueOf(i));//String.valueOf(整型)把整型变成String
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
		this.setTitle("计算器");
		this.setBounds(200, 200, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}

