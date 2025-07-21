package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.uh5;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class qr4 {
    private final yc8 a;

    public qr4(yc8 yc8Var) {
        zq3.h(yc8Var, "supportedUnits");
        this.a = yc8Var;
    }

    public final List a(uh5.c cVar) {
        Message message;
        tq4 a;
        zq3.h(cVar, "data");
        uh5.e a2 = cVar.a();
        zq3.e(a2);
        List a3 = a2.a();
        ArrayList<uh5.f> arrayList = new ArrayList();
        for (Object obj : a3) {
            uh5.f fVar = (uh5.f) obj;
            if (fVar.a() && this.a.a().contains(fVar.c())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (uh5.f fVar2 : arrayList) {
            List b = fVar2.b();
            ArrayList<uh5.d> arrayList3 = new ArrayList();
            for (Object obj2 : b) {
                if (((uh5.d) obj2).b()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (uh5.d dVar : arrayList3) {
                uh5.b c = dVar.c();
                if (c == null || (a = c.a()) == null) {
                    message = null;
                } else {
                    String d = dVar.d();
                    String a4 = dVar.a();
                    if (a4 == null) {
                        a4 = "";
                    }
                    message = rr4.d(a, d, a4, fVar2.c());
                }
                if (message != null) {
                    arrayList4.add(message);
                }
            }
            i.B(arrayList2, arrayList4);
        }
        return arrayList2;
    }
}
