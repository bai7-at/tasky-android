package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import defpackage.cg4;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.wn0;
import defpackage.yc0;

/* loaded from: classes.dex */
public abstract class c {
    public static final TextForegroundStyle b(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof a;
        return (z || (textForegroundStyle2 instanceof a)) ? (z && (textForegroundStyle2 instanceof a)) ? TextForegroundStyle.a.a((yc0) SpanStyleKt.d(((a) textForegroundStyle).e(), ((a) textForegroundStyle2).e(), f), cg4.a(textForegroundStyle.a(), textForegroundStyle2.a(), f)) : (TextForegroundStyle) SpanStyleKt.d(textForegroundStyle, textForegroundStyle2, f) : TextForegroundStyle.a.b(wn0.h(textForegroundStyle.b(), textForegroundStyle2.b(), f));
    }

    public static final long c(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : nn0.r(j, nn0.u(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f, qs2 qs2Var) {
        return Float.isNaN(f) ? ((Number) qs2Var.mo865invoke()).floatValue() : f;
    }
}
