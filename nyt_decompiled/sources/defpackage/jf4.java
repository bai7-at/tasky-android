package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.comscore.streaming.ContentFeedType;

/* loaded from: classes3.dex */
public abstract class jf4 {
    private final TimeInterpolator a;
    protected final View b;
    protected final int c;
    protected final int d;
    protected final int e;
    private h30 f;

    public jf4(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = hw4.g(context, lc6.motionEasingStandardDecelerateInterpolator, op5.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = hw4.f(context, lc6.motionDurationMedium2, ContentFeedType.OTHER);
        this.d = hw4.f(context, lc6.motionDurationShort3, 150);
        this.e = hw4.f(context, lc6.motionDurationShort2, 100);
    }

    public float a(float f) {
        return this.a.getInterpolation(f);
    }

    protected h30 b() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        h30 h30Var = this.f;
        this.f = null;
        return h30Var;
    }

    public h30 c() {
        h30 h30Var = this.f;
        this.f = null;
        return h30Var;
    }

    protected void d(h30 h30Var) {
        this.f = h30Var;
    }

    protected h30 e(h30 h30Var) {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        h30 h30Var2 = this.f;
        this.f = h30Var;
        return h30Var2;
    }
}
