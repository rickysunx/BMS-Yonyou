package nc.ui.cc.base;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-27 22:51:28)
 * @author������
 */
public class NumbericCellEditor extends javax.swing.DefaultCellEditor {
/**
 * NumbericCellEditor ������ע�⡣
 * @param checkBox javax.swing.JCheckBox
 */
public NumbericCellEditor(javax.swing.JCheckBox checkBox) {
	super(checkBox);
}
/**
 * NumbericCellEditor ������ע�⡣
 * @param comboBox javax.swing.JComboBox
 */
public NumbericCellEditor(javax.swing.JComboBox comboBox) {
	super(comboBox);
}
/**
 * NumbericCellEditor ������ע�⡣
 * @param textField javax.swing.JTextField
 */
public NumbericCellEditor(javax.swing.JTextField textField) {
	super(textField);
}
}
