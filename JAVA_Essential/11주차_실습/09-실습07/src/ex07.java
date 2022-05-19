import java.awt.*;
public class ex07 {

	public static void main(String[] args) {
		//프레임 f생성
		Frame f = new Frame("Parent");
		//프레임 설정
		f.setSize(300,200);
		
		//메뉴바 생성
		MenuBar mb = new MenuBar();
		//메뉴 생성
		Menu mFile = new Menu("File");
		
		//메뉴아이템 생성
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		//메뉴아이템을 mFile메뉴에 추가
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);
		
		//메뉴아이템 생성
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		//메뉴아에팀을 mOthers메뉴에 추가
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		//메뉴 생성
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		//체크박스메뉴아이템 생성
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		//mView메뉴에 체크박스 추가
		mView.add(miStatusbar);
		//mFile, mEdit, mView, mHelp를 메뉴바에 추가
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		//프레임에 메뉴바 추가
		f.setMenuBar(mb);
		//프레임 출력
		f.setVisible(true);
		
	}

}
