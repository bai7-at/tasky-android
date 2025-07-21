package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class InteractionEventSurveyCompleteData implements InteractionEventData {
    private final Survey survey;

    public InteractionEventSurveyCompleteData(Survey survey) {
        zq3.h(survey, "survey");
        this.survey = survey;
    }

    public static /* synthetic */ InteractionEventSurveyCompleteData copy$default(InteractionEventSurveyCompleteData interactionEventSurveyCompleteData, Survey survey, int i, Object obj) {
        if ((i & 1) != 0) {
            survey = interactionEventSurveyCompleteData.survey;
        }
        return interactionEventSurveyCompleteData.copy(survey);
    }

    public final Survey component1() {
        return this.survey;
    }

    public final InteractionEventSurveyCompleteData copy(Survey survey) {
        zq3.h(survey, "survey");
        return new InteractionEventSurveyCompleteData(survey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InteractionEventSurveyCompleteData) && zq3.c(this.survey, ((InteractionEventSurveyCompleteData) obj).survey);
    }

    public final Survey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return this.survey.hashCode();
    }

    public String toString() {
        return "InteractionEventSurveyCompleteData(survey=" + this.survey + ')';
    }
}
