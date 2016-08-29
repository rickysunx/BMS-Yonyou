package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-1-21 10:00:15)
 * @author���Ŵ���
 */
public class RefKmModel extends nc.ui.bd.ref.DefaultRefTreeModel {
/**
 * RefKmModel ������ע�⡣
 */
public RefKmModel() {
	super();
	initialize();
}
/**
 * RefKmModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public RefKmModel(String refNodeName) {
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
	setFieldCode(new String[]{"bd_accsubj.subjcode","bd_accsubj.subjname","bd_accsubj.pk_accsubj"});
	
	setFieldName(new String[]{"��Ŀ����","��Ŀ����","����"});
	setPkFieldCode("bd_accsubj.subjcode");
	setRootName("��Ŀ����");
	setTableName("bd_accsubj");
	setWherePart("pk_corp='0001'");
	setOrderPart("bd_accsubj.subjcode");
	setCodingRule("32322");

}
}
