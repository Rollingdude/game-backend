package com.mygame.game.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.lang.reflect.Type;

@Slf4j
public class JsonStringSerializer implements ObjectSerializer {
    private static final String JSON_ARRAY_IDENTIFIER = "[";
    private static final String JSON_OBJECT_IDENTIFIER = "{";

    @Override
    public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) throws IOException {
        final String value = String.valueOf(o);
        if (log.isDebugEnabled()) {
            log.debug("JsonStringSerializer serializing value:{}", value);
        }
        if (value.startsWith(JSON_ARRAY_IDENTIFIER)) {
            jsonSerializer.write(JSON.parseArray(value));
        } else if (value.startsWith(JSON_OBJECT_IDENTIFIER)) {
            jsonSerializer.write(JSON.parseObject(value));
        }
    }
}
