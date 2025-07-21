package com.iteratehq.iterate.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public enum EmbedType {
    MOBILE("mobile");

    private final String value;

    EmbedType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
