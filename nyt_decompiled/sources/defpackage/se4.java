package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;

/* loaded from: classes5.dex */
public abstract class se4 extends b1 {
    private final KSerializer a;
    private final KSerializer b;

    public /* synthetic */ se4(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public abstract SerialDescriptor getDescriptor();

    public final KSerializer m() {
        return this.a;
    }

    public final KSerializer n() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(c cVar, Map map, int i, int i2) {
        zq3.h(cVar, "decoder");
        zq3.h(map, "builder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        ym3 t = uo6.t(uo6.u(0, i2 * 2), 2);
        int g = t.g();
        int j = t.j();
        int n = t.n();
        if ((n <= 0 || g > j) && (n >= 0 || j > g)) {
            return;
        }
        while (true) {
            h(cVar, i + g, map, false);
            if (g == j) {
                return;
            } else {
                g += n;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(c cVar, int i, Map map, boolean z) {
        int i2;
        zq3.h(cVar, "decoder");
        zq3.h(map, "builder");
        Object c = c.a.c(cVar, getDescriptor(), i, this.a, null, 8, null);
        if (z) {
            i2 = cVar.o(getDescriptor());
            if (i2 != i + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        map.put(c, (!map.containsKey(c) || (this.b.getDescriptor().d() instanceof r26)) ? c.a.c(cVar, getDescriptor(), i3, this.b, null, 8, null) : cVar.y(getDescriptor(), i3, this.b, t.j(map, c)));
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        int e = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        d h = encoder.h(descriptor, e);
        Iterator d = d(obj);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            h.z(getDescriptor(), i, m(), key);
            i += 2;
            h.z(getDescriptor(), i2, n(), value);
        }
        h.c(descriptor);
    }

    private se4(KSerializer kSerializer, KSerializer kSerializer2) {
        super(null);
        this.a = kSerializer;
        this.b = kSerializer2;
    }
}
