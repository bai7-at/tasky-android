package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class yz1 implements InputFilter {
    private final TextView a;
    private e.f b;

    private static class a extends e.f {
        private final Reference a;
        private final Reference b;

        a(TextView textView, yz1 yz1Var) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(yz1Var);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            CharSequence text;
            CharSequence r;
            super.b();
            TextView textView = (TextView) this.a.get();
            if (c(textView, (InputFilter) this.b.get()) && textView.isAttachedToWindow() && text != (r = e.c().r((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(r);
                int selectionEnd = Selection.getSelectionEnd(r);
                textView.setText(r);
                if (r instanceof Spannable) {
                    yz1.b((Spannable) r, selectionStart, selectionEnd);
                }
            }
        }
    }

    yz1(TextView textView) {
        this.a = textView;
    }

    private e.f a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int g = e.c().g();
        if (g != 0) {
            if (g == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return e.c().s(charSequence, 0, charSequence.length());
            }
            if (g != 3) {
                return charSequence;
            }
        }
        e.c().v(a());
        return charSequence;
    }
}
