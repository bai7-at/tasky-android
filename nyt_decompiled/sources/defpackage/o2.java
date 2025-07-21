package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o2 {
    public static final a d = new a(null);
    private final SharedPreferences a;
    private final b b;
    private f34 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        public final f34 a() {
            return new f34(w92.l(), null, 2, null);
        }
    }

    public o2(SharedPreferences sharedPreferences, b bVar) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(bVar, "tokenCachingStrategyFactory");
        this.a = sharedPreferences;
        this.b = bVar;
    }

    private final AccessToken b() {
        String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.Companion.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final AccessToken c() {
        Bundle c = d().c();
        if (c == null || !f34.c.g(c)) {
            return null;
        }
        return AccessToken.Companion.c(c);
    }

    private final f34 d() {
        if (c11.d(this)) {
            return null;
        }
        try {
            if (this.c == null) {
                synchronized (this) {
                    try {
                        if (this.c == null) {
                            this.c = this.b.a();
                        }
                        ww8 ww8Var = ww8.a;
                    } finally {
                    }
                }
            }
            f34 f34Var = this.c;
            if (f34Var != null) {
                return f34Var;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final boolean e() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return w92.F();
    }

    public final void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final AccessToken f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        AccessToken c = c();
        if (c != null) {
            g(c);
            d().a();
        }
        return c;
    }

    public final void g(AccessToken accessToken) {
        zq3.h(accessToken, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.p().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o2() {
        /*
            r3 = this;
            android.content.Context r0 = defpackage.w92.l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            defpackage.zq3.g(r0, r1)
            o2$b r1 = new o2$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2.<init>():void");
    }
}
