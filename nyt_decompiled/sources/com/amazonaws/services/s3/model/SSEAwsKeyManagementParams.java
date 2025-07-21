package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class SSEAwsKeyManagementParams implements Serializable {
    private final String awsKmsKeyId;

    public SSEAwsKeyManagementParams() {
        this.awsKmsKeyId = null;
    }

    public String getAwsKmsKeyId() {
        return this.awsKmsKeyId;
    }

    public String getEncryption() {
        return SSEAlgorithm.KMS.getAlgorithm();
    }

    public SSEAwsKeyManagementParams(String str) {
        if (str != null && !str.trim().isEmpty()) {
            this.awsKmsKeyId = str;
            return;
        }
        throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
    }
}
