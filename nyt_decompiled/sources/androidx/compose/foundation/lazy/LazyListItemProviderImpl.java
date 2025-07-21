package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.runtime.Composer;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.d14;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h14;
import defpackage.q04;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes.dex */
final class LazyListItemProviderImpl implements h14 {
    private final LazyListState a;
    private final LazyListIntervalContent b;
    private final a c;
    private final q04 d;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, a aVar, q04 q04Var) {
        this.a = lazyListState;
        this.b = lazyListIntervalContent;
        this.c = aVar;
        this.d = q04Var;
    }

    @Override // defpackage.o04
    public int a() {
        return this.b.i();
    }

    @Override // defpackage.o04
    public int b(Object obj) {
        return f().b(obj);
    }

    @Override // defpackage.o04
    public Object c(int i) {
        Object c = f().c(i);
        return c == null ? this.b.j(i) : c;
    }

    @Override // defpackage.o04
    public Object d(int i) {
        return this.b.g(i);
    }

    @Override // defpackage.h14
    public a e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyListItemProviderImpl) {
            return zq3.c(this.b, ((LazyListItemProviderImpl) obj).b);
        }
        return false;
    }

    @Override // defpackage.h14
    public q04 f() {
        return this.d;
    }

    @Override // defpackage.h14
    public List g() {
        return this.b.k();
    }

    @Override // defpackage.o04
    public void h(final int i, final Object obj, Composer composer, final int i2) {
        Composer h = composer.h(-462424778);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-462424778, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        LazyLayoutPinnableItemKt.a(obj, i, this.a.z(), zr0.b(h, -824725566, true, new gt2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
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
                LazyListIntervalContent lazyListIntervalContent;
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-824725566, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
                }
                lazyListIntervalContent = LazyListItemProviderImpl.this.b;
                int i4 = i;
                LazyListItemProviderImpl lazyListItemProviderImpl = LazyListItemProviderImpl.this;
                a.C0029a c0029a = lazyListIntervalContent.h().get(i4);
                ((d14) c0029a.c()).a().invoke(lazyListItemProviderImpl.e(), Integer.valueOf(i4 - c0029a.b()), composer2, 0);
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
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$2
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
                    LazyListItemProviderImpl.this.h(i, obj, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
