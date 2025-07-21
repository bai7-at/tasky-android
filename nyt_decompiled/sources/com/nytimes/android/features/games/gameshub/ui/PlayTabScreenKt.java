package com.nytimes.android.features.games.gameshub.ui;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.j;
import androidx.lifecycle.Lifecycle;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.features.games.gameshub.configuration.models.CardType;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGameLayout;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabFooter;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabHeader;
import com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel;
import com.nytimes.android.tabs.composable.MainTopAppBarKt;
import com.nytimes.android.utils.composeutils.ActionUtilsKt;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.ac0;
import defpackage.aj8;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.cy4;
import defpackage.d44;
import defpackage.d8;
import defpackage.dv5;
import defpackage.e44;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.jv5;
import defpackage.k48;
import defpackage.m37;
import defpackage.ow7;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rk6;
import defpackage.s5;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.vy8;
import defpackage.wt2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class PlayTabScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final ss2 ss2Var, final ss2 ss2Var2, Composer composer, final int i) {
        Composer h = composer.h(-569178833);
        if (b.G()) {
            b.S(-569178833, i, -1, "com.nytimes.android.features.games.gameshub.ui.DisposableLifecycleEffect (PlayTabScreen.kt:253)");
        }
        final d44 d44Var = (d44) h.m(AndroidCompositionLocals_androidKt.i());
        ActionUtilsKt.a(null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$DisposableLifecycleEffect$1

            @fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$DisposableLifecycleEffect$1$1", f = "PlayTabScreen.kt", l = {259}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$DisposableLifecycleEffect$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ss2 $onCreate;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ss2 ss2Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$onCreate = ss2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$onCreate, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ss2 ss2Var = this.$onCreate;
                        this.label = 1;
                        if (ss2Var.invoke(this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            @fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$DisposableLifecycleEffect$1$2", f = "PlayTabScreen.kt", l = {264}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$DisposableLifecycleEffect$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                final /* synthetic */ ss2 $onResume;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ss2 ss2Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$onResume = ss2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass2(this.$onResume, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ss2 ss2Var = this.$onResume;
                        this.label = 1;
                        if (ss2Var.invoke(this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Lifecycle.Event event) {
                zq3.h(event, "event");
                if (event == Lifecycle.Event.ON_CREATE) {
                    BuildersKt__Builders_commonKt.launch$default(e44.a(d44.this), null, null, new AnonymousClass1(ss2Var, null), 3, null);
                }
                if (event == Lifecycle.Event.ON_RESUME) {
                    BuildersKt__Builders_commonKt.launch$default(e44.a(d44.this), null, null, new AnonymousClass2(ss2Var2, null), 3, null);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Lifecycle.Event) obj);
                return ww8.a;
            }
        }, h, 0, 1);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$DisposableLifecycleEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    PlayTabScreenKt.a(ss2.this, ss2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final dv5 dv5Var, final PlayTabViewModel.b bVar, final jv5 jv5Var, final fe4 fe4Var, final PlayTabViewModel playTabViewModel, Composer composer, final int i) {
        NytGameLayout c;
        List d;
        Composer h = composer.h(-1897089759);
        if (b.G()) {
            b.S(-1897089759, i, -1, "com.nytimes.android.features.games.gameshub.ui.GameContent (PlayTabScreen.kt:190)");
        }
        ComponentActivity d2 = s5.d(h, 0);
        zq3.f(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) d2;
        final vy8 vy8Var = (vy8) h.m(CompositionLocalsKt.o());
        List e = bVar.e();
        if (e.isEmpty()) {
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        PlayTabScreenKt.b(dv5.this, bVar, jv5Var, fe4Var, playTabViewModel, composer2, gt6.a(i | 1));
                    }
                });
                return;
            }
            return;
        }
        NytGamesConfiguration d3 = bVar.d();
        if (d3 == null || (c = d3.c()) == null || (d = c.d()) == null) {
            if (b.G()) {
                b.R();
            }
            cc7 k2 = h.k();
            if (k2 != null) {
                k2.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$playTabSections$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        PlayTabScreenKt.b(dv5.this, bVar, jv5Var, fe4Var, playTabViewModel, composer2, gt6.a(i | 1));
                    }
                });
                return;
            }
            return;
        }
        PlayTabHeader a = com.nytimes.android.features.games.gameshub.ui.util.a.a(bVar.d());
        h.z(-1809575146);
        if (dv5Var.a().w()) {
            py1.d(ww8.a, new PlayTabScreenKt$GameContent$2(fVar, dv5Var, jv5Var, d, null), h, 70);
        }
        h.R();
        py1.d(ww8.a, new PlayTabScreenKt$GameContent$3(fe4Var, jv5Var, null), h, 70);
        PlayTabFooter playTabFooter = (PlayTabFooter) i.k0(bVar.d().c().b());
        List list = e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((wt2) obj).g(), obj);
        }
        PlayTabContentKt.a(jv5Var, a, playTabFooter, linkedHashMap, d, bVar.c(), new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(wt2 wt2Var, CardType cardType) {
                zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
                zq3.h(cardType, TransferTable.COLUMN_TYPE);
                PlayTabViewModel.this.u(wt2Var, cardType);
                vy8Var.a(wt2Var.f());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                b((wt2) obj2, (CardType) obj3);
                return ww8.a;
            }
        }, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$6
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m372invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m372invoke() {
                PlayTabViewModel.this.x();
            }
        }, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$7
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m373invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m373invoke() {
                PlayTabViewModel.this.x();
            }
        }, new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$8
            {
                super(2);
            }

            public final void b(wt2 wt2Var, CardType cardType) {
                zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
                zq3.h(cardType, TransferTable.COLUMN_TYPE);
                PlayTabViewModel.this.t(wt2Var, cardType);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                b((wt2) obj2, (CardType) obj3);
                return ww8.a;
            }
        }, !bVar.h(), h, 36864 | ScrollObserver.g | ((i >> 6) & 14) | (d8.a << 15), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k3 = h.k();
        if (k3 != null) {
            k3.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    PlayTabScreenKt.b(dv5.this, bVar, jv5Var, fe4Var, playTabViewModel, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.fe4 r19, boolean r20, com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel r21, com.nytimes.android.features.games.gameshub.playtab.debug.DebugMenuViewModel r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt.c(fe4, boolean, com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel, com.nytimes.android.features.games.gameshub.playtab.debug.DebugMenuViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayTabViewModel.b d(x08 x08Var) {
        return (PlayTabViewModel.b) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final String str, final qs2 qs2Var, final fe4 fe4Var, final boolean z, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1405038339);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(fe4Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1405038339, i2, -1, "com.nytimes.android.features.games.gameshub.ui.Toolbar (PlayTabScreen.kt:135)");
            }
            h.z(-930403024);
            Object A = h.A();
            final int i3 = 64;
            if (A == Composer.a.a()) {
                A = ow7.a(64);
                h.q(A);
            }
            final cy4 cy4Var = (cy4) A;
            h.R();
            MainTopAppBarKt.a(zr0.b(h, -872300465, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$Toolbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(ac0 ac0Var, Composer composer2, int i4) {
                    zq3.h(ac0Var, "$this$MainTopAppBar");
                    if ((i4 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-872300465, i4, -1, "com.nytimes.android.features.games.gameshub.ui.Toolbar.<anonymous> (PlayTabScreen.kt:145)");
                    }
                    Alignment.b g = Alignment.a.g();
                    String str2 = str;
                    final cy4 cy4Var2 = cy4Var;
                    final int i5 = i3;
                    composer2.z(-483455358);
                    Modifier.a aVar = Modifier.a;
                    rg4 a = d.a(Arrangement.a.g(), g, composer2, 48);
                    composer2.z(-1323940314);
                    int a2 = cs0.a(composer2, 0);
                    et0 o = composer2.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a3 = companion.a();
                    it2 c = LayoutKt.c(aVar);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a3);
                    } else {
                        composer2.p();
                    }
                    Composer a4 = Updater.a(composer2);
                    Updater.c(a4, a, companion.e());
                    Updater.c(a4, o, companion.g());
                    gt2 b = companion.b();
                    if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                        a4.q(Integer.valueOf(a2));
                        a4.v(Integer.valueOf(a2), b);
                    }
                    c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                    composer2.z(2058660585);
                    ap0 ap0Var = ap0.a;
                    TextKt.c(k48.b(rk6.games_hub_tab_name, composer2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    composer2.z(-704767251);
                    if (!h.d0(str2)) {
                        Modifier m = PaddingKt.m(aVar, 0.0f, bu1.g(8), 0.0f, bu1.g(4), 5, null);
                        j B = eb5.Companion.c(composer2, 8).B();
                        composer2.z(-783098159);
                        Object A2 = composer2.A();
                        if (A2 == Composer.a.a()) {
                            A2 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$Toolbar$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(aj8 aj8Var) {
                                    zq3.h(aj8Var, "textLayoutResult");
                                    if (aj8Var.i()) {
                                        cy4.this.f(i5 + (((int) aj8Var.h()) / 2));
                                    }
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    b((aj8) obj);
                                    return ww8.a;
                                }
                            };
                            composer2.q(A2);
                        }
                        composer2.R();
                        TextKt.c(str2, m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (ss2) A2, B, composer2, 48, 196608, 32764);
                    }
                    composer2.R();
                    composer2.R();
                    composer2.t();
                    composer2.R();
                    composer2.R();
                    if (b.G()) {
                        b.R();
                    }
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }
            }), SizeKt.i(Modifier.a, bu1.g(cy4Var.d())), fe4Var.e(), null, zr0.b(h, -139613222, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$Toolbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i4) {
                    zq3.h(m37Var, "$this$MainTopAppBar");
                    if ((i4 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-139613222, i4, -1, "com.nytimes.android.features.games.gameshub.ui.Toolbar.<anonymous> (PlayTabScreen.kt:166)");
                    }
                    if (z) {
                        composer2.z(-704766421);
                        boolean S = composer2.S(qs2Var);
                        final qs2 qs2Var2 = qs2Var;
                        Object A2 = composer2.A();
                        if (S || A2 == Composer.a.a()) {
                            A2 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$Toolbar$2$1$1
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m376invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m376invoke() {
                                    qs2.this.mo865invoke();
                                }
                            };
                            composer2.q(A2);
                        }
                        composer2.R();
                        IconButtonKt.a((qs2) A2, ComposablePositionsKt.d(Modifier.a, "settingAccount", null, 2, null), false, null, ComposableSingletons$PlayTabScreenKt.a.a(), composer2, 24576, 12);
                    }
                    if (b.G()) {
                        b.R();
                    }
                }
            }), 0L, 0L, 0.0f, h, (ScrollObserver.g << 6) | 24582, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$Toolbar$3
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
                    PlayTabScreenKt.e(str, qs2Var, fe4Var, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
