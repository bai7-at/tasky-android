package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.fb;
import defpackage.qg4;
import defpackage.sg4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class a extends Modifier.c implements androidx.compose.ui.node.c {
    private fb n;
    private float r;
    private float s;

    public /* synthetic */ a(fb fbVar, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fbVar, f, f2);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        sg4 c;
        c = AlignmentLineKt.c(fVar, this.n, this.r, this.s, qg4Var, j);
        return c;
    }

    public final void e2(float f) {
        this.s = f;
    }

    public final void f2(fb fbVar) {
        this.n = fbVar;
    }

    public final void g2(float f) {
        this.r = f;
    }

    private a(fb fbVar, float f, float f2) {
        this.n = fbVar;
        this.r = f;
        this.s = f2;
    }
}
