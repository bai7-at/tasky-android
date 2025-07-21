package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class uz8 {
    public static final uz8 a = new uz8();
    private static final String b;
    private static SharedPreferences c;
    private static final AtomicBoolean d;
    private static final ConcurrentHashMap e;
    private static final ConcurrentHashMap f;

    static {
        String simpleName = uz8.class.getSimpleName();
        zq3.g(simpleName, "UserDataStore::class.java.simpleName");
        b = simpleName;
        d = new AtomicBoolean(false);
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }

    private uz8() {
    }

    public static final String b() {
        if (c11.d(uz8.class)) {
            return null;
        }
        try {
            if (!d.get()) {
                a.d();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(e);
            hashMap.putAll(a.c());
            return g29.h0(hashMap);
        } catch (Throwable th) {
            c11.b(th, uz8.class);
            return null;
        }
    }

    private final Map c() {
        if (c11.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set b2 = ys4.d.b();
            for (String str : f.keySet()) {
                if (b2.contains(str)) {
                    hashMap.put(str, f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final synchronized void d() {
        if (c11.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(w92.l());
            zq3.g(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            c = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                zq3.z("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences == null) {
                zq3.z("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            e.putAll(g29.d0(string));
            f.putAll(g29.d0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final void e() {
        if (c11.d(uz8.class)) {
            return;
        }
        try {
            if (d.get()) {
                return;
            }
            a.d();
        } catch (Throwable th) {
            c11.b(th, uz8.class);
        }
    }

    private final String f(String str, String str2) {
        String str3;
        if (c11.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = zq3.j(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = str2.subSequence(i, length + 1).toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (zq3.c(Tag.EM, str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(b, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (zq3.c("ph", str)) {
                return new Regex("[^0-9]").e(lowerCase, "");
            }
            if (!zq3.c("ge", str)) {
                return lowerCase;
            }
            if (lowerCase.length() <= 0) {
                str3 = "";
            } else {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str3 = lowerCase.substring(0, 1);
                zq3.g(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!zq3.c(QueryKeys.VISIT_FREQUENCY, str3) && !zq3.c(QueryKeys.MAX_SCROLL_DEPTH, str3)) {
                Log.e(b, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return str3;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        r5 = new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz8.g(java.util.Map):void");
    }

    private final void h(final String str, final String str2) {
        if (c11.d(this)) {
            return;
        }
        try {
            w92.t().execute(new Runnable() { // from class: tz8
                @Override // java.lang.Runnable
                public final void run() {
                    uz8.i(str, str2);
                }
            });
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, String str2) {
        if (c11.d(uz8.class)) {
            return;
        }
        try {
            zq3.h(str, "$key");
            zq3.h(str2, "$value");
            if (!d.get()) {
                a.d();
            }
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).apply();
            } else {
                zq3.z("sharedPreferences");
                throw null;
            }
        } catch (Throwable th) {
            c11.b(th, uz8.class);
        }
    }
}
