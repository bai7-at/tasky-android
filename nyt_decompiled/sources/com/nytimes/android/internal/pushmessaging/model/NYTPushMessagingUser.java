package com.nytimes.android.internal.pushmessaging.model;

import defpackage.et3;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Cookie;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NYTPushMessagingUser {
    public static final a Companion = new a(null);
    private final String a;
    private final int b;
    private final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NYTPushMessagingUser a(Cookie cookie, int i, String str) {
            zq3.h(str, "advertisingId");
            return b(cookie != null ? b0.d(cookie) : null, i, str);
        }

        public final NYTPushMessagingUser b(Set set, int i, String str) {
            zq3.h(str, "advertisingId");
            return new NYTPushMessagingUser((set == null || !(set.isEmpty() ^ true)) ? null : i.u0(set, "; ", null, null, 0, null, null, 62, null), i, str);
        }

        private a() {
        }
    }

    public NYTPushMessagingUser(String str, int i, String str2) {
        zq3.h(str2, "advertisingId");
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NYTPushMessagingUser)) {
            return false;
        }
        NYTPushMessagingUser nYTPushMessagingUser = (NYTPushMessagingUser) obj;
        return zq3.c(this.a, nYTPushMessagingUser.a) && this.b == nYTPushMessagingUser.b && zq3.c(this.c, nYTPushMessagingUser.c);
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "NYTPushMessagingUser(cookie=" + this.a + ", regiId=" + this.b + ", advertisingId=" + this.c + ")";
    }

    public /* synthetic */ NYTPushMessagingUser(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
