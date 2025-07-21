package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
final class n0 implements e1 {
    private static final s0 b = new l0();
    private final s0 a;

    public n0() {
        s0 s0Var;
        a0 a = a0.a();
        try {
            s0Var = (s0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            s0Var = b;
        }
        m0 m0Var = new m0(a, s0Var);
        f0.f(m0Var, "messageInfoFactory");
        this.a = m0Var;
    }

    private static boolean a(r0 r0Var) {
        return r0Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.pal.e1
    public final d1 zza(Class cls) {
        f1.g(cls);
        r0 zzb = this.a.zzb(cls);
        return zzb.zzb() ? c0.class.isAssignableFrom(cls) ? v0.d(f1.b(), x.b(), zzb.zza()) : v0.d(f1.b0(), x.a(), zzb.zza()) : c0.class.isAssignableFrom(cls) ? a(zzb) ? u0.D(cls, zzb, x0.b(), j0.e(), f1.b(), x.b(), q0.b()) : u0.D(cls, zzb, x0.b(), j0.e(), f1.b(), null, q0.b()) : a(zzb) ? u0.D(cls, zzb, x0.a(), j0.d(), f1.b0(), x.a(), q0.a()) : u0.D(cls, zzb, x0.a(), j0.d(), f1.a(), null, q0.a());
    }
}
