package com.nytimes.android.comments.comments.mvi;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsScreen;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ViewingCommentsActivityKt {
    public static final int ANIMATION_TRANSITION_DURATION_MILLIS = 700;

    public static final Intent openWriteNewCommentActivity(ViewingCommentsActivity viewingCommentsActivity, boolean z, String str, String str2, Long l) {
        zq3.h(viewingCommentsActivity, "<this>");
        zq3.h(str, "articleUrl");
        Intent intent = new Intent(viewingCommentsActivity, (Class<?>) WriteNewCommentActivity.class);
        intent.putExtra("com.nytimes.android.extra.ASSET_URL", str);
        intent.putExtra(WriteNewCommentViewModel.WRITE_NEW_COMMENT_IS_REPLY, z);
        if (str2 != null) {
            intent.putExtra(WriteNewCommentViewModel.WRITE_NEW_COMMENT_REPLY_NAME, str2);
        }
        if (l != null) {
            intent.putExtra(WriteNewCommentViewModel.WRITE_NEW_COMMENT_PARENT_COMMENT_ID, l.longValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent openWriteNewCommentActivity$default(ViewingCommentsActivity viewingCommentsActivity, boolean z, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        return openWriteNewCommentActivity(viewingCommentsActivity, z, str, str2, l);
    }

    public static final void startScreen(Context context, ViewCommentsScreen viewCommentsScreen, String str, String str2) {
        Intent newIntent;
        zq3.h(context, "<this>");
        zq3.h(viewCommentsScreen, "screen");
        zq3.h(str, "articleUrl");
        zq3.h(str2, "totalComments");
        newIntent = ViewingCommentsActivity.Companion.newIntent(context, viewCommentsScreen, str, str, str2, 0L, (r19 & 64) != 0 ? false : false);
        context.startActivity(newIntent);
    }

    public static /* synthetic */ void startScreen$default(Context context, ViewCommentsScreen viewCommentsScreen, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            viewCommentsScreen = ViewCommentsScreen.ViewComments.INSTANCE;
        }
        startScreen(context, viewCommentsScreen, str, str2);
    }
}
