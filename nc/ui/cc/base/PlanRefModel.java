package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-27 12:55:34)
 * @author������
 */
public class PlanRefModel extends nc.ui.bd.ref.DefaultRefModel {
	
/**
 * PlanRefModel ������ע�⡣
 */
public PlanRefModel() {
	super();
	setTableName("cc_plan");
	setFieldCode(new String[] { "plancode", "planname"});
	setFieldName(new String[] { "�ƻ�����", "�ƻ�����" });
	setRefTitle("�ƻ�����");
	setPkFieldCode("pk_plan");
	setStrPatch("distinct");
	//setWherePart(" plancode in (select distinct plancode from cc_plan) ");
}
/**
 * PlanRefModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public PlanRefModel(String refNodeName) {
	super(refNodeName);
}
}
