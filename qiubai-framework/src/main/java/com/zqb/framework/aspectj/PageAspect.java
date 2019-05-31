package com.zqb.framework.aspectj;


import com.github.pagehelper.PageHelper;
import com.zqb.common.utils.StringUtils;
import com.zqb.framework.web.page.PageDomain;
import com.zqb.framework.web.page.TableSupport;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PageAspect {

    // 配置织入点
    @Pointcut(value = "@annotation(com.zqb.common.annotation.Page)")
    public void pagePointCut() {
    }

    /**
     * 前置通知 用于拦截操作
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "pagePointCut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("执行了吗？");
        startPage();

    }


    /**
     * 设置请求分页数据
     */
    protected void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = pageDomain.getOrderBy();
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }
}
