package com.nytimes.android.comments.comments.data.remote.getallcomments;

import com.nytimes.android.utils.TimeStampUtil;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class CommentKt {
    public static final long COMMENT_ID_EMPTY_STATE = 0;
    private static final long MILLISECOND_PER_SECOND = 1000;
    private static final String REPORTER_REPLY_COMMENT_TYPE = "reporterReply";

    public static final String commenterLocationAndTime(Comment comment) {
        zq3.h(comment, "<this>");
        if (!comment.isReporterReply() || comment.getUserTitle() == null) {
            return comment.getUserLocation() + " ∙ " + comment.getApproveDate();
        }
        return comment.getUserTitle() + " ∙ " + comment.getApproveDate();
    }

    public static final String initial(String str) {
        zq3.h(str, "<this>");
        Character h1 = h.h1(str);
        if (h1 == null) {
            return null;
        }
        String valueOf = String.valueOf(h1.charValue());
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final Comment mapToComment(CommentResponse commentResponse, TimeStampUtil timeStampUtil) {
        zq3.h(commentResponse, "<this>");
        zq3.h(timeStampUtil, "timeStampUtil");
        String userTitle = (commentResponse.getUserTitle().length() <= 0 || zq3.c(commentResponse.getUserTitle(), "NULL")) ? null : commentResponse.getUserTitle();
        long commentID = commentResponse.getCommentID();
        String userDisplayName = commentResponse.getUserDisplayName();
        String parentUserDisplayName = commentResponse.getParentUserDisplayName();
        String userLocation = commentResponse.getUserLocation();
        String F = h.F(commentResponse.getCommentBody(), "\n", "<br>", false, 4, null);
        String z = timeStampUtil.z(new Date(commentResponse.getApproveDate() * MILLISECOND_PER_SECOND), TimeStampUtil.RelativeTimestampType.A11Y);
        List<CommentResponse> replies = commentResponse.getReplies();
        ArrayList arrayList = new ArrayList(i.w(replies, 10));
        Iterator<T> it2 = replies.iterator();
        while (it2.hasNext()) {
            arrayList.add(mapToComment((CommentResponse) it2.next(), timeStampUtil));
        }
        return new Comment(commentID, userDisplayName, parentUserDisplayName, userLocation, userTitle, F, z, arrayList, commentResponse.getEditorsSelection(), commentResponse.getRecommendations(), commentResponse.getReplyCount(), commentResponse.getParentID(), zq3.c(commentResponse.getCommentType(), REPORTER_REPLY_COMMENT_TYPE), commentResponse.getPicURL(), false, commentResponse.getRecommendedFlag() == 1, false, 65536, null);
    }
}
