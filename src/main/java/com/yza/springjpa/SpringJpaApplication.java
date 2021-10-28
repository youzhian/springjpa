package com.yza.springjpa;

import com.yza.springjpa.commom.enums.ActiveEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringJpaApplication.class);
        String active = null;
        if(args != null && args.length>0){
            active = args[0];
        }
        if(ActiveEnum.isActive(active)) {
            System.setProperty("spring.profiles.active",active);
            //app.setAdditionalProfiles(active);
        }
        app.run(args);
        //SpringApplication.run(SpringJpaApplication.class, args);
        System.out.println("=============spring boot + jpa启动成功==============");
    }

}
