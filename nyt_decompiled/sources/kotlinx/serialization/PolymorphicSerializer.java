package kotlinx.serialization;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c04;
import defpackage.cl0;
import defpackage.he0;
import defpackage.hk7;
import defpackage.hz5;
import defpackage.jx0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t1;
import defpackage.vu3;
import defpackage.ww8;
import defpackage.z38;
import defpackage.zq3;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* loaded from: classes5.dex */
public final class PolymorphicSerializer extends t1 {
    private final vu3 a;
    private List b;
    private final c04 c;

    public PolymorphicSerializer(vu3 vu3Var) {
        zq3.h(vu3Var, "baseClass");
        this.a = vu3Var;
        this.b = i.l();
        this.c = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialDescriptor mo865invoke() {
                final PolymorphicSerializer polymorphicSerializer = PolymorphicSerializer.this;
                return jx0.c(SerialDescriptorsKt.d("kotlinx.serialization.Polymorphic", hz5.a.a, new SerialDescriptor[0], new ss2() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2.1
                    {
                        super(1);
                    }

                    public final void b(cl0 cl0Var) {
                        List list;
                        zq3.h(cl0Var, "$this$buildSerialDescriptor");
                        cl0.b(cl0Var, TransferTable.COLUMN_TYPE, he0.D(z38.a).getDescriptor(), null, false, 12, null);
                        cl0.b(cl0Var, "value", SerialDescriptorsKt.e("kotlinx.serialization.Polymorphic<" + PolymorphicSerializer.this.e().d() + '>', hk7.a.a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
                        list = PolymorphicSerializer.this.b;
                        cl0Var.h(list);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((cl0) obj);
                        return ww8.a;
                    }
                }), PolymorphicSerializer.this.e());
            }
        });
    }

    @Override // defpackage.t1
    public vu3 e() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer(vu3 vu3Var, Annotation[] annotationArr) {
        this(vu3Var);
        zq3.h(vu3Var, "baseClass");
        zq3.h(annotationArr, "classAnnotations");
        this.b = d.e(annotationArr);
    }
}
