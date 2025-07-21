package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.comscore.streaming.ContentType;
import defpackage.aj8;
import defpackage.bd8;
import defpackage.bj8;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.cz3;
import defpackage.dj7;
import defpackage.et0;
import defpackage.ex7;
import defpackage.fi8;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.id5;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt6;
import defpackage.lj7;
import defpackage.ng9;
import defpackage.qc0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rh8;
import defpackage.ri8;
import defpackage.ss2;
import defpackage.sv3;
import defpackage.uv3;
import defpackage.vi7;
import defpackage.vi8;
import defpackage.wi7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xh8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class CoreTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x067a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ff  */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r48, final defpackage.ss2 r49, androidx.compose.ui.Modifier r50, androidx.compose.ui.text.j r51, defpackage.kc9 r52, defpackage.ss2 r53, defpackage.dy4 r54, defpackage.yc0 r55, boolean r56, int r57, int r58, androidx.compose.ui.text.input.b r59, androidx.compose.foundation.text.b r60, boolean r61, boolean r62, defpackage.it2 r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, ss2, androidx.compose.ui.Modifier, androidx.compose.ui.text.j, kc9, ss2, dy4, yc0, boolean, int, int, androidx.compose.ui.text.input.b, androidx.compose.foundation.text.b, boolean, boolean, it2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(-20551815);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        h.z(733328855);
        rg4 g = BoxKt.g(Alignment.a.o(), true, h, 48);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(modifier);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        Composer a3 = Updater.a(h);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        int i2 = ((i >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 8;
        h.z(-1985516685);
        gt2Var.invoke(h, Integer.valueOf((i2 >> 3) & 14));
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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
                    CoreTextFieldKt.c(Modifier.this, textFieldSelectionManager, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        bj8 h;
        aj8 f;
        Composer h2 = composer.h(626339208);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)");
        }
        if (z) {
            TextFieldState I = textFieldSelectionManager.I();
            aj8 aj8Var = null;
            if (I != null && (h = I.h()) != null && (f = h.f()) != null) {
                TextFieldState I2 = textFieldSelectionManager.I();
                if (!(I2 != null ? I2.v() : true)) {
                    aj8Var = f;
                }
            }
            if (aj8Var != null) {
                if (!i.h(textFieldSelectionManager.L().g())) {
                    int b = textFieldSelectionManager.G().b(i.n(textFieldSelectionManager.L().g()));
                    int b2 = textFieldSelectionManager.G().b(i.i(textFieldSelectionManager.L().g()));
                    ResolvedTextDirection c = aj8Var.c(b);
                    ResolvedTextDirection c2 = aj8Var.c(Math.max(b2 - 1, 0));
                    h2.z(-498386751);
                    TextFieldState I3 = textFieldSelectionManager.I();
                    if (I3 != null && I3.r()) {
                        TextFieldSelectionManagerKt.a(true, c, textFieldSelectionManager, h2, 518);
                    }
                    h2.R();
                    TextFieldState I4 = textFieldSelectionManager.I();
                    if (I4 != null && I4.q()) {
                        TextFieldSelectionManagerKt.a(false, c2, textFieldSelectionManager, h2, 518);
                    }
                }
                TextFieldState I5 = textFieldSelectionManager.I();
                if (I5 != null) {
                    if (textFieldSelectionManager.O()) {
                        I5.E(false);
                    }
                    if (I5.d()) {
                        if (I5.p()) {
                            textFieldSelectionManager.e0();
                        } else {
                            textFieldSelectionManager.N();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.N();
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
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
                    CoreTextFieldKt.d(TextFieldSelectionManager.this, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        androidx.compose.ui.text.a K;
        Composer h = composer.h(-1436003720);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)");
        }
        TextFieldState I = textFieldSelectionManager.I();
        if (I != null && I.o() && (K = textFieldSelectionManager.K()) != null && K.length() > 0) {
            h.z(1157296644);
            boolean S = h.S(textFieldSelectionManager);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = textFieldSelectionManager.q();
                h.q(A);
            }
            h.R();
            xh8 xh8Var = (xh8) A;
            final long z = textFieldSelectionManager.z((fm1) h.m(CompositionLocalsKt.e()));
            Modifier c = bd8.c(Modifier.a, xh8Var, new CoreTextFieldKt$TextFieldCursorHandle$1(xh8Var, textFieldSelectionManager, null));
            h.z(-272875135);
            boolean e = h.e(z);
            Object A2 = h.A();
            if (e || A2 == Composer.a.a()) {
                A2 = new ss2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        lj7Var.a(wi7.d(), new vi7(Handle.Cursor, z, SelectionHandleAnchor.Middle, true, null));
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                };
                h.q(A2);
            }
            h.R();
            AndroidCursorHandle_androidKt.a(z, dj7.d(c, false, (ss2) A2, 1, null), null, h, 384);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
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
                    CoreTextFieldKt.e(TextFieldSelectionManager.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final Object m(qc0 qc0Var, TextFieldValue textFieldValue, rh8 rh8Var, aj8 aj8Var, id5 id5Var, by0 by0Var) {
        int b = id5Var.b(i.k(textFieldValue.g()));
        Object a = qc0Var.a(b < aj8Var.l().j().length() ? aj8Var.d(b) : b != 0 ? aj8Var.d(b - 1) : new kt6(0.0f, 0.0f, 1.0f, hn3.f(fi8.b(rh8Var.j(), rh8Var.a(), rh8Var.b(), null, 0, 24, null))), by0Var);
        return a == kotlin.coroutines.intrinsics.a.h() ? a : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(TextFieldState textFieldState) {
        vi8 e = textFieldState.e();
        if (e != null) {
            TextFieldDelegate.a.e(e, textFieldState.l(), textFieldState.k());
        }
        textFieldState.z(null);
    }

    public static final boolean o(ng9 ng9Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TextFieldState textFieldState, TextFieldValue textFieldValue, id5 id5Var) {
        e c = e.e.c();
        try {
            e l = c.l();
            try {
                bj8 h = textFieldState.h();
                if (h == null) {
                    return;
                }
                vi8 e = textFieldState.e();
                if (e == null) {
                    return;
                }
                cz3 g = textFieldState.g();
                if (g == null) {
                    return;
                }
                TextFieldDelegate.a.d(textFieldValue, textFieldState.s(), h.f(), g, e, textFieldState.d(), id5Var);
                ww8 ww8Var = ww8.a;
            } finally {
                c.s(l);
            }
        } finally {
            c.d();
        }
    }

    private static final Modifier q(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return androidx.compose.ui.input.key.a.b(modifier, new ss2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean b(KeyEvent keyEvent) {
                boolean z;
                if (TextFieldState.this.c() == HandleState.Selection && uv3.a(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.t(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((sv3) obj).f());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ri8 ri8Var, TextFieldState textFieldState, TextFieldValue textFieldValue, androidx.compose.ui.text.input.b bVar, id5 id5Var) {
        textFieldState.z(TextFieldDelegate.a.g(ri8Var, textFieldValue, textFieldState.l(), bVar, textFieldState.k(), textFieldState.j()));
        p(textFieldState, textFieldValue, id5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        ex7 f;
        if (!textFieldState.d()) {
            focusRequester.e();
        } else {
            if (!z || (f = textFieldState.f()) == null) {
                return;
            }
            f.a();
        }
    }
}
