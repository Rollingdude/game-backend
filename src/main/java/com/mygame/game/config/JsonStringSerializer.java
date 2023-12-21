package com.mygame.game.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.Objects;

@Slf4j
public class JsonStringSerializer implements ObjectSerializer {
    private static final String JSON_ARRAY_IDENTIFIER = "[";
    private static final String JSON_OBJECT_IDENTIFIER = "{";

    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) {
        final String value = String.valueOf(object);
        if (Objects.isNull(value)||StringUtils.isBlank(value)) {
            serializer.write("");
        }
        if (log.isInfoEnabled()) {
            log.info("JsonStringSerializer serializing value:{}", value);
        }
        if (value.startsWith(JSON_ARRAY_IDENTIFIER)) {
            serializer.write(JSON.parseArray(value));
        } else if (value.startsWith(JSON_OBJECT_IDENTIFIER)) {
            serializer.write(JSON.parseObject(value));
        }
    }
}
