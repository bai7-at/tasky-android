package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

@Deprecated
/* loaded from: classes.dex */
public class UnsubscribeFromDatasetResultJsonUnmarshaller implements Unmarshaller<UnsubscribeFromDatasetResult, JsonUnmarshallerContext> {
    private static UnsubscribeFromDatasetResultJsonUnmarshaller instance;

    public static UnsubscribeFromDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnsubscribeFromDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnsubscribeFromDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new UnsubscribeFromDatasetResult();
    }
}
