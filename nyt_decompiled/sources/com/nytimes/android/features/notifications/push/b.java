package com.nytimes.android.features.notifications.push;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: com.nytimes.android.features.notifications.push.b$b, reason: collision with other inner class name */
    public static final class C0291b extends b {
        private final NotificationsChannel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0291b(NotificationsChannel notificationsChannel) {
            super(null);
            zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
            this.a = notificationsChannel;
        }
    }

    public static final class c extends b {
        private final NotificationsGroupItems a;
        private final NotificationsChannel b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel, boolean z) {
            super(null);
            zq3.h(notificationsGroupItems, "group");
            zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
            this.a = notificationsGroupItems;
            this.b = notificationsChannel;
            this.c = z;
        }

        public final NotificationsChannel a() {
            return this.b;
        }

        public final NotificationsGroupItems b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
