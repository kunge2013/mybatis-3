package org.apache.ibatis.submitted.annotion_many_one_add_columnprefix;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Method;

/**
 * @author fangkun
 * @version 1.0
 * @date 2021/1/22 5:22 下午
 * @href <href>https://kunge2013.github.io</href>
 * @description:
 */
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})})
public class QueryInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        System.out.println("======= QueryInterceptor ======== interfacet ======");
        return invocation.proceed();
    }
}
