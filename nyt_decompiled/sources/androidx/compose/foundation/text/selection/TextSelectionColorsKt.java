package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import defpackage.m76;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.sj8;
import defpackage.wn0;

/* loaded from: classes.dex */
public abstract class TextSelectionColorsKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$LocalTextSelectionColors$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final sj8 mo865invoke() {
            sj8 sj8Var;
            sj8Var = TextSelectionColorsKt.c;
            return sj8Var;
        }
    }, 1, null);
    private static final long b;
    private static final sj8 c;

    static {
        long d = wn0.d(4282550004L);
        b = d;
        c = new sj8(d, nn0.r(d, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final m76 b() {
        return a;
    }
}
