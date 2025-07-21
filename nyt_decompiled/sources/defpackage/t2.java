package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.l23;
import defpackage.t2;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t2 {
    public static final a f = new a(null);
    private static t2 g;
    private final b74 a;
    private final o2 b;
    private AccessToken c;
    private final AtomicBoolean d;
    private Date e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest c(AccessToken accessToken, GraphRequest.b bVar) {
            e f = f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f.a());
            bundle.putString("client_id", accessToken.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest x = GraphRequest.n.x(accessToken, f.b(), bVar);
            x.H(bundle);
            x.G(HttpMethod.GET);
            return x;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest d(AccessToken accessToken, GraphRequest.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest x = GraphRequest.n.x(accessToken, "me/permissions", bVar);
            x.H(bundle);
            x.G(HttpMethod.GET);
            return x;
        }

        private final e f(AccessToken accessToken) {
            String h = accessToken.h();
            if (h == null) {
                h = AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            return zq3.c(h, "instagram") ? new c() : new b();
        }

        public final t2 e() {
            t2 t2Var;
            t2 t2Var2 = t2.g;
            if (t2Var2 != null) {
                return t2Var2;
            }
            synchronized (this) {
                t2Var = t2.g;
                if (t2Var == null) {
                    b74 b = b74.b(w92.l());
                    zq3.g(b, "getInstance(applicationContext)");
                    t2 t2Var3 = new t2(b, new o2());
                    t2.g = t2Var3;
                    t2Var = t2Var3;
                }
            }
            return t2Var;
        }

        private a() {
        }
    }

    public static final class b implements e {
        private final String a = "oauth/access_token";
        private final String b = "fb_extend_sso_token";

        @Override // t2.e
        public String a() {
            return this.b;
        }

        @Override // t2.e
        public String b() {
            return this.a;
        }
    }

    public static final class c implements e {
        private final String a = "refresh_access_token";
        private final String b = "ig_refresh_token";

        @Override // t2.e
        public String a() {
            return this.b;
        }

        @Override // t2.e
        public String b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {
        private String a;
        private int b;
        private int c;
        private Long d;
        private String e;

        public final String a() {
            return this.a;
        }

        public final Long b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public final void f(String str) {
            this.a = str;
        }

        public final void g(Long l) {
            this.d = l;
        }

        public final void h(int i) {
            this.b = i;
        }

        public final void i(int i) {
            this.c = i;
        }

        public final void j(String str) {
            this.e = str;
        }
    }

    public interface e {
        String a();

        String b();
    }

    public t2(b74 b74Var, o2 o2Var) {
        zq3.h(b74Var, "localBroadcastManager");
        zq3.h(o2Var, "accessTokenCache");
        this.a = b74Var;
        this.b = o2Var;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(t2 t2Var, AccessToken.a aVar) {
        zq3.h(t2Var, "this$0");
        t2Var.m(aVar);
    }

    private final void m(final AccessToken.a aVar) {
        final AccessToken i = i();
        if (i == null) {
            if (aVar == null) {
                return;
            }
            aVar.a(new FacebookException("No current access token to refresh"));
            return;
        }
        if (!this.d.compareAndSet(false, true)) {
            if (aVar == null) {
                return;
            }
            aVar.a(new FacebookException("Refresh already in progress"));
            return;
        }
        this.e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar2 = f;
        l23 l23Var = new l23(aVar2.d(i, new GraphRequest.b() { // from class: q2
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                t2.n(atomicBoolean, hashSet, hashSet2, hashSet3, m23Var);
            }
        }), aVar2.c(i, new GraphRequest.b() { // from class: r2
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                t2.o(t2.d.this, m23Var);
            }
        }));
        l23Var.e(new l23.a(i, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: s2
            public final /* synthetic */ AccessToken b;
            public final /* synthetic */ AtomicBoolean c;
            public final /* synthetic */ Set d;
            public final /* synthetic */ Set e;
            public final /* synthetic */ Set f;
            public final /* synthetic */ t2 g;

            {
                this.c = atomicBoolean;
                this.d = hashSet;
                this.e = hashSet2;
                this.f = hashSet3;
                this.g = this;
            }

            @Override // l23.a
            public final void a(l23 l23Var2) {
                t2.p(t2.d.this, this.b, null, this.c, this.d, this.e, this.f, this.g, l23Var2);
            }
        });
        l23Var.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, m23 m23Var) {
        JSONArray optJSONArray;
        zq3.h(atomicBoolean, "$permissionsCallSucceeded");
        zq3.h(set, "$permissions");
        zq3.h(set2, "$declinedPermissions");
        zq3.h(set3, "$expiredPermissions");
        zq3.h(m23Var, "response");
        JSONObject d2 = m23Var.d();
        if (d2 == null || (optJSONArray = d2.optJSONArray("data")) == null) {
            return;
        }
        atomicBoolean.set(true);
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String optString2 = optJSONObject.optString("status");
                if (!g29.Y(optString) && !g29.Y(optString2)) {
                    zq3.g(optString2, "status");
                    Locale locale = Locale.US;
                    zq3.g(locale, "US");
                    String lowerCase = optString2.toLowerCase(locale);
                    zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    zq3.g(lowerCase, "status");
                    int hashCode = lowerCase.hashCode();
                    if (hashCode == -1309235419) {
                        if (lowerCase.equals("expired")) {
                            set3.add(optString);
                        }
                        Log.w("AccessTokenManager", zq3.q("Unexpected status: ", lowerCase));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && lowerCase.equals("declined")) {
                            set2.add(optString);
                        }
                        Log.w("AccessTokenManager", zq3.q("Unexpected status: ", lowerCase));
                    } else {
                        if (lowerCase.equals("granted")) {
                            set.add(optString);
                        }
                        Log.w("AccessTokenManager", zq3.q("Unexpected status: ", lowerCase));
                    }
                }
            }
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(d dVar, m23 m23Var) {
        zq3.h(dVar, "$refreshResult");
        zq3.h(m23Var, "response");
        JSONObject d2 = m23Var.d();
        if (d2 == null) {
            return;
        }
        dVar.f(d2.optString(AccessToken.ACCESS_TOKEN_KEY));
        dVar.h(d2.optInt("expires_at"));
        dVar.i(d2.optInt(AccessToken.EXPIRES_IN_KEY));
        dVar.g(Long.valueOf(d2.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        dVar.j(d2.optString(AccessToken.GRAPH_DOMAIN, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d dVar, AccessToken accessToken, AccessToken.a aVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, t2 t2Var, l23 l23Var) {
        AccessToken accessToken2;
        zq3.h(dVar, "$refreshResult");
        zq3.h(atomicBoolean, "$permissionsCallSucceeded");
        zq3.h(set, "$permissions");
        zq3.h(set2, "$declinedPermissions");
        Set set4 = set3;
        zq3.h(set4, "$expiredPermissions");
        zq3.h(t2Var, "this$0");
        zq3.h(l23Var, "it");
        String a2 = dVar.a();
        int c2 = dVar.c();
        Long b2 = dVar.b();
        String e2 = dVar.e();
        try {
            a aVar2 = f;
            if (aVar2.e().i() != null) {
                AccessToken i = aVar2.e().i();
                if ((i == null ? null : i.n()) == accessToken.n()) {
                    if (!atomicBoolean.get() && a2 == null && c2 == 0) {
                        if (aVar != null) {
                            aVar.a(new FacebookException("Failed to refresh access token"));
                        }
                        t2Var.d.set(false);
                        return;
                    }
                    Date g2 = accessToken.g();
                    if (dVar.c() != 0) {
                        g2 = new Date(dVar.c() * 1000);
                    } else if (dVar.d() != 0) {
                        g2 = new Date((dVar.d() * 1000) + new Date().getTime());
                    }
                    Date date = g2;
                    if (a2 == null) {
                        a2 = accessToken.m();
                    }
                    String str = a2;
                    String c3 = accessToken.c();
                    String n = accessToken.n();
                    Set k = atomicBoolean.get() ? set : accessToken.k();
                    Set e3 = atomicBoolean.get() ? set2 : accessToken.e();
                    if (!atomicBoolean.get()) {
                        set4 = accessToken.f();
                    }
                    Set set5 = set4;
                    AccessTokenSource l = accessToken.l();
                    Date date2 = new Date();
                    Date date3 = b2 != null ? new Date(b2.longValue() * 1000) : accessToken.d();
                    if (e2 == null) {
                        e2 = accessToken.h();
                    }
                    AccessToken accessToken3 = new AccessToken(str, c3, n, k, e3, set5, l, date, date2, date3, e2);
                    try {
                        aVar2.e().r(accessToken3);
                        t2Var.d.set(false);
                        if (aVar != null) {
                            aVar.b(accessToken3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        accessToken2 = accessToken3;
                        t2Var.d.set(false);
                        if (aVar != null && accessToken2 != null) {
                            aVar.b(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (aVar != null) {
                aVar.a(new FacebookException("No current access token to refresh"));
            }
            t2Var.d.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    private final void q(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(w92.l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.a.d(intent);
    }

    private final void s(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.c;
        this.c = accessToken;
        this.d.set(false);
        this.e = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.b.g(accessToken);
            } else {
                this.b.a();
                g29 g29Var = g29.a;
                g29.i(w92.l());
            }
        }
        if (g29.e(accessToken2, accessToken)) {
            return;
        }
        q(accessToken2, accessToken);
        t();
    }

    private final void t() {
        Context l = w92.l();
        AccessToken.c cVar = AccessToken.Companion;
        AccessToken e2 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) l.getSystemService("alarm");
        if (cVar.g()) {
            if ((e2 == null ? null : e2.g()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(l, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, e2.g().getTime(), PendingIntent.getBroadcast(l, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean u() {
        AccessToken i = i();
        if (i == null) {
            return false;
        }
        long time = new Date().getTime();
        return i.l().canExtendToken() && time - this.e.getTime() > AbraPackageKt.MS_IN_HOUR && time - i.i().getTime() > 86400000;
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k(null);
        }
    }

    public final AccessToken i() {
        return this.c;
    }

    public final boolean j() {
        AccessToken f2 = this.b.f();
        if (f2 == null) {
            return false;
        }
        s(f2, false);
        return true;
    }

    public final void k(final AccessToken.a aVar) {
        if (zq3.c(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(aVar) { // from class: p2
                @Override // java.lang.Runnable
                public final void run() {
                    t2.l(t2.this, null);
                }
            });
        }
    }

    public final void r(AccessToken accessToken) {
        s(accessToken, true);
    }
}
