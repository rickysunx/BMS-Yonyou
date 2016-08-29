package nc.ui.cc.budgetanalyse;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-30 15:30:56)
 * @author���Ŵ���
 */
import nc.vo.cc.budgetanalyse.*;
import nc.vo.pub.lang.UFDate;

import java.util.*;
public class CCAnalyser extends nc.ui.pub.ToftPanel {
	private nc.ui.pub.beans.UIPanel ivjPaneBody = null;
	private nc.ui.pub.beans.UIPanel ivjPaneCond = null;
	private nc.ui.pub.beans.UIRefPane ivjRefCorp = null;
	private nc.ui.pub.beans.UIRefPane ivjRefperiod = null;
	private nc.ui.pub.beans.UIRefPane ivjRefSample = null;
	private nc.ui.pub.beans.UILabel ivjUILabel1 = null;
	private nc.ui.pub.beans.UILabel ivjUILabel2 = null;
	private nc.ui.pub.beans.UILabel ivjUILabel3 = null;
	private nc.ui.pub.beans.UITablePane ivjUITablePane1 = null;
	private nc.ui.cc.pub.ColDisTabModel m_tmmodel = null;
	private nc.ui.pub.ButtonObject m_bnQuery = new nc.ui.pub.ButtonObject("��ѯ","��ѯ",2);
	private nc.ui.pub.ButtonObject m_bnPrint = new nc.ui.pub.ButtonObject("��ӡ","��ӡ",2);
	private nc.ui.pub.ButtonObject m_allBtns[] = new nc.ui.pub.ButtonObject[]{
		m_bnQuery,m_bnPrint
	};
	private CCBudgetRTVO m_voDatas[][] = null;
	private nc.ui.pub.beans.UILabel ivjUILabel4 = null;
/**
 * CCAnalyser ������ע�⡣
 */
public CCAnalyser() {
	super();
	initialize();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 16:24:23)
 * @exception java.lang.Exception �쳣˵����
 */
private void dealQuery(CCBudgetQryCond cond) throws java.lang.Exception 
{
	m_voDatas = CCBudgetAnalyseBO_Client.queryBudgetAndAct(cond);
	if(m_voDatas == null || m_voDatas.length == 0)
	{
		m_tmmodel.setColIdentifier(new String[]{"Ԥ����Ŀ","Ԥ��ֵ","�ѷ���","���"});
		m_tmmodel.setData(null);
		getUITablePane1().getTable().setModel(m_tmmodel);
		return;
	}
	String corps[][] = cond.getCorps();
	int ilen = m_voDatas[0].length;
	int iwid = corps.length*3+1;//
	Object fixed[] = new Object[ilen];
	Object corpdata[][] = null;
	Vector vre = new Vector();
	for(int i = 0;i<m_voDatas.length;i++)
	{
		corpdata = new Object[ilen][3];
		
		for(int j = 0;j<m_voDatas[i].length;j++)
		{
			fixed[j] = m_voDatas[i][j].getSampleitemname();
			corpdata[j][0] = m_voDatas[i][j].getBudget();
			corpdata[j][1] = m_voDatas[i][j].getActual()/*.div(10000.00)*/;
			corpdata[j][2] = m_voDatas[i][j].getBudget().sub(m_voDatas[i][j].getActual()/*.div(10000.0)*/);
		}
		vre.addElement(corpdata);
	}
	Object data[][] = new Object[ilen][iwid];
	//fixed
	for(int i = 0;i<fixed.length;i++)
	{
		data[i][0] = fixed[i];
	}
	nc.vo.pub.lang.UFDouble udsumb = new nc.vo.pub.lang.UFDouble(0.0);
	nc.vo.pub.lang.UFDouble udsuma = new nc.vo.pub.lang.UFDouble(0.0);
	nc.vo.pub.lang.UFDouble udsumd = new nc.vo.pub.lang.UFDouble(0.0);
	Object sum[][] = new Object[ilen][3];
	for(int i = 0;i<vre.size();i++)//��˾:��
	{
		//udsumb = new nc.vo.pub.lang.UFDouble(0.0);
		//udsuma = new nc.vo.pub.lang.UFDouble(0.0);
		//udsumd = new nc.vo.pub.lang.UFDouble(0.0);

		corpdata = (Object[][])vre.elementAt(i);
		for(int j = 0;j<corpdata.length;j++)//��
		{
			data[j][i*3+1] = new nc.vo.pub.lang.UFDouble(corpdata[j][0].toString());
			data[j][i*3+2] = new nc.vo.pub.lang.UFDouble(corpdata[j][1].toString());
			data[j][i*3+3] = new nc.vo.pub.lang.UFDouble(corpdata[j][2].toString());
			//udsumb = udsumb.add(new nc.vo.pub.lang.UFDouble(corpdata[j][0].toString()));
			//udsuma = udsuma.add(new nc.vo.pub.lang.UFDouble(corpdata[j][2].toString()));
			//udsumd = udsumd.add(new nc.vo.pub.lang.UFDouble(corpdata[j][2].toString()));
		}
		//sum[i][0] = udsumb;
		//sum[i][1] = udsuma;
		//sum[i][2] = udsumd;
	}
	//cols
	
	Vector vpcols = new Vector();
	Vector vfcols = new Vector();
	vpcols.addElement("������Ŀ");
	vfcols.addElement("������Ŀ");
	for(int i = 0;i<corps.length;i++)
	{
		vpcols.addElement("�ƻ���");
		vpcols.addElement("ʵ����");
		vpcols.addElement("���");
		vfcols.addElement(corps[i][2]+"/"+"�ƻ���");
		vfcols.addElement(corps[i][2]+"/"+"ʵ����");
		vfcols.addElement(corps[i][2]+"/"+"���");
	}
	if(corps.length >1)
	{
		vpcols.addElement("�ƻ���");
		vpcols.addElement("ʵ����");
		vpcols.addElement("���");
		vfcols.addElement("�ϼ�"+"/"+"�ƻ���");
		vfcols.addElement("�ϼ�"+"/"+"ʵ����");
		vfcols.addElement("�ϼ�"+"/"+"���");
		Object tmp[][] = data;
		data = new Object[tmp.length][tmp[0].length+3];
		int iw = tmp[0].length;
		for(int i = 0;i<tmp.length;i++)
		{
			udsumb = new nc.vo.pub.lang.UFDouble(0.0);
			udsuma = new nc.vo.pub.lang.UFDouble(0.0);
			udsumd = new nc.vo.pub.lang.UFDouble(0.0);
			int icouter = 1;
			for(int j = 0;j<tmp[0].length;j++)
			{
				data[i][j] = tmp[i][j];
			}
			for(int j = 1;j<tmp[0].length;j++)
			{
				if(icouter == 4)
					icouter = 1;
				data[i][j] = tmp[i][j];
				if(icouter == 1)
					udsumb = udsumb.add(new nc.vo.pub.lang.UFDouble(tmp[i][j].toString()));
				if(icouter == 2)
					udsuma = udsuma.add(new nc.vo.pub.lang.UFDouble(tmp[i][j].toString()));
				if(icouter == 3)
					udsumd = udsumd.add(new nc.vo.pub.lang.UFDouble(tmp[i][j].toString()));
				icouter ++;
			}
			data[i][iw] = udsumb;//sum[i][0];
			data[i][iw+1] = udsuma;//sum[i][1];
			data[i][iw+2] = udsumd;//sum[i][2];
		}
	}
	String purecols[] = new String[vpcols.size()];
	String fullcols[] = new String[vfcols.size()];
	vfcols.copyInto(fullcols);
	vpcols.copyInto(purecols);
	m_tmmodel.setColIdentifier(purecols);
	m_tmmodel.setFullColumn(fullcols);
	data = nc.vo.cc.pubs.NumFormate.getPrecisionData(data,2);
	m_tmmodel.setData(data);
	ColGrpGenerator gen = new ColGrpGenerator();
	getUITablePane1().getTable().setModel(m_tmmodel);
	nc.ui.pub.beans.UITable table  = getUITablePane1().getTable();
	gen.rebuild(table);
	getUITablePane1().setViewportView(table);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 16:02:39)
 * @exception java.lang.Exception �쳣˵����
 */
private void doPrint() throws java.lang.Exception 
{
	nc.ui.bank_cvp.viewer.SpecialTablePrinter print = new nc.ui.bank_cvp.viewer.SpecialTablePrinter();
	
	print.setTable(getUITablePane1().getTable());
	print.setTitle("Ԥ��ִ�����������");
	print.setTopStr("������:"+getRefCorp().getRefName()+"��"+"    ���ڼ�:"+getRefperiod().getRefName()+"��"+"    ������:"+getRefSample().getRefName()+"��");
	print.setBottomStr("������Ա:"+getClientEnvironment().getUser().getUserName()+"��");
	print.printMe();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 16:02:39)
 * @exception java.lang.Exception �쳣˵����
 */
private void doQuery() throws java.lang.Exception 
{
	String period = getRefperiod().getRefName();
	if(period == null || period.trim().equals(""))
		throw new Exception("����ڼ䲻��Ϊ��!");
	String samplepk = getRefSample().getRefPK();
	if(samplepk == null || samplepk.trim().equals(""))
		throw new Exception("�ƻ�������Ϊ��!");
	String pkcorp = getRefCorp().getRefPK();
	if(pkcorp == null || pkcorp.trim().equals(""))
		throw new Exception("���㲻��Ϊ��!");
	String samples[] = new String[2];
	String pks[] = null;
	String codes[] = null;
	String names[] = null;
	pks = getRefCorp().getRefPKs();
	codes = getRefCorp().getRefCodes();
	names = getRefCorp().getRefNames();
	String corps[][] = new String[pks.length][3];
	for(int i = 0;i<corps.length;i++)
	{
		corps[i][0] = pks[i];
		corps[i][1] = codes[i];
		corps[i][2] = names[i];
	}
	samples[0] = getRefSample().getRefPK();
	samples[1] = getRefSample().getRefName();
	CCBudgetQryCond cond = new CCBudgetQryCond();
	cond.setSample(samples);
	cond.setPeriod(period);
	cond.setCorps(corps);
	nc.vo.cc.plansample.PlanSampleItemVO item[] = nc.ui.cc.plansample.CCPlanSampleBO_Client.querySampleItems(samples[0]);
	cond.setSampleItem(item);
	UFDate firstDate = new UFDate(period + "-01");
	UFDate currDate = new UFDate(period + "-" + String.valueOf(firstDate.getDaysMonth()));
	cond.setCurrdate(currDate);
	dealQuery(cond);
}
/**
 * ���� PaneBody ����ֵ��
 * @return nc.ui.pub.beans.UIPanel
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIPanel getPaneBody() {
	if (ivjPaneBody == null) {
		try {
			ivjPaneBody = new nc.ui.pub.beans.UIPanel();
			ivjPaneBody.setName("PaneBody");
			ivjPaneBody.setLayout(new java.awt.BorderLayout());
			getPaneBody().add(getUITablePane1(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPaneBody;
}
/**
 * ���� PaneCond ����ֵ��
 * @return nc.ui.pub.beans.UIPanel
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIPanel getPaneCond() {
	if (ivjPaneCond == null) {
		try {
			ivjPaneCond = new nc.ui.pub.beans.UIPanel();
			ivjPaneCond.setName("PaneCond");
			ivjPaneCond.setPreferredSize(new java.awt.Dimension(0, 40));
			ivjPaneCond.setLayout(null);
			getPaneCond().add(getUILabel1(), getUILabel1().getName());
			getPaneCond().add(getRefCorp(), getRefCorp().getName());
			getPaneCond().add(getUILabel2(), getUILabel2().getName());
			getPaneCond().add(getRefperiod(), getRefperiod().getName());
			getPaneCond().add(getUILabel3(), getUILabel3().getName());
			getPaneCond().add(getRefSample(), getRefSample().getName());
			getPaneCond().add(getUILabel4(), getUILabel4().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPaneCond;
}
/**
 * ���� RefCorp ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefCorp() {
	if (ivjRefCorp == null) {
		try {
			ivjRefCorp = new nc.ui.pub.beans.UIRefPane();
			ivjRefCorp.setName("RefCorp");
			ivjRefCorp.setBounds(47, 3, 129, 22);
			// user code begin {1}
			ivjRefCorp.setRefNodeName("��˾Ŀ¼");
			ivjRefCorp.setEnabled(false);
			ivjRefCorp.setMultiSelectedEnabled(true);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefCorp;
}
/**
 * ���� Refperiod ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefperiod() {
	if (ivjRefperiod == null) {
		try {
			ivjRefperiod = new nc.ui.pub.beans.UIRefPane();
			ivjRefperiod.setName("Refperiod");
			ivjRefperiod.setLocation(248, 3);
			// user code begin {1}
			ivjRefperiod.setRefNodeName("����ڼ�");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefperiod;
}
/**
 * ���� RefSample ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefSample() {
	if (ivjRefSample == null) {
		try {
			ivjRefSample = new nc.ui.pub.beans.UIRefPane();
			ivjRefSample.setName("RefSample");
			ivjRefSample.setLocation(441, 3);
			// user code begin {1}
			ivjRefSample.setRefModel(new RefSampleModel());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefSample;
}
/**
 * ����ʵ�ָ÷���������ҵ�����ı��⡣
 * @version (00-6-6 13:33:25)
 *
 * @return java.lang.String
 */
public String getTitle() {
	return "�ƻ�ִ�з���";
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
			ivjUILabel1.setText("����");
			ivjUILabel1.setBounds(8, 3, 37, 22);
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
			ivjUILabel2.setText("�ƻ��ڼ�");
			ivjUILabel2.setLocation(192, 3);
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
			ivjUILabel3.setText("�ƻ�����");
			ivjUILabel3.setLocation(385, 3);
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
 * ���� UILabel4 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getUILabel4() {
	if (ivjUILabel4 == null) {
		try {
			ivjUILabel4 = new nc.ui.pub.beans.UILabel();
			ivjUILabel4.setName("UILabel4");
			ivjUILabel4.setText("��λ:Ԫ");
			ivjUILabel4.setBounds(590, 3, 111, 22);
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
 * ���� UITablePane1 ����ֵ��
 * @return nc.ui.pub.beans.UITablePane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITablePane getUITablePane1() {
	if (ivjUITablePane1 == null) {
		try {
			ivjUITablePane1 = new nc.ui.pub.beans.UITablePane();
			ivjUITablePane1.setName("UITablePane1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUITablePane1;
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 15:51:15)
 */
public void initdata() 
{
	m_tmmodel = new nc.ui.cc.pub.ColDisTabModel();
	m_tmmodel.setColIdentifier(new String[]{"Ԥ����Ŀ","Ԥ��ֵ","�ѷ���","���"});
	m_tmmodel.setData(null);
	getUITablePane1().getTable().setModel(m_tmmodel);
	getUITablePane1().getTable().setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
	setButtons(m_allBtns);
	updateButtons();
	String pkcorp = getClientEnvironment().getCorporation().getPk_corp();
	getRefCorp().setPK(pkcorp);
	if(pkcorp.equals("0001")||pkcorp.equals("1001"))
		getRefCorp().setEnabled(true);	
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("CCAnalyser");
		setLayout(new java.awt.BorderLayout());
		setSize(774, 419);
		add(getPaneCond(), "North");
		add(getPaneBody(), "Center");
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	initdata();
	// user code end
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		CCAnalyser aCCAnalyser;
		aCCAnalyser = new CCAnalyser();
		frame.setContentPane(aCCAnalyser);
		frame.setSize(aCCAnalyser.getSize());
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
		if(bo == m_bnPrint)
		{
			doPrint();
			return;
		}
		if(bo == m_bnQuery)
		{
			doQuery();
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
