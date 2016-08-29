package nc.ui.cc.base;

import nc.vo.cc.base.*;
import nc.ui.pub.beans.*;
/**
 * �˴���������˵����
 * �������ڣ�(2005-6-7 15:36:09)
 * @author������
 */
public abstract class TreeMainRow {
/**
 * TreeMainRow ������ע�⡣
 */
public TreeMainRow() {
	super();
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-7 15:51:49)
 * @return nc.ui.pub.beans.UIPanel
 * @exception java.lang.Exception �쳣˵����
 */
public abstract IRowShowable getUIPanel();
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-9 16:43:46)
 */
public abstract void resetData();
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-7 15:57:09)
 * @exception java.lang.Exception �쳣˵����
 */
public abstract void save() throws java.lang.Exception;
/**
 * �˴����뷽��˵����
 * �������ڣ�(2005-6-7 17:36:21)
 * @param bEnabled boolean
 */
public void setEditable(boolean bEnabled) {
	getUIPanel().setEditabled(bEnabled);
}
}
