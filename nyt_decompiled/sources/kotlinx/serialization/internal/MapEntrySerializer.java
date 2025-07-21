package kotlinx.serialization.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.cl0;
import defpackage.lw3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public final class MapEntrySerializer extends lw3 {
    private final SerialDescriptor c;

    private static final class a implements Map.Entry, yu3 {
        private final Object a;
        private final Object b;

        public a(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.a;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.b;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.a + ", value=" + this.b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(final KSerializer kSerializer, final KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, null);
        zq3.h(kSerializer, "keySerializer");
        zq3.h(kSerializer2, "valueSerializer");
        this.c = SerialDescriptorsKt.d("kotlin.collections.Map.Entry", a.c.a, new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(cl0 cl0Var) {
                zq3.h(cl0Var, "$this$buildSerialDescriptor");
                cl0.b(cl0Var, TransferTable.COLUMN_KEY, KSerializer.this.getDescriptor(), null, false, 12, null);
                cl0.b(cl0Var, "value", kSerializer2.getDescriptor(), null, false, 12, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((cl0) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lw3
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        zq3.h(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lw3
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(Map.Entry entry) {
        zq3.h(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lw3
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
