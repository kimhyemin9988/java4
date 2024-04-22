package java4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ItemPage extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ItemPage");
		frame.setBounds(100, 100, 1200, 800); // 가로위치,세로위치, 가로길이,세로길이
		frame.setLocationRelativeTo(null);
		
		JPanel dashBord = new JPanel(); //대쉬보드 객체화
		dashBord.setPreferredSize(new Dimension(100, 100)); // 대쉬보드 크기
		JButton btnHome = new JButton("home"); // home btn 컴포넌트
		JButton btnBucket = new JButton("장바구니"); //장바구니 btn 컴포넌트
		dashBord.add(btnHome); // 패널에 home 버튼 더하기
		dashBord.add(btnBucket); // 패널에 장바구니 버튼 더하기
		
		
		JPanel itemPage = new JPanel(); //아이템퍼이지 객체화
		itemPage.setPreferredSize(new Dimension(1000, 600)); // 아이템퍼이지 크기
		
		ImageIcon img = new ImageIcon("C:\\Users\\Administrator\\Desktop\\khm\\java4\\신발사진.jpg");
		ImageIcon changeImg = new ImageIcon(img.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH));
		JButton itemImage = new JButton(changeImg);
		itemImage.setPreferredSize(new Dimension(200,200)); 
		itemPage.add(itemImage);
		
		
		btnBucket.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
				//지정한 Component의 액션이 발생했을 때,실행코드가 작동
		    	itemPage.setVisible(false);
		    }
		});
		
		btnHome.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
				//지정한 Component의 액션이 발생했을 때,실행코드가 작동
		    	itemPage.setVisible(true);
		    }
		});
		
		
		// 프레임에 패널 얹기
		frame.add(dashBord,BorderLayout.NORTH);
		frame.add(itemPage,BorderLayout.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
