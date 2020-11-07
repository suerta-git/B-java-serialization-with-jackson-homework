package com.thoughtworks.capability.gtb.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class NullAgeSerializer extends StdSerializer<Integer> {
    public NullAgeSerializer() {
        this(null);
    }

    public NullAgeSerializer(Class<Integer> t) {
        super(t);
    }

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (value == null) {
            gen.writeNumber(0);
        } else {
            gen.writeNumber(value);
        }
    }
}
