package com.nytimes.android.devsettings.common;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.py1;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class DevSettingSwitchItem implements un1 {
    public static final int j = 8;
    private final String a;
    private final ss2 b;
    private final it2 c;
    private final String d;
    private final String e;
    private final DevSettingUI f;
    private yn1 g;
    private final String h;
    private boolean i;

    public DevSettingSwitchItem(String str, ss2 ss2Var, it2 it2Var, String str2, String str3, DevSettingUI devSettingUI, yn1 yn1Var, String str4, boolean z) {
        zq3.h(str, "title");
        zq3.h(ss2Var, "lazyChecked");
        zq3.h(it2Var, "onCheckedChange");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(str4, "sortKey");
        this.a = str;
        this.b = ss2Var;
        this.c = it2Var;
        this.d = str2;
        this.e = str3;
        this.f = devSettingUI;
        this.g = yn1Var;
        this.h = str4;
        this.i = z;
    }

    private static final boolean h(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.wn1
    public String b() {
        return this.h;
    }

    @Override // defpackage.wn1
    public void c(yn1 yn1Var) {
        this.g = yn1Var;
    }

    @Override // defpackage.wn1
    public void d(boolean z) {
        this.i = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(-1794276334);
        if (b.G()) {
            b.S(-1794276334, i, -1, "com.nytimes.android.devsettings.common.DevSettingSwitchItem.Draw (DevSettingSwitchItem.kt:39)");
        }
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        h.z(-2143692013);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(this.b.invoke(context), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        h.z(773894976);
        h.z(-492369756);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(A2);
        }
        h.R();
        final CoroutineScope a = ((e) A2).a();
        h.R();
        PreferenceItemComposableKt.e(getTitle(), h(sy4Var), new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingSwitchItem$Draw$1

            @fc1(c = "com.nytimes.android.devsettings.common.DevSettingSwitchItem$Draw$1$1", f = "DevSettingSwitchItem.kt", l = {51}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.devsettings.common.DevSettingSwitchItem$Draw$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ sy4 $isChecked$delegate;
                final /* synthetic */ boolean $it;
                Object L$0;
                int label;
                final /* synthetic */ DevSettingSwitchItem this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DevSettingSwitchItem devSettingSwitchItem, Context context, boolean z, sy4 sy4Var, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = devSettingSwitchItem;
                    this.$context = context;
                    this.$it = z;
                    this.$isChecked$delegate = sy4Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, this.$context, this.$it, this.$isChecked$delegate, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    sy4 sy4Var;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        sy4 sy4Var2 = this.$isChecked$delegate;
                        it2 k = this.this$0.k();
                        Context context = this.$context;
                        Boolean a = cc0.a(this.$it);
                        this.L$0 = sy4Var2;
                        this.label = 1;
                        Object invoke = k.invoke(context, a, this);
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
                    DevSettingSwitchItem devSettingSwitchItem = this.this$0;
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    if (devSettingSwitchItem.getRequestRestart()) {
                        sn1.a.b();
                    }
                    DevSettingSwitchItem.i(sy4Var, bool.booleanValue());
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
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(this, context, z, sy4Var, null), 3, null);
            }
        }, null, h(sy4Var) ? this.d : this.e, this.f.a(), h, 0, 8);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.common.DevSettingSwitchItem$Draw$2
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
                    DevSettingSwitchItem.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingSwitchItem)) {
            return false;
        }
        DevSettingSwitchItem devSettingSwitchItem = (DevSettingSwitchItem) obj;
        return zq3.c(this.a, devSettingSwitchItem.a) && zq3.c(this.b, devSettingSwitchItem.b) && zq3.c(this.c, devSettingSwitchItem.c) && zq3.c(this.d, devSettingSwitchItem.d) && zq3.c(this.e, devSettingSwitchItem.e) && zq3.c(this.f, devSettingSwitchItem.f) && zq3.c(this.g, devSettingSwitchItem.g) && zq3.c(this.h, devSettingSwitchItem.h) && this.i == devSettingSwitchItem.i;
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.g;
    }

    @Override // defpackage.wn1
    public boolean getRequestRestart() {
        return this.i;
    }

    @Override // defpackage.wn1
    public String getTitle() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f.hashCode()) * 31;
        yn1 yn1Var = this.g;
        return ((((hashCode3 + (yn1Var != null ? yn1Var.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.i);
    }

    public final it2 k() {
        return this.c;
    }

    public String toString() {
        return "DevSettingSwitchItem(title=" + this.a + ", lazyChecked=" + this.b + ", onCheckedChange=" + this.c + ", summaryOn=" + this.d + ", summaryOff=" + this.e + ", iconStart=" + this.f + ", section=" + this.g + ", sortKey=" + this.h + ", requestRestart=" + this.i + ")";
    }

    public /* synthetic */ DevSettingSwitchItem(String str, ss2 ss2Var, it2 it2Var, String str2, String str3, DevSettingUI devSettingUI, yn1 yn1Var, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ss2Var, it2Var, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? DevSettingUI.c.a : devSettingUI, (i & 64) != 0 ? null : yn1Var, (i & 128) != 0 ? str : str4, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z);
    }
}
