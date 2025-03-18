package com.cachezheng.ai.springaimcpserver.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateTimeToolsService {
    @Tool(description = "获取用户所在时区的当前日期时间")
    String getCurrentDateTime() {
        return LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId()).toString();
    }
}
