package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.SSESpecification;
import com.amazonaws.services.dynamodbv2.model.StreamSpecification;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes2.dex */
public class CreateTableRequestMarshaller implements Marshaller<Request<CreateTableRequest>, CreateTableRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateTableRequest> marshall(CreateTableRequest createTableRequest) {
        if (createTableRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateTableRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createTableRequest, "AmazonDynamoDB");
        defaultRequest.addHeader("X-Amz-Target", "DynamoDB_20120810.CreateTable");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createTableRequest.getAttributeDefinitions() != null) {
                List<AttributeDefinition> attributeDefinitions = createTableRequest.getAttributeDefinitions();
                jsonWriter.name("AttributeDefinitions");
                jsonWriter.beginArray();
                for (AttributeDefinition attributeDefinition : attributeDefinitions) {
                    if (attributeDefinition != null) {
                        AttributeDefinitionJsonMarshaller.getInstance().marshall(attributeDefinition, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getTableName() != null) {
                String tableName = createTableRequest.getTableName();
                jsonWriter.name("TableName");
                jsonWriter.value(tableName);
            }
            if (createTableRequest.getKeySchema() != null) {
                List<KeySchemaElement> keySchema = createTableRequest.getKeySchema();
                jsonWriter.name("KeySchema");
                jsonWriter.beginArray();
                for (KeySchemaElement keySchemaElement : keySchema) {
                    if (keySchemaElement != null) {
                        KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaElement, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getLocalSecondaryIndexes() != null) {
                List<LocalSecondaryIndex> localSecondaryIndexes = createTableRequest.getLocalSecondaryIndexes();
                jsonWriter.name("LocalSecondaryIndexes");
                jsonWriter.beginArray();
                for (LocalSecondaryIndex localSecondaryIndex : localSecondaryIndexes) {
                    if (localSecondaryIndex != null) {
                        LocalSecondaryIndexJsonMarshaller.getInstance().marshall(localSecondaryIndex, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getGlobalSecondaryIndexes() != null) {
                List<GlobalSecondaryIndex> globalSecondaryIndexes = createTableRequest.getGlobalSecondaryIndexes();
                jsonWriter.name("GlobalSecondaryIndexes");
                jsonWriter.beginArray();
                for (GlobalSecondaryIndex globalSecondaryIndex : globalSecondaryIndexes) {
                    if (globalSecondaryIndex != null) {
                        GlobalSecondaryIndexJsonMarshaller.getInstance().marshall(globalSecondaryIndex, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getProvisionedThroughput() != null) {
                ProvisionedThroughput provisionedThroughput = createTableRequest.getProvisionedThroughput();
                jsonWriter.name("ProvisionedThroughput");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(provisionedThroughput, jsonWriter);
            }
            if (createTableRequest.getStreamSpecification() != null) {
                StreamSpecification streamSpecification = createTableRequest.getStreamSpecification();
                jsonWriter.name("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance().marshall(streamSpecification, jsonWriter);
            }
            if (createTableRequest.getSSESpecification() != null) {
                SSESpecification sSESpecification = createTableRequest.getSSESpecification();
                jsonWriter.name("SSESpecification");
                SSESpecificationJsonMarshaller.getInstance().marshall(sSESpecification, jsonWriter);
            }
            jsonWriter.endObject();
            jsonWriter.close();
            String stringWriter2 = stringWriter.toString();
            byte[] bytes = stringWriter2.getBytes(StringUtils.UTF8);
            defaultRequest.setContent(new StringInputStream(stringWriter2));
            defaultRequest.addHeader("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
                defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.0");
            }
            return defaultRequest;
        } catch (Throwable th) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
        }
    }
}
