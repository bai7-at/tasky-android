package com.nytimes.android.internal.pushmessaging;

import android.app.Application;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import com.nytimes.android.internal.pushmessaging.model.a;
import defpackage.a15;
import defpackage.by0;
import defpackage.ca6;
import defpackage.f61;
import defpackage.k71;
import defpackage.r82;
import defpackage.zq3;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public interface PushMessaging {
    public static final b Companion = b.a;

    public static final class FailedToAddRemoveTagsException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToAddRemoveTagsException(String str) {
            super(str);
            zq3.h(str, "reason");
        }
    }

    public static final class FailedToUnregisterException extends RuntimeException {
    }

    public static final class a {
        private final Application a;
        private final c b;
        private a15 c;
        private r82 d;
        private String e;
        private CoroutineScope f;

        /* renamed from: com.nytimes.android.internal.pushmessaging.PushMessaging$a$a, reason: collision with other inner class name */
        public static final class C0332a implements a15 {
            C0332a() {
            }

            @Override // defpackage.a15
            public Flow a() {
                return FlowKt.flowOf(new NYTPushMessagingUser(null, 0, null, 7, null));
            }
        }

        public a(Application application) {
            zq3.h(application, "context");
            this.a = application;
            this.b = new c("", null, null, null, 0L, 30, null);
            String str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            this.e = str == null ? "0" : str;
            this.f = GlobalScope.INSTANCE;
        }

        public final a a(String str) {
            zq3.h(str, "appId");
            this.b.f(str);
            return this;
        }

        public final a b(String str) {
            zq3.h(str, "appVersion");
            this.e = str;
            return this;
        }

        public final PushMessaging c() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (h.d0(this.b.a())) {
                linkedHashSet.add("appId");
            }
            if (this.d == null) {
                linkedHashSet.add("fcmTokenProvider");
            }
            if (linkedHashSet.size() != 0) {
                throw new IllegalStateException(("Builder requires " + i.u0(linkedHashSet, null, null, null, 0, null, null, 63, null)).toString());
            }
            f61 f61Var = f61.a;
            ca6.a f = k71.a().a(this.a).f(this.b);
            a15 a15Var = this.c;
            if (a15Var == null) {
                a15Var = new C0332a();
            }
            ca6.a d = f.d(a15Var);
            r82 r82Var = this.d;
            zq3.e(r82Var);
            f61Var.b(d.e(r82Var).b(this.e).c(this.f).build());
            return f61Var.a().a();
        }

        public final a d(com.nytimes.android.internal.pushmessaging.model.a aVar) {
            zq3.h(aVar, "environment");
            this.b.g(aVar);
            return this;
        }

        public final a e(r82 r82Var) {
            this.d = r82Var;
            return this;
        }

        public final a f(Subscription subscription) {
            zq3.h(subscription, "migratedSubscription");
            this.b.h(subscription);
            return this;
        }

        public final a g(a15 a15Var) {
            zq3.h(a15Var, "nytPushMessagingUserProvider");
            this.c = a15Var;
            return this;
        }

        public final a h(Set set) {
            zq3.h(set, "tags");
            this.b.i(set);
            return this;
        }
    }

    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    Object a(Set set, by0 by0Var);

    Flow b();

    Object c(Set set, by0 by0Var);

    public static final class c {
        public static final a Companion = new a(null);
        private String a;
        private com.nytimes.android.internal.pushmessaging.model.a b;
        private Set c;
        private Subscription d;
        private long e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(String str, com.nytimes.android.internal.pushmessaging.model.a aVar, Set set, Subscription subscription, long j) {
            zq3.h(str, "appId");
            zq3.h(aVar, "environment");
            this.a = str;
            this.b = aVar;
            this.c = set;
            this.d = subscription;
            this.e = j;
        }

        public final String a() {
            return this.a;
        }

        public final com.nytimes.android.internal.pushmessaging.model.a b() {
            return this.b;
        }

        public final Subscription c() {
            return this.d;
        }

        public final long d() {
            return this.e;
        }

        public final Set e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d) && this.e == cVar.e;
        }

        public final void f(String str) {
            zq3.h(str, "<set-?>");
            this.a = str;
        }

        public final void g(com.nytimes.android.internal.pushmessaging.model.a aVar) {
            zq3.h(aVar, "<set-?>");
            this.b = aVar;
        }

        public final void h(Subscription subscription) {
            this.d = subscription;
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            Set set = this.c;
            int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
            Subscription subscription = this.d;
            return ((hashCode2 + (subscription != null ? subscription.hashCode() : 0)) * 31) + Long.hashCode(this.e);
        }

        public final void i(Set set) {
            this.c = set;
        }

        public String toString() {
            return "Settings(appId=" + this.a + ", environment=" + this.b + ", tags=" + this.c + ", migratedSubscription=" + this.d + ", okHttpCacheSize=" + this.e + ")";
        }

        public /* synthetic */ c(String str, com.nytimes.android.internal.pushmessaging.model.a aVar, Set set, Subscription subscription, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? a.c.d : aVar, (i & 4) != 0 ? null : set, (i & 8) != 0 ? null : subscription, (i & 16) != 0 ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : j);
        }
    }
}
