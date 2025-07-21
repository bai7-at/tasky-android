package com.nytimes.android.devsettings.base.group;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
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
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.un1;
import defpackage.vn1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DevSettingGroupExpandable implements vn1 {
    private final String a;
    private final List b;
    private final String c;
    private boolean d;
    private yn1 e;
    private final String f;
    private final boolean g;
    private boolean h;

    public DevSettingGroupExpandable(String str, List list, String str2, boolean z, yn1 yn1Var, String str3, boolean z2, boolean z3) {
        zq3.h(str, "title");
        zq3.h(list, "items");
        zq3.h(str3, "sortKey");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = yn1Var;
        this.f = str3;
        this.g = z2;
        this.h = z3;
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

    @Override // defpackage.vn1
    public List a() {
        return this.b;
    }

    @Override // defpackage.wn1
    public String b() {
        return this.f;
    }

    @Override // defpackage.wn1
    public void c(yn1 yn1Var) {
        this.e = yn1Var;
    }

    @Override // defpackage.wn1
    public void d(boolean z) {
        this.h = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(776397245);
        if (b.G()) {
            b.S(776397245, i, -1, "com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable.Draw (DevSettingGroupExpandable.kt:42)");
        }
        h.z(1651880827);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.valueOf(this.d), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        String title = getTitle();
        boolean h2 = h(sy4Var);
        String str = this.c;
        h.z(1651886793);
        boolean S = h.S(sy4Var);
        Object A2 = h.A();
        if (S || A2 == aVar.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable$Draw$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m351invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m351invoke() {
                    boolean h3;
                    sy4 sy4Var2 = sy4.this;
                    h3 = DevSettingGroupExpandable.h(sy4Var2);
                    DevSettingGroupExpandable.i(sy4Var2, !h3);
                }
            };
            h.q(A2);
        }
        h.R();
        PreferenceItemComposableKt.b(title, h2, null, str, (qs2) A2, null, null, 0L, zr0.b(h, -864046207, true, new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable$Draw$2
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
                    b.S(-864046207, i2, -1, "com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable.Draw.<anonymous> (DevSettingGroupExpandable.kt:51)");
                }
                Modifier j = PaddingKt.j(Modifier.a, bu1.g(8), bu1.g(2));
                final DevSettingGroupExpandable devSettingGroupExpandable = DevSettingGroupExpandable.this;
                ei0.a(j, null, 0L, 0L, null, 0.0f, zr0.b(composer2, -1742192540, true, new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable$Draw$2.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1742192540, i3, -1, "com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable.Draw.<anonymous>.<anonymous> (DevSettingGroupExpandable.kt:55)");
                        }
                        DevSettingGroupExpandable devSettingGroupExpandable2 = DevSettingGroupExpandable.this;
                        composer3.z(-483455358);
                        Modifier.a aVar2 = Modifier.a;
                        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                        composer3.z(-1323940314);
                        fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                        r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a2 = companion.a();
                        it2 b = LayoutKt.b(aVar2);
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
                        b.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                        composer3.z(2058660585);
                        composer3.z(-1163856341);
                        ap0 ap0Var = ap0.a;
                        composer3.z(378780279);
                        Iterator it2 = devSettingGroupExpandable2.a().iterator();
                        while (it2.hasNext()) {
                            ((un1) it2.next()).e(composer3, 0);
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
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable$Draw$3
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
                    DevSettingGroupExpandable.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingGroupExpandable)) {
            return false;
        }
        DevSettingGroupExpandable devSettingGroupExpandable = (DevSettingGroupExpandable) obj;
        return zq3.c(this.a, devSettingGroupExpandable.a) && zq3.c(this.b, devSettingGroupExpandable.b) && zq3.c(this.c, devSettingGroupExpandable.c) && this.d == devSettingGroupExpandable.d && zq3.c(this.e, devSettingGroupExpandable.e) && zq3.c(this.f, devSettingGroupExpandable.f) && this.g == devSettingGroupExpandable.g && this.h == devSettingGroupExpandable.h;
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.e;
    }

    @Override // defpackage.vn1
    public boolean g() {
        return this.g;
    }

    @Override // defpackage.wn1
    public boolean getRequestRestart() {
        return this.h;
    }

    @Override // defpackage.wn1
    public String getTitle() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.d)) * 31;
        yn1 yn1Var = this.e;
        return ((((((hashCode2 + (yn1Var != null ? yn1Var.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.h);
    }

    public final void l(boolean z) {
        this.d = z;
    }

    public String toString() {
        return "DevSettingGroupExpandable(title=" + this.a + ", items=" + this.b + ", summary=" + this.c + ", startExpanded=" + this.d + ", section=" + this.e + ", sortKey=" + this.f + ", areItemsSearchable=" + this.g + ", requestRestart=" + this.h + ")";
    }

    public /* synthetic */ DevSettingGroupExpandable(String str, List list, String str2, boolean z, yn1 yn1Var, String str3, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? i.u0(list, null, null, null, 0, null, new ss2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(un1 un1Var) {
                zq3.h(un1Var, "it");
                return un1Var.getTitle();
            }
        }, 31, null) : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : yn1Var, (i & 32) != 0 ? str : str3, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3);
    }
}
