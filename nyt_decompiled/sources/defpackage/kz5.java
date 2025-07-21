package defpackage;

import defpackage.hk7;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public final class kz5 implements wk7 {
    private final boolean a;
    private final String b;

    public kz5(boolean z, String str) {
        zq3.h(str, "discriminator");
        this.a = z;
        this.b = str;
    }

    private final void d(SerialDescriptor serialDescriptor, vu3 vu3Var) {
        int e = serialDescriptor.e();
        for (int i = 0; i < e; i++) {
            String f = serialDescriptor.f(i);
            if (zq3.c(f, this.b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + vu3Var + " has property '" + f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(SerialDescriptor serialDescriptor, vu3 vu3Var) {
        hk7 d = serialDescriptor.d();
        if ((d instanceof hz5) || zq3.c(d, hk7.a.a)) {
            throw new IllegalArgumentException("Serializer for " + vu3Var.d() + " can't be registered as a subclass for polymorphic serialization because its kind " + d + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.a) {
            return;
        }
        if (zq3.c(d, a.b.a) || zq3.c(d, a.c.a) || (d instanceof r26) || (d instanceof hk7.b)) {
            throw new IllegalArgumentException("Serializer for " + vu3Var.d() + " of kind " + d + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // defpackage.wk7
    public void a(vu3 vu3Var, ss2 ss2Var) {
        zq3.h(vu3Var, "baseClass");
        zq3.h(ss2Var, "defaultSerializerProvider");
    }

    @Override // defpackage.wk7
    public void b(vu3 vu3Var, ss2 ss2Var) {
        zq3.h(vu3Var, "baseClass");
        zq3.h(ss2Var, "defaultDeserializerProvider");
    }

    @Override // defpackage.wk7
    public void c(vu3 vu3Var, vu3 vu3Var2, KSerializer kSerializer) {
        zq3.h(vu3Var, "baseClass");
        zq3.h(vu3Var2, "actualClass");
        zq3.h(kSerializer, "actualSerializer");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        e(descriptor, vu3Var2);
        if (this.a) {
            return;
        }
        d(descriptor, vu3Var2);
    }
}
