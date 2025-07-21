package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.RegisterDeviceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
public class RegisterDeviceResultJsonUnmarshaller implements Unmarshaller<RegisterDeviceResult, JsonUnmarshallerContext> {
    private static RegisterDeviceResultJsonUnmarshaller instance;

    public static RegisterDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RegisterDeviceResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RegisterDeviceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        RegisterDeviceResult registerDeviceResult = new RegisterDeviceResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("DeviceId")) {
                registerDeviceResult.setDeviceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return registerDeviceResult;
    }
}
