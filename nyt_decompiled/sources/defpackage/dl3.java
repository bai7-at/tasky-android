package defpackage;

import androidx.compose.runtime.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class dl3 implements cl3 {
    private final ss2 a;
    private final sy4 b;

    public /* synthetic */ dl3(int i, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, ss2Var);
    }

    @Override // defpackage.cl3
    public int a() {
        return ((bl3) this.b.getValue()).i();
    }

    public void b(int i) {
        this.b.setValue(bl3.c(i));
    }

    private dl3(int i, ss2 ss2Var) {
        this.a = ss2Var;
        this.b = b0.e(bl3.c(i), null, 2, null);
    }
}
