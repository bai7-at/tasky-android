package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import defpackage.ex7;
import defpackage.mw3;
import defpackage.ss2;
import defpackage.sv3;
import defpackage.ul2;
import defpackage.vv3;
import defpackage.wv3;

/* loaded from: classes.dex */
public abstract class TextFieldFocusModifier_androidKt {
    public static final Modifier b(Modifier modifier, final TextFieldState textFieldState, final ul2 ul2Var) {
        return androidx.compose.ui.input.key.a.b(modifier, new ss2() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean b(KeyEvent keyEvent) {
                boolean c;
                boolean c2;
                boolean c3;
                boolean c4;
                boolean c5;
                InputDevice device = keyEvent.getDevice();
                boolean z = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && vv3.e(wv3.b(keyEvent), vv3.a.a())) {
                    c = TextFieldFocusModifier_androidKt.c(keyEvent, 19);
                    if (c) {
                        z = ul2.this.f(androidx.compose.ui.focus.d.b.h());
                    } else {
                        c2 = TextFieldFocusModifier_androidKt.c(keyEvent, 20);
                        if (c2) {
                            z = ul2.this.f(androidx.compose.ui.focus.d.b.a());
                        } else {
                            c3 = TextFieldFocusModifier_androidKt.c(keyEvent, 21);
                            if (c3) {
                                z = ul2.this.f(androidx.compose.ui.focus.d.b.d());
                            } else {
                                c4 = TextFieldFocusModifier_androidKt.c(keyEvent, 22);
                                if (c4) {
                                    z = ul2.this.f(androidx.compose.ui.focus.d.b.g());
                                } else {
                                    c5 = TextFieldFocusModifier_androidKt.c(keyEvent, 23);
                                    if (c5) {
                                        ex7 f = textFieldState.f();
                                        if (f != null) {
                                            f.a();
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
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
    public static final boolean c(KeyEvent keyEvent, int i) {
        return mw3.b(wv3.a(keyEvent)) == i;
    }
}
