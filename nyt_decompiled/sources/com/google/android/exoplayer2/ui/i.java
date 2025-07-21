package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.i16;
import defpackage.jy3;
import defpackage.ur;
import defpackage.y31;

/* loaded from: classes2.dex */
abstract class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof jy3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(y31.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) ur.e(bVar.e()), new i16() { // from class: com.google.android.exoplayer2.ui.g
                @Override // defpackage.i16
                public final boolean apply(Object obj) {
                    boolean c;
                    c = i.c(obj);
                    return c;
                }
            });
        }
        f(bVar);
    }

    public static void f(y31.b bVar) {
        bVar.q(-3.4028235E38f, RecyclerView.UNDEFINED_DURATION);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) ur.e(bVar.e()), new i16() { // from class: com.google.android.exoplayer2.ui.h
                @Override // defpackage.i16
                public final boolean apply(Object obj) {
                    boolean d;
                    d = i.d(obj);
                    return d;
                }
            });
        }
    }

    private static void g(Spannable spannable, i16 i16Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (i16Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
