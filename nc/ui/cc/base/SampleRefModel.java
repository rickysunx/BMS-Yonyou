package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-15 9:14:01)
 * @author������
 */
public class SampleRefModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * SampleRefModel ������ע�⡣
 */
public SampleRefModel() {
	super();
	setTableName("cc_sample");
	setFieldCode(new String[] { "samplecode", "samplename","pk_sample"});
	setFieldName(new String[] { "�ƻ��������", "�ƻ���������","����" });
	setRefTitle("�ƻ��������");
	setPkFieldCode("pk_sample");
}
/**
 * SampleRefModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public SampleRefModel(String refNodeName) {
	super(refNodeName);
}
}
