package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.g;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class a implements com.google.android.exoplayer2.g {
    public static final a g = new e().a();
    private static final String h = z19.t0(0);
    private static final String i = z19.t0(1);
    private static final String j = z19.t0(2);
    private static final String k = z19.t0(3);
    private static final String l = z19.t0(4);
    public static final g.a m = new g.a() { // from class: aw
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            a d2;
            d2 = a.d(bundle);
            return d2;
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private d f;

    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    public static final class d {
        public final AudioAttributes a;

        private d(a aVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(aVar.a).setFlags(aVar.b).setUsage(aVar.c);
            int i = z19.a;
            if (i >= 29) {
                b.a(usage, aVar.d);
            }
            if (i >= 32) {
                c.a(usage, aVar.e);
            }
            this.a = usage.build();
        }
    }

    public static final class e {
        private int a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;
        private int e = 0;

        public a a() {
            return new a(this.a, this.b, this.c, this.d, this.e);
        }

        public e b(int i) {
            this.d = i;
            return this;
        }

        public e c(int i) {
            this.a = i;
            return this;
        }

        public e d(int i) {
            this.b = i;
            return this;
        }

        public e e(int i) {
            this.e = i;
            return this;
        }

        public e f(int i) {
            this.c = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a d(Bundle bundle) {
        e eVar = new e();
        String str = h;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = i;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = j;
        if (bundle.containsKey(str3)) {
            eVar.f(bundle.getInt(str3));
        }
        String str4 = k;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = l;
        if (bundle.containsKey(str5)) {
            eVar.e(bundle.getInt(str5));
        }
        return eVar.a();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }

    public d c() {
        if (this.f == null) {
            this.f = new d();
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
    }

    public int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    private a(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }
}
