package com.cachezheng.ai.springaimcpserver.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class WeatherToolsService {
    @Tool(description = "获取给定城市当前天气")
    String getCurrentWeather() {
        return "今天天气多云转晴";
    }
}
