package com.nytimes.android.devsettings.common;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.a;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.un1;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DevSettingLazySummaryItem implements un1 {
    public static final int m = 8;
    private final String a;
    private final ss2 b;
    private final ss2 c;
    private final gt2 d;
    private final DevSettingUI e;
    private final DevSettingUI f;
    private yn1 g;
    private final String h;
    private boolean i;
    private final boolean j;
    private final MutableStateFlow k;
    private final MutableStateFlow l;

    public DevSettingLazySummaryItem(String str, ss2 ss2Var, ss2 ss2Var2, gt2 gt2Var, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, yn1 yn1Var, String str2, boolean z, boolean z2) {
        zq3.h(str, "title");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(devSettingUI2, "iconEnd");
        zq3.h(str2, "sortKey");
        this.a = str;
        this.b = ss2Var;
        this.c = ss2Var2;
        this.d = gt2Var;
        this.e = devSettingUI;
        this.f = devSettingUI2;
        this.g = yn1Var;
        this.h = str2;
        this.i = z;
        this.j = z2;
        this.k = StateFlowKt.MutableStateFlow(null);
        this.l = StateFlowKt.MutableStateFlow(null);
    }

    private static final String h(x08 x08Var) {
        return (String) x08Var.getValue();
    }

    private static final a i(x08 x08Var) {
        return (a) x08Var.getValue();
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
        Composer h = composer.h(1866823522);
        if (b.G()) {
            b.S(1866823522, i, -1, "com.nytimes.android.devsettings.common.DevSettingLazySummaryItem.Draw (DevSettingLazySummaryItem.kt:39)");
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
        a aVar = null;
        x08 b = y.b(this.k, null, h, 8, 1);
        x08 b2 = y.b(this.l, null, h, 8, 1);
        py1.d(Boolean.TRUE, new DevSettingLazySummaryItem$Draw$1(this, null), h, 70);
        a aVar2 = new a(getTitle(), null, null, 6, null);
        a i2 = i(b2);
        if (i2 == null) {
            String h2 = h(b);
            if (h2 != null) {
                aVar = new a(h2, null, null, 6, null);
            }
        } else {
            aVar = i2;
        }
        PreferenceItemComposableKt.c(aVar2, null, aVar, null, new qs2() { // from class: com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$3

            @fc1(c = "com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$3$1", f = "DevSettingLazySummaryItem.kt", l = {58, 59, 63}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                Object L$0;
                int label;
                final /* synthetic */ DevSettingLazySummaryItem this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DevSettingLazySummaryItem devSettingLazySummaryItem, Context context, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = devSettingLazySummaryItem;
                    this.$context = context;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, this.$context, by0Var);
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x009d  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                        int r1 = r6.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L33
                        if (r1 == r5) goto L2b
                        if (r1 == r4) goto L23
                        if (r1 != r3) goto L1b
                        java.lang.Object r6 = r6.L$0
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r6 = (com.nytimes.android.devsettings.common.DevSettingLazySummaryItem) r6
                        kotlin.f.b(r7)
                        goto L95
                    L1b:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L23:
                        java.lang.Object r1 = r6.L$0
                        kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
                        kotlin.f.b(r7)
                        goto L77
                    L2b:
                        java.lang.Object r1 = r6.L$0
                        kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
                        kotlin.f.b(r7)
                        goto L57
                    L33:
                        kotlin.f.b(r7)
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
                        boolean r7 = r7.m()
                        if (r7 == 0) goto L7d
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
                        kotlinx.coroutines.flow.MutableStateFlow r1 = r7.o()
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
                        ss2 r7 = r7.k()
                        if (r7 == 0) goto L5a
                        r6.L$0 = r1
                        r6.label = r5
                        java.lang.Object r7 = r7.invoke(r6)
                        if (r7 != r0) goto L57
                        return r0
                    L57:
                        java.lang.String r7 = (java.lang.String) r7
                        goto L5b
                    L5a:
                        r7 = r2
                    L5b:
                        r1.setValue(r7)
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
                        kotlinx.coroutines.flow.MutableStateFlow r1 = r7.n()
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
                        ss2 r7 = r7.j()
                        if (r7 == 0) goto L7a
                        r6.L$0 = r1
                        r6.label = r4
                        java.lang.Object r7 = r7.invoke(r6)
                        if (r7 != r0) goto L77
                        return r0
                    L77:
                        r2 = r7
                        androidx.compose.ui.text.a r2 = (androidx.compose.ui.text.a) r2
                    L7a:
                        r1.setValue(r2)
                    L7d:
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r7 = r6.this$0
                        gt2 r7 = r7.l()
                        if (r7 == 0) goto La2
                        android.content.Context r1 = r6.$context
                        com.nytimes.android.devsettings.common.DevSettingLazySummaryItem r2 = r6.this$0
                        r6.L$0 = r2
                        r6.label = r3
                        java.lang.Object r6 = r7.invoke(r1, r6)
                        if (r6 != r0) goto L94
                        return r0
                    L94:
                        r6 = r2
                    L95:
                        ww8 r7 = defpackage.ww8.a
                        boolean r6 = r6.getRequestRestart()
                        if (r6 == 0) goto La2
                        sn1 r6 = defpackage.sn1.a
                        r6.b()
                    La2:
                        ww8 r6 = defpackage.ww8.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
                m354invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m354invoke() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(this, context, null), 3, null);
            }
        }, this.e.a(), this.f.a(), h, 0, 10);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.common.DevSettingLazySummaryItem$Draw$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DevSettingLazySummaryItem.this.e(composer2, i | 1);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevSettingLazySummaryItem)) {
            return false;
        }
        DevSettingLazySummaryItem devSettingLazySummaryItem = (DevSettingLazySummaryItem) obj;
        return zq3.c(this.a, devSettingLazySummaryItem.a) && zq3.c(this.b, devSettingLazySummaryItem.b) && zq3.c(this.c, devSettingLazySummaryItem.c) && zq3.c(this.d, devSettingLazySummaryItem.d) && zq3.c(this.e, devSettingLazySummaryItem.e) && zq3.c(this.f, devSettingLazySummaryItem.f) && zq3.c(this.g, devSettingLazySummaryItem.g) && zq3.c(this.h, devSettingLazySummaryItem.h) && this.i == devSettingLazySummaryItem.i && this.j == devSettingLazySummaryItem.j;
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
        int hashCode = this.a.hashCode() * 31;
        ss2 ss2Var = this.b;
        int hashCode2 = (hashCode + (ss2Var == null ? 0 : ss2Var.hashCode())) * 31;
        ss2 ss2Var2 = this.c;
        int hashCode3 = (hashCode2 + (ss2Var2 == null ? 0 : ss2Var2.hashCode())) * 31;
        gt2 gt2Var = this.d;
        int hashCode4 = (((((hashCode3 + (gt2Var == null ? 0 : gt2Var.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        yn1 yn1Var = this.g;
        return ((((((hashCode4 + (yn1Var != null ? yn1Var.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.j);
    }

    public final ss2 j() {
        return this.c;
    }

    public final ss2 k() {
        return this.b;
    }

    public final gt2 l() {
        return this.d;
    }

    public final boolean m() {
        return this.j;
    }

    public final MutableStateFlow n() {
        return this.l;
    }

    public final MutableStateFlow o() {
        return this.k;
    }

    public String toString() {
        return "DevSettingLazySummaryItem(title=" + this.a + ", lazySummary=" + this.b + ", lazyAnnotatedSummary=" + this.c + ", onClick=" + this.d + ", iconStart=" + this.e + ", iconEnd=" + this.f + ", section=" + this.g + ", sortKey=" + this.h + ", requestRestart=" + this.i + ", refreshSummaryOnClick=" + this.j + ")";
    }

    public /* synthetic */ DevSettingLazySummaryItem(String str, ss2 ss2Var, ss2 ss2Var2, gt2 gt2Var, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, yn1 yn1Var, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : ss2Var, (i & 4) != 0 ? null : ss2Var2, (i & 8) != 0 ? null : gt2Var, (i & 16) != 0 ? DevSettingUI.c.a : devSettingUI, (i & 32) != 0 ? DevSettingUI.c.a : devSettingUI2, (i & 64) == 0 ? yn1Var : null, (i & 128) != 0 ? str : str2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z, (i & 512) == 0 ? z2 : false);
    }
}
