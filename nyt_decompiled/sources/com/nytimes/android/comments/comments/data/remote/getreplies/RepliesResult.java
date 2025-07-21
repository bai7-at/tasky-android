package com.nytimes.android.comments.comments.data.remote.getreplies;

import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class RepliesResult {
    public static final int $stable = 8;
    private final Comment comment;
    private final List<Comment> replies;

    public RepliesResult(Comment comment, List<Comment> list) {
        zq3.h(comment, "comment");
        zq3.h(list, "replies");
        this.comment = comment;
        this.replies = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RepliesResult copy$default(RepliesResult repliesResult, Comment comment, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            comment = repliesResult.comment;
        }
        if ((i & 2) != 0) {
            list = repliesResult.replies;
        }
        return repliesResult.copy(comment, list);
    }

    public final Comment component1() {
        return this.comment;
    }

    public final List<Comment> component2() {
        return this.replies;
    }

    public final RepliesResult copy(Comment comment, List<Comment> list) {
        zq3.h(comment, "comment");
        zq3.h(list, "replies");
        return new RepliesResult(comment, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepliesResult)) {
            return false;
        }
        RepliesResult repliesResult = (RepliesResult) obj;
        return zq3.c(this.comment, repliesResult.comment) && zq3.c(this.replies, repliesResult.replies);
    }

    public final Comment getComment() {
        return this.comment;
    }

    public final List<Comment> getReplies() {
        return this.replies;
    }

    public int hashCode() {
        return (this.comment.hashCode() * 31) + this.replies.hashCode();
    }

    public String toString() {
        return "RepliesResult(comment=" + this.comment + ", replies=" + this.replies + ")";
    }
}
