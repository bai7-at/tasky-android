package com.iteratehq.iterate.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public enum EventMessageTypes {
    CLOSE("close"),
    PROGRESS("progress"),
    RESPONSE("response"),
    SURVEY_COMPLETE("survey-complete");

    private final String value;

    EventMessageTypes(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
