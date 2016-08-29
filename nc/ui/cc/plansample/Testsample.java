package nc.ui.cc.plansample;

/**
 * 此处插入类型说明。
 * 创建日期：(2004-12-9 22:20:25)
 * @author：张春明
 */
public class Testsample extends nc.ui.pub.MainApplet {
/**
 * 返回关于此小应用程序的信息。
 * @return 返回关于此小应用程序信息的字符串。
 */
public String getAppletInfo() {
	return "Applet\n" + 
		"\n" + 
		"此处插入类型说明。\n" + 
		"创建日期：(2004-12-12 11:31:20)\n" + 
		"@author：张春明\n" + 
		"";
}
/**
 * 初始化小应用程序。
 * 
 * @see #start
 * @see #stop
 * @see #destroy
 */
public void init() 
{
	setModule("nc.ui.cc.plansample.PlanSampleUI");
	super.init();
}
/**
 * 绘制小应用程序。
 * 如果此小应用程序不需要绘制（例如，如果它只是其他 
 * AWT 部件的一个容器），则可以安全地除去此方法。
 * 
 * @param g 指定的“图形”窗口
 * @see #update
 */
public void paint(java.awt.Graphics g) {
	super.paint(g);

	//在此处插入用来绘制小应用程序的代码。
}
}
