package nc.bs.cc.costreport;


/**
 * ��Ĺ��ܡ���;���ִ�BUG���Լ��������˿��ܸ���Ȥ�Ľ��ܡ�
 * ���ߣ�@author
 * @version ����޸�����
 * @see ��Ҫ�μ���������
 * @since �Ӳ�Ʒ����һ���汾�����౻��ӽ���������ѡ��
 * @deprecated����Ӳ�Ʒ����һ���汾���Ѿ����������滻������ѡ��
 */
public interface CCReport extends javax.ejb.EJBObject {

	nc.vo.cc.costreport.CCReportData[][] queryCostdata(nc.vo.cc.costreport.CCReportCondVO p0) throws java.rmi.RemoteException;

}