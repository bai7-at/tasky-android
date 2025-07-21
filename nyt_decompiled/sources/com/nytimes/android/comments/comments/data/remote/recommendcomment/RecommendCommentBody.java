package com.nytimes.android.comments.comments.data.remote.recommendcomment;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class RecommendCommentBody {
    public static final int $stable = 0;
    private final long commentSequence;
    private final int recommend;
    private final String url;

    public RecommendCommentBody(@bt3(name = "url") String str, @bt3(name = "commentSequence") long j, @bt3(name = "recommend") int i) {
        zq3.h(str, "url");
        this.url = str;
        this.commentSequence = j;
        this.recommend = i;
    }

    public static /* synthetic */ RecommendCommentBody copy$default(RecommendCommentBody recommendCommentBody, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendCommentBody.url;
        }
        if ((i2 & 2) != 0) {
            j = recommendCommentBody.commentSequence;
        }
        if ((i2 & 4) != 0) {
            i = recommendCommentBody.recommend;
        }
        return recommendCommentBody.copy(str, j, i);
    }

    public final String component1() {
        return this.url;
    }

    public final long component2() {
        return this.commentSequence;
    }

    public final int component3() {
        return this.recommend;
    }

    public final RecommendCommentBody copy(@bt3(name = "url") String str, @bt3(name = "commentSequence") long j, @bt3(name = "recommend") int i) {
        zq3.h(str, "url");
        return new RecommendCommentBody(str, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendCommentBody)) {
            return false;
        }
        RecommendCommentBody recommendCommentBody = (RecommendCommentBody) obj;
        return zq3.c(this.url, recommendCommentBody.url) && this.commentSequence == recommendCommentBody.commentSequence && this.recommend == recommendCommentBody.recommend;
    }

    public final long getCommentSequence() {
        return this.commentSequence;
    }

    public final int getRecommend() {
        return this.recommend;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Long.hashCode(this.commentSequence)) * 31) + Integer.hashCode(this.recommend);
    }

    public String toString() {
        return "RecommendCommentBody(url=" + this.url + ", commentSequence=" + this.commentSequence + ", recommend=" + this.recommend + ")";
    }
}
