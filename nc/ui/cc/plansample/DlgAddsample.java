package nc.ui.cc.plansample;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-1-19 16:50:47)
 * @author：张春明
 */
public class DlgAddsample extends nc.ui.pub.beans.UIDialog {
	private nc.ui.pub.beans.UIButton ivjBnCancel = null;
	private nc.ui.pub.beans.UIButton ivjBnOK = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private nc.ui.pub.beans.UILabel ivjLabCode = null;
	private nc.ui.pub.beans.UILabel ivjLabName = null;
	private nc.ui.pub.beans.UITextField ivjTxtCode = null;
	private nc.ui.pub.beans.UITextField ivjTxtName = null;
	private javax.swing.JPanel ivjUIDialogContentPane = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == DlgAddsample.this.getBnOK()) 
				connEtoC1();
			if (e.getSource() == DlgAddsample.this.getBnCancel()) 
				connEtoC2();
		};
	};
	private nc.ui.pub.beans.UILabel ivjLabMemo = null;
	private nc.ui.pub.beans.UITextField ivjTxtMemo = null;
/**
 * DlgAddsample 构造子注解。
 */
public DlgAddsample() {
	super();
	initialize();
}
/**
 * DlgAddsample 构造子注解。
 * @param parent java.awt.Container
 */
public DlgAddsample(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * DlgAddsample 构造子注解。
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public DlgAddsample(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * DlgAddsample 构造子注解。
 * @param owner java.awt.Frame
 */
public DlgAddsample(java.awt.Frame owner) {
	super(owner);
}
/**
 * DlgAddsample 构造子注解。
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public DlgAddsample(java.awt.Frame owner, String title) {
	super(owner, title);
}
/**
 * connEtoC1:  (BnOK.action. --> DlgAddsample.onBnOK()V)
 */
/* 警告：此方法将重新生成。 */
private void connEtoC1() {
	try {
		// user code begin {1}
		// user code end
		this.onBnOK();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BnCancel.action. --> DlgAddsample.onBnCancel()V)
 */
/* 警告：此方法将重新生成。 */
private void connEtoC2() {
	try {
		// user code begin {1}
		// user code end
		this.onBnCancel();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * 返回 BnCancel 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getBnCancel() {
	if (ivjBnCancel == null) {
		try {
			ivjBnCancel = new nc.ui.pub.beans.UIButton();
			ivjBnCancel.setName("BnCancel");
			ivjBnCancel.setText("取消");
			ivjBnCancel.setLocation(226, 161);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBnCancel;
}
/**
 * 返回 BnOK 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getBnOK() {
	if (ivjBnOK == null) {
		try {
			ivjBnOK = new nc.ui.pub.beans.UIButton();
			ivjBnOK.setName("BnOK");
			ivjBnOK.setText("确定");
			ivjBnOK.setLocation(105, 159);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBnOK;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-1-19 17:00:27)
 * @return java.lang.String[]
 */
public String[] getInputResult()
{
	String code = getTxtCode().getText().trim();
	String name = getTxtName().getText().trim();
	String memo = getTxtMemo().getText();
	return new String[]{code,name,memo};
}
/**
 * 返回 LabCode 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLabCode() {
	if (ivjLabCode == null) {
		try {
			ivjLabCode = new nc.ui.pub.beans.UILabel();
			ivjLabCode.setName("LabCode");
			ivjLabCode.setText("编码");
			ivjLabCode.setLocation(45, 24);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLabCode;
}
/**
 * 返回 LabMemo 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLabMemo() {
	if (ivjLabMemo == null) {
		try {
			ivjLabMemo = new nc.ui.pub.beans.UILabel();
			ivjLabMemo.setName("LabMemo");
			ivjLabMemo.setText("备注");
			ivjLabMemo.setLocation(45, 107);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLabMemo;
}
/**
 * 返回 LabName 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLabName() {
	if (ivjLabName == null) {
		try {
			ivjLabName = new nc.ui.pub.beans.UILabel();
			ivjLabName.setName("LabName");
			ivjLabName.setText("名称");
			ivjLabName.setLocation(45, 66);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLabName;
}
/**
 * 返回 TxtCode 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UITextField getTxtCode() {
	if (ivjTxtCode == null) {
		try {
			ivjTxtCode = new nc.ui.pub.beans.UITextField();
			ivjTxtCode.setName("TxtCode");
			ivjTxtCode.setBounds(105, 24, 191, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtCode;
}
/**
 * 返回 TxtMemo 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UITextField getTxtMemo() {
	if (ivjTxtMemo == null) {
		try {
			ivjTxtMemo = new nc.ui.pub.beans.UITextField();
			ivjTxtMemo.setName("TxtMemo");
			ivjTxtMemo.setBounds(105, 107, 191, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtMemo;
}
/**
 * 返回 TxtName 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UITextField getTxtName() {
	if (ivjTxtName == null) {
		try {
			ivjTxtName = new nc.ui.pub.beans.UITextField();
			ivjTxtName.setName("TxtName");
			ivjTxtName.setBounds(105, 66, 191, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtName;
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
			ivjUIDialogContentPane.setLayout(null);
			getUIDialogContentPane().add(getLabCode(), getLabCode().getName());
			getUIDialogContentPane().add(getLabName(), getLabName().getName());
			getUIDialogContentPane().add(getTxtCode(), getTxtCode().getName());
			getUIDialogContentPane().add(getTxtName(), getTxtName().getName());
			getUIDialogContentPane().add(getBnOK(), getBnOK().getName());
			getUIDialogContentPane().add(getBnCancel(), getBnCancel().getName());
			getUIDialogContentPane().add(getLabMemo(), getLabMemo().getName());
			getUIDialogContentPane().add(getTxtMemo(), getTxtMemo().getName());
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
 * 初始化连接
 * @exception java.lang.Exception 异常说明。
 */
/* 警告：此方法将重新生成。 */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getBnOK().addActionListener(ivjEventHandler);
	getBnCancel().addActionListener(ivjEventHandler);
}
/**
 * 初始化类。
 */
/* 警告：此方法将重新生成。 */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("DlgAddsample");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(395, 236);
		setTitle("增加样表");
		setContentPane(getUIDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		DlgAddsample aDlgAddsample;
		aDlgAddsample = new DlgAddsample();
		aDlgAddsample.setModal(true);
		aDlgAddsample.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aDlgAddsample.show();
		java.awt.Insets insets = aDlgAddsample.getInsets();
		aDlgAddsample.setSize(aDlgAddsample.getWidth() + insets.left + insets.right, aDlgAddsample.getHeight() + insets.top + insets.bottom);
		aDlgAddsample.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("nc.ui.pub.beans.UIDialog 的 main() 中发生异常");
		exception.printStackTrace(System.out);
	}
}
/**
 * Comment
 */
public void onBnCancel() 
{
	closeCancel();
	return;
}
/**
 * Comment
 */
public void onBnOK()
{
	String code = getTxtCode().getText();
	String name = getTxtName().getText();
	if(code == null || code.trim().equals(""))
		return;
	if(name == null || name.trim().equals(""))
		return;
	closeOK();
	return;
}
}
