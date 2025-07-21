package com.nytimes.android.comments.comments.data.remote.flagcomment;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class FlagCommentBody {
    public static final int $stable = 0;
    private final long commentID;
    private final String commentLabels;
    private final String url;

    public FlagCommentBody(@bt3(name = "url") String str, @bt3(name = "commentID") long j, @bt3(name = "commentLabels") String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "commentLabels");
        this.url = str;
        this.commentID = j;
        this.commentLabels = str2;
    }

    public static /* synthetic */ FlagCommentBody copy$default(FlagCommentBody flagCommentBody, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flagCommentBody.url;
        }
        if ((i & 2) != 0) {
            j = flagCommentBody.commentID;
        }
        if ((i & 4) != 0) {
            str2 = flagCommentBody.commentLabels;
        }
        return flagCommentBody.copy(str, j, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final long component2() {
        return this.commentID;
    }

    public final String component3() {
        return this.commentLabels;
    }

    public final FlagCommentBody copy(@bt3(name = "url") String str, @bt3(name = "commentID") long j, @bt3(name = "commentLabels") String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "commentLabels");
        return new FlagCommentBody(str, j, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagCommentBody)) {
            return false;
        }
        FlagCommentBody flagCommentBody = (FlagCommentBody) obj;
        return zq3.c(this.url, flagCommentBody.url) && this.commentID == flagCommentBody.commentID && zq3.c(this.commentLabels, flagCommentBody.commentLabels);
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final String getCommentLabels() {
        return this.commentLabels;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Long.hashCode(this.commentID)) * 31) + this.commentLabels.hashCode();
    }

    public String toString() {
        return "FlagCommentBody(url=" + this.url + ", commentID=" + this.commentID + ", commentLabels=" + this.commentLabels + ")";
    }
}
