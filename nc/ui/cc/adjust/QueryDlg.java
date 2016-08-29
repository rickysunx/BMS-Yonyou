package nc.ui.cc.adjust;

import nc.vo.cc.adjust.*;
import nc.ui.pub.beans.*;
import nc.vo.bd.*;
import nc.ui.cc.base.*;
/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-23 9:32:25)
 * @author：孙锐
 */
public class QueryDlg extends UIDialog {
	private javax.swing.JPanel ivjUIDialogContentPane = null;
	private UIButton ivjBtnCancel = null;
	private UIButton ivjBtnOK = null;
	private UICheckBox ivjChkCheckNotPass = null;
	private UICheckBox ivjChkCheckPass = null;
	private UILabel ivjLblCheckState = null;
	private UILabel ivjLblCorp = null;
	private UILabel ivjLblPeriod = null;
	private UIListToList ivjLstCorp = null;
	private UIRadioButton ivjRadioAll = null;
	private UIRadioButton ivjRadioPeriod = null;
	private UIRefPane ivjRefPeriod = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	public nc.vo.cc.adjust.QueryVO m_QueryVO = null;
	public nc.vo.bd.CorpVO[] m_CorpVOs = null;
	private UICheckBox ivjChkUnChecked = null;

class IvjEventHandler implements java.awt.event.MouseListener {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if (e.getSource() == QueryDlg.this.getRadioAll()) 
				connEtoC1(e);
			if (e.getSource() == QueryDlg.this.getRadioPeriod()) 
				connEtoC2(e);
			if (e.getSource() == QueryDlg.this.getBtnOK()) 
				connEtoC3(e);
			if (e.getSource() == QueryDlg.this.getBtnCancel()) 
				connEtoC4(e);
		};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {};
	};
	public AdjustUI m_ParentUI = null;
/**
 * QueryDlg 构造子注解。
 */
public QueryDlg() {
	super();
	initialize();
}
/**
 * QueryDlg 构造子注解。
 * @param parent java.awt.Container
 */
public QueryDlg(java.awt.Container parent) {
	super(parent);
	setParentUI((AdjustUI)parent);
	initialize();
}
/**
 * QueryDlg 构造子注解。
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public QueryDlg(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * QueryDlg 构造子注解。
 * @param owner java.awt.Frame
 */
public QueryDlg(java.awt.Frame owner) {
	super(owner);
}
/**
 * QueryDlg 构造子注解。
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public QueryDlg(java.awt.Frame owner, String title) {
	super(owner, title);
}
/**
 * Comment
 */
public void btnCancel_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	closeCancel();
	return;
}
/**
 * Comment
 */
public void btnOK_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	try{
		m_QueryVO = new QueryVO();
		if(getRadioPeriod().isSelected()){
			PeriodRefModel prf = (PeriodRefModel)getRefPeriod().getRefModel();
			if(prf.getPkValue()==null){
				throw new Exception("请选择期间！");
			}
			m_QueryVO.setAccYear(prf.getAccYear());
			m_QueryVO.setPeriod(prf.getPeriod());
		}
		m_QueryVO.setUnChecked(new Boolean(getChkUnChecked().isSelected()));
		m_QueryVO.setCheckPass(new Boolean(getChkCheckPass().isSelected()));
		m_QueryVO.setCheckNotPass(new Boolean(getChkCheckNotPass().isSelected()));

		CorpVO [] cvos = null;
		Object [] objs = getLstCorp().getRightData();
		if(objs!=null && objs.length>0){
			cvos = new CorpVO[objs.length];
			for (int i = 0; i < cvos.length; i++){
				cvos[i] = (CorpVO) getLstCorp().getRightData()[i];
			}
		}
		m_QueryVO.setCorpSelected(cvos);
		
		closeOK();
	}catch(Exception e){
		nc.ui.pub.beans.MessageDialog.showHintDlg(this,"出错",e.getMessage());
	}
	return;
}
/**
 * connEtoC1:  (RadioAll.mouse.mouseClicked(java.awt.event.MouseEvent) --> QueryDlg.radioAll_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.radioAll_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (RadioPeriod.mouse.mouseClicked(java.awt.event.MouseEvent) --> QueryDlg.radioPeriod_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC2(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.radioPeriod_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (BtnOK.mouse.mouseClicked(java.awt.event.MouseEvent) --> QueryDlg.btnOK_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC3(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnOK_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (BtnCancel.mouse.mouseClicked(java.awt.event.MouseEvent) --> QueryDlg.btnCancel_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC4(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnCancel_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * 返回 UIButton2 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new nc.ui.pub.beans.UIButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText("取消");
			ivjBtnCancel.setLocation(224, 361);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnCancel;
}
/**
 * 返回 UIButton1 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getBtnOK() {
	if (ivjBtnOK == null) {
		try {
			ivjBtnOK = new nc.ui.pub.beans.UIButton();
			ivjBtnOK.setName("BtnOK");
			ivjBtnOK.setText("确定");
			ivjBtnOK.setBounds(73, 361, 71, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnOK;
}
/**
 * 返回 UICheckBox3 特性值。
 * @return nc.ui.pub.beans.UICheckBox
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UICheckBox getChkCheckNotPass() {
	if (ivjChkCheckNotPass == null) {
		try {
			ivjChkCheckNotPass = new nc.ui.pub.beans.UICheckBox();
			ivjChkCheckNotPass.setName("ChkCheckNotPass");
			ivjChkCheckNotPass.setText("审核未通过");
			ivjChkCheckNotPass.setBounds(210, 39, 88, 22);
			ivjChkCheckNotPass.setVisible(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChkCheckNotPass;
}
/**
 * 返回 UICheckBox2 特性值。
 * @return nc.ui.pub.beans.UICheckBox
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UICheckBox getChkCheckPass() {
	if (ivjChkCheckPass == null) {
		try {
			ivjChkCheckPass = new nc.ui.pub.beans.UICheckBox();
			ivjChkCheckPass.setName("ChkCheckPass");
			ivjChkCheckPass.setText("已审核");
			ivjChkCheckPass.setBounds(130, 39, 73, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChkCheckPass;
}
/**
 * 返回 UICheckBox1 特性值。
 * @return nc.ui.pub.beans.UICheckBox
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UICheckBox getChkUnChecked() {
	if (ivjChkUnChecked == null) {
		try {
			ivjChkUnChecked = new nc.ui.pub.beans.UICheckBox();
			ivjChkUnChecked.setName("ChkUnChecked");
			ivjChkUnChecked.setSelected(true);
			ivjChkUnChecked.setText("审核中");
			ivjChkUnChecked.setBounds(63, 39, 63, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChkUnChecked;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-24 14:27:17)
 * @return nc.vo.bd.CorpVO[]
 */
public nc.vo.bd.CorpVO[] getCorpVOs() {
	if(m_CorpVOs == null){
		try{
			//m_CorpVOs = nc.ui.bd.CorpBO_Client.queryAll(null);
			m_CorpVOs = nc.ui.sm.user.UserBO_Client.queryAllCorpsByUserPK(getParentUI().getEvn().getUser().getPrimaryKey());
		}catch(Exception e){
			e.printStackTrace();
			MessageDialog.showHintDlg(this,"在queryVO中获取公司目录出错",e.getMessage());
		}
	}
	return m_CorpVOs;
}
/**
 * 返回 UILabel3 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblCheckState() {
	if (ivjLblCheckState == null) {
		try {
			ivjLblCheckState = new nc.ui.pub.beans.UILabel();
			ivjLblCheckState.setName("LblCheckState");
			ivjLblCheckState.setText("审核状态");
			ivjLblCheckState.setBounds(6, 40, 52, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblCheckState;
}
/**
 * 返回 UILabel1 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblCorp() {
	if (ivjLblCorp == null) {
		try {
			ivjLblCorp = new nc.ui.pub.beans.UILabel();
			ivjLblCorp.setName("LblCorp");
			ivjLblCorp.setText("选择网点");
			ivjLblCorp.setVisible(true);
			ivjLblCorp.setILabelType(4/** 小标题*/);
			ivjLblCorp.setFont(new java.awt.Font("dialog", 0, 18));
			ivjLblCorp.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
			ivjLblCorp.setBounds(8, 66, 369, 22);
			ivjLblCorp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblCorp;
}
/**
 * 返回 UILabel2 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblPeriod() {
	if (ivjLblPeriod == null) {
		try {
			ivjLblPeriod = new nc.ui.pub.beans.UILabel();
			ivjLblPeriod.setName("LblPeriod");
			ivjLblPeriod.setText("期间范围");
			ivjLblPeriod.setBounds(8, 7, 52, 22);
			ivjLblPeriod.setVisible(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblPeriod;
}
/**
 * 返回 UIListToList1 特性值。
 * @return nc.ui.pub.beans.UIListToList
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIListToList getLstCorp() {
	if (ivjLstCorp == null) {
		try {
			ivjLstCorp = new nc.ui.pub.beans.UIListToList();
			ivjLstCorp.setName("LstCorp");
			ivjLstCorp.setLeftText("待选网点");
			ivjLstCorp.setBounds(9, 90, 369, 254);
			ivjLstCorp.setDisplayTitle(true);
			ivjLstCorp.setRightText("已选网点");
			ivjLstCorp.setVisible(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLstCorp;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-7-5 14:33:15)
 * @return nc.ui.cc.adjust.AdjustUI
 */
public AdjustUI getParentUI() {
	return m_ParentUI;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-24 13:22:07)
 * @return nc.vo.cc.adjust.QueryVO
 */
public nc.vo.cc.adjust.QueryVO getQueryVO() {
	if(m_QueryVO == null){
		m_QueryVO = new QueryVO();
		m_QueryVO.setCheckNotPass(new Boolean(false));
		m_QueryVO.setCheckPass(new Boolean(false));
		m_QueryVO.setUnChecked(new Boolean(false));
	}
	return m_QueryVO;
}
/**
 * 返回 UIRadioButton1 特性值。
 * @return nc.ui.pub.beans.UIRadioButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIRadioButton getRadioAll() {
	if (ivjRadioAll == null) {
		try {
			ivjRadioAll = new nc.ui.pub.beans.UIRadioButton();
			ivjRadioAll.setName("RadioAll");
			ivjRadioAll.setSelected(true);
			ivjRadioAll.setText("全部");
			ivjRadioAll.setBounds(65, 6, 46, 22);
			ivjRadioAll.setVisible(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRadioAll;
}
/**
 * 返回 UIRadioButton2 特性值。
 * @return nc.ui.pub.beans.UIRadioButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIRadioButton getRadioPeriod() {
	if (ivjRadioPeriod == null) {
		try {
			ivjRadioPeriod = new nc.ui.pub.beans.UIRadioButton();
			ivjRadioPeriod.setName("RadioPeriod");
			ivjRadioPeriod.setText("选择期间");
			ivjRadioPeriod.setBounds(114, 6, 75, 22);
			ivjRadioPeriod.setVisible(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRadioPeriod;
}
/**
 * 返回 UIRefPane1 特性值。
 * @return nc.ui.pub.beans.UIRefPane
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIRefPane getRefPeriod() {
	if (ivjRefPeriod == null) {
		try {
			ivjRefPeriod = new nc.ui.pub.beans.UIRefPane();
			ivjRefPeriod.setName("RefPeriod");
			ivjRefPeriod.setBounds(192, 6, 186, 22);
			ivjRefPeriod.setVisible(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefPeriod;
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
			getUIDialogContentPane().add(getLblCorp(), getLblCorp().getName());
			getUIDialogContentPane().add(getLstCorp(), getLstCorp().getName());
			getUIDialogContentPane().add(getLblPeriod(), getLblPeriod().getName());
			getUIDialogContentPane().add(getRadioAll(), getRadioAll().getName());
			getUIDialogContentPane().add(getRadioPeriod(), getRadioPeriod().getName());
			getUIDialogContentPane().add(getRefPeriod(), getRefPeriod().getName());
			getUIDialogContentPane().add(getLblCheckState(), getLblCheckState().getName());
			getUIDialogContentPane().add(getChkUnChecked(), getChkUnChecked().getName());
			getUIDialogContentPane().add(getChkCheckPass(), getChkCheckPass().getName());
			getUIDialogContentPane().add(getChkCheckNotPass(), getChkCheckNotPass().getName());
			getUIDialogContentPane().add(getBtnOK(), getBtnOK().getName());
			getUIDialogContentPane().add(getBtnCancel(), getBtnCancel().getName());
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
	getRadioAll().addMouseListener(ivjEventHandler);
	getRadioPeriod().addMouseListener(ivjEventHandler);
	getBtnOK().addMouseListener(ivjEventHandler);
	getBtnCancel().addMouseListener(ivjEventHandler);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-24 14:23:33)
 * @exception java.lang.Exception 异常说明。
 */
public void initData() throws java.lang.Exception {
	//在此添加权限过滤代码
	
	getLstCorp().setLeftData(getCorpVOs());
}
/**
 * 初始化类。
 */
/* 警告：此方法将重新生成。 */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("QueryDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(396, 444);
		setTitle("查询条件");
		setContentPane(getUIDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setRadioSelected(getRadioAll());
	getRefPeriod().setRefModel(new nc.ui.cc.base.PeriodRefModel());
	try{
		initData();
	}catch(Exception e){
		e.printStackTrace();
		nc.ui.pub.beans.MessageDialog.showHintDlg(this,"出错",e.getMessage());
	}
	// user code end
}
/**
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		QueryDlg aQueryDlg;
		aQueryDlg = new QueryDlg();
		aQueryDlg.setModal(true);
		aQueryDlg.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aQueryDlg.show();
		java.awt.Insets insets = aQueryDlg.getInsets();
		aQueryDlg.setSize(aQueryDlg.getWidth() + insets.left + insets.right, aQueryDlg.getHeight() + insets.top + insets.bottom);
		aQueryDlg.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("nc.ui.pub.beans.UIDialog 的 main() 中发生异常");
		exception.printStackTrace(System.out);
	}
}
/**
 * Comment
 */
public void radioAll_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	setRadioSelected(getRadioAll());
	return;
}
/**
 * Comment
 */
public void radioPeriod_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	setRadioSelected(getRadioPeriod());
	return;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-24 14:27:17)
 * @param newCorpVOs nc.vo.bd.CorpVO[]
 */
public void setCorpVOs(nc.vo.bd.CorpVO[] newCorpVOs) {
	m_CorpVOs = newCorpVOs;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-7-5 14:33:15)
 * @param newParentUI nc.ui.cc.adjust.AdjustUI
 */
public void setParentUI(AdjustUI newParentUI) {
	m_ParentUI = newParentUI;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-24 13:22:07)
 * @param newQueryVO nc.vo.cc.adjust.QueryVO
 */
public void setQueryVO(nc.vo.cc.adjust.QueryVO newQueryVO) {
	m_QueryVO = newQueryVO;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-23 11:03:02)
 * @param radioButton nc.ui.pub.beans.UIRadioButton
 */
public void setRadioSelected(nc.ui.pub.beans.UIRadioButton radioButton) {
	try {
		getRadioAll().setSelected(false);
		getRadioPeriod().setSelected(false);
		
		if(radioButton!=null){
			radioButton.setSelected(true);
		}
		if(radioButton==getRadioPeriod()){
			getRefPeriod().setEnabled(true);
		}else{
			getRefPeriod().setEnabled(false);
		}
	} catch (Exception e) {
		
	}	
}
}
