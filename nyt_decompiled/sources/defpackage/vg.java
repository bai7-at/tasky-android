package defpackage;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class vg implements r99 {
    private final ViewConfiguration a;

    public vg(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.r99
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.r99
    public long b() {
        return 40L;
    }

    @Override // defpackage.r99
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.r99
    public float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.r99
    public float f() {
        return this.a.getScaledTouchSlop();
    }
}
