package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import defpackage.y06;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class n implements Spannable {
    private boolean a = false;
    private Spannable b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        abstract boolean a(CharSequence charSequence);
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.n.b
        boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof y06);
        }
    }

    n(Spannable spannable) {
        this.b = spannable;
    }

    private void a() {
        Spannable spannable = this.b;
        if (!this.a && c().a(spannable)) {
            this.b = new SpannableString(spannable);
        }
        this.a = true;
    }

    static b c() {
        return new c();
    }

    Spannable b() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.b.toString();
    }

    n(CharSequence charSequence) {
        this.b = new SpannableString(charSequence);
    }
}
