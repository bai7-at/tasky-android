package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class DescribeTimeToLiveResultJsonUnmarshaller implements Unmarshaller<DescribeTimeToLiveResult, JsonUnmarshallerContext> {
    private static DescribeTimeToLiveResultJsonUnmarshaller instance;

    public static DescribeTimeToLiveResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeTimeToLiveResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeTimeToLiveResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeTimeToLiveResult describeTimeToLiveResult = new DescribeTimeToLiveResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("TimeToLiveDescription")) {
                describeTimeToLiveResult.setTimeToLiveDescription(TimeToLiveDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeTimeToLiveResult;
    }
}
