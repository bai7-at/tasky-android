package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d02 implements TextWatcher {
    private final EditText a;
    private final boolean b;
    private e.f c;
    private int d = Integer.MAX_VALUE;
    private int e = 0;
    private boolean f = true;

    private static class a extends e.f {
        private final Reference a;

        a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            super.b();
            d02.b((EditText) this.a.get(), 1);
        }
    }

    d02(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    private e.f a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    static void b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.c().r(editableText);
            yz1.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f && (this.b || e.k())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void c(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                e.c().w(this.c);
            }
            this.f = z;
            if (z) {
                b(this.a, e.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.isInEditMode() || d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int g = e.c().g();
        if (g != 0) {
            if (g == 1) {
                e.c().u((Spannable) charSequence, i, i + i3, this.d, this.e);
                return;
            } else if (g != 3) {
                return;
            }
        }
        e.c().v(a());
    }
}
