package nc.ui.cc.plan;

import java.applet.*;
import java.awt.*;

/**
 * �˴���������˵����
 * �������ڣ�(2005-6-7 12:54:49)
 * @author������
 */
public class PlanApplet extends nc.ui.pub.MainApplet  {
/**
 * ���ع��ڴ�СӦ�ó������Ϣ��
 * @return ���ع��ڴ�СӦ�ó�����Ϣ���ַ�����
 */
public String getAppletInfo() {
	return "Applet\n" + 
		"\n" + 
		"�˴���������˵����\n" + 
		"�������ڣ�(05-5-19 11:50:41)\n" + 
		"@author������\n" + 
		"";
}
/**
 * ��ʼ��СӦ�ó���
 * 
 * @see #start
 * @see #stop
 * @see #destroy
 */
public void init() {

	setModule("nc.ui.cc.plan.PlanUI");

	super.init();

	// �ڴ˴�����������ʼ��СӦ�ó���Ĵ���
}
/**
 * ����СӦ�ó���
 * �����СӦ�ó�����Ҫ���ƣ����磬�����ֻ������ 
 * AWT ������һ��������������԰�ȫ�س�ȥ�˷�����
 * 
 * @param g ָ���ġ�ͼ�Ρ�����
 * @see #update
 */
public void paint(Graphics g) {
	super.paint(g);

	//�ڴ˴�������������СӦ�ó���Ĵ��롣
}
}