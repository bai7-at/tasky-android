package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class s26 implements SerialDescriptor {
    private final String a;
    private final r26 b;

    public s26(String str, r26 r26Var) {
        zq3.h(str, "serialName");
        zq3.h(r26Var, "kind");
        this.a = str;
        this.b = r26Var;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s26)) {
            return false;
        }
        s26 s26Var = (s26) obj;
        return zq3.c(i(), s26Var.i()) && zq3.c(d(), s26Var.d());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return SerialDescriptor.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        a();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return i().hashCode() + (d().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String i() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean j(int i) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public r26 d() {
        return this.b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + i() + ')';
    }
}
