package nc.bs.cc.budgetanalyse;


/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public interface CCBudgetAnalyse extends javax.ejb.EJBObject {

	nc.vo.cc.budgetanalyse.CCBudgetRTVO[][] queryBudgetAndAct(nc.vo.cc.budgetanalyse.CCBudgetQryCond p0) throws java.rmi.RemoteException;

}