package nc.ui.cc.base;

import nc.vo.cc.base.*;
import nc.ui.pub.beans.*;
/**
 * 此处插入类型说明。
 * 创建日期：(2005-6-7 15:36:09)
 * @author：孙锐
 */
public abstract class TreeMainRow {
/**
 * TreeMainRow 构造子注解。
 */
public TreeMainRow() {
	super();
}
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-7 15:51:49)
 * @return nc.ui.pub.beans.UIPanel
 * @exception java.lang.Exception 异常说明。
 */
public abstract IRowShowable getUIPanel();
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-9 16:43:46)
 */
public abstract void resetData();
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-7 15:57:09)
 * @exception java.lang.Exception 异常说明。
 */
public abstract void save() throws java.lang.Exception;
/**
 * 此处插入方法说明。
 * 创建日期：(2005-6-7 17:36:21)
 * @param bEnabled boolean
 */
public void setEditable(boolean bEnabled) {
	getUIPanel().setEditabled(bEnabled);
}
}
