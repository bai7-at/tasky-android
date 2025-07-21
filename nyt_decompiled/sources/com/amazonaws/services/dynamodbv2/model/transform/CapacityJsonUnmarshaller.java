package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Capacity;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
class CapacityJsonUnmarshaller implements Unmarshaller<Capacity, JsonUnmarshallerContext> {
    private static CapacityJsonUnmarshaller instance;

    CapacityJsonUnmarshaller() {
    }

    public static CapacityJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CapacityJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Capacity unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Capacity capacity = new Capacity();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("CapacityUnits")) {
                capacity.setCapacityUnits(SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return capacity;
    }
}
