package com.iteratehq.iterate.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public enum InteractionEventSource {
    PROMPT("prompt"),
    SURVEY("survey");

    private final String value;

    InteractionEventSource(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
