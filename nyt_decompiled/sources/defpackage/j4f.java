package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class j4f implements v3f {
    private static final v3f c = w3f.a(Collections.emptySet());
    private final List a;
    private final List b;

    /* synthetic */ j4f(List list, List list2, h4f h4fVar) {
        this.a = list;
        this.b = list2;
    }

    public static i4f a(int i, int i2) {
        return new i4f(i, i2, null);
    }

    @Override // defpackage.l4f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((e4f) this.b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = s3f.a(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((e4f) this.a.get(i2)).zzb();
            zzb.getClass();
            a.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                a.add(obj);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
