package nc.ui.cc.param;

import nc.bs.cc.param.*;

/**
 * 类的功能、用途、现存BUG，以及其它别人可能感兴趣的介绍。
 * 作者：@author
 * @version 最后修改日期
 * @see 需要参见的其它类
 * @since 从产品的那一个版本，此类被添加进来。（可选）
 * @deprecated该类从产品的那一个版本后，已经被其它类替换。（可选）
 */
public class _ParamMHome_stub_ extends nc.bs.mw.naming.RemoteHomeBase implements ParamMHome {
/**
 * _ParamMHome_stub_ 构造子注解。
 */
public _ParamMHome_stub_() {
super();
}

public ParamM create() throws javax.ejb.CreateException,java.rmi.RemoteException{
	try {
		nc.bs.mw.naming.RemoteBeanBase t = (nc.bs.mw.naming.RemoteBeanBase) remoteCall(_ParamM_Method_Const_Local_.HOME_create, null); 
		t.setEJBHome(this);
		return (ParamM) t;
	} catch (Exception e) {
		throw new java.rmi.RemoteException("create", e);
	}
}
}