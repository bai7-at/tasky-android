package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.c;

/* loaded from: classes.dex */
public abstract class gy5 {
    public static final void a(long j, ss2 ss2Var) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        ss2Var.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(c cVar, long j, ss2 ss2Var) {
        d(cVar, j, ss2Var, true);
    }

    public static final void c(c cVar, long j, ss2 ss2Var) {
        d(cVar, j, ss2Var, false);
    }

    private static final void d(c cVar, long j, ss2 ss2Var, boolean z) {
        MotionEvent e = cVar.e();
        if (e == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = e.getAction();
        if (z) {
            e.setAction(3);
        }
        e.offsetLocation(-fd5.o(j), -fd5.p(j));
        ss2Var.invoke(e);
        e.offsetLocation(fd5.o(j), fd5.p(j));
        e.setAction(action);
    }
}
