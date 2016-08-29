package nc.ui.cc.base;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-27 22:51:28)
 * @author：孙锐
 */
public class NumbericCellEditor extends javax.swing.DefaultCellEditor {
/**
 * NumbericCellEditor 构造子注解。
 * @param checkBox javax.swing.JCheckBox
 */
public NumbericCellEditor(javax.swing.JCheckBox checkBox) {
	super(checkBox);
}
/**
 * NumbericCellEditor 构造子注解。
 * @param comboBox javax.swing.JComboBox
 */
public NumbericCellEditor(javax.swing.JComboBox comboBox) {
	super(comboBox);
}
/**
 * NumbericCellEditor 构造子注解。
 * @param textField javax.swing.JTextField
 */
public NumbericCellEditor(javax.swing.JTextField textField) {
	super(textField);
}
}
