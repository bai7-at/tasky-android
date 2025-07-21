package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class TargetingContext {
    private final Frequency frequency;

    @SerializedName("survey_id")
    private final String surveyId;

    public TargetingContext(Frequency frequency, String str) {
        this.frequency = frequency;
        this.surveyId = str;
    }

    public static /* synthetic */ TargetingContext copy$default(TargetingContext targetingContext, Frequency frequency, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            frequency = targetingContext.frequency;
        }
        if ((i & 2) != 0) {
            str = targetingContext.surveyId;
        }
        return targetingContext.copy(frequency, str);
    }

    public final Frequency component1() {
        return this.frequency;
    }

    public final String component2() {
        return this.surveyId;
    }

    public final TargetingContext copy(Frequency frequency, String str) {
        return new TargetingContext(frequency, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetingContext)) {
            return false;
        }
        TargetingContext targetingContext = (TargetingContext) obj;
        return this.frequency == targetingContext.frequency && zq3.c(this.surveyId, targetingContext.surveyId);
    }

    public final Frequency getFrequency() {
        return this.frequency;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        Frequency frequency = this.frequency;
        int hashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
        String str = this.surveyId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TargetingContext(frequency=" + this.frequency + ", surveyId=" + this.surveyId + ')';
    }
}
