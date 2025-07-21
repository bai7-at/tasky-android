package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore;
import com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater;
import defpackage.ba2;
import defpackage.g16;
import defpackage.wn1;
import defpackage.xr4;

/* loaded from: classes4.dex */
public abstract class e implements ba2 {
    public static wn1 a(xr4 xr4Var, MessageQueueUpdater messageQueueUpdater, MessagePreferencesStore messagePreferencesStore) {
        return (wn1) g16.e(LibsMessagingArchitectureModule.Companion.e(xr4Var, messageQueueUpdater, messagePreferencesStore));
    }
}
