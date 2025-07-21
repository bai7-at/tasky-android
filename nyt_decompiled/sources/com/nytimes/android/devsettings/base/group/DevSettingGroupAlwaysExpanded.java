package com.nytimes.android.devsettings.base.group;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.comscore.streaming.ContentType;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.ap0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.un1;
import defpackage.vn1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DevSettingGroupAlwaysExpanded implements vn1 {
    private final String a;
    private final List b;
    private final String c;
    private yn1 d;
    private final String e;
    private final boolean f;
    private boolean g;

    public DevSettingGroupAlwaysExpanded(String str, List list, String str2, yn1 yn1Var, String str3, boolean z, boolean z2) {
        zq3.h(str, "title");
        zq3.h(list, "items");
        zq3.h(str3, "sortKey");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = yn1Var;
        this.e = str3;
        this.f = z;
        this.g = z2;
        for (un1 un1Var : a()) {
            if (un1Var.f() == null) {
                un1Var.c(f());
            }
            un1Var.d(getRequestRestart() || un1Var.getRequestRestart());
        }
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
        Composer h = composer.h(285170261);
        if (b.G()) {
            b.S(285170261, i, -1, "com.nytimes.android.devsettings.base.group.DevSettingGroupAlwaysExpanded.Draw (DevSettingGroupAlwaysExpanded.kt:34)");
        }
        PreferenceItemComposableKt.a(getTitle(), null, this.c, null, null, null, 0L, zr0.b(h, -1561374132, true, new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupAlwaysExpanded$Draw$1
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
                    b.S(-1561374132, i2, -1, "com.nytimes.android.devsettings.base.group.DevSettingGroupAlwaysExpanded.Draw.<anonymous> (DevSettingGroupAlwaysExpanded.kt:39)");
                }
                DevSettingGroupAlwaysExpanded devSettingGroupAlwaysExpanded = DevSettingGroupAlwaysExpanded.this;
                composer2.z(-483455358);
                Modifier.a aVar = Modifier.a;
                rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                composer2.z(-1323940314);
                fm1 fm1Var = (fm1) composer2.m(CompositionLocalsKt.e());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.m(CompositionLocalsKt.j());
                r99 r99Var = (r99) composer2.m(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a2 = companion.a();
                it2 b = LayoutKt.b(aVar);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a2);
                } else {
                    composer2.p();
                }
                composer2.H();
                Composer a3 = Updater.a(composer2);
                Updater.c(a3, a, companion.e());
                Updater.c(a3, fm1Var, companion.c());
                Updater.c(a3, layoutDirection, companion.d());
                Updater.c(a3, r99Var, companion.h());
                composer2.c();
                b.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                composer2.z(-1163856341);
                ap0 ap0Var = ap0.a;
                composer2.z(-1442232996);
                Iterator it2 = devSettingGroupAlwaysExpanded.a().iterator();
                while (it2.hasNext()) {
                    ((un1) it2.next()).e(composer2, 0);
                }
                composer2.R();
                composer2.R();
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 12582912, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.group.DevSettingGroupAlwaysExpanded$Draw$2
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
                    DevSettingGroupAlwaysExpanded.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingGroupAlwaysExpanded)) {
            return false;
        }
        DevSettingGroupAlwaysExpanded devSettingGroupAlwaysExpanded = (DevSettingGroupAlwaysExpanded) obj;
        return zq3.c(this.a, devSettingGroupAlwaysExpanded.a) && zq3.c(this.b, devSettingGroupAlwaysExpanded.b) && zq3.c(this.c, devSettingGroupAlwaysExpanded.c) && zq3.c(this.d, devSettingGroupAlwaysExpanded.d) && zq3.c(this.e, devSettingGroupAlwaysExpanded.e) && this.f == devSettingGroupAlwaysExpanded.f && this.g == devSettingGroupAlwaysExpanded.g;
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
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        yn1 yn1Var = this.d;
        return ((((((hashCode2 + (yn1Var != null ? yn1Var.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        return "DevSettingGroupAlwaysExpanded(title=" + this.a + ", items=" + this.b + ", summary=" + this.c + ", section=" + this.d + ", sortKey=" + this.e + ", areItemsSearchable=" + this.f + ", requestRestart=" + this.g + ")";
    }

    public /* synthetic */ DevSettingGroupAlwaysExpanded(String str, List list, String str2, yn1 yn1Var, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : yn1Var, (i & 16) != 0 ? str : str3, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2);
    }
}
