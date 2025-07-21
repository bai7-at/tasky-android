package defpackage;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class el3 {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = i.l(textFieldValue.g());
        extractedText.selectionEnd = i.k(textFieldValue.g());
        extractedText.flags = !h.O(textFieldValue.h(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
