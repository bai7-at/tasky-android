package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.you.youtab.SortOrder;
import com.nytimes.android.interests.InterestType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.ei0;
import defpackage.fb0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.k48;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.rx0;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class InterestDisplayKt {
    private static final long a = wn0.d(4283077867L);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterestType.values().length];
            try {
                iArr[InterestType.COLUMN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterestType.NEWSLETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterestType.NEWSQUIZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.h04 r30, final com.nytimes.android.interests.db.a r31, final com.nytimes.android.features.you.youtab.YouScreenViewModel r32, final defpackage.qs2 r33, final com.nytimes.android.utils.snackbar.SnackbarUtil r34, final defpackage.vy8 r35, final com.nytimes.android.saved.SaveHandler r36, androidx.compose.runtime.Composer r37, final int r38) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.InterestDisplayKt.a(h04, com.nytimes.android.interests.db.a, com.nytimes.android.features.you.youtab.YouScreenViewModel, qs2, com.nytimes.android.utils.snackbar.SnackbarUtil, vy8, com.nytimes.android.saved.SaveHandler, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(final String str, final String str2, final String str3, final boolean z, final boolean z2, final StateFlow stateFlow, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final qs2 qs2Var4, final qs2 qs2Var5, final qs2 qs2Var6, final String str4, Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2, final int i3) {
        zq3.h(str, "title");
        zq3.h(stateFlow, "selectedSortOption");
        zq3.h(qs2Var, "onReorderClick");
        zq3.h(qs2Var2, "onRemoveClick");
        zq3.h(qs2Var3, "onTitleClick");
        zq3.h(qs2Var4, "sendTabOnKebabMenuInteraction");
        zq3.h(qs2Var5, "sendNewlyAddedLabelImpression");
        zq3.h(qs2Var6, "sendUpdatedInterestDotImpression");
        zq3.h(gt2Var, "content");
        Composer h = composer.h(182357593);
        Modifier modifier2 = (i3 & 8192) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(182357593, i, i2, "com.nytimes.android.features.you.youtab.composable.interests.InterestCard (InterestDisplay.kt:342)");
        }
        x08 b = y.b(stateFlow, null, h, 8, 1);
        eb5.a aVar = eb5.Companion;
        final Modifier modifier3 = modifier2;
        ei0.a(SizeKt.w(SizeKt.h(modifier2, 0.0f, 1, null), null, false, 3, null), null, aVar.b(h, 8).a(), 0L, fb0.a(bu1.g(1), aVar.b(h, 8).l()), bu1.g(0), zr0.b(h, -719560708, true, new InterestDisplayKt$InterestCard$1(z, qs2Var5, z2, qs2Var6, gt2Var, str4, qs2Var3, str3, str2, qs2Var2, qs2Var, qs2Var4, str, b)), h, 1769472, 10);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestDisplayKt$InterestCard$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    InterestDisplayKt.b(str, str2, str3, z, z2, stateFlow, qs2Var, qs2Var2, qs2Var3, qs2Var4, qs2Var5, qs2Var6, str4, modifier3, gt2Var, composer2, gt6.a(i | 1), gt6.a(i2), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SortOrder c(x08 x08Var) {
        return (SortOrder) x08Var.getValue();
    }

    public static final List e(SortOrder sortOrder, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, int i) {
        List e;
        zq3.h(sortOrder, "sortOrder");
        zq3.h(qs2Var, "onRemoveClick");
        zq3.h(qs2Var2, "onReorderClick");
        composer.z(-1769189790);
        if (b.G()) {
            b.S(-1769189790, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.getMenuItems (InterestDisplay.kt:489)");
        }
        String b = k48.b(yk6.interest_remove, composer, 0);
        composer.z(279193149);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && composer.S(qs2Var)) || (i & 48) == 32;
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestDisplayKt$getMenuItems$removeItem$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m509invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m509invoke() {
                    qs2.this.mo865invoke();
                }
            };
            composer.q(A);
        }
        composer.R();
        rx0 rx0Var = new rx0(b, (qs2) A, nn0.j(eb5.Companion.b(composer, 8).d()), null);
        if (sortOrder == SortOrder.YOUR_ORDER) {
            String b2 = k48.b(yk6.interest_rearrange, composer, 0);
            composer.z(279193510);
            boolean z2 = (((i & 896) ^ 384) > 256 && composer.S(qs2Var2)) || (i & 384) == 256;
            Object A2 = composer.A();
            if (z2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestDisplayKt$getMenuItems$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m508invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m508invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                composer.q(A2);
            }
            composer.R();
            e = i.o(rx0Var, new rx0(b2, (qs2) A2, null, 4, null));
        } else {
            if (sortOrder != SortOrder.MOST_RECENT) {
                throw new NoWhenBranchMatchedException();
            }
            e = i.e(rx0Var);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e;
    }

    public static final long f() {
        return a;
    }
}
