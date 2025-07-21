package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.zzavz;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public abstract class dfa implements cfa {
    protected static volatile jga y;
    protected MotionEvent a;
    protected double j;
    private double k;
    private double l;
    protected float m;
    protected float n;
    protected float r;
    protected float s;
    protected DisplayMetrics w;
    protected bga x;
    protected final LinkedList b = new LinkedList();
    protected long c = 0;
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    private boolean t = false;
    protected boolean u = false;

    protected dfa(Context context) {
        try {
            mda.d();
            this.w = context.getResources().getDisplayMetrics();
            if (((Boolean) pla.c().a(mpa.z2)).booleanValue()) {
                this.x = new bga();
            }
        } catch (Throwable unused) {
        }
    }

    private final void k() {
        this.g = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0L;
        this.i = 0L;
        if (this.b.isEmpty()) {
            MotionEvent motionEvent = this.a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((MotionEvent) it2.next()).recycle();
            }
            this.b.clear();
        }
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String l(android.content.Context r19, java.lang.String r20, int r21, android.view.View r22, android.app.Activity r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfa.l(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // defpackage.cfa
    public final String b(Context context) {
        if (mga.c()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return l(context, null, 1, null, null, null);
    }

    @Override // defpackage.cfa
    public final String c(Context context, String str, View view) {
        return l(context, str, 3, view, null, null);
    }

    @Override // defpackage.cfa
    public final void d(StackTraceElement[] stackTraceElementArr) {
        bga bgaVar;
        if (!((Boolean) pla.c().a(mpa.z2)).booleanValue() || (bgaVar = this.x) == null) {
            return;
        }
        bgaVar.b(Arrays.asList(stackTraceElementArr));
    }

    @Override // defpackage.cfa
    public final String e(Context context, String str, View view, Activity activity) {
        return l(context, str, 3, view, activity, null);
    }

    protected abstract long f(StackTraceElement[] stackTraceElementArr);

    protected abstract u0 g(Context context, View view, Activity activity);

    protected abstract u0 h(Context context, n0 n0Var);

    protected abstract u0 i(Context context, View view, Activity activity);

    protected abstract lga j(MotionEvent motionEvent);

    @Override // defpackage.cfa
    public final String zzh(Context context, View view, Activity activity) {
        return l(context, null, 2, view, activity, null);
    }

    @Override // defpackage.cfa
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.t) {
                k();
                this.t = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.j = 0.0d;
                this.k = motionEvent.getRawX();
                this.l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.k;
                double d2 = rawY - this.l;
                this.j += Math.sqrt((d * d) + (d2 * d2));
                this.k = rawX;
                this.l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.a = obtain;
                        this.b.add(obtain);
                        if (this.b.size() > 6) {
                            ((MotionEvent) this.b.remove()).recycle();
                        }
                        this.e++;
                        this.g = f(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.d += motionEvent.getHistorySize() + 1;
                        lga j = j(motionEvent);
                        Long l2 = j.e;
                        if (l2 != null && j.h != null) {
                            this.h += l2.longValue() + j.h.longValue();
                        }
                        if (this.w != null && (l = j.f) != null && j.i != null) {
                            this.i += l.longValue() + j.i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f++;
                    }
                } catch (zzavz unused) {
                }
            } else {
                this.m = motionEvent.getX();
                this.n = motionEvent.getY();
                this.r = motionEvent.getRawX();
                this.s = motionEvent.getRawY();
                this.c++;
            }
            this.u = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.cfa
    public final synchronized void zzl(int i, int i2, int i3) {
        try {
            if (this.a != null) {
                if (((Boolean) pla.c().a(mpa.p2)).booleanValue()) {
                    k();
                } else {
                    this.a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.w;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.a = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.a = null;
            }
            this.u = false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
