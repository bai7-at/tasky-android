package com.nytimes.android.devsettings.base.item;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t5;
import defpackage.un1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DevSettingXmlItem implements un1 {
    private final String a;
    private final String b;
    private final int c;
    private yn1 d;
    private final String e;
    private boolean f;

    public DevSettingXmlItem(String str, String str2, int i, yn1 yn1Var, String str3, boolean z) {
        zq3.h(str, "title");
        zq3.h(str3, "sortKey");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = yn1Var;
        this.e = str3;
        this.f = z;
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
        this.f = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(1430745559);
        if (b.G()) {
            b.S(1430745559, i, -1, "com.nytimes.android.devsettings.base.item.DevSettingXmlItem.Draw (DevSettingXmlItem.kt:19)");
        }
        final ss2 n = DevSettingsScreenKt.n(t5.d(h, 0), h, 8);
        PreferenceItemComposableKt.d(getTitle(), null, this.b, new qs2() { // from class: com.nytimes.android.devsettings.base.item.DevSettingXmlItem$Draw$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m353invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m353invoke() {
                ss2 ss2Var = ss2.this;
                if (ss2Var != null) {
                    ss2Var.invoke(this);
                }
            }
        }, null, null, h, 0, 50);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.item.DevSettingXmlItem$Draw$2
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
                    DevSettingXmlItem.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingXmlItem)) {
            return false;
        }
        DevSettingXmlItem devSettingXmlItem = (DevSettingXmlItem) obj;
        return zq3.c(this.a, devSettingXmlItem.a) && zq3.c(this.b, devSettingXmlItem.b) && this.c == devSettingXmlItem.c && zq3.c(this.d, devSettingXmlItem.d) && zq3.c(this.e, devSettingXmlItem.e) && this.f == devSettingXmlItem.f;
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.d;
    }

    @Override // defpackage.wn1
    public boolean getRequestRestart() {
        return this.f;
    }

    @Override // defpackage.wn1
    public String getTitle() {
        return this.a;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.c)) * 31;
        yn1 yn1Var = this.d;
        return ((((hashCode2 + (yn1Var != null ? yn1Var.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f);
    }

    public String toString() {
        return "DevSettingXmlItem(title=" + this.a + ", summary=" + this.b + ", preferenceResId=" + this.c + ", section=" + this.d + ", sortKey=" + this.e + ", requestRestart=" + this.f + ")";
    }

    public /* synthetic */ DevSettingXmlItem(String str, String str2, int i, yn1 yn1Var, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, i, (i2 & 8) != 0 ? null : yn1Var, (i2 & 16) != 0 ? str : str3, (i2 & 32) != 0 ? false : z);
    }
}
