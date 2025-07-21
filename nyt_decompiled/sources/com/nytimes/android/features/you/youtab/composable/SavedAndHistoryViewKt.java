package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.features.you.youtab.a;
import com.nytimes.android.features.you.youtab.e;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.pb;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class SavedAndHistoryViewKt {
    /* JADX WARN: Removed duplicated region for block: B:58:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r40, final int r41, final int r42, final boolean r43, final java.util.List r44, final defpackage.qs2 r45, final boolean r46, androidx.compose.ui.Modifier r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt.a(int, int, int, boolean, java.util.List, qs2, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final boolean z, final List list, final int i, final boolean z2, final qs2 qs2Var, Modifier modifier, Composer composer, final int i2, final int i3) {
        zq3.h(list, "historyImageList");
        zq3.h(qs2Var, "openRecentlyViewedActivity");
        Composer h = composer.h(-778191273);
        final Modifier modifier2 = (i3 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-778191273, i2, -1, "com.nytimes.android.features.you.youtab.composable.RecentlyViewedItemView (SavedAndHistoryView.kt:245)");
        }
        int i4 = yk6.recently_viewed;
        int i5 = re6.ic_recently_viewed;
        h.z(1116186642);
        boolean z3 = (((57344 & i2) ^ 24576) > 16384 && h.S(qs2Var)) || (i2 & 24576) == 16384;
        Object A = h.A();
        if (z3 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$RecentlyViewedItemView$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m453invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m453invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        qs2 qs2Var2 = (qs2) A;
        h.R();
        int i6 = i2 << 9;
        a(i4, i, i5, z, list, qs2Var2, z2, modifier2, h, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 32768 | (i6 & 7168) | (i6 & 3670016) | ((i2 << 6) & 29360128), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$RecentlyViewedItemView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    SavedAndHistoryViewKt.b(z, list, i, z2, qs2Var, modifier2, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final void c(final float f, final DownloadState downloadState, final DownloadState downloadState2, final qs2 qs2Var, final qs2 qs2Var2, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(downloadState, "historyState");
        zq3.h(downloadState2, "savedState");
        zq3.h(qs2Var, "openSavedForLaterActivity");
        zq3.h(qs2Var2, "openRecentlyViewedActivity");
        Composer h = composer.h(1638698329);
        final Modifier modifier2 = (i2 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1638698329, i, -1, "com.nytimes.android.features.you.youtab.composable.SavedAndHistoryView (SavedAndHistoryView.kt:67)");
        }
        Object a = downloadState2.a();
        final e.a aVar = a instanceof e.a ? (e.a) a : null;
        Object a2 = downloadState.a();
        final a.C0295a c0295a = a2 instanceof a.C0295a ? (a.C0295a) a2 : null;
        SurfaceKt.a(modifier2, null, eb5.Companion.b(h, 8).a(), 0L, null, 0.0f, zr0.b(h, -191243619, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$SavedAndHistoryView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                List l;
                List l2;
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-191243619, i3, -1, "com.nytimes.android.features.you.youtab.composable.SavedAndHistoryView.<anonymous> (SavedAndHistoryView.kt:75)");
                }
                Arrangement.f d = Arrangement.a.d();
                Modifier.a aVar2 = Modifier.a;
                Modifier a3 = pb.a(PaddingKt.m(PaddingKt.k(SizeKt.h(aVar2, 0.0f, 1, null), bu1.g(20), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bu1.g(24), 7, null), f);
                DownloadState downloadState3 = downloadState2;
                DownloadState downloadState4 = downloadState;
                e.a aVar3 = aVar;
                qs2 qs2Var3 = qs2Var;
                a.C0295a c0295a2 = c0295a;
                qs2 qs2Var4 = qs2Var2;
                composer2.z(693286680);
                rg4 a4 = m.a(d, Alignment.a.l(), composer2, 6);
                composer2.z(-1323940314);
                int a5 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a6 = companion.a();
                it2 c = LayoutKt.c(a3);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a6);
                } else {
                    composer2.p();
                }
                Composer a7 = Updater.a(composer2);
                Updater.c(a7, a4, companion.e());
                Updater.c(a7, o, companion.g());
                gt2 b = companion.b();
                if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                    a7.q(Integer.valueOf(a5));
                    a7.v(Integer.valueOf(a5), b);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                n37 n37Var = n37.a;
                composer2.z(-1141224196);
                boolean S = composer2.S(downloadState3) | composer2.S(downloadState4);
                Object A = composer2.A();
                if (S || A == Composer.a.a()) {
                    A = b0.e(Boolean.valueOf((downloadState4 instanceof DownloadState.e) && (downloadState3 instanceof DownloadState.e)), null, 2, null);
                    composer2.q(A);
                }
                sy4 sy4Var = (sy4) A;
                composer2.R();
                boolean booleanValue = ((Boolean) sy4Var.getValue()).booleanValue();
                if (aVar3 == null || (l = aVar3.a()) == null) {
                    l = i.l();
                }
                SavedAndHistoryViewKt.d(l, aVar3 != null ? aVar3.b() : 0, booleanValue, downloadState3 instanceof DownloadState.c, qs2Var3, m37.b(n37Var, aVar2, 1.0f, false, 2, null), composer2, 8, 0);
                SpacerKt.a(SizeKt.s(aVar2, bu1.g(17)), composer2, 6);
                boolean booleanValue2 = ((Boolean) sy4Var.getValue()).booleanValue();
                if (c0295a2 == null || (l2 = c0295a2.a()) == null) {
                    l2 = i.l();
                }
                SavedAndHistoryViewKt.b(booleanValue2, l2, c0295a2 != null ? c0295a2.b() : 0, downloadState4 instanceof DownloadState.c, qs2Var4, m37.b(n37Var, aVar2, 1.0f, false, 2, null), composer2, 64, 0);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, ((i >> 15) & 14) | 1572864, 58);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$SavedAndHistoryView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    SavedAndHistoryViewKt.c(f, downloadState, downloadState2, qs2Var, qs2Var2, modifier2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void d(final List list, final int i, final boolean z, final boolean z2, final qs2 qs2Var, Modifier modifier, Composer composer, final int i2, final int i3) {
        zq3.h(list, "savedImageList");
        zq3.h(qs2Var, "openSavedForLaterActivity");
        Composer h = composer.h(1385105854);
        final Modifier modifier2 = (i3 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1385105854, i2, -1, "com.nytimes.android.features.you.youtab.composable.SavedItemView (SavedAndHistoryView.kt:224)");
        }
        int i4 = yk6.saved;
        int i5 = re6.ic_saved;
        h.z(-1694411334);
        boolean z3 = (((57344 & i2) ^ 24576) > 16384 && h.S(qs2Var)) || (i2 & 24576) == 16384;
        Object A = h.A();
        if (z3 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$SavedItemView$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m454invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m454invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        a(i4, i, i5, z, list, (qs2) A, z2, modifier2, h, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 32768 | ((i2 << 3) & 7168) | ((i2 << 9) & 3670016) | ((i2 << 6) & 29360128), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$SavedItemView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    SavedAndHistoryViewKt.d(list, i, z, z2, qs2Var, modifier2, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
