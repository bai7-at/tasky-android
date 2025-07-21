package com.nytimes.android.devsettings.common;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.c;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.input.a;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.composables.PreferenceItemComposableKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.it2;
import defpackage.m37;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.un1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class DevSettingTextFieldConfirmationButtonItem implements un1 {
    public static final int n = 8;
    private final String a;
    private final ss2 b;
    private final it2 c;
    private final String d;
    private final String e;
    private final DevSettingUI f;
    private final DevSettingUI g;
    private final c h;
    private final boolean i;
    private final boolean j;
    private yn1 k;
    private final String l;
    private boolean m;

    public DevSettingTextFieldConfirmationButtonItem(String str, ss2 ss2Var, it2 it2Var, String str2, String str3, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, c cVar, boolean z, boolean z2, yn1 yn1Var, String str4, boolean z3) {
        zq3.h(str, "title");
        zq3.h(ss2Var, "lazyText");
        zq3.h(it2Var, "onClickConfirm");
        zq3.h(str3, "buttonText");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(devSettingUI2, "iconEnd");
        zq3.h(cVar, "keyboardOptions");
        zq3.h(str4, "sortKey");
        this.a = str;
        this.b = ss2Var;
        this.c = it2Var;
        this.d = str2;
        this.e = str3;
        this.f = devSettingUI;
        this.g = devSettingUI2;
        this.h = cVar;
        this.i = z;
        this.j = z2;
        this.k = yn1Var;
        this.l = str4;
        this.m = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(sy4 sy4Var) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(CoroutineScope coroutineScope, Context context, String str, ss2 ss2Var) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DevSettingTextFieldConfirmationButtonItem$onSubmit$1(this, context, str, ss2Var, null), 3, null);
    }

    @Override // defpackage.wn1
    public String b() {
        return this.l;
    }

    @Override // defpackage.wn1
    public void c(yn1 yn1Var) {
        this.k = yn1Var;
    }

    @Override // defpackage.wn1
    public void d(boolean z) {
        this.m = z;
    }

    @Override // defpackage.un1
    public void e(Composer composer, final int i) {
        Composer h = composer.h(1996822437);
        if (b.G()) {
            b.S(1996822437, i, -1, "com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem.Draw (DevSettingTextFieldItem.kt:50)");
        }
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        h.z(1848292610);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(this.b.invoke(context), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        h.z(1848294870);
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
        String str = this.d;
        String h2 = h(sy4Var);
        boolean j = j(sy4Var2);
        gt2 a2 = this.f.a();
        gt2 a3 = this.g.a();
        c cVar = this.i ? new c(0, false, 0, a.b.b(), 7, (DefaultConstructorMarker) null) : this.h;
        h.z(1848301825);
        boolean S = h.S(sy4Var);
        Object A4 = h.A();
        if (S || A4 == aVar.a()) {
            A4 = new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }

                public final void invoke(String str2) {
                    zq3.h(str2, "it");
                    DevSettingTextFieldConfirmationButtonItem.i(sy4.this, str2);
                }
            };
            h.q(A4);
        }
        ss2 ss2Var = (ss2) A4;
        h.R();
        h.z(1848304076);
        boolean S2 = h.S(sy4Var2);
        Object A5 = h.A();
        if (S2 || A5 == aVar.a()) {
            A5 = new qs2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m356invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m356invoke() {
                    boolean j2;
                    sy4 sy4Var3 = sy4.this;
                    j2 = DevSettingTextFieldConfirmationButtonItem.j(sy4Var3);
                    DevSettingTextFieldConfirmationButtonItem.k(sy4Var3, !j2);
                }
            };
            h.q(A5);
        }
        h.R();
        PreferenceItemComposableKt.f(title, h2, ss2Var, j, null, (qs2) A5, new qs2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m357invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m357invoke() {
                String h3;
                DevSettingTextFieldConfirmationButtonItem devSettingTextFieldConfirmationButtonItem = DevSettingTextFieldConfirmationButtonItem.this;
                CoroutineScope coroutineScope = a;
                Context context2 = context;
                h3 = DevSettingTextFieldConfirmationButtonItem.h(sy4Var);
                final sy4 sy4Var3 = sy4Var;
                devSettingTextFieldConfirmationButtonItem.t(coroutineScope, context2, h3, new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$3.1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }

                    public final void invoke(String str2) {
                        zq3.h(str2, "it");
                        DevSettingTextFieldConfirmationButtonItem.i(sy4.this, str2);
                    }
                });
            }
        }, str, zr0.b(h, -926534572, true, new it2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$PreferenceTextField");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-926534572, i2, -1, "com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem.Draw.<anonymous> (DevSettingTextFieldItem.kt:67)");
                }
                final DevSettingTextFieldConfirmationButtonItem devSettingTextFieldConfirmationButtonItem = DevSettingTextFieldConfirmationButtonItem.this;
                final CoroutineScope coroutineScope = a;
                final Context context2 = context;
                final sy4 sy4Var3 = sy4Var;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m358invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m358invoke() {
                        String h3;
                        DevSettingTextFieldConfirmationButtonItem devSettingTextFieldConfirmationButtonItem2 = DevSettingTextFieldConfirmationButtonItem.this;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        Context context3 = context2;
                        h3 = DevSettingTextFieldConfirmationButtonItem.h(sy4Var3);
                        final sy4 sy4Var4 = sy4Var3;
                        devSettingTextFieldConfirmationButtonItem2.t(coroutineScope2, context3, h3, new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem.Draw.4.1.1
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return ww8.a;
                            }

                            public final void invoke(String str2) {
                                zq3.h(str2, "it");
                                DevSettingTextFieldConfirmationButtonItem.i(sy4.this, str2);
                            }
                        });
                    }
                };
                float f = 16;
                Modifier m = PaddingKt.m(Modifier.a, bu1.g(f), bu1.g(8), bu1.g(f), 0.0f, 8, null);
                final DevSettingTextFieldConfirmationButtonItem devSettingTextFieldConfirmationButtonItem2 = DevSettingTextFieldConfirmationButtonItem.this;
                ButtonKt.a(qs2Var, m, false, null, null, null, null, null, null, zr0.b(composer2, -1360541084, true, new it2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$4.2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(m37 m37Var, Composer composer3, int i3) {
                        zq3.h(m37Var, "$this$Button");
                        if ((i3 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1360541084, i3, -1, "com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem.Draw.<anonymous>.<anonymous> (DevSettingTextFieldItem.kt:73)");
                        }
                        TextKt.e(DevSettingTextFieldConfirmationButtonItem.this.q(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 0, 65534);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 805306368, 508);
                if (b.G()) {
                    b.R();
                }
            }
        }), a2, a3, cVar, h, 100860288, 0, 16);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$Draw$5
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
                    DevSettingTextFieldConfirmationButtonItem.this.e(composer2, i | 1);
                }
            });
        }
    }

    @Override // defpackage.wn1
    public yn1 f() {
        return this.k;
    }

    @Override // defpackage.wn1
    public boolean getRequestRestart() {
        return this.m;
    }

    @Override // defpackage.wn1
    public String getTitle() {
        return this.a;
    }

    public final String q() {
        return this.e;
    }

    public final boolean r() {
        return this.j;
    }

    public final it2 s() {
        return this.c;
    }

    public /* synthetic */ DevSettingTextFieldConfirmationButtonItem(String str, ss2 ss2Var, it2 it2Var, String str2, String str3, DevSettingUI devSettingUI, DevSettingUI devSettingUI2, c cVar, boolean z, boolean z2, yn1 yn1Var, String str4, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(Context context) {
                zq3.h(context, "it");
                return "";
            }
        } : ss2Var, it2Var, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? "Ok" : str3, (i & 32) != 0 ? DevSettingUI.c.a : devSettingUI, (i & 64) != 0 ? DevSettingUI.Companion.c() : devSettingUI2, (i & 128) != 0 ? c.e.a() : cVar, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : yn1Var, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? str : str4, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z3);
    }
}
