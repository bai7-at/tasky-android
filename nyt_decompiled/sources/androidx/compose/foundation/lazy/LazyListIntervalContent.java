package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.h;
import androidx.compose.runtime.Composer;
import defpackage.d14;
import defpackage.h04;
import defpackage.it2;
import defpackage.kt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent implements LazyListScope {
    private final h a = new h();
    private List b;

    public LazyListIntervalContent(ss2 ss2Var) {
        ss2Var.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void a(Object obj, Object obj2, it2 it2Var) {
        List list = this.b;
        if (list == null) {
            list = new ArrayList();
            this.b = list;
        }
        list.add(Integer.valueOf(h().a()));
        f(obj, obj2, it2Var);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void b(int i, ss2 ss2Var, ss2 ss2Var2, kt2 kt2Var) {
        h().c(i, new d14(ss2Var, ss2Var2, kt2Var));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void f(final Object obj, final Object obj2, final it2 it2Var) {
        h().c(1, new d14(obj != null ? new ss2() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }

            public final Object invoke(int i) {
                return obj;
            }
        } : null, new ss2() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }

            public final Object invoke(int i) {
                return obj2;
            }
        }, zr0.c(-1010194746, true, new kt2() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$3
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((h04) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, int i, Composer composer, int i2) {
                if ((i2 & 14) == 0) {
                    i2 |= composer.S(h04Var) ? 4 : 2;
                }
                if ((i2 & 651) == 130 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1010194746, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                it2.this.invoke(h04Var, composer, Integer.valueOf(i2 & 14));
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        })));
    }

    public final List k() {
        List list = this.b;
        return list == null ? i.l() : list;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h h() {
        return this.a;
    }
}
