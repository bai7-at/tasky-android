package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.l;
import defpackage.ct0;
import defpackage.dt0;
import defpackage.qs2;
import defpackage.ut5;
import defpackage.ww8;
import defpackage.xc5;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
final class FocusablePinnableContainerNode extends Modifier.c implements ct0, xc5 {
    private ut5.a n;
    private boolean r;

    private final ut5 e2() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        l.a(this, new qs2() { // from class: androidx.compose.foundation.FocusablePinnableContainerNode$retrievePinnableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m19invoke();
                return ww8.a;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19invoke() {
                Ref$ObjectRef.this.element = dt0.a(this, PinnableContainerKt.a());
            }
        });
        return (ut5) ref$ObjectRef.element;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void Q1() {
        ut5.a aVar = this.n;
        if (aVar != null) {
            aVar.release();
        }
        this.n = null;
    }

    public final void f2(boolean z) {
        if (z) {
            ut5 e2 = e2();
            this.n = e2 != null ? e2.a() : null;
        } else {
            ut5.a aVar = this.n;
            if (aVar != null) {
                aVar.release();
            }
            this.n = null;
        }
        this.r = z;
    }

    @Override // defpackage.xc5
    public void g0() {
        ut5 e2 = e2();
        if (this.r) {
            ut5.a aVar = this.n;
            if (aVar != null) {
                aVar.release();
            }
            this.n = e2 != null ? e2.a() : null;
        }
    }
}
