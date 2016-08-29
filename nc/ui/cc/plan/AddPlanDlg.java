package nc.ui.cc.plan;

import nc.ui.cc.base.*;
import nc.vo.cc.plan.*;
import nc.ui.pub.beans.*;
/**
 * �˴���������˵����
 * �������ڣ�(2005-6-16 11:10:08)
 * @author������
 */
public class AddPlanDlg extends UIDialog {
	private UILabel ivjLblCode = null;
	private UILabel ivjLblName = null;
	private UILabel ivjLblPeriod = null;
	private UILabel ivjLblSample = null;
	private javax.swing.JPanel ivjUIDialogContentPane = null;
	private UIButton ivjBtnCancel = null;
	private UIButton ivjBtnOK = null;
	private UIRefPane ivjRefPeriod = null;
	private UIRefPane ivjRefSample = null;
	private UITextField ivjTxtCode = null;
	private UITextField ivjTxtName = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();

class IvjEventHandler implements java.awt.event.MouseListener, nc.ui.pub.beans.ValueChangedListener {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if (e.getSource() == AddPlanDlg.this.getBtnOK()) 
				connEtoC1(e);
			if (e.getSource() == AddPlanDlg.this.getBtnCancel()) 
				connEtoC2(e);
		};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {};
		public void valueChanged(nc.ui.pub.beans.ValueChangedEvent event) {
			if (event.getSource() == AddPlanDlg.this.getRefSample()) 
				connEtoC3(event);
			if (event.getSource() == AddPlanDlg.this.getRefPeriod()) 
				connEtoC4(event);
		};
	};
/**
 * AddPlanDlg ������ע�⡣
 */
public AddPlanDlg() {
	super();
	initialize();
}
/**
 * AddPlanDlg ������ע�⡣
 * @param parent java.awt.Container
 */
public AddPlanDlg(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * AddPlanDlg ������ע�⡣
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public AddPlanDlg(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * AddPlanDlg ������ע�⡣
 * @param owner java.awt.Frame
 */
public AddPlanDlg(java.awt.Frame owner) {
	super(owner);
}
/**
 * AddPlanDlg ������ע�⡣
 * @param owner java.awt.Frame
 * @param title java.lang.String
 */
public AddPlanDlg(java.awt.Frame owner, String title) {
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
		checkData();
		closeOK();
	}catch(Exception e){
		MessageDialog.showHintDlg(this,"У������ʱ��������",e.getMessage());
	}
	return;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 19:37:53)
 * @return boolean
 */
public boolean checkData() throws Exception {
	//ǰ̨У��
	SampleRefModel srf = (SampleRefModel) getRefSample().getRefModel();
	PeriodRefModel prf = (PeriodRefModel) getRefPeriod().getRefModel();
	if(srf.getPkValue()==null) throw new Exception("������Ϊ�գ�");
	if(prf.getPkValue()==null) throw new Exception("����ڼ䲻��Ϊ�գ�");
	if(getTxtCode().getText()==null || getTxtCode().getText().trim().length()==0){
		throw new Exception("�ƻ����벻��Ϊ�գ�");
	}
	if(getTxtName().getText()==null || getTxtName().getText().trim().length()==0){
		throw new Exception("�ƻ����Ʋ���Ϊ�գ�");
	}

	//��̨У��
	
	return false;
}
/**
 * connEtoC1:  (BtnOK.mouse.mouseClicked(java.awt.event.MouseEvent) --> AddPlanDlg.btnOK_MouseClicked(Ljava.awt.event.MouseEvent;)V)
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
 * connEtoC2:  (BtnCancel.mouse.mouseClicked(java.awt.event.MouseEvent) --> AddPlanDlg.btnCancel_MouseClicked(Ljava.awt.event.MouseEvent;)V)
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
 * connEtoC3:  (RefSample.valueChanged.valueChanged(nc.ui.pub.beans.ValueChangedEvent) --> AddPlanDlg.refSample_ValueChanged(Lnc.ui.pub.beans.ValueChangedEvent;)V)
 * @param arg1 nc.ui.pub.beans.ValueChangedEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC3(nc.ui.pub.beans.ValueChangedEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.refSample_ValueChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (RefPeriod.valueChanged.valueChanged(nc.ui.pub.beans.ValueChangedEvent) --> AddPlanDlg.refPeriod_ValueChanged(Lnc.ui.pub.beans.ValueChangedEvent;)V)
 * @param arg1 nc.ui.pub.beans.ValueChangedEvent
 */
/* ���棺�˷������������ɡ� */
private void connEtoC4(nc.ui.pub.beans.ValueChangedEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.refPeriod_ValueChanged(arg1);
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
 * �������ڣ�(2005-6-16 19:12:38)
 */
public void fillDefaultCodeAndName() {
	SampleRefModel srf = (SampleRefModel) getRefSample().getRefModel();
	PeriodRefModel prf = (PeriodRefModel) getRefPeriod().getRefModel();
	if(srf.getPkValue()!=null && prf.getPkValue()!=null
		&& (!(getTxtCode().getText()!=null && getTxtCode().getText().length()>0))
		&& (!(getTxtName().getText()!=null && getTxtName().getText().length()>0))){
			getTxtCode().setText(srf.getRefCodeValue() + "_" + prf.getAccYear() + prf.getPeriod());
			getTxtName().setText(srf.getRefNameValue() + "(" + prf.getAccYear() + "-" + prf.getPeriod() + ")");
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
			ivjBtnCancel.setBounds(163, 151, 75, 22);
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
			ivjBtnOK.setBounds(53, 151, 75, 22);
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
 * ���� LblCode ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setText("�ƻ�����");
			ivjLblCode.setBounds(14, 79, 66, 22);
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
			ivjLblName.setText("�ƻ�����");
			ivjLblName.setBounds(14, 115, 66, 22);
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
 * ���� LblPeriod ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblPeriod() {
	if (ivjLblPeriod == null) {
		try {
			ivjLblPeriod = new nc.ui.pub.beans.UILabel();
			ivjLblPeriod.setName("LblPeriod");
			ivjLblPeriod.setText("����ڼ�");
			ivjLblPeriod.setBounds(14, 48, 66, 22);
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
 * ���� LblSample ����ֵ��
 * @return nc.ui.pub.beans.lblInf
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UILabel getLblSample() {
	if (ivjLblSample == null) {
		try {
			ivjLblSample = new nc.ui.pub.beans.UILabel();
			ivjLblSample.setName("LblSample");
			ivjLblSample.setText("���õ�����");
			ivjLblSample.setBounds(14, 15, 66, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblSample;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 19:27:19)
 * @return nc.vo.cc.plan.PlanVO
 */
public PlanVO getPlanVO() {
	PlanVO vo = new PlanVO();
	SampleRefModel srf = (SampleRefModel) getRefSample().getRefModel();
	PeriodRefModel prf = (PeriodRefModel) getRefPeriod().getRefModel();
	vo.setAccyear(new String(prf.getAccYear()));
	vo.setPeriod(new String(prf.getPeriod()));
	vo.setFk_sample(new String(srf.getPkValue()));
	vo.setPlancode(new String(getTxtCode().getText()));
	vo.setPlanname(new String(getTxtName().getText()));
	return vo;
}
/**
 * ���� UIRefPane2 ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefPeriod() {
	if (ivjRefPeriod == null) {
		try {
			ivjRefPeriod = new nc.ui.pub.beans.UIRefPane();
			ivjRefPeriod.setName("RefPeriod");
			ivjRefPeriod.setBounds(85, 47, 177, 22);
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
 * ���� UIRefPane1 ����ֵ��
 * @return nc.ui.pub.beans.UIRefPane
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UIRefPane getRefSample() {
	if (ivjRefSample == null) {
		try {
			ivjRefSample = new nc.ui.pub.beans.UIRefPane();
			ivjRefSample.setName("RefSample");
			ivjRefSample.setBounds(85, 15, 177, 22);
			// user code begin {1}
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
 * ���� UITextField1 ����ֵ��
 * @return nc.ui.pub.beans.UITextField
 */
/* ���棺�˷������������ɡ� */
private nc.ui.pub.beans.UITextField getTxtCode() {
	if (ivjTxtCode == null) {
		try {
			ivjTxtCode = new nc.ui.pub.beans.UITextField();
			ivjTxtCode.setName("TxtCode");
			ivjTxtCode.setPreferredSize(new java.awt.Dimension(2, 22));
			ivjTxtCode.setBounds(85, 79, 177, 22);
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
			ivjTxtName.setBounds(85, 115, 177, 22);
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
			getUIDialogContentPane().add(getLblSample(), getLblSample().getName());
			getUIDialogContentPane().add(getRefSample(), getRefSample().getName());
			getUIDialogContentPane().add(getLblCode(), getLblCode().getName());
			getUIDialogContentPane().add(getTxtCode(), getTxtCode().getName());
			getUIDialogContentPane().add(getLblName(), getLblName().getName());
			getUIDialogContentPane().add(getTxtName(), getTxtName().getName());
			getUIDialogContentPane().add(getLblPeriod(), getLblPeriod().getName());
			getUIDialogContentPane().add(getRefPeriod(), getRefPeriod().getName());
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
	getRefSample().addValueChangedListener(ivjEventHandler);
	getRefPeriod().addValueChangedListener(ivjEventHandler);
}
/**
 * ��ʼ���ࡣ
 */
/* ���棺�˷������������ɡ� */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("AddPlanDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(293, 217);
		setTitle("�½��ƻ�");
		setContentPane(getUIDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getRefSample().setRefModel(new SampleRefModel());
	getRefPeriod().setRefModel(new PeriodRefModel());
	// user code end
}
/**
 * ����ڵ� - ��������ΪӦ�ó�������ʱ���������������
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		AddPlanDlg aAddPlanDlg;
		aAddPlanDlg = new AddPlanDlg();
		aAddPlanDlg.setModal(true);
		aAddPlanDlg.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aAddPlanDlg.show();
		java.awt.Insets insets = aAddPlanDlg.getInsets();
		aAddPlanDlg.setSize(aAddPlanDlg.getWidth() + insets.left + insets.right, aAddPlanDlg.getHeight() + insets.top + insets.bottom);
		aAddPlanDlg.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("nc.ui.pub.beans.UIDialog �� main() �з����쳣");
		exception.printStackTrace(System.out);
	}
}
/**
 * Comment
 */
public void refPeriod_ValueChanged(nc.ui.pub.beans.ValueChangedEvent event) {
	
	fillDefaultCodeAndName();
	
	return;
}
/**
 * Comment
 */
public void refSample_ValueChanged(nc.ui.pub.beans.ValueChangedEvent event) {
	fillDefaultCodeAndName();
	return;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-16 19:25:39)
 * @param pk_sample java.lang.String
 */
public void setDefaultSample(String pk_sample) {}
}
