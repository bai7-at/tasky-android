package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.DescribeDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
public class DescribeDatasetResultJsonUnmarshaller implements Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> {
    private static DescribeDatasetResultJsonUnmarshaller instance;

    public static DescribeDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeDatasetResult describeDatasetResult = new DescribeDatasetResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Dataset")) {
                describeDatasetResult.setDataset(DatasetJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeDatasetResult;
    }
}
