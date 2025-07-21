package com.iteratehq.iterate.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public enum InteractionEventTypes {
    DISMISS("dismiss"),
    DISPLAYED("displayed"),
    RESPONSE("response"),
    SURVEY_COMPLETE("survey-complete");

    private final String value;

    InteractionEventTypes(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
