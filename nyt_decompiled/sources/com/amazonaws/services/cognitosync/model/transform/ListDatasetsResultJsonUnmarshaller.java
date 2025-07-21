package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.ListDatasetsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

@Deprecated
/* loaded from: classes.dex */
public class ListDatasetsResultJsonUnmarshaller implements Unmarshaller<ListDatasetsResult, JsonUnmarshallerContext> {
    private static ListDatasetsResultJsonUnmarshaller instance;

    public static ListDatasetsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListDatasetsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListDatasetsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListDatasetsResult listDatasetsResult = new ListDatasetsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Datasets")) {
                listDatasetsResult.setDatasets(new ListUnmarshaller(DatasetJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Count")) {
                listDatasetsResult.setCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("NextToken")) {
                listDatasetsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listDatasetsResult;
    }
}
