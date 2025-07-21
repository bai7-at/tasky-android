package defpackage;

import com.google.android.gms.internal.ads.zzbcn;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes3.dex */
public final class l1f extends AbstractList {
    private final List a;
    private final k1f b;

    public l1f(List list, k1f k1fVar) {
        this.a = list;
        this.b = k1fVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzbcn zzb = zzbcn.zzb(((Integer) this.a.get(i)).intValue());
        return zzb == null ? zzbcn.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
