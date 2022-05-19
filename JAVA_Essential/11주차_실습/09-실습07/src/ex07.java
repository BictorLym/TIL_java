import java.awt.*;
public class ex07 {

	public static void main(String[] args) {
		//������ f����
		Frame f = new Frame("Parent");
		//������ ����
		f.setSize(300,200);
		
		//�޴��� ����
		MenuBar mb = new MenuBar();
		//�޴� ����
		Menu mFile = new Menu("File");
		
		//�޴������� ����
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		//�޴��������� mFile�޴��� �߰�
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);
		
		//�޴������� ����
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		//�޴��ƿ����� mOthers�޴��� �߰�
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		//�޴� ����
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		//üũ�ڽ��޴������� ����
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		//mView�޴��� üũ�ڽ� �߰�
		mView.add(miStatusbar);
		//mFile, mEdit, mView, mHelp�� �޴��ٿ� �߰�
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		//�����ӿ� �޴��� �߰�
		f.setMenuBar(mb);
		//������ ���
		f.setVisible(true);
		
	}

}
