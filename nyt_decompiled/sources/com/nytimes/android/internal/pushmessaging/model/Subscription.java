package com.nytimes.android.internal.pushmessaging.model;

import com.nytimes.android.internal.pushmessaging.model.a;
import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import defpackage.et3;
import defpackage.qs2;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Subscription {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final Set b;
    private final int c;
    private final String d;
    private final boolean e;
    private final String f;
    private final int g;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Subscription a(PushSubscriptionAPI.HelixResponse helixResponse, String str, a aVar) {
            PushSubscriptionAPI.HelixResponseResult helixResponseResult;
            zq3.h(helixResponse, "response");
            zq3.h(str, "appVersion");
            zq3.h(aVar, "environment");
            if (!helixResponse.c()) {
                throw new IllegalStateException("Can't create subscription: invalid response");
            }
            List a = helixResponse.a();
            if (a == null || (helixResponseResult = (PushSubscriptionAPI.HelixResponseResult) a.get(0)) == null) {
                throw new IllegalStateException(new qs2() { // from class: com.nytimes.android.internal.pushmessaging.model.Subscription$Companion$fromHelixResponse$result$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Can't create subscription: no result";
                    }
                }.toString());
            }
            return new Subscription(helixResponseResult.a(), i.c1(helixResponseResult.c()), helixResponseResult.b(), str, true, aVar.c(), 0, 64, null);
        }

        private Companion() {
        }
    }

    public Subscription(String str, Set set, int i, String str2, boolean z, String str3, int i2) {
        zq3.h(str, "token");
        zq3.h(set, "tags");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "environment");
        this.a = str;
        this.b = set;
        this.c = i;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = i2;
        if (i2 != 0) {
            throw new IllegalStateException("There should only be one subscription");
        }
    }

    public static /* synthetic */ Subscription b(Subscription subscription, String str, Set set, int i, String str2, boolean z, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = subscription.a;
        }
        if ((i3 & 2) != 0) {
            set = subscription.b;
        }
        Set set2 = set;
        if ((i3 & 4) != 0) {
            i = subscription.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = subscription.d;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            z = subscription.e;
        }
        boolean z2 = z;
        if ((i3 & 32) != 0) {
            str3 = subscription.f;
        }
        String str5 = str3;
        if ((i3 & 64) != 0) {
            i2 = subscription.g;
        }
        return subscription.a(str, set2, i4, str4, z2, str5, i2);
    }

    public final Subscription a(String str, Set set, int i, String str2, boolean z, String str3, int i2) {
        zq3.h(str, "token");
        zq3.h(set, "tags");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "environment");
        return new Subscription(str, set, i, str2, z, str3, i2);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return zq3.c(this.a, subscription.a) && zq3.c(this.b, subscription.b) && this.c == subscription.c && zq3.c(this.d, subscription.d) && this.e == subscription.e && zq3.c(this.f, subscription.f) && this.g == subscription.g;
    }

    public final int f() {
        return this.c;
    }

    public final Set g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g);
    }

    public final boolean i() {
        return this.e;
    }

    public String toString() {
        return "Subscription(token=" + this.a + ", tags=" + this.b + ", regiId=" + this.c + ", appVersion=" + this.d + ", isReady=" + this.e + ", environment=" + this.f + ", id=" + this.g + ")";
    }

    public /* synthetic */ Subscription(String str, Set set, int i, String str2, boolean z, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, i, str2, z, (i3 & 32) != 0 ? a.c.d.c() : str3, (i3 & 64) != 0 ? 0 : i2);
    }
}
