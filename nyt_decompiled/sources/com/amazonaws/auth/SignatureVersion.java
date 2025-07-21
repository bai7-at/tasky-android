package com.amazonaws.auth;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes.dex */
public enum SignatureVersion {
    V1(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE),
    V2("2");

    private String value;

    SignatureVersion(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
