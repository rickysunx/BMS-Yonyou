package nc.ui.cc.plan;

import nc.ui.cc.base.*;
import nc.vo.cc.plan.*;
import nc.ui.pub.beans.*;
/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-16 11:10:08)
 * @author：孙锐
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
 * AddPlanDlg 构造子注解。
 */
public AddPlanDlg() {
	super();
	initialize();
}
/**
 * AddPlanDlg 构造子注解。
 * @param parent java.awt.Container
 */
public AddPlanDlg(java.awt.Container parent) {
	super(parent);
	initialize();
}
/**
 * AddPlanDlg 构造子注解。
 * @param parent java.awt.Container
 * @param title java.lang.String
 */
public AddPlanDlg(java.awt.Container parent, String title) {
	super(parent, title);
}
/**
 * AddPlanDlg 构造子注解。
 * @param owner java.awt.Frame
 */
public AddPlanDlg(java.awt.Frame owner) {
	super(owner);
}
/**
 * AddPlanDlg 构造子注解。
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
		MessageDialog.showHintDlg(this,"校验数据时发生错误",e.getMessage());
	}
	return;
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-16 19:37:53)
 * @return boolean
 */
public boolean checkData() throws Exception {
	//前台校验
	SampleRefModel srf = (SampleRefModel) getRefSample().getRefModel();
	PeriodRefModel prf = (PeriodRefModel) getRefPeriod().getRefModel();
	if(srf.getPkValue()==null) throw new Exception("样表不能为空！");
	if(prf.getPkValue()==null) throw new Exception("会计期间不能为空！");
	if(getTxtCode().getText()==null || getTxtCode().getText().trim().length()==0){
		throw new Exception("计划编码不能为空！");
	}
	if(getTxtName().getText()==null || getTxtName().getText().trim().length()==0){
		throw new Exception("计划名称不能为空！");
	}

	//后台校验
	
	return false;
}
/**
 * connEtoC1:  (BtnOK.mouse.mouseClicked(java.awt.event.MouseEvent) --> AddPlanDlg.btnOK_MouseClicked(Ljava.awt.event.MouseEvent;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* 警告：此方法将重新生成。 */
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
/* 警告：此方法将重新生成。 */
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
/* 警告：此方法将重新生成。 */
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
/* 警告：此方法将重新生成。 */
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-16 19:12:38)
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
 * 返回 LblCode 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblCode() {
	if (ivjLblCode == null) {
		try {
			ivjLblCode = new nc.ui.pub.beans.UILabel();
			ivjLblCode.setName("LblCode");
			ivjLblCode.setText("计划编码");
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
 * 返回 LblName 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new nc.ui.pub.beans.UILabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("计划名称");
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
 * 返回 LblPeriod 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblPeriod() {
	if (ivjLblPeriod == null) {
		try {
			ivjLblPeriod = new nc.ui.pub.beans.UILabel();
			ivjLblPeriod.setName("LblPeriod");
			ivjLblPeriod.setText("会计期间");
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
 * 返回 LblSample 特性值。
 * @return nc.ui.pub.beans.lblInf
 */
/* 警告：此方法将重新生成。 */
private nc.ui.pub.beans.UILabel getLblSample() {
	if (ivjLblSample == null) {
		try {
			ivjLblSample = new nc.ui.pub.beans.UILabel();
			ivjLblSample.setName("LblSample");
			ivjLblSample.setText("引用的样表");
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-16 19:27:19)
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
 * 返回 UIRefPane2 特性值。
 * @return nc.ui.pub.beans.UIRefPane
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 UIRefPane1 特性值。
 * @return nc.ui.pub.beans.UIRefPane
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 UITextField1 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
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
 * 返回 UITextField2 特性值。
 * @return nc.ui.pub.beans.UITextField
 */
/* 警告：此方法将重新生成。 */
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
	getBtnOK().addMouseListener(ivjEventHandler);
	getBtnCancel().addMouseListener(ivjEventHandler);
	getRefSample().addValueChangedListener(ivjEventHandler);
	getRefPeriod().addValueChangedListener(ivjEventHandler);
}
/**
 * 初始化类。
 */
/* 警告：此方法将重新生成。 */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("AddPlanDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(293, 217);
		setTitle("新建计划");
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
 * 主入口点 - 当部件作为应用程序运行时，启动这个部件。
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
		System.err.println("nc.ui.pub.beans.UIDialog 的 main() 中发生异常");
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
 * 此处插入方法说明。
 * 创建日期：(2005-6-16 19:25:39)
 * @param pk_sample java.lang.String
 */
public void setDefaultSample(String pk_sample) {}
}
