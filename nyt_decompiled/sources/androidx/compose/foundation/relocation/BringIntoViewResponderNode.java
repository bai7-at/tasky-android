package androidx.compose.foundation.relocation;

import defpackage.by0;
import defpackage.cz3;
import defpackage.du8;
import defpackage.jv4;
import defpackage.kt6;
import defpackage.lv4;
import defpackage.pc0;
import defpackage.qs2;
import defpackage.rc0;
import defpackage.sc0;
import defpackage.ww8;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends a implements pc0 {
    private rc0 s;
    private final jv4 t = lv4.b(du8.a(BringIntoViewKt.a(), this));

    public BringIntoViewResponderNode(rc0 rc0Var) {
        this.s = rc0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kt6 i2(BringIntoViewResponderNode bringIntoViewResponderNode, cz3 cz3Var, qs2 qs2Var) {
        kt6 kt6Var;
        kt6 b;
        cz3 e2 = bringIntoViewResponderNode.e2();
        if (e2 == null) {
            return null;
        }
        if (!cz3Var.m()) {
            cz3Var = null;
        }
        if (cz3Var == null || (kt6Var = (kt6) qs2Var.mo865invoke()) == null) {
            return null;
        }
        b = sc0.b(e2, cz3Var, kt6Var);
        return b;
    }

    @Override // defpackage.kv4
    public jv4 V() {
        return this.t;
    }

    @Override // defpackage.pc0
    public Object Y(final cz3 cz3Var, final qs2 qs2Var, by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new BringIntoViewResponderNode$bringChildIntoView$2(this, cz3Var, qs2Var, new qs2() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final kt6 mo865invoke() {
                kt6 i2;
                i2 = BringIntoViewResponderNode.i2(BringIntoViewResponderNode.this, cz3Var, qs2Var);
                if (i2 != null) {
                    return BringIntoViewResponderNode.this.j2().z(i2);
                }
                return null;
            }
        }, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    public final rc0 j2() {
        return this.s;
    }
}
