package com.nytimes.android.comments.writenewcomment.mvi;

import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel_HiltModules;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes4.dex */
public final class WriteNewCommentViewModel_HiltModules_KeyModule_ProvideFactory implements ba2 {

    private static final class InstanceHolder {
        private static final WriteNewCommentViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WriteNewCommentViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static WriteNewCommentViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) g16.e(WriteNewCommentViewModel_HiltModules.KeyModule.provide());
    }

    @Override // defpackage.p76
    public String get() {
        return provide();
    }
}
