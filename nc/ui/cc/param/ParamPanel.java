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
 * 此处插入类型说明。
 * 创建日期：(2005-6-13 11:59:41)
 * @author：孙锐
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
 * ParamPanel 构造子注解。
 */
public ParamPanel() {
	super();
	initialize();
}
/**
 * ParamPanel 构造子注解。
 * @param p0 java.awt.LayoutManager
 */
public ParamPanel(java.awt.LayoutManager p0) {
	super(p0);
}
/**
 * ParamPanel 构造子注解。
 * @param p0 java.awt.LayoutManager
 * @param p1 boolean
 */
public ParamPanel(java.awt.LayoutManager p0, boolean p1) {
	super(p0, p1);
}
/**
 * ParamPanel 构造子注解。
 * @param p0 boolean
 */
public ParamPanel(boolean p0) {
	super(p0);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 13:11:49)
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
 * 返回 LblCode 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setPreferredSize(new java.awt.Dimension(52, 22));
			ivjLblCode.setText("参数编码");
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
 * 返回 LblName 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new nc.ui.pub.beans.UILabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("参数名称");
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 11:12:21)
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
 * 返回 ParamTable 特性值。
 * @return nc.ui.pub.beans.UITablePane
 */
/* 警告：此方法将重新生成。 */
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 10:41:25)
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
 * 返回 TxtCode 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 TxtName 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 UIPanel1 特性值。
 * @return nc.ui.pub.beans.UIPanel
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 UIPanelHeadFlowLayout 特性值。
 * @return java.awt.FlowLayout
 */
/* 警告：此方法将重新生成。 */
private java.awt.FlowLayout getUIPanelHeadFlowLayout() {
	java.awt.FlowLayout ivjUIPanelHeadFlowLayout = null;
	try {
		/* 创建部件 */
		ivjUIPanelHeadFlowLayout = new java.awt.FlowLayout();
		ivjUIPanelHeadFlowLayout.setAlignment(java.awt.FlowLayout.LEFT);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjUIPanelHeadFlowLayout;
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
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
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
		System.err.println("nc.ui.pub.beans.UIPanel 的 main() 中发生异常");
		exception.printStackTrace(System.out);
	}
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 13:48:47)
 * @exception java.lang.Exception 异常说明。
 */
public void refreshTable() throws java.lang.Exception {

	//设置表头
	if(getCorpVOs()==null || getCorpVOs().length==0) {
	    throw new Exception("请先创建公司！");
	}
	
	Object [] objHead = new Object[getCorpVOs().length];
	for (int i = 0; i < getCorpVOs().length; i++){
		objHead[i] = getCorpVOs()[i].getUnitname();
	}
	
	//填入空表体数据
	Object [][] objData = new Object[1][objHead.length];

	//填入数据
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 13:11:49)
 * @param newCorpVOs nc.vo.bd.CorpVO[]
 */
public void setCorpVOs(nc.vo.bd.CorpVO[] newCorpVOs) {
	m_CorpVOs = newCorpVOs;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-7 17:30:37)
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 11:12:21)
 * @param newParamMVO nc.vo.cc.param.ParamMVO
 */
public void setParamMVOs(nc.vo.cc.param.ParamMVO [] newParamMVOs) {
	m_ParamMVOs = newParamMVOs;

}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-14 10:41:25)
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
