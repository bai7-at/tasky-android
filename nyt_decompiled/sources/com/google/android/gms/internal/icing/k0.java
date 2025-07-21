package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
final class k0 implements z0 {
    private static final o0 b = new i0();
    private final o0 a;

    public k0() {
        o0 o0Var;
        x a = x.a();
        try {
            o0Var = (o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = b;
        }
        j0 j0Var = new j0(a, o0Var);
        b0.b(j0Var, "messageInfoFactory");
        this.a = j0Var;
    }

    private static boolean a(n0 n0Var) {
        return n0Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.icing.z0
    public final y0 zza(Class cls) {
        a1.A(cls);
        n0 zzc = this.a.zzc(cls);
        return zzc.zza() ? z.class.isAssignableFrom(cls) ? r0.f(a1.c(), v.a(), zzc.zzb()) : r0.f(a1.a(), v.b(), zzc.zzb()) : z.class.isAssignableFrom(cls) ? a(zzc) ? q0.n(cls, zzc, t0.b(), g0.d(), a1.c(), v.a(), m0.b()) : q0.n(cls, zzc, t0.b(), g0.d(), a1.c(), null, m0.b()) : a(zzc) ? q0.n(cls, zzc, t0.a(), g0.c(), a1.a(), v.b(), m0.a()) : q0.n(cls, zzc, t0.a(), g0.c(), a1.b(), null, m0.a());
    }
}
