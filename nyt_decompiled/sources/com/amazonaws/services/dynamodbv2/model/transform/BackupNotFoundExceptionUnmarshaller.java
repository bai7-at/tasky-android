package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.dynamodbv2.model.BackupNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes2.dex */
public class BackupNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public BackupNotFoundExceptionUnmarshaller() {
        super(BackupNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("BackupNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        BackupNotFoundException backupNotFoundException = (BackupNotFoundException) super.unmarshall(jsonErrorResponse);
        backupNotFoundException.setErrorCode("BackupNotFoundException");
        return backupNotFoundException;
    }
}
