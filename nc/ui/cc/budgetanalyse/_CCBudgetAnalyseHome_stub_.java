package nc.ui.cc.budgetanalyse;

import nc.bs.cc.budgetanalyse.*;

/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public class _CCBudgetAnalyseHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements CCBudgetAnalyseHome {
/**
 * _CCBudgetAnalyseHome_stub_ ������ע�⡣
 */
public _CCBudgetAnalyseHome_stub_() {
super();
}

public CCBudgetAnalyse create() throws java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_CCBudgetAnalyse_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (CCBudgetAnalyse) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}