package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import defpackage.am1;
import defpackage.cw3;
import defpackage.dw3;
import defpackage.e48;
import defpackage.fy1;
import defpackage.hi8;
import defpackage.id5;
import defpackage.ii8;
import defpackage.jw8;
import defpackage.kp0;
import defpackage.oh2;
import defpackage.oj8;
import defpackage.ss2;
import defpackage.uv3;
import defpackage.vv3;
import defpackage.wv3;
import defpackage.ww8;
import defpackage.yb1;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    private final TextFieldState a;
    private final TextFieldSelectionManager b;
    private final TextFieldValue c;
    private final boolean d;
    private final boolean e;
    private final oj8 f;
    private final id5 g;
    private final jw8 h;
    private final yb1 i;
    private final cw3 j;
    private final ss2 k;
    private final int l;

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, oj8 oj8Var, id5 id5Var, jw8 jw8Var, yb1 yb1Var, cw3 cw3Var, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, oj8Var, id5Var, jw8Var, yb1Var, cw3Var, ss2Var, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(fy1 fy1Var) {
        f(i.e(fy1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List list) {
        EditProcessor l = this.a.l();
        List a1 = i.a1(list);
        a1.add(0, new oh2());
        this.k.invoke(l.b(a1));
    }

    private final void g(ss2 ss2Var) {
        ii8 ii8Var = new ii8(this.c, this.g, this.a.h(), this.f);
        ss2Var.invoke(ii8Var);
        if (androidx.compose.ui.text.i.g(ii8Var.u(), this.c.g()) && zq3.c(ii8Var.e(), this.c.e())) {
            return;
        }
        this.k.invoke(ii8Var.Z());
    }

    private final kp0 m(KeyEvent keyEvent) {
        Integer a;
        if (hi8.a(keyEvent) && (a = this.i.a(keyEvent)) != null) {
            return new kp0(e48.a(new StringBuilder(), a.intValue()).toString(), 1);
        }
        return null;
    }

    public final TextFieldSelectionManager h() {
        return this.b;
    }

    public final boolean i() {
        return this.e;
    }

    public final TextFieldState j() {
        return this.a;
    }

    public final jw8 k() {
        return this.h;
    }

    public final boolean l(KeyEvent keyEvent) {
        final KeyCommand a;
        kp0 m = m(keyEvent);
        if (m != null) {
            if (!this.d) {
                return false;
            }
            e(m);
            this.f.b();
            return true;
        }
        if (!vv3.e(wv3.b(keyEvent), vv3.a.a()) || (a = this.j.a(keyEvent)) == null || (a.getEditsText() && !this.d)) {
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        g(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    try {
                        iArr[KeyCommand.COPY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KeyCommand.PASTE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[KeyCommand.CUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[KeyCommand.UP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[KeyCommand.DOWN.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[KeyCommand.HOME.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[KeyCommand.END.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[KeyCommand.TAB.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[KeyCommand.UNDO.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[KeyCommand.REDO.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ii8 ii8Var) {
                int i;
                TextFieldValue g;
                ss2 ss2Var;
                TextFieldValue c;
                ss2 ss2Var2;
                switch (a.a[KeyCommand.this.ordinal()]) {
                    case 1:
                        this.h().n(false);
                        break;
                    case 2:
                        this.h().P();
                        break;
                    case 3:
                        this.h().r();
                        break;
                    case 4:
                        ii8Var.b(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            public final void b(ii8 ii8Var2) {
                                ii8Var2.A();
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((ii8) obj);
                                return ww8.a;
                            }
                        });
                        break;
                    case 5:
                        ii8Var.c(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            public final void b(ii8 ii8Var2) {
                                ii8Var2.I();
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((ii8) obj);
                                return ww8.a;
                            }
                        });
                        break;
                    case 6:
                        ii8Var.B();
                        break;
                    case 7:
                        ii8Var.J();
                        break;
                    case 8:
                        ii8Var.G();
                        break;
                    case 9:
                        ii8Var.D();
                        break;
                    case 10:
                        ii8Var.Q();
                        break;
                    case 11:
                        ii8Var.z();
                        break;
                    case 12:
                        ii8Var.c0();
                        break;
                    case 13:
                        ii8Var.b0();
                        break;
                    case 14:
                        ii8Var.P();
                        break;
                    case 15:
                        ii8Var.M();
                        break;
                    case 16:
                        ii8Var.N();
                        break;
                    case 17:
                        ii8Var.O();
                        break;
                    case 18:
                        ii8Var.L();
                        break;
                    case 19:
                        ii8Var.K();
                        break;
                    case 20:
                        List Y = ii8Var.Y(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final fy1 invoke(ii8 ii8Var2) {
                                return new am1(androidx.compose.ui.text.i.i(ii8Var2.u()) - ii8Var2.q(), 0);
                            }
                        });
                        if (Y != null) {
                            this.f(Y);
                            break;
                        }
                        break;
                    case 21:
                        List Y2 = ii8Var.Y(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final fy1 invoke(ii8 ii8Var2) {
                                int l = ii8Var2.l();
                                if (l != -1) {
                                    return new am1(0, l - androidx.compose.ui.text.i.i(ii8Var2.u()));
                                }
                                return null;
                            }
                        });
                        if (Y2 != null) {
                            this.f(Y2);
                            break;
                        }
                        break;
                    case 22:
                        List Y3 = ii8Var.Y(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final fy1 invoke(ii8 ii8Var2) {
                                Integer t = ii8Var2.t();
                                if (t == null) {
                                    return null;
                                }
                                return new am1(androidx.compose.ui.text.i.i(ii8Var2.u()) - t.intValue(), 0);
                            }
                        });
                        if (Y3 != null) {
                            this.f(Y3);
                            break;
                        }
                        break;
                    case 23:
                        List Y4 = ii8Var.Y(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final fy1 invoke(ii8 ii8Var2) {
                                Integer m2 = ii8Var2.m();
                                if (m2 != null) {
                                    return new am1(0, m2.intValue() - androidx.compose.ui.text.i.i(ii8Var2.u()));
                                }
                                return null;
                            }
                        });
                        if (Y4 != null) {
                            this.f(Y4);
                            break;
                        }
                        break;
                    case 24:
                        List Y5 = ii8Var.Y(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final fy1 invoke(ii8 ii8Var2) {
                                Integer i2 = ii8Var2.i();
                                if (i2 == null) {
                                    return null;
                                }
                                return new am1(androidx.compose.ui.text.i.i(ii8Var2.u()) - i2.intValue(), 0);
                            }
                        });
                        if (Y5 != null) {
                            this.f(Y5);
                            break;
                        }
                        break;
                    case EventType.SUBS /* 25 */:
                        List Y6 = ii8Var.Y(new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final fy1 invoke(ii8 ii8Var2) {
                                Integer f = ii8Var2.f();
                                if (f != null) {
                                    return new am1(0, f.intValue() - androidx.compose.ui.text.i.i(ii8Var2.u()));
                                }
                                return null;
                            }
                        });
                        if (Y6 != null) {
                            this.f(Y6);
                            break;
                        }
                        break;
                    case EventType.CDN /* 26 */:
                        if (!this.i()) {
                            this.e(new kp0("\n", 1));
                            break;
                        } else {
                            ss2 j = this.j().j();
                            i = this.l;
                            j.invoke(androidx.compose.ui.text.input.a.i(i));
                            break;
                        }
                    case 27:
                        if (!this.i()) {
                            this.e(new kp0("\t", 1));
                            break;
                        } else {
                            ref$BooleanRef.element = false;
                            break;
                        }
                    case 28:
                        ii8Var.R();
                        break;
                    case BuildConfig.VERSION_CODE /* 29 */:
                        ((ii8) ii8Var.A()).S();
                        break;
                    case 30:
                        ((ii8) ii8Var.I()).S();
                        break;
                    case 31:
                        ((ii8) ii8Var.B()).S();
                        break;
                    case 32:
                        ((ii8) ii8Var.J()).S();
                        break;
                    case 33:
                        ((ii8) ii8Var.G()).S();
                        break;
                    case 34:
                        ((ii8) ii8Var.D()).S();
                        break;
                    case 35:
                        ((ii8) ii8Var.P()).S();
                        break;
                    case 36:
                        ((ii8) ii8Var.M()).S();
                        break;
                    case 37:
                        ((ii8) ii8Var.N()).S();
                        break;
                    case 38:
                        ((ii8) ii8Var.O()).S();
                        break;
                    case 39:
                        ((ii8) ii8Var.Q()).S();
                        break;
                    case 40:
                        ((ii8) ii8Var.z()).S();
                        break;
                    case 41:
                        ii8Var.c0().S();
                        break;
                    case 42:
                        ii8Var.b0().S();
                        break;
                    case 43:
                        ((ii8) ii8Var.L()).S();
                        break;
                    case 44:
                        ((ii8) ii8Var.K()).S();
                        break;
                    case 45:
                        ii8Var.d();
                        break;
                    case 46:
                        jw8 k = this.k();
                        if (k != null) {
                            k.b(ii8Var.Z());
                        }
                        jw8 k2 = this.k();
                        if (k2 != null && (g = k2.g()) != null) {
                            ss2Var = this.k;
                            ss2Var.invoke(g);
                            break;
                        }
                        break;
                    case 47:
                        jw8 k3 = this.k();
                        if (k3 != null && (c = k3.c()) != null) {
                            ss2Var2 = this.k;
                            ss2Var2.invoke(c);
                            break;
                        }
                        break;
                    case 48:
                        uv3.b();
                        break;
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ii8) obj);
                return ww8.a;
            }
        });
        jw8 jw8Var = this.h;
        if (jw8Var != null) {
            jw8Var.a();
        }
        return ref$BooleanRef.element;
    }

    private TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, oj8 oj8Var, id5 id5Var, jw8 jw8Var, yb1 yb1Var, cw3 cw3Var, ss2 ss2Var, int i) {
        this.a = textFieldState;
        this.b = textFieldSelectionManager;
        this.c = textFieldValue;
        this.d = z;
        this.e = z2;
        this.f = oj8Var;
        this.g = id5Var;
        this.h = jw8Var;
        this.i = yb1Var;
        this.j = cw3Var;
        this.k = ss2Var;
        this.l = i;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, oj8 oj8Var, id5 id5Var, jw8 jw8Var, yb1 yb1Var, cw3 cw3Var, ss2 ss2Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (androidx.compose.ui.text.i) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, oj8Var, (i2 & 64) != 0 ? id5.a.a() : id5Var, (i2 & 128) != 0 ? null : jw8Var, yb1Var, (i2 & 512) != 0 ? dw3.a() : cw3Var, (i2 & 1024) != 0 ? new ss2() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void b(TextFieldValue textFieldValue2) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((TextFieldValue) obj);
                return ww8.a;
            }
        } : ss2Var, i, null);
    }
}
