package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.b0;

/* loaded from: classes.dex */
public final class ty4 extends rr8 {
    public static final int d = 0;
    private final sy4 b;
    private final sy4 c;

    public ty4(Object obj) {
        super(null);
        this.b = b0.e(obj, null, 2, null);
        this.c = b0.e(obj, null, 2, null);
    }

    @Override // defpackage.rr8
    public Object a() {
        return this.b.getValue();
    }

    @Override // defpackage.rr8
    public Object b() {
        return this.c.getValue();
    }

    @Override // defpackage.rr8
    public void d(Transition transition) {
    }

    public void e(Object obj) {
        this.b.setValue(obj);
    }

    public void f(Object obj) {
        this.c.setValue(obj);
    }
}
