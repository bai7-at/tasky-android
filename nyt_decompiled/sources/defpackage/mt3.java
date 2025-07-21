package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.text.s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.a;

/* loaded from: classes5.dex */
public final class mt3 extends a {
    private final g1 a;
    private final uk7 b;

    public mt3(g1 g1Var, at3 at3Var) {
        zq3.h(g1Var, "lexer");
        zq3.h(at3Var, "json");
        this.a = g1Var;
        this.b = at3Var.a();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public byte H() {
        g1 g1Var = this.a;
        String s = g1Var.s();
        try {
            return s.a(s);
        } catch (IllegalArgumentException unused) {
            g1.z(g1Var, "Failed to parse type 'UByte' for input '" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public uk7 a() {
        return this.b;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int i() {
        g1 g1Var = this.a;
        String s = g1Var.s();
        try {
            return s.d(s);
        } catch (IllegalArgumentException unused) {
            g1.z(g1Var, "Failed to parse type 'UInt' for input '" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public long m() {
        g1 g1Var = this.a;
        String s = g1Var.s();
        try {
            return s.g(s);
        } catch (IllegalArgumentException unused) {
            g1.z(g1Var, "Failed to parse type 'ULong' for input '" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public int o(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public short s() {
        g1 g1Var = this.a;
        String s = g1Var.s();
        try {
            return s.j(s);
        } catch (IllegalArgumentException unused) {
            g1.z(g1Var, "Failed to parse type 'UShort' for input '" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
