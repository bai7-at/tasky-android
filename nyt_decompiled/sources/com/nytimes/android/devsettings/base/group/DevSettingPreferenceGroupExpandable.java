package com.nytimes.android.devsettings.base.group;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ei0;
import defpackage.ep;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.n37;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.sy4;
import defpackage.un1;
import defpackage.vn1;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yn1;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class DevSettingPreferenceGroupExpandable implements vn1 {
    private final String a;
    private final List b;
    private boolean c;
    private yn1 d;
    private final String e;
    private final boolean f;
    private boolean g;
    private final StateFlow h;

    public DevSettingPreferenceGroupExpandable(String str, List list, boolean z, yn1 yn1Var, String str2, boolean z2, boolean z3, StateFlow stateFlow) {
        zq3.h(str, "title");
        zq3.h(list, "items");
        zq3.h(str2, "sortKey");
        zq3.h(stateFlow, "itemChosenTitleFlow");
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = yn1Var;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = stateFlow;
        for (un1 un1Var : a()) {
            if (un1Var.f() == null) {
                un1Var.c(f());
            }
            un1Var.d(getRequestRestart() || un1Var.getRequestRestart());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(x08 x08Var) {
        return (String) x08Var.getValue();
    }

    @Override // defpackage.vn1
    public List a() {
        return this.b;
    }

    @Override // defpackage.wn1
    public String b() {
        return this.e;
    }

    @Override // defpackage.wn1
    public void c(yn1 yn1Var) {
        this.d = yn1Var;
    }

    @Override // defpackage.wn1
    public void d(boolean z) {
        this.g = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(974416883);
        if (b.G()) {
            b.S(974416883, i, -1, "com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable.Draw (DevSettingPreferenceGroupExpandable.kt:52)");
        }
        h.z(709386966);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.valueOf(this.c), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        final x08 b = y.b(this.h, null, h, 8, 1);
        String title = getTitle();
        boolean h2 = h(sy4Var);
        String j = j(b);
        if (j == null) {
            j = "No item selected";
        }
        h.z(709396100);
        boolean S = h.S(sy4Var);
        Object A2 = h.A();
        if (S || A2 == aVar.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable$Draw$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m352invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m352invoke() {
                    boolean h3;
                    sy4 sy4Var2 = sy4.this;
                    h3 = DevSettingPreferenceGroupExpandable.h(sy4Var2);
                    DevSettingPreferenceGroupExpandable.i(sy4Var2, !h3);
                }
            };
            h.q(A2);
        }
        h.R();
        PreferenceItemComposableKt.b(title, h2, null, j, (qs2) A2, null, null, 0L, zr0.b(h, 299283383, true, new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable$Draw$2
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
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(299283383, i2, -1, "com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable.Draw.<anonymous> (DevSettingPreferenceGroupExpandable.kt:63)");
                }
                Modifier j2 = PaddingKt.j(Modifier.a, bu1.g(8), bu1.g(2));
                final DevSettingPreferenceGroupExpandable devSettingPreferenceGroupExpandable = DevSettingPreferenceGroupExpandable.this;
                final x08 x08Var = b;
                ei0.a(j2, null, 0L, 0L, null, 0.0f, zr0.b(composer2, 1264775450, true, new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable$Draw$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        String j3;
                        if ((i3 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1264775450, i3, -1, "com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable.Draw.<anonymous>.<anonymous> (DevSettingPreferenceGroupExpandable.kt:67)");
                        }
                        DevSettingPreferenceGroupExpandable devSettingPreferenceGroupExpandable2 = DevSettingPreferenceGroupExpandable.this;
                        x08 x08Var2 = x08Var;
                        composer3.z(-483455358);
                        Modifier.a aVar2 = Modifier.a;
                        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                        composer3.z(-1323940314);
                        fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                        r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a2 = companion.a();
                        it2 b2 = LayoutKt.b(aVar2);
                        if (composer3.j() == null) {
                            cs0.c();
                        }
                        composer3.G();
                        if (composer3.f()) {
                            composer3.D(a2);
                        } else {
                            composer3.p();
                        }
                        composer3.H();
                        Composer a3 = Updater.a(composer3);
                        Updater.c(a3, a, companion.e());
                        Updater.c(a3, fm1Var, companion.c());
                        Updater.c(a3, layoutDirection, companion.d());
                        Updater.c(a3, r99Var, companion.h());
                        composer3.c();
                        b2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                        composer3.z(2058660585);
                        composer3.z(-1163856341);
                        ap0 ap0Var = ap0.a;
                        composer3.z(1894397485);
                        for (un1 un1Var : devSettingPreferenceGroupExpandable2.a()) {
                            Alignment.c i4 = Alignment.a.i();
                            composer3.z(693286680);
                            Modifier.a aVar3 = Modifier.a;
                            rg4 a4 = m.a(Arrangement.a.f(), i4, composer3, 48);
                            composer3.z(-1323940314);
                            fm1 fm1Var2 = (fm1) composer3.m(CompositionLocalsKt.e());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                            r99 r99Var2 = (r99) composer3.m(CompositionLocalsKt.p());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                            qs2 a5 = companion2.a();
                            it2 b3 = LayoutKt.b(aVar3);
                            if (composer3.j() == null) {
                                cs0.c();
                            }
                            composer3.G();
                            if (composer3.f()) {
                                composer3.D(a5);
                            } else {
                                composer3.p();
                            }
                            composer3.H();
                            Composer a6 = Updater.a(composer3);
                            Updater.c(a6, a4, companion2.e());
                            Updater.c(a6, fm1Var2, companion2.c());
                            Updater.c(a6, layoutDirection2, companion2.d());
                            Updater.c(a6, r99Var2, companion2.h());
                            composer3.c();
                            b3.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                            composer3.z(2058660585);
                            composer3.z(-678309503);
                            n37 n37Var = n37.a;
                            composer3.z(728504079);
                            String title2 = un1Var.getTitle();
                            j3 = DevSettingPreferenceGroupExpandable.j(x08Var2);
                            if (zq3.c(title2, j3)) {
                                IconKt.a(ep.a(oe3.a.a()), "Chosen", null, 0L, composer3, 48, 12);
                            }
                            composer3.R();
                            SpacerKt.a(SizeKt.s(aVar3, bu1.g(16)), composer3, 6);
                            un1Var.e(composer3, 0);
                            composer3.R();
                            composer3.R();
                            composer3.t();
                            composer3.R();
                            composer3.R();
                        }
                        composer3.R();
                        composer3.R();
                        composer3.R();
                        composer3.t();
                        composer3.R();
                        composer3.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 1572870, 62);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 100687872, 228);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable$Draw$3
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
                    DevSettingPreferenceGroupExpandable.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingPreferenceGroupExpandable)) {
            return false;
        }
        DevSettingPreferenceGroupExpandable devSettingPreferenceGroupExpandable = (DevSettingPreferenceGroupExpandable) obj;
        return zq3.c(this.a, devSettingPreferenceGroupExpandable.a) && zq3.c(this.b, devSettingPreferenceGroupExpandable.b) && this.c == devSettingPreferenceGroupExpandable.c && zq3.c(this.d, devSettingPreferenceGroupExpandable.d) && zq3.c(this.e, devSettingPreferenceGroupExpandable.e) && this.f == devSettingPreferenceGroupExpandable.f && this.g == devSettingPreferenceGroupExpandable.g && zq3.c(this.h, devSettingPreferenceGroupExpandable.h);
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.d;
    }

    @Override // defpackage.vn1
    public boolean g() {
        return this.f;
    }

    @Override // defpackage.wn1
    public boolean getRequestRestart() {
        return this.g;
    }

    @Override // defpackage.wn1
    public String getTitle() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31;
        yn1 yn1Var = this.d;
        return ((((((((hashCode + (yn1Var == null ? 0 : yn1Var.hashCode())) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "DevSettingPreferenceGroupExpandable(title=" + this.a + ", items=" + this.b + ", startExpanded=" + this.c + ", section=" + this.d + ", sortKey=" + this.e + ", areItemsSearchable=" + this.f + ", requestRestart=" + this.g + ", itemChosenTitleFlow=" + this.h + ")";
    }

    public /* synthetic */ DevSettingPreferenceGroupExpandable(String str, List list, boolean z, yn1 yn1Var, String str2, boolean z2, boolean z3, StateFlow stateFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : yn1Var, (i & 16) != 0 ? str : str2, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3, stateFlow);
    }
}
