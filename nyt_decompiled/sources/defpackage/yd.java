package defpackage;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;

/* loaded from: classes.dex */
public abstract class yd {
    public static final a a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new a(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int e0 = d.e0(annotationArr);
        if (e0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (zq3.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new a.b(new rc1(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == e0) {
                    break;
                }
                i++;
            }
        }
        return new a(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(a aVar) {
        if (aVar.f().isEmpty()) {
            return aVar.j();
        }
        SpannableString spannableString = new SpannableString(aVar.j());
        v02 v02Var = new v02();
        List f = aVar.f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            a.b bVar = (a.b) f.get(i);
            jy7 jy7Var = (jy7) bVar.a();
            int b = bVar.b();
            int c = bVar.c();
            v02Var.q();
            v02Var.e(jy7Var);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", v02Var.p()), b, c, 33);
        }
        return spannableString;
    }
}
