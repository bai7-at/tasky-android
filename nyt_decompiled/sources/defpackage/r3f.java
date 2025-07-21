package defpackage;

import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.na;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class r3f extends d9 {
    private final Map a;

    public r3f(Map map) {
        this.a = map;
    }

    @Override // defpackage.the
    protected final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.d9, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.i(obj);
    }

    @Override // com.google.android.gms.internal.ads.d9
    protected final Map d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.d9, java.util.Map
    public final Set entrySet() {
        return na.c(this.a.entrySet(), new uge() { // from class: s2f
            @Override // defpackage.uge
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.j(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.f();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return na.c(this.a.keySet(), new uge() { // from class: x2f
            @Override // defpackage.uge
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.d9, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
