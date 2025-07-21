package com.amazonaws.services.s3.model.inventory;

import com.amazonaws.services.s3.Headers;

/* loaded from: classes2.dex */
public enum InventoryOptionalField {
    Size("Size"),
    LastModifiedDate("LastModifiedDate"),
    StorageClass("StorageClass"),
    ETag(Headers.ETAG),
    IsMultipartUploaded("IsMultipartUploaded"),
    ReplicationStatus("ReplicationStatus");

    private final String field;

    InventoryOptionalField(String str) {
        this.field = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.field;
    }
}
