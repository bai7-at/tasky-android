package com.nytimes.android.comments.comments.data.remote.recommendcomment;

import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class RecommendationCommentResponse {
    public static final int $stable = 0;
    private final int commentID;
    private final int recommendations;

    public RecommendationCommentResponse(int i, int i2) {
        this.commentID = i;
        this.recommendations = i2;
    }

    public static /* synthetic */ RecommendationCommentResponse copy$default(RecommendationCommentResponse recommendationCommentResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recommendationCommentResponse.commentID;
        }
        if ((i3 & 2) != 0) {
            i2 = recommendationCommentResponse.recommendations;
        }
        return recommendationCommentResponse.copy(i, i2);
    }

    public final int component1() {
        return this.commentID;
    }

    public final int component2() {
        return this.recommendations;
    }

    public final RecommendationCommentResponse copy(int i, int i2) {
        return new RecommendationCommentResponse(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationCommentResponse)) {
            return false;
        }
        RecommendationCommentResponse recommendationCommentResponse = (RecommendationCommentResponse) obj;
        return this.commentID == recommendationCommentResponse.commentID && this.recommendations == recommendationCommentResponse.recommendations;
    }

    public final int getCommentID() {
        return this.commentID;
    }

    public final int getRecommendations() {
        return this.recommendations;
    }

    public int hashCode() {
        return (Integer.hashCode(this.commentID) * 31) + Integer.hashCode(this.recommendations);
    }

    public String toString() {
        return "RecommendationCommentResponse(commentID=" + this.commentID + ", recommendations=" + this.recommendations + ")";
    }
}
