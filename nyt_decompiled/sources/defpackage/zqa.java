package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zqa {
    private MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context c;
    private final ScheduledExecutorService d;
    private final q7e e;
    private final bra f;

    public zqa(Context context, ScheduledExecutorService scheduledExecutorService, bra braVar, q7e q7eVar) {
        this.c = context;
        this.d = scheduledExecutorService;
        this.f = braVar;
        this.e = q7eVar;
    }

    public final j64 a() {
        return (vb) zb.o(vb.C(zb.h(null)), ((Long) pra.c.e()).longValue(), TimeUnit.MILLISECONDS, this.d);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.b.getEventTime()) {
                return;
            }
            this.b = MotionEvent.obtain(motionEvent);
        }
    }
}
