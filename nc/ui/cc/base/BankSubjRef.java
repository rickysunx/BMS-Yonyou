package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-2-25 10:48:31)
 * @author：张春明
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
		"上年日均","上月日均","上月余额","本月日均","本月余额"
		};
	public final static int IATTR_SNRJ = 0;
	public final static int IATTR_SYRJ = 1;
	public final static int IATTR_SYYE = 2;
	public final static int IATTR_BYRJ = 3;
	public final static int IATTR_BYYE = 4;
/**
 * NCSubjRef 构造子注解。
 */
public BankSubjRef() {
	super();
	initialize();
}
/**
 * NCSubjRef 构造子注解。
 * @param parent java.awt.Container
 */
public BankSubjRef(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * NCSubjRef 构造子注解。
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public BankSubjRef(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * NCSubjRef 构造子注解。
 * @param owner java.awt.Frame
 */
public BankSubjRef(java.awt.Frame owner) {
	super(owner);
}
/**
 * NCSubjRef 构造子注解。
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public BankSubjRef(java.awt.Frame owner, String title) {
	super(owner, title);
}
/**
 * connEtoC1:  (BnOK.action. --> NCSubjRef.onBnOK()V)
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
 * connEtoC2:  (UIButton2.action. --> NCSubjRef.onBnCancel()V)
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
 * 返回 UIComboBox2 特性值。
 * @return nc.ui.pub.beans.UIComboBox
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 UIComboBox1 特性值。
 * @return nc.ui.pub.beans.UIComboBox
 */
/* 警告：此方法将重新生成。 */
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
 * 此处插入方法说明。
 * 创建日期：(2002-4-24 20:03:01)
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
 * 返回 LabCurr 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLabCurr() {
	if (ivjLabCurr == null) {
		try {
			ivjLabCurr = new nc.ui.pub.beans.UILabel();
			ivjLabCurr.setName("LabCurr");
			ivjLabCurr.setText("币种");
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
 * 将参数由编码转换为名称。
 * 创建日期：(2002-3-25 17:32:49)
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
	//getCmbAttr().addItem("上年日均");
	//getCmbAttr().addItem("上月日均");
	//getCmbAttr().addItem("上月余额");
	//getCmbAttr().addItem("本月日均");
	//getCmbAttr().addItem("本月余额");
	attrname = STR_ATTRNAME[Integer.parseInt(attr)];
	subjname = getKmNameByCode(subj);
	String sre = currname+","+subjname+","+attrname;
	return sre;
}
/**
 * 返回 Refncsubj 特性值。
 * @return nc.ui.pub.beans.UIRefPane
 */
/* 警告：此方法将重新生成。 */
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
 * 此处插入方法说明。
 * 创建日期：(2002-3-25 17:32:49)
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
 * 返回 UIButton2 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getUIButton2() {
	if (ivjUIButton2 == null) {
		try {
			ivjUIButton2 = new nc.ui.pub.beans.UIButton();
			ivjUIButton2.setName("UIButton2");
			ivjUIButton2.setText("取消");
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
 * 返回 UILabel2 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getUILabel2() {
	if (ivjUILabel2 == null) {
		try {
			ivjUILabel2 = new nc.ui.pub.beans.UILabel();
			ivjUILabel2.setName("UILabel2");
			ivjUILabel2.setText("科目");
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
 * 返回 UILabel3 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getUILabel3() {
	if (ivjUILabel3 == null) {
		try {
			ivjUILabel3 = new nc.ui.pub.beans.UILabel();
			ivjUILabel3.setName("UILabel3");
			ivjUILabel3.setText("属性");
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
	getUIButton2().addActionListener(ivjEventHandler);
}
/**
 * 初始化类。
 */
/* 警告：此方法将重新生成。 */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("NCSubjRef");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(365, 218);
		setTitle("大机科目");
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
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
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
	if(getRefncsubj().getRefCode()==null || getRefncsubj().getRefCode().trim().equals(""))
		return;
	if(getCmbCurr().getSelectedIndex()<0)
		return;
	closeOK();
	return;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2002-3-25 15:48:28)
 * @return int
 */
public int showRefDlg() {
	return showModal();
}
}
