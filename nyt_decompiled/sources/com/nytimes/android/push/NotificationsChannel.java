package com.nytimes.android.push;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.config.model.Channel;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@lk7
/* loaded from: classes4.dex */
public final class NotificationsChannel {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;
    private boolean d;
    private final Channel e;
    private final String f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationsChannel a(Channel channel, boolean z) {
            zq3.h(channel, AppsFlyerProperties.CHANNEL);
            return new NotificationsChannel(channel.getTag(), channel.getTitle(), channel.getTagDescription(), z, channel, null);
        }

        public final KSerializer serializer() {
            return NotificationsChannel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotificationsChannel(int i, String str, String str2, String str3, boolean z, Channel channel, String str4, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, NotificationsChannel$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = (i & 8) == 0 ? false : z;
        if ((i & 16) == 0) {
            this.e = new Channel(false, false, str, str3, str2, (String) null, (String) null, 99, (DefaultConstructorMarker) null);
        } else {
            this.e = channel;
        }
        this.f = (i & 32) == 0 ? null : str4;
    }

    public static /* synthetic */ NotificationsChannel b(NotificationsChannel notificationsChannel, String str, String str2, String str3, boolean z, Channel channel, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationsChannel.a;
        }
        if ((i & 2) != 0) {
            str2 = notificationsChannel.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = notificationsChannel.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = notificationsChannel.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            channel = notificationsChannel.e;
        }
        Channel channel2 = channel;
        if ((i & 32) != 0) {
            str4 = notificationsChannel.f;
        }
        return notificationsChannel.a(str, str5, str6, z2, channel2, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (defpackage.zq3.c(r13.e, new com.nytimes.android.api.config.model.Channel(false, false, r13.a, r13.c, r13.b, (java.lang.String) null, (java.lang.String) null, 99, (kotlin.jvm.internal.DefaultConstructorMarker) null)) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void i(com.nytimes.android.push.NotificationsChannel r13, kotlinx.serialization.encoding.d r14, kotlinx.serialization.descriptors.SerialDescriptor r15) {
        /*
            java.lang.String r0 = r13.a
            r1 = 0
            r14.y(r15, r1, r0)
            r0 = 1
            java.lang.String r1 = r13.b
            r14.y(r15, r0, r1)
            r0 = 2
            java.lang.String r1 = r13.c
            r14.y(r15, r0, r1)
            r0 = 3
            boolean r1 = r14.A(r15, r0)
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            boolean r1 = r13.d
            if (r1 == 0) goto L23
        L1e:
            boolean r1 = r13.d
            r14.x(r15, r0, r1)
        L23:
            r0 = 4
            boolean r1 = r14.A(r15, r0)
            if (r1 == 0) goto L2b
            goto L46
        L2b:
            com.nytimes.android.api.config.model.Channel r1 = r13.e
            com.nytimes.android.api.config.model.Channel r12 = new com.nytimes.android.api.config.model.Channel
            java.lang.String r5 = r13.a
            java.lang.String r6 = r13.c
            java.lang.String r7 = r13.b
            r10 = 99
            r11 = 0
            r3 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = defpackage.zq3.c(r1, r12)
            if (r1 != 0) goto L4d
        L46:
            com.nytimes.android.api.config.model.Channel$$serializer r1 = com.nytimes.android.api.config.model.Channel$$serializer.INSTANCE
            com.nytimes.android.api.config.model.Channel r2 = r13.e
            r14.z(r15, r0, r1, r2)
        L4d:
            r0 = 5
            boolean r1 = r14.A(r15, r0)
            if (r1 == 0) goto L55
            goto L59
        L55:
            java.lang.String r1 = r13.f
            if (r1 == 0) goto L60
        L59:
            l48 r1 = defpackage.l48.a
            java.lang.String r13 = r13.f
            r14.l(r15, r0, r1, r13)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.NotificationsChannel.i(com.nytimes.android.push.NotificationsChannel, kotlinx.serialization.encoding.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final NotificationsChannel a(String str, String str2, String str3, boolean z, Channel channel, String str4) {
        zq3.h(str, "tag");
        zq3.h(str2, "title");
        zq3.h(str3, "description");
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        return new NotificationsChannel(str, str2, str3, z, channel, str4);
    }

    public final Channel c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsChannel)) {
            return false;
        }
        NotificationsChannel notificationsChannel = (NotificationsChannel) obj;
        return zq3.c(this.a, notificationsChannel.a) && zq3.c(this.b, notificationsChannel.b) && zq3.c(this.c, notificationsChannel.c) && this.d == notificationsChannel.d && zq3.c(this.e, notificationsChannel.e) && zq3.c(this.f, notificationsChannel.f);
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.d;
    }

    public final void h(boolean z) {
        this.d = z;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NotificationsChannel(tag=" + this.a + ", title=" + this.b + ", description=" + this.c + ", isSubscribed=" + this.d + ", channel=" + this.e + ", iconUrl=" + this.f + ")";
    }

    public NotificationsChannel(String str, String str2, String str3, boolean z, Channel channel, String str4) {
        zq3.h(str, "tag");
        zq3.h(str2, "title");
        zq3.h(str3, "description");
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = channel;
        this.f = str4;
    }

    public /* synthetic */ NotificationsChannel(String str, String str2, String str3, boolean z, Channel channel, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new Channel(false, false, str, str3, str2, (String) null, (String) null, 99, (DefaultConstructorMarker) null) : channel, (i & 32) != 0 ? null : str4);
    }
}
