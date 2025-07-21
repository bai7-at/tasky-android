package com.nytimes.android.comments.comments.data.remote.getcommentbypermid;

import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CommentThreadResult {
    public static final int $stable = 8;
    private final long commentID;
    private final Comment commentThread;

    public CommentThreadResult(long j, Comment comment) {
        zq3.h(comment, "commentThread");
        this.commentID = j;
        this.commentThread = comment;
    }

    public static /* synthetic */ CommentThreadResult copy$default(CommentThreadResult commentThreadResult, long j, Comment comment, int i, Object obj) {
        if ((i & 1) != 0) {
            j = commentThreadResult.commentID;
        }
        if ((i & 2) != 0) {
            comment = commentThreadResult.commentThread;
        }
        return commentThreadResult.copy(j, comment);
    }

    public final long component1() {
        return this.commentID;
    }

    public final Comment component2() {
        return this.commentThread;
    }

    public final CommentThreadResult copy(long j, Comment comment) {
        zq3.h(comment, "commentThread");
        return new CommentThreadResult(j, comment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentThreadResult)) {
            return false;
        }
        CommentThreadResult commentThreadResult = (CommentThreadResult) obj;
        return this.commentID == commentThreadResult.commentID && zq3.c(this.commentThread, commentThreadResult.commentThread);
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final Comment getCommentThread() {
        return this.commentThread;
    }

    public int hashCode() {
        return (Long.hashCode(this.commentID) * 31) + this.commentThread.hashCode();
    }

    public String toString() {
        return "CommentThreadResult(commentID=" + this.commentID + ", commentThread=" + this.commentThread + ")";
    }
}
