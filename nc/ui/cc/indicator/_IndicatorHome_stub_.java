package nc.ui.cc.indicator;

import nc.bs.cc.indicator.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _IndicatorHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements IndicatorHome {
/**
 * _IndicatorHome_stub_ ������ע�⡣
 */
public _IndicatorHome_stub_() {
super();
}

public Indicator create() throws javax.ejb.CreateException,java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_Indicator_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (Indicator) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}