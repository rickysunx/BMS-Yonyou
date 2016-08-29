package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-27 12:55:34)
 * @author：孙锐
 */
public class PlanRefModel extends nc.ui.bd.ref.DefaultRefModel {
	
/**
 * PlanRefModel 构造子注解。
 */
public PlanRefModel() {
	super();
	setTableName("cc_plan");
	setFieldCode(new String[] { "plancode", "planname"});
	setFieldName(new String[] { "计划编码", "计划名称" });
	setRefTitle("计划参照");
	setPkFieldCode("pk_plan");
	setStrPatch("distinct");
	//setWherePart(" plancode in (select distinct plancode from cc_plan) ");
}
/**
 * PlanRefModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public PlanRefModel(String refNodeName) {
	super(refNodeName);
}
}
