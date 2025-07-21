package defpackage;

import coil.decode.ExifOrientationPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class rg3 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final ExifOrientationPolicy e;

    public rg3(boolean z, boolean z2, boolean z3, int i, ExifOrientationPolicy exifOrientationPolicy) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = exifOrientationPolicy;
    }

    public final boolean a() {
        return this.a;
    }

    public final ExifOrientationPolicy b() {
        return this.e;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public /* synthetic */ rg3(boolean z, boolean z2, boolean z3, int i, ExifOrientationPolicy exifOrientationPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }
}
