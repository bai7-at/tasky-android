package defpackage;

import android.app.Application;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.hybrid.ConnectionStatus;
import com.nytimes.android.hybrid.HybridConfig;
import com.nytimes.android.hybrid.HybridTcfInfo;
import com.nytimes.android.hybrid.HybridUserInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ac3 {
    public static final a i = new a(null);
    public static final int j = 8;
    private final el a;
    private final Application b;
    private final g55 c;
    private final id3 d;
    private final HybridUserInfo e;
    private final kd3 f;
    private final Map g;
    private final Map h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ac3(el elVar, Application application, g55 g55Var, id3 id3Var, HybridUserInfo hybridUserInfo, kd3 kd3Var, Map map, Map map2) {
        zq3.h(elVar, "appConfig");
        zq3.h(application, "context");
        zq3.h(g55Var, "networkStatus");
        zq3.h(id3Var, "hybridPreferences");
        zq3.h(kd3Var, "hybridPurrInfoProvider");
        this.a = elVar;
        this.b = application;
        this.c = g55Var;
        this.d = id3Var;
        this.e = hybridUserInfo;
        this.f = kd3Var;
        this.g = map;
        this.h = map2;
    }

    private final ConnectionStatus b() {
        ConnectionStatus connectionStatus = ConnectionStatus.NO_CONNECTION;
        if (!this.c.a()) {
            return connectionStatus;
        }
        if (this.c.f() && this.c.d()) {
            return ConnectionStatus.GOOD_WIFI;
        }
        if (this.c.f()) {
            return ConnectionStatus.POOR_WIFI;
        }
        if (this.c.f()) {
            return connectionStatus;
        }
        return this.c.b() ? ConnectionStatus.MODERN_CELL : ConnectionStatus.LEGACY_CELL;
    }

    private final HybridConfig c() {
        Map map = this.h;
        HybridUserInfo hybridUserInfo = this.e;
        boolean z = (hybridUserInfo != null ? hybridUserInfo.e() : null) != null;
        boolean a2 = this.d.a();
        String b = this.a.b();
        String c = this.a.c();
        String a3 = this.a.a();
        String f = f();
        int status = b().status();
        HybridUserInfo hybridUserInfo2 = this.e;
        String d = d();
        Map a4 = this.f.a();
        Map map2 = this.g;
        HybridTcfInfo e = e();
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(a2);
        Boolean bool = Boolean.FALSE;
        return new HybridConfig(24.0f, false, valueOf, "uri", valueOf2, b, "Android", f, c, a3, d, status, map2, map, a4, e, hybridUserInfo2, false, bool, bool);
    }

    private final String d() {
        String format = new SimpleDateFormat(QueryKeys.MEMFLY_API_VERSION, Locale.getDefault()).format(new Date());
        zq3.g(format, "format(...)");
        return format;
    }

    private final HybridTcfInfo e() {
        return new HybridTcfInfo(this.f.d(), false, 2, null);
    }

    public final HybridConfig a() {
        return c();
    }

    public final String f() {
        Locale locale = this.b.getResources().getConfiguration().locale;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        zq3.g(language, "getLanguage(...)");
        return language;
    }
}
