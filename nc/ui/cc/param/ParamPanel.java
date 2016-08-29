package nc.ui.cc.param;

import nc.bs.cc.param.*;
import nc.ui.cc.base.*;
import nc.vo.cc.base.*;
import nc.vo.cc.param.*;
import nc.vo.bd.*;
import nc.ui.bd.*;
import java.util.*;
import javax.swing.table.*;
import nc.ui.pub.beans.*;
/**
 * �˴���������˵����
 * �������ڣ�(2005-6-13 11:59:41)
 * @author������
 */
public class ParamPanel extends nc.ui.pub.beans.UIPanel implements IRowShowable {
	private nc.ui.pub.beans.UILabel ivjLblCode = null;
	private nc.ui.pub.beans.UILabel ivjLblName = null;
	private nc.ui.pub.beans.UITablePane ivjParamTable = null;
	private nc.ui.pub.beans.UITextField ivjTxtCode = null;
	private nc.ui.pub.beans.UITextField ivjTxtName = null;
	private nc.ui.pub.beans.UIPanel ivjUIPanelHead = null;
	private java.awt.FlowLayout ivjUIPanelHeadFlowLayout = null;
	public nc.vo.cc.param.ParamVO m_ParamVO = null;
	public nc.vo.cc.param.ParamMVO [] m_ParamMVOs = null;
	public nc.vo.bd.CorpVO[] m_CorpVOs = null;
/**
 * ParamPanel ������ע�⡣
 */
public ParamPanel() {
	super();
	initialize();
}
/**
 * ParamPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 */
public ParamPanel(java.awt.LayoutManager p0) {
	super(p0);
}
/**
 * ParamPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 * @param p1 boolean
 */
public ParamPanel(java.awt.LayoutManager p0, boolean p1) {
	super(p0, p1);
}
/**
 * ParamPanel ������ע�⡣
 * @param p0 boolean
 */
public ParamPanel(boolean p0) {
	super(p0);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-14 13:11:49)
 * @return nc.vo.bd.CorpVO[]
 */
public nc.vo.bd.CorpVO[] getCorpVOs() {
	if(m_CorpVOs == null){
		try{
			m_CorpVOs = CorpBO_Client.queryAll(null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	return m_CorpVOs;
}
/**
 * ���� LblCode ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setPreferredSize(new java.awt.Dimension(52, 22));
			ivjLblCode.setText("��������");
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
 * ���� LblName ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new nc.ui.pub.beans.UILabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("��������");
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-14 11:12:21)
 * @return nc.vo.cc.param.ParamMVO
 */
public nc.vo.cc.param.ParamMVO [] getParamMVOs() {
	UITable table = getParamTable().getTable();
	if(table!=null){
		m_ParamMVOs = new ParamMVO[getCorpVOs().length];
		for (int i = 0; i < getCorpVOs().length; i++){
			try {
				m_ParamMVOs[i] = new ParamMVO();
				m_ParamMVOs[i].setFk_plancenter(getCorpVOs()[i].getPrimaryKey());
				m_ParamMVOs[i].setParamvalue(new nc.vo.pub.lang.UFDouble(table.getValueAt(0,i).toString()));
			}catch(Exception e){

			}
		}
	}
	return m_ParamMVOs;
}
/**
 * ���� ParamTable ����ֵ��
 * @return nc.ui.pub.beans.UITablePane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITablePane getParamTable() {
	if (ivjParamTable == null) {
		try {
			ivjParamTable = new nc.ui.pub.beans.UITablePane();
			ivjParamTable.setName("ParamTable");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjParamTable;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-14 10:41:25)
 * @return nc.vo.cc.param.ParamVO
 */
public nc.vo.cc.param.ParamVO getParamVO() {
	if(m_ParamVO==null){
		m_ParamVO = new ParamVO();
	}
	m_ParamVO.setParamcode(getTxtCode().getText());
	m_ParamVO.setParamname(getTxtName().getText());
	return m_ParamVO;
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
			ivjTxtCode.setPreferredSize(new java.awt.Dimension(150, 22));
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
 * ���� TxtName ����ֵ��
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
 * ���� UIPanel1 ����ֵ��
 * @return nc.ui.pub.beans.UIPanel
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIPanel getUIPanelHead() {
	if (ivjUIPanelHead == null) {
		try {
			ivjUIPanelHead = new nc.ui.pub.beans.UIPanel();
			ivjUIPanelHead.setName("UIPanelHead");
			ivjUIPanelHead.setLayout(getUIPanelHeadFlowLayout());
			getUIPanelHead().add(getLblCode(), getLblCode().getName());
			getUIPanelHead().add(getTxtCode(), getTxtCode().getName());
			getUIPanelHead().add(getLblName(), getLblName().getName());
			getUIPanelHead().add(getTxtName(), getTxtName().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUIPanelHead;
}
/**
 * ���� UIPanelHeadFlowLayout ����ֵ��
 * @return java.awt.FlowLayout
 */
/* ���棺�˷������������ɡ� */
private java.awt.FlowLayout getUIPanelHeadFlowLayout() {
	java.awt.FlowLayout ivjUIPanelHeadFlowLayout = null;
	try {
		/* �������� */
		ivjUIPanelHeadFlowLayout = new java.awt.FlowLayout();
		ivjUIPanelHeadFlowLayout.setAlignment(java.awt.FlowLayout.LEFT);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjUIPanelHeadFlowLayout;
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
		setName("ParamPanel");
		setLayout(new java.awt.BorderLayout());
		setSize(697, 469);
		add(getUIPanelHead(), "North");
		add(getParamTable(), "Center");
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
		javax.swing.JFrame frame = new javax.swing.JFrame();
		ParamPanel aParamPanel;
		aParamPanel = new ParamPanel();
		frame.setContentPane(aParamPanel);
		frame.setSize(aParamPanel.getSize());
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
 * �������ڣ�(2005-6-14 13:48:47)
 * @exception java.lang.Exception �쳣˵����
 */
public void refreshTable() throws java.lang.Exception {

	//���ñ�ͷ
	if(getCorpVOs()==null || getCorpVOs().length==0) {
	    throw new Exception("���ȴ�����˾��");
	}
	
	Object [] objHead = new Object[getCorpVOs().length];
	for (int i = 0; i < getCorpVOs().length; i++){
		objHead[i] = getCorpVOs()[i].getUnitname();
	}
	
	//����ձ�������
	Object [][] objData = new Object[1][objHead.length];

	//��������
	if(m_ParamMVOs != null){
		HashMap hm = new HashMap();
		for (int i = 0; i < m_ParamMVOs.length; i++){
			hm.put(m_ParamMVOs[i].getFk_plancenter(),m_ParamMVOs[i]);
		}
		for (int i = 0; i < getCorpVOs().length; i++){
			ParamMVO vo = (ParamMVO)hm.get(getCorpVOs()[i].getPrimaryKey());
			if(vo!=null){
				objData[0][i] = vo.getParamvalue();
			}else{
				objData[0][i] = null;
			}
		}
	}
	
	ParamTableModel tm = new ParamTableModel(objData,objHead);
	UITable table = new UITable(tm);
	table.setAutoResizeMode(UITable.AUTO_RESIZE_OFF);
	TableColumnModel cm = table.getColumnModel();
	for (int i = 0; i < cm.getColumnCount(); i++){
		cm.getColumn(i).setPreferredWidth(100);
		cm.getColumn(i).setCellRenderer(new ParamTableCellRenderer());
		UITextField tf = new UITextField();
		/*
		tf.setAllowAlphabetic(false);
		tf.setAllowNumeric(true);
		tf.setAllowOtherCharacter(true);
		tf.setAllowUnicode(false);
		*/
		tf.setTextType("TextDbl");
		cm.getColumn(i).setCellEditor(new javax.swing.DefaultCellEditor(tf));
	}	
	getParamTable().setTable(table);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-14 13:11:49)
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
	if(getParamTable()!=null && getParamTable().getTable()!=null){
		ParamTableModel ptm = (ParamTableModel) getParamTable().getTable().getModel();
		ptm.setCellEditable(bEnabled);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-14 11:12:21)
 * @param newParamMVO nc.vo.cc.param.ParamMVO
 */
public void setParamMVOs(nc.vo.cc.param.ParamMVO [] newParamMVOs) {
	m_ParamMVOs = newParamMVOs;

}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-14 10:41:25)
 * @param newParamVO nc.vo.cc.param.ParamVO
 */
public void setParamVO(nc.vo.cc.param.ParamVO newParamVO) {
	m_ParamVO = newParamVO;
	getTxtCode().setText(null);
	getTxtName().setText(null);
	if(m_ParamVO!=null){
		getTxtCode().setText(m_ParamVO.getParamcode());
		getTxtName().setText(m_ParamVO.getParamname());
	}
}
}
