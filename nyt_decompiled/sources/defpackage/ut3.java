package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class ut3 extends JsonPrimitive {
    private final boolean a;
    private final SerialDescriptor b;
    private final String c;

    public /* synthetic */ ut3(Object obj, boolean z, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String a() {
        return this.c;
    }

    public final SerialDescriptor c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ut3.class != obj.getClass()) {
            return false;
        }
        ut3 ut3Var = (ut3) obj;
        return f() == ut3Var.f() && zq3.c(a(), ut3Var.a());
    }

    public boolean f() {
        return this.a;
    }

    public int hashCode() {
        return (Boolean.hashCode(f()) * 31) + a().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!f()) {
            return a();
        }
        StringBuilder sb = new StringBuilder();
        j48.c(sb, a());
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut3(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        super(null);
        zq3.h(obj, "body");
        this.a = z;
        this.b = serialDescriptor;
        this.c = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
