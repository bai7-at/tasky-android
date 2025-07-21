package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;
import defpackage.bo5;

/* loaded from: classes.dex */
class d implements e.InterfaceC0080e {
    private static final ThreadLocal b = new ThreadLocal();
    private final TextPaint a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0080e
    public boolean a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b2 = b();
        b2.setLength(0);
        while (i < i2) {
            b2.append(charSequence.charAt(i));
            i++;
        }
        return bo5.a(this.a, b2.toString());
    }
}
