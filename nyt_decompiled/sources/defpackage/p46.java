package defpackage;

import android.content.Intent;
import com.facebook.Profile;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class p46 {
    public static final a d = new a(null);
    private static volatile p46 e;
    private final b74 a;
    private final j46 b;
    private Profile c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized p46 a() {
            p46 p46Var;
            try {
                if (p46.e == null) {
                    b74 b = b74.b(w92.l());
                    zq3.g(b, "getInstance(applicationContext)");
                    p46.e = new p46(b, new j46());
                }
                p46Var = p46.e;
                if (p46Var == null) {
                    zq3.z("instance");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return p46Var;
        }

        private a() {
        }
    }

    public p46(b74 b74Var, j46 j46Var) {
        zq3.h(b74Var, "localBroadcastManager");
        zq3.h(j46Var, "profileCache");
        this.a = b74Var;
        this.b = j46Var;
    }

    private final void e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.a.d(intent);
    }

    private final void g(Profile profile, boolean z) {
        Profile profile2 = this.c;
        this.c = profile;
        if (z) {
            if (profile != null) {
                this.b.c(profile);
            } else {
                this.b.a();
            }
        }
        if (g29.e(profile2, profile)) {
            return;
        }
        e(profile2, profile);
    }

    public final Profile c() {
        return this.c;
    }

    public final boolean d() {
        Profile b = this.b.b();
        if (b == null) {
            return false;
        }
        g(b, false);
        return true;
    }

    public final void f(Profile profile) {
        g(profile, true);
    }
}
