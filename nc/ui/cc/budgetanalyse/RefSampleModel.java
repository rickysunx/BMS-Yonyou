package nc.ui.cc.budgetanalyse;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-30 15:55:03)
 * @author：张春明
 */
public class RefSampleModel extends nc.ui.bd.ref.DefaultRefModel {
/**
 * RefSampleModel 构造子注解。
 */
public RefSampleModel() {
	super();
	initSth();
}
/**
 * RefSampleModel 构造子注解。
 * @param refNodeName java.lang.String
 */
public RefSampleModel(String refNodeName) {
	super(refNodeName);
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-30 15:56:02)
 */
public void initSth() 
{
	setRefTitle("计划样表");
	setFieldCode(new String[]{"samplecode","samplename","pk_sample"});
	
	setFieldName(new String[]{"样表编码","样表名称","主键"});
	setPkFieldCode("pk_sample");
	//setRootName("指标档案");
	setTableName("cc_sample");
	setOrderPart("samplecode");	
}
}
