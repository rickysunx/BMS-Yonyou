package nc.ui.cc.pub;


/**
 * �˴���������˵����
 * �������ڣ�(2002-10-21 21:49:29)
 * @���ߣ�������
 */
public class TimerHandler implements java.awt.event.ActionListener {
	private WaitDialog m_dlg = null;
	private int m_iTimes = 0;
/**
 * TimerHandler ������ע�⡣
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
	m_dlg.setTitle("����ʱ " + m_iTimes + " ��");
	m_dlg.repaint();
}
}