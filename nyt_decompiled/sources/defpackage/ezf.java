package defpackage;

import com.google.android.gms.internal.ads.ho;

/* loaded from: classes3.dex */
public final class ezf implements r2g {
    protected final r2g[] a;

    public ezf(r2g[] r2gVarArr) {
        this.a = r2gVarArr;
    }

    @Override // defpackage.r2g
    public final boolean a(ho hoVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            long j = Long.MIN_VALUE;
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            r2g[] r2gVarArr = this.a;
            int length = r2gVarArr.length;
            int i = 0;
            z = false;
            while (i < length) {
                r2g r2gVar = r2gVarArr[i];
                long zzc2 = r2gVar.zzc();
                boolean z3 = zzc2 != j && zzc2 <= hoVar.a;
                if (zzc2 == zzc || z3) {
                    z |= r2gVar.a(hoVar);
                }
                i++;
                j = Long.MIN_VALUE;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.r2g
    public final void c(long j) {
        for (r2g r2gVar : this.a) {
            r2gVar.c(j);
        }
    }

    @Override // defpackage.r2g
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (r2g r2gVar : this.a) {
            long zzb = r2gVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.r2g
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (r2g r2gVar : this.a) {
            long zzc = r2gVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.r2g
    public final boolean zzp() {
        for (r2g r2gVar : this.a) {
            if (r2gVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
