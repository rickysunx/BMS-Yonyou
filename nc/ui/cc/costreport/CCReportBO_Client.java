package nc.ui.cc.costreport;

public class CCReportBO_Client extends nc.servlet.call.ServletCallBase {
private  static String beanName="nc.bs.cc.costreport.CCReportBO";
public static nc.vo.cc.costreport.CCReportData[][] queryCostdata(nc.vo.cc.costreport.CCReportCondVO p0) throws Exception{
	Object []params={p0};
  Class []paramTypes={nc.vo.cc.costreport.CCReportCondVO.class};
	long t = System.currentTimeMillis();
  Object result=remoteCall(beanName,"queryCostdata",paramTypes,params);
	t = System.currentTimeMillis() - t;
	System.out.println("执行方法:" + beanName + "::queryCostdata " + " 所消耗的时间为：" + t + " ms。");
 if(result == null)
	return null;
else
	return (nc.vo.cc.costreport.CCReportData[][])result;
 } 
}