package com.iteratehq.iterate.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public enum TriggerType {
    EXIT("exit"),
    SCROLL("scroll"),
    SECONDS("seconds");

    private final String value;

    TriggerType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
