package defpackage;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.font.p;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ph8;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class md {
    private static final void a(SpannableString spannableString, jy7 jy7Var, int i, int i2, fm1 fm1Var, e.b bVar) {
        SpannableExtensions_androidKt.k(spannableString, jy7Var.i(), i, i2);
        SpannableExtensions_androidKt.o(spannableString, jy7Var.m(), fm1Var, i, i2);
        if (jy7Var.p() != null || jy7Var.n() != null) {
            o p = jy7Var.p();
            if (p == null) {
                p = o.b.f();
            }
            l n = jy7Var.n();
            spannableString.setSpan(new StyleSpan(a.c(p, n != null ? n.i() : l.b.b())), i, i2, 33);
        }
        if (jy7Var.k() != null) {
            if (jy7Var.k() instanceof p) {
                spannableString.setSpan(new TypefaceSpan(((p) jy7Var.k()).j()), i, i2, 33);
            } else {
                e k = jy7Var.k();
                m o = jy7Var.o();
                Object value = e.b.b(bVar, k, null, 0, o != null ? o.m() : m.b.a(), 6, null).getValue();
                zq3.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(gj.a.a((Typeface) value), i, i2, 33);
            }
        }
        if (jy7Var.u() != null) {
            ph8 u = jy7Var.u();
            ph8.a aVar = ph8.b;
            if (u.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (jy7Var.u().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (jy7Var.w() != null) {
            spannableString.setSpan(new ScaleXSpan(jy7Var.w().b()), i, i2, 33);
        }
        SpannableExtensions_androidKt.s(spannableString, jy7Var.r(), i, i2);
        SpannableExtensions_androidKt.h(spannableString, jy7Var.f(), i, i2);
    }

    public static final SpannableString b(androidx.compose.ui.text.a aVar, fm1 fm1Var, e.b bVar, zv8 zv8Var) {
        jy7 a;
        SpannableString spannableString = new SpannableString(aVar.j());
        List g = aVar.g();
        if (g != null) {
            int size = g.size();
            for (int i = 0; i < size; i++) {
                a.b bVar2 = (a.b) g.get(i);
                jy7 jy7Var = (jy7) bVar2.a();
                int b = bVar2.b();
                int c = bVar2.c();
                a = jy7Var.a((r38 & 1) != 0 ? jy7Var.i() : 0L, (r38 & 2) != 0 ? jy7Var.b : 0L, (r38 & 4) != 0 ? jy7Var.c : null, (r38 & 8) != 0 ? jy7Var.d : null, (r38 & 16) != 0 ? jy7Var.e : null, (r38 & 32) != 0 ? jy7Var.f : null, (r38 & 64) != 0 ? jy7Var.g : null, (r38 & 128) != 0 ? jy7Var.h : 0L, (r38 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? jy7Var.i : null, (r38 & 512) != 0 ? jy7Var.j : null, (r38 & 1024) != 0 ? jy7Var.k : null, (r38 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? jy7Var.l : 0L, (r38 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? jy7Var.m : null, (r38 & 8192) != 0 ? jy7Var.n : null, (r38 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? jy7Var.o : null, (r38 & 32768) != 0 ? jy7Var.p : null);
                a(spannableString, a, b, c, fm1Var, bVar);
            }
        }
        List k = aVar.k(0, aVar.length());
        int size2 = k.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a.b bVar3 = (a.b) k.get(i2);
            spannableString.setSpan(bu8.a((au8) bVar3.a()), bVar3.b(), bVar3.c(), 33);
        }
        List l = aVar.l(0, aVar.length());
        int size3 = l.size();
        for (int i3 = 0; i3 < size3; i3++) {
            a.b bVar4 = (a.b) l.get(i3);
            spannableString.setSpan(zv8Var.a((zy8) bVar4.a()), bVar4.b(), bVar4.c(), 33);
        }
        return spannableString;
    }
}
