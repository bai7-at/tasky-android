package com.nytimes.android.comments.comments.data.remote.recommendcomment;

/* loaded from: classes4.dex */
public final class RecommendCommentResult {
    public static final int $stable = 0;
    private final int commentID;
    private final int recommendations;
    private final boolean recommended;

    public RecommendCommentResult(int i, boolean z, int i2) {
        this.commentID = i;
        this.recommended = z;
        this.recommendations = i2;
    }

    public static /* synthetic */ RecommendCommentResult copy$default(RecommendCommentResult recommendCommentResult, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recommendCommentResult.commentID;
        }
        if ((i3 & 2) != 0) {
            z = recommendCommentResult.recommended;
        }
        if ((i3 & 4) != 0) {
            i2 = recommendCommentResult.recommendations;
        }
        return recommendCommentResult.copy(i, z, i2);
    }

    public final int component1() {
        return this.commentID;
    }

    public final boolean component2() {
        return this.recommended;
    }

    public final int component3() {
        return this.recommendations;
    }

    public final RecommendCommentResult copy(int i, boolean z, int i2) {
        return new RecommendCommentResult(i, z, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendCommentResult)) {
            return false;
        }
        RecommendCommentResult recommendCommentResult = (RecommendCommentResult) obj;
        return this.commentID == recommendCommentResult.commentID && this.recommended == recommendCommentResult.recommended && this.recommendations == recommendCommentResult.recommendations;
    }

    public final int getCommentID() {
        return this.commentID;
    }

    public final int getRecommendations() {
        return this.recommendations;
    }

    public final boolean getRecommended() {
        return this.recommended;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.commentID) * 31) + Boolean.hashCode(this.recommended)) * 31) + Integer.hashCode(this.recommendations);
    }

    public String toString() {
        return "RecommendCommentResult(commentID=" + this.commentID + ", recommended=" + this.recommended + ", recommendations=" + this.recommendations + ")";
    }
}
