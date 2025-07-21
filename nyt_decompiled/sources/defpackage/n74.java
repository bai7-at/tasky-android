package defpackage;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class n74 {
    public static final n74 a = new n74();

    private n74() {
    }

    public final Object a(l74 l74Var) {
        ArrayList arrayList = new ArrayList(i.w(l74Var, 10));
        Iterator<E> it2 = l74Var.iterator();
        while (it2.hasNext()) {
            arrayList.add(k74.a((i74) it2.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(mg mgVar, l74 l74Var) {
        ArrayList arrayList = new ArrayList(i.w(l74Var, 10));
        Iterator<E> it2 = l74Var.iterator();
        while (it2.hasNext()) {
            arrayList.add(k74.a((i74) it2.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        mgVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
