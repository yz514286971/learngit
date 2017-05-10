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
		this.setLayout(new FlowLayout(FlowLayout.CENTER));//向左对齐
		this.setTitle("流式布局");
		this.setBounds(200, 200, 300, 200);//出场的位置和宽，高
		//设置窗体不能随意的拖拽
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	}
	



