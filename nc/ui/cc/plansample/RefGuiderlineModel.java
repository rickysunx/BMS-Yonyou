package nc.ui.cc.plansample;

/**
 * �˴���������˵����
 * �������ڣ�(2005-1-21 10:15:52)
 * @author���Ŵ���
 */
public class RefGuiderlineModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * RefGuiderlineModel ������ע�⡣
 */
public RefGuiderlineModel()
{
	super();
	initialize();
}
/**
 * RefGuiderlineModel ������ע�⡣
 * @param refNodeName java.lang.String
 */
public RefGuiderlineModel(String refNodeName) {
	super(refNodeName);
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-1-21 10:16:11)
 */
private void initialize() 
{
	setRefTitle("ָ�굵��");
	setFieldCode(new String[]{"INDICATORCODE","INDICATORname","PK_INDICATOR"});
	
	setFieldName(new String[]{"ָ�����","ָ������","����"});
	setPkFieldCode("PK_INDICATOR");
	//setRootName("ָ�굵��");
	setTableName("cc_indicator");
	setOrderPart("INDICATORCODE");
	//setCodingRule("32322");
}
}
