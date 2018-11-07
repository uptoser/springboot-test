package me.ibeyond.springboottest.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandRunner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(MyCommandRunner.class);
    @Value("${spring.web.url}")
    private String url;
    @Value("${spring.web.excute}")
    private String excutePath;
    @Value("${spring.auto.openurl}")
    private boolean isOpen;

    @Override
    public void run(String... args){
        if (isOpen) {
            String cmd = excutePath + " " + url;
            Runtime run = Runtime.getRuntime();
            try {
                run.exec(cmd);
                logger.debug("启动浏览器打开项目成功");
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
}

