package com.iteratehq.iterate.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public enum Frequency {
    ALWAYS("always");

    private final String value;

    Frequency(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
