package com.nytimes.android.comments.comments.data.remote.getallcomments;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class Comment {
    public static final int $stable = 8;
    private final String approveDate;
    private final String avatarURL;
    private final String commentBody;
    private final long commentID;
    private final boolean editorsSelection;
    private final boolean focusedInThread;
    private final boolean isCommentFlagged;
    private final boolean isRecommended;
    private final boolean isReporterReply;
    private final Long parentID;
    private final String parentUserDisplayName;
    private final int recommendations;
    private final List<Comment> replies;
    private final int replyCount;
    private final String userDisplayName;
    private final String userLocation;
    private final String userTitle;

    public Comment(long j, String str, String str2, String str3, String str4, String str5, String str6, List<Comment> list, boolean z, int i, int i2, Long l, boolean z2, String str7, boolean z3, boolean z4, boolean z5) {
        zq3.h(str, "userDisplayName");
        zq3.h(str3, "userLocation");
        zq3.h(str5, "commentBody");
        zq3.h(str6, "approveDate");
        zq3.h(list, "replies");
        this.commentID = j;
        this.userDisplayName = str;
        this.parentUserDisplayName = str2;
        this.userLocation = str3;
        this.userTitle = str4;
        this.commentBody = str5;
        this.approveDate = str6;
        this.replies = list;
        this.editorsSelection = z;
        this.recommendations = i;
        this.replyCount = i2;
        this.parentID = l;
        this.isReporterReply = z2;
        this.avatarURL = str7;
        this.isCommentFlagged = z3;
        this.isRecommended = z4;
        this.focusedInThread = z5;
    }

    public final long component1() {
        return this.commentID;
    }

    public final int component10() {
        return this.recommendations;
    }

    public final int component11() {
        return this.replyCount;
    }

    public final Long component12() {
        return this.parentID;
    }

    public final boolean component13() {
        return this.isReporterReply;
    }

    public final String component14() {
        return this.avatarURL;
    }

    public final boolean component15() {
        return this.isCommentFlagged;
    }

    public final boolean component16() {
        return this.isRecommended;
    }

    public final boolean component17() {
        return this.focusedInThread;
    }

    public final String component2() {
        return this.userDisplayName;
    }

    public final String component3() {
        return this.parentUserDisplayName;
    }

    public final String component4() {
        return this.userLocation;
    }

    public final String component5() {
        return this.userTitle;
    }

    public final String component6() {
        return this.commentBody;
    }

    public final String component7() {
        return this.approveDate;
    }

    public final List<Comment> component8() {
        return this.replies;
    }

    public final boolean component9() {
        return this.editorsSelection;
    }

    public final Comment copy(long j, String str, String str2, String str3, String str4, String str5, String str6, List<Comment> list, boolean z, int i, int i2, Long l, boolean z2, String str7, boolean z3, boolean z4, boolean z5) {
        zq3.h(str, "userDisplayName");
        zq3.h(str3, "userLocation");
        zq3.h(str5, "commentBody");
        zq3.h(str6, "approveDate");
        zq3.h(list, "replies");
        return new Comment(j, str, str2, str3, str4, str5, str6, list, z, i, i2, l, z2, str7, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        return this.commentID == comment.commentID && zq3.c(this.userDisplayName, comment.userDisplayName) && zq3.c(this.parentUserDisplayName, comment.parentUserDisplayName) && zq3.c(this.userLocation, comment.userLocation) && zq3.c(this.userTitle, comment.userTitle) && zq3.c(this.commentBody, comment.commentBody) && zq3.c(this.approveDate, comment.approveDate) && zq3.c(this.replies, comment.replies) && this.editorsSelection == comment.editorsSelection && this.recommendations == comment.recommendations && this.replyCount == comment.replyCount && zq3.c(this.parentID, comment.parentID) && this.isReporterReply == comment.isReporterReply && zq3.c(this.avatarURL, comment.avatarURL) && this.isCommentFlagged == comment.isCommentFlagged && this.isRecommended == comment.isRecommended && this.focusedInThread == comment.focusedInThread;
    }

    public final String getApproveDate() {
        return this.approveDate;
    }

    public final String getAvatarURL() {
        return this.avatarURL;
    }

    public final String getCommentBody() {
        return this.commentBody;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final boolean getEditorsSelection() {
        return this.editorsSelection;
    }

    public final boolean getFocusedInThread() {
        return this.focusedInThread;
    }

    public final Long getParentID() {
        return this.parentID;
    }

    public final String getParentUserDisplayName() {
        return this.parentUserDisplayName;
    }

    public final int getRecommendations() {
        return this.recommendations;
    }

    public final List<Comment> getReplies() {
        return this.replies;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    public final String getUserLocation() {
        return this.userLocation;
    }

    public final String getUserTitle() {
        return this.userTitle;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.commentID) * 31) + this.userDisplayName.hashCode()) * 31;
        String str = this.parentUserDisplayName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.userLocation.hashCode()) * 31;
        String str2 = this.userTitle;
        int hashCode3 = (((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.commentBody.hashCode()) * 31) + this.approveDate.hashCode()) * 31) + this.replies.hashCode()) * 31) + Boolean.hashCode(this.editorsSelection)) * 31) + Integer.hashCode(this.recommendations)) * 31) + Integer.hashCode(this.replyCount)) * 31;
        Long l = this.parentID;
        int hashCode4 = (((hashCode3 + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.isReporterReply)) * 31;
        String str3 = this.avatarURL;
        return ((((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCommentFlagged)) * 31) + Boolean.hashCode(this.isRecommended)) * 31) + Boolean.hashCode(this.focusedInThread);
    }

    public final boolean isCommentFlagged() {
        return this.isCommentFlagged;
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public final boolean isReporterReply() {
        return this.isReporterReply;
    }

    public String toString() {
        return "Comment(commentID=" + this.commentID + ", userDisplayName=" + this.userDisplayName + ", parentUserDisplayName=" + this.parentUserDisplayName + ", userLocation=" + this.userLocation + ", userTitle=" + this.userTitle + ", commentBody=" + this.commentBody + ", approveDate=" + this.approveDate + ", replies=" + this.replies + ", editorsSelection=" + this.editorsSelection + ", recommendations=" + this.recommendations + ", replyCount=" + this.replyCount + ", parentID=" + this.parentID + ", isReporterReply=" + this.isReporterReply + ", avatarURL=" + this.avatarURL + ", isCommentFlagged=" + this.isCommentFlagged + ", isRecommended=" + this.isRecommended + ", focusedInThread=" + this.focusedInThread + ")";
    }

    public /* synthetic */ Comment(long j, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, int i, int i2, Long l, boolean z2, String str7, boolean z3, boolean z4, boolean z5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i3 & 16) != 0 ? null : str4, str5, str6, (i3 & 128) != 0 ? i.l() : list, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? 0 : i2, (i3 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : l, (i3 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z2, (i3 & 8192) != 0 ? null : str7, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z3, (32768 & i3) != 0 ? false : z4, (i3 & 65536) != 0 ? false : z5);
    }
}
