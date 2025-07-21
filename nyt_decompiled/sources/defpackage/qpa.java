package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class qpa {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, cra.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, nra.a);
        c(arrayList, nra.b);
        c(arrayList, nra.c);
        c(arrayList, nra.d);
        c(arrayList, nra.e);
        c(arrayList, nra.u);
        c(arrayList, nra.f);
        c(arrayList, nra.m);
        c(arrayList, nra.n);
        c(arrayList, nra.o);
        c(arrayList, nra.p);
        c(arrayList, nra.q);
        c(arrayList, nra.r);
        c(arrayList, nra.s);
        c(arrayList, nra.t);
        c(arrayList, nra.g);
        c(arrayList, nra.h);
        c(arrayList, nra.i);
        c(arrayList, nra.j);
        c(arrayList, nra.k);
        c(arrayList, nra.l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, gsa.a);
        return arrayList;
    }

    private static void c(List list, cra craVar) {
        String str = (String) craVar.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
