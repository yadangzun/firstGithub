package com.adam.util;

import com.ly.tcbase.config.ConfigCenterClient;
import org.apache.commons.lang3.StringUtils;

/**
 * 统一配置获取
 *
 * @author
 */
public class ConfigCenterUtil {

    public static String get(String key, String defaultValue) {
        String value = "";
        try {
            value = ConfigCenterClient.get(key);
            if (StringUtils.isBlank(value)) {
                value = defaultValue;
            }
        } catch (Exception e) {
            value = defaultValue;
            //LoggerUtil.errorLog("TEConfigUitl", "TEConfigUitl", "ConfigCenterClient.get", "获取统一配置异常", e);
        }
        return value;
    }

    public static String get(String projectName,String key, String defaultValue) {
        String value = "";
        try {
            value = ConfigCenterClient.get(projectName,key);
            if (StringUtils.isBlank(value)) {
                value = defaultValue;
            }
        } catch (Exception e) {
            value = defaultValue;
            //LoggerUtil.errorLog("TEConfigUitl", "TEConfigUitl", "ConfigCenterClient.get", "获取统一配置异常", e);
        }
        return value;
    }
}