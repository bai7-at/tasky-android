package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
final class z6a implements p4a {
    private final List a;
    private final long[] b;
    private final long[] c;

    public z6a(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            o6a o6aVar = (o6a) list.get(i);
            long[] jArr = this.b;
            int i2 = i + i;
            jArr[i2] = o6aVar.b;
            jArr[i2 + 1] = o6aVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.p4a
    public final List a(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                o6a o6aVar = (o6a) this.a.get(i);
                e2d e2dVar = o6aVar.a;
                if (e2dVar.e == -3.4028235E38f) {
                    arrayList2.add(o6aVar);
                } else {
                    arrayList.add(e2dVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: y6a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((o6a) obj).b, ((o6a) obj2).b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzc b = ((o6a) arrayList2.get(i3)).a.b();
            b.e((-1) - i3, 1);
            arrayList.add(b.p());
        }
        return arrayList;
    }

    @Override // defpackage.p4a
    public final int zza() {
        return this.c.length;
    }

    @Override // defpackage.p4a
    public final long zzb(int i) {
        wad.d(i >= 0);
        wad.d(i < this.c.length);
        return this.c[i];
    }
}
