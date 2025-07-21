package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.ListRecordsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
public class ListRecordsResultJsonUnmarshaller implements Unmarshaller<ListRecordsResult, JsonUnmarshallerContext> {
    private static ListRecordsResultJsonUnmarshaller instance;

    public static ListRecordsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListRecordsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListRecordsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListRecordsResult listRecordsResult = new ListRecordsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Records")) {
                listRecordsResult.setRecords(new ListUnmarshaller(RecordJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("NextToken")) {
                listRecordsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Count")) {
                listRecordsResult.setCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DatasetSyncCount")) {
                listRecordsResult.setDatasetSyncCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("LastModifiedBy")) {
                listRecordsResult.setLastModifiedBy(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("MergedDatasetNames")) {
                listRecordsResult.setMergedDatasetNames(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DatasetExists")) {
                listRecordsResult.setDatasetExists(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DatasetDeletedAfterRequestedSyncCount")) {
                listRecordsResult.setDatasetDeletedAfterRequestedSyncCount(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("SyncSessionToken")) {
                listRecordsResult.setSyncSessionToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listRecordsResult;
    }
}
