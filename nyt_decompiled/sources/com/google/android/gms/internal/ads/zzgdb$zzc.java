package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgdb$zzc {
    static final zzgdb$zzc b = new zzgdb$zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgdb$zzc.1
        {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    });
    final Throwable a;

    zzgdb$zzc(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
