package androidx.compose.ui.graphics.vector;

import defpackage.fv1;
import defpackage.ss2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a {
    private ss2 a;

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(fv1 fv1Var);

    public ss2 b() {
        return this.a;
    }

    public final void c() {
        ss2 b = b();
        if (b != null) {
            b.invoke(this);
        }
    }

    public void d(ss2 ss2Var) {
        this.a = ss2Var;
    }

    private a() {
    }
}
