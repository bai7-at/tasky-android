package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import defpackage.b4;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class c implements ba2 {
    public static b4 a(MessagingArchitectureDatabase messagingArchitectureDatabase) {
        return (b4) g16.e(LibsMessagingArchitectureModule.Companion.c(messagingArchitectureDatabase));
    }
}
