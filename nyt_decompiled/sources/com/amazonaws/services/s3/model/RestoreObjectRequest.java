package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* loaded from: classes2.dex */
public class RestoreObjectRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private int expirationInDays;
    private boolean isRequesterPays;
    private String key;
    private String versionId;

    public RestoreObjectRequest(String str, String str2) {
        this(str, str2, -1);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public int getExpirationInDays() {
        return this.expirationInDays;
    }

    public String getKey() {
        return this.key;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public boolean isRequesterPays() {
        return this.isRequesterPays;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setExpirationInDays(int i) {
        this.expirationInDays = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setRequesterPays(boolean z) {
        this.isRequesterPays = z;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    public RestoreObjectRequest withBucketName(String str) {
        this.bucketName = str;
        return this;
    }

    public RestoreObjectRequest withExpirationInDays(int i) {
        this.expirationInDays = i;
        return this;
    }

    public RestoreObjectRequest withKey(String str) {
        this.key = str;
        return this;
    }

    public RestoreObjectRequest withRequesterPays(boolean z) {
        setRequesterPays(z);
        return this;
    }

    public RestoreObjectRequest withVersionId(String str) {
        this.versionId = str;
        return this;
    }

    public RestoreObjectRequest(String str, String str2, int i) {
        this.bucketName = str;
        this.key = str2;
        this.expirationInDays = i;
    }
}
