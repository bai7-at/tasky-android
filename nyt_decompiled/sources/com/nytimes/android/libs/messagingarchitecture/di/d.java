package com.nytimes.android.libs.messagingarchitecture.di;

import android.app.Application;
import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class d implements ba2 {
    public static MessagingArchitectureDatabase a(Application application) {
        return (MessagingArchitectureDatabase) g16.e(LibsMessagingArchitectureModule.Companion.d(application));
    }
}
