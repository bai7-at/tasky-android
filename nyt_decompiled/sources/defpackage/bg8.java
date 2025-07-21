package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class bg8 extends Modifier.c {
    private boolean n;

    public bg8() {
        U1(0);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        this.n = true;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        this.n = false;
    }

    public final boolean e2() {
        return this.n;
    }

    public String toString() {
        return "<tail>";
    }
}
