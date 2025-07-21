package androidx.compose.ui.text;

import androidx.compose.ui.text.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            a.b bVar = (a.b) obj;
            if (b.l(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a.b bVar2 = (a.b) arrayList.get(i4);
            if (i > bVar2.f() || bVar2.d() > i2) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new a.b(bVar2.e(), bVar2.f() - i, bVar2.d() - i));
        }
        return arrayList2;
    }
}
