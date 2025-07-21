package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.saved.SavedManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b97 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    private final b04 a;
    private final SharedPreferences b;
    private final b04 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b97(b04 b04Var, SharedPreferences sharedPreferences, b04 b04Var2) {
        zq3.h(b04Var, "eCommClient");
        zq3.h(sharedPreferences, "preferences");
        zq3.h(b04Var2, "savedManager");
        this.a = b04Var;
        this.b = sharedPreferences;
        this.c = b04Var2;
    }

    private final boolean a() {
        return !this.b.getBoolean("SavedManager.FirstTimeSyncHappened", false);
    }

    private final boolean b() {
        return ((com.nytimes.android.entitlements.a) this.a.get()).q();
    }

    public final void c() {
        if (a() && b()) {
            ((SavedManager) this.c.get()).syncCache();
            SharedPreferences.Editor edit = this.b.edit();
            edit.putBoolean("SavedManager.FirstTimeSyncHappened", true);
            edit.apply();
        }
    }
}
