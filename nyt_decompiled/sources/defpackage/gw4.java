package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes3.dex */
public class gw4 {
    private long a;
    private long b;
    private TimeInterpolator c;
    private int d;
    private int e;

    public gw4(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    static gw4 a(ValueAnimator valueAnimator) {
        gw4 gw4Var = new gw4(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        gw4Var.d = valueAnimator.getRepeatCount();
        gw4Var.e = valueAnimator.getRepeatMode();
        return gw4Var;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? hi.b : interpolator instanceof AccelerateInterpolator ? hi.c : interpolator instanceof DecelerateInterpolator ? hi.d : interpolator;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : hi.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw4)) {
            return false;
        }
        gw4 gw4Var = (gw4) obj;
        if (b() == gw4Var.b() && c() == gw4Var.c() && f() == gw4Var.f() && g() == gw4Var.g()) {
            return d().getClass().equals(gw4Var.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public gw4(long j, long j2, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
