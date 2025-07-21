package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import defpackage.b34;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class a implements ba2 {
    public static b34 a(MessagingArchitectureDatabase messagingArchitectureDatabase) {
        return (b34) g16.e(LibsMessagingArchitectureModule.Companion.a(messagingArchitectureDatabase));
    }
}
