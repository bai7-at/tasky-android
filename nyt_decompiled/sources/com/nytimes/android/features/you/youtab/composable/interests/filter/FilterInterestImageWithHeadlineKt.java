package com.nytimes.android.features.you.youtab.composable.interests.filter;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import coil.compose.SingletonAsyncImageKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.SaveOrigin;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.bf8;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.ff8;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.nn0;
import defpackage.pb;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.s87;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t5;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.yc0;
import defpackage.zq3;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class FilterInterestImageWithHeadlineKt {
    public static final void a(final String str, final InterestAsset interestAsset, final boolean z, final SaveHandler saveHandler, final ss2 ss2Var, final int i, final String str2, final String str3, Modifier modifier, final gt2 gt2Var, Composer composer, final int i2, final int i3) {
        zq3.h(str, "headline");
        zq3.h(interestAsset, "asset");
        zq3.h(saveHandler, "saveHandler");
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(str2, "filterName");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(-2120549548);
        Modifier modifier2 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-2120549548, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadline (FilterInterestImageWithHeadline.kt:60)");
        }
        h.z(-383542334);
        boolean z2 = (((i2 & 896) ^ 384) > 256 && h.a(z)) || (i2 & 384) == 256;
        Object A = h.A();
        if (z2 || A == Composer.a.a()) {
            A = b0.e(Boolean.valueOf(saveHandler.p(ShuffleInterestKt.h(interestAsset))), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        final ComponentActivity d = t5.d(h, 0);
        LifecycleUtilsKt.a(Boolean.valueOf(z), new FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1(saveHandler, interestAsset, sy4Var, null), h, ((i2 >> 6) & 14) | 64);
        Modifier f = SizeKt.f(ClickableKt.e(modifier2, false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m521invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m521invoke() {
                gt2.this.invoke(FilterInterestKt.c(interestAsset, i, str2), d);
            }
        }, 7, null), 0.0f, 1, null);
        h.z(733328855);
        Alignment.a aVar = Alignment.a;
        rg4 g = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        Composer a3 = Updater.a(h);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        vg3 a4 = new vg3.a((Context) h.m(AndroidCompositionLocals_androidKt.g())).d(str3).g(re6.ic_filter_placeholder).f(re6.ic_filter_placeholder).c(true).a();
        ContentScale d2 = ContentScale.a.d();
        Modifier.a aVar2 = Modifier.a;
        SingletonAsyncImageKt.a(a4, null, ModifierUtilsKt.a(AspectRatioKt.b(aVar2, 0.66f, false, 2, null), ((Boolean) ss2Var.invoke(interestAsset.j())).booleanValue(), new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$3$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Modifier invoke(Modifier modifier3) {
                zq3.h(modifier3, "$this$conditional");
                return pb.a(modifier3, 0.6f);
            }
        }), null, null, null, d2, 0.0f, null, 0, h, 1572920, 952);
        Modifier k = SizeKt.k(SizeKt.h(boxScopeInstance.c(aVar2, aVar.b()), 0.0f, 1, null), bu1.g(260), 0.0f, 2, null);
        yc0.a aVar3 = yc0.b;
        nn0.a aVar4 = nn0.b;
        Modifier b2 = BackgroundKt.b(k, yc0.a.d(aVar3, i.o(nn0.j(nn0.r(aVar4.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), nn0.j(aVar4.f())), Float.POSITIVE_INFINITY, 0.0f, 0, 8, null), null, 0.0f, 6, null);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c2 = LayoutKt.c(b2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a6);
        } else {
            h.p();
        }
        Composer a7 = Updater.a(h);
        Updater.c(a7, g2, companion.e());
        Updater.c(a7, o2, companion.g());
        gt2 b3 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b3);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        Modifier f2 = SizeKt.f(boxScopeInstance.c(aVar2, aVar.b()), 0.0f, 1, null);
        float f3 = 20;
        Modifier l = PaddingKt.l(f2, bu1.g(f3), bu1.g(f3), bu1.g(f3), bu1.g(68));
        h.z(693286680);
        rg4 a8 = m.a(Arrangement.a.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a9 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a10 = companion.a();
        it2 c3 = LayoutKt.c(l);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a10);
        } else {
            h.p();
        }
        Composer a11 = Updater.a(h);
        Updater.c(a11, a8, companion.e());
        Updater.c(a11, o3, companion.g());
        gt2 b4 = companion.b();
        if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
            a11.q(Integer.valueOf(a9));
            a11.v(Integer.valueOf(a9), b4);
        }
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        TextKt.c(str, n37Var.c(m37.b(n37Var, aVar2, 1.0f, false, 2, null), aVar.i()), ((Boolean) ss2Var.invoke(interestAsset.j())).booleanValue() ? nn0.r(ff8.b(bf8.a().l()), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : ff8.b(bf8.a().l()), 0L, null, null, null, 0L, null, null, ek8.g(32), 0, false, 0, 0, null, new j(0L, ek8.g(28), o.b.d(), null, null, gb5.c(), null, 0L, null, null, null, 0L, null, new jo7(nn0.r(aVar4.a(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), hd5.a(0.0f, 0.0f), 2.0f, null), null, 0, 0, 0L, null, null, null, 0, 0, null, 16768985, null), h, i2 & 14, 6, 64504);
        IconKt.b(do5.d(((Boolean) sy4Var.getValue()).booleanValue() ? re6.ic_saved : re6.ic_save, h, 0), null, ClickableKt.e(SizeKt.n(PaddingKt.m(aVar2, bu1.g(12), 0.0f, 0.0f, 0.0f, 14, null), bu1.g(24)), false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$3$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m522invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m522invoke() {
                s87 h2 = ShuffleInterestKt.h(InterestAsset.this);
                if (((Boolean) sy4Var.getValue()).booleanValue()) {
                    SaveHandler saveHandler2 = saveHandler;
                    SaveOrigin saveOrigin = SaveOrigin.FILTER_INTEREST;
                    final sy4 sy4Var2 = sy4Var;
                    saveHandler2.t(null, h2, saveOrigin, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$3$2$1$1.1
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z3) {
                            sy4.this.setValue(Boolean.valueOf(z3));
                        }
                    });
                    return;
                }
                SaveHandler saveHandler3 = saveHandler;
                SaveOrigin saveOrigin2 = SaveOrigin.FILTER_INTEREST;
                final sy4 sy4Var3 = sy4Var;
                saveHandler3.m(null, h2, saveOrigin2, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$3$2$1$1.2
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z3) {
                        sy4.this.setValue(Boolean.valueOf(z3));
                    }
                });
            }
        }, 7, null), ff8.b(bf8.a().l()), h, 56, 0);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            final Modifier modifier3 = modifier2;
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$4
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
                    FilterInterestImageWithHeadlineKt.a(str, interestAsset, z, saveHandler, ss2Var, i, str2, str3, modifier3, gt2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
