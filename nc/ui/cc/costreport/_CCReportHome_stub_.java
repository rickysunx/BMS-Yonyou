package nc.ui.cc.costreport;

import nc.bs.cc.costreport.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _CCReportHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements CCReportHome {
/**
 * _CCReportHome_stub_ ������ע�⡣
 */
public _CCReportHome_stub_() {
super();
}

public CCReport create() throws java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_CCReport_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (CCReport) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}