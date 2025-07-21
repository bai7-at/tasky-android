package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.DeleteDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
public class DeleteDatasetResultJsonUnmarshaller implements Unmarshaller<DeleteDatasetResult, JsonUnmarshallerContext> {
    private static DeleteDatasetResultJsonUnmarshaller instance;

    public static DeleteDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DeleteDatasetResult deleteDatasetResult = new DeleteDatasetResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Dataset")) {
                deleteDatasetResult.setDataset(DatasetJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deleteDatasetResult;
    }
}
