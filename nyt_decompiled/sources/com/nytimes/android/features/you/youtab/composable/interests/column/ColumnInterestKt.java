package com.nytimes.android.features.you.youtab.composable.interests.column;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.navigation.NavigationSource;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.y25;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class ColumnInterestKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Interest.ColumnInterest.ColumnInterestSize.values().length];
            try {
                iArr[Interest.ColumnInterest.ColumnInterestSize.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Interest.ColumnInterest.ColumnInterestSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Interest.ColumnInterest.ColumnInterestSize.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final ss2 ss2Var, final List list, final int i, final gt2 gt2Var, final qs2 qs2Var, Composer composer, final int i2) {
        Composer composer2;
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(list, "assetList");
        zq3.h(gt2Var, "onAssetClick");
        zq3.h(qs2Var, "sendColumnInterestImpression");
        Composer h = composer.h(736513947);
        if (b.G()) {
            b.S(736513947, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.column.ColumnInterest (ColumnInterest.kt:22)");
        }
        ww8 ww8Var = ww8.a;
        h.z(1575383695);
        boolean z = (((i2 & 57344) ^ 24576) > 16384 && h.S(qs2Var)) || (i2 & 24576) == 16384;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new ColumnInterestKt$ColumnInterest$1$1(qs2Var, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        InterestAsset interestAsset = (InterestAsset) i.k0(list);
        int i3 = a.a[Interest.ColumnInterest.ColumnInterestSize.Companion.a(interestAsset).ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                h.z(1575384102);
                MediumColumnInterestKt.b(ss2Var, i, list, null, gt2Var, h, (i2 & 14) | 512 | ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (57344 & (i2 << 3)), 8);
                h.R();
            } else if (i3 != 3) {
                h.z(1575384518);
                h.R();
            } else {
                h.z(1575384317);
                SmallColumnInterestKt.a(ss2Var, i, list, gt2Var, h, (i2 & 14) | 512 | ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 7168));
                h.R();
            }
            composer2 = h;
        } else {
            h.z(1575384065);
            composer2 = h;
            LargeColumnInterestKt.b(ss2Var, i, interestAsset, i.e0(list, 1), null, gt2Var, composer2, (i2 & 14) | 4608 | ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i2 << 6) & 458752), 16);
            composer2.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.ColumnInterestKt$ColumnInterest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    ColumnInterestKt.a(ss2.this, list, i, gt2Var, qs2Var, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    public static final y25 b(InterestAsset interestAsset, int i) {
        zq3.h(interestAsset, "<this>");
        String k = interestAsset.k();
        String j = interestAsset.j();
        InterestType interestType = InterestType.COLUMN;
        return new y25(k, AssetConstants.ARTICLE_TYPE, j, interestType.getType(), interestType.getType(), interestAsset.m(interestAsset), false, null, null, NavigationSource.YOU_TAB_COLUMN, null, String.valueOf(i), "you tab", "interests-hub", interestType.getType(), null, null, null, null, 426240, null);
    }
}
