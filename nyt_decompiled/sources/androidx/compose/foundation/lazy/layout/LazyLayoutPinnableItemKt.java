package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.layout.PinnableContainerKt;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.o76;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ut5;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class LazyLayoutPinnableItemKt {
    public static final void a(final Object obj, final int i, final f fVar, final gt2 gt2Var, Composer composer, final int i2) {
        Composer h = composer.h(-2079116560);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2079116560, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        h.z(511388516);
        boolean S = h.S(obj) | h.S(fVar);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = new e(obj, fVar);
            h.q(A);
        }
        h.R();
        final e eVar = (e) A;
        eVar.g(i);
        eVar.i((ut5) h.m(PinnableContainerKt.a()));
        h.z(1161125085);
        boolean S2 = h.S(eVar);
        Object A2 = h.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1

                public static final class a implements ms1 {
                    final /* synthetic */ e a;

                    public a(e eVar) {
                        this.a = eVar;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.f();
                    }
                }

                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    return new a(e.this);
                }
            };
            h.q(A2);
        }
        h.R();
        py1.a(eVar, (ss2) A2, h, 0);
        CompositionLocalKt.a(PinnableContainerKt.a().c(eVar), gt2Var, h, o76.d | ((i2 >> 6) & ContentType.LONG_FORM_ON_DEMAND));
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    LazyLayoutPinnableItemKt.a(obj, i, fVar, gt2Var, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }
}
