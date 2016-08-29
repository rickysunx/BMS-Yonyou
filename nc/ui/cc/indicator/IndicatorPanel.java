package nc.ui.cc.indicator;

import nc.ui.cc.base.*;
import nc.vo.cc.base.*;
import nc.vo.cc.indicator.*;
import nc.ui.pub.beans.*;
import java.util.*;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-11 11:00:29)
 * @author������
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
 * IndicatorPanel ������ע�⡣
 */
public IndicatorPanel() {
	super();
	initialize();
}
/**
 * IndicatorPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 */
public IndicatorPanel(java.awt.LayoutManager p0) {
	super(p0);
}
/**
 * IndicatorPanel ������ע�⡣
 * @param p0 java.awt.LayoutManager
 * @param p1 boolean
 */
public IndicatorPanel(java.awt.LayoutManager p0, boolean p1) {
	super(p0, p1);
}
/**
 * IndicatorPanel ������ע�⡣
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
				MessageDialog.showHintDlg(this,"��ʽ��������",e.getMessage());
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
				MessageDialog.showHintDlg(this,"��ʽ��������",e.getMessage());
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
/* ���棺�˷������������ɡ� */
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
/* ���棺�˷������������ɡ� */
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
/* ���棺�˷������������ɡ� */
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 16:52:24)
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
 * ���� UIButton1 ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBtnAct() {
	if (ivjBtnAct == null) {
		try {
			ivjBtnAct = new nc.ui.pub.beans.UIButton();
			ivjBtnAct.setName("BtnAct");
			ivjBtnAct.setFont(new java.awt.Font("dialog", 0, 12));
			ivjBtnAct.setText("��ʽ�༭");
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
 * ���� UIButton2 ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBtnDefault() {
	if (ivjBtnDefault == null) {
		try {
			ivjBtnDefault = new nc.ui.pub.beans.UIButton();
			ivjBtnDefault.setName("BtnDefault");
			ivjBtnDefault.setFont(new java.awt.Font("dialog", 0, 12));
			ivjBtnDefault.setText("��ʽ�༭");
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
 * ���� UIComboBox2 ����ֵ��
 * @return nc.ui.pub.beans.UIComboBox
 */
/* ���棺�˷������������ɡ� */
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
 * ���� UIComboBox1 ����ֵ��
 * @return nc.ui.pub.beans.UIComboBox
 */
/* ���棺�˷������������ɡ� */
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 16:53:09)
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 17:03:49)
 * @return java.util.HashMap
 */
public java.util.HashMap getFormulaBuffer() {
	return m_FormulaBuffer;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 14:11:04)
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
 * ���� LblAct ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblAct() {
	if (ivjLblAct == null) {
		try {
			ivjLblAct = new nc.ui.pub.beans.UILabel();
			ivjLblAct.setName("LblAct");
			ivjLblAct.setText("ִ����ȡ����ʽ");
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
 * ���� LblCode ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setText("ָ�����");
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
 * ���� UILabel6 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblDefault() {
	if (ivjLblDefault == null) {
		try {
			ivjLblDefault = new nc.ui.pub.beans.UILabel();
			ivjLblDefault.setName("LblDefault");
			ivjLblDefault.setText("���ȡ����ʽ");
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
 * ���� LblMethod ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblMethod() {
	if (ivjLblMethod == null) {
		try {
			ivjLblMethod = new nc.ui.pub.beans.UILabel();
			ivjLblMethod.setName("LblMethod");
			ivjLblMethod.setText("���Ʒ�ʽ");
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
 * ���� LblName ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new nc.ui.pub.beans.UILabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("ָ������");
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
 * ���� LblRange ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblRange() {
	if (ivjLblRange == null) {
		try {
			ivjLblRange = new nc.ui.pub.beans.UILabel();
			ivjLblRange.setName("LblRange");
			ivjLblRange.setText("���Ʒ�Χ");
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 13:54:43)
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-5 21:40:04)
 * @return nc.ui.cc.indicator.IndicatorUI
 */
public IndicatorUI getParentUI() {
	return m_ParentUI;
}
/**
 * ���� UIScrollPane1 ����ֵ��
 * @return nc.ui.pub.beans.UIScrollPane
 */
/* ���棺�˷������������ɡ� */
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
 * ���� UIScrollPane2 ����ֵ��
 * @return nc.ui.pub.beans.UIScrollPane
 */
/* ���棺�˷������������ɡ� */
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
 * ���� UITextArea1 ����ֵ��
 * @return nc.ui.pub.beans.UITextArea
 */
/* ���棺�˷������������ɡ� */
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
 * ���� TxtCode ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
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
 * ���� UITextArea2 ����ֵ��
 * @return nc.ui.pub.beans.UITextArea
 */
/* ���棺�˷������������ɡ� */
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
 * ���� TxtName ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
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
 * ÿ�������׳��쳣ʱ������
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* ��ȥ���и��е�ע�ͣ��Խ�δ��׽�����쳣��ӡ�� stdout�� */
	// System.out.println("--------- δ��׽�����쳣 ---------");
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 15:52:18)
 */
public void initCombo() {
 	getCbMethod().addItem("����");
 	getCbMethod().addItem("����");
 
 	getCbRange().addItem("����");
 	getCbRange().addItem("�۽�");	
}
/**
 * ��ʼ������
 * @exception java.lang.Exception �쳣˵����
 */
/* ���棺�˷������������ɡ� */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getBtnAct().addMouseListener(ivjEventHandler);
	getBtnDefault().addMouseListener(ivjEventHandler);
	this.addComponentListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
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
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
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
		System.err.println("nc.ui.pub.beans.UIPanel �� main() �з����쳣");
		exception.printStackTrace(System.out);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 16:52:24)
 * @param newActDlg nc.ui.cc.base.FormulaDlg
 */
public void setActDlg(nc.ui.cc.base.FormulaDlg newActDlg) {
	m_ActDlg = newActDlg;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 16:53:09)
 * @param newDefaultDlg nc.ui.cc.base.FormulaDlg
 */
public void setDefaultDlg(nc.ui.cc.base.FormulaDlg newDefaultDlg) {
	m_DefaultDlg = newDefaultDlg;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-7 17:30:37)
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 17:03:49)
 * @param newFormulaBuffer java.util.HashMap
 */
public void setFormulaBuffer(java.util.HashMap newFormulaBuffer) {
	m_FormulaBuffer = newFormulaBuffer;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-11 14:11:04)
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
		MessageDialog.showHintDlg(this,"��ʽ�����д�",e.getMessage());
	}
	
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-5 21:40:04)
 * @param newParentUI nc.ui.cc.indicator.IndicatorUI
 */
public void setParentUI(IndicatorUI newParentUI) {
	m_ParentUI = newParentUI;
}
}
