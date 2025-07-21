package com.nytimes.android.comments.comments.mvi.view;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GetAllRepliesState {
    public static final int $stable = 0;
    private final long commentID;
    private final boolean isLoading;

    public GetAllRepliesState() {
        this(false, 0L, 3, null);
    }

    public static /* synthetic */ GetAllRepliesState copy$default(GetAllRepliesState getAllRepliesState, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getAllRepliesState.isLoading;
        }
        if ((i & 2) != 0) {
            j = getAllRepliesState.commentID;
        }
        return getAllRepliesState.copy(z, j);
    }

    public final boolean component1() {
        return this.isLoading;
    }

    public final long component2() {
        return this.commentID;
    }

    public final GetAllRepliesState copy(boolean z, long j) {
        return new GetAllRepliesState(z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllRepliesState)) {
            return false;
        }
        GetAllRepliesState getAllRepliesState = (GetAllRepliesState) obj;
        return this.isLoading == getAllRepliesState.isLoading && this.commentID == getAllRepliesState.commentID;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + Long.hashCode(this.commentID);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "GetAllRepliesState(isLoading=" + this.isLoading + ", commentID=" + this.commentID + ")";
    }

    public GetAllRepliesState(boolean z, long j) {
        this.isLoading = z;
        this.commentID = j;
    }

    public /* synthetic */ GetAllRepliesState(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
