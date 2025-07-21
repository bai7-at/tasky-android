package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.l;
import defpackage.bv5;
import defpackage.zq3;

/* loaded from: classes.dex */
final class s implements bv5 {
    private final Typeface c(String str, o oVar, int i) {
        l.a aVar = l.b;
        if (l.f(i, aVar.b()) && zq3.c(oVar, o.b.f()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), oVar.p(), l.f(i, aVar.a()));
    }

    @Override // defpackage.bv5
    public Typeface a(p pVar, o oVar, int i) {
        return c(pVar.j(), oVar, i);
    }

    @Override // defpackage.bv5
    public Typeface b(o oVar, int i) {
        return c(null, oVar, i);
    }
}
