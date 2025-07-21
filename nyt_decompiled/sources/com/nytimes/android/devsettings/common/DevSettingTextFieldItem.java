package com.nytimes.android.devsettings.common;

import android.content.Context;
import androidx.compose.foundation.text.c;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.sn1;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.un1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class DevSettingTextFieldItem implements un1 {
    public static final int k = 8;
    private final String a;
    private final ss2 b;
    private final it2 c;
    private final ss2 d;
    private final DevSettingUI e;
    private final DevSettingUI f;
    private final c g;
    private yn1 h;
    private final String i;
    private boolean j;

    public DevSettingTextFieldItem(String str, ss2 ss2Var, it2 it2Var, ss2 ss2Var2, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, c cVar, yn1 yn1Var, String str2, boolean z) {
        zq3.h(str, "title");
        zq3.h(ss2Var, "lazyText");
        zq3.h(it2Var, "onTextChange");
        zq3.h(ss2Var2, "lazySummary");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(devSettingUI2, "iconEnd");
        zq3.h(cVar, "keyboardOptions");
        zq3.h(str2, "sortKey");
        this.a = str;
        this.b = ss2Var;
        this.c = it2Var;
        this.d = ss2Var2;
        this.e = devSettingUI;
        this.f = devSettingUI2;
        this.g = cVar;
        this.h = yn1Var;
        this.i = str2;
        this.j = z;
    }

    private static final String h(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sy4 sy4Var, String str) {
        sy4Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.wn1
    public String b() {
        return this.i;
    }

    @Override // defpackage.wn1
    public void c(yn1 yn1Var) {
        this.h = yn1Var;
    }

    @Override // defpackage.wn1
    public void d(boolean z) {
        this.j = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(-1406688468);
        if (b.G()) {
            b.S(-1406688468, i, -1, "com.nytimes.android.devsettings.common.DevSettingTextFieldItem.Draw (DevSettingTextFieldItem.kt:121)");
        }
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        h.z(2062902185);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(this.b.invoke(context), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        h.z(2062904445);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A2);
        }
        final sy4 sy4Var2 = (sy4) A2;
        h.R();
        h.z(773894976);
        h.z(-492369756);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A3 = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A3).a();
        h.R();
        String title = getTitle();
        String h2 = h(sy4Var);
        ss2 ss2Var = new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItem$Draw$1

            @fc1(c = "com.nytimes.android.devsettings.common.DevSettingTextFieldItem$Draw$1$1", f = "DevSettingTextFieldItem.kt", l = {133}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.devsettings.common.DevSettingTextFieldItem$Draw$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ String $it;
                final /* synthetic */ sy4 $text$delegate;
                Object L$0;
                int label;
                final /* synthetic */ DevSettingTextFieldItem this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DevSettingTextFieldItem devSettingTextFieldItem, Context context, String str, sy4 sy4Var, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = devSettingTextFieldItem;
                    this.$context = context;
                    this.$it = str;
                    this.$text$delegate = sy4Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, this.$context, this.$it, this.$text$delegate, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    sy4 sy4Var;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        sy4 sy4Var2 = this.$text$delegate;
                        it2 o = this.this$0.o();
                        Context context = this.$context;
                        String str = this.$it;
                        this.L$0 = sy4Var2;
                        this.label = 1;
                        Object invoke = o.invoke(context, str, this);
                        if (invoke == h) {
                            return h;
                        }
                        sy4Var = sy4Var2;
                        obj = invoke;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy4Var = (sy4) this.L$0;
                        f.b(obj);
                    }
                    DevSettingTextFieldItem.i(sy4Var, (String) obj);
                    if (this.this$0.getRequestRestart()) {
                        sn1.a.b();
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(this, context, str, sy4Var, null), 3, null);
            }
        };
        boolean j = j(sy4Var2);
        h.z(2062918963);
        boolean S = h.S(sy4Var2);
        Object A4 = h.A();
        if (S || A4 == aVar.a()) {
            A4 = new qs2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItem$Draw$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m359invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m359invoke() {
                    boolean j2;
                    sy4 sy4Var3 = sy4.this;
                    j2 = DevSettingTextFieldItem.j(sy4Var3);
                    DevSettingTextFieldItem.k(sy4Var3, !j2);
                }
            };
            h.q(A4);
        }
        h.R();
        PreferenceItemComposableKt.f(title, h2, ss2Var, j, null, (qs2) A4, null, (String) this.d.invoke(h(sy4Var)), null, this.e.a(), this.f.a(), this.g, h, 196608, 0, 336);
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItem$Draw$3
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
                    DevSettingTextFieldItem.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingTextFieldItem)) {
            return false;
        }
        DevSettingTextFieldItem devSettingTextFieldItem = (DevSettingTextFieldItem) obj;
        return zq3.c(this.a, devSettingTextFieldItem.a) && zq3.c(this.b, devSettingTextFieldItem.b) && zq3.c(this.c, devSettingTextFieldItem.c) && zq3.c(this.d, devSettingTextFieldItem.d) && zq3.c(this.e, devSettingTextFieldItem.e) && zq3.c(this.f, devSettingTextFieldItem.f) && zq3.c(this.g, devSettingTextFieldItem.g) && zq3.c(this.h, devSettingTextFieldItem.h) && zq3.c(this.i, devSettingTextFieldItem.i) && this.j == devSettingTextFieldItem.j;
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.h;
    }

    @Override // defpackage.wn1
    public boolean getRequestRestart() {
        return this.j;
    }

    @Override // defpackage.wn1
    public String getTitle() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        yn1 yn1Var = this.h;
        return ((((hashCode + (yn1Var == null ? 0 : yn1Var.hashCode())) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.j);
    }

    public final it2 o() {
        return this.c;
    }

    public String toString() {
        return "DevSettingTextFieldItem(title=" + this.a + ", lazyText=" + this.b + ", onTextChange=" + this.c + ", lazySummary=" + this.d + ", iconStart=" + this.e + ", iconEnd=" + this.f + ", keyboardOptions=" + this.g + ", section=" + this.h + ", sortKey=" + this.i + ", requestRestart=" + this.j + ")";
    }

    public /* synthetic */ DevSettingTextFieldItem(String str, ss2 ss2Var, it2 it2Var, ss2 ss2Var2, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, c cVar, yn1 yn1Var, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ss2Var, it2Var, (i & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItem.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str3) {
                zq3.h(str3, "it");
                if (h.d0(str3)) {
                    return null;
                }
                return str3;
            }
        } : ss2Var2, (i & 16) != 0 ? DevSettingUI.c.a : devSettingUI, (i & 32) != 0 ? DevSettingUI.Companion.c() : devSettingUI2, (i & 64) != 0 ? c.e.a() : cVar, (i & 128) != 0 ? null : yn1Var, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? str : str2, (i & 512) != 0 ? false : z);
    }
}
