package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class j0 implements x0 {
    private static final n0 b = new h0();
    private final n0 a;

    public j0() {
        n0 n0Var;
        x a = x.a();
        try {
            n0Var = (n0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n0Var = b;
        }
        i0 i0Var = new i0(a, n0Var);
        byte[] bArr = b0.d;
        this.a = i0Var;
    }

    private static boolean a(m0 m0Var) {
        return m0Var.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final w0 zza(Class cls) {
        y0.c(cls);
        m0 zzb = this.a.zzb(cls);
        return zzb.zzb() ? z.class.isAssignableFrom(cls) ? q0.e(y0.V(), u.b(), zzb.zza()) : q0.e(y0.U(), u.a(), zzb.zza()) : z.class.isAssignableFrom(cls) ? a(zzb) ? p0.C(cls, zzb, s0.b(), f0.d(), y0.V(), u.b(), l0.b()) : p0.C(cls, zzb, s0.b(), f0.d(), y0.V(), null, l0.b()) : a(zzb) ? p0.C(cls, zzb, s0.a(), f0.c(), y0.U(), u.a(), l0.a()) : p0.C(cls, zzb, s0.a(), f0.c(), y0.U(), null, l0.a());
    }
}
