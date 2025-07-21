package com.nytimes.android.growthui.regibundle.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.R;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.ek8;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class RegibundleToolbarKt {
    public static final void a(final String str, final boolean z, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        c74 c74Var;
        Composer composer2;
        Modifier.a aVar;
        BoxScopeInstance boxScopeInstance;
        Composer composer3;
        zq3.h(str, "loginText");
        zq3.h(qs2Var, "onLoginClick");
        zq3.h(qs2Var2, "onCloseClick");
        Composer h = composer.h(-481280568);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(qs2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
            composer3 = h;
        } else {
            if (b.G()) {
                b.S(-481280568, i3, -1, "com.nytimes.android.growthui.regibundle.components.RegibundleToolbar (RegibundleToolbar.kt:27)");
            }
            Modifier.a aVar2 = Modifier.a;
            Modifier h2 = SizeKt.h(aVar2, 0.0f, 1, null);
            c74 c74Var2 = c74.a;
            float f = 20;
            Modifier l = PaddingKt.l(BackgroundKt.d(h2, c74Var2.a(h, 6).a(), null, 2, null), bu1.g(f), bu1.g(f), bu1.g(f), bu1.g(16));
            h.z(733328855);
            Alignment.a aVar3 = Alignment.a;
            rg4 g = BoxKt.g(aVar3.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a = companion.a();
            it2 b = LayoutKt.b(l);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a);
            } else {
                h.p();
            }
            h.H();
            Composer a2 = Updater.a(h);
            Updater.c(a2, g, companion.e());
            Updater.c(a2, fm1Var, companion.c());
            Updater.c(a2, layoutDirection, companion.d());
            Updater.c(a2, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-2137368960);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
            h.z(1929333661);
            if (z) {
                c74Var = c74Var2;
                composer2 = h;
                aVar = aVar2;
                boxScopeInstance = boxScopeInstance2;
            } else {
                Modifier c = boxScopeInstance2.c(aVar2, aVar3.h());
                h.z(1929339360);
                boolean S = h.S(qs2Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.growthui.regibundle.components.RegibundleToolbarKt$RegibundleToolbar$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m568invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m568invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    h.q(A);
                }
                h.R();
                boxScopeInstance = boxScopeInstance2;
                c74Var = c74Var2;
                composer2 = h;
                aVar = aVar2;
                TextKt.e(str, ClickableKt.e(c, false, null, null, (qs2) A, 7, null), c74Var2.a(h, 6).b(), ek8.g(18), null, null, null, 0L, ph8.b.d(), null, 0L, 0, false, 0, null, c74Var2.b(h, 6).i(), composer2, (i3 & 14) | 100666368, 0, 32496);
            }
            composer2.R();
            Modifier c2 = boxScopeInstance.c(aVar, aVar3.f());
            composer3 = composer2;
            composer3.z(1929351808);
            boolean S2 = composer3.S(qs2Var2);
            Object A2 = composer3.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.growthui.regibundle.components.RegibundleToolbarKt$RegibundleToolbar$1$2$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m569invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m569invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                composer3.q(A2);
            }
            composer3.R();
            IconKt.b(do5.d(R.drawable.ic_close, composer3, 0), k48.b(R.string.growthui_close, composer3, 0), ClickableKt.e(c2, false, null, null, (qs2) A2, 7, null), c74Var.a(composer3, 6).c(), composer3, 8, 0);
            composer3.R();
            composer3.R();
            composer3.t();
            composer3.R();
            composer3.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer3.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.regibundle.components.RegibundleToolbarKt$RegibundleToolbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer4, int i4) {
                    RegibundleToolbarKt.a(str, z, qs2Var, qs2Var2, composer4, i | 1);
                }
            });
        }
    }
}
