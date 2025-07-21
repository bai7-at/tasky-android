package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
final class wo9 extends Drawable.ConstantState {
    int a;
    int b;

    wo9(wo9 wo9Var) {
        if (wo9Var != null) {
            this.a = wo9Var.a;
            this.b = wo9Var.b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new xo9(this);
    }
}
