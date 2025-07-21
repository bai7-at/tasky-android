package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class e28 {
    private static final Lock c = new ReentrantLock();
    private static e28 d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    e28(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static e28 b(Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new e28(context.getApplicationContext());
            }
            e28 e28Var = d;
            lock.unlock();
            return e28Var;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    private static final String k(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(k("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.z1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(k("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.x1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.A1());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String A1 = googleSignInAccount.A1();
        j(k("googleSignInAccount", A1), googleSignInAccount.B1());
        j(k("googleSignInOptions", A1), googleSignInOptions.B1());
    }

    protected final String g(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    protected final void h(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final void i() {
        String g = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g)) {
            return;
        }
        h(k("googleSignInAccount", g));
        h(k("googleSignInOptions", g));
    }

    protected final void j(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
