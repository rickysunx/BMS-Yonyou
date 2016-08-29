package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-27 14:40:12)
 * @author：孙锐
 */
public class SampleItemRefModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * SampleItemRefModel 构造子注解。
 */
public SampleItemRefModel() {
	super();
	setTableName("cc_sample_item");
	setFieldCode(new String[] { "itemcode", "itemname","pk_item"});
	setFieldName(new String[] { "计划编码", "计划名称" });
	setRefTitle("计划参照");
	setPkFieldCode("pk_item");
	setWherePart("1<>1");
}
/**
 * SampleItemRefModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public SampleItemRefModel(String refNodeName) {
	super(refNodeName);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-27 14:42:27)
 * @param code java.lang.String
 */
public void setPlanCode(String code) {
	setWherePart(" fk_sample in (select fk_sample from cc_plan where plancode = '" + code + "')");	
}
}
