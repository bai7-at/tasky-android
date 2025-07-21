package defpackage;

import android.text.style.URLSpan;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zv8 {
    private final WeakHashMap a = new WeakHashMap();

    public final URLSpan a(zy8 zy8Var) {
        WeakHashMap weakHashMap = this.a;
        Object obj = weakHashMap.get(zy8Var);
        if (obj == null) {
            obj = new URLSpan(zy8Var.a());
            weakHashMap.put(zy8Var, obj);
        }
        return (URLSpan) obj;
    }
}
