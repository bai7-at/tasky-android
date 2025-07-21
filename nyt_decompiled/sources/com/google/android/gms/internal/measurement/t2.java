package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class t2 implements i3 {
    private static final x2 b = new r2();
    private final x2 a;

    public t2() {
        x2 x2Var;
        h2 a = h2.a();
        try {
            x2Var = (x2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            x2Var = b;
        }
        s2 s2Var = new s2(a, x2Var);
        l2.f(s2Var, "messageInfoFactory");
        this.a = s2Var;
    }

    private static boolean a(w2 w2Var) {
        return w2Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.i3
    public final h3 zza(Class cls) {
        j3.g(cls);
        w2 zzb = this.a.zzb(cls);
        return zzb.zzb() ? j2.class.isAssignableFrom(cls) ? a3.e(j3.b(), f2.b(), zzb.zza()) : a3.e(j3.b0(), f2.a(), zzb.zza()) : j2.class.isAssignableFrom(cls) ? a(zzb) ? z2.A(cls, zzb, c3.b(), p2.d(), j3.b(), f2.b(), v2.b()) : z2.A(cls, zzb, c3.b(), p2.d(), j3.b(), null, v2.b()) : a(zzb) ? z2.A(cls, zzb, c3.a(), p2.c(), j3.b0(), f2.a(), v2.a()) : z2.A(cls, zzb, c3.a(), p2.c(), j3.a(), null, v2.a());
    }
}
