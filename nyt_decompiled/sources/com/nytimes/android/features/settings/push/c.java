package com.nytimes.android.features.settings.push;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.push.NotificationsChannel;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c {

    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends c {
        private final NotificationsChannel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NotificationsChannel notificationsChannel) {
            super(null);
            zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
            this.a = notificationsChannel;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
