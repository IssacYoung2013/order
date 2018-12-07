package com.issac.order.server.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * author:  ywy
 * date:  2018-09-11
 * desc:
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object fromJson(String string, Class classType) {
        try {
            return objectMapper.readValue(string,classType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object fromJson(String string, TypeReference typeReference) {
        try {
            return objectMapper.readValue(string,typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}