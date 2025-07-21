package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
final class nx0 implements SerialDescriptor {
    private final SerialDescriptor a;
    public final vu3 b;
    private final String c;

    public nx0(SerialDescriptor serialDescriptor, vu3 vu3Var) {
        zq3.h(serialDescriptor, "original");
        zq3.h(vu3Var, "kClass");
        this.a = serialDescriptor;
        this.b = vu3Var;
        this.c = serialDescriptor.i() + '<' + vu3Var.d() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return this.a.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public hk7 d() {
        return this.a.d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.a.e();
    }

    public boolean equals(Object obj) {
        nx0 nx0Var = obj instanceof nx0 ? (nx0) obj : null;
        return nx0Var != null && zq3.c(this.a, nx0Var.a) && zq3.c(nx0Var.b, this.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i) {
        return this.a.f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i) {
        return this.a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        return this.a.h(i);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String i() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean j(int i) {
        return this.a.j(i);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
