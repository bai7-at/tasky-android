package com.nytimes.android.comments.comments.data.remote.flagcomment;

/* loaded from: classes4.dex */
public final class FlaggedReply {
    public static final int $stable = 0;
    private final long commentID;
    private final long replyID;

    public FlaggedReply(long j, long j2) {
        this.commentID = j;
        this.replyID = j2;
    }

    public static /* synthetic */ FlaggedReply copy$default(FlaggedReply flaggedReply, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = flaggedReply.commentID;
        }
        if ((i & 2) != 0) {
            j2 = flaggedReply.replyID;
        }
        return flaggedReply.copy(j, j2);
    }

    public final long component1() {
        return this.commentID;
    }

    public final long component2() {
        return this.replyID;
    }

    public final FlaggedReply copy(long j, long j2) {
        return new FlaggedReply(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlaggedReply)) {
            return false;
        }
        FlaggedReply flaggedReply = (FlaggedReply) obj;
        return this.commentID == flaggedReply.commentID && this.replyID == flaggedReply.replyID;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final long getReplyID() {
        return this.replyID;
    }

    public int hashCode() {
        return (Long.hashCode(this.commentID) * 31) + Long.hashCode(this.replyID);
    }

    public String toString() {
        return "FlaggedReply(commentID=" + this.commentID + ", replyID=" + this.replyID + ")";
    }
}
