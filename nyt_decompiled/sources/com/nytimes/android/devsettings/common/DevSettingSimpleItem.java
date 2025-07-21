package com.nytimes.android.devsettings.common;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.sn1;
import defpackage.un1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class DevSettingSimpleItem implements un1 {
    private final String a;
    private final String b;
    private final gt2 c;
    private final DevSettingUI d;
    private final DevSettingUI e;
    private yn1 f;
    private final String g;
    private boolean h;

    public DevSettingSimpleItem(String str, String str2, gt2 gt2Var, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, yn1 yn1Var, String str3, boolean z) {
        zq3.h(str, "title");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(devSettingUI2, "iconEnd");
        zq3.h(str3, "sortKey");
        this.a = str;
        this.b = str2;
        this.c = gt2Var;
        this.d = devSettingUI;
        this.e = devSettingUI2;
        this.f = yn1Var;
        this.g = str3;
        this.h = z;
    }

    @Override // defpackage.wn1
    public String b() {
        return this.g;
    }

    @Override // defpackage.wn1
    public void c(yn1 yn1Var) {
        this.f = yn1Var;
    }

    @Override // defpackage.wn1
    public void d(boolean z) {
        this.h = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(-1649435310);
        if (b.G()) {
            b.S(-1649435310, i, -1, "com.nytimes.android.devsettings.common.DevSettingSimpleItem.Draw (DevSettingSimpleItem.kt:29)");
        }
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A).a();
        h.R();
        String title = getTitle();
        String str = this.b;
        final gt2 gt2Var = this.c;
        PreferenceItemComposableKt.d(title, null, str, gt2Var != null ? new qs2() { // from class: com.nytimes.android.devsettings.common.DevSettingSimpleItem$Draw$1$1

            @fc1(c = "com.nytimes.android.devsettings.common.DevSettingSimpleItem$Draw$1$1$1", f = "DevSettingSimpleItem.kt", l = {40}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.devsettings.common.DevSettingSimpleItem$Draw$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ gt2 $onClick;
                int label;
                final /* synthetic */ DevSettingSimpleItem this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(gt2 gt2Var, Context context, DevSettingSimpleItem devSettingSimpleItem, by0 by0Var) {
                    super(2, by0Var);
                    this.$onClick = gt2Var;
                    this.$context = context;
                    this.this$0 = devSettingSimpleItem;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$onClick, this.$context, this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        gt2 gt2Var = this.$onClick;
                        Context context = this.$context;
                        this.label = 1;
                        if (gt2Var.invoke(context, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    ww8 ww8Var = ww8.a;
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
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m355invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m355invoke() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(gt2Var, context, this, null), 3, null);
            }
        } : null, this.d.a(), this.e.a(), h, 0, 2);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.common.DevSettingSimpleItem$Draw$2
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
                    DevSettingSimpleItem.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingSimpleItem)) {
            return false;
        }
        DevSettingSimpleItem devSettingSimpleItem = (DevSettingSimpleItem) obj;
        return zq3.c(this.a, devSettingSimpleItem.a) && zq3.c(this.b, devSettingSimpleItem.b) && zq3.c(this.c, devSettingSimpleItem.c) && zq3.c(this.d, devSettingSimpleItem.d) && zq3.c(this.e, devSettingSimpleItem.e) && zq3.c(this.f, devSettingSimpleItem.f) && zq3.c(this.g, devSettingSimpleItem.g) && this.h == devSettingSimpleItem.h;
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.f;
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
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        gt2 gt2Var = this.c;
        int hashCode3 = (((((hashCode2 + (gt2Var == null ? 0 : gt2Var.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        yn1 yn1Var = this.f;
        return ((((hashCode3 + (yn1Var != null ? yn1Var.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h);
    }

    public String toString() {
        return "DevSettingSimpleItem(title=" + this.a + ", summary=" + this.b + ", onClick=" + this.c + ", iconStart=" + this.d + ", iconEnd=" + this.e + ", section=" + this.f + ", sortKey=" + this.g + ", requestRestart=" + this.h + ")";
    }

    public /* synthetic */ DevSettingSimpleItem(String str, String str2, gt2 gt2Var, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, yn1 yn1Var, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : gt2Var, (i & 8) != 0 ? DevSettingUI.c.a : devSettingUI, (i & 16) != 0 ? DevSettingUI.c.a : devSettingUI2, (i & 32) == 0 ? yn1Var : null, (i & 64) != 0 ? str : str3, (i & 128) != 0 ? false : z);
    }
}
