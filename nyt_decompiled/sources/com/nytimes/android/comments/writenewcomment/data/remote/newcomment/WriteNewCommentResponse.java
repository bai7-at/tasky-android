package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class WriteNewCommentResponse {
    public static final int $stable = 0;
    private final long apiTimestamp;
    private final long commentID;
    private final String error;
    private final boolean isUpdateES;
    private final String status;

    public WriteNewCommentResponse(long j, @bt3(name = "updateES") boolean z, @bt3(name = "api_timestamp") long j2, String str, String str2) {
        this.commentID = j;
        this.isUpdateES = z;
        this.apiTimestamp = j2;
        this.status = str;
        this.error = str2;
    }

    public final long component1() {
        return this.commentID;
    }

    public final boolean component2() {
        return this.isUpdateES;
    }

    public final long component3() {
        return this.apiTimestamp;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.error;
    }

    public final WriteNewCommentResponse copy(long j, @bt3(name = "updateES") boolean z, @bt3(name = "api_timestamp") long j2, String str, String str2) {
        return new WriteNewCommentResponse(j, z, j2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteNewCommentResponse)) {
            return false;
        }
        WriteNewCommentResponse writeNewCommentResponse = (WriteNewCommentResponse) obj;
        return this.commentID == writeNewCommentResponse.commentID && this.isUpdateES == writeNewCommentResponse.isUpdateES && this.apiTimestamp == writeNewCommentResponse.apiTimestamp && zq3.c(this.status, writeNewCommentResponse.status) && zq3.c(this.error, writeNewCommentResponse.error);
    }

    public final long getApiTimestamp() {
        return this.apiTimestamp;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final String getError() {
        return this.error;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.commentID) * 31) + Boolean.hashCode(this.isUpdateES)) * 31) + Long.hashCode(this.apiTimestamp)) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isUpdateES() {
        return this.isUpdateES;
    }

    public String toString() {
        return "WriteNewCommentResponse(commentID=" + this.commentID + ", isUpdateES=" + this.isUpdateES + ", apiTimestamp=" + this.apiTimestamp + ", status=" + this.status + ", error=" + this.error + ")";
    }
}
