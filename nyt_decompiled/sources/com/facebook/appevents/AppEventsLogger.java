package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import defpackage.fd;
import defpackage.yl;
import defpackage.zq3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AppEventsLogger {
    public static final a b = new a(null);
    private static final String c = AppEventsLogger.class.getCanonicalName();
    private final yl a;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static FlushBehavior[] valuesCustom() {
            FlushBehavior[] valuesCustom = values();
            return (FlushBehavior[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Application application) {
            zq3.h(application, "application");
            yl.c.f(application, null);
        }

        public final void b(Application application, String str) {
            zq3.h(application, "application");
            yl.c.f(application, str);
        }

        public final String c(Context context) {
            zq3.h(context, "context");
            return yl.c.i(context);
        }

        public final FlushBehavior d() {
            return yl.c.j();
        }

        public final String e() {
            return fd.b();
        }

        public final void f(Context context, String str) {
            zq3.h(context, "context");
            yl.c.m(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppEventsLogger g(Context context) {
            zq3.h(context, "context");
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void h() {
            yl.c.s();
        }

        private a() {
        }
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    public static final String b(Context context) {
        return b.c(context);
    }

    public final void a() {
        this.a.j();
    }

    public final void c(String str, Bundle bundle) {
        this.a.l(str, bundle);
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.a = new yl(context, str, accessToken);
    }
}
