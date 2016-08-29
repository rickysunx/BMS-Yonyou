package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-1-21 10:00:15)
 * @author：张春明
 */
public class RefKmModel extends nc.ui.bd.ref.DefaultRefTreeModel {
/**
 * RefKmModel 构造子注解。
 */
public RefKmModel() {
	super();
	initialize();
}
/**
 * RefKmModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public RefKmModel(String refNodeName) {
	super(refNodeName);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-1-21 10:01:55)
 */
private void initialize() 
{
	//super.setRefType(1);
	setRefTitle("科目参照");
	setFieldCode(new String[]{"bd_accsubj.subjcode","bd_accsubj.subjname","bd_accsubj.pk_accsubj"});
	
	setFieldName(new String[]{"科目编码","科目名称","主键"});
	setPkFieldCode("bd_accsubj.subjcode");
	setRootName("科目档案");
	setTableName("bd_accsubj");
	setWherePart("pk_corp='0001'");
	setOrderPart("bd_accsubj.subjcode");
	setCodingRule("32322");

}
}
