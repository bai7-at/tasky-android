package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.j;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import defpackage.dh8;
import defpackage.q44;
import defpackage.yd3;

/* loaded from: classes.dex */
public abstract class yf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.u(spannableString, new wi3(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(TextLayout textLayout, int i) {
        int l = textLayout.l();
        for (int i2 = 0; i2 < l; i2++) {
            if (textLayout.k(i2) > i) {
                return i2;
            }
        }
        return textLayout.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(j jVar, boolean z) {
        if (!z || dk8.e(jVar.u(), ek8.g(0)) || dk8.e(jVar.u(), dk8.b.a())) {
            return false;
        }
        int D = jVar.D();
        dh8.a aVar = dh8.b;
        return (dh8.k(D, aVar.g()) || dh8.k(jVar.D(), aVar.f()) || dh8.k(jVar.D(), aVar.c())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i) {
        dh8.a aVar = dh8.b;
        if (dh8.k(i, aVar.d())) {
            return 3;
        }
        if (dh8.k(i, aVar.e())) {
            return 4;
        }
        if (dh8.k(i, aVar.a())) {
            return 2;
        }
        return (!dh8.k(i, aVar.f()) && dh8.k(i, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i) {
        q44.b.a aVar = q44.b.a;
        if (q44.b.e(i, aVar.c())) {
            return 0;
        }
        if (q44.b.e(i, aVar.b())) {
            return 1;
        }
        return q44.b.e(i, aVar.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i) {
        yd3.a aVar = yd3.b;
        if (yd3.g(i, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        yd3.g(i, aVar.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i) {
        q44.c.a aVar = q44.c.a;
        if (q44.c.f(i, aVar.a())) {
            return 0;
        }
        if (q44.c.f(i, aVar.b())) {
            return 1;
        }
        if (q44.c.f(i, aVar.c())) {
            return 2;
        }
        return q44.c.f(i, aVar.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i) {
        q44.d.a aVar = q44.d.a;
        return (!q44.d.d(i, aVar.a()) && q44.d.d(i, aVar.b())) ? 1 : 0;
    }
}
