package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class ProgressEventMessageData {
    private final int completed;
    private final Question currentQuestion;
    private final int total;

    public ProgressEventMessageData(int i, int i2, Question question) {
        this.completed = i;
        this.total = i2;
        this.currentQuestion = question;
    }

    public static /* synthetic */ ProgressEventMessageData copy$default(ProgressEventMessageData progressEventMessageData, int i, int i2, Question question, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = progressEventMessageData.completed;
        }
        if ((i3 & 2) != 0) {
            i2 = progressEventMessageData.total;
        }
        if ((i3 & 4) != 0) {
            question = progressEventMessageData.currentQuestion;
        }
        return progressEventMessageData.copy(i, i2, question);
    }

    public final int component1() {
        return this.completed;
    }

    public final int component2() {
        return this.total;
    }

    public final Question component3() {
        return this.currentQuestion;
    }

    public final ProgressEventMessageData copy(int i, int i2, Question question) {
        return new ProgressEventMessageData(i, i2, question);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressEventMessageData)) {
            return false;
        }
        ProgressEventMessageData progressEventMessageData = (ProgressEventMessageData) obj;
        return this.completed == progressEventMessageData.completed && this.total == progressEventMessageData.total && zq3.c(this.currentQuestion, progressEventMessageData.currentQuestion);
    }

    public final int getCompleted() {
        return this.completed;
    }

    public final Question getCurrentQuestion() {
        return this.currentQuestion;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.completed) * 31) + Integer.hashCode(this.total)) * 31;
        Question question = this.currentQuestion;
        return hashCode + (question == null ? 0 : question.hashCode());
    }

    public String toString() {
        return "ProgressEventMessageData(completed=" + this.completed + ", total=" + this.total + ", currentQuestion=" + this.currentQuestion + ')';
    }
}
