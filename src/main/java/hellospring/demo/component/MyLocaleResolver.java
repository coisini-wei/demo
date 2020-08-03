package hellospring.demo.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 配置自己的区域信息类
 */
public class MyLocaleResolver implements LocaleResolver {

    /**
     * 这个方法，我们用来设置自己区域信息加载
     * @param request
     * @return
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 默认Locale  为系统默认的
        Locale locale = Locale.getDefault();
        // 获取请求头中参数l的值，结果肯定是en_US 或者 zh_CN
        String l = request.getParameter("l");

        // 如果获取到区域信息，就将区域信息设置为，获取到的
        if(!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            locale = new Locale(split[0],split[1]);

        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
