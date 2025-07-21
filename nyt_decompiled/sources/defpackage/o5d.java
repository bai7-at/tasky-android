package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* loaded from: classes3.dex */
abstract class o5d {
    private static final String a = Integer.toString(0, 36);
    private static final String b = Integer.toString(1, 36);
    private static final String c = Integer.toString(2, 36);
    private static final String d = Integer.toString(3, 36);
    private static final String e = Integer.toString(4, 36);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (s7d s7dVar : (s7d[]) spanned.getSpans(0, spanned.length(), s7d.class)) {
            arrayList.add(b(spanned, s7dVar, 1, s7dVar.a()));
        }
        for (s9d s9dVar : (s9d[]) spanned.getSpans(0, spanned.length(), s9d.class)) {
            arrayList.add(b(spanned, s9dVar, 2, s9dVar.a()));
        }
        for (q6d q6dVar : (q6d[]) spanned.getSpans(0, spanned.length(), q6d.class)) {
            arrayList.add(b(spanned, q6dVar, 3, null));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
