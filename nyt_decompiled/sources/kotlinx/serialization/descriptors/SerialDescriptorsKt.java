package kotlinx.serialization.descriptors;

import defpackage.cl0;
import defpackage.hk7;
import defpackage.r26;
import defpackage.ss2;
import defpackage.w26;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.d;
import kotlin.text.h;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public abstract class SerialDescriptorsKt {
    public static final SerialDescriptor a(String str, r26 r26Var) {
        zq3.h(str, "serialName");
        zq3.h(r26Var, "kind");
        if (h.d0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return w26.a(str, r26Var);
    }

    public static final SerialDescriptor b(String str, SerialDescriptor[] serialDescriptorArr, ss2 ss2Var) {
        zq3.h(str, "serialName");
        zq3.h(serialDescriptorArr, "typeParameters");
        zq3.h(ss2Var, "builderAction");
        if (h.d0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        cl0 cl0Var = new cl0(str);
        ss2Var.invoke(cl0Var);
        return new SerialDescriptorImpl(str, a.C0501a.a, cl0Var.f().size(), d.C0(serialDescriptorArr), cl0Var);
    }

    public static /* synthetic */ SerialDescriptor c(String str, SerialDescriptor[] serialDescriptorArr, ss2 ss2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            ss2Var = new ss2() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildClassSerialDescriptor$1
                public final void b(cl0 cl0Var) {
                    zq3.h(cl0Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((cl0) obj2);
                    return ww8.a;
                }
            };
        }
        return b(str, serialDescriptorArr, ss2Var);
    }

    public static final SerialDescriptor d(String str, hk7 hk7Var, SerialDescriptor[] serialDescriptorArr, ss2 ss2Var) {
        zq3.h(str, "serialName");
        zq3.h(hk7Var, "kind");
        zq3.h(serialDescriptorArr, "typeParameters");
        zq3.h(ss2Var, "builder");
        if (h.d0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (zq3.c(hk7Var, a.C0501a.a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        cl0 cl0Var = new cl0(str);
        ss2Var.invoke(cl0Var);
        return new SerialDescriptorImpl(str, hk7Var, cl0Var.f().size(), d.C0(serialDescriptorArr), cl0Var);
    }

    public static /* synthetic */ SerialDescriptor e(String str, hk7 hk7Var, SerialDescriptor[] serialDescriptorArr, ss2 ss2Var, int i, Object obj) {
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                public final void b(cl0 cl0Var) {
                    zq3.h(cl0Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((cl0) obj2);
                    return ww8.a;
                }
            };
        }
        return d(str, hk7Var, serialDescriptorArr, ss2Var);
    }
}
