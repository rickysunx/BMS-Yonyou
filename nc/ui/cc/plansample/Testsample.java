package nc.ui.cc.plansample;

/**
 * �˴���������˵����
 * �������ڣ�(2004-12-9 22:20:25)
 * @author���Ŵ���
 */
public class Testsample extends nc.ui.pub.MainApplet {
/**
 * ���ع��ڴ�СӦ�ó������Ϣ��
 * @return ���ع��ڴ�СӦ�ó�����Ϣ���ַ�����
 */
public String getAppletInfo() {
	return "Applet\n" + 
		"\n" + 
		"�˴���������˵����\n" + 
		"�������ڣ�(2004-12-12 11:31:20)\n" + 
		"@author���Ŵ���\n" + 
		"";
}
/**
 * ��ʼ��СӦ�ó���
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
 * ����СӦ�ó���
 * �����СӦ�ó�����Ҫ���ƣ����磬�����ֻ������ 
 * AWT ������һ��������������԰�ȫ�س�ȥ�˷�����
 * 
 * @param g ָ���ġ�ͼ�Ρ�����
 * @see #update
 */
public void paint(java.awt.Graphics g) {
	super.paint(g);

	//�ڴ˴�������������СӦ�ó���Ĵ��롣
}
}
