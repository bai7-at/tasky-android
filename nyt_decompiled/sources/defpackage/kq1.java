package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes.dex */
public class kq1 {
    private final Context a;
    private final lq1 b;
    private final b c;
    private final a d;
    private VelocityTracker e;
    private float f;
    private int g;
    private int h;
    private int i;
    private final int[] j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public kq1(Context context, lq1 lq1Var) {
        this(context, lq1Var, new b() { // from class: iq1
            @Override // kq1.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                kq1.c(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: jq1
            @Override // kq1.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                float f;
                f = kq1.f(velocityTracker, motionEvent, i);
                return f;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = u99.g(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = u99.f(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    private float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        w49.a(velocityTracker, motionEvent);
        w49.b(velocityTracker, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        return w49.d(velocityTracker, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean d = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float e = e(motionEvent, i) * this.b.b();
        float signum = Math.signum(e);
        if (d || (signum != Math.signum(this.f) && signum != 0.0f)) {
            this.b.c();
        }
        float abs = Math.abs(e);
        int[] iArr = this.j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e, iArr[1]));
        this.f = this.b.a(max) ? max : 0.0f;
    }

    kq1(Context context, lq1 lq1Var, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = lq1Var;
        this.c = bVar;
        this.d = aVar;
    }
}
