package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.id5;
import defpackage.it2;
import defpackage.jw8;
import defpackage.oj8;
import defpackage.ss2;
import defpackage.sv3;
import defpackage.yb1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public abstract class TextFieldKeyInputKt {
    public static final Modifier a(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final ss2 ss2Var, final boolean z, final boolean z2, final id5 id5Var, final jw8 jw8Var, final int i) {
        return ComposedModifierKt.b(modifier, null, new it2() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2

            /* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                AnonymousClass1(Object obj) {
                    super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                }

                public final Boolean g(KeyEvent keyEvent) {
                    return Boolean.valueOf(((TextFieldKeyInput) this.receiver).l(keyEvent));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return g(((sv3) obj).f());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.z(2057323757);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(2057323757, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
                }
                composer.z(-492369756);
                Object A = composer.A();
                Composer.a aVar = Composer.a;
                if (A == aVar.a()) {
                    A = new oj8();
                    composer.q(A);
                }
                composer.R();
                oj8 oj8Var = (oj8) A;
                composer.z(-492369756);
                Object A2 = composer.A();
                if (A2 == aVar.a()) {
                    A2 = new yb1();
                    composer.q(A2);
                }
                composer.R();
                Modifier a = androidx.compose.ui.input.key.a.a(Modifier.a, new AnonymousClass1(new TextFieldKeyInput(TextFieldState.this, textFieldSelectionManager, textFieldValue, z, z2, oj8Var, id5Var, jw8Var, (yb1) A2, null, ss2Var, i, 512, null)));
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return a;
            }
        }, 1, null);
    }
}
