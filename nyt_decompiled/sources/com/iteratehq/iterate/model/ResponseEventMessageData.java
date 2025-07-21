package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class ResponseEventMessageData {
    private final Question question;
    private final Response response;

    public ResponseEventMessageData(Question question, Response response) {
        this.question = question;
        this.response = response;
    }

    public static /* synthetic */ ResponseEventMessageData copy$default(ResponseEventMessageData responseEventMessageData, Question question, Response response, int i, Object obj) {
        if ((i & 1) != 0) {
            question = responseEventMessageData.question;
        }
        if ((i & 2) != 0) {
            response = responseEventMessageData.response;
        }
        return responseEventMessageData.copy(question, response);
    }

    public final Question component1() {
        return this.question;
    }

    public final Response component2() {
        return this.response;
    }

    public final ResponseEventMessageData copy(Question question, Response response) {
        return new ResponseEventMessageData(question, response);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseEventMessageData)) {
            return false;
        }
        ResponseEventMessageData responseEventMessageData = (ResponseEventMessageData) obj;
        return zq3.c(this.question, responseEventMessageData.question) && zq3.c(this.response, responseEventMessageData.response);
    }

    public final Question getQuestion() {
        return this.question;
    }

    public final Response getResponse() {
        return this.response;
    }

    public int hashCode() {
        Question question = this.question;
        int hashCode = (question == null ? 0 : question.hashCode()) * 31;
        Response response = this.response;
        return hashCode + (response != null ? response.hashCode() : 0);
    }

    public String toString() {
        return "ResponseEventMessageData(question=" + this.question + ", response=" + this.response + ')';
    }
}
