package com.nytimes.android.comments.writenewcomment.data.db;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes4.dex */
public final class DraftCommentEntity {
    public static final int $stable = 0;
    private final String articleUrl;
    private final String content;
    private final long parentCommentId;

    public DraftCommentEntity(String str, long j, String str2) {
        zq3.h(str, "articleUrl");
        zq3.h(str2, "content");
        this.articleUrl = str;
        this.parentCommentId = j;
        this.content = str2;
    }

    public static /* synthetic */ DraftCommentEntity copy$default(DraftCommentEntity draftCommentEntity, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftCommentEntity.articleUrl;
        }
        if ((i & 2) != 0) {
            j = draftCommentEntity.parentCommentId;
        }
        if ((i & 4) != 0) {
            str2 = draftCommentEntity.content;
        }
        return draftCommentEntity.copy(str, j, str2);
    }

    public final String component1() {
        return this.articleUrl;
    }

    public final long component2() {
        return this.parentCommentId;
    }

    public final String component3() {
        return this.content;
    }

    public final DraftCommentEntity copy(String str, long j, String str2) {
        zq3.h(str, "articleUrl");
        zq3.h(str2, "content");
        return new DraftCommentEntity(str, j, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftCommentEntity)) {
            return false;
        }
        DraftCommentEntity draftCommentEntity = (DraftCommentEntity) obj;
        return zq3.c(this.articleUrl, draftCommentEntity.articleUrl) && this.parentCommentId == draftCommentEntity.parentCommentId && zq3.c(this.content, draftCommentEntity.content);
    }

    public final String getArticleUrl() {
        return this.articleUrl;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getParentCommentId() {
        return this.parentCommentId;
    }

    public int hashCode() {
        return (((this.articleUrl.hashCode() * 31) + Long.hashCode(this.parentCommentId)) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "DraftCommentEntity(articleUrl=" + this.articleUrl + ", parentCommentId=" + this.parentCommentId + ", content=" + this.content + ")";
    }
}
