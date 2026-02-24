package json.serializador_personalizado;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import json.JsonUtils;

import java.io.File;
import java.io.IOException;

//aula 515
public class SerializadorPersonalizado {
    public static void main(String[] args) throws IOException {
        Range range = new Range(1, 10);
        String json = JsonUtils.getInstance().toJson(range);
        System.out.println(json);
    }

    @JsonSerialize(using = RangeSerializer.class)
    private record Range (int min, int max){}

    private static class RangeSerializer extends StdSerializer<Range>{
        public RangeSerializer (){this(null);}

        protected RangeSerializer(Class<Range> t) {
            super(t);
        }

        @Override
        public void serialize(Range range, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            String rangeStr = String.format("%d..%d", range.min, range.max);
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("range", rangeStr);
            jsonGenerator.writeEndObject();
        }
    }
}
