package nc.ui.cc.plan;

import nc.bs.cc.plan.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _PlanHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements PlanHome {
/**
 * _PlanHome_stub_ ������ע�⡣
 */
public _PlanHome_stub_() {
super();
}

public Plan create() throws javax.ejb.CreateException,java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_Plan_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (Plan) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}
