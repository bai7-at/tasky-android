package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
final class ws9 implements cy0 {
    final /* synthetic */ Collection a;

    ws9(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.cy0
    public final /* bridge */ /* synthetic */ Object then(og8 og8Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return vg8.e(arrayList);
    }
}
