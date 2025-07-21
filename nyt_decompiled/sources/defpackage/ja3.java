package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes4.dex */
public final class ja3 implements View.OnTouchListener {
    private final ss2 a;
    private final qs2 b;
    private final GestureDetector c;

    public static final class a extends ms7 {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return ((Boolean) ja3.this.a().invoke(Float.valueOf(f))).booleanValue();
        }
    }

    public ja3(Context context, ss2 ss2Var, qs2 qs2Var) {
        zq3.h(context, "context");
        zq3.h(ss2Var, "onFling");
        zq3.h(qs2Var, "onIdle");
        this.a = ss2Var;
        this.b = qs2Var;
        this.c = new GestureDetector(context, new a());
    }

    public final ss2 a() {
        return this.a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        zq3.h(view, QueryKeys.INTERNAL_REFERRER);
        zq3.h(motionEvent, "event");
        if (this.c.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            return ((Boolean) this.b.mo865invoke()).booleanValue();
        }
        return false;
    }
}
