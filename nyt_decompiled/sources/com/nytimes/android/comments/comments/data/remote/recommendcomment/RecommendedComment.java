package com.nytimes.android.comments.comments.data.remote.recommendcomment;

/* loaded from: classes4.dex */
public final class RecommendedComment {
    public static final int $stable = 0;
    private final long commentID;
    private final boolean isRecommended;
    private final int recommendations;

    public RecommendedComment(long j, boolean z, int i) {
        this.commentID = j;
        this.isRecommended = z;
        this.recommendations = i;
    }

    public static /* synthetic */ RecommendedComment copy$default(RecommendedComment recommendedComment, long j, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = recommendedComment.commentID;
        }
        if ((i2 & 2) != 0) {
            z = recommendedComment.isRecommended;
        }
        if ((i2 & 4) != 0) {
            i = recommendedComment.recommendations;
        }
        return recommendedComment.copy(j, z, i);
    }

    public final long component1() {
        return this.commentID;
    }

    public final boolean component2() {
        return this.isRecommended;
    }

    public final int component3() {
        return this.recommendations;
    }

    public final RecommendedComment copy(long j, boolean z, int i) {
        return new RecommendedComment(j, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedComment)) {
            return false;
        }
        RecommendedComment recommendedComment = (RecommendedComment) obj;
        return this.commentID == recommendedComment.commentID && this.isRecommended == recommendedComment.isRecommended && this.recommendations == recommendedComment.recommendations;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final int getRecommendations() {
        return this.recommendations;
    }

    public int hashCode() {
        return (((Long.hashCode(this.commentID) * 31) + Boolean.hashCode(this.isRecommended)) * 31) + Integer.hashCode(this.recommendations);
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        return "RecommendedComment(commentID=" + this.commentID + ", isRecommended=" + this.isRecommended + ", recommendations=" + this.recommendations + ")";
    }
}
