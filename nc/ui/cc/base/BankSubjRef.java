package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-2-25 10:48:31)
 * @author���Ŵ���
 */
import java.util.*;
public class BankSubjRef extends nc.ui.pub.beans.UIDialog implements nc.ui.bank_cvp.compile.formulaedit.IReference {
	private nc.ui.pub.beans.UIButton ivjBnOK = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private nc.ui.pub.beans.UILabel ivjLabCurr = null;
	private nc.ui.pub.beans.UIRefPane ivjRefncsubj = null;
	private nc.ui.pub.beans.UIButton ivjUIButton2 = null;
	private javax.swing.JPanel ivjUIDialogContentPane = null;
	private nc.ui.pub.beans.UILabel ivjUILabel2 = null;
	private nc.ui.pub.beans.UILabel ivjUILabel3 = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == BankSubjRef.this.getBnOK()) 
				connEtoC1();
			if (e.getSource() == BankSubjRef.this.getUIButton2()) 
				connEtoC2();
		};
	};
	private nc.ui.pub.beans.UIComboBox ivjCmbAttr = null;
	private nc.ui.pub.beans.UIComboBox ivjCmbCurr = null;
	private nc.vo.bd.b20.CurrtypeVO m_voCurrtype[] = null;
	public String STR_ATTRNAME[] = new String[]{
		"�����վ�","�����վ�","�������","�����վ�","�������"
		};
	public final static int IATTR_SNRJ = 0;
	public final static int IATTR_SYRJ = 1;
	public final static int IATTR_SYYE = 2;
	public final static int IATTR_BYRJ = 3;
	public final static int IATTR_BYYE = 4;
/**
 * NCSubjRef ������ע�⡣
 */
public BankSubjRef() {
	super();
	initialize();
}
/**
 * NCSubjRef ������ע�⡣
 * @param parent java.awt.Container
 */
public BankSubjRef(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * NCSubjRef ������ע�⡣
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public BankSubjRef(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * NCSubjRef ������ע�⡣
 * @param owner java.awt.Frame
 */
public BankSubjRef(java.awt.Frame owner) {
	super(owner);
}
/**
 * NCSubjRef ������ע�⡣
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public BankSubjRef(java.awt.Frame owner, String title) {
	super(owner, title);
}
/**
 * connEtoC1:  (BnOK.action. --> NCSubjRef.onBnOK()V)
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
 * connEtoC2:  (UIButton2.action. --> NCSubjRef.onBnCancel()V)
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
			ivjBnOK.setLocation(92, 142);
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
 * ���� UIComboBox2 ����ֵ��
 * @return nc.ui.pub.beans.UIComboBox
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIComboBox getCmbAttr() {
	if (ivjCmbAttr == null) {
		try {
			ivjCmbAttr = new nc.ui.pub.beans.UIComboBox();
			ivjCmbAttr.setName("CmbAttr");
			ivjCmbAttr.setBounds(108, 94, 173, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCmbAttr;
}
/**
 * ���� UIComboBox1 ����ֵ��
 * @return nc.ui.pub.beans.UIComboBox
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIComboBox getCmbCurr() {
	if (ivjCmbCurr == null) {
		try {
			ivjCmbCurr = new nc.ui.pub.beans.UIComboBox();
			ivjCmbCurr.setName("CmbCurr");
			ivjCmbCurr.setBounds(108, 19, 173, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCmbCurr;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-4-24 20:03:01)
 * @return java.lang.String
 * @param code java.lang.String
 */
public String getKmNameByCode(String code) {
	Vector vData = getRefncsubj().getRefModel().getData();
	if(vData == null || vData.size()== 0)
		return null;
	String sName = null;
	Vector v0 = null;
	String scode1 = null;
	for(int i = 0;i<vData.size();i++)
	{
		v0 = (Vector)vData.elementAt(i);
		scode1 = v0.elementAt(0).toString().trim();
		if(scode1.equals(code))
			return v0.elementAt(1).toString();
	}
	return sName;
}
/**
 * ���� LabCurr ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLabCurr() {
	if (ivjLabCurr == null) {
		try {
			ivjLabCurr = new nc.ui.pub.beans.UILabel();
			ivjLabCurr.setName("LabCurr");
			ivjLabCurr.setText("����");
			ivjLabCurr.setLocation(50, 19);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLabCurr;
}
/**
 * �������ɱ���ת��Ϊ���ơ�
 * �������ڣ�(2002-3-25 17:32:49)
 * @return java.lang.String
 */
public String getNameByCode(String code) throws Throwable
{
	int idx0 = code.indexOf(",");
	int idx1 = code.indexOf(",",idx0+1);
	String curr = code.substring(0,idx0);
	String subj = code.substring(idx0,idx1);
	String attr = code.substring(idx1,code.length());
	curr = curr.substring(1,curr.length() - 1);
	subj = subj.substring(2,subj.length() - 1);
	attr = attr.substring(1,attr.length() );
	String currname = null;
	String subjname = null;
	String attrname = null;
	
	for(int i = 0;i<m_voCurrtype.length;i++)
	{
		if(m_voCurrtype[i].getCurrtypecode().equals(curr))
		{
			currname = m_voCurrtype[i].getCurrtypename();
			break;
		}
	}
	//getCmbAttr().addItem("�����վ�");
	//getCmbAttr().addItem("�����վ�");
	//getCmbAttr().addItem("�������");
	//getCmbAttr().addItem("�����վ�");
	//getCmbAttr().addItem("�������");
	attrname = STR_ATTRNAME[Integer.parseInt(attr)];
	subjname = getKmNameByCode(subj);
	String sre = currname+","+subjname+","+attrname;
	return sre;
}
/**
 * ���� Refncsubj ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefncsubj() {
	if (ivjRefncsubj == null) {
		try {
			ivjRefncsubj = new nc.ui.pub.beans.UIRefPane();
			ivjRefncsubj.setName("Refncsubj");
			ivjRefncsubj.setBounds(108, 57, 173, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefncsubj;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-3-25 17:32:49)
 * @return java.lang.String
 */
public String getRefString()
{
	String code = getRefncsubj().getRefCode();
	String curr = getCmbCurr().getSelectedItem().toString();
	curr = curr.substring(0,curr.indexOf(" ")).trim();
	int attr = getCmbAttr().getSelectedIndex();
	String sre = "\""+curr+"\",\""+code+"\","+attr;
	return sre;
}
/**
 * ���� UIButton2 ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getUIButton2() {
	if (ivjUIButton2 == null) {
		try {
			ivjUIButton2 = new nc.ui.pub.beans.UIButton();
			ivjUIButton2.setName("UIButton2");
			ivjUIButton2.setText("ȡ��");
			ivjUIButton2.setLocation(211, 142);
			ivjUIButton2.setActionCommand("BnCancel");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUIButton2;
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
			getUIDialogContentPane().add(getLabCurr(), getLabCurr().getName());
			getUIDialogContentPane().add(getUILabel2(), getUILabel2().getName());
			getUIDialogContentPane().add(getUILabel3(), getUILabel3().getName());
			getUIDialogContentPane().add(getCmbCurr(), getCmbCurr().getName());
			getUIDialogContentPane().add(getCmbAttr(), getCmbAttr().getName());
			getUIDialogContentPane().add(getBnOK(), getBnOK().getName());
			getUIDialogContentPane().add(getUIButton2(), getUIButton2().getName());
			getUIDialogContentPane().add(getRefncsubj(), getRefncsubj().getName());
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
 * ���� UILabel2 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getUILabel2() {
	if (ivjUILabel2 == null) {
		try {
			ivjUILabel2 = new nc.ui.pub.beans.UILabel();
			ivjUILabel2.setName("UILabel2");
			ivjUILabel2.setText("��Ŀ");
			ivjUILabel2.setLocation(50, 57);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUILabel2;
}
/**
 * ���� UILabel3 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getUILabel3() {
	if (ivjUILabel3 == null) {
		try {
			ivjUILabel3 = new nc.ui.pub.beans.UILabel();
			ivjUILabel3.setName("UILabel3");
			ivjUILabel3.setText("����");
			ivjUILabel3.setLocation(50, 94);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUILabel3;
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
	getUIButton2().addActionListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("NCSubjRef");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(365, 218);
		setTitle("�����Ŀ");
		setContentPane(getUIDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	try
	{
		for(int i = 0;i<STR_ATTRNAME.length;i++)
		{
			getCmbAttr().addItem(STR_ATTRNAME[i]);
		}
		//biz
		nc.vo.bd.b20.CurrtypeVO curr[] = nc.ui.bd.b20.CurrtypeBO_Client.queryAll(null);
		if(curr!= null)
		{
			for(int i = 0;i<curr.length;i++)
			{
				getCmbCurr().addItem(curr[i].getCurrtypecode()+"  "+curr[i].getCurrtypename());
			}
		}
		m_voCurrtype = curr;
		getRefncsubj().setRefType(1);
		getRefncsubj().setRefModel(new BankKmModel());
	}
	catch(Exception e)
	{
		handleException(e);
	}
	// user code end
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		BankSubjRef aNCSubjRef;
		aNCSubjRef = new BankSubjRef();
		aNCSubjRef.setModal(true);
		aNCSubjRef.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aNCSubjRef.show();
		java.awt.Insets insets = aNCSubjRef.getInsets();
		aNCSubjRef.setSize(aNCSubjRef.getWidth() + insets.left + insets.right, aNCSubjRef.getHeight() + insets.top + insets.bottom);
		aNCSubjRef.setVisible(true);
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
	if(getRefncsubj().getRefCode()==null || getRefncsubj().getRefCode().trim().equals(""))
		return;
	if(getCmbCurr().getSelectedIndex()<0)
		return;
	closeOK();
	return;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2002-3-25 15:48:28)
 * @return int
 */
public int showRefDlg() {
	return showModal();
}
}
