package com.nytimes.android.comments.comments.data.remote.recommendcomment;

/* loaded from: classes4.dex */
public final class RecommendedReply {
    public static final int $stable = 0;
    private final long commentID;
    private final boolean isRecommended;
    private final int recommendations;
    private final long replyID;

    public RecommendedReply(long j, long j2, boolean z, int i) {
        this.commentID = j;
        this.replyID = j2;
        this.isRecommended = z;
        this.recommendations = i;
    }

    public static /* synthetic */ RecommendedReply copy$default(RecommendedReply recommendedReply, long j, long j2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = recommendedReply.commentID;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = recommendedReply.replyID;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            z = recommendedReply.isRecommended;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = recommendedReply.recommendations;
        }
        return recommendedReply.copy(j3, j4, z2, i);
    }

    public final long component1() {
        return this.commentID;
    }

    public final long component2() {
        return this.replyID;
    }

    public final boolean component3() {
        return this.isRecommended;
    }

    public final int component4() {
        return this.recommendations;
    }

    public final RecommendedReply copy(long j, long j2, boolean z, int i) {
        return new RecommendedReply(j, j2, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedReply)) {
            return false;
        }
        RecommendedReply recommendedReply = (RecommendedReply) obj;
        return this.commentID == recommendedReply.commentID && this.replyID == recommendedReply.replyID && this.isRecommended == recommendedReply.isRecommended && this.recommendations == recommendedReply.recommendations;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final int getRecommendations() {
        return this.recommendations;
    }

    public final long getReplyID() {
        return this.replyID;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.commentID) * 31) + Long.hashCode(this.replyID)) * 31) + Boolean.hashCode(this.isRecommended)) * 31) + Integer.hashCode(this.recommendations);
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        return "RecommendedReply(commentID=" + this.commentID + ", replyID=" + this.replyID + ", isRecommended=" + this.isRecommended + ", recommendations=" + this.recommendations + ")";
    }
}
