package defpackage;

import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public final class ch7 {
    private final NetworkStatus a;
    private final r57 b;
    private final SnackbarUtil c;
    private final AppPreferences d;
    private final TimeStampUtil e;
    private final f15 f;
    private final String g;
    private final String h;
    private final boolean i;
    private final vb2 j;

    public ch7(NetworkStatus networkStatus, r57 r57Var, SnackbarUtil snackbarUtil, AppPreferences appPreferences, TimeStampUtil timeStampUtil, f15 f15Var, String str, String str2, boolean z, vb2 vb2Var) {
        zq3.h(networkStatus, "networkStatus");
        zq3.h(r57Var, "sectionFrontStore");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(f15Var, "nytScheduler");
        zq3.h(str, "updateMessage");
        zq3.h(str2, "debugErrMessage");
        zq3.h(vb2Var, "feedPerformanceTracker");
        this.a = networkStatus;
        this.b = r57Var;
        this.c = snackbarUtil;
        this.d = appPreferences;
        this.e = timeStampUtil;
        this.f = f15Var;
        this.g = str;
        this.h = str2;
        this.i = z;
        this.j = vb2Var;
    }

    public final AppPreferences a() {
        return this.d;
    }

    public final boolean b() {
        return this.i;
    }

    public final String c() {
        return this.h;
    }

    public final vb2 d() {
        return this.j;
    }

    public final NetworkStatus e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch7)) {
            return false;
        }
        ch7 ch7Var = (ch7) obj;
        return zq3.c(this.a, ch7Var.a) && zq3.c(this.b, ch7Var.b) && zq3.c(this.c, ch7Var.c) && zq3.c(this.d, ch7Var.d) && zq3.c(this.e, ch7Var.e) && zq3.c(this.f, ch7Var.f) && zq3.c(this.g, ch7Var.g) && zq3.c(this.h, ch7Var.h) && this.i == ch7Var.i && zq3.c(this.j, ch7Var.j);
    }

    public final f15 f() {
        return this.f;
    }

    public final r57 g() {
        return this.b;
    }

    public final SnackbarUtil h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + this.j.hashCode();
    }

    public final TimeStampUtil i() {
        return this.e;
    }

    public final String j() {
        return this.g;
    }

    public String toString() {
        return "SectionFrontRefresherParam(networkStatus=" + this.a + ", sectionFrontStore=" + this.b + ", snackbarUtil=" + this.c + ", appPreferences=" + this.d + ", timeStampUtil=" + this.e + ", nytScheduler=" + this.f + ", updateMessage=" + this.g + ", debugErrMessage=" + this.h + ", debugBuild=" + this.i + ", feedPerformanceTracker=" + this.j + ")";
    }
}
