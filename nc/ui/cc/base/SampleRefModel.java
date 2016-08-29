package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-15 9:14:01)
 * @author：孙锐
 */
public class SampleRefModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * SampleRefModel 构造子注解。
 */
public SampleRefModel() {
	super();
	setTableName("cc_sample");
	setFieldCode(new String[] { "samplecode", "samplename","pk_sample"});
	setFieldName(new String[] { "计划样表编码", "计划样表名称","主键" });
	setRefTitle("计划样表参照");
	setPkFieldCode("pk_sample");
}
/**
 * SampleRefModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public SampleRefModel(String refNodeName) {
	super(refNodeName);
}
}
