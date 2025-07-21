package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.nytimes.android.features.games.gameshub.ui.util.AnnotatedStringUtilsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.it2;
import defpackage.ju7;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uo6;
import defpackage.wt7;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class GameListItemKt$GameListItem$1 extends Lambda implements gt2 {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ String $byline;
    final /* synthetic */ String $description;
    final /* synthetic */ Integer $imageUrl;
    final /* synthetic */ boolean $isGameLocked;
    final /* synthetic */ String $name;
    final /* synthetic */ ss2 $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameListItemKt$GameListItem$1(ss2 ss2Var, boolean z, long j, Integer num, String str, String str2, String str3) {
        super(2);
        this.$onClick = ss2Var;
        this.$isGameLocked = z;
        this.$backgroundColor = j;
        this.$imageUrl = num;
        this.$name = str;
        this.$description = str2;
        this.$byline = str3;
    }

    private static final float c(sy4 sy4Var) {
        return ((bu1) sy4Var.getValue()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, float f) {
        sy4Var.setValue(bu1.d(f));
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return ww8.a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2;
        String str;
        eb5.a aVar;
        if ((i & 11) == 2 && composer.i()) {
            composer.K();
            return;
        }
        if (b.G()) {
            b.S(-714930483, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.GameListItem.<anonymous> (GameListItem.kt:57)");
        }
        float f = 50;
        float f2 = 30;
        final float g = bu1.g(bu1.g(f) + bu1.g(bu1.g(f2) * 2));
        composer.z(1267520075);
        Object A = composer.A();
        Composer.a aVar2 = Composer.a;
        if (A == aVar2.a()) {
            A = b0.e(bu1.d(g), null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        final fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        Modifier.a aVar3 = Modifier.a;
        composer.z(1267520242);
        boolean S = composer.S(this.$onClick) | composer.a(this.$isGameLocked);
        final ss2 ss2Var = this.$onClick;
        final boolean z = this.$isGameLocked;
        Object A2 = composer.A();
        if (S || A2 == aVar2.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameListItemKt$GameListItem$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m396invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m396invoke() {
                    ss2.this.invoke(Boolean.valueOf(z));
                }
            };
            composer.q(A2);
        }
        composer.R();
        Modifier e = ClickableKt.e(aVar3, false, null, null, (qs2) A2, 7, null);
        composer.z(1267520300);
        boolean S2 = composer.S(fm1Var);
        Object A3 = composer.A();
        if (S2 || A3 == aVar2.a()) {
            A3 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameListItemKt$GameListItem$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(long j) {
                    GameListItemKt$GameListItem$1.d(sy4Var, ((bu1) uo6.f(bu1.d(fm1.this.v(hn3.f(j))), bu1.d(g))).n());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((hn3) obj).j());
                    return ww8.a;
                }
            };
            composer.q(A3);
        }
        composer.R();
        Modifier a = OnRemeasuredModifierKt.a(e, (ss2) A3);
        eb5.a aVar4 = eb5.Companion;
        Modifier d = BackgroundKt.d(a, aVar4.a(composer, 8).d(), null, 2, null);
        Alignment.a aVar5 = Alignment.a;
        Alignment.c i2 = aVar5.i();
        long j = this.$backgroundColor;
        Integer num = this.$imageUrl;
        String str2 = this.$name;
        String str3 = this.$description;
        boolean z2 = this.$isGameLocked;
        String str4 = this.$byline;
        composer.z(693286680);
        Arrangement arrangement = Arrangement.a;
        rg4 a2 = m.a(arrangement.f(), i2, composer, 48);
        composer.z(-1323940314);
        int a3 = cs0.a(composer, 0);
        et0 o = composer.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(d);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a4);
        } else {
            composer.p();
        }
        Composer a5 = Updater.a(composer);
        Updater.c(a5, a2, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        n37 n37Var = n37.a;
        Modifier i3 = SizeKt.i(BackgroundKt.d(aVar3, j, null, 2, null), c(sy4Var));
        Alignment e2 = aVar5.e();
        composer.z(733328855);
        rg4 g2 = BoxKt.g(e2, false, composer, 6);
        composer.z(-1323940314);
        int a6 = cs0.a(composer, 0);
        et0 o2 = composer.o();
        qs2 a7 = companion.a();
        it2 c2 = LayoutKt.c(i3);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a7);
        } else {
            composer.p();
        }
        Composer a8 = Updater.a(composer);
        Updater.c(a8, g2, companion.e());
        Updater.c(a8, o2, companion.g());
        gt2 b2 = companion.b();
        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
            a8.q(Integer.valueOf(a6));
            a8.v(Integer.valueOf(a6), b2);
        }
        c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        ImageKt.b(wt7.a(num, null, null, null, 0, composer, 0, 30), null, SizeKt.n(PaddingKt.i(aVar3, bu1.g(f2)), bu1.g(f)), null, null, 0.0f, null, composer, 432, 120);
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        float f3 = 12;
        Modifier j2 = PaddingKt.j(aVar3, bu1.g(f3), bu1.g(f3));
        composer.z(-483455358);
        rg4 a9 = d.a(arrangement.g(), aVar5.k(), composer, 0);
        composer.z(-1323940314);
        int a10 = cs0.a(composer, 0);
        et0 o3 = composer.o();
        qs2 a11 = companion.a();
        it2 c3 = LayoutKt.c(j2);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a11);
        } else {
            composer.p();
        }
        Composer a12 = Updater.a(composer);
        Updater.c(a12, a9, companion.e());
        Updater.c(a12, o3, companion.g());
        gt2 b3 = companion.b();
        if (a12.f() || !zq3.c(a12.A(), Integer.valueOf(a10))) {
            a12.q(Integer.valueOf(a10));
            a12.v(Integer.valueOf(a10), b3);
        }
        c3.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        ap0 ap0Var = ap0.a;
        TextKt.c(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.c(composer, 8).E(), composer, 0, 0, 65534);
        if (str3 == null) {
            str = "";
            composer2 = composer;
        } else {
            composer2 = composer;
            str = str3;
        }
        float f4 = 4;
        TextKt.c(str, PaddingKt.m(aVar3, 0.0f, bu1.g(f4), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.c(composer2, 8).y(), composer, 48, 0, 65532);
        composer.z(1497297829);
        if (z2) {
            Modifier m = PaddingKt.m(aVar3, 0.0f, bu1.g(20), 0.0f, 0.0f, 13, null);
            Alignment.c i4 = aVar5.i();
            composer.z(693286680);
            rg4 a13 = m.a(arrangement.f(), i4, composer, 48);
            composer.z(-1323940314);
            int a14 = cs0.a(composer, 0);
            et0 o4 = composer.o();
            qs2 a15 = companion.a();
            it2 c4 = LayoutKt.c(m);
            if (composer.j() == null) {
                cs0.c();
            }
            composer.G();
            if (composer.f()) {
                composer.D(a15);
            } else {
                composer.p();
            }
            Composer a16 = Updater.a(composer);
            Updater.c(a16, a13, companion.e());
            Updater.c(a16, o4, companion.g());
            gt2 b4 = companion.b();
            if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
                a16.q(Integer.valueOf(a14));
                a16.v(Integer.valueOf(a14), b4);
            }
            c4.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            GameComponentsKt.a(SizeKt.n(PaddingKt.m(aVar3, 0.0f, 0.0f, bu1.g(f4), 0.0f, 11, null), bu1.g(f3)), 0L, composer, 6, 2);
            aVar = aVar4;
            TextKt.c("Subscribe for more plays", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.c(composer, 8).A(), composer, 6, 0, 65534);
            composer.R();
            composer.t();
            composer.R();
            composer.R();
        } else {
            aVar = aVar4;
        }
        composer.R();
        composer.z(-93594330);
        if (str4 != null) {
            TextKt.d(AnnotatedStringUtilsKt.a(str4, null, composer, 0, 2), PaddingKt.m(aVar3, 0.0f, bu1.g(20), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar.c(composer, 8).A(), composer, 48, 0, 131068);
        }
        composer.R();
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        if (b.G()) {
            b.R();
        }
    }
}
