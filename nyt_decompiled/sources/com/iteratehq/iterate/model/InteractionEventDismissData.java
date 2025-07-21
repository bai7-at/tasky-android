package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class InteractionEventDismissData implements InteractionEventData {
    private final ProgressEventMessageData progress;
    private final InteractionEventSource source;
    private final Survey survey;

    public InteractionEventDismissData(ProgressEventMessageData progressEventMessageData, InteractionEventSource interactionEventSource, Survey survey) {
        zq3.h(interactionEventSource, "source");
        zq3.h(survey, "survey");
        this.progress = progressEventMessageData;
        this.source = interactionEventSource;
        this.survey = survey;
    }

    public static /* synthetic */ InteractionEventDismissData copy$default(InteractionEventDismissData interactionEventDismissData, ProgressEventMessageData progressEventMessageData, InteractionEventSource interactionEventSource, Survey survey, int i, Object obj) {
        if ((i & 1) != 0) {
            progressEventMessageData = interactionEventDismissData.progress;
        }
        if ((i & 2) != 0) {
            interactionEventSource = interactionEventDismissData.source;
        }
        if ((i & 4) != 0) {
            survey = interactionEventDismissData.survey;
        }
        return interactionEventDismissData.copy(progressEventMessageData, interactionEventSource, survey);
    }

    public final ProgressEventMessageData component1() {
        return this.progress;
    }

    public final InteractionEventSource component2() {
        return this.source;
    }

    public final Survey component3() {
        return this.survey;
    }

    public final InteractionEventDismissData copy(ProgressEventMessageData progressEventMessageData, InteractionEventSource interactionEventSource, Survey survey) {
        zq3.h(interactionEventSource, "source");
        zq3.h(survey, "survey");
        return new InteractionEventDismissData(progressEventMessageData, interactionEventSource, survey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionEventDismissData)) {
            return false;
        }
        InteractionEventDismissData interactionEventDismissData = (InteractionEventDismissData) obj;
        return zq3.c(this.progress, interactionEventDismissData.progress) && this.source == interactionEventDismissData.source && zq3.c(this.survey, interactionEventDismissData.survey);
    }

    public final ProgressEventMessageData getProgress() {
        return this.progress;
    }

    public final InteractionEventSource getSource() {
        return this.source;
    }

    public final Survey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        ProgressEventMessageData progressEventMessageData = this.progress;
        return ((((progressEventMessageData == null ? 0 : progressEventMessageData.hashCode()) * 31) + this.source.hashCode()) * 31) + this.survey.hashCode();
    }

    public String toString() {
        return "InteractionEventDismissData(progress=" + this.progress + ", source=" + this.source + ", survey=" + this.survey + ')';
    }
}
