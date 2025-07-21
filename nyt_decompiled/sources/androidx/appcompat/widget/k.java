package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.fo6;
import defpackage.vz1;

/* loaded from: classes.dex */
class k {
    private final EditText a;
    private final vz1 b;

    k(EditText editText) {
        this.a = editText;
        this.b = new vz1(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, fo6.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(fo6.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(fo6.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.b.b(inputConnection, editorInfo);
    }

    void e(boolean z) {
        this.b.c(z);
    }
}
