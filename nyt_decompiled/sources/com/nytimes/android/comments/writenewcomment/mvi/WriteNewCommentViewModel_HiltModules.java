package com.nytimes.android.comments.writenewcomment.mvi;

import androidx.lifecycle.q;

/* loaded from: classes4.dex */
public final class WriteNewCommentViewModel_HiltModules {

    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract q binds(WriteNewCommentViewModel writeNewCommentViewModel);
    }

    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel";
        }
    }

    private WriteNewCommentViewModel_HiltModules() {
    }
}
