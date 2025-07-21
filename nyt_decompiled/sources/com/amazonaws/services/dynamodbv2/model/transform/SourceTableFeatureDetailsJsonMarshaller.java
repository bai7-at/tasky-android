package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexInfo;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndexInfo;
import com.amazonaws.services.dynamodbv2.model.SSEDescription;
import com.amazonaws.services.dynamodbv2.model.SourceTableFeatureDetails;
import com.amazonaws.services.dynamodbv2.model.StreamSpecification;
import com.amazonaws.services.dynamodbv2.model.TimeToLiveDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes2.dex */
class SourceTableFeatureDetailsJsonMarshaller {
    private static SourceTableFeatureDetailsJsonMarshaller instance;

    SourceTableFeatureDetailsJsonMarshaller() {
    }

    public static SourceTableFeatureDetailsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SourceTableFeatureDetailsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SourceTableFeatureDetails sourceTableFeatureDetails, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sourceTableFeatureDetails.getLocalSecondaryIndexes() != null) {
            List<LocalSecondaryIndexInfo> localSecondaryIndexes = sourceTableFeatureDetails.getLocalSecondaryIndexes();
            awsJsonWriter.name("LocalSecondaryIndexes");
            awsJsonWriter.beginArray();
            for (LocalSecondaryIndexInfo localSecondaryIndexInfo : localSecondaryIndexes) {
                if (localSecondaryIndexInfo != null) {
                    LocalSecondaryIndexInfoJsonMarshaller.getInstance().marshall(localSecondaryIndexInfo, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (sourceTableFeatureDetails.getGlobalSecondaryIndexes() != null) {
            List<GlobalSecondaryIndexInfo> globalSecondaryIndexes = sourceTableFeatureDetails.getGlobalSecondaryIndexes();
            awsJsonWriter.name("GlobalSecondaryIndexes");
            awsJsonWriter.beginArray();
            for (GlobalSecondaryIndexInfo globalSecondaryIndexInfo : globalSecondaryIndexes) {
                if (globalSecondaryIndexInfo != null) {
                    GlobalSecondaryIndexInfoJsonMarshaller.getInstance().marshall(globalSecondaryIndexInfo, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (sourceTableFeatureDetails.getStreamDescription() != null) {
            StreamSpecification streamDescription = sourceTableFeatureDetails.getStreamDescription();
            awsJsonWriter.name("StreamDescription");
            StreamSpecificationJsonMarshaller.getInstance().marshall(streamDescription, awsJsonWriter);
        }
        if (sourceTableFeatureDetails.getTimeToLiveDescription() != null) {
            TimeToLiveDescription timeToLiveDescription = sourceTableFeatureDetails.getTimeToLiveDescription();
            awsJsonWriter.name("TimeToLiveDescription");
            TimeToLiveDescriptionJsonMarshaller.getInstance().marshall(timeToLiveDescription, awsJsonWriter);
        }
        if (sourceTableFeatureDetails.getSSEDescription() != null) {
            SSEDescription sSEDescription = sourceTableFeatureDetails.getSSEDescription();
            awsJsonWriter.name("SSEDescription");
            SSEDescriptionJsonMarshaller.getInstance().marshall(sSEDescription, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
