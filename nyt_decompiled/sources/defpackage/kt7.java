package defpackage;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity;
import com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsScreen;

/* loaded from: classes4.dex */
public final class kt7 {
    public static final kt7 a = new kt7();

    private kt7() {
    }

    public final Intent a(Context context, String str, String str2, long j, boolean z) {
        zq3.h(context, "context");
        zq3.h(str2, "assetUrl");
        return ViewingCommentsActivity.Companion.newIntent(context, j != 0 ? ViewCommentsScreen.ViewCommentThread.INSTANCE : ViewCommentsScreen.ViewComments.INSTANCE, str2, str, "", j, z);
    }
}
