package com.nytimes.android.features.games.gameshub.ui.components;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.cc7;
import defpackage.g14;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ItemImpressionKt {
    public static final void a(final Object obj, final LazyListState lazyListState, ss2 ss2Var, qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i, final int i2) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(lazyListState, "lazyListState");
        zq3.h(qs2Var2, "onItemViewed");
        Composer h = composer.h(715853453);
        ss2 ss2Var2 = (i2 & 4) != 0 ? new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(tx1 tx1Var) {
                zq3.h(tx1Var, "it");
                return Boolean.TRUE;
            }
        } : ss2Var;
        final qs2 qs2Var3 = (i2 & 8) != 0 ? new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.TRUE;
            }
        } : qs2Var;
        if (b.G()) {
            b.S(715853453, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.ItemImpression (ItemImpression.kt:24)");
        }
        h.z(1048811340);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        ww8 ww8Var = ww8.a;
        py1.d(ww8Var, new ItemImpressionKt$ItemImpression$3(context, ss2Var2, sy4Var, null), h, 70);
        h.z(1048811769);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = y.d(new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$isItemWithKeyInView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    boolean b;
                    boolean z;
                    b = ItemImpressionKt.b(sy4Var);
                    if (b) {
                        List k = LazyListState.this.x().k();
                        qs2 qs2Var4 = qs2Var3;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : k) {
                            if (((Boolean) qs2Var4.mo865invoke()).booleanValue()) {
                                arrayList.add(obj2);
                            }
                        }
                        Object obj3 = obj;
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (zq3.c(((g14) it2.next()).getKey(), obj3)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
            });
            h.q(A2);
        }
        h.R();
        if (d((x08) A2)) {
            h.z(1048812084);
            boolean z = (((57344 & i) ^ 24576) > 16384 && h.S(qs2Var2)) || (i & 24576) == 16384;
            Object A3 = h.A();
            if (z || A3 == aVar.a()) {
                A3 = new ItemImpressionKt$ItemImpression$4$1(qs2Var2, sy4Var, null);
                h.q(A3);
            }
            h.R();
            py1.d(ww8Var, (gt2) A3, h, 70);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final ss2 ss2Var3 = ss2Var2;
            final qs2 qs2Var4 = qs2Var3;
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$5
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
                    ItemImpressionKt.a(obj, lazyListState, ss2Var3, qs2Var4, qs2Var2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final boolean d(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }
}
