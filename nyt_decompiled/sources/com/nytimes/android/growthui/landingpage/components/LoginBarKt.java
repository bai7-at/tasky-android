package com.nytimes.android.growthui.landingpage.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.j;
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
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class LoginBarKt {
    public static final void a(Modifier modifier, final boolean z, final qs2 qs2Var, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        BoxScopeInstance boxScopeInstance;
        zq3.h(qs2Var, "loginHandler");
        zq3.h(ss2Var, "closeHandler");
        Composer h = composer.h(37893816);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.a(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(ss2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(37893816, i3, -1, "com.nytimes.android.growthui.landingpage.components.LoginBar (LoginBar.kt:30)");
            }
            Modifier h2 = SizeKt.h(modifier4, 0.0f, 1, null);
            c74 c74Var = c74.a;
            Modifier d = BackgroundKt.d(h2, c74Var.a(h, 6).a(), null, 2, null);
            h.z(733328855);
            Alignment.a aVar = Alignment.a;
            rg4 g = BoxKt.g(aVar.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a = companion.a();
            it2 b = LayoutKt.b(d);
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
            h.z(1026816466);
            if (z) {
                String b2 = k48.b(R.string.growthui_login, h, 0);
                Modifier j = PaddingKt.j(boxScopeInstance2.c(Modifier.a, aVar.f()), bu1.g(32), bu1.g(18));
                h.z(1026824983);
                boolean S = h.S(qs2Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.growthui.landingpage.components.LoginBarKt$LoginBar$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m553invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m553invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    h.q(A);
                }
                h.R();
                Modifier e = ClickableKt.e(j, false, null, null, (qs2) A, 7, null);
                long b3 = c74Var.a(h, 6).b();
                j f = c74Var.b(h, 6).f();
                boxScopeInstance = boxScopeInstance2;
                modifier3 = modifier4;
                TextKt.e(b2, e, b3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, f, h, 0, 0, 32760);
            } else {
                modifier3 = modifier4;
                boxScopeInstance = boxScopeInstance2;
            }
            h.R();
            Modifier j2 = PaddingKt.j(boxScopeInstance.c(Modifier.a, aVar.h()), bu1.g(32), bu1.g(18));
            h.z(1026836668);
            boolean S2 = h.S(ss2Var);
            Object A2 = h.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.growthui.landingpage.components.LoginBarKt$LoginBar$1$2$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m554invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m554invoke() {
                        ss2.this.invoke(Boolean.FALSE);
                    }
                };
                h.q(A2);
            }
            h.R();
            ImageKt.b(do5.d(R.drawable.ic_close, h, 0), k48.b(R.string.growthui_close, h, 0), ClickableKt.e(j2, false, null, null, (qs2) A2, 7, null), null, null, 0.0f, null, h, 8, 120);
            h.R();
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
            final Modifier modifier5 = modifier3;
            k.a(new gt2() { // from class: com.nytimes.android.growthui.landingpage.components.LoginBarKt$LoginBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    LoginBarKt.a(Modifier.this, z, qs2Var, ss2Var, composer2, i | 1, i2);
                }
            });
        }
    }
}
