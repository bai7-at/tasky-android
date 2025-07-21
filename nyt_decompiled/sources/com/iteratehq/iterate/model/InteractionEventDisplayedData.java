package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class InteractionEventDisplayedData implements InteractionEventData {
    private final InteractionEventSource source;
    private final Survey survey;

    public InteractionEventDisplayedData(InteractionEventSource interactionEventSource, Survey survey) {
        zq3.h(interactionEventSource, "source");
        zq3.h(survey, "survey");
        this.source = interactionEventSource;
        this.survey = survey;
    }

    public static /* synthetic */ InteractionEventDisplayedData copy$default(InteractionEventDisplayedData interactionEventDisplayedData, InteractionEventSource interactionEventSource, Survey survey, int i, Object obj) {
        if ((i & 1) != 0) {
            interactionEventSource = interactionEventDisplayedData.source;
        }
        if ((i & 2) != 0) {
            survey = interactionEventDisplayedData.survey;
        }
        return interactionEventDisplayedData.copy(interactionEventSource, survey);
    }

    public final InteractionEventSource component1() {
        return this.source;
    }

    public final Survey component2() {
        return this.survey;
    }

    public final InteractionEventDisplayedData copy(InteractionEventSource interactionEventSource, Survey survey) {
        zq3.h(interactionEventSource, "source");
        zq3.h(survey, "survey");
        return new InteractionEventDisplayedData(interactionEventSource, survey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionEventDisplayedData)) {
            return false;
        }
        InteractionEventDisplayedData interactionEventDisplayedData = (InteractionEventDisplayedData) obj;
        return this.source == interactionEventDisplayedData.source && zq3.c(this.survey, interactionEventDisplayedData.survey);
    }

    public final InteractionEventSource getSource() {
        return this.source;
    }

    public final Survey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.survey.hashCode();
    }

    public String toString() {
        return "InteractionEventDisplayedData(source=" + this.source + ", survey=" + this.survey + ')';
    }
}
