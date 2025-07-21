package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.c02;
import defpackage.fo6;

/* loaded from: classes.dex */
class l {
    private final TextView a;
    private final c02 b;

    l(TextView textView) {
        this.a = textView;
        this.b = new c02(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public boolean b() {
        return this.b.b();
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

    void d(boolean z) {
        this.b.c(z);
    }

    void e(boolean z) {
        this.b.d(z);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.b.e(transformationMethod);
    }
}
