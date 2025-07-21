package com.nytimes.android.comments.writenewcomment.data.repository;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CommenterDetails {
    public static final int $stable = 0;
    private final CommenterPreferences commenterPreferences;
    private final String draftComment;

    public CommenterDetails(CommenterPreferences commenterPreferences, String str) {
        zq3.h(commenterPreferences, "commenterPreferences");
        this.commenterPreferences = commenterPreferences;
        this.draftComment = str;
    }

    public static /* synthetic */ CommenterDetails copy$default(CommenterDetails commenterDetails, CommenterPreferences commenterPreferences, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            commenterPreferences = commenterDetails.commenterPreferences;
        }
        if ((i & 2) != 0) {
            str = commenterDetails.draftComment;
        }
        return commenterDetails.copy(commenterPreferences, str);
    }

    public final CommenterPreferences component1() {
        return this.commenterPreferences;
    }

    public final String component2() {
        return this.draftComment;
    }

    public final CommenterDetails copy(CommenterPreferences commenterPreferences, String str) {
        zq3.h(commenterPreferences, "commenterPreferences");
        return new CommenterDetails(commenterPreferences, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommenterDetails)) {
            return false;
        }
        CommenterDetails commenterDetails = (CommenterDetails) obj;
        return zq3.c(this.commenterPreferences, commenterDetails.commenterPreferences) && zq3.c(this.draftComment, commenterDetails.draftComment);
    }

    public final CommenterPreferences getCommenterPreferences() {
        return this.commenterPreferences;
    }

    public final String getDraftComment() {
        return this.draftComment;
    }

    public int hashCode() {
        int hashCode = this.commenterPreferences.hashCode() * 31;
        String str = this.draftComment;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CommenterDetails(commenterPreferences=" + this.commenterPreferences + ", draftComment=" + this.draftComment + ")";
    }

    public /* synthetic */ CommenterDetails(CommenterPreferences commenterPreferences, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(commenterPreferences, (i & 2) != 0 ? null : str);
    }
}
