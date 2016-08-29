package nc.ui.cc.adjust;

import nc.vo.cc.adjust.*;
import nc.vo.bd.*;
import nc.vo.cc.adjust.*;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-29 16:22:23)
 * @author������
 */
public class AdjustNewDlg extends nc.ui.pub.beans.UIDialog {
	private javax.swing.JPanel ivjUIDialogContentPane = null;
	private nc.ui.pub.beans.UIButton ivjBtnCancel = null;
	private nc.ui.pub.beans.UIButton ivjBtnOK = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private nc.ui.pub.beans.UIRefPane ivjRefCorp = null;
	private nc.ui.pub.beans.UIRefPane ivjRefPlan = null;

class IvjEventHandler implements java.awt.event.MouseListener {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if (e.getSource() == AdjustNewDlg.this.getBtnOK()) 
				connEtoC1(e);
			if (e.getSource() == AdjustNewDlg.this.getBtnCancel()) 
				connEtoC2(e);
		};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {};
	};
	private nc.ui.pub.beans.UILabel ivjLblCorp = null;
	private nc.ui.pub.beans.UILabel ivjLblPlan = null;
	public nc.vo.cc.adjust.PlanCodeNameVO m_PlanCodeNameVO = null;
	public nc.vo.bd.CorpVO m_CorpVO = null;
	public AdjustUI m_ParentUI = null;
/**
 * AdjustNewDlg ������ע�⡣
 */
public AdjustNewDlg() {
	super();
	initialize();
}
/**
 * AdjustNewDlg ������ע�⡣
 * @param parent java.awt.Container
 */
public AdjustNewDlg(java.awt.Container parent) {
	super(parent);
	setParentUI((AdjustUI)parent);
	initialize();
}
/**
 * AdjustNewDlg ������ע�⡣
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public AdjustNewDlg(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * AdjustNewDlg ������ע�⡣
 * @param owner java.awt.Frame
 */
public AdjustNewDlg(java.awt.Frame owner) {
	super(owner);
}
/**
 * AdjustNewDlg ������ע�⡣
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public AdjustNewDlg(java.awt.Frame owner, String title) {
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
	try {
		if(getRefCorp().getRefCode()==null || getRefCorp().getRefCode().length()==0){
			throw new Exception("��ѡ��˾��");
		}
		if(getRefPlan().getRefCode()==null || getRefPlan().getRefCode().length()==0){
			throw new Exception("��ѡ��ƻ���");
		}
		CorpVO cvo = new CorpVO();
		cvo.setPrimaryKey(getRefCorp().getRefPK());
		cvo.setUnitcode(getRefCorp().getRefCode());
		cvo.setUnitname(getRefCorp().getRefName());
		setCorpVO(cvo);

		PlanCodeNameVO pcnvo = new PlanCodeNameVO();
		pcnvo.setCode(getRefPlan().getRefCode());
		pcnvo.setName(getRefPlan().getRefName());
		setPlanCodeNameVO(pcnvo);
		
		closeOK();	
	} catch (Exception e) {
		nc.ui.pub.beans.MessageDialog.showHintDlg(this,"����",e.getMessage());
	}
	return;
}
/**
 * connEtoC1:  (BtnOK.mouse.mouseClicked(java.awt.event.MouseEvent) --> AdjustNewDlg.btnOK_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
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
 * connEtoC2:  (BtnCancel.mouse.mouseClicked(java.awt.event.MouseEvent) --> AdjustNewDlg.btnCancel_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC2(java.awt.event.MouseEvent arg1) {
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
 * ���� UIButton2 ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new nc.ui.pub.beans.UIButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText("ȡ��");
			ivjBtnCancel.setBounds(154, 91, 56, 22);
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
 * ���� UIButton1 ����ֵ��
 * @return nc.ui.pub.beans.UIButton
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIButton getBtnOK() {
	if (ivjBtnOK == null) {
		try {
			ivjBtnOK = new nc.ui.pub.beans.UIButton();
			ivjBtnOK.setName("BtnOK");
			ivjBtnOK.setText("ȷ��");
			ivjBtnOK.setBounds(55, 91, 56, 22);
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
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:39:01)
 * @return nc.vo.bd.CorpVO
 */
public nc.vo.bd.CorpVO getCorpVO() {
	return m_CorpVO;
}
/**
 * ���� UILabel1 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblCorp() {
	if (ivjLblCorp == null) {
		try {
			ivjLblCorp = new nc.ui.pub.beans.UILabel();
			ivjLblCorp.setName("LblCorp");
			ivjLblCorp.setText("��˾");
			ivjLblCorp.setBounds(17, 16, 35, 22);
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
 * ���� UILabel2 ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblPlan() {
	if (ivjLblPlan == null) {
		try {
			ivjLblPlan = new nc.ui.pub.beans.UILabel();
			ivjLblPlan.setName("LblPlan");
			ivjLblPlan.setText("�ƻ�");
			ivjLblPlan.setBounds(16, 52, 35, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblPlan;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-4 8:49:03)
 * @return nc.ui.cc.adjust.AdjustUI
 */
public AdjustUI getParentUI() {
	return m_ParentUI;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:31:22)
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
			ivjRefCorp.setBounds(51, 15, 196, 22);
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
 * ���� UIRefPane2 ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefPlan() {
	if (ivjRefPlan == null) {
		try {
			ivjRefPlan = new nc.ui.pub.beans.UIRefPane();
			ivjRefPlan.setName("RefPlan");
			ivjRefPlan.setBounds(51, 52, 196, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRefPlan;
}
/**
 * ���� UIDialogContentPane ����ֵ��
 * @return javax.swing.JPanel
 */
/* ���棺�˷������������ɡ� */
private javax.swing.JPanel getUIDialogContentPane() {
	if (ivjUIDialogContentPane == null) {
		try {
			ivjUIDialogContentPane = new javax.swing.JPanel();
			ivjUIDialogContentPane.setName("UIDialogContentPane");
			ivjUIDialogContentPane.setLayout(null);
			getUIDialogContentPane().add(getLblCorp(), getLblCorp().getName());
			getUIDialogContentPane().add(getLblPlan(), getLblPlan().getName());
			getUIDialogContentPane().add(getRefCorp(), getRefCorp().getName());
			getUIDialogContentPane().add(getRefPlan(), getRefPlan().getName());
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
	getBtnOK().addMouseListener(ivjEventHandler);
	getBtnCancel().addMouseListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("AdjustNewDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(270, 170);
		setTitle("�½�������");
		setContentPane(getUIDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getRefCorp().setRefModel(new CorpRefModel());
	getRefPlan().setRefModel(new nc.ui.cc.base.PlanRefModel());
	
	getRefCorp().setPK(getParentUI().getEvn().getCorporation().getPrimaryKey());
	getRefCorp().setEnabled(false);
	// user code end
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		AdjustNewDlg aAdjustNewDlg;
		aAdjustNewDlg = new AdjustNewDlg();
		aAdjustNewDlg.setModal(true);
		aAdjustNewDlg.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aAdjustNewDlg.show();
		java.awt.Insets insets = aAdjustNewDlg.getInsets();
		aAdjustNewDlg.setSize(aAdjustNewDlg.getWidth() + insets.left + insets.right, aAdjustNewDlg.getHeight() + insets.top + insets.bottom);
		aAdjustNewDlg.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("nc.ui.pub.beans.UIDialog �� main() �з����쳣");
		exception.printStackTrace(System.out);
	}
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:39:01)
 * @param newCorpVO nc.vo.bd.CorpVO
 */
public void setCorpVO(nc.vo.bd.CorpVO newCorpVO) {
	m_CorpVO = newCorpVO;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-7-4 8:49:03)
 * @param newParentUI nc.ui.cc.adjust.AdjustUI
 */
public void setParentUI(AdjustUI newParentUI) {
	m_ParentUI = newParentUI;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-29 19:31:22)
 * @param newPlanCodeNameVO nc.vo.cc.adjust.PlanCodeNameVO
 */
public void setPlanCodeNameVO(nc.vo.cc.adjust.PlanCodeNameVO newPlanCodeNameVO) {
	m_PlanCodeNameVO = newPlanCodeNameVO;
}
}
