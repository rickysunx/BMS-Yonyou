package nc.ui.cc.sample;

import nc.bs.cc.sample.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _SampleHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements SampleHome {
/**
 * _SampleHome_stub_ ������ע�⡣
 */
public _SampleHome_stub_() {
super();
}

public Sample create() throws javax.ejb.CreateException,java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_Sample_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (Sample) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}