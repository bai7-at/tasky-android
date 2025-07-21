package org.burnoutcrew.reorderable;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import defpackage.fx6;
import defpackage.g14;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.x08;
import defpackage.zq3;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes5.dex */
public final class ReorderableState {
    private final LazyListState a;
    private final sy4 b;
    private final Channel c;
    private final x08 d;
    private final x08 e;
    private final sy4 f;
    private final sy4 g;

    public ReorderableState(LazyListState lazyListState) {
        zq3.h(lazyListState, "listState");
        this.a = lazyListState;
        this.b = b0.e(null, null, 2, null);
        this.c = ChannelKt.Channel$default(0, null, null, 7, null);
        this.d = y.d(new qs2() { // from class: org.burnoutcrew.reorderable.ReorderableState$draggedKey$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                g14 d = ReorderableState.this.d();
                if (d == null) {
                    return null;
                }
                return d.getKey();
            }
        });
        this.e = y.d(new qs2() { // from class: org.burnoutcrew.reorderable.ReorderableState$draggedOffset$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                Integer a = ReorderableState.this.a();
                if (a == null) {
                    return null;
                }
                if (fx6.a(ReorderableState.this.b().x(), a.intValue()) == null) {
                    return null;
                }
                ReorderableState reorderableState = ReorderableState.this;
                return Float.valueOf(((reorderableState.d() == null ? 0.0f : r1.b()) + reorderableState.c()) - r0.b());
            }
        });
        this.f = b0.e(null, null, 2, null);
        this.g = b0.e(Float.valueOf(0.0f), null, 2, null);
    }

    public final Integer a() {
        return (Integer) this.b.getValue();
    }

    public final LazyListState b() {
        return this.a;
    }

    public final float c() {
        return ((Number) this.g.getValue()).floatValue();
    }

    public final g14 d() {
        return (g14) this.f.getValue();
    }
}
