package com.nytimes.android.comments.comments.mvi;

import androidx.lifecycle.q;

/* loaded from: classes4.dex */
public final class CommentsViewModel_HiltModules {

    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract q binds(CommentsViewModel commentsViewModel);
    }

    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.nytimes.android.comments.comments.mvi.CommentsViewModel";
        }
    }

    private CommentsViewModel_HiltModules() {
    }
}
