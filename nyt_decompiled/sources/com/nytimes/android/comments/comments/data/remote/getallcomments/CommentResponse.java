package com.nytimes.android.comments.comments.data.remote.getallcomments;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class CommentResponse {
    public static final int $stable = 8;
    private final int approveDate;
    private final String commentBody;
    private final long commentID;
    private final Integer commentSequence;
    private final String commentTitle;
    private final String commentType;
    private final long createDate;
    private final Integer depth;
    private final boolean editorsSelection;
    private final Long parentID;
    private final String parentUserDisplayName;
    private final String permID;
    private final String picURL;
    private final int recommendations;
    private final int recommendedFlag;
    private final List<CommentResponse> replies;
    private final int replyCount;
    private final int reportAbuseFlag;
    private final Integer sharing;
    private final String status;
    private final Long timespeople;
    private final Integer trusted;
    private final long updateDate;
    private final String userDisplayName;
    private final Integer userID;
    private final String userLocation;
    private final String userTitle;
    private final String userURL;

    public CommentResponse(Integer num, String str, String str2, String str3, String str4, Integer num2, long j, String str5, Integer num3, String str6, String str7, long j2, long j3, int i, int i2, int i3, List<CommentResponse> list, boolean z, Long l, String str8, Integer num4, String str9, int i4, int i5, String str10, String str11, Long l2, Integer num5) {
        zq3.h(str, "userDisplayName");
        zq3.h(str2, "userLocation");
        zq3.h(str3, "userTitle");
        zq3.h(str7, "commentBody");
        zq3.h(list, "replies");
        this.userID = num;
        this.userDisplayName = str;
        this.userLocation = str2;
        this.userTitle = str3;
        this.userURL = str4;
        this.trusted = num2;
        this.commentID = j;
        this.status = str5;
        this.commentSequence = num3;
        this.commentTitle = str6;
        this.commentBody = str7;
        this.createDate = j2;
        this.updateDate = j3;
        this.approveDate = i;
        this.recommendations = i2;
        this.replyCount = i3;
        this.replies = list;
        this.editorsSelection = z;
        this.parentID = l;
        this.parentUserDisplayName = str8;
        this.depth = num4;
        this.commentType = str9;
        this.recommendedFlag = i4;
        this.reportAbuseFlag = i5;
        this.permID = str10;
        this.picURL = str11;
        this.timespeople = l2;
        this.sharing = num5;
    }

    public final Integer component1() {
        return this.userID;
    }

    public final String component10() {
        return this.commentTitle;
    }

    public final String component11() {
        return this.commentBody;
    }

    public final long component12() {
        return this.createDate;
    }

    public final long component13() {
        return this.updateDate;
    }

    public final int component14() {
        return this.approveDate;
    }

    public final int component15() {
        return this.recommendations;
    }

    public final int component16() {
        return this.replyCount;
    }

    public final List<CommentResponse> component17() {
        return this.replies;
    }

    public final boolean component18() {
        return this.editorsSelection;
    }

    public final Long component19() {
        return this.parentID;
    }

    public final String component2() {
        return this.userDisplayName;
    }

    public final String component20() {
        return this.parentUserDisplayName;
    }

    public final Integer component21() {
        return this.depth;
    }

    public final String component22() {
        return this.commentType;
    }

    public final int component23() {
        return this.recommendedFlag;
    }

    public final int component24() {
        return this.reportAbuseFlag;
    }

    public final String component25() {
        return this.permID;
    }

    public final String component26() {
        return this.picURL;
    }

    public final Long component27() {
        return this.timespeople;
    }

    public final Integer component28() {
        return this.sharing;
    }

    public final String component3() {
        return this.userLocation;
    }

    public final String component4() {
        return this.userTitle;
    }

    public final String component5() {
        return this.userURL;
    }

    public final Integer component6() {
        return this.trusted;
    }

    public final long component7() {
        return this.commentID;
    }

    public final String component8() {
        return this.status;
    }

    public final Integer component9() {
        return this.commentSequence;
    }

    public final CommentResponse copy(Integer num, String str, String str2, String str3, String str4, Integer num2, long j, String str5, Integer num3, String str6, String str7, long j2, long j3, int i, int i2, int i3, List<CommentResponse> list, boolean z, Long l, String str8, Integer num4, String str9, int i4, int i5, String str10, String str11, Long l2, Integer num5) {
        zq3.h(str, "userDisplayName");
        zq3.h(str2, "userLocation");
        zq3.h(str3, "userTitle");
        zq3.h(str7, "commentBody");
        zq3.h(list, "replies");
        return new CommentResponse(num, str, str2, str3, str4, num2, j, str5, num3, str6, str7, j2, j3, i, i2, i3, list, z, l, str8, num4, str9, i4, i5, str10, str11, l2, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentResponse)) {
            return false;
        }
        CommentResponse commentResponse = (CommentResponse) obj;
        return zq3.c(this.userID, commentResponse.userID) && zq3.c(this.userDisplayName, commentResponse.userDisplayName) && zq3.c(this.userLocation, commentResponse.userLocation) && zq3.c(this.userTitle, commentResponse.userTitle) && zq3.c(this.userURL, commentResponse.userURL) && zq3.c(this.trusted, commentResponse.trusted) && this.commentID == commentResponse.commentID && zq3.c(this.status, commentResponse.status) && zq3.c(this.commentSequence, commentResponse.commentSequence) && zq3.c(this.commentTitle, commentResponse.commentTitle) && zq3.c(this.commentBody, commentResponse.commentBody) && this.createDate == commentResponse.createDate && this.updateDate == commentResponse.updateDate && this.approveDate == commentResponse.approveDate && this.recommendations == commentResponse.recommendations && this.replyCount == commentResponse.replyCount && zq3.c(this.replies, commentResponse.replies) && this.editorsSelection == commentResponse.editorsSelection && zq3.c(this.parentID, commentResponse.parentID) && zq3.c(this.parentUserDisplayName, commentResponse.parentUserDisplayName) && zq3.c(this.depth, commentResponse.depth) && zq3.c(this.commentType, commentResponse.commentType) && this.recommendedFlag == commentResponse.recommendedFlag && this.reportAbuseFlag == commentResponse.reportAbuseFlag && zq3.c(this.permID, commentResponse.permID) && zq3.c(this.picURL, commentResponse.picURL) && zq3.c(this.timespeople, commentResponse.timespeople) && zq3.c(this.sharing, commentResponse.sharing);
    }

    public final int getApproveDate() {
        return this.approveDate;
    }

    public final String getCommentBody() {
        return this.commentBody;
    }

    public final long getCommentID() {
        return this.commentID;
    }

    public final Integer getCommentSequence() {
        return this.commentSequence;
    }

    public final String getCommentTitle() {
        return this.commentTitle;
    }

    public final String getCommentType() {
        return this.commentType;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final Integer getDepth() {
        return this.depth;
    }

    public final boolean getEditorsSelection() {
        return this.editorsSelection;
    }

    public final Long getParentID() {
        return this.parentID;
    }

    public final String getParentUserDisplayName() {
        return this.parentUserDisplayName;
    }

    public final String getPermID() {
        return this.permID;
    }

    public final String getPicURL() {
        return this.picURL;
    }

    public final int getRecommendations() {
        return this.recommendations;
    }

    public final int getRecommendedFlag() {
        return this.recommendedFlag;
    }

    public final List<CommentResponse> getReplies() {
        return this.replies;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final int getReportAbuseFlag() {
        return this.reportAbuseFlag;
    }

    public final Integer getSharing() {
        return this.sharing;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Long getTimespeople() {
        return this.timespeople;
    }

    public final Integer getTrusted() {
        return this.trusted;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    public final Integer getUserID() {
        return this.userID;
    }

    public final String getUserLocation() {
        return this.userLocation;
    }

    public final String getUserTitle() {
        return this.userTitle;
    }

    public final String getUserURL() {
        return this.userURL;
    }

    public int hashCode() {
        Integer num = this.userID;
        int hashCode = (((((((num == null ? 0 : num.hashCode()) * 31) + this.userDisplayName.hashCode()) * 31) + this.userLocation.hashCode()) * 31) + this.userTitle.hashCode()) * 31;
        String str = this.userURL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.trusted;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Long.hashCode(this.commentID)) * 31;
        String str2 = this.status;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.commentSequence;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.commentTitle;
        int hashCode6 = (((((((((((((((((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.commentBody.hashCode()) * 31) + Long.hashCode(this.createDate)) * 31) + Long.hashCode(this.updateDate)) * 31) + Integer.hashCode(this.approveDate)) * 31) + Integer.hashCode(this.recommendations)) * 31) + Integer.hashCode(this.replyCount)) * 31) + this.replies.hashCode()) * 31) + Boolean.hashCode(this.editorsSelection)) * 31;
        Long l = this.parentID;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.parentUserDisplayName;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.depth;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.commentType;
        int hashCode10 = (((((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.recommendedFlag)) * 31) + Integer.hashCode(this.reportAbuseFlag)) * 31;
        String str6 = this.permID;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.picURL;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.timespeople;
        int hashCode13 = (hashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.sharing;
        return hashCode13 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        return "CommentResponse(userID=" + this.userID + ", userDisplayName=" + this.userDisplayName + ", userLocation=" + this.userLocation + ", userTitle=" + this.userTitle + ", userURL=" + this.userURL + ", trusted=" + this.trusted + ", commentID=" + this.commentID + ", status=" + this.status + ", commentSequence=" + this.commentSequence + ", commentTitle=" + this.commentTitle + ", commentBody=" + this.commentBody + ", createDate=" + this.createDate + ", updateDate=" + this.updateDate + ", approveDate=" + this.approveDate + ", recommendations=" + this.recommendations + ", replyCount=" + this.replyCount + ", replies=" + this.replies + ", editorsSelection=" + this.editorsSelection + ", parentID=" + this.parentID + ", parentUserDisplayName=" + this.parentUserDisplayName + ", depth=" + this.depth + ", commentType=" + this.commentType + ", recommendedFlag=" + this.recommendedFlag + ", reportAbuseFlag=" + this.reportAbuseFlag + ", permID=" + this.permID + ", picURL=" + this.picURL + ", timespeople=" + this.timespeople + ", sharing=" + this.sharing + ")";
    }

    public /* synthetic */ CommentResponse(Integer num, String str, String str2, String str3, String str4, Integer num2, long j, String str5, Integer num3, String str6, String str7, long j2, long j3, int i, int i2, int i3, List list, boolean z, Long l, String str8, Integer num4, String str9, int i4, int i5, String str10, String str11, Long l2, Integer num5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : num, str, str2, str3, (i6 & 16) != 0 ? null : str4, (i6 & 32) != 0 ? null : num2, j, (i6 & 128) != 0 ? null : str5, (i6 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : num3, (i6 & 512) != 0 ? null : str6, str7, j2, j3, i, (i6 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i2, (32768 & i6) != 0 ? 0 : i3, (65536 & i6) != 0 ? i.l() : list, (131072 & i6) != 0 ? false : z, (262144 & i6) != 0 ? null : l, (524288 & i6) != 0 ? null : str8, (1048576 & i6) != 0 ? null : num4, (2097152 & i6) != 0 ? null : str9, (4194304 & i6) != 0 ? 0 : i4, (8388608 & i6) != 0 ? 0 : i5, (16777216 & i6) != 0 ? null : str10, (33554432 & i6) != 0 ? null : str11, (67108864 & i6) != 0 ? null : l2, (i6 & 134217728) != 0 ? null : num5);
    }
}
