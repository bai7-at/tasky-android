package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* loaded from: classes2.dex */
public class SetBucketVersioningConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private MultiFactorAuthentication mfa;
    private BucketVersioningConfiguration versioningConfiguration;

    public SetBucketVersioningConfigurationRequest(String str, BucketVersioningConfiguration bucketVersioningConfiguration) {
        this.bucketName = str;
        this.versioningConfiguration = bucketVersioningConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public MultiFactorAuthentication getMfa() {
        return this.mfa;
    }

    public BucketVersioningConfiguration getVersioningConfiguration() {
        return this.versioningConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setMfa(MultiFactorAuthentication multiFactorAuthentication) {
        this.mfa = multiFactorAuthentication;
    }

    public void setVersioningConfiguration(BucketVersioningConfiguration bucketVersioningConfiguration) {
        this.versioningConfiguration = bucketVersioningConfiguration;
    }

    public SetBucketVersioningConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketVersioningConfigurationRequest withMfa(MultiFactorAuthentication multiFactorAuthentication) {
        setMfa(multiFactorAuthentication);
        return this;
    }

    public SetBucketVersioningConfigurationRequest withVersioningConfiguration(BucketVersioningConfiguration bucketVersioningConfiguration) {
        setVersioningConfiguration(bucketVersioningConfiguration);
        return this;
    }

    public SetBucketVersioningConfigurationRequest(String str, BucketVersioningConfiguration bucketVersioningConfiguration, MultiFactorAuthentication multiFactorAuthentication) {
        this(str, bucketVersioningConfiguration);
        this.mfa = multiFactorAuthentication;
    }
}
