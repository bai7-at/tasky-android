package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final class yj3 extends PluginGeneratedSerialDescriptor {
    private final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj3(String str, jx2 jx2Var) {
        super(str, jx2Var, 1);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(jx2Var, "generatedSerializer");
        this.m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof yj3) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (zq3.c(i(), serialDescriptor.i())) {
                yj3 yj3Var = (yj3) obj;
                if (yj3Var.isInline() && Arrays.equals(p(), yj3Var.p()) && e() == serialDescriptor.e()) {
                    int e = e();
                    for (0; i < e; i + 1) {
                        i = (zq3.c(h(i).i(), serialDescriptor.h(i).i()) && zq3.c(h(i).d(), serialDescriptor.h(i).d())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.m;
    }
}
