package com.nytimes.android.notification;

import android.content.Context;
import android.content.Intent;
import defpackage.os3;
import defpackage.q95;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NotificationParsingJobService extends com.nytimes.android.notification.a {
    public static final a Companion = new a(null);
    public q95 notificationIntentParser;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Intent intent) {
            zq3.h(context, "context");
            zq3.h(intent, "work");
            os3.d(context, NotificationParsingJobService.class, 100698, intent);
        }

        private a() {
        }
    }

    @Override // defpackage.os3
    protected void g(Intent intent) {
        zq3.h(intent, "intent");
        m().a(intent);
    }

    public final q95 m() {
        q95 q95Var = this.notificationIntentParser;
        if (q95Var != null) {
            return q95Var;
        }
        zq3.z("notificationIntentParser");
        return null;
    }
}
