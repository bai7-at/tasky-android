package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class lo6 {
    public static final lo6 a = new lo6();

    public static final class a implements View.OnTouchListener {
        private final EventBinding a;
        private final WeakReference b;
        private final WeakReference c;
        private final View.OnTouchListener d;
        private boolean e;

        public a(EventBinding eventBinding, View view, View view2) {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(view2, "hostView");
            this.a = eventBinding;
            this.b = new WeakReference(view2);
            this.c = new WeakReference(view);
            this.d = ba9.h(view2);
            this.e = true;
        }

        public final boolean a() {
            return this.e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            zq3.h(view, "view");
            zq3.h(motionEvent, "motionEvent");
            View view2 = (View) this.c.get();
            View view3 = (View) this.b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                ym0 ym0Var = ym0.a;
                ym0.d(this.a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private lo6() {
    }

    public static final a a(EventBinding eventBinding, View view, View view2) {
        if (c11.d(lo6.class)) {
            return null;
        }
        try {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(view2, "hostView");
            return new a(eventBinding, view, view2);
        } catch (Throwable th) {
            c11.b(th, lo6.class);
            return null;
        }
    }
}
