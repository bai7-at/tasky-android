package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class rsa extends eta {
    private static final int i;
    static final int j;
    static final int k;
    private final String a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    static {
        int rgb = Color.rgb(12, 174, 206);
        i = rgb;
        j = Color.rgb(204, 204, 204);
        k = rgb;
    }

    public rsa(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.a = str;
        for (int i4 = 0; i4 < list.size(); i4++) {
            usa usaVar = (usa) list.get(i4);
            this.b.add(usaVar);
            this.c.add(usaVar);
        }
        this.d = num != null ? num.intValue() : j;
        this.e = num2 != null ? num2.intValue() : k;
        this.f = num3 != null ? num3.intValue() : 12;
        this.g = i2;
        this.h = i3;
    }

    public final int x6() {
        return this.f;
    }

    public final List y6() {
        return this.b;
    }

    public final int zzb() {
        return this.g;
    }

    public final int zzc() {
        return this.h;
    }

    public final int zzd() {
        return this.d;
    }

    public final int zze() {
        return this.e;
    }

    @Override // defpackage.fta
    public final String zzg() {
        return this.a;
    }

    @Override // defpackage.fta
    public final List zzh() {
        return this.c;
    }
}
