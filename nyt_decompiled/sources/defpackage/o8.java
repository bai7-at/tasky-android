package defpackage;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class o8 implements Function {
    private final List a;
    private final boolean b;

    public o8(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List apply(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add((re7) it2.next());
            i++;
            if (this.a.contains(Integer.valueOf(i))) {
                arrayList.add(new nk2(i * (-1), i2));
                i2++;
            }
        }
        if (this.b) {
            arrayList.add(new nk2(i * (-1), i2));
        }
        return arrayList;
    }
}
