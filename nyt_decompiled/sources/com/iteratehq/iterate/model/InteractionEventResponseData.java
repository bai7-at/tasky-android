package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class InteractionEventResponseData implements InteractionEventData {
    private final Question question;
    private final Response response;
    private final Survey survey;

    public InteractionEventResponseData(Response response, Question question, Survey survey) {
        zq3.h(response, "response");
        zq3.h(question, "question");
        zq3.h(survey, "survey");
        this.response = response;
        this.question = question;
        this.survey = survey;
    }

    public static /* synthetic */ InteractionEventResponseData copy$default(InteractionEventResponseData interactionEventResponseData, Response response, Question question, Survey survey, int i, Object obj) {
        if ((i & 1) != 0) {
            response = interactionEventResponseData.response;
        }
        if ((i & 2) != 0) {
            question = interactionEventResponseData.question;
        }
        if ((i & 4) != 0) {
            survey = interactionEventResponseData.survey;
        }
        return interactionEventResponseData.copy(response, question, survey);
    }

    public final Response component1() {
        return this.response;
    }

    public final Question component2() {
        return this.question;
    }

    public final Survey component3() {
        return this.survey;
    }

    public final InteractionEventResponseData copy(Response response, Question question, Survey survey) {
        zq3.h(response, "response");
        zq3.h(question, "question");
        zq3.h(survey, "survey");
        return new InteractionEventResponseData(response, question, survey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionEventResponseData)) {
            return false;
        }
        InteractionEventResponseData interactionEventResponseData = (InteractionEventResponseData) obj;
        return zq3.c(this.response, interactionEventResponseData.response) && zq3.c(this.question, interactionEventResponseData.question) && zq3.c(this.survey, interactionEventResponseData.survey);
    }

    public final Question getQuestion() {
        return this.question;
    }

    public final Response getResponse() {
        return this.response;
    }

    public final Survey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return (((this.response.hashCode() * 31) + this.question.hashCode()) * 31) + this.survey.hashCode();
    }

    public String toString() {
        return "InteractionEventResponseData(response=" + this.response + ", question=" + this.question + ", survey=" + this.survey + ')';
    }
}
