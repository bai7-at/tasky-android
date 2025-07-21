package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
final class g13 extends EdgeEffect {
    private final float a;
    private float b;

    public g13(Context context) {
        super(context);
        this.a = af.a(context).f1(bu1.g(1));
    }

    public final void a(float f) {
        float f2 = this.b + f;
        this.b = f2;
        if (Math.abs(f2) > this.a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        this.b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        this.b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }
}
