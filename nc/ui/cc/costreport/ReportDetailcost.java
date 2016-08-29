package nc.ui.cc.costreport;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-30 9:20:41)
 * @author���Ŵ���
 */
public class ReportDetailcost extends nc.ui.pub.ToftPanel {
	private CostDetailPanel ivjBodyPanel = null;
	private nc.ui.pub.beans.UIPanel ivjCondPanel = null;
	private nc.ui.pub.beans.UIRefPane ivjRefBeginDate = null;
	private nc.ui.pub.beans.UIRefPane ivjRefcorps = null;
	private nc.ui.pub.beans.UIRefPane ivjRefEnddate = null;
	private nc.ui.pub.beans.UILabel ivjUILabel1 = null;
	private nc.ui.pub.beans.UILabel ivjUILabel2 = null;
	private nc.ui.pub.beans.UILabel ivjUILabel3 = null;
	private nc.ui.pub.ButtonObject m_bnQry = new nc.ui.pub.ButtonObject("��ѯ","��ѯ",2);
	private nc.ui.pub.ButtonObject m_bnPrint = new nc.ui.pub.ButtonObject("��ӡ","��ӡ",2);
	private nc.ui.pub.ButtonObject m_allbns[] = new nc.ui.pub.ButtonObject[]{
		m_bnQry,m_bnPrint
		};
	private java.util.Hashtable m_htOutsystem = null;
	private nc.ui.pub.beans.UILabel ivjUILabel4 = null;
/**
 * ReportDetailcost ������ע�⡣
 */
public ReportDetailcost() {
	super();
	initialize();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 15:11:37)
 * @exception java.lang.Exception �쳣˵����
 */
private void doPrint() throws java.lang.Exception 
{
	
	nc.ui.bank_cvp.viewer.SpecialTablePrinter print = new nc.ui.bank_cvp.viewer.SpecialTablePrinter();
	String begin = getRefBeginDate().getRefCode();
	String end = getRefEnddate().getRefCode();
	print.setTable(getBodyPanel().getCurtable());
	print.setTitle("�������з�����ϸ��");
	print.setTopStr("������:"+begin+"---"+end+"��");
	print.setBottomStr("������Ա:"+getClientEnvironment().getUser().getUserName()+"��");
	print.printMe();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 9:52:09)
 * @exception java.lang.Exception �쳣˵����
 */
private void doQuery() throws java.lang.Exception
{
	nc.vo.cc.costreport.CCReportCondVO cond = new nc.vo.cc.costreport.CCReportCondVO();
	String begin = getRefBeginDate().getRefCode();
	String end = getRefEnddate().getRefCode();
	if(begin == null || begin.trim().equals(""))
		throw new Exception("��ʼ���ڲ���Ϊ��!");
	if(end == null || end.trim().equals(""))
		throw new Exception("�������ڲ���Ϊ��!");
	String corps[][] = null;
	nc.vo.bd.CorpVO vocorp[] = null;
	boolean bneedsplit = false;
	int incounter = 0;
	int outcounter = 0;
	if(getRefcorps().getRefPK() != null)
	{
		String corppks[] = getRefcorps().getRefPKs();
		String corpcodes[] = getRefcorps().getRefCodes();
		String corpnames[] = getRefcorps().getRefNames();
		corps = new String[corppks.length][3];
		vocorp = new nc.vo.bd.CorpVO[corppks.length];
		for(int i = 0;i<corppks.length;i++)
		{
			corps[i][0] = corppks[i];
			corps[i][1] = corpcodes[i];
			corps[i][2] = corpnames[i];
			vocorp[i] = new nc.vo.bd.CorpVO();
			vocorp[i].setPk_corp(corppks[i]);
			vocorp[i].setUnitcode(corpcodes[i]);
			vocorp[i].setUnitname(corpnames[i]);
			if(m_htOutsystem.containsKey(corppks[i]))
			{
				incounter++;
				bneedsplit = true;
			}
			else
			{
				outcounter ++;
			}
		}
		if(incounter == 0 || outcounter == 0)
			bneedsplit = false;
		else
			bneedsplit = true;
	}
	else
	{
		vocorp = nc.ui.bd.CorpBO_Client.queryAll(null);
		if(vocorp == null || vocorp.length == 0)
			throw new Exception("��ѯ��˾Ŀ¼Ϊ��!");
		corps = new String[vocorp.length][3];
		for(int i = 0;i<corps.length;i++)
		{
			corps[i][0] = vocorp[i].getPk_corp();
			corps[i][1] = vocorp[i].getUnitcode();
			corps[i][2] = vocorp[i].getUnitname();
		}
		bneedsplit = true;
	}
	if(!begin.substring(0,4).equals(end.substring(0,4)))
		throw new Exception("��֧�ֿ���Ȳ�ѯ!");
	cond.setBegindate(new nc.vo.pub.lang.UFDate(begin));
	cond.setEnddate(new nc.vo.pub.lang.UFDate(end));
	cond.setCorps(corps);
	getBodyPanel().setIsneed(bneedsplit);
	nc.vo.cc.indicator.IndicatorVO gls[] = nc.ui.cc.indicator.IndicatorBO_Client.queryAll(null);
	if(gls == null || gls.length == 0)
		throw new Exception("��ѯָ�굵��Ϊ��!");
	cond.setIndicators(gls);
	cond.setAllCorps(vocorp);
	getBodyPanel().setQryCond(cond);
}
/**
 * ���� BodyPanel ����ֵ��
 * @return nc.ui.cc.costreport.CostDetailPanel
 */
/* ���棺�˷������������ɡ� */
private CostDetailPanel getBodyPanel() {
	if (ivjBodyPanel == null) {
		try {
			ivjBodyPanel = new nc.ui.cc.costreport.CostDetailPanel();
			ivjBodyPanel.setName("BodyPanel");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBodyPanel;
}
/**
 * ���� CondPanel ����ֵ��
 * @return nc.ui.pub.beans.UIPanel
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIPanel getCondPanel() {
	if (ivjCondPanel == null) {
		try {
			ivjCondPanel = new nc.ui.pub.beans.UIPanel();
			ivjCondPanel.setName("CondPanel");
			ivjCondPanel.setPreferredSize(new java.awt.Dimension(0, 40));
			ivjCondPanel.setLayout(null);
			getCondPanel().add(getRefBeginDate(), getRefBeginDate().getName());
			getCondPanel().add(getUILabel1(), getUILabel1().getName());
			getCondPanel().add(getRefEnddate(), getRefEnddate().getName());
			getCondPanel().add(getUILabel2(), getUILabel2().getName());
			getCondPanel().add(getUILabel3(), getUILabel3().getName());
			getCondPanel().add(getRefcorps(), getRefcorps().getName());
			getCondPanel().add(getUILabel4(), getUILabel4().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCondPanel;
}
/**
 * ���� RefBeginDate ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefBeginDate() {
	if (ivjRefBeginDate == null) {
		try {
			ivjRefBeginDate = new nc.ui.pub.beans.UIRefPane();
			ivjRefBeginDate.setName("RefBeginDate");
			ivjRefBeginDate.setBounds(69, 3, 142, 22);
			// user code begin {1}
			ivjRefBeginDate.setRefNodeName("����");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefBeginDate;
}
/**
 * ���� Refcorps ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefcorps() {
	if (ivjRefcorps == null) {
		try {
			ivjRefcorps = new nc.ui.pub.beans.UIRefPane();
			ivjRefcorps.setName("Refcorps");
			ivjRefcorps.setBounds(471, 3, 203, 22);
			// user code begin {1}
			ivjRefcorps.setRefNodeName("��˾Ŀ¼");
			ivjRefcorps.setEnabled(false);
			ivjRefcorps.setMultiSelectedEnabled(true);
			ivjRefcorps.setVisible(true);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefcorps;
}
/**
 * ���� RefEnddate ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefEnddate() {
	if (ivjRefEnddate == null) {
		try {
			ivjRefEnddate = new nc.ui.pub.beans.UIRefPane();
			ivjRefEnddate.setName("RefEnddate");
			ivjRefEnddate.setBounds(283, 3, 142, 22);
			// user code begin {1}
			ivjRefEnddate.setRefNodeName("����");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefEnddate;
}
/**
 * ����ʵ�ָ÷���������ҵ�����ı��⡣
 * @version (00-6-6 13:33:25)
 *
 * @return java.lang.String
 */
public String getTitle()
{
	return "��������ҵ���з�����ϸ��";
}
/**
 * ���� UILabel1 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getUILabel1() {
	if (ivjUILabel1 == null) {
		try {
			ivjUILabel1 = new nc.ui.pub.beans.UILabel();
			ivjUILabel1.setName("UILabel1");
			ivjUILabel1.setText("��ʼ����");
			ivjUILabel1.setLocation(7, 3);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUILabel1;
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
			ivjUILabel2.setText("��������");
			ivjUILabel2.setLocation(224, 3);
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
			ivjUILabel3.setBounds(441, 3, 40, 22);
			// user code begin {1}
			ivjUILabel3.setVisible(true);
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
 * ���� UILabel4 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getUILabel4() {
	if (ivjUILabel4 == null) {
		try {
			ivjUILabel4 = new nc.ui.pub.beans.UILabel();
			ivjUILabel4.setName("UILabel4");
			ivjUILabel4.setText("��λ��Ԫ");
			ivjUILabel4.setBounds(690, 5, 69, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUILabel4;
}
/**
 * ÿ�������׳��쳣ʱ������
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* ��ȥ���и��е�ע�ͣ��Խ�δ��׽�����쳣��ӡ�� stdout�� */
	// System.out.println("--------- δ��׽�����쳣 ---------");
	exception.printStackTrace(System.out);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("ReportDetailcost");
		setLayout(new java.awt.BorderLayout());
		setSize(774, 419);
		add(getCondPanel(), "North");
		add(getBodyPanel(), "Center");
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setButtons(m_allbns);
	updateButtons();
	getBodyPanel().initTable();
	String pkcorp = nc.ui.pub.ClientEnvironment.getInstance().getCorporation().getPk_corp();
	if(pkcorp.equals("1001")||pkcorp.equals("0001"))
	{
		getRefcorps().setEnabled(true);
	}
	else
	{
		getRefcorps().setEnabled(false);
	}
	getRefcorps().setPK(pkcorp);
	m_htOutsystem = new java.util.Hashtable();
	String outsystem[][] = new String[][]{
		{"1022","������������"},
		{"1011","ׯ��������"},
		{"1009","������������"},
		{"1010","�߳ǽ�������"},
		{"1016","�߽�������"}
		};
	for(int i = 0;i<outsystem.length;i++)
	{
		m_htOutsystem.put(outsystem[i][0],outsystem[i][1]);
	}
	// user code end
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		ReportDetailcost aReportDetailcost;
		aReportDetailcost = new ReportDetailcost();
		frame.setContentPane(aReportDetailcost);
		frame.setSize(aReportDetailcost.getSize());
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		frame.show();
		java.awt.Insets insets = frame.getInsets();
		frame.setSize(frame.getWidth() + insets.left + insets.right, frame.getHeight() + insets.top + insets.bottom);
		frame.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("nc.ui.pub.ToftPanel �� main() �з����쳣");
		exception.printStackTrace(System.out);
	}
}
/**
 * ����ʵ�ָ÷�������Ӧ��ť�¼���
 * @version (00-6-1 10:32:59)
 *
 * @param bo ButtonObject
 */
public void onButtonClicked(nc.ui.pub.ButtonObject bo) 
{
	try
	{
		if(bo == m_bnQry)
		{
			doQuery();
			return;
		}
		if(bo == m_bnPrint)
		{
			doPrint();
			return;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		showErrorMessage(e.getMessage());
	}
}
}
