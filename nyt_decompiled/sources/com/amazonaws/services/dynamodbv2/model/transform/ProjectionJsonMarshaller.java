package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes2.dex */
class ProjectionJsonMarshaller {
    private static ProjectionJsonMarshaller instance;

    ProjectionJsonMarshaller() {
    }

    public static ProjectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Projection projection, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (projection.getProjectionType() != null) {
            String projectionType = projection.getProjectionType();
            awsJsonWriter.name("ProjectionType");
            awsJsonWriter.value(projectionType);
        }
        if (projection.getNonKeyAttributes() != null) {
            List<String> nonKeyAttributes = projection.getNonKeyAttributes();
            awsJsonWriter.name("NonKeyAttributes");
            awsJsonWriter.beginArray();
            for (String str : nonKeyAttributes) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
