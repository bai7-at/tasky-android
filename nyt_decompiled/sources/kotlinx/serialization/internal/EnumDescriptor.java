package kotlinx.serialization.internal;

import com.facebook.AuthenticationTokenClaims;
import defpackage.c04;
import defpackage.cv5;
import defpackage.dk7;
import defpackage.hk7;
import defpackage.qs2;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    private final hk7 m;
    private final c04 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(final String str, final int i) {
        super(str, null, i, 2, null);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.m = hk7.b.a;
        this.n = kotlin.c.a(new qs2() { // from class: kotlinx.serialization.internal.EnumDescriptor$elementDescriptors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialDescriptor[] mo865invoke() {
                int i2 = i;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = SerialDescriptorsKt.e(str + '.' + this.f(i3), a.d.a, new SerialDescriptor[0], null, 8, null);
                }
                return serialDescriptorArr;
            }
        });
    }

    private final SerialDescriptor[] t() {
        return (SerialDescriptor[]) this.n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public hk7 d() {
        return this.m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.d() == hk7.b.a && zq3.c(i(), serialDescriptor.i()) && zq3.c(cv5.a(this), cv5.a(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        return t()[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int hashCode = i().hashCode();
        int i = 1;
        for (String str : dk7.b(this)) {
            int i2 = i * 31;
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return kotlin.collections.i.u0(dk7.b(this), ", ", i() + '(', ")", 0, null, null, 56, null);
    }
}
