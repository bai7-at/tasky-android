package com.nytimes.android.comments.comments.mvi.navigation;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ViewCommentsScreen {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String route;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewCommentsScreen from(String str) {
            ViewCommentsScreen viewCommentsScreen = ViewComments.INSTANCE;
            if (!zq3.c(str, viewCommentsScreen.getRoute())) {
                viewCommentsScreen = ViewCommentThread.INSTANCE;
                if (!zq3.c(str, viewCommentsScreen.getRoute())) {
                    throw new IllegalStateException(("Unknown route: " + str + " - Please use ViewingCommentsActivity.newIntent(args...)").toString());
                }
            }
            return viewCommentsScreen;
        }

        private Companion() {
        }
    }

    public static final class ViewCommentThread extends ViewCommentsScreen {
        public static final int $stable = 0;
        public static final ViewCommentThread INSTANCE = new ViewCommentThread();

        private ViewCommentThread() {
            super("thread", null);
        }
    }

    public static final class ViewComments extends ViewCommentsScreen {
        public static final int $stable = 0;
        public static final ViewComments INSTANCE = new ViewComments();

        private ViewComments() {
            super("comments", null);
        }
    }

    public /* synthetic */ ViewCommentsScreen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getRoute() {
        return this.route;
    }

    private ViewCommentsScreen(String str) {
        this.route = str;
    }
}
