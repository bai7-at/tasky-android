package com.nytimes.android.comments.comments.data.remote.getallcomments;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class CommentSummaryResponse {
    public static final int $stable = 0;
    private final int averageRating;
    private final int canSubmit;
    private final String commentQuestion;
    private final String sortBy;
    private final int totalCommentsFound;
    private final int totalEditorsSelectionFound;
    private final int totalParentCommentsFound;
    private final int totalRating;
    private final int totalRecommendationsFound;
    private final int totalReplyCommentsFound;
    private final int totalReporterReplyCommentsFound;
    private final String url;
    private final int userCount;

    public CommentSummaryResponse(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str3, int i8, int i9, int i10) {
        zq3.h(str, "url");
        zq3.h(str2, "commentQuestion");
        this.url = str;
        this.commentQuestion = str2;
        this.totalCommentsFound = i;
        this.totalReplyCommentsFound = i2;
        this.totalReporterReplyCommentsFound = i3;
        this.totalParentCommentsFound = i4;
        this.totalEditorsSelectionFound = i5;
        this.totalRecommendationsFound = i6;
        this.canSubmit = i7;
        this.sortBy = str3;
        this.totalRating = i8;
        this.userCount = i9;
        this.averageRating = i10;
    }

    public final String component1() {
        return this.url;
    }

    public final String component10() {
        return this.sortBy;
    }

    public final int component11() {
        return this.totalRating;
    }

    public final int component12() {
        return this.userCount;
    }

    public final int component13() {
        return this.averageRating;
    }

    public final String component2() {
        return this.commentQuestion;
    }

    public final int component3() {
        return this.totalCommentsFound;
    }

    public final int component4() {
        return this.totalReplyCommentsFound;
    }

    public final int component5() {
        return this.totalReporterReplyCommentsFound;
    }

    public final int component6() {
        return this.totalParentCommentsFound;
    }

    public final int component7() {
        return this.totalEditorsSelectionFound;
    }

    public final int component8() {
        return this.totalRecommendationsFound;
    }

    public final int component9() {
        return this.canSubmit;
    }

    public final CommentSummaryResponse copy(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str3, int i8, int i9, int i10) {
        zq3.h(str, "url");
        zq3.h(str2, "commentQuestion");
        return new CommentSummaryResponse(str, str2, i, i2, i3, i4, i5, i6, i7, str3, i8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentSummaryResponse)) {
            return false;
        }
        CommentSummaryResponse commentSummaryResponse = (CommentSummaryResponse) obj;
        return zq3.c(this.url, commentSummaryResponse.url) && zq3.c(this.commentQuestion, commentSummaryResponse.commentQuestion) && this.totalCommentsFound == commentSummaryResponse.totalCommentsFound && this.totalReplyCommentsFound == commentSummaryResponse.totalReplyCommentsFound && this.totalReporterReplyCommentsFound == commentSummaryResponse.totalReporterReplyCommentsFound && this.totalParentCommentsFound == commentSummaryResponse.totalParentCommentsFound && this.totalEditorsSelectionFound == commentSummaryResponse.totalEditorsSelectionFound && this.totalRecommendationsFound == commentSummaryResponse.totalRecommendationsFound && this.canSubmit == commentSummaryResponse.canSubmit && zq3.c(this.sortBy, commentSummaryResponse.sortBy) && this.totalRating == commentSummaryResponse.totalRating && this.userCount == commentSummaryResponse.userCount && this.averageRating == commentSummaryResponse.averageRating;
    }

    public final int getAverageRating() {
        return this.averageRating;
    }

    public final int getCanSubmit() {
        return this.canSubmit;
    }

    public final String getCommentQuestion() {
        return this.commentQuestion;
    }

    public final String getSortBy() {
        return this.sortBy;
    }

    public final int getTotalCommentsFound() {
        return this.totalCommentsFound;
    }

    public final int getTotalEditorsSelectionFound() {
        return this.totalEditorsSelectionFound;
    }

    public final int getTotalParentCommentsFound() {
        return this.totalParentCommentsFound;
    }

    public final int getTotalRating() {
        return this.totalRating;
    }

    public final int getTotalRecommendationsFound() {
        return this.totalRecommendationsFound;
    }

    public final int getTotalReplyCommentsFound() {
        return this.totalReplyCommentsFound;
    }

    public final int getTotalReporterReplyCommentsFound() {
        return this.totalReporterReplyCommentsFound;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.url.hashCode() * 31) + this.commentQuestion.hashCode()) * 31) + Integer.hashCode(this.totalCommentsFound)) * 31) + Integer.hashCode(this.totalReplyCommentsFound)) * 31) + Integer.hashCode(this.totalReporterReplyCommentsFound)) * 31) + Integer.hashCode(this.totalParentCommentsFound)) * 31) + Integer.hashCode(this.totalEditorsSelectionFound)) * 31) + Integer.hashCode(this.totalRecommendationsFound)) * 31) + Integer.hashCode(this.canSubmit)) * 31;
        String str = this.sortBy;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.totalRating)) * 31) + Integer.hashCode(this.userCount)) * 31) + Integer.hashCode(this.averageRating);
    }

    public String toString() {
        return "CommentSummaryResponse(url=" + this.url + ", commentQuestion=" + this.commentQuestion + ", totalCommentsFound=" + this.totalCommentsFound + ", totalReplyCommentsFound=" + this.totalReplyCommentsFound + ", totalReporterReplyCommentsFound=" + this.totalReporterReplyCommentsFound + ", totalParentCommentsFound=" + this.totalParentCommentsFound + ", totalEditorsSelectionFound=" + this.totalEditorsSelectionFound + ", totalRecommendationsFound=" + this.totalRecommendationsFound + ", canSubmit=" + this.canSubmit + ", sortBy=" + this.sortBy + ", totalRating=" + this.totalRating + ", userCount=" + this.userCount + ", averageRating=" + this.averageRating + ")";
    }

    public /* synthetic */ CommentSummaryResponse(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str3, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, i3, i4, i5, i6, i7, (i11 & 512) != 0 ? null : str3, i8, i9, i10);
    }
}
