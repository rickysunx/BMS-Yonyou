package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-27 14:40:12)
 * @author������
 */
public class SampleItemRefModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * SampleItemRefModel ������ע�⡣
 */
public SampleItemRefModel() {
	super();
	setTableName("cc_sample_item");
	setFieldCode(new String[] { "itemcode", "itemname","pk_item"});
	setFieldName(new String[] { "�ƻ�����", "�ƻ�����" });
	setRefTitle("�ƻ�����");
	setPkFieldCode("pk_item");
	setWherePart("1<>1");
}
/**
 * SampleItemRefModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public SampleItemRefModel(String refNodeName) {
	super(refNodeName);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-27 14:42:27)
 * @param code java.lang.String
 */
public void setPlanCode(String code) {
	setWherePart(" fk_sample in (select fk_sample from cc_plan where plancode = '" + code + "')");	
}
}
