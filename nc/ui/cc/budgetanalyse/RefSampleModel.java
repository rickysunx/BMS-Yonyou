package nc.ui.cc.budgetanalyse;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-30 15:55:03)
 * @author���Ŵ���
 */
public class RefSampleModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * RefSampleModel ������ע�⡣
 */
public RefSampleModel() {
	super();
	initSth();
}
/**
 * RefSampleModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public RefSampleModel(String refNodeName) {
	super(refNodeName);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-30 15:56:02)
 */
public void initSth() 
{
	setRefTitle("�ƻ�����");
	setFieldCode(new String[]{"samplecode","samplename","pk_sample"});
	
	setFieldName(new String[]{"�������","��������","����"});
	setPkFieldCode("pk_sample");
	//setRootName("ָ�굵��");
	setTableName("cc_sample");
	setOrderPart("samplecode");	
}
}
