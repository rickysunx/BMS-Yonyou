package nc.ui.cc.adjust;

/**
 * �˴���������˵����
 * �������ڣ�(2005-7-5 22:31:22)
 * @author������
 */
public class AdjustNumCellRenderer extends javax.swing.table.DefaultTableCellRenderer {
/**
 * AdjustNumCellRenderer ������ע�⡣
 */
public AdjustNumCellRenderer() {
	super();
}
public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	
		
	setValue(nc.vo.cc.pubs.NumFormate.getPrecisionData(value,2));
	return super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
}
}
