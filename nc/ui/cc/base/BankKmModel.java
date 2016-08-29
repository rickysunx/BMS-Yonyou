package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-1-21 10:00:15)
 * @author���Ŵ���
 */
public class BankKmModel extends nc.ui.bd.ref.DefaultRefTreeModel {
/**
 * RefKmModel ������ע�⡣
 */
public BankKmModel() {
	super();
	initialize();
}
/**
 * RefKmModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public BankKmModel(String refNodeName) {
	super(refNodeName);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-1-21 10:01:55)
 */
private void initialize() 
{
	//super.setRefType(1);
	setRefTitle("��Ŀ����");
	setFieldCode(new String[]{"kmbm","kmmc","pk_cvpkmda"});
	
	setFieldName(new String[]{"��Ŀ����","��Ŀ����","����"});
	setPkFieldCode("pk_cvpkmda");
	setRootName("��Ŀ����");
	setTableName("cvp_kmda");
	setWherePart("zzjg='#'");
	setOrderPart("kmbm");
	setCodingRule("32322");

}
}
