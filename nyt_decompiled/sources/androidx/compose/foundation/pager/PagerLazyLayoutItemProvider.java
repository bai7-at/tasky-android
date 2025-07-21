package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.runtime.Composer;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.kn5;
import defpackage.kt2;
import defpackage.o04;
import defpackage.q04;
import defpackage.rn5;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements o04 {
    private final PagerState a;
    private final LazyLayoutIntervalContent b;
    private final q04 c;
    private final rn5 d = rn5.a;

    public PagerLazyLayoutItemProvider(PagerState pagerState, LazyLayoutIntervalContent lazyLayoutIntervalContent, q04 q04Var) {
        this.a = pagerState;
        this.b = lazyLayoutIntervalContent;
        this.c = q04Var;
    }

    @Override // defpackage.o04
    public int a() {
        return this.b.i();
    }

    @Override // defpackage.o04
    public int b(Object obj) {
        return this.c.b(obj);
    }

    @Override // defpackage.o04
    public Object c(int i) {
        Object c = this.c.c(i);
        return c == null ? this.b.j(i) : c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PagerLazyLayoutItemProvider) {
            return zq3.c(this.b, ((PagerLazyLayoutItemProvider) obj).b);
        }
        return false;
    }

    @Override // defpackage.o04
    public void h(final int i, final Object obj, Composer composer, final int i2) {
        Composer h = composer.h(-1201380429);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1201380429, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:195)");
        }
        LazyLayoutPinnableItemKt.a(obj, i, this.a.I(), zr0.b(h, 1142237095, true, new gt2() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$1
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
                LazyLayoutIntervalContent lazyLayoutIntervalContent;
                rn5 rn5Var;
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1142237095, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:197)");
                }
                lazyLayoutIntervalContent = PagerLazyLayoutItemProvider.this.b;
                int i4 = i;
                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = PagerLazyLayoutItemProvider.this;
                a.C0029a c0029a = lazyLayoutIntervalContent.h().get(i4);
                int b = i4 - c0029a.b();
                kt2 a = ((kn5) c0029a.c()).a();
                rn5Var = pagerLazyLayoutItemProvider.d;
                a.invoke(rn5Var, Integer.valueOf(b), composer2, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), h, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 3592);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$2
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
                    PagerLazyLayoutItemProvider.this.h(i, obj, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
