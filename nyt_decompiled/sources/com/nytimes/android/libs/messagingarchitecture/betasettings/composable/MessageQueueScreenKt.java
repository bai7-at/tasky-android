package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.material.ExposedDropdownMenuDefaults;
import androidx.compose.material.ExposedDropdownMenu_androidKt;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.i83;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.pa9;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t21;
import defpackage.u14;
import defpackage.ww8;
import defpackage.yc8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class MessageQueueScreenKt {
    public static final void a(Modifier modifier, DebugViewModel debugViewModel, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final DebugViewModel debugViewModel2;
        int i4;
        final Modifier modifier3;
        final DebugViewModel debugViewModel3;
        Composer h = composer.h(1514342538);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        int i7 = i3;
        if (i6 == 2 && (i7 & 91) == 18 && h.i()) {
            h.K();
            debugViewModel3 = debugViewModel;
            modifier3 = modifier2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                Modifier modifier4 = i5 != 0 ? Modifier.a : modifier2;
                if (i6 != 0) {
                    h.z(1890788296);
                    sa9 a = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
                    if (a == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    t.b a2 = i83.a(a, h, 0);
                    h.z(1729797275);
                    q c = pa9.c(DebugViewModel.class, a, null, a2, a instanceof d ? ((d) a).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
                    h.R();
                    h.R();
                    i7 &= -113;
                    debugViewModel2 = (DebugViewModel) c;
                } else {
                    debugViewModel2 = debugViewModel;
                }
                i4 = i7;
                modifier3 = modifier4;
            } else {
                h.K();
                if (i6 != 0) {
                    i7 &= -113;
                }
                debugViewModel2 = debugViewModel;
                i4 = i7;
                modifier3 = modifier2;
            }
            h.u();
            if (b.G()) {
                b.S(1514342538, i4, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreen (MessageQueueScreen.kt:37)");
            }
            SnackbarUtil snackbarUtil = (SnackbarUtil) h.m(LocalSnackbarKt.a());
            final yc8 t = debugViewModel2.t();
            h.z(1992112454);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var = (sy4) A;
            h.R();
            h.z(1992112513);
            Object A2 = h.A();
            if (A2 == aVar.a()) {
                A2 = b0.e(i.j0(t.a()), null, 2, null);
                h.q(A2);
            }
            final sy4 sy4Var2 = (sy4) A2;
            h.R();
            py1.d(ww8.a, new MessageQueueScreenKt$MessageQueueScreen$1(snackbarUtil, null), h, 70);
            Modifier i8 = PaddingKt.i(modifier3, bu1.g(8));
            h.z(-483455358);
            rg4 a3 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a4 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a5 = companion.a();
            it2 c2 = LayoutKt.c(i8);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a5);
            } else {
                h.p();
            }
            Composer a6 = Updater.a(h);
            Updater.c(a6, a3, companion.e());
            Updater.c(a6, o, companion.g());
            gt2 b = companion.b();
            if (a6.f() || !zq3.c(a6.A(), Integer.valueOf(a4))) {
                a6.q(Integer.valueOf(a4));
                a6.v(Integer.valueOf(a4), b);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            boolean b2 = b(sy4Var);
            h.z(-1046639942);
            Object A3 = h.A();
            if (A3 == aVar.a()) {
                A3 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        boolean b3;
                        sy4 sy4Var3 = sy4.this;
                        b3 = MessageQueueScreenKt.b(sy4Var3);
                        MessageQueueScreenKt.c(sy4Var3, !b3);
                    }
                };
                h.q(A3);
            }
            h.R();
            ExposedDropdownMenu_androidKt.a(b2, (ss2) A3, null, zr0.b(h, -571619818, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer2, int i9) {
                    String d;
                    boolean b3;
                    zq3.h(exposedDropdownMenuBoxScope, "$this$ExposedDropdownMenuBox");
                    if (b.G()) {
                        b.S(-571619818, i9, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreen.<anonymous>.<anonymous> (MessageQueueScreen.kt:51)");
                    }
                    d = MessageQueueScreenKt.d(sy4.this);
                    composer2.z(1835643385);
                    final sy4 sy4Var3 = sy4.this;
                    Object A4 = composer2.A();
                    Composer.a aVar2 = Composer.a;
                    if (A4 == aVar2.a()) {
                        A4 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2$1$1
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return ww8.a;
                            }

                            public final void invoke(String str) {
                                zq3.h(str, "it");
                                MessageQueueScreenKt.e(sy4.this, str);
                            }
                        };
                        composer2.q(A4);
                    }
                    composer2.R();
                    final sy4 sy4Var4 = sy4Var;
                    TextFieldKt.a(d, (ss2) A4, null, false, true, null, null, null, null, zr0.b(composer2, 1272440911, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2.2
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            boolean b4;
                            if ((i10 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1272440911, i10, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreen.<anonymous>.<anonymous>.<anonymous> (MessageQueueScreen.kt:57)");
                            }
                            ExposedDropdownMenuDefaults exposedDropdownMenuDefaults = ExposedDropdownMenuDefaults.a;
                            b4 = MessageQueueScreenKt.b(sy4.this);
                            exposedDropdownMenuDefaults.a(b4, null, composer3, ExposedDropdownMenuDefaults.b << 6, 2);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), false, null, null, null, false, 0, 0, null, null, null, composer2, 805330992, 0, 1048044);
                    b3 = MessageQueueScreenKt.b(sy4Var);
                    composer2.z(1835643660);
                    final sy4 sy4Var5 = sy4Var;
                    Object A5 = composer2.A();
                    if (A5 == aVar2.a()) {
                        A5 = new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2$3$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m577invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m577invoke() {
                                MessageQueueScreenKt.c(sy4.this, false);
                            }
                        };
                        composer2.q(A5);
                    }
                    composer2.R();
                    final yc8 yc8Var = t;
                    final DebugViewModel debugViewModel4 = debugViewModel2;
                    final sy4 sy4Var6 = sy4.this;
                    final sy4 sy4Var7 = sy4Var;
                    exposedDropdownMenuBoxScope.c(b3, (qs2) A5, null, null, zr0.b(composer2, 1160084967, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(zo0 zo0Var, Composer composer3, int i10) {
                            zq3.h(zo0Var, "$this$ExposedDropdownMenu");
                            if ((i10 & 81) == 16 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1160084967, i10, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreen.<anonymous>.<anonymous>.<anonymous> (MessageQueueScreen.kt:60)");
                            }
                            Set<String> a7 = yc8.this.a();
                            final DebugViewModel debugViewModel5 = debugViewModel4;
                            final sy4 sy4Var8 = sy4Var6;
                            final sy4 sy4Var9 = sy4Var7;
                            for (final String str : a7) {
                                AndroidMenu_androidKt.b(new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2$4$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m578invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m578invoke() {
                                        DebugViewModel.this.u(str);
                                        MessageQueueScreenKt.e(sy4Var8, str);
                                        MessageQueueScreenKt.c(sy4Var9, false);
                                    }
                                }, null, false, null, null, zr0.b(composer3, -128957932, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$2$2$4$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // defpackage.it2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(m37 m37Var, Composer composer4, int i11) {
                                        zq3.h(m37Var, "$this$DropdownMenuItem");
                                        if ((i11 & 81) == 16 && composer4.i()) {
                                            composer4.K();
                                            return;
                                        }
                                        if (b.G()) {
                                            b.S(-128957932, i11, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageQueueScreen.kt:68)");
                                        }
                                        TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
                                        if (b.G()) {
                                            b.R();
                                        }
                                    }
                                }), composer3, 196608, 30);
                            }
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer2, 286768, 12);
                    if (b.G()) {
                        b.R();
                    }
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }
            }), h, 3120, 4);
            debugViewModel3 = debugViewModel2;
            ItemLayoutsKt.c("messageId", "weight", null, null, null, h, 54, 28);
            ScreenContentKt.a((u14) y.b(debugViewModel3.r(), null, h, 8, 1).getValue(), null, null, null, ComposableSingletons$MessageQueueScreenKt.a.a(), h, 24584, 14);
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt$MessageQueueScreen$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i9) {
                    MessageQueueScreenKt.a(Modifier.this, debugViewModel3, composer2, gt6.a(i | 1), i2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(sy4 sy4Var, String str) {
        sy4Var.setValue(str);
    }
}
