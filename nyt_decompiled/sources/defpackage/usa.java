package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class usa extends lta {
    private final Drawable a;
    private final Uri b;
    private final double c;
    private final int d;
    private final int e;

    public usa(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.mta
    public final double zzb() {
        return this.c;
    }

    @Override // defpackage.mta
    public final int zzc() {
        return this.e;
    }

    @Override // defpackage.mta
    public final int zzd() {
        return this.d;
    }

    @Override // defpackage.mta
    public final Uri zze() {
        return this.b;
    }

    @Override // defpackage.mta
    public final ee3 zzf() {
        return fc5.l3(this.a);
    }
}
