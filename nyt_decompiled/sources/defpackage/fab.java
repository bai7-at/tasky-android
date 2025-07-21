package defpackage;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class fab extends hab {
    private final String a;
    private final int b;

    public fab(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fab)) {
            fab fabVar = (fab) obj;
            if (Objects.equal(this.a, fabVar.a)) {
                if (Objects.equal(Integer.valueOf(this.b), Integer.valueOf(fabVar.b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.iab
    public final int zzb() {
        return this.b;
    }

    @Override // defpackage.iab
    public final String zzc() {
        return this.a;
    }
}
