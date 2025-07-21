package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.j;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.emoji2.text.e;
import java.util.List;

/* loaded from: classes.dex */
public abstract class vf {
    private static final a a = new a();

    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public static final CharSequence a(String str, float f, j jVar, List list, List list2, fm1 fm1Var, kt2 kt2Var, boolean z) {
        CharSequence charSequence;
        if (z && e.k()) {
            charSequence = e.c().r(str);
            zq3.e(charSequence);
        } else {
            charSequence = str;
        }
        if (list.isEmpty() && list2.isEmpty() && zq3.c(jVar.H(), ni8.c.a()) && ek8.h(jVar.w())) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (zq3.c(jVar.E(), ph8.b.d())) {
            SpannableExtensions_androidKt.u(spannableString, a, 0, str.length());
        }
        if (b(jVar) && jVar.x() == null) {
            SpannableExtensions_androidKt.r(spannableString, jVar.w(), f, fm1Var);
        } else {
            u44 x = jVar.x();
            if (x == null) {
                x = u44.c.a();
            }
            SpannableExtensions_androidKt.q(spannableString, jVar.w(), f, fm1Var, x);
        }
        SpannableExtensions_androidKt.y(spannableString, jVar.H(), f, fm1Var);
        SpannableExtensions_androidKt.w(spannableString, jVar, list, fm1Var, kt2Var);
        xt5.d(spannableString, list2, fm1Var);
        return spannableString;
    }

    public static final boolean b(j jVar) {
        uu5 a2;
        zu5 A = jVar.A();
        if (A == null || (a2 = A.a()) == null) {
            return false;
        }
        return a2.c();
    }
}
