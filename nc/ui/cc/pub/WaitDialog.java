package nc.ui.cc.pub;


/**
 * �˴���������˵����
 * �������ڣ�(2002-9-19 11:22:59)
 * @���ߣ�������
 */
public class WaitDialog extends nc.ui.pub.beans.UIDialog {
	private javax.swing.Timer m_timer = null;
	private boolean m_bCanClosing = false;
	private nc.ui.pub.beans.UILabel ivjLblMsg = null;
	private javax.swing.JPanel ivjUIDialogContentPane = null;

	private TimerHandler m_timerHandle = null;
/**
 * WaitDialog ������ע�⡣
 */
public WaitDialog() {
	super();
	initialize();
}
/**
 * WaitDialog ������ע�⡣
 * @param parent java.awt.Container
 */
public WaitDialog(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * WaitDialog ������ע�⡣
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public WaitDialog(java.awt.Container parent, String title) {
	super(parent, title);
	initialize();
}
/**
 * WaitDialog ������ע�⡣
 * @param owner java.awt.Frame
 */
public WaitDialog(java.awt.Frame owner) {
	super(owner);
	initialize();
}
/**
 * WaitDialog ������ע�⡣
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public WaitDialog(java.awt.Frame owner, String title) {
	super(owner, title);
	initialize();
}
/**
 * WaitDialog ������ע�⡣
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public WaitDialog(java.awt.Frame owner, String title, String sMsg) {
	super(owner, title);
	initialize();
	getLblMsg().setText(sMsg);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-9-19 12:45:35)
 * @return nc.ui.pub.beans.lblInf
 */
private nc.ui.pub.beans.UILabel getLblMsg() {
	if (ivjLblMsg == null) {
		try {
			ivjLblMsg = new nc.ui.pub.beans.UILabel();
			ivjLblMsg.setName("LblMsg");
			ivjLblMsg.setText("���ڽ��У����Ժ�...");
			ivjLblMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			ivjLblMsg.setILabelType(0/** JavaĬ��(�Զ���)*/);
			ivjLblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblMsg;
}
/**
 * ���� UIDialogContentPane ����ֵ��
 * @return javax.swing.JPanel
 */
/* ���棺�˷������������ɡ� */
private javax.swing.JPanel getUIDialogContentPane() {
	if (ivjUIDialogContentPane == null) {
		try {
			ivjUIDialogContentPane = new javax.swing.JPanel();
			ivjUIDialogContentPane.setName("UIDialogContentPane");
			ivjUIDialogContentPane.setLayout(new java.awt.BorderLayout());
			getUIDialogContentPane().add(getLblMsg(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUIDialogContentPane;
}
/**
 * ÿ�������׳��쳣ʱ������
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* ��ȥ���и��е�ע�ͣ��Խ�δ��׽�����쳣��ӡ�� stdout�� */
	// System.out.println("--------- δ��׽�����쳣 ---------");
	// exception.printStackTrace(System.out);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("WaitDialog");
		/*
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter(){
				public void windowClosing(java.awt.event.WindowEvent e){
					setVisible(true);
					return;
				}
		});
		*/
		setSize(348, 77);
		setTitle("������");
		setContentPane(getUIDialogContentPane());
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	m_timerHandle = new TimerHandler(this);
	m_timer = new javax.swing.Timer(1000, m_timerHandle);
	m_timer.start();
	// user code end
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-9-19 14:27:16)
 * @return boolean
 */
boolean isCanClosing() {
	return m_bCanClosing;
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		WaitDialog aWaitDialog;
		aWaitDialog = new WaitDialog();
		aWaitDialog.setModal(true);
		aWaitDialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aWaitDialog.show();
		java.awt.Insets insets = aWaitDialog.getInsets();
		aWaitDialog.setSize(aWaitDialog.getWidth() + insets.left + insets.right, aWaitDialog.getHeight() + insets.top + insets.bottom);
		aWaitDialog.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("nc.ui.pub.beans.UIDialog �� main() �з����쳣");
		exception.printStackTrace(System.out);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-9-19 14:27:16)
 * @param newCanClosing boolean
 */
public void setCanClosing(boolean newCanClosing) {
	m_bCanClosing = newCanClosing;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-9-19 12:46:13)
 * @param sMsg java.lang.String
 */
public void setMsg(String sMsg) {
	getLblMsg().setText(sMsg);
}
/**
 * ��ʾ�Ի���
 * 
 */
public int showModal() {
	setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
	return super.showModal();
}
}