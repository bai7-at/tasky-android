package com.nytimes.android.features.you.youtab.composable.interests.flashback;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.y25;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class FlashbackInterestKt {
    public static final void a(final int i, final Interest.FlashbackQuizInterest flashbackQuizInterest, final gt2 gt2Var, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final qs2 qs2Var4, Composer composer, final int i2) {
        zq3.h(flashbackQuizInterest, "interest");
        zq3.h(gt2Var, "onAssetClick");
        zq3.h(qs2Var, "sendFlashbackInterestQuizImpression");
        zq3.h(qs2Var2, "sendFlashbackResultImpression");
        zq3.h(qs2Var3, "reloadFlashbackScore");
        zq3.h(qs2Var4, "flashbackQuizInitialed");
        Composer h = composer.h(-29219931);
        if (b.G()) {
            b.S(-29219931, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterest (FlashbackInterest.kt:21)");
        }
        ww8 ww8Var = ww8.a;
        h.z(-1193724024);
        boolean z = (((i2 & 458752) ^ 196608) > 131072 && h.S(qs2Var3)) || (i2 & 196608) == 131072;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new FlashbackInterestKt$FlashbackInterest$1$1(qs2Var3, null);
            h.q(A);
        }
        h.R();
        LifecycleUtilsKt.a(ww8Var, (gt2) A, h, 70);
        if (flashbackQuizInterest.i() == null) {
            h.z(-1193723942);
            FlashbackInterestQuizKt.a(i, flashbackQuizInterest, qs2Var, qs2Var4, null, gt2Var, h, (i2 & 14) | 64 | ((i2 >> 3) & 896) | ((i2 >> 9) & 7168) | (458752 & (i2 << 9)), 16);
            h.R();
        } else {
            h.z(-1193723614);
            Integer i3 = flashbackQuizInterest.i();
            if (i3 != null) {
                FlashbackInterestResultKt.b(i, i3.intValue(), flashbackQuizInterest.d(), qs2Var2, flashbackQuizInterest, null, gt2Var, h, 33280 | (i2 & 14) | ((i2 >> 3) & 7168) | ((i2 << 12) & 3670016), 32);
            }
            h.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestKt$FlashbackInterest$3
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
                    FlashbackInterestKt.a(i, flashbackQuizInterest, gt2Var, qs2Var, qs2Var2, qs2Var3, qs2Var4, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    public static final y25 b(InterestAsset interestAsset, boolean z, int i, String str) {
        zq3.h(interestAsset, "<this>");
        String k = str == null ? interestAsset.k() : str;
        String j = str == null ? interestAsset.j() : str;
        InterestType interestType = InterestType.FLASHBACK;
        return new y25(k, AssetConstants.ARTICLE_TYPE, j, interestType.getType(), interestType.getType(), interestAsset.m(interestAsset), false, null, null, NavigationSource.YOU_TAB_FLASHBACK, null, String.valueOf(i), "you tab", "interests-hub", z ? "TAKE_THE_QUIZ" : "TAKE_PAST_QUIZZES", null, null, null, null, 426240, null);
    }

    public static /* synthetic */ y25 c(InterestAsset interestAsset, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        return b(interestAsset, z, i, str);
    }
}
