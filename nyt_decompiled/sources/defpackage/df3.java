package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class df3 implements rl3 {
    private static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    private static final String h = Pattern.quote("/");
    private final wl3 a;
    private final Context b;
    private final String c;
    private final hi2 d;
    private final c91 e;
    private String f;

    public df3(Context context, String str, hi2 hi2Var, c91 c91Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = hi2Var;
        this.e = c91Var;
        this.a = new wl3();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = e(UUID.randomUUID().toString());
        m94.f().i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) k29.d(this.d.getId());
        } catch (Exception e) {
            m94.f().l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(h, "");
    }

    @Override // defpackage.rl3
    public synchronized String a() {
        try {
            String str = this.f;
            if (str != null) {
                return str;
            }
            m94.f().i("Determining Crashlytics installation ID...");
            SharedPreferences r = CommonUtils.r(this.b);
            String string = r.getString("firebase.installation.id", null);
            m94.f().i("Cached Firebase Installation ID: " + string);
            if (this.e.d()) {
                String d = d();
                m94.f().i("Fetched Firebase Installation ID: " + d);
                if (d == null) {
                    d = string == null ? c() : string;
                }
                if (d.equals(string)) {
                    this.f = l(r);
                } else {
                    this.f = b(d, r);
                }
            } else if (k(string)) {
                this.f = l(r);
            } else {
                this.f = b(c(), r);
            }
            if (this.f == null) {
                m94.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
                this.f = b(c(), r);
            }
            m94.f().i("Crashlytics installation ID: " + this.f);
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
