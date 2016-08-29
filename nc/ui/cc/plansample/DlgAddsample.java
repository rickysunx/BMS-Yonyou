package nc.ui.cc.plansample;

/**
 * �˴���������˵����
 * �������ڣ�(2005-1-19 16:50:47)
 * @author���Ŵ���
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
 * DlgAddsample ������ע�⡣
 */
public DlgAddsample() {
	super();
	initialize();
}
/**
 * DlgAddsample ������ע�⡣
 * @param parent java.awt.Container
 */
public DlgAddsample(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * DlgAddsample ������ע�⡣
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public DlgAddsample(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * DlgAddsample ������ע�⡣
 * @param owner java.awt.Frame
 */
public DlgAddsample(java.awt.Frame owner) {
	super(owner);
}
/**
 * DlgAddsample ������ע�⡣
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public DlgAddsample(java.awt.Frame owner, String title) {
	super(owner, title);
}
/**
 * connEtoC1:  (BnOK.action. --> DlgAddsample.onBnOK()V)
 */
/* ���棺�˷������������ɡ� */
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
/* ���棺�˷������������ɡ� */
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
 * ���� BnCancel ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBnCancel() {
	if (ivjBnCancel == null) {
		try {
			ivjBnCancel = new nc.ui.pub.beans.UIButton();
			ivjBnCancel.setName("BnCancel");
			ivjBnCancel.setText("ȡ��");
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
 * ���� BnOK ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBnOK() {
	if (ivjBnOK == null) {
		try {
			ivjBnOK = new nc.ui.pub.beans.UIButton();
			ivjBnOK.setName("BnOK");
			ivjBnOK.setText("ȷ��");
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-1-19 17:00:27)
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
 * ���� LabCode ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLabCode() {
	if (ivjLabCode == null) {
		try {
			ivjLabCode = new nc.ui.pub.beans.UILabel();
			ivjLabCode.setName("LabCode");
			ivjLabCode.setText("����");
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
 * ���� LabMemo ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLabMemo() {
	if (ivjLabMemo == null) {
		try {
			ivjLabMemo = new nc.ui.pub.beans.UILabel();
			ivjLabMemo.setName("LabMemo");
			ivjLabMemo.setText("��ע");
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
 * ���� LabName ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLabName() {
	if (ivjLabName == null) {
		try {
			ivjLabName = new nc.ui.pub.beans.UILabel();
			ivjLabName.setName("LabName");
			ivjLabName.setText("����");
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
 * ���� TxtCode ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
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
 * ���� TxtMemo ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
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
 * ���� TxtName ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
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
 * ���� UIDialogContentPane ����ֵ��
 * @return javax.swing.JPanel
 */
/* ���棺�˷������������ɡ� */
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
 * ÿ�������׳��쳣ʱ������
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* ��ȥ���и��е�ע�ͣ��Խ�δ��׽�����쳣��ӡ�� stdout�� */
	// System.out.println("--------- δ��׽�����쳣 ---------");
	// exception.printStackTrace(System.out);
}
/**
 * ��ʼ������
 * @exception java.lang.Exception �쳣˵����
 */
/* ���棺�˷������������ɡ� */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getBnOK().addActionListener(ivjEventHandler);
	getBnCancel().addActionListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("DlgAddsample");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(395, 236);
		setTitle("��������");
		setContentPane(getUIDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
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
		System.err.println("nc.ui.pub.beans.UIDialog �� main() �з����쳣");
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
