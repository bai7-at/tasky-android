package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class WriteNewCommentBody {
    public static final int $stable = 0;
    private final String commentBody;
    private final boolean notifyViaEmailOnApproval;
    private final long parentID;
    private final String url;
    private final String userDisplayName;
    private final String userLocation;

    public WriteNewCommentBody(String str, String str2, String str3, String str4, @bt3(name = "NotifyViaEmailOnApproval") boolean z, long j) {
        zq3.h(str, "commentBody");
        zq3.h(str2, "userDisplayName");
        zq3.h(str3, "userLocation");
        zq3.h(str4, "url");
        this.commentBody = str;
        this.userDisplayName = str2;
        this.userLocation = str3;
        this.url = str4;
        this.notifyViaEmailOnApproval = z;
        this.parentID = j;
    }

    public static /* synthetic */ WriteNewCommentBody copy$default(WriteNewCommentBody writeNewCommentBody, String str, String str2, String str3, String str4, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = writeNewCommentBody.commentBody;
        }
        if ((i & 2) != 0) {
            str2 = writeNewCommentBody.userDisplayName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = writeNewCommentBody.userLocation;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = writeNewCommentBody.url;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = writeNewCommentBody.notifyViaEmailOnApproval;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            j = writeNewCommentBody.parentID;
        }
        return writeNewCommentBody.copy(str, str5, str6, str7, z2, j);
    }

    public final String component1() {
        return this.commentBody;
    }

    public final String component2() {
        return this.userDisplayName;
    }

    public final String component3() {
        return this.userLocation;
    }

    public final String component4() {
        return this.url;
    }

    public final boolean component5() {
        return this.notifyViaEmailOnApproval;
    }

    public final long component6() {
        return this.parentID;
    }

    public final WriteNewCommentBody copy(String str, String str2, String str3, String str4, @bt3(name = "NotifyViaEmailOnApproval") boolean z, long j) {
        zq3.h(str, "commentBody");
        zq3.h(str2, "userDisplayName");
        zq3.h(str3, "userLocation");
        zq3.h(str4, "url");
        return new WriteNewCommentBody(str, str2, str3, str4, z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteNewCommentBody)) {
            return false;
        }
        WriteNewCommentBody writeNewCommentBody = (WriteNewCommentBody) obj;
        return zq3.c(this.commentBody, writeNewCommentBody.commentBody) && zq3.c(this.userDisplayName, writeNewCommentBody.userDisplayName) && zq3.c(this.userLocation, writeNewCommentBody.userLocation) && zq3.c(this.url, writeNewCommentBody.url) && this.notifyViaEmailOnApproval == writeNewCommentBody.notifyViaEmailOnApproval && this.parentID == writeNewCommentBody.parentID;
    }

    public final String getCommentBody() {
        return this.commentBody;
    }

    public final boolean getNotifyViaEmailOnApproval() {
        return this.notifyViaEmailOnApproval;
    }

    public final long getParentID() {
        return this.parentID;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    public final String getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        return (((((((((this.commentBody.hashCode() * 31) + this.userDisplayName.hashCode()) * 31) + this.userLocation.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.notifyViaEmailOnApproval)) * 31) + Long.hashCode(this.parentID);
    }

    public String toString() {
        return "WriteNewCommentBody(commentBody=" + this.commentBody + ", userDisplayName=" + this.userDisplayName + ", userLocation=" + this.userLocation + ", url=" + this.url + ", notifyViaEmailOnApproval=" + this.notifyViaEmailOnApproval + ", parentID=" + this.parentID + ")";
    }

    public /* synthetic */ WriteNewCommentBody(String str, String str2, String str3, String str4, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0L : j);
    }
}
