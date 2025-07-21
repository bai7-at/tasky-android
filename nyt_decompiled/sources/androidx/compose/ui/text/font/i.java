package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.j;
import defpackage.du8;
import defpackage.fd4;
import defpackage.gs7;
import defpackage.hu5;
import defpackage.od8;
import defpackage.ss2;
import defpackage.uu8;
import defpackage.ww8;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes.dex */
public abstract class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair b(List list, uu8 uu8Var, AsyncTypefaceCache asyncTypefaceCache, hu5 hu5Var, ss2 ss2Var) {
        od8 od8Var;
        fd4 fd4Var;
        Object a;
        d dVar;
        gs7 gs7Var;
        od8 od8Var2;
        fd4 fd4Var2;
        Object b;
        d dVar2;
        gs7 gs7Var2;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            d dVar3 = (d) list.get(i);
            int b2 = dVar3.b();
            j.a aVar = j.a;
            if (j.e(b2, aVar.b())) {
                od8Var = asyncTypefaceCache.d;
                synchronized (od8Var) {
                    try {
                        AsyncTypefaceCache.b bVar = new AsyncTypefaceCache.b(dVar3, hu5Var.c());
                        fd4Var = asyncTypefaceCache.b;
                        AsyncTypefaceCache.a aVar2 = (AsyncTypefaceCache.a) fd4Var.d(bVar);
                        if (aVar2 == null) {
                            gs7Var = asyncTypefaceCache.c;
                            aVar2 = (AsyncTypefaceCache.a) gs7Var.b(bVar);
                        }
                        if (aVar2 != null) {
                            a = aVar2.g();
                            dVar = dVar3;
                        } else {
                            ww8 ww8Var = ww8.a;
                            try {
                                a = hu5Var.a(dVar3);
                                dVar = dVar3;
                                AsyncTypefaceCache.f(asyncTypefaceCache, dVar3, hu5Var, a, false, 8, null);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + dVar3, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a != null) {
                    return du8.a(list2, n.a(uu8Var.e(), a, dVar, uu8Var.f(), uu8Var.d()));
                }
                throw new IllegalStateException("Unable to load font " + dVar);
            }
            if (j.e(b2, aVar.c())) {
                od8Var2 = asyncTypefaceCache.d;
                synchronized (od8Var2) {
                    try {
                        AsyncTypefaceCache.b bVar2 = new AsyncTypefaceCache.b(dVar3, hu5Var.c());
                        fd4Var2 = asyncTypefaceCache.b;
                        AsyncTypefaceCache.a aVar3 = (AsyncTypefaceCache.a) fd4Var2.d(bVar2);
                        if (aVar3 == null) {
                            gs7Var2 = asyncTypefaceCache.c;
                            aVar3 = (AsyncTypefaceCache.a) gs7Var2.b(bVar2);
                        }
                        if (aVar3 != null) {
                            b = aVar3.g();
                            dVar2 = dVar3;
                        } else {
                            ww8 ww8Var2 = ww8.a;
                            try {
                                Result.a aVar4 = Result.a;
                                b = Result.b(hu5Var.a(dVar3));
                            } catch (Throwable th2) {
                                Result.a aVar5 = Result.a;
                                b = Result.b(kotlin.f.a(th2));
                            }
                            if (Result.g(b)) {
                                b = null;
                            }
                            dVar2 = dVar3;
                            AsyncTypefaceCache.f(asyncTypefaceCache, dVar3, hu5Var, b, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (b != null) {
                    return du8.a(list2, n.a(uu8Var.e(), b, dVar2, uu8Var.f(), uu8Var.d()));
                }
            } else {
                if (!j.e(b2, aVar.a())) {
                    throw new IllegalStateException("Unknown font type " + dVar3);
                }
                AsyncTypefaceCache.a d = asyncTypefaceCache.d(dVar3, hu5Var);
                if (d == null) {
                    if (list2 == null) {
                        list2 = kotlin.collections.i.r(dVar3);
                    } else {
                        list2.add(dVar3);
                    }
                } else if (!AsyncTypefaceCache.a.e(d.g()) && d.g() != null) {
                    return du8.a(list2, n.a(uu8Var.e(), d.g(), dVar3, uu8Var.f(), uu8Var.d()));
                }
            }
        }
        return du8.a(list2, ss2Var.invoke(uu8Var));
    }
}
