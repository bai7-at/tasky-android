package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import defpackage.ba2;
import defpackage.g16;
import defpackage.gr4;

/* loaded from: classes4.dex */
public abstract class f implements ba2 {
    public static gr4 a(MessagingArchitectureDatabase messagingArchitectureDatabase) {
        return (gr4) g16.e(LibsMessagingArchitectureModule.Companion.f(messagingArchitectureDatabase));
    }
}
