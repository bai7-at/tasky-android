package com.nytimes.android.comments.comments.data.remote;

import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentResponse;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class CommentsResponse {
    public static final int $stable = 8;
    private final List<CommentResponse> comments;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentsResponse copy$default(CommentsResponse commentsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commentsResponse.comments;
        }
        return commentsResponse.copy(list);
    }

    public final List<CommentResponse> component1() {
        return this.comments;
    }

    public final CommentsResponse copy(List<CommentResponse> list) {
        zq3.h(list, "comments");
        return new CommentsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommentsResponse) && zq3.c(this.comments, ((CommentsResponse) obj).comments);
    }

    public final List<CommentResponse> getComments() {
        return this.comments;
    }

    public int hashCode() {
        return this.comments.hashCode();
    }

    public String toString() {
        return "CommentsResponse(comments=" + this.comments + ")";
    }

    public CommentsResponse(List<CommentResponse> list) {
        zq3.h(list, "comments");
        this.comments = list;
    }

    public /* synthetic */ CommentsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? i.l() : list);
    }
}
