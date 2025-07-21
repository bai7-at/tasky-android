package com.nytimes.subauth.ui.ui.screens;

import android.content.Context;
import android.webkit.WebView;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.fragment.app.f;
import com.nytimes.android.composeui.webview.WebviewScreenKt;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import com.nytimes.subauth.ui.login.helpers.ErrorDisplayType;
import com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt;
import com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreenKt;
import com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt;
import com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt;
import com.nytimes.subauth.ui.ui.widgets.LogoAppBarKt;
import defpackage.cc7;
import defpackage.f68;
import defpackage.gt2;
import defpackage.ka7;
import defpackage.na4;
import defpackage.py1;
import defpackage.qs2;
import defpackage.r54;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public abstract class LireContainerScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final na4.b bVar, final ka7 ka7Var, final SubauthLoginViewModel subauthLoginViewModel, Composer composer, final int i) {
        Composer h = composer.h(-2002694465);
        if (b.G()) {
            b.S(-2002694465, i, -1, "com.nytimes.subauth.ui.ui.screens.ContainerErrorHandler (LireContainerScreen.kt:267)");
        }
        if (bVar != null) {
            h.z(460696647);
            if (bVar.c() == ErrorDisplayType.Snackbar) {
                py1.d(ka7Var.b(), new LireContainerScreenKt$ContainerErrorHandler$1$1(ka7Var, bVar, subauthLoginViewModel, null), h, 64);
            }
            h.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$ContainerErrorHandler$2
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
                    LireContainerScreenKt.a(na4.b.this, ka7Var, subauthLoginViewModel, composer2, i | 1);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r26, final boolean r27, final boolean r28, defpackage.ka7 r29, defpackage.f68 r30, boolean r31, final defpackage.gt2 r32, final defpackage.gt2 r33, final defpackage.gt2 r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt.b(boolean, boolean, boolean, ka7, f68, boolean, gt2, gt2, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final SubauthLoginViewModel subauthLoginViewModel, final f fVar, final f68 f68Var, Composer composer, final int i) {
        zq3.h(subauthLoginViewModel, "viewModel");
        zq3.h(fVar, "activity");
        zq3.h(f68Var, "subauthConfig");
        Composer h = composer.h(-341824069);
        if (b.G()) {
            b.S(-341824069, i, -1, "com.nytimes.subauth.ui.ui.screens.LireContainerScreen (LireContainerScreen.kt:146)");
        }
        final x08 b = y.b(subauthLoginViewModel.Y(), null, h, 8, 1);
        final x08 b2 = y.b(subauthLoginViewModel.l0(), null, h, 8, 1);
        x08 a = y.a(subauthLoginViewModel.V(), null, null, h, 56, 2);
        na4 e = e(a);
        na4.b bVar = e instanceof na4.b ? (na4.b) e : null;
        na4 e2 = e(a);
        na4.c cVar = e2 instanceof na4.c ? (na4.c) e2 : null;
        na4 e3 = e(a);
        na4.d dVar = e3 instanceof na4.d ? (na4.d) e3 : null;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ka7 l = ScaffoldKt.l(null, null, h, 0, 3);
        final String o = o(d(b), f68Var);
        final boolean m = m(subauthLoginViewModel);
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$onBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m841invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m841invoke() {
                r54 d;
                d = LireContainerScreenKt.d(b);
                LireContainerScreenKt.k(d, Ref$ObjectRef.this.element, subauthLoginViewModel, true);
            }
        };
        a(bVar, l, subauthLoginViewModel, h, 520);
        BackHandlerKt.a(false, new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m836invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m836invoke() {
                r54 d;
                d = LireContainerScreenKt.d(b);
                LireContainerScreenKt.l(d, Ref$ObjectRef.this.element, subauthLoginViewModel, false, 8, null);
            }
        }, h, 0, 1);
        final na4.b bVar2 = bVar;
        final na4.c cVar2 = cVar;
        final na4.d dVar2 = dVar;
        b(((Boolean) b2.getValue()).booleanValue(), subauthLoginViewModel.Z().h(), d(b).b(), l, f68Var, d(b) instanceof r54.h, new LireContainerScreenKt$LireContainerScreen$2(subauthLoginViewModel), zr0.b(h, 891228314, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$3
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
                r54 d;
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(891228314, i2, -1, "com.nytimes.subauth.ui.ui.screens.LireContainerScreen.<anonymous> (LireContainerScreen.kt:176)");
                }
                d = LireContainerScreenKt.d(b);
                if (d instanceof r54.e) {
                    composer2.z(1645855943);
                    LogoAppBarKt.a(f68.this.A(), m, qs2Var, composer2, 0, 0);
                    composer2.R();
                } else {
                    composer2.z(1645988282);
                    SubauthComposeUIKt.c(o, m, qs2Var, composer2, 0);
                    composer2.R();
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), zr0.b(h, 546312569, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4

            /* renamed from: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4$5, reason: invalid class name */
            /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements gt2 {
                AnonymousClass5(Object obj) {
                    super(2, obj, SubauthLoginViewModel.class, "onWebItem", "onWebItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
                }

                public final void g(String str, String str2) {
                    zq3.h(str, "p0");
                    zq3.h(str2, "p1");
                    ((SubauthLoginViewModel) this.receiver).I0(str, str2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    g((String) obj, (String) obj2);
                    return ww8.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            /* JADX WARN: Type inference failed for: r4v6, types: [T, android.webkit.WebView] */
            public final void invoke(Composer composer2, int i2) {
                r54 d;
                r54 d2;
                r54 d3;
                WebView webView;
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(546312569, i2, -1, "com.nytimes.subauth.ui.ui.screens.LireContainerScreen.<anonymous> (LireContainerScreen.kt:187)");
                }
                d = LireContainerScreenKt.d(b);
                if (d instanceof r54.e) {
                    composer2.z(-85445228);
                    EmailFirstScreenKt.b(SubauthLoginViewModel.this, fVar, composer2, 72);
                    composer2.R();
                } else if (d instanceof r54.d) {
                    composer2.z(-85443057);
                    LoginScreenKt.b(fVar, SubauthLoginViewModel.this, composer2, 72);
                    composer2.R();
                } else if (d instanceof r54.b) {
                    composer2.z(-85440778);
                    RegistrationScreenKt.d(fVar, SubauthLoginViewModel.this, composer2, 72);
                    composer2.R();
                } else if (d instanceof r54.h) {
                    composer2.z(-85438270);
                    d3 = LireContainerScreenKt.d(b);
                    zq3.f(d3, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.WebScreen");
                    String d4 = ((r54.h) d3).d();
                    final SubauthLoginViewModel subauthLoginViewModel2 = SubauthLoginViewModel.this;
                    qs2 qs2Var2 = new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4.1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final Boolean mo865invoke() {
                            return Boolean.valueOf(SubauthLoginViewModel.this.j0());
                        }
                    };
                    WebView webView2 = ref$ObjectRef.element;
                    composer2.z(-85433074);
                    if (webView2 == null) {
                        composer2.z(-85432755);
                        f fVar2 = fVar;
                        Object A = composer2.A();
                        if (A == Composer.a.a()) {
                            A = new WebView(fVar2);
                            composer2.q(A);
                        }
                        ?? r4 = (WebView) A;
                        composer2.R();
                        ref$ObjectRef.element = r4;
                        ww8 ww8Var = ww8.a;
                        webView = r4;
                    } else {
                        webView = webView2;
                    }
                    composer2.R();
                    final SubauthLoginViewModel subauthLoginViewModel3 = SubauthLoginViewModel.this;
                    WebviewScreenKt.a(d4, qs2Var2, null, null, false, webView, null, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4.4
                        {
                            super(2);
                        }

                        public final void b(WebView webView3, String str) {
                            SubauthLoginViewModel.this.J0();
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            b((WebView) obj, (String) obj2);
                            return ww8.a;
                        }
                    }, null, composer2, 262144, 348);
                    composer2.R();
                } else if (d instanceof r54.g) {
                    composer2.z(-85425513);
                    VerifyEmailScreenKt.c(null, SubauthLoginViewModel.this, composer2, 64, 1);
                    composer2.R();
                } else if (d instanceof r54.c) {
                    composer2.z(1646874510);
                    boolean h2 = SubauthLoginViewModel.this.Z().h();
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(SubauthLoginViewModel.this);
                    boolean z = !((Boolean) b2.getValue()).booleanValue();
                    d2 = LireContainerScreenKt.d(b);
                    zq3.f(d2, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.CreateNewPasswordScreen");
                    String e4 = ((r54.c) d2).e();
                    final SubauthLoginViewModel subauthLoginViewModel4 = SubauthLoginViewModel.this;
                    CreateNewPasswordScreenKt.a(null, subauthLoginViewModel4, h2, z, anonymousClass5, e4, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4.6
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return ww8.a;
                        }

                        public final void invoke(String str) {
                            zq3.h(str, "newPassword");
                            SubauthLoginViewModel.this.F0(str);
                            SubauthLoginViewModel.this.O();
                        }
                    }, composer2, 64, 1);
                    composer2.R();
                } else if (d instanceof r54.f) {
                    composer2.z(-85403854);
                    SuccessScreenKt.g(null, SubauthLoginViewModel.this, composer2, 64, 1);
                    composer2.R();
                } else if (d instanceof r54.a) {
                    composer2.z(1647543118);
                    composer2.R();
                    ul8.a.z("SUBAUTH").a("Exiting Unified LIRE. LireScreenState = Client", new Object[0]);
                    fVar.finish();
                } else {
                    composer2.z(1647680851);
                    composer2.R();
                }
                na4.b bVar3 = bVar2;
                composer2.z(-85394738);
                if (bVar3 != null) {
                    final SubauthLoginViewModel subauthLoginViewModel5 = SubauthLoginViewModel.this;
                    composer2.z(-85393911);
                    if (bVar3.c() == ErrorDisplayType.Dialog) {
                        if (bVar3.f()) {
                            composer2.z(156827147);
                            SubauthComposeUIKt.b(bVar3.a(), new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4$7$1
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m837invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m837invoke() {
                                    SubauthLoginViewModel.this.O();
                                }
                            }, null, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4$7$2
                                {
                                    super(1);
                                }

                                public final void b(Context context) {
                                    zq3.h(context, "context");
                                    SubauthLoginViewModel.this.O0(context);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    b((Context) obj);
                                    return ww8.a;
                                }
                            }, 0L, 0L, null, bVar3.b(), null, composer2, 0, 372);
                            composer2.R();
                        } else {
                            composer2.z(157190560);
                            SubauthComposeUIKt.e(bVar3.a(), bVar3.b(), new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4$7$3
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m838invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m838invoke() {
                                    SubauthLoginViewModel.this.O();
                                }
                            }, subauthLoginViewModel5.P(), composer2, 0, 0);
                            composer2.R();
                        }
                    }
                    composer2.R();
                    ww8 ww8Var2 = ww8.a;
                }
                composer2.R();
                na4.c cVar3 = cVar2;
                composer2.z(-85366659);
                if (cVar3 != null) {
                    final SubauthLoginViewModel subauthLoginViewModel6 = SubauthLoginViewModel.this;
                    SubauthComposeUIKt.e(cVar3.a(), cVar3.b(), new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4$8$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m839invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m839invoke() {
                            SubauthLoginViewModel.this.R();
                        }
                    }, null, composer2, 0, 8);
                    ww8 ww8Var3 = ww8.a;
                }
                composer2.R();
                na4.d dVar3 = dVar2;
                if (dVar3 != null) {
                    final SubauthLoginViewModel subauthLoginViewModel7 = SubauthLoginViewModel.this;
                    SubauthComposeUIKt.e(dVar3.a(), dVar3.b(), new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$4$9$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m840invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m840invoke() {
                            SubauthLoginViewModel.this.O();
                        }
                    }, null, composer2, 0, 8);
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 113278976, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt$LireContainerScreen$5
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
                    LireContainerScreenKt.c(SubauthLoginViewModel.this, fVar, f68Var, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r54 d(x08 x08Var) {
        return (r54) x08Var.getValue();
    }

    private static final na4 e(x08 x08Var) {
        return (na4) x08Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final boolean r25, final boolean r26, final boolean r27, boolean r28, final defpackage.gt2 r29, final defpackage.gt2 r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt.f(boolean, boolean, boolean, boolean, gt2, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final boolean r25, final boolean r26, final boolean r27, boolean r28, final defpackage.gt2 r29, final defpackage.gt2 r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt.g(boolean, boolean, boolean, boolean, gt2, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r54 r54Var, WebView webView, SubauthLoginViewModel subauthLoginViewModel, boolean z) {
        if (z || n(r54Var, webView)) {
            subauthLoginViewModel.q0();
        } else if (webView != null) {
            webView.goBack();
        }
    }

    static /* synthetic */ void l(r54 r54Var, WebView webView, SubauthLoginViewModel subauthLoginViewModel, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        k(r54Var, webView, subauthLoginViewModel, z);
    }

    public static final boolean m(SubauthLoginViewModel subauthLoginViewModel) {
        zq3.h(subauthLoginViewModel, "viewModel");
        return ((subauthLoginViewModel.Z().l() && (subauthLoginViewModel.Y().getValue() instanceof r54.e)) || (subauthLoginViewModel.Y().getValue() instanceof r54.f)) ? false : true;
    }

    private static final boolean n(r54 r54Var, WebView webView) {
        return ((r54Var instanceof r54.h) && webView != null && webView.canGoBack()) ? false : true;
    }

    public static final String o(r54 r54Var, f68 f68Var) {
        zq3.h(r54Var, "<this>");
        zq3.h(f68Var, "subauthConfig");
        if (r54Var instanceof r54.e) {
            return f68Var.f();
        }
        if (r54Var instanceof r54.b) {
            return f68Var.u();
        }
        if (r54Var instanceof r54.d) {
            return f68Var.i();
        }
        if (r54Var instanceof r54.g) {
            return f68Var.s();
        }
        if (r54Var instanceof r54.c) {
            return f68Var.n();
        }
        if (!(r54Var instanceof r54.f)) {
            return r54Var instanceof r54.h ? ((r54.h) r54Var).c() : "";
        }
        r54.f fVar = (r54.f) r54Var;
        return fVar.f() ? fVar.e() ? f68Var.p() : f68Var.o() : f68Var.r();
    }
}
