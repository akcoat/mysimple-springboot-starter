package com.zhu.startdemo1.service;


import org.springframework.util.StringUtils;

public class start {


        private String config;

        public start(String config) {
            this.config = config;
        }

        public String[] split(String separatorChar) {
            return StringUtils.split(this.config, separatorChar);
        }



}
