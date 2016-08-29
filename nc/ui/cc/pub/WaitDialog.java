package nc.ui.cc.pub;


/**
 * 此处插入类型说明。
 * 创建日期：(2002-9-19 11:22:59)
 * @作者：汤安清
 */
public class WaitDialog extends nc.ui.pub.beans.UIDialog {
	private javax.swing.Timer m_timer = null;
	private boolean m_bCanClosing = false;
	private nc.ui.pub.beans.UILabel ivjLblMsg = null;
	private javax.swing.JPanel ivjUIDialogContentPane = null;

	private TimerHandler m_timerHandle = null;
/**
 * WaitDialog 构造子注解。
 */
public WaitDialog() {
	super();
	initialize();
}
/**
 * WaitDialog 构造子注解。
 * @param parent java.awt.Container
 */
public WaitDialog(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * WaitDialog 构造子注解。
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public WaitDialog(java.awt.Container parent, String title) {
	super(parent, title);
	initialize();
}
/**
 * WaitDialog 构造子注解。
 * @param owner java.awt.Frame
 */
public WaitDialog(java.awt.Frame owner) {
	super(owner);
	initialize();
}
/**
 * WaitDialog 构造子注解。
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public WaitDialog(java.awt.Frame owner, String title) {
	super(owner, title);
	initialize();
}
/**
 * WaitDialog 构造子注解。
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public WaitDialog(java.awt.Frame owner, String title, String sMsg) {
	super(owner, title);
	initialize();
	getLblMsg().setText(sMsg);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2002-9-19 12:45:35)
 * @return nc.ui.pub.beans.lblInf
 */
private nc.ui.pub.beans.UILabel getLblMsg() {
	if (ivjLblMsg == null) {
		try {
			ivjLblMsg = new nc.ui.pub.beans.UILabel();
			ivjLblMsg.setName("LblMsg");
			ivjLblMsg.setText("正在进行，请稍候...");
			ivjLblMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			ivjLblMsg.setILabelType(0/** Java默认(自定义)*/);
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
 * 返回 UIDialogContentPane 特性值。
 * @return javax.swing.JPanel
 */
/* 警告：此方法将重新生成。 */
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
 * 每当部件抛出异常时被调用
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* 除去下列各行的注释，以将未捕捉到的异常打印至 stdout。 */
	// System.out.println("--------- 未捕捉到的异常 ---------");
	// exception.printStackTrace(System.out);
}
/**
 * 初始化类。
 */
/* 警告：此方法将重新生成。 */
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
		setTitle("进行中");
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
 * 此处插入方法说明。
 * 创建日期：(2002-9-19 14:27:16)
 * @return boolean
 */
boolean isCanClosing() {
	return m_bCanClosing;
}
/**
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
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
		System.err.println("nc.ui.pub.beans.UIDialog 的 main() 中发生异常");
		exception.printStackTrace(System.out);
	}
}
/**
 * 此处插入方法说明。
 * 创建日期：(2002-9-19 14:27:16)
 * @param newCanClosing boolean
 */
public void setCanClosing(boolean newCanClosing) {
	m_bCanClosing = newCanClosing;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2002-9-19 12:46:13)
 * @param sMsg java.lang.String
 */
public void setMsg(String sMsg) {
	getLblMsg().setText(sMsg);
}
/**
 * 显示对话框
 * 
 */
public int showModal() {
	setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
	return super.showModal();
}
}