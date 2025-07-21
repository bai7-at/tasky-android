package com.nytimes.android.comments.comments.data.remote.getcommentssummary;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CommentsSummary {
    public static final int $stable = 0;
    private final boolean canSubmit;
    private final String defaultTabName;
    private final int totalComments;
    private final int totalEditorsSelection;
    private final int totalParentComments;
    private final int totalRecommendations;
    private final int totalReplyComments;
    private final int totalReporterReplyComments;

    public CommentsSummary(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.totalComments = i;
        this.totalReplyComments = i2;
        this.totalReporterReplyComments = i3;
        this.totalParentComments = i4;
        this.totalEditorsSelection = i5;
        this.totalRecommendations = i6;
        this.canSubmit = z;
        this.defaultTabName = str;
    }

    public final int component1() {
        return this.totalComments;
    }

    public final int component2() {
        return this.totalReplyComments;
    }

    public final int component3() {
        return this.totalReporterReplyComments;
    }

    public final int component4() {
        return this.totalParentComments;
    }

    public final int component5() {
        return this.totalEditorsSelection;
    }

    public final int component6() {
        return this.totalRecommendations;
    }

    public final boolean component7() {
        return this.canSubmit;
    }

    public final String component8() {
        return this.defaultTabName;
    }

    public final CommentsSummary copy(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        return new CommentsSummary(i, i2, i3, i4, i5, i6, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentsSummary)) {
            return false;
        }
        CommentsSummary commentsSummary = (CommentsSummary) obj;
        return this.totalComments == commentsSummary.totalComments && this.totalReplyComments == commentsSummary.totalReplyComments && this.totalReporterReplyComments == commentsSummary.totalReporterReplyComments && this.totalParentComments == commentsSummary.totalParentComments && this.totalEditorsSelection == commentsSummary.totalEditorsSelection && this.totalRecommendations == commentsSummary.totalRecommendations && this.canSubmit == commentsSummary.canSubmit && zq3.c(this.defaultTabName, commentsSummary.defaultTabName);
    }

    public final boolean getCanSubmit() {
        return this.canSubmit;
    }

    public final String getDefaultTabName() {
        return this.defaultTabName;
    }

    public final int getTotalComments() {
        return this.totalComments;
    }

    public final int getTotalEditorsSelection() {
        return this.totalEditorsSelection;
    }

    public final int getTotalParentComments() {
        return this.totalParentComments;
    }

    public final int getTotalRecommendations() {
        return this.totalRecommendations;
    }

    public final int getTotalReplyComments() {
        return this.totalReplyComments;
    }

    public final int getTotalReporterReplyComments() {
        return this.totalReporterReplyComments;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.totalComments) * 31) + Integer.hashCode(this.totalReplyComments)) * 31) + Integer.hashCode(this.totalReporterReplyComments)) * 31) + Integer.hashCode(this.totalParentComments)) * 31) + Integer.hashCode(this.totalEditorsSelection)) * 31) + Integer.hashCode(this.totalRecommendations)) * 31) + Boolean.hashCode(this.canSubmit)) * 31;
        String str = this.defaultTabName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CommentsSummary(totalComments=" + this.totalComments + ", totalReplyComments=" + this.totalReplyComments + ", totalReporterReplyComments=" + this.totalReporterReplyComments + ", totalParentComments=" + this.totalParentComments + ", totalEditorsSelection=" + this.totalEditorsSelection + ", totalRecommendations=" + this.totalRecommendations + ", canSubmit=" + this.canSubmit + ", defaultTabName=" + this.defaultTabName + ")";
    }
}
