package com.nytimes.android.comments.comments.data.remote.flagcomment;

import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class FlaggedCommentResponse {
    public static final int $stable = 0;
    private final int commentID;

    public FlaggedCommentResponse(int i) {
        this.commentID = i;
    }

    public static /* synthetic */ FlaggedCommentResponse copy$default(FlaggedCommentResponse flaggedCommentResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flaggedCommentResponse.commentID;
        }
        return flaggedCommentResponse.copy(i);
    }

    public final int component1() {
        return this.commentID;
    }

    public final FlaggedCommentResponse copy(int i) {
        return new FlaggedCommentResponse(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlaggedCommentResponse) && this.commentID == ((FlaggedCommentResponse) obj).commentID;
    }

    public final int getCommentID() {
        return this.commentID;
    }

    public int hashCode() {
        return Integer.hashCode(this.commentID);
    }

    public String toString() {
        return "FlaggedCommentResponse(commentID=" + this.commentID + ")";
    }
}
