package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.t2;
import com.google.android.gms.internal.pal.zzdm;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public abstract class vub implements qtb {
    protected static volatile ksc t;
    protected MotionEvent a;
    protected double j;
    private double k;
    private double l;
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    protected DisplayMetrics s;
    protected final LinkedList b = new LinkedList();
    protected long c = 0;
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    private boolean q = false;
    protected boolean r = false;

    protected vub(Context context) {
        try {
            if (((Boolean) lee.c().b(fpe.w2)).booleanValue()) {
                mxa.d();
            } else {
                otc.a(t);
            }
            this.s = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(13:5|6|7|(4:9|(1:11)(1:85)|12|(1:14)(1:84))(1:86)|15|16|(4:18|19|20|21)(2:(1:79)(1:81)|80)|(1:74)(4:24|25|26|27)|28|(3:48|49|(1:51)(4:52|(2:(1:56)(1:(1:59)(1:60))|57)|31|32))|30|31|32)|91|7|(0)(0)|15|16|(0)(0)|(0)|74|28|(0)|30|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x009c, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: Exception -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x009b, blocks: (B:18:0x0062, B:24:0x0086, B:79:0x0073, B:81:0x007b), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String l(android.content.Context r22, java.lang.String r23, int r24, android.view.View r25, android.app.Activity r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vub.l(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    @Override // defpackage.qtb
    public final String b(Context context) {
        if (wvc.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return l(context, null, 1, null, null, null);
    }

    @Override // defpackage.qtb
    public final String c(Context context, byte[] bArr) {
        if (wvc.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return l(context, null, 1, null, null, bArr);
    }

    @Override // defpackage.qtb
    public final String d(Context context, View view, Activity activity) {
        return l(context, null, 2, view, activity, null);
    }

    @Override // defpackage.qtb
    public final String e(Context context, String str, View view, Activity activity) {
        return l(context, str, 3, view, activity, null);
    }

    @Override // defpackage.qtb
    public final synchronized void g(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.q) {
                this.g = 0L;
                this.c = 0L;
                this.d = 0L;
                this.e = 0L;
                this.f = 0L;
                this.h = 0L;
                this.i = 0L;
                if (this.b.size() > 0) {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        ((MotionEvent) it2.next()).recycle();
                    }
                    this.b.clear();
                } else {
                    MotionEvent motionEvent2 = this.a;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                }
                this.a = null;
                this.q = false;
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
                        this.g = a(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.d += motionEvent.getHistorySize() + 1;
                        suc k = k(motionEvent);
                        Long l2 = k.e;
                        if (l2 != null && k.h != null) {
                            this.h += l2.longValue() + k.h.longValue();
                        }
                        if (this.s != null && (l = k.f) != null && k.i != null) {
                            this.i += l.longValue() + k.i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f++;
                    }
                } catch (zzdm unused) {
                }
            } else {
                this.m = motionEvent.getX();
                this.n = motionEvent.getY();
                this.o = motionEvent.getRawX();
                this.p = motionEvent.getRawY();
                this.c++;
            }
            this.r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract h3 h(Context context, View view, Activity activity);

    protected abstract h3 i(Context context, t2 t2Var);

    protected abstract h3 j(Context context, View view, Activity activity);

    protected abstract suc k(MotionEvent motionEvent);
}
