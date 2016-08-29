package nc.ui.cc.budgetanalyse;

public class CCBudgetAnalyseBO_Client extends nc.servlet.call.ServletCallBase {
private  static String beanName="nc.bs.cc.budgetanalyse.CCBudgetAnalyseBO";
public static nc.vo.cc.budgetanalyse.CCBudgetRTVO[][] queryBudgetAndAct(nc.vo.cc.budgetanalyse.CCBudgetQryCond p0) throws Exception{
	Object []params={p0};
  Class []paramTypes={nc.vo.cc.budgetanalyse.CCBudgetQryCond.class};
	long t = System.currentTimeMillis();
  Object result=remoteCall(beanName,"queryBudgetAndAct",paramTypes,params);
	t = System.currentTimeMillis() - t;
	System.out.println("执行方法:" + beanName + "::queryBudgetAndAct " + " 所消耗的时间为：" + t + " ms。");
 if(result == null)
	return null;
else
	return (nc.vo.cc.budgetanalyse.CCBudgetRTVO[][])result;
 } 
}