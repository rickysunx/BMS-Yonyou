package nc.ui.cc.plansample;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-1-21 10:15:52)
 * @author：张春明
 */
public class RefGuiderlineModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * RefGuiderlineModel 构造子注解。
 */
public RefGuiderlineModel()
{
	super();
	initialize();
}
/**
 * RefGuiderlineModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public RefGuiderlineModel(String refNodeName) {
	super(refNodeName);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-1-21 10:16:11)
 */
private void initialize() 
{
	setRefTitle("指标档案");
	setFieldCode(new String[]{"INDICATORCODE","INDICATORname","PK_INDICATOR"});
	
	setFieldName(new String[]{"指标编码","指标名称","主键"});
	setPkFieldCode("PK_INDICATOR");
	//setRootName("指标档案");
	setTableName("cc_indicator");
	setOrderPart("INDICATORCODE");
	//setCodingRule("32322");
}
}
