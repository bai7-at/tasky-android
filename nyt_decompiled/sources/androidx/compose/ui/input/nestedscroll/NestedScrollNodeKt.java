package androidx.compose.ui.input.nestedscroll;

import defpackage.d35;
import defpackage.iv4;
import defpackage.n76;
import defpackage.ql1;
import defpackage.qs2;

/* loaded from: classes.dex */
public abstract class NestedScrollNodeKt {
    private static final n76 a = iv4.a(new qs2() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$ModifierLocalNestedScroll$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NestedScrollNode mo865invoke() {
            return null;
        }
    });

    public static final n76 a() {
        return a;
    }

    public static final ql1 b(d35 d35Var, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(d35Var, nestedScrollDispatcher);
    }
}
