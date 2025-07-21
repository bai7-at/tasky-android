package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public final class EmbedResults {
    private final Auth auth;
    private final Survey survey;
    private final Tracking tracking;
    private final List<Trigger> triggers;

    public EmbedResults(Auth auth, Survey survey, List<Trigger> list, Tracking tracking) {
        this.auth = auth;
        this.survey = survey;
        this.triggers = list;
        this.tracking = tracking;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbedResults copy$default(EmbedResults embedResults, Auth auth, Survey survey, List list, Tracking tracking, int i, Object obj) {
        if ((i & 1) != 0) {
            auth = embedResults.auth;
        }
        if ((i & 2) != 0) {
            survey = embedResults.survey;
        }
        if ((i & 4) != 0) {
            list = embedResults.triggers;
        }
        if ((i & 8) != 0) {
            tracking = embedResults.tracking;
        }
        return embedResults.copy(auth, survey, list, tracking);
    }

    public final Auth component1() {
        return this.auth;
    }

    public final Survey component2() {
        return this.survey;
    }

    public final List<Trigger> component3() {
        return this.triggers;
    }

    public final Tracking component4() {
        return this.tracking;
    }

    public final EmbedResults copy(Auth auth, Survey survey, List<Trigger> list, Tracking tracking) {
        return new EmbedResults(auth, survey, list, tracking);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedResults)) {
            return false;
        }
        EmbedResults embedResults = (EmbedResults) obj;
        return zq3.c(this.auth, embedResults.auth) && zq3.c(this.survey, embedResults.survey) && zq3.c(this.triggers, embedResults.triggers) && zq3.c(this.tracking, embedResults.tracking);
    }

    public final Auth getAuth() {
        return this.auth;
    }

    public final Survey getSurvey() {
        return this.survey;
    }

    public final Tracking getTracking() {
        return this.tracking;
    }

    public final List<Trigger> getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        Auth auth = this.auth;
        int hashCode = (auth == null ? 0 : auth.hashCode()) * 31;
        Survey survey = this.survey;
        int hashCode2 = (hashCode + (survey == null ? 0 : survey.hashCode())) * 31;
        List<Trigger> list = this.triggers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Tracking tracking = this.tracking;
        return hashCode3 + (tracking != null ? tracking.hashCode() : 0);
    }

    public String toString() {
        return "EmbedResults(auth=" + this.auth + ", survey=" + this.survey + ", triggers=" + this.triggers + ", tracking=" + this.tracking + ')';
    }
}
