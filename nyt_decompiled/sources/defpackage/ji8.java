package defpackage;

import androidx.compose.ui.text.a;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;

/* loaded from: classes.dex */
public abstract class ji8 {
    public static final a a(TextFieldValue textFieldValue) {
        return textFieldValue.e().p(textFieldValue.g());
    }

    public static final a b(TextFieldValue textFieldValue, int i) {
        return textFieldValue.e().subSequence(i.k(textFieldValue.g()), Math.min(i.k(textFieldValue.g()) + i, textFieldValue.h().length()));
    }

    public static final a c(TextFieldValue textFieldValue, int i) {
        return textFieldValue.e().subSequence(Math.max(0, i.l(textFieldValue.g()) - i), i.l(textFieldValue.g()));
    }
}
