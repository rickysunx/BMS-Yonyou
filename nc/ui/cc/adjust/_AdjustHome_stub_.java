package nc.ui.cc.adjust;

import nc.bs.cc.adjust.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _AdjustHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements AdjustHome {
/**
 * _AdjustHome_stub_ ������ע�⡣
 */
public _AdjustHome_stub_() {
super();
}

public Adjust create() throws javax.ejb.CreateException,java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_Adjust_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (Adjust) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}
