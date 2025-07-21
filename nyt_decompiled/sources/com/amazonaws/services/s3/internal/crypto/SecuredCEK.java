package com.amazonaws.services.s3.internal.crypto;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

@Deprecated
/* loaded from: classes2.dex */
class SecuredCEK {
    private final byte[] encrypted;
    private final String keyWrapAlgorithm;
    private final Map<String, String> matdesc;

    SecuredCEK(byte[] bArr, String str, Map<String, String> map) {
        this.encrypted = bArr;
        this.keyWrapAlgorithm = str;
        this.matdesc = Collections.unmodifiableMap(new TreeMap(map));
    }

    byte[] getEncrypted() {
        return this.encrypted;
    }

    String getKeyWrapAlgorithm() {
        return this.keyWrapAlgorithm;
    }

    Map<String, String> getMaterialDescription() {
        return this.matdesc;
    }
}
