package nc.ui.cc.plansample;

import nc.bs.cc.plansample.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _CCPlanSampleHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements CCPlanSampleHome {
/**
 * _CCPlanSampleHome_stub_ ������ע�⡣
 */
public _CCPlanSampleHome_stub_() {
super();
}

public CCPlanSample create() throws java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_CCPlanSample_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (CCPlanSample) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}