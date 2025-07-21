package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class Question {
    private final String id;
    private final String prompt;

    public Question(String str, String str2) {
        zq3.h(str, "id");
        zq3.h(str2, "prompt");
        this.id = str;
        this.prompt = str2;
    }

    public static /* synthetic */ Question copy$default(Question question, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = question.id;
        }
        if ((i & 2) != 0) {
            str2 = question.prompt;
        }
        return question.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.prompt;
    }

    public final Question copy(String str, String str2) {
        zq3.h(str, "id");
        zq3.h(str2, "prompt");
        return new Question(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return zq3.c(this.id, question.id) && zq3.c(this.prompt, question.prompt);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.prompt.hashCode();
    }

    public String toString() {
        return "Question(id=" + this.id + ", prompt=" + this.prompt + ')';
    }
}
