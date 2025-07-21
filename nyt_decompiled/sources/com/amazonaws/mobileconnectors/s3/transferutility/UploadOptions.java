package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import defpackage.ic5;

/* loaded from: classes.dex */
public final class UploadOptions {
    private final String bucket;
    private final CannedAccessControlList cannedAcl;
    private final TransferListener listener;
    private final ObjectMetadata metadata;

    public static final class Builder {
        private String bucket;
        private CannedAccessControlList cannedAcl;
        private TransferListener listener;
        private ObjectMetadata metadata;

        public Builder bucket(String str) {
            this.bucket = str;
            return this;
        }

        public UploadOptions build() {
            return new UploadOptions(this);
        }

        public Builder cannedAcl(CannedAccessControlList cannedAccessControlList) {
            this.cannedAcl = cannedAccessControlList;
            return this;
        }

        public Builder objectMetadata(ObjectMetadata objectMetadata) {
            this.metadata = objectMetadata;
            return this;
        }

        public Builder transferListener(TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }

        private Builder() {
        }
    }

    public UploadOptions(Builder builder) {
        this.bucket = builder.bucket;
        this.metadata = builder.metadata;
        this.cannedAcl = builder.cannedAcl;
        this.listener = builder.listener;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UploadOptions.class != obj.getClass()) {
            return false;
        }
        UploadOptions uploadOptions = (UploadOptions) obj;
        return ic5.a(this.bucket, uploadOptions.bucket) && ic5.a(this.metadata, uploadOptions.metadata) && this.cannedAcl == uploadOptions.cannedAcl && ic5.a(this.listener, uploadOptions.listener);
    }

    public String getBucket() {
        return this.bucket;
    }

    public CannedAccessControlList getCannedAcl() {
        return this.cannedAcl;
    }

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    public TransferListener getTransferListener() {
        return this.listener;
    }

    public int hashCode() {
        return ic5.b(this.bucket, this.metadata, this.cannedAcl, this.listener);
    }

    public String toString() {
        return "UploadOptions{bucket='" + this.bucket + "', metadata=" + this.metadata + ", cannedAcl=" + this.cannedAcl + ", listener=" + this.listener + '}';
    }
}
