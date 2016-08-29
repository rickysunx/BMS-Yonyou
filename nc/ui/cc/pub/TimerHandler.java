package nc.ui.cc.pub;


/**
 * 此处插入类型说明。
 * 创建日期：(2002-10-21 21:49:29)
 * @作者：汤安清
 */
public class TimerHandler implements java.awt.event.ActionListener {
	private WaitDialog m_dlg = null;
	private int m_iTimes = 0;
/**
 * TimerHandler 构造子注解。
 */
public TimerHandler(WaitDialog dlg) {
	super();
	m_dlg = dlg;
}
/**
 * Invoked when an action occurs.
 */
public void actionPerformed(java.awt.event.ActionEvent e) {
	m_iTimes++;
	m_dlg.setTitle("已用时 " + m_iTimes + " 秒");
	m_dlg.repaint();
}
}