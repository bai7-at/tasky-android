package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import defpackage.ba2;
import defpackage.cr4;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class b implements ba2 {
    public static cr4 a(MessagingArchitectureDatabase messagingArchitectureDatabase) {
        return (cr4) g16.e(LibsMessagingArchitectureModule.Companion.b(messagingArchitectureDatabase));
    }
}
