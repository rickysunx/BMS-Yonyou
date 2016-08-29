package nc.ui.cc.adjust;

import nc.vo.cc.adjust.*;

import java.util.*;
import nc.vo.bd.*;
import nc.vo.cc.workflow.*;
/**
 * �˴���������˵����
 * �������ڣ�(2005-6-23 11:25:05)
 * @author������
 */
public class AdjustCardPanel extends nc.ui.pub.beans.UIPanel {
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private nc.ui.pub.beans.UITablePane ivjTableMain = null;
	private nc.ui.pub.beans.UILabel ivjLblCode = null;
	private nc.ui.pub.beans.UILabel ivjLblName = null;
	private nc.ui.pub.beans.UILabel ivjLblReason = null;
	private nc.ui.pub.beans.UIRefPane ivjRefCorp = null;
	private nc.ui.pub.beans.UITextField ivjTxtCode = null;
	private nc.ui.pub.beans.UITextField ivjTxtName = null;
	private nc.ui.pub.beans.UITextField ivjTxtReason = null;
	public AdjustUI m_ParentUI = null;
	public nc.vo.cc.adjust.AdjustMVO m_AdjustMVO = null;
	public BodyTable m_MainTable = null;
	public nc.vo.cc.adjust.AdjustVO m_AdjustVO = null;
	public nc.vo.cc.adjust.AdjustMVO[] m_AdjustMVOs = null;
	public java.lang.String m_PK_Corp = null;
	public nc.vo.cc.adjust.PlanCodeNameVO m_PlanCodeNameVO = null;
	private nc.ui.pub.beans.UILabel ivjLblInf = null;
	public nc.vo.bd.CorpVO m_CorpVO = null;
	private nc.ui.pub.beans.UILabel ivjLblUnit = null;
	private nc.ui.pub.beans.UIButton ivjBtnMore = null;

class IvjEventHandler implements java.awt.event.ComponentListener, java.awt.event.MouseListener {
		public void componentHidden(java.awt.event.ComponentEvent e) {};
		public void componentMoved(java.awt.event.ComponentEvent e) {};
		public void componentResized(java.awt.event.ComponentEvent e) {
			if (e.getSource() == AdjustCardPanel.this) 
				connEtoC1(e);
		};
		public void componentShown(java.awt.event.ComponentEvent e) {};
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if (e.getSource() == AdjustCardPanel.this.getBtnMore()) 
				connEtoC2(e);
		};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {};
	};
/**
 * AdjustEditPanel ������ע�⡣
 */
public AdjustCardPanel() {
	super();
	initialize();
}
/**
 * AdjustEditPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 */
public AdjustCardPanel(java.awt.LayoutManager p0) {
	super(p0);
}
/**
 * AdjustEditPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 * @param p1 boolean
 */
public AdjustCardPanel(java.awt.LayoutManager p0, boolean p1) {
	super(p0, p1);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 9:54:36)
 * @param parentUI nc.ui.cc.adjust.AdjustUI
 */
public AdjustCardPanel(AdjustUI parentUI) {
	super();
	setParentUI(parentUI);
	initialize();	
}
/**
 * AdjustEditPanel ������ע�⡣
 * @param p0 boolean
 */
public AdjustCardPanel(boolean p0) {
	super(p0);
}
/**
 * Comment
 */
public void adjustEditPanel_ComponentResized(java.awt.event.ComponentEvent componentEvent) {
	getTableMain().setSize(this.getWidth()-10,this.getHeight()-getTableMain().getY()-10);
	return;
}
/**
 * Comment
 */
public void btnMore_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	AdjustInputDlg dlg = new AdjustInputDlg(this);
	dlg.setTitle("�༭����ԭ��");
	dlg.setText(getTxtReason().getText());
	if(dlg.showModal()==nc.ui.pub.beans.UIDialog.ID_OK){
		getTxtReason().setText(dlg.getText());
	}
	return;
}
/**
 * connEtoC1:  (AdjustEditPanel.component.componentResized(java.awt.event.ComponentEvent) --> AdjustCardPanel.adjustEditPanel_ComponentResized(Ljava.awt.event.ComponentEvent;)V)
 * @param arg1 java.awt.event.ComponentEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC1(java.awt.event.ComponentEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.adjustEditPanel_ComponentResized(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnMore.mouse.mouseClicked(java.awt.event.MouseEvent) --> AdjustCardPanel.btnMore_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC2(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnMore_MouseClicked(arg1);
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
 * �������ڣ�(2005-6-27 11:58:03)
 * @exception java.lang.Exception �쳣˵����
 */
public void doAddLine() throws java.lang.Exception {
	getMainTable().addLine();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 12:43:34)
 * @param vo nc.vo.cc.adjust.AdjustMVO
 * @exception java.lang.Exception �쳣˵����
 */
public void doBrowse(AdjustVO vo) throws java.lang.Exception {}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 11:58:21)
 * @exception java.lang.Exception �쳣˵����
 */
public void doDelLine() throws java.lang.Exception {
	getMainTable().delLine();
	//System.out.print(getMainTable().getAdjustTableModel().getValueAt(0,0));
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 10:06:53)
 * @param vo nc.vo.cc.adjust.AdjustMVO
 * @exception java.lang.Exception �쳣˵����
 */
public void doEdit(AdjustVO vo) throws java.lang.Exception {
	if(vo==null){
		throw new Exception("���ܶԿռ�¼���б༭��AdjustCardPanel::doEdit(AdjustVO)");
	}
	setAdjustVO(vo);
	
	CorpVO cvo = new CorpVO();
	cvo.setPrimaryKey(vo.getFk_plancenter());
	cvo.setUnitname(vo.getUnitName());
	setCorpVO(cvo);
	
	PlanCodeNameVO pcnvo = new PlanCodeNameVO();
	pcnvo.setCode(vo.getPlanCode());
	pcnvo.setName(vo.getPlanName());
	setPlanCodeNameVO(pcnvo);

	getMainTable().setPlanCode(vo.getPlanCode());
	getMainTable().initData(vo.getPk_adjust());
	getMainTable().setEnabled(true);
	getMainTable().validate();
	getMainTable().repaint();

	getTxtCode().setText(vo.getAdjustcode());
	getTxtName().setText(vo.getAdjustname());
	getTxtReason().setText(vo.getRequestreason());
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 10:04:00)
 * @exception java.lang.Exception �쳣˵����
 */
public void doNew() throws java.lang.Exception {
	setAdjustVO(new AdjustVO());
	getMainTable().setPlanCode(getPlanCodeNameVO().getCode());
	getMainTable().initData(null);
	getMainTable().setEnabled(true);
	getMainTable().validate();
	getMainTable().repaint();
	//getRefCorp().setPK()
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 10:04:49)
 * @exception java.lang.Exception �쳣˵����
 */
public void doSave() throws java.lang.Exception {
	fillData();
	
	//�Ƿ�Ϊ�½���¼
	nc.vo.cc.workflow.CCPlanAdjustVO vo = new nc.vo.cc.workflow.CCPlanAdjustVO();
	vo.setParentVO(getAdjustVO());
	vo.setChildrenVO(getAdjustMVOs());
	if(getAdjustVO().getPk_adjust()==null){
		nc.ui.pub.pf.PfUtilClient.processAction("SAVE","CC",getParentUI().getEvn().getDate().toString(),vo);
		//AdjustBO_Client.insert(getAdjustVO(),getAdjustMVOs());
	}else{
	    AdjustBO_Client.emptyAdjustCheckInf(getAdjustVO().getPk_adjust());
	    getAdjustVO().setFk_checker(null);
	    getAdjustVO().setCheckdate(null);
	    nc.ui.pub.pf.PfUtilClient.processAction("EDIT","CC",getParentUI().getEvn().getDate().toString(),vo);
		//AdjustBO_Client.update(getAdjustVO(),getAdjustMVOs());
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-4 14:05:49)
 */
public void fillData() throws Exception {
	if(getAdjustVO()==null){
		setAdjustVO(new AdjustVO());
	}
	try{
		getMainTable().editingStopped(null);
	}catch(Exception e){
	}
	
	//ǰ̨У��
	String strCode = getTxtCode().getText();
	String strName = getTxtName().getText();
	String strPkCorp = getCorpVO().getPrimaryKey();
	String strReason = getTxtReason().getText();

	if(strCode == null || strCode.trim().length()==0){
		throw new Exception("���벻��Ϊ��");
	}
	
	if(strName == null || strName.trim().length()==0){
		throw new Exception("���Ʋ���Ϊ��");
	}
	
	if(strPkCorp == null || strPkCorp.trim().length()==0){
		throw new Exception("��˾����Ϊ��");
	}

	//��������
	int nRowCount = getMainTable().getRowCount();
	if(nRowCount<=0){
		throw new Exception("����û������");
	}
	PlanCodeNameVO vo = getPlanCodeNameVO();
	Vector v = new Vector();
	HashMap hmSubTable = new HashMap(); //����У���ӱ��Ƿ����ظ���
	for (int i = 0; i < nRowCount; i++){
		try{
			/*
			Object obj0 = getMainTable().getValueAt(i,0);
			PlanCodeNameVO vo = null;
			AdjustMVO mvo = new AdjustMVO();
			if(obj0!=null){
				vo = (PlanCodeNameVO) obj0;
			}else{
				continue;
			}*/
			AdjustMVO mvo = new AdjustMVO();
			
			Object obj0 = getMainTable().getValueAt(i,0);
			SampleItemCodeNameVO svo = null;
			if(obj0!=null){
				svo = (SampleItemCodeNameVO) obj0;
			}else{
				continue;
			}

			String pk_plan_m = AdjustBO_Client.queryFK_PlanM(vo.getCode(),svo.getPK_SampleItem(),strPkCorp);
			
			if(pk_plan_m == null){
				throw new Exception("�ƻ�δ�ҵ�");
			}else{
				if(hmSubTable.containsKey(pk_plan_m)){
					throw new Exception("�ӱ������ظ���");
				}else{
					hmSubTable.put(pk_plan_m,null);
					mvo.setFk_plan_m(pk_plan_m);
					mvo.setPk_adjust_m(svo.getPK_AdjustM());
				}
			}
			mvo.setAdjustvalue(new nc.vo.pub.lang.UFDouble(getMainTable().getValueAt(i,1).toString()));

			v.add(mvo);
		}catch(Exception e){
			throw new Exception("�����ݳ���"+e.getMessage());			
		}
	}
	if(v.size()>0){
		AdjustMVO [] mvos = new AdjustMVO[v.size()];
		v.copyInto(mvos);
		if(getAdjustVO().getPk_adjust()==null){
			setAdjustMVOs(mvos);
		}else{
			setAdjustMVOs(mvos);
		}
	}else{
		throw new Exception("û�е�������");
	}
		
	//���VO
	getAdjustVO().setAdjustcode(strCode);
	getAdjustVO().setAdjustname(strName);
	getAdjustVO().setFk_plancenter(strPkCorp);
	getAdjustVO().setRequestreason(strReason);
	getAdjustVO().setBilltype("CC");
	getAdjustVO().setCheckstate("�����");
	
	//�Ƿ�Ϊ�½���¼
	if(getAdjustVO().getPk_adjust()==null){
		getAdjustVO().setRequestdate(getParentUI().getEvn().getDate());
		getAdjustVO().setFk_requestor(getParentUI().getEvn().getUser().getPrimaryKey());
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 15:54:19)
 * @return nc.vo.cc.adjust.AdjustMVO[]
 */
public nc.vo.cc.adjust.AdjustMVO[] getAdjustMVOs() {
	return m_AdjustMVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 15:51:49)
 * @return nc.vo.cc.adjust.AdjustVO
 */
public nc.vo.cc.adjust.AdjustVO getAdjustVO() {
	return m_AdjustVO;
}
/**
 * ���� BtnMore ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBtnMore() {
	if (ivjBtnMore == null) {
		try {
			ivjBtnMore = new nc.ui.pub.beans.UIButton();
			ivjBtnMore.setName("BtnMore");
			ivjBtnMore.setText("��ϸ");
			ivjBtnMore.setBounds(571, 10, 55, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnMore;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:47:10)
 * @return nc.vo.bd.CorpVO
 */
public nc.vo.bd.CorpVO getCorpVO() {
	return m_CorpVO;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-4 14:10:26)
 * @return nc.vo.cc.workflow.CCPlanAdjustVO
 * @exception java.lang.Exception �쳣˵����
 */
public CCPlanAdjustVO getData() throws java.lang.Exception {
	fillData();
	CCPlanAdjustVO vo = new CCPlanAdjustVO();
	vo.setParentVO(getAdjustVO());
	vo.setChildrenVO(getAdjustMVOs());
	
	return vo;
}
/**
 * ���� UILabel2 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setText("���뵥���");
			ivjLblCode.setBounds(9, 11, 65, 22);
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
 * ���� LblInf ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblInf() {
	if (ivjLblInf == null) {
		try {
			ivjLblInf = new nc.ui.pub.beans.UILabel();
			ivjLblInf.setName("LblInf");
			ivjLblInf.setText("��Ϣ");
			ivjLblInf.setBounds(10, 39, 779, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblInf;
}
/**
 * ���� UILabel3 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new nc.ui.pub.beans.UILabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("���뵥����");
			ivjLblName.setBounds(195, 11, 65, 22);
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
 * ���� UILabel4 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblReason() {
	if (ivjLblReason == null) {
		try {
			ivjLblReason = new nc.ui.pub.beans.UILabel();
			ivjLblReason.setName("LblReason");
			ivjLblReason.setText("����ԭ��");
			ivjLblReason.setLocation(383, 11);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblReason;
}
/**
 * ���� LblUnit ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblUnit() {
	if (ivjLblUnit == null) {
		try {
			ivjLblUnit = new nc.ui.pub.beans.UILabel();
			ivjLblUnit.setName("LblUnit");
			ivjLblUnit.setText("��λ��Ԫ");
			ivjLblUnit.setBounds(639, 10, 72, 22);
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 12:03:12)
 * @return nc.ui.cc.adjust.BodyTable
 */
public BodyTable getMainTable() {
	if(m_MainTable==null){
		m_MainTable = new BodyTable();
	}
	return m_MainTable;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 9:49:14)
 * @return nc.ui.cc.adjust.AdjustUI
 */
public AdjustUI getParentUI() {
	return m_ParentUI;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 16:21:41)
 * @return java.lang.String
 */
public java.lang.String getPK_Corp() {
	return m_PK_Corp;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:28:21)
 * @return nc.vo.cc.adjust.PlanCodeNameVO
 */
public nc.vo.cc.adjust.PlanCodeNameVO getPlanCodeNameVO() {
	return m_PlanCodeNameVO;
}
/**
 * ���� UIRefPane1 ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefCorp() {
	if (ivjRefCorp == null) {
		try {
			ivjRefCorp = new nc.ui.pub.beans.UIRefPane();
			ivjRefCorp.setName("RefCorp");
			ivjRefCorp.setBounds(568, 9, 120, 22);
			ivjRefCorp.setVisible(false);
			// user code begin {1}
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
 * ���� UITablePane1 ����ֵ��
 * @return nc.ui.pub.beans.UITablePane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITablePane getTableMain() {
	if (ivjTableMain == null) {
		try {
			ivjTableMain = new nc.ui.pub.beans.UITablePane();
			ivjTableMain.setName("TableMain");
			ivjTableMain.setBounds(6, 71, 550, 245);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTableMain;
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
			ivjTxtCode.setBounds(74, 11, 113, 22);
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
			ivjTxtName.setBounds(261, 11, 113, 22);
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
 * ���� UITextField3 ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITextField getTxtReason() {
	if (ivjTxtReason == null) {
		try {
			ivjTxtReason = new nc.ui.pub.beans.UITextField();
			ivjTxtReason.setName("TxtReason");
			ivjTxtReason.setBounds(440, 10, 120, 22);
			ivjTxtReason.setMaxLength(200);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtReason;
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
	this.addComponentListener(ivjEventHandler);
	getBtnMore().addMouseListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("AdjustEditPanel");
		setLayout(null);
		setSize(810, 382);
		add(getRefCorp(), getRefCorp().getName());
		add(getLblCode(), getLblCode().getName());
		add(getTxtCode(), getTxtCode().getName());
		add(getLblName(), getLblName().getName());
		add(getTxtName(), getTxtName().getName());
		add(getLblReason(), getLblReason().getName());
		add(getTxtReason(), getTxtReason().getName());
		add(getTableMain(), getTableMain().getName());
		add(getLblInf(), getLblInf().getName());
		add(getLblUnit(), getLblUnit().getName());
		add(getBtnMore(), getBtnMore().getName());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getRefCorp().setRefModel(new CorpRefModel());
	getTableMain().setTable(getMainTable());
	//getMainTable().setPlanCode(getPlanCodeNameVO().getCode());
	//getMainTable().setAdjustMVOs(null);
	
	// user code end
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-4 10:51:03)
 * @param zbpk java.lang.String
 * @exception java.lang.Exception �쳣˵����
 */
public void loaddata(String zbpk) throws java.lang.Exception {
	AdjustVO vo = AdjustBO_Client.findByPrimaryKey(zbpk);
	doEdit(vo);
	getTxtCode().setEnabled(false);
	getTxtName().setEnabled(false);
	getTxtReason().setEnabled(false);
	getMainTable().setEnabled(false);
	refreshLable();
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		AdjustCardPanel aAdjustEditPanel;
		aAdjustEditPanel = new AdjustCardPanel();
		frame.setContentPane(aAdjustEditPanel);
		frame.setSize(aAdjustEditPanel.getSize());
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
 * �������ڣ�(2005-6-29 19:47:34)
 */
public void refreshLable() {
	String strPlan = "";
	String strCorp = "";
	
	if(getPlanCodeNameVO()!=null){
		strPlan = "�ƻ���" + getPlanCodeNameVO().getName();
	}
	if(getCorpVO()!=null){
		strCorp = "������" + getCorpVO().getUnitname();
	}

	getLblInf().setText(strPlan + "����" + strCorp);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 15:54:19)
 * @param newAdjustMVOs nc.vo.cc.adjust.AdjustMVO[]
 */
public void setAdjustMVOs(nc.vo.cc.adjust.AdjustMVO[] newAdjustMVOs) {
	m_AdjustMVOs = newAdjustMVOs;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 15:51:49)
 * @param newAdjustVO nc.vo.cc.adjust.AdjustVO
 */
public void setAdjustVO(nc.vo.cc.adjust.AdjustVO newAdjustVO) {
	m_AdjustVO = newAdjustVO;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:47:10)
 * @param newCorpVO nc.vo.bd.CorpVO
 */
public void setCorpVO(nc.vo.bd.CorpVO newCorpVO) {
	m_CorpVO = newCorpVO;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 12:03:12)
 * @param newMainTable nc.ui.cc.adjust.BodyTable
 */
public void setMainTable(BodyTable newMainTable) {
	m_MainTable = newMainTable;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 9:49:14)
 * @param newParentUI nc.ui.cc.adjust.AdjustUI
 */
public void setParentUI(AdjustUI newParentUI) {
	m_ParentUI = newParentUI;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 16:21:41)
 * @param newPK_Corp java.lang.String
 */
public void setPK_Corp(java.lang.String newPK_Corp) {
	m_PK_Corp = newPK_Corp;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:28:21)
 * @param newPlanCodeNameVO nc.vo.cc.adjust.PlanCodeNameVO
 */
public void setPlanCodeNameVO(nc.vo.cc.adjust.PlanCodeNameVO newPlanCodeNameVO) {
	m_PlanCodeNameVO = newPlanCodeNameVO;
	
}
}
