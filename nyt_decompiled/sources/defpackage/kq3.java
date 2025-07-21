package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsLogger;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class kq3 {
    public static final a b = new a(null);
    private final yl a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kq3 a(Context context, String str) {
            return new kq3(context, str);
        }

        public final kq3 b(String str, String str2, AccessToken accessToken) {
            zq3.h(str, "activityName");
            return new kq3(str, str2, accessToken);
        }

        public final Executor c() {
            return yl.c.h();
        }

        public final AppEventsLogger.FlushBehavior d() {
            return yl.c.j();
        }

        public final String e() {
            return yl.c.l();
        }

        public final void f(Map map) {
            zq3.h(map, "ud");
            uz8.g(map);
        }

        private a() {
        }
    }

    public kq3(yl ylVar) {
        zq3.h(ylVar, "loggerImpl");
        this.a = ylVar;
    }

    public final void a() {
        this.a.j();
    }

    public final void b(Bundle bundle) {
        zq3.h(bundle, "parameters");
        if (((bundle.getInt("previous") & 2) != 0) || w92.p()) {
            this.a.o("fb_sdk_settings_changed", null, bundle);
        }
    }

    public final void c(String str, double d, Bundle bundle) {
        if (w92.p()) {
            this.a.k(str, d, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (w92.p()) {
            this.a.l(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.a.n(str, str2);
    }

    public final void f(String str) {
        if (w92.p()) {
            this.a.o(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (w92.p()) {
            this.a.o(str, null, bundle);
        }
    }

    public final void h(String str, Double d, Bundle bundle) {
        if (w92.p()) {
            this.a.o(str, d, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (w92.p()) {
            this.a.p(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (w92.p()) {
            this.a.r(bigDecimal, currency, bundle);
        }
    }

    public kq3(Context context) {
        this(new yl(context, (String) null, (AccessToken) null));
    }

    public kq3(Context context, String str) {
        this(new yl(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kq3(String str, String str2, AccessToken accessToken) {
        this(new yl(str, str2, accessToken));
        zq3.h(str, "activityName");
    }
}
