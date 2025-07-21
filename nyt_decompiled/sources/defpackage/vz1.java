package defpackage;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class vz1 {
    private final b a;
    private int b = Integer.MAX_VALUE;
    private int c = 0;

    private static class a extends b {
        private final EditText a;
        private final d02 b;

        a(EditText editText, boolean z) {
            this.a = editText;
            d02 d02Var = new d02(editText, z);
            this.b = d02Var;
            editText.addTextChangedListener(d02Var);
            editText.setEditableFactory(wz1.getInstance());
        }

        @Override // vz1.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof zz1) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new zz1(keyListener);
        }

        @Override // vz1.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof xz1 ? inputConnection : new xz1(this.a, inputConnection, editorInfo);
        }

        @Override // vz1.b
        void c(boolean z) {
            this.b.c(z);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z);
    }

    public vz1(EditText editText, boolean z) {
        h16.h(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.b(inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
