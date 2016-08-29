package nc.ui.cc.param;

import nc.vo.pub.lang.*;
import javax.swing.*;
import java.awt.*;

/**
 * 此处插入类型说明。
 * 创建日期：(2005-5-26 18:30:40)
 * @author：孙锐
 */
public class ParamTableCellRenderer extends javax.swing.table.DefaultTableCellRenderer {

/**
 * PATableCellRenderer 构造子注解。
 */
public ParamTableCellRenderer() {
	super();
}
// implements javax.swing.table.TableCellRenderer
public Component getTableCellRendererComponent(
	JTable table,
	Object value,
	boolean isSelected,
	boolean hasFocus,
	int row,
	int column) {

	super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);

	
	this.setHorizontalAlignment(JLabel.RIGHT);
	setValue(value);
	return this;
}
}