package nc.ui.cc.param;

import nc.vo.pub.lang.*;
import javax.swing.*;
import java.awt.*;

/**
 * �˴���������˵����
 * �������ڣ�(2005-5-26 18:30:40)
 * @author������
 */
public class ParamTableCellRenderer extends javax.swing.table.DefaultTableCellRenderer {

/**
 * PATableCellRenderer ������ע�⡣
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