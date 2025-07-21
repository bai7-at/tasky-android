package kotlinx.serialization;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c04;
import defpackage.cl0;
import defpackage.he0;
import defpackage.hk7;
import defpackage.hz5;
import defpackage.nk7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t1;
import defpackage.v33;
import defpackage.vu3;
import defpackage.ww8;
import defpackage.ym1;
import defpackage.z38;
import defpackage.zq3;
import defpackage.zt6;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class SealedClassSerializer extends t1 {
    private final vu3 a;
    private List b;
    private final c04 c;
    private final Map d;
    private final Map e;

    public static final class a implements v33 {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // defpackage.v33
        public Object a(Object obj) {
            return ((KSerializer) ((Map.Entry) obj).getValue()).getDescriptor().i();
        }

        @Override // defpackage.v33
        public Iterator b() {
            return this.a.iterator();
        }
    }

    public SealedClassSerializer(final String str, vu3 vu3Var, vu3[] vu3VarArr, KSerializer[] kSerializerArr) {
        zq3.h(str, "serialName");
        zq3.h(vu3Var, "baseClass");
        zq3.h(vu3VarArr, "subclasses");
        zq3.h(kSerializerArr, "subclassSerializers");
        this.a = vu3Var;
        this.b = i.l();
        this.c = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialDescriptor mo865invoke() {
                final SealedClassSerializer sealedClassSerializer = this;
                return SerialDescriptorsKt.d(str, hz5.b.a, new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2.1
                    {
                        super(1);
                    }

                    public final void b(cl0 cl0Var) {
                        List list;
                        zq3.h(cl0Var, "$this$buildSerialDescriptor");
                        cl0.b(cl0Var, TransferTable.COLUMN_TYPE, he0.D(z38.a).getDescriptor(), null, false, 12, null);
                        final SealedClassSerializer sealedClassSerializer2 = SealedClassSerializer.this;
                        cl0.b(cl0Var, "value", SerialDescriptorsKt.d("kotlinx.serialization.Sealed<" + SealedClassSerializer.this.e().d() + '>', hk7.a.a, new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2$1$elementDescriptor$1
                            {
                                super(1);
                            }

                            public final void b(cl0 cl0Var2) {
                                Map map;
                                zq3.h(cl0Var2, "$this$buildSerialDescriptor");
                                map = SealedClassSerializer.this.e;
                                for (Map.Entry entry : map.entrySet()) {
                                    cl0.b(cl0Var2, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), null, false, 12, null);
                                }
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((cl0) obj);
                                return ww8.a;
                            }
                        }), null, false, 12, null);
                        list = SealedClassSerializer.this.b;
                        cl0Var.h(list);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((cl0) obj);
                        return ww8.a;
                    }
                });
            }
        });
        if (vu3VarArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + e().d() + " should be marked @Serializable");
        }
        Map t = t.t(d.H0(vu3VarArr, kSerializerArr));
        this.d = t;
        a aVar = new a(t.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = aVar.b();
        while (b.hasNext()) {
            Object next = b.next();
            Object a2 = aVar.a(next);
            Object obj = linkedHashMap.get(a2);
            if (obj == null) {
                linkedHashMap.containsKey(a2);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) a2;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(a2, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    @Override // defpackage.t1
    public ym1 c(kotlinx.serialization.encoding.c cVar, String str) {
        zq3.h(cVar, "decoder");
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.c(cVar, str);
    }

    @Override // defpackage.t1
    public nk7 d(Encoder encoder, Object obj) {
        zq3.h(encoder, "encoder");
        zq3.h(obj, "value");
        nk7 nk7Var = (KSerializer) this.d.get(zt6.b(obj.getClass()));
        if (nk7Var == null) {
            nk7Var = super.d(encoder, obj);
        }
        if (nk7Var != null) {
            return nk7Var;
        }
        return null;
    }

    @Override // defpackage.t1
    public vu3 e() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String str, vu3 vu3Var, vu3[] vu3VarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, vu3Var, vu3VarArr, kSerializerArr);
        zq3.h(str, "serialName");
        zq3.h(vu3Var, "baseClass");
        zq3.h(vu3VarArr, "subclasses");
        zq3.h(kSerializerArr, "subclassSerializers");
        zq3.h(annotationArr, "classAnnotations");
        this.b = d.e(annotationArr);
    }
}
