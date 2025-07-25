package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.GetPublicKeyResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes2.dex */
public class GetPublicKeyResultJsonUnmarshaller implements Unmarshaller<GetPublicKeyResult, JsonUnmarshallerContext> {
    private static GetPublicKeyResultJsonUnmarshaller instance;

    public static GetPublicKeyResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetPublicKeyResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetPublicKeyResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetPublicKeyResult getPublicKeyResult = new GetPublicKeyResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("KeyId")) {
                getPublicKeyResult.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("PublicKey")) {
                getPublicKeyResult.setPublicKey(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("CustomerMasterKeySpec")) {
                getPublicKeyResult.setCustomerMasterKeySpec(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("KeySpec")) {
                getPublicKeyResult.setKeySpec(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("KeyUsage")) {
                getPublicKeyResult.setKeyUsage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EncryptionAlgorithms")) {
                getPublicKeyResult.setEncryptionAlgorithms(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("SigningAlgorithms")) {
                getPublicKeyResult.setSigningAlgorithms(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getPublicKeyResult;
    }
}
