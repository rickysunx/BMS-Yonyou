package nc.ui.cc.param;

import nc.bs.cc.param.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _ParamHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements ParamHome {
/**
 * _ParamHome_stub_ ������ע�⡣
 */
public _ParamHome_stub_() {
super();
}

public Param create() throws javax.ejb.CreateException,java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_Param_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (Param) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}