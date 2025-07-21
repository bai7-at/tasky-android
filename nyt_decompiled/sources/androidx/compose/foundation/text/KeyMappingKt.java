package androidx.compose.foundation.text;

import android.view.KeyEvent;
import defpackage.cw3;
import defpackage.nv3;
import defpackage.ss2;
import defpackage.sv3;
import defpackage.ve4;
import defpackage.wv3;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes.dex */
public abstract class KeyMappingKt {
    private static final cw3 a = new b(a(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.kv3
        public Object get(Object obj) {
            return Boolean.valueOf(wv3.e(((sv3) obj).f()));
        }
    }));

    public static final class a implements cw3 {
        final /* synthetic */ ss2 a;

        a(ss2 ss2Var) {
            this.a = ss2Var;
        }

        @Override // defpackage.cw3
        public KeyCommand a(KeyEvent keyEvent) {
            if (((Boolean) this.a.invoke(sv3.a(keyEvent))).booleanValue() && wv3.f(keyEvent)) {
                if (nv3.p(wv3.a(keyEvent), ve4.a.x())) {
                    return KeyCommand.REDO;
                }
                return null;
            }
            if (((Boolean) this.a.invoke(sv3.a(keyEvent))).booleanValue()) {
                long a = wv3.a(keyEvent);
                ve4 ve4Var = ve4.a;
                if (nv3.p(a, ve4Var.d()) ? true : nv3.p(a, ve4Var.n())) {
                    return KeyCommand.COPY;
                }
                if (nv3.p(a, ve4Var.u())) {
                    return KeyCommand.PASTE;
                }
                if (nv3.p(a, ve4Var.v())) {
                    return KeyCommand.CUT;
                }
                if (nv3.p(a, ve4Var.a())) {
                    return KeyCommand.SELECT_ALL;
                }
                if (nv3.p(a, ve4Var.w())) {
                    return KeyCommand.REDO;
                }
                if (nv3.p(a, ve4Var.x())) {
                    return KeyCommand.UNDO;
                }
                return null;
            }
            if (wv3.e(keyEvent)) {
                return null;
            }
            if (wv3.f(keyEvent)) {
                long a2 = wv3.a(keyEvent);
                ve4 ve4Var2 = ve4.a;
                if (nv3.p(a2, ve4Var2.i())) {
                    return KeyCommand.SELECT_LEFT_CHAR;
                }
                if (nv3.p(a2, ve4Var2.j())) {
                    return KeyCommand.SELECT_RIGHT_CHAR;
                }
                if (nv3.p(a2, ve4Var2.k())) {
                    return KeyCommand.SELECT_UP;
                }
                if (nv3.p(a2, ve4Var2.h())) {
                    return KeyCommand.SELECT_DOWN;
                }
                if (nv3.p(a2, ve4Var2.r())) {
                    return KeyCommand.SELECT_PAGE_UP;
                }
                if (nv3.p(a2, ve4Var2.q())) {
                    return KeyCommand.SELECT_PAGE_DOWN;
                }
                if (nv3.p(a2, ve4Var2.p())) {
                    return KeyCommand.SELECT_LINE_START;
                }
                if (nv3.p(a2, ve4Var2.o())) {
                    return KeyCommand.SELECT_LINE_END;
                }
                if (nv3.p(a2, ve4Var2.n())) {
                    return KeyCommand.PASTE;
                }
                return null;
            }
            long a3 = wv3.a(keyEvent);
            ve4 ve4Var3 = ve4.a;
            if (nv3.p(a3, ve4Var3.i())) {
                return KeyCommand.LEFT_CHAR;
            }
            if (nv3.p(a3, ve4Var3.j())) {
                return KeyCommand.RIGHT_CHAR;
            }
            if (nv3.p(a3, ve4Var3.k())) {
                return KeyCommand.UP;
            }
            if (nv3.p(a3, ve4Var3.h())) {
                return KeyCommand.DOWN;
            }
            if (nv3.p(a3, ve4Var3.r())) {
                return KeyCommand.PAGE_UP;
            }
            if (nv3.p(a3, ve4Var3.q())) {
                return KeyCommand.PAGE_DOWN;
            }
            if (nv3.p(a3, ve4Var3.p())) {
                return KeyCommand.LINE_START;
            }
            if (nv3.p(a3, ve4Var3.o())) {
                return KeyCommand.LINE_END;
            }
            if (nv3.p(a3, ve4Var3.l())) {
                return KeyCommand.NEW_LINE;
            }
            if (nv3.p(a3, ve4Var3.c())) {
                return KeyCommand.DELETE_PREV_CHAR;
            }
            if (nv3.p(a3, ve4Var3.g())) {
                return KeyCommand.DELETE_NEXT_CHAR;
            }
            if (nv3.p(a3, ve4Var3.s())) {
                return KeyCommand.PASTE;
            }
            if (nv3.p(a3, ve4Var3.f())) {
                return KeyCommand.CUT;
            }
            if (nv3.p(a3, ve4Var3.e())) {
                return KeyCommand.COPY;
            }
            if (nv3.p(a3, ve4Var3.t())) {
                return KeyCommand.TAB;
            }
            return null;
        }
    }

    public static final class b implements cw3 {
        final /* synthetic */ cw3 a;

        b(cw3 cw3Var) {
            this.a = cw3Var;
        }

        @Override // defpackage.cw3
        public KeyCommand a(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (wv3.f(keyEvent) && wv3.e(keyEvent)) {
                long a = wv3.a(keyEvent);
                ve4 ve4Var = ve4.a;
                if (nv3.p(a, ve4Var.i())) {
                    keyCommand = KeyCommand.SELECT_LEFT_WORD;
                } else if (nv3.p(a, ve4Var.j())) {
                    keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                } else if (nv3.p(a, ve4Var.k())) {
                    keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (nv3.p(a, ve4Var.h())) {
                    keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (wv3.e(keyEvent)) {
                long a2 = wv3.a(keyEvent);
                ve4 ve4Var2 = ve4.a;
                if (nv3.p(a2, ve4Var2.i())) {
                    keyCommand = KeyCommand.LEFT_WORD;
                } else if (nv3.p(a2, ve4Var2.j())) {
                    keyCommand = KeyCommand.RIGHT_WORD;
                } else if (nv3.p(a2, ve4Var2.k())) {
                    keyCommand = KeyCommand.PREV_PARAGRAPH;
                } else if (nv3.p(a2, ve4Var2.h())) {
                    keyCommand = KeyCommand.NEXT_PARAGRAPH;
                } else if (nv3.p(a2, ve4Var2.m())) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (nv3.p(a2, ve4Var2.g())) {
                    keyCommand = KeyCommand.DELETE_NEXT_WORD;
                } else if (nv3.p(a2, ve4Var2.c())) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else if (nv3.p(a2, ve4Var2.b())) {
                    keyCommand = KeyCommand.DESELECT;
                }
            } else if (wv3.f(keyEvent)) {
                long a3 = wv3.a(keyEvent);
                ve4 ve4Var3 = ve4.a;
                if (nv3.p(a3, ve4Var3.p())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (nv3.p(a3, ve4Var3.o())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                }
            } else if (wv3.d(keyEvent)) {
                long a4 = wv3.a(keyEvent);
                ve4 ve4Var4 = ve4.a;
                if (nv3.p(a4, ve4Var4.c())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                } else if (nv3.p(a4, ve4Var4.g())) {
                    keyCommand = KeyCommand.DELETE_TO_LINE_END;
                }
            }
            return keyCommand == null ? this.a.a(keyEvent) : keyCommand;
        }
    }

    public static final cw3 a(ss2 ss2Var) {
        return new a(ss2Var);
    }

    public static final cw3 b() {
        return a;
    }
}
