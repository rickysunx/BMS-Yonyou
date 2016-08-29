package nc.ui.cc.indicator;

import nc.ui.cc.base.*;
import nc.vo.cc.base.*;
import nc.vo.cc.indicator.*;
import nc.ui.pub.beans.*;
import java.util.*;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-11 11:00:29)
 * @author：孙锐
 */
public class IndicatorPanel extends UIPanel implements IRowShowable {
	private UILabel ivjLblAct = null;
	private UILabel ivjLblCode = null;
	private UILabel ivjLblMethod = null;
	private UILabel ivjLblName = null;
	private UILabel ivjLblRange = null;
	private UITextField ivjTxtCode = null;
	private UITextField ivjTxtName = null;
	private UIButton ivjBtnAct = null;
	private UIButton ivjBtnDefault = null;
	private UIComboBox ivjCbMethod = null;
	private UIComboBox ivjCbRange = null;
	private UILabel ivjLblDefault = null;
	private UIScrollPane ivjSpAct = null;
	private UIScrollPane ivjSpDefault = null;
	private UITextArea ivjTxtAct = null;
	private UITextArea ivjTxtDefault = null;
	public nc.vo.cc.indicator.IndicatorVO m_IndicatorVO = null;
	public static IndicatorPanel m_PanelObject = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	public nc.ui.cc.base.FormulaDlg m_ActDlg = null;
	public nc.ui.cc.base.FormulaDlg m_DefaultDlg = null;
	public java.util.HashMap m_FormulaBuffer = new HashMap();

class IvjEventHandler implements java.awt.event.ComponentListener, java.awt.event.MouseListener {
		public void componentHidden(java.awt.event.ComponentEvent e) {};
		public void componentMoved(java.awt.event.ComponentEvent e) {};
		public void componentResized(java.awt.event.ComponentEvent e) {
			if (e.getSource() == IndicatorPanel.this) 
				connEtoC3(e);
		};
		public void componentShown(java.awt.event.ComponentEvent e) {};
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if (e.getSource() == IndicatorPanel.this.getBtnAct()) 
				connEtoC1(e);
			if (e.getSource() == IndicatorPanel.this.getBtnDefault()) 
				connEtoC2(e);
		};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {};
	};
	public IndicatorUI m_ParentUI = null;
/**
 * IndicatorPanel 构造子注解。
 */
public IndicatorPanel() {
	super();
	initialize();
}
/**
 * IndicatorPanel 构造子注解。
 * @param p0 java.awt.LayoutManager
 */
public IndicatorPanel(java.awt.LayoutManager p0) {
	super(p0);
}
/**
 * IndicatorPanel 构造子注解。
 * @param p0 java.awt.LayoutManager
 * @param p1 boolean
 */
public IndicatorPanel(java.awt.LayoutManager p0, boolean p1) {
	super(p0, p1);
}
/**
 * IndicatorPanel 构造子注解。
 * @param p0 boolean
 */
public IndicatorPanel(boolean p0) {
	super(p0);
}
/**
 * Comment
 */
public void btnAct_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	if(getBtnAct().isEnabled()){
		if(getActDlg().showModal()==UIDialog.ID_OK){
			try{
				String [] Formulas = getActDlg().getPaneFormula().getFormulas();
				getTxtAct().setText(Formulas[1]);
				if(m_IndicatorVO!=null){
					m_IndicatorVO.setActformula(Formulas[0]);
				}
			}catch(Exception e){
				MessageDialog.showHintDlg(this,"公式解析出错",e.getMessage());
				e.printStackTrace();
			}
		}
	}
	return;
}
/**
 * Comment
 */
public void btnDefault_MouseClicked(java.awt.event.MouseEvent mouseEvent) {
	if(getBtnDefault().isEnabled()){
		if(getDefaultDlg().showModal()==UIDialog.ID_OK){
			try{
				String [] Formulas = getDefaultDlg().getPaneFormula().getFormulas();
				getTxtDefault().setText(Formulas[1]);
				if(m_IndicatorVO!=null){
					m_IndicatorVO.setDefaultformula(Formulas[0]);
				}
			}catch(Exception e){
				MessageDialog.showHintDlg(this,"公式解析出错",e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	return;
}
/**
 * connEtoC1:  (BtnAct.mouse.mouseClicked(java.awt.event.MouseEvent) --> IndicatorPanel.btnAct_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnAct_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnDefault.mouse.mouseClicked(java.awt.event.MouseEvent) --> IndicatorPanel.btnDefault_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC2(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnDefault_MouseClicked(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (IndicatorPanel.component.componentResized(java.awt.event.ComponentEvent) --> IndicatorPanel.indicatorPanel_ComponentResized(Ljava.awt.event.ComponentEvent;)V)
 * @param arg1 java.awt.event.ComponentEvent
 */
/* 警告：此方法将重新生成。 */
private void connEtoC3(java.awt.event.ComponentEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.indicatorPanel_ComponentResized(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 16:52:24)
 * @return nc.ui.cc.base.FormulaDlg
 */
public nc.ui.cc.base.FormulaDlg getActDlg() {
	if(m_ActDlg == null){
		m_ActDlg = new FormulaDlg(getParentUI());
		m_ActDlg.getPaneFormula().setFormulaType(IGuiderLineConst.FORMULATYPE_ACT);
	}
	return m_ActDlg;
}
/**
 * 返回 UIButton1 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getBtnAct() {
	if (ivjBtnAct == null) {
		try {
			ivjBtnAct = new nc.ui.pub.beans.UIButton();
			ivjBtnAct.setName("BtnAct");
			ivjBtnAct.setFont(new java.awt.Font("dialog", 0, 12));
			ivjBtnAct.setText("公式编辑");
			ivjBtnAct.setBounds(135, 85, 93, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnAct;
}
/**
 * 返回 UIButton2 特性值。
 * @return nc.ui.pub.beans.UIButton
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIButton getBtnDefault() {
	if (ivjBtnDefault == null) {
		try {
			ivjBtnDefault = new nc.ui.pub.beans.UIButton();
			ivjBtnDefault.setName("BtnDefault");
			ivjBtnDefault.setFont(new java.awt.Font("dialog", 0, 12));
			ivjBtnDefault.setText("公式编辑");
			ivjBtnDefault.setBounds(135, 191, 93, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnDefault;
}
/**
 * 返回 UIComboBox2 特性值。
 * @return nc.ui.pub.beans.UIComboBox
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIComboBox getCbMethod() {
	if (ivjCbMethod == null) {
		try {
			ivjCbMethod = new nc.ui.pub.beans.UIComboBox();
			ivjCbMethod.setName("CbMethod");
			ivjCbMethod.setBounds(305, 47, 140, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbMethod;
}
/**
 * 返回 UIComboBox1 特性值。
 * @return nc.ui.pub.beans.UIComboBox
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIComboBox getCbRange() {
	if (ivjCbRange == null) {
		try {
			ivjCbRange = new nc.ui.pub.beans.UIComboBox();
			ivjCbRange.setName("CbRange");
			ivjCbRange.setBounds(72, 47, 140, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbRange;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 16:53:09)
 * @return nc.ui.cc.base.FormulaDlg
 */
public nc.ui.cc.base.FormulaDlg getDefaultDlg() {
	if(m_DefaultDlg == null){
		m_DefaultDlg = new FormulaDlg(getParentUI());
		m_DefaultDlg.getPaneFormula().setFormulaType(IGuiderLineConst.FORMULATYPE_DEF);
	}
	return m_DefaultDlg;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 17:03:49)
 * @return java.util.HashMap
 */
public java.util.HashMap getFormulaBuffer() {
	return m_FormulaBuffer;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 14:11:04)
 * @return nc.vo.cc.indicator.IndicatorVO
 */
public IndicatorVO getIndicatorVO() {
	if(m_IndicatorVO!=null){
		m_IndicatorVO.setIndicatorcode(getTxtCode().getText());
		m_IndicatorVO.setIndicatorname(getTxtName().getText());
		m_IndicatorVO.setCtrlmethod((String)getCbMethod().getSelectedItem());
		m_IndicatorVO.setCtrlrange((String)getCbRange().getSelectedItem());
		m_IndicatorVO.setFk_plancenter("0001");
	}
	return m_IndicatorVO;
}
/**
 * 返回 LblAct 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblAct() {
	if (ivjLblAct == null) {
		try {
			ivjLblAct = new nc.ui.pub.beans.UILabel();
			ivjLblAct.setName("LblAct");
			ivjLblAct.setText("执行数取数公式");
			ivjLblAct.setBounds(16, 85, 100, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblAct;
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
			ivjLblCode.setText("指标编码");
			ivjLblCode.setLocation(15, 13);
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
 * 返回 UILabel6 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblDefault() {
	if (ivjLblDefault == null) {
		try {
			ivjLblDefault = new nc.ui.pub.beans.UILabel();
			ivjLblDefault.setName("LblDefault");
			ivjLblDefault.setText("额度取数公式");
			ivjLblDefault.setBounds(16, 191, 100, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDefault;
}
/**
 * 返回 LblMethod 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblMethod() {
	if (ivjLblMethod == null) {
		try {
			ivjLblMethod = new nc.ui.pub.beans.UILabel();
			ivjLblMethod.setName("LblMethod");
			ivjLblMethod.setText("控制方式");
			ivjLblMethod.setLocation(241, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblMethod;
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
			ivjLblName.setText("指标名称");
			ivjLblName.setLocation(241, 13);
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
 * 返回 LblRange 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblRange() {
	if (ivjLblRange == null) {
		try {
			ivjLblRange = new nc.ui.pub.beans.UILabel();
			ivjLblRange.setName("LblRange");
			ivjLblRange.setText("控制范围");
			ivjLblRange.setLocation(15, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblRange;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 13:54:43)
 * @return nc.ui.cc.indicator.IndicatorPanel
 * @param vo nc.vo.cc.indicator.IndicatorVO
 */
public static IndicatorPanel getPanel(IndicatorVO vo) {
	//if(m_PanelObject == null){
	m_PanelObject = new IndicatorPanel();
	m_PanelObject.setName("IndicatorPanel");
	//}
	m_PanelObject.setIndicatorVO(vo);
	return m_PanelObject;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-7-5 21:40:04)
 * @return nc.ui.cc.indicator.IndicatorUI
 */
public IndicatorUI getParentUI() {
	return m_ParentUI;
}
/**
 * 返回 UIScrollPane1 特性值。
 * @return nc.ui.pub.beans.UIScrollPane
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIScrollPane getSpAct() {
	if (ivjSpAct == null) {
		try {
			ivjSpAct = new nc.ui.pub.beans.UIScrollPane();
			ivjSpAct.setName("SpAct");
			ivjSpAct.setBounds(15, 122, 428, 59);
			getSpAct().setViewportView(getTxtAct());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjSpAct;
}
/**
 * 返回 UIScrollPane2 特性值。
 * @return nc.ui.pub.beans.UIScrollPane
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UIScrollPane getSpDefault() {
	if (ivjSpDefault == null) {
		try {
			ivjSpDefault = new nc.ui.pub.beans.UIScrollPane();
			ivjSpDefault.setName("SpDefault");
			ivjSpDefault.setBounds(15, 225, 428, 59);
			getSpDefault().setViewportView(getTxtDefault());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjSpDefault;
}
/**
 * 返回 UITextArea1 特性值。
 * @return nc.ui.pub.beans.UITextArea
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UITextArea getTxtAct() {
	if (ivjTxtAct == null) {
		try {
			ivjTxtAct = new nc.ui.pub.beans.UITextArea();
			ivjTxtAct.setName("TxtAct");
			ivjTxtAct.setLineWrap(true);
			ivjTxtAct.setBounds(0, 0, 160, 120);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtAct;
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
			ivjTxtCode.setBounds(72, 13, 140, 23);
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
 * 返回 UITextArea2 特性值。
 * @return nc.ui.pub.beans.UITextArea
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UITextArea getTxtDefault() {
	if (ivjTxtDefault == null) {
		try {
			ivjTxtDefault = new nc.ui.pub.beans.UITextArea();
			ivjTxtDefault.setName("TxtDefault");
			ivjTxtDefault.setLineWrap(true);
			ivjTxtDefault.setBounds(0, 0, 160, 120);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtDefault;
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
			ivjTxtName.setBounds(305, 13, 140, 23);
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
 * 每当部件抛出异常时被调用
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* 除去下列各行的注释，以将未捕捉到的异常打印至 stdout。 */
	// System.out.println("--------- 未捕捉到的异常 ---------");
	// exception.printStackTrace(System.out);
}
/**
 * Comment
 */
public void indicatorPanel_ComponentResized(java.awt.event.ComponentEvent componentEvent) {
	getSpAct().setSize(getWidth()-30,(getHeight()-getSpAct().getX()-170)/2);
	getSpAct().validate();
	getSpAct().repaint();

	getLblDefault().setLocation(getLblDefault().getX(),getSpAct().getY()+getSpAct().getHeight()+15);
	getBtnDefault().setLocation(getBtnDefault().getX(),getSpAct().getY()+getSpAct().getHeight()+15);
	
	getSpDefault().setSize(getWidth()-30,(getHeight()-getSpAct().getX()-170)/2);
	getSpDefault().setLocation(getSpDefault().getX(),getLblDefault().getY()+getLblDefault().getHeight()+15);
	getSpDefault().validate();
	getSpDefault().repaint();
	return;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 15:52:18)
 */
public void initCombo() {
 	getCbMethod().addItem("刚性");
 	getCbMethod().addItem("柔性");
 
 	getCbRange().addItem("当期");
 	getCbRange().addItem("累进");	
}
/**
 * 初始化连接
 * @exception java.lang.Exception 异常说明。
 */
/* 警告：此方法将重新生成。 */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getBtnAct().addMouseListener(ivjEventHandler);
	getBtnDefault().addMouseListener(ivjEventHandler);
	this.addComponentListener(ivjEventHandler);
}
/**
 * 初始化类。
 */
/* 警告：此方法将重新生成。 */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("IndicatorPanel");
		setLayout(null);
		setSize(466, 300);
		add(getLblCode(), getLblCode().getName());
		add(getTxtCode(), getTxtCode().getName());
		add(getLblName(), getLblName().getName());
		add(getTxtName(), getTxtName().getName());
		add(getLblRange(), getLblRange().getName());
		add(getLblMethod(), getLblMethod().getName());
		add(getLblAct(), getLblAct().getName());
		add(getBtnAct(), getBtnAct().getName());
		add(getSpAct(), getSpAct().getName());
		add(getLblDefault(), getLblDefault().getName());
		add(getBtnDefault(), getBtnDefault().getName());
		add(getSpDefault(), getSpDefault().getName());
		add(getCbRange(), getCbRange().getName());
		add(getCbMethod(), getCbMethod().getName());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	initCombo();
	// user code end
}

/**
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		IndicatorPanel aIndicatorPanel;
		aIndicatorPanel = new IndicatorPanel();
		frame.setContentPane(aIndicatorPanel);
		frame.setSize(aIndicatorPanel.getSize());
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
 * 创建日期：(2005-6-11 16:52:24)
 * @param newActDlg nc.ui.cc.base.FormulaDlg
 */
public void setActDlg(nc.ui.cc.base.FormulaDlg newActDlg) {
	m_ActDlg = newActDlg;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 16:53:09)
 * @param newDefaultDlg nc.ui.cc.base.FormulaDlg
 */
public void setDefaultDlg(nc.ui.cc.base.FormulaDlg newDefaultDlg) {
	m_DefaultDlg = newDefaultDlg;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-7 17:30:37)
 * @param bEnabled boolean
 */
public void setEditabled(boolean bEnabled) {
	getTxtCode().setEnabled(bEnabled);
	getTxtName().setEnabled(bEnabled);
	getCbMethod().setEnabled(bEnabled);
	getCbRange().setEnabled(bEnabled);

	getBtnAct().setEnabled(bEnabled);
	getBtnDefault().setEnabled(bEnabled);

	getTxtAct().setEnabled(false);
	getTxtDefault().setEnabled(false);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 17:03:49)
 * @param newFormulaBuffer java.util.HashMap
 */
public void setFormulaBuffer(java.util.HashMap newFormulaBuffer) {
	m_FormulaBuffer = newFormulaBuffer;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-11 14:11:04)
 * @param newIndicatorVO nc.vo.cc.indicator.IndicatorVO
 */
public void setIndicatorVO(IndicatorVO newIndicatorVO) {
	m_IndicatorVO = newIndicatorVO;
	getTxtCode().setText(m_IndicatorVO.getIndicatorcode());
	getTxtName().setText(m_IndicatorVO.getIndicatorname());
	getCbMethod().setSelectedItem(m_IndicatorVO.getCtrlmethod());
	getCbRange().setSelectedItem(m_IndicatorVO.getCtrlrange());

	String [] ActFormula = new String []{
		m_IndicatorVO.getActformula(),null
	};
	String [] DefaultFormula = new String []{
		m_IndicatorVO.getDefaultformula(),null
	};

	try{
		getActDlg().getPaneFormula().setFormulas(ActFormula);
		getTxtAct().setText(getActDlg().getPaneFormula().getFormulas()[1]);
		getDefaultDlg().getPaneFormula().setFormulas(DefaultFormula);
		getTxtDefault().setText(getDefaultDlg().getPaneFormula().getFormulas()[1]);
	}catch(Exception e){
		MessageDialog.showHintDlg(this,"公式解析有错！",e.getMessage());
	}
	
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-7-5 21:40:04)
 * @param newParentUI nc.ui.cc.indicator.IndicatorUI
 */
public void setParentUI(IndicatorUI newParentUI) {
	m_ParentUI = newParentUI;
}
}
