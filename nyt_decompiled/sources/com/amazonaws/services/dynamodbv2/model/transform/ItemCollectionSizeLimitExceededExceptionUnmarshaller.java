package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.ItemCollectionSizeLimitExceededException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class ItemCollectionSizeLimitExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ItemCollectionSizeLimitExceededExceptionUnmarshaller() {
        super(ItemCollectionSizeLimitExceededException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ItemCollectionSizeLimitExceededException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ItemCollectionSizeLimitExceededException itemCollectionSizeLimitExceededException = (ItemCollectionSizeLimitExceededException) super.unmarshall(jsonErrorResponse);
        itemCollectionSizeLimitExceededException.setErrorCode("ItemCollectionSizeLimitExceededException");
        return itemCollectionSizeLimitExceededException;
    }
}
