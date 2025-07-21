package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentFeedType;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
public final class s7 {
    private final int a;
    private final int b;
    private final String c;
    private boolean d;
    private boolean e;
    private int f;
    private boolean g;
    private int h;
    public static final s7 i = new s7(320, 50, "320x50_mb");
    public static final s7 j = new s7(468, 60, "468x60_as");
    public static final s7 k = new s7(320, 100, "320x100_as");
    public static final s7 l = new s7(728, 90, "728x90_as");
    public static final s7 m = new s7(ContentFeedType.OTHER, 250, "300x250_as");
    public static final s7 n = new s7(160, 600, "160x600_as");
    public static final s7 o = new s7(-1, -2, "smart_banner");
    public static final s7 p = new s7(-3, -4, "fluid");
    public static final s7 q = new s7(0, 0, "invalid");
    public static final s7 s = new s7(50, 50, "50x50_mb");
    public static final s7 r = new s7(-3, 0, "search_v2");

    public s7(int i2, int i3) {
        this(i2, i3, (i2 == -1 ? "FULL" : String.valueOf(i2)) + QueryKeys.SCROLL_POSITION_TOP + (i3 == -2 ? "AUTO" : String.valueOf(i3)) + "_as");
    }

    public int a() {
        return this.b;
    }

    public int b(Context context) {
        int i2 = this.b;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return zzq.t0(context.getResources().getDisplayMetrics());
        }
        kia.b();
        return tfb.z(context, i2);
    }

    public int c() {
        return this.a;
    }

    public int d(Context context) {
        int i2 = this.a;
        if (i2 == -3) {
            return -1;
        }
        if (i2 != -1) {
            kia.b();
            return tfb.z(context, i2);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.a == -3 && this.b == -4;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return this.a == s7Var.a && this.b == s7Var.b && this.c.equals(s7Var.c);
    }

    final int f() {
        return this.h;
    }

    final int g() {
        return this.f;
    }

    final void h(int i2) {
        this.f = i2;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    final void i(int i2) {
        this.h = i2;
    }

    final void j(boolean z) {
        this.e = true;
    }

    final void k(boolean z) {
        this.g = true;
    }

    final boolean l() {
        return this.d;
    }

    final boolean m() {
        return this.e;
    }

    final boolean n() {
        return this.g;
    }

    public String toString() {
        return this.c;
    }

    s7(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i2);
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i3);
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }
}
