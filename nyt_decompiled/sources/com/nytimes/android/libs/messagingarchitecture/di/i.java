package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import defpackage.ba2;
import defpackage.g16;
import defpackage.qg0;

/* loaded from: classes4.dex */
public abstract class i implements ba2 {
    public static qg0 a(MessagingArchitectureDatabase messagingArchitectureDatabase) {
        return (qg0) g16.e(LibsMessagingArchitectureModule.Companion.i(messagingArchitectureDatabase));
    }
}
