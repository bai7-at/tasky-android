package com.nytimes.android.comments.writenewcomment.data.local;

import defpackage.ba1;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class WriteNewCommentPreferencesDataStore_Factory implements ba2 {
    private final p76 preferenceStoreProvider;

    public WriteNewCommentPreferencesDataStore_Factory(p76 p76Var) {
        this.preferenceStoreProvider = p76Var;
    }

    public static WriteNewCommentPreferencesDataStore_Factory create(p76 p76Var) {
        return new WriteNewCommentPreferencesDataStore_Factory(p76Var);
    }

    public static WriteNewCommentPreferencesDataStore newInstance(ba1 ba1Var) {
        return new WriteNewCommentPreferencesDataStore(ba1Var);
    }

    @Override // defpackage.p76
    public WriteNewCommentPreferencesDataStore get() {
        return newInstance((ba1) this.preferenceStoreProvider.get());
    }
}
