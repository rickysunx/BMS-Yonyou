package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-1-21 10:00:15)
 * @author：张春明
 */
public class BankKmModel extends nc.ui.bd.ref.DefaultRefTreeModel {
/**
 * RefKmModel 构造子注解。
 */
public BankKmModel() {
	super();
	initialize();
}
/**
 * RefKmModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public BankKmModel(String refNodeName) {
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
	setFieldCode(new String[]{"kmbm","kmmc","pk_cvpkmda"});
	
	setFieldName(new String[]{"科目编码","科目名称","主键"});
	setPkFieldCode("pk_cvpkmda");
	setRootName("科目档案");
	setTableName("cvp_kmda");
	setWherePart("zzjg='#'");
	setOrderPart("kmbm");
	setCodingRule("32322");

}
}
