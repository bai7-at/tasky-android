package com.nytimes.android.growthui.common.theme;

import androidx.compose.runtime.CompositionLocalKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.m76;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.ro0;
import defpackage.w43;
import defpackage.wn0;
import defpackage.x43;

/* loaded from: classes4.dex */
public abstract class ColorsKt {
    private static final long a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final w43 q;
    private static final w43 r;
    private static final m76 s;

    static {
        ro0 g2;
        long d2 = wn0.d(4294506744L);
        a = d2;
        long d3 = wn0.d(4286359496L);
        b = d3;
        long d4 = wn0.d(4279374354L);
        c = d4;
        long d5 = wn0.d(4280953386L);
        d = d5;
        long d6 = wn0.d(4294506744L);
        e = d6;
        long d7 = wn0.d(4290493371L);
        f = d7;
        long d8 = wn0.d(4288124823L);
        g = d8;
        long d9 = wn0.d(4282532418L);
        h = d9;
        long d10 = wn0.d(4279374354L);
        i = d10;
        long d11 = wn0.d(4281493649L);
        j = d11;
        long d12 = wn0.d(4294967295L);
        k = d12;
        long d13 = wn0.d(4294967295L);
        l = d13;
        long d14 = wn0.d(4279374354L);
        m = d14;
        long d15 = wn0.d(4284111450L);
        n = d15;
        long d16 = wn0.d(4292861919L);
        o = d16;
        long d17 = wn0.d(4292861919L);
        p = d17;
        ro0 d18 = androidx.compose.material.ColorsKt.d(d2, d2, d3, d3, d4, d5, 0L, d2, d4, d6, d6, 0L, 2112, null);
        x43 x43Var = new x43(wn0.d(4282532418L), d7, wn0.d(4282532418L), wn0.d(4285690482L), null);
        x43 x43Var2 = new x43(d6, d14, d6, wn0.d(4285690482L), null);
        nn0.a aVar = nn0.b;
        q = new w43(d18, d4, d6, d7, x43Var, x43Var2, new x43(aVar.h(), aVar.a(), aVar.a(), 0L, 8, null), d2, d7, d7, d4, d8, d9, null);
        g2 = androidx.compose.material.ColorsKt.g((r43 & 1) != 0 ? wn0.d(4284612846L) : d10, (r43 & 2) != 0 ? wn0.d(4281794739L) : d10, (r43 & 4) != 0 ? wn0.d(4278442694L) : d11, (r43 & 8) != 0 ? wn0.d(4278290310L) : d11, (r43 & 16) != 0 ? nn0.b.h() : d12, (r43 & 32) != 0 ? nn0.b.h() : d13, (r43 & 64) != 0 ? wn0.d(4289724448L) : 0L, (r43 & 128) != 0 ? nn0.b.h() : d10, (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : d12, (r43 & 512) != 0 ? nn0.b.a() : d14, (r43 & 1024) != 0 ? nn0.b.a() : d14, (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.h() : 0L);
        r = new w43(g2, d12, d14, d15, new x43(wn0.d(4294243572L), d14, wn0.d(4294243572L), wn0.d(4288914339L), null), new x43(d4, d6, d4, wn0.d(4288914339L), null), new x43(aVar.h(), aVar.a(), aVar.a(), 0L, 8, null), d10, d15, d15, d7, d16, d17, null);
        s = CompositionLocalKt.e(new qs2() { // from class: com.nytimes.android.growthui.common.theme.ColorsKt$LocalGrowthUIColorPalette$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final w43 mo865invoke() {
                return ColorsKt.b();
            }
        });
    }

    public static final w43 a() {
        return q;
    }

    public static final w43 b() {
        return r;
    }

    public static final m76 c() {
        return s;
    }
}
