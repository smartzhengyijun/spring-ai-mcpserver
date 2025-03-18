package com.cachezheng.ai.springaimcpserver;

import com.cachezheng.ai.springaimcpserver.service.DateTimeToolsService;
import com.cachezheng.ai.springaimcpserver.service.WeatherToolsService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAiMcpserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiMcpserverApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider weatherTools(WeatherToolsService weatherToolsService) {
        return MethodToolCallbackProvider.builder().toolObjects(weatherToolsService).build();
    }

    @Bean
    public ToolCallbackProvider timeTools(DateTimeToolsService dateTimeToolsService) {
        return MethodToolCallbackProvider.builder().toolObjects(dateTimeToolsService).build();
    }
}
