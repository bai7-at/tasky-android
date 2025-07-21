package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public abstract class z54 implements SerialDescriptor {
    private final SerialDescriptor a;
    private final int b;

    public /* synthetic */ z54(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Integer l = h.l(str);
        if (l != null) {
            return l.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public hk7 d() {
        return a.b.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z54)) {
            return false;
        }
        z54 z54Var = (z54) obj;
        return zq3.c(this.a, z54Var.a) && zq3.c(i(), z54Var.i());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i) {
        if (i >= 0) {
            return i.l();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + i() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return SerialDescriptor.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        if (i >= 0) {
            return this.a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.a + ')';
    }

    private z54(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
        this.b = 1;
    }
}
