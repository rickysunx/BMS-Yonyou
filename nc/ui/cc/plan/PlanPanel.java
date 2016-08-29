package nc.ui.cc.plan;

import nc.bs.cc.plan.*;
import nc.ui.cc.base.*;
import nc.vo.cc.base.*;
import nc.vo.cc.plan.*;
import nc.vo.cc.sample.*;
import nc.ui.cc.sample.*;
import nc.vo.bd.*;
import nc.ui.bd.*;
import java.util.*;
import javax.swing.table.*;
import nc.ui.pub.beans.*;
import nc.ui.sm.user.UserBO_Client;
import nc.vo.pub.lang.*;
import nc.vo.sm.UserVO;
import nc.ui.cc.formuladata.*;
/**
 * �˴���������˵����
 * �������ڣ�(2005-6-14 19:34:51)
 * @author������
 */
public class PlanPanel extends UIPanel implements IRowShowable {
	private UIPanel ivjPanelHead = null;
	private java.awt.FlowLayout ivjPanelHeadFlowLayout = null;
	private UITablePane ivjPlanTable = null;
	private UILabel ivjLblCode = null;
	private UILabel ivjLblName = null;
	private UITextField ivjTxtCode = null;
	private UITextField ivjTxtName = null;
	public nc.vo.cc.plan.PlanVO [] m_PlanVOs = null;
	public nc.vo.cc.plan.PlanMVO [] m_PlanMVOs = null;
	private UILabel ivjLblSamplePeriod = null;
	public nc.vo.cc.sample.SampleVO m_SampleVO = null;
	public nc.vo.cc.sample.SampleItemVO[] m_SampleItemVOs = null;
	private UICheckBox ivjChkActValue = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	public nc.vo.bd.CorpVO[] m_CorpVOs = null;

class IvjEventHandler implements java.awt.event.MouseListener {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if (e.getSource() == PlanPanel.this.getChkActValue()) 
				connEtoC1(e);
		};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {};
	};
	private UILabel ivjLblUnit = null;
/**
 * PlanPanel ������ע�⡣
 */
public PlanPanel() {
	super();
	initialize();
}
/**
 * PlanPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 */
public PlanPanel(java.awt.LayoutManager p0) {
	super(p0);
}
/**
 * PlanPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 * @param p1 boolean
 */
public PlanPanel(java.awt.LayoutManager p0, boolean p1) {
	super(p0, p1);
}
/**
 * PlanPanel ������ע�⡣
 * @param p0 boolean
 */
public PlanPanel(boolean p0) {
	super(p0);
}
/**
 * Comment
 */
public void chkActValue_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	try{
		if(getChkActValue().isSelected()){
			refreshTable(1);
		}else{
			refreshTable();
		}
	}catch(Exception e){
		e.printStackTrace();	
	}
	return;
}
/**
 * connEtoC1:  (ChkActValue.mouse.mouseClicked(java.awt.event.MouseEvent) --> PlanPanel.chkActValue_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.chkActValue_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-1 11:13:49)
 */
public void endTableEdit() {
	getPlanTable().getTable().editingStopped(null);
}
/**
 * ���� UICheckBox1 ����ֵ��
 * @return nc.ui.pub.beans.UICheckBox
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UICheckBox getChkActValue() {
	if (ivjChkActValue == null) {
		try {
			ivjChkActValue = new nc.ui.pub.beans.UICheckBox();
			ivjChkActValue.setName("ChkActValue");
			ivjChkActValue.setPreferredSize(new java.awt.Dimension(120, 22));
			ivjChkActValue.setText("��ʾΪ������");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChkActValue;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-2 13:06:35)
 * @return nc.vo.bd.CorpVO[]
 */
public nc.vo.bd.CorpVO[] getCorpVOs() {
	if(m_CorpVOs==null){
		try{
			nc.ui.pub.ClientEnvironment ce = nc.ui.pub.ClientEnvironment.getInstance();
			if(ce.getCorporation().getPrimaryKey().equals("0001")){
				m_CorpVOs = CorpBO_Client.queryAll(null);
			}else{
				m_CorpVOs = nc.ui.sm.user.UserBO_Client.queryAllCorpsByUserPK(ce.getUser().getPrimaryKey());
			}
			//m_CorpVOs = CorpBO_Client.queryAll(null);
		}catch(Exception e){}
	}
	return m_CorpVOs;
}
/**
 * ���� UILabel1 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setText("�ƻ�����");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblCode;
}
/**
 * ���� UILabel2 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new nc.ui.pub.beans.UILabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("�ƻ�����");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblName;
}
/**
 * ���� LblSamplePeriod ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblSamplePeriod() {
	if (ivjLblSamplePeriod == null) {
		try {
			ivjLblSamplePeriod = new nc.ui.pub.beans.UILabel();
			ivjLblSamplePeriod.setName("LblSamplePeriod");
			ivjLblSamplePeriod.setPreferredSize(new java.awt.Dimension(700,22));
			ivjLblSamplePeriod.setText("");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblSamplePeriod;
}
/**
 * ���� UILabel1 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblUnit() {
	if (ivjLblUnit == null) {
		try {
			ivjLblUnit = new nc.ui.pub.beans.UILabel();
			ivjLblUnit.setName("LblUnit");
			ivjLblUnit.setPreferredSize(new java.awt.Dimension(80, 22));
			ivjLblUnit.setText("��λ��Ԫ");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblUnit;
}
/**
 * ���� PanelHead ����ֵ��
 * @return nc.ui.pub.beans.UIPanel
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIPanel getPanelHead() {
	if (ivjPanelHead == null) {
		try {
			ivjPanelHead = new nc.ui.pub.beans.UIPanel();
			ivjPanelHead.setName("PanelHead");
			ivjPanelHead.setPreferredSize(new java.awt.Dimension(784, 64));
			ivjPanelHead.setLayout(getPanelHeadFlowLayout());
			getPanelHead().add(getLblCode(), getLblCode().getName());
			getPanelHead().add(getTxtCode(), getTxtCode().getName());
			getPanelHead().add(getLblName(), getLblName().getName());
			getPanelHead().add(getTxtName(), getTxtName().getName());
			getPanelHead().add(getLblUnit(), getLblUnit().getName());
			getPanelHead().add(getChkActValue(), getChkActValue().getName());
			getPanelHead().add(getLblSamplePeriod(), getLblSamplePeriod().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPanelHead;
}
/**
 * ���� PanelHeadFlowLayout ����ֵ��
 * @return java.awt.FlowLayout
 */
/* ���棺�˷������������ɡ� */
private java.awt.FlowLayout getPanelHeadFlowLayout() {
	java.awt.FlowLayout ivjPanelHeadFlowLayout = null;
	try {
		/* �������� */
		ivjPanelHeadFlowLayout = new java.awt.FlowLayout();
		ivjPanelHeadFlowLayout.setAlignment(java.awt.FlowLayout.LEFT);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanelHeadFlowLayout;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 20:19:42)
 * @return nc.vo.cc.plan.PlanMVO
 */
public nc.vo.cc.plan.PlanMVO [] getPlanMVOs() {
	//m_PlanMVOs = null;
	PlanMVO [] oldpmvos = m_PlanMVOs;
	m_PlanMVOs = null;
	HashMap hmold = new HashMap();
	if(oldpmvos!=null){
		for (int i = 0; i < oldpmvos.length; i++){
			hmold.put(oldpmvos[i].getFk_plan()+oldpmvos[i].getFk_sampleitem(),oldpmvos[i]);
		}
	}
	Vector v = new Vector();
	UITable table = getPlanTable().getTable();
	for (int i = 0; i < m_PlanVOs.length; i++){
		for (int j = 0;j < m_SampleItemVOs.length; j++) {
			
			PlanMVO pmvo = null;
			if(hmold.containsKey(m_PlanVOs[i].getPk_plan()+m_SampleItemVOs[j].getPk_item())){
				pmvo = (PlanMVO)hmold.get(m_PlanVOs[i].getPk_plan()+m_SampleItemVOs[j].getPk_item());
			}else{
				pmvo = new PlanMVO();
			}
			if(m_PlanVOs[i].getPk_plan()==null){
				//������²���ļ�¼���ӱ��fk_plan��Ϊ�������������
				pmvo.setFk_plan(String.valueOf(i));
			}else{
				pmvo.setFk_plan(m_PlanVOs[i].getPk_plan());
			}
			pmvo.setFk_sampleitem(m_SampleItemVOs[j].getPk_item());	
				
			if(table.getValueAt(j,i+1)!=null && table.getValueAt(j,i+1).toString().trim().length()>0){
				try {
					pmvo.setOriginalvalue(new UFDouble(table.getValueAt(j,i+1).toString()));
					pmvo.setActvalue(new UFDouble(table.getValueAt(j,i+1).toString()));
					
				} catch (Exception e) {
					System.out.println("����ת������"+ j + "��" + i + "��)" + e.getMessage());
				}
			}else{
				pmvo.setOriginalvalue(null);
				pmvo.setActvalue(null);
			}
			v.add(pmvo);
		}
	}
	if(v!=null && v.size()>0){
		m_PlanMVOs = new PlanMVO[v.size()];
		v.copyInto(m_PlanMVOs);
	}
	return m_PlanMVOs;
}
/**
 * ���� PlanTable ����ֵ��
 * @return nc.ui.pub.beans.UITablePane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITablePane getPlanTable() {
	if (ivjPlanTable == null) {
		try {
			ivjPlanTable = new nc.ui.pub.beans.UITablePane();
			ivjPlanTable.setName("PlanTable");
			ivjPlanTable.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
			// user code begin {1}
			ivjPlanTable.getTable().setModel(new PlanTableModel());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPlanTable;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 20:19:21)
 * @return nc.vo.cc.plan.PlanVO
 */
public nc.vo.cc.plan.PlanVO [] getPlanVOs() throws Exception {
	if(m_PlanVOs == null) return null;
	for (int i = 0; i < m_PlanVOs.length; i++){
		m_PlanVOs[i].setPlancode(getTxtCode().getText());
		m_PlanVOs[i].setPlanname(getTxtName().getText());
	}
	return m_PlanVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-17 16:23:38)
 * @return nc.vo.cc.sample.SampleItemVO[]
 */
public nc.vo.cc.sample.SampleItemVO[] getSampleItemVOs() {
	return m_SampleItemVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-17 16:12:18)
 * @return nc.vo.cc.sample.SampleVO
 */
public nc.vo.cc.sample.SampleVO getSampleVO() {
	return m_SampleVO;
}
/**
 * ���� UITextField1 ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITextField getTxtCode() {
	if (ivjTxtCode == null) {
		try {
			ivjTxtCode = new nc.ui.pub.beans.UITextField();
			ivjTxtCode.setName("TxtCode");
			ivjTxtCode.setPreferredSize(new java.awt.Dimension(100, 22));
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
 * ���� UITextField2 ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITextField getTxtName() {
	if (ivjTxtName == null) {
		try {
			ivjTxtName = new nc.ui.pub.beans.UITextField();
			ivjTxtName.setName("TxtName");
			ivjTxtName.setPreferredSize(new java.awt.Dimension(150, 22));
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
	getChkActValue().addMouseListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("PlanPanel");
		setLayout(new java.awt.BorderLayout());
		setSize(788, 443);
		add(getPanelHead(), "North");
		add(getPlanTable(), "Center");
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-18 14:34:12)
 * @return boolean
 */
public boolean isChecked() {
	if(m_PlanVOs!=null && m_PlanVOs.length>0){
		if(m_PlanVOs[0].getFk_checker()!=null){
			return true;
		}
	}
	return false;
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		PlanPanel aPlanPanel;
		aPlanPanel = new PlanPanel();
		frame.setContentPane(aPlanPanel);
		frame.setSize(aPlanPanel.getSize());
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
		System.err.println("nc.ui.pub.beans.UIPanel �� main() �з����쳣");
		exception.printStackTrace(System.out);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 14:42:32)
 * @exception java.lang.Exception �쳣˵����
 */
public void reCalc() throws java.lang.Exception {
	UITable table = getPlanTable().getTable();
	HashMap hmPlans = new HashMap();
	for (int i = 0; i < getPlanVOs().length; i++){
		hmPlans.put(getPlanVOs()[i].getPk_plan(),getPlanVOs()[i].getFk_plancenter());
	}
	DataGetter.getValues().clear();
	/*
	HashMap hmSampleItem = new HashMap();
	Vector vSampleItem = new Vector();
	for (int i = 0; i < getPlanMVOs().length; i++){
		if(!hmSampleItem.containsKey(getPlanMVOs()[i].getFk_sampleitem())){
			
		}
	}
	*/
	HashMap hmDF = new HashMap(); //DefaultFormula
	for (int i = 0; i < getSampleItemVOs().length; i++){
		String DF = PlanBO_Client.getDefaultFormulaByPkSampleItem(getSampleItemVOs()[i].getPk_item());
		hmDF.put(getSampleItemVOs()[i].getPk_item(),DF);
	}
	FormulaCalc fc = new FormulaCalc();
	
	PlanMVO [] mvos = new PlanMVO[getPlanVOs().length*getSampleItemVOs().length];
	for (int i = 0; i < getPlanVOs().length; i++){
		for (int j = 0; j < getSampleItemVOs().length; j++) {
			//PlanMVO mvo = mvos[i*getSampleItemVOs().length+j];
			PlanMVO mvo = new PlanMVO();
			if(getPlanVOs()[i].getPk_plan()==null){
				mvo.setFk_plan(String.valueOf(i));
			}else{
				mvo.setFk_plan(getPlanVOs()[i].getPk_plan());
			}
			mvo.setFk_sampleitem(getSampleItemVOs()[j].getPk_item());
			UFDouble value = fc.getDefaultFormulaValue((String)hmDF.get(getSampleItemVOs()[j].getPk_item()),
				getPlanVOs()[i].getAccyear(),
				getPlanVOs()[i].getPeriod(),
				getPlanVOs()[i].getFk_plancenter());
			if(value!=null){
				value.setTrimZero(true);
			}
			mvo.setActvalue(value);
			mvo.setOriginalvalue(value);
			int nIndex = i*getSampleItemVOs().length+j;
			mvos[nIndex] = mvo;
		}
	}
	setPlanMVOs(mvos);
	refreshTable();
	table = getPlanTable().getTable();
	PlanTableModel ptm = (PlanTableModel) table.getModel();
	ptm.setCellEditable(true);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-18 11:01:43)
 */
public void refreshLable() {
	String str = "������" + (getSampleVO()==null?"�����ֶ�Ϊ��":getSampleVO().toString()) + "����";
	str += "������ڼ䡿"+ ((m_PlanVOs==null||m_PlanVOs.length==0)?"�ƻ�Ϊ��":(m_PlanVOs[0].getAccyear()+"-"+m_PlanVOs[0].getPeriod())) + "����";
	str += "�����״̬��"+ ((m_PlanVOs==null||m_PlanVOs.length==0)?"�ƻ�Ϊ��":((m_PlanVOs[0].getFk_checker()==null)?"δ���":"�����")) + "����";
	if(m_PlanVOs[0].getFk_checker()!=null){
	    try{
		    UserVO uvo = UserBO_Client.findUserByPrimaryKey(m_PlanVOs[0].getFk_checker());
		    if(uvo!=null){
		        str += "������ˡ�" + uvo.getUserName() + "����" ;
		        
		    }
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}
	getLblSamplePeriod().setText(str);
		
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-15 11:35:16)
 * @exception java.lang.Exception �쳣˵����
 */
public void refreshTable() throws java.lang.Exception {

	//��ͷ
	CorpVO [] cvos = null;
	HashMap hmCorps = new HashMap();
	try {
		cvos = getCorpVOs();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	Object [] objHead = new Object [cvos.length+2];
	
	if(cvos!=null){
		for (int i = 0; i < cvos.length; i++){
			hmCorps.put(cvos[i].getPrimaryKey(),cvos[i].getUnitname());
		}
	}
	
	for (int i = 0; i < objHead.length; i++){
		if(i==0){
			objHead[i] = "ָ������";
		}else if(i==(objHead.length-1)){
			objHead[i] = "�ϼ�";
		}else{
			//String pk_corp = m_PlanVOs[i-1].getFk_plancenter();
		    //String pk_corp = cvos[i-1]
			//objHead[i] = hmCorps.get(pk_corp);
			objHead[i] = cvos[i-1].getUnitname();
		}
	}

	//����
	Object [][] objData = null;
	HashMap hmPlan = new HashMap();
	HashMap hmPlanM = new HashMap();
	if(m_PlanVOs!=null){
		for (int i = 0; i < m_PlanVOs.length; i++){
			if(m_PlanVOs[i].getPk_plan()==null){
				hmPlan.put(String.valueOf(i),m_PlanVOs[i]);
			}else{
				hmPlan.put(m_PlanVOs[i].getPk_plan(),m_PlanVOs[i]);
			}
		}
	}
	if(m_PlanMVOs!=null){
		for (int i = 0; i < m_PlanMVOs.length; i++){
			Object objPlan = hmPlan.get(m_PlanMVOs[i].getFk_plan());
			if(objPlan!=null){
				PlanVO planvo = (PlanVO) objPlan;
				hmPlanM.put(planvo.getFk_plancenter()+m_PlanMVOs[i].getFk_sampleitem(),m_PlanMVOs[i]);
			}
		}
	}
	
	if(getSampleItemVOs()!=null && getSampleItemVOs().length>0){
		objData = new Object[getSampleItemVOs().length][m_PlanVOs.length+2];
		for (int i = 0; i < getSampleItemVOs().length; i++){
			objData[i][0] = getSampleItemVOs()[i].getItemname();
			for (int j = 0; j < cvos.length; j++) {
				Object objPlanM = hmPlanM.get(cvos[j].getPrimaryKey()+getSampleItemVOs()[i].getPk_item());
				if(objPlanM!=null){
					PlanMVO planmvo = (PlanMVO) objPlanM;
					UFDouble Value = planmvo.getOriginalvalue();
					if(Value==null){
						objData[i][j+1] = new UFDouble(0.0f,4);
					}else{
						objData[i][j+1] = new UFDouble(Value.doubleValue(),4);
					}
				}else{
					objData[i][j+1] = new UFDouble(0.0f,4);
				}
			}
		}
	}

	PlanTableModel ptm = new PlanTableModel(objData,objHead);

	UITable table = new UITable(ptm);
	table.setAutoResizeMode(UITable.AUTO_RESIZE_OFF);
	TableColumnModel cm = table.getColumnModel();
	for (int i = 0; i < cm.getColumnCount(); i++){
		cm.getColumn(i).setPreferredWidth(100);
		if(i>0){
			cm.getColumn(i).setCellRenderer(new PlanTableCellRenderer());
		}
		if(i>0 && i < (cm.getColumnCount()-1)){
			UITextField tf = new UITextField();
			tf.setTextType("TextDbl");
			cm.getColumn(i).setCellEditor(new javax.swing.DefaultCellEditor(tf));
		}
	}
	
	getPlanTable().setTable(table);

	
	
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-15 11:35:16)
 * @exception java.lang.Exception �쳣˵����
 */
public void refreshTable(int nShowAct) throws java.lang.Exception {


	//��ͷ
	CorpVO [] cvos = null;
	HashMap hmCorps = new HashMap();
	try {
		cvos = getCorpVOs();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	Object [] objHead = new Object [cvos.length+2];
	
	if(cvos!=null){
		for (int i = 0; i < cvos.length; i++){
			hmCorps.put(cvos[i].getPrimaryKey(),cvos[i].getUnitname());
		}
	}
	
	for (int i = 0; i < objHead.length; i++){
		if(i==0){
			objHead[i] = "ָ������";
		}else if(i==(objHead.length-1)){
			objHead[i] = "�ϼ�";
		}else{
			//String pk_corp = m_PlanVOs[i-1].getFk_plancenter();
			//objHead[i] = hmCorps.get(pk_corp);
			objHead[i] = cvos[i-1].getUnitname();
		}
	}

	//����
	Object [][] objData = null;
	HashMap hmPlan = new HashMap();
	HashMap hmPlanM = new HashMap();
	if(m_PlanVOs!=null){
		for (int i = 0; i < m_PlanVOs.length; i++){
			if(m_PlanVOs[i].getPk_plan()==null){
				hmPlan.put(String.valueOf(i),m_PlanVOs[i]);
			}else{
				hmPlan.put(m_PlanVOs[i].getPk_plan(),m_PlanVOs[i]);
			}
		}
	}
	if(m_PlanMVOs!=null){
		for (int i = 0; i < m_PlanMVOs.length; i++){
			Object objPlan = hmPlan.get(m_PlanMVOs[i].getFk_plan());
			if(objPlan!=null){
				PlanVO planvo = (PlanVO) objPlan;
				hmPlanM.put(planvo.getFk_plancenter()+m_PlanMVOs[i].getFk_sampleitem(),m_PlanMVOs[i]);
			}
		}
	}
	
	if(getSampleItemVOs()!=null && getSampleItemVOs().length>0){
		objData = new Object[getSampleItemVOs().length][m_PlanVOs.length+2];
		for (int i = 0; i < getSampleItemVOs().length; i++){
			objData[i][0] = getSampleItemVOs()[i].getItemname();
			for (int j = 0; j < cvos.length; j++) {
				Object objPlanM = hmPlanM.get(cvos[j].getPrimaryKey()+getSampleItemVOs()[i].getPk_item());
				if(objPlanM!=null){
					PlanMVO planmvo = (PlanMVO) objPlanM;
					UFDouble Value = null;
					if(nShowAct==1){
						Value = planmvo.getActvalue();
					}else{
						Value = planmvo.getOriginalvalue();
					}
					if(Value==null){
						objData[i][j+1] = new UFDouble(0.0f,2);
					}else{
						objData[i][j+1] = new UFDouble(Value.doubleValue(),2);
					}
				}else{
					objData[i][j+1] = new UFDouble(0.0f,2);
				}
			}
		}
	}

	PlanTableModel ptm = new PlanTableModel(objData,objHead);

	UITable table = new UITable(ptm);
	table.setAutoResizeMode(UITable.AUTO_RESIZE_OFF);
	TableColumnModel cm = table.getColumnModel();
	for (int i = 0; i < cm.getColumnCount(); i++){
		cm.getColumn(i).setPreferredWidth(100);
		if(i>0){
			cm.getColumn(i).setCellRenderer(new PlanTableCellRenderer());
		}
		if(i>0 && i < (cm.getColumnCount()-1)){
			UITextField tf = new UITextField();
			tf.setTextType("TextDbl");
			cm.getColumn(i).setCellEditor(new javax.swing.DefaultCellEditor(tf));
		}
	}
	
	getPlanTable().setTable(table);

	
	
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-18 14:20:15)
 * @param setChecked boolean
 */
public void setChecked(boolean bChecked,String fk_checker,UFDate checkedDate) throws Exception {
	if(bChecked){
		if(!PlanBO_Client.canChecked(m_PlanVOs[0])){
			throw new Exception("���ڼ��Ѿ���������ͬ������ļƻ�����ˣ�");
		}
		for (int i = 0; i < m_PlanVOs.length; i++){
			m_PlanVOs[i].setFk_checker(fk_checker);
			m_PlanVOs[i].setCheckedate(checkedDate);
		}
	}else{
		if(m_PlanVOs!=null && m_PlanVOs.length>0){
			if(!PlanBO_Client.canUnChecked(m_PlanMVOs)){
			    throw new Exception("���ƻ��е������ݣ���˲��ܱ�����ˣ�");
			}
		    if(m_PlanVOs[0].getFk_checker()!=null && (!(m_PlanVOs[0].getFk_checker().equals(fk_checker)))){
				throw new Exception("����������ˣ����ܷ���ˣ�");
			}
			
		}
		
		for (int i = 0; i < m_PlanVOs.length; i++){
			m_PlanVOs[i].setFk_checker(null);
			m_PlanVOs[i].setCheckedate(null);
		}
	}
	refreshLable();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-2 13:06:35)
 * @param newCorpVOs nc.vo.bd.CorpVO[]
 */
public void setCorpVOs(nc.vo.bd.CorpVO[] newCorpVOs) {
	m_CorpVOs = newCorpVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-7 17:30:37)
 * @param bEnabled boolean
 */
public void setEditabled(boolean bEnabled) {
	getTxtCode().setEnabled(bEnabled);
	getTxtName().setEnabled(bEnabled);
	if(getPlanTable()!=null && getPlanTable().getTable()!=null && getPlanTable().getTable().getModel()!=null){
		PlanTableModel ptm = (PlanTableModel) getPlanTable().getTable().getModel();
		ptm.setCellEditable(bEnabled);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 20:19:42)
 * @param newPlanMVO nc.vo.cc.plan.PlanMVO
 */
public void setPlanMVOs(nc.vo.cc.plan.PlanMVO [] newPlanMVOs) {
	m_PlanMVOs = newPlanMVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 20:19:21)
 * @param newPlanVO nc.vo.cc.plan.PlanVO
 */
public void setPlanVOs(nc.vo.cc.plan.PlanVO [] newPlanVOs) {
	m_PlanVOs = newPlanVOs;
	getTxtCode().setText(null);
	getTxtName().setText(null);
	getLblSamplePeriod().setText(null);
	if(m_PlanVOs!=null){
		getTxtCode().setText(m_PlanVOs[0].getPlancode());
		getTxtName().setText(m_PlanVOs[0].getPlanname());
		SampleVO svo = null;
		try{
			svo = SampleBO_Client.findByPrimaryKey(m_PlanVOs[0].getFk_sample());
		}catch(Exception e){
			e.printStackTrace();
		}
		setSampleVO(svo);
		SampleItemVO condsivo = new SampleItemVO();
		condsivo.setFk_sample(svo.getPrimaryKey());
		SampleItemVO [] sivos = null;
		try{
			sivos = SampleItemBO_Client.queryByVO(condsivo,new Boolean(true));
		}catch(Exception e){
			e.printStackTrace();
		}
		setSampleItemVOs(sivos);
	}
	if(m_PlanVOs!=null && m_PlanVOs.length>0){
		if(m_PlanVOs[0].getPk_plan()==null){
			try{
				reCalc();
			}catch(Exception e){}
		}
	}
	refreshLable();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-17 16:23:38)
 * @param newSampleItemVOs nc.vo.cc.sample.SampleItemVO[]
 */
public void setSampleItemVOs(nc.vo.cc.sample.SampleItemVO[] newSampleItemVOs) {
	m_SampleItemVOs = newSampleItemVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-17 16:12:18)
 * @param newSampleVO nc.vo.cc.sample.SampleVO
 */
public void setSampleVO(nc.vo.cc.sample.SampleVO newSampleVO) {
	m_SampleVO = newSampleVO;
}
}
