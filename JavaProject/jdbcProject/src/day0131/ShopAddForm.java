package day0131;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ShopAddForm extends JFrame implements ActionListener {

	JTextField tfSang, tfSu, tfDan;
	JLabel lblPhoto;
	String imageName;
	JButton btnImg, btnIn;

	// db모델 생성
	ShopDbModel model = new ShopDbModel();
	// 내부클래스
	PhotoDraw photoDraw = new PhotoDraw();

	public ShopAddForm() {
		super("상품 추가 폼");

		this.setBounds(200, 100, 400, 350);
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);

		JLabel lbl1 = new JLabel("상품명");
		lbl1.setBounds(30, 10, 60, 30);
		this.add(lbl1);

		tfSang = new JTextField();
		tfSang.setBounds(110, 10, 100, 30);
		this.add(tfSang);

		JLabel lbl2 = new JLabel("사진 선택");
		lbl2.setBounds(30, 60, 60, 30);
		this.add(lbl2);

		btnImg = new JButton("사진 선택");
		btnImg.setBounds(110, 60, 100, 30);
		this.add(btnImg);
		btnImg.addActionListener(this);

		// 이미지 추가
		photoDraw.setBounds(250, 10, 80, 90);
		this.add(photoDraw);

		// 이미지 명
		lblPhoto = new JLabel("이미지명");
		lblPhoto.setBorder(new LineBorder(Color.pink));
		lblPhoto.setBounds(20, 120, 300, 30);
		this.add(lblPhoto);

		// 수량
		JLabel lbl3 = new JLabel("수량");
		lbl3.setBounds(30, 160, 70, 30);
		this.add(lbl3);

		tfSu = new JTextField();
		tfSu.setBounds(110, 160, 70, 30);
		this.add(tfSu);

		// 단가
		JLabel lbl4 = new JLabel("단가");
		lbl4.setBounds(30, 200, 70, 30);
		this.add(lbl4);

		tfDan = new JTextField();
		tfDan.setBounds(110, 200, 70, 30);
		this.add(tfDan);
		
		//db추가
		btnIn = new JButton("DB추가");
		btnIn.setBounds(220,250,100,30);
		btnIn.addActionListener(this);
		this.add(btnIn);
		
	}

	// 내부 클래스..이미지 삽입
	class PhotoDraw extends Canvas {
		@Override
		public void paint(Graphics g) {

			super.paint(g);
			
			if(imageName!=null) {
				Image img = new ImageIcon(imageName).getImage();
				g.drawImage(img, 10, 10, 60, 70, this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == btnImg) {
			FileDialog dlg = new FileDialog(this, "이미지 가져오기",FileDialog.LOAD);
			dlg.setVisible(true);
			
			//취소 누르면 메서드 종료
			if(dlg.getDirectory()==null) {
				return;
			}
			//이미지명 얻기
			imageName = dlg.getDirectory()+dlg.getFile();
			
			//라벨에 이미지명 출력
			lblPhoto.setText(imageName);
			
			//이미지 출력
			photoDraw.repaint();
			
		}else if ( ob == btnIn) {
			//ShopDto생성
			ShopDto dto = new ShopDto();
			
			//dto에 4개의 데이터를 넣는다
			dto.setSangpum(tfSang.getText());
			dto.setPhoto(imageName);
			dto.setSu(Integer.parseInt(tfSu.getText()));
			dto.setDan(Integer.parseInt(tfDan.getText()));
			
			//db모델에서 insert메서드 호출
			model.insertShop(dto);
			
			//현재창 닫기
			this.setVisible(false);
			
		}
	}

	//public static void main(String[] args) {
	//	new ShopAddForm();

	//}

}
