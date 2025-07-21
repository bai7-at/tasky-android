package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

@Deprecated
/* loaded from: classes.dex */
public class SubscribeToDatasetResultJsonUnmarshaller implements Unmarshaller<SubscribeToDatasetResult, JsonUnmarshallerContext> {
    private static SubscribeToDatasetResultJsonUnmarshaller instance;

    public static SubscribeToDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SubscribeToDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SubscribeToDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new SubscribeToDatasetResult();
    }
}
