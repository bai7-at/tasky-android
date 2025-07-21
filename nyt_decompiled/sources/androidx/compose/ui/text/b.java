package androidx.compose.ui.text;

import androidx.compose.ui.text.a;
import defpackage.no5;
import defpackage.uo6;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    private static final a a = new a("", null, null, 6, null);

    public static final boolean f(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    public static final a g() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(List list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            a.b bVar = (a.b) obj;
            if (l(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a.b bVar2 = (a.b) arrayList.get(i4);
            arrayList2.add(new a.b(bVar2.e(), Math.max(i, bVar2.f()) - i, Math.min(i2, bVar2.d()) - i, bVar2.g()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(a aVar, int i, int i2) {
        List b;
        if (i == i2 || (b = aVar.b()) == null) {
            return null;
        }
        if (i == 0 && i2 >= aVar.j().length()) {
            return b;
        }
        ArrayList arrayList = new ArrayList(b.size());
        int size = b.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = b.get(i3);
            a.b bVar = (a.b) obj;
            if (l(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a.b bVar2 = (a.b) arrayList.get(i4);
            arrayList2.add(new a.b(bVar2.e(), uo6.m(bVar2.f(), i, i2) - i, uo6.m(bVar2.d(), i, i2) - i, bVar2.g()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(a aVar, int i, int i2) {
        List e;
        if (i == i2 || (e = aVar.e()) == null) {
            return null;
        }
        if (i == 0 && i2 >= aVar.j().length()) {
            return e;
        }
        ArrayList arrayList = new ArrayList(e.size());
        int size = e.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = e.get(i3);
            a.b bVar = (a.b) obj;
            if (l(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a.b bVar2 = (a.b) arrayList.get(i4);
            arrayList2.add(new a.b(bVar2.e(), uo6.m(bVar2.f(), i, i2) - i, uo6.m(bVar2.d(), i, i2) - i));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(a aVar, int i, int i2) {
        List g;
        if (i == i2 || (g = aVar.g()) == null) {
            return null;
        }
        if (i == 0 && i2 >= aVar.j().length()) {
            return g;
        }
        ArrayList arrayList = new ArrayList(g.size());
        int size = g.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = g.get(i3);
            a.b bVar = (a.b) obj;
            if (l(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a.b bVar2 = (a.b) arrayList.get(i4);
            arrayList2.add(new a.b(bVar2.e(), uo6.m(bVar2.f(), i, i2) - i, uo6.m(bVar2.d(), i, i2) - i));
        }
        return arrayList2;
    }

    public static final boolean l(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || f(i, i2, i3, i4) || f(i3, i4, i, i2);
    }

    public static final List m(a aVar, no5 no5Var) {
        int length = aVar.j().length();
        List e = aVar.e();
        if (e == null) {
            e = kotlin.collections.i.l();
        }
        ArrayList arrayList = new ArrayList();
        int size = e.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            a.b bVar = (a.b) e.get(i);
            no5 no5Var2 = (no5) bVar.a();
            int b = bVar.b();
            int c = bVar.c();
            if (b != i2) {
                arrayList.add(new a.b(no5Var, i2, b));
            }
            arrayList.add(new a.b(no5Var.l(no5Var2), b, c));
            i++;
            i2 = c;
        }
        if (i2 != length) {
            arrayList.add(new a.b(no5Var, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new a.b(no5Var, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a n(a aVar, int i, int i2) {
        String str;
        if (i != i2) {
            str = aVar.j().substring(i, i2);
            zq3.g(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new a(str, k(aVar, i, i2), null, null, 12, null);
    }
}
