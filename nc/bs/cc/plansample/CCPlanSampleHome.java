package nc.bs.cc.plansample;


/**
 * 类的功能、用途、现存BUG，以及其它别人可能感兴趣的介绍。
 * 作者：@author
 * @version 最后修改日期
 * @see 需要参见的其它类
 * @since 从产品的那一个版本，此类被添加进来。（可选）
 * @deprecated该类从产品的那一个版本后，已经被其它类替换。（可选）
 */
public interface CCPlanSampleHome extends javax.ejb.EJBHome {

	CCPlanSample create() throws java.rmi.RemoteException;

}