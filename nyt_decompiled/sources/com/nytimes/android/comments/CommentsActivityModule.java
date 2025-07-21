package com.nytimes.android.comments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.comments.menu.view.MenuCommentsView;
import com.nytimes.android.comments.menu.view.RealMenuCommentsView;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface CommentsActivityModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final MenuCommentsView provideCommentsView(Activity activity, CommentsStore commentsStore) {
            zq3.h(activity, "activity");
            zq3.h(commentsStore, "commentsStore");
            View inflate = LayoutInflater.from(activity).inflate(R.layout.menu_comments, (ViewGroup) null, false);
            zq3.f(inflate, "null cannot be cast to non-null type com.nytimes.android.comments.menu.view.RealMenuCommentsView");
            RealMenuCommentsView realMenuCommentsView = (RealMenuCommentsView) inflate;
            realMenuCommentsView.setCommentsStore(commentsStore);
            return realMenuCommentsView;
        }
    }
}
