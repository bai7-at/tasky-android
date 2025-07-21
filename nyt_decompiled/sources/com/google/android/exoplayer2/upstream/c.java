package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.d;
import defpackage.a84;
import defpackage.sq8;
import defpackage.ur;
import defpackage.v91;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements com.google.android.exoplayer2.upstream.a {
    private final Context a;
    private final List b = new ArrayList();
    private final com.google.android.exoplayer2.upstream.a c;
    private com.google.android.exoplayer2.upstream.a d;
    private com.google.android.exoplayer2.upstream.a e;
    private com.google.android.exoplayer2.upstream.a f;
    private com.google.android.exoplayer2.upstream.a g;
    private com.google.android.exoplayer2.upstream.a h;
    private com.google.android.exoplayer2.upstream.a i;
    private com.google.android.exoplayer2.upstream.a j;
    private com.google.android.exoplayer2.upstream.a k;

    public static final class a implements a.InterfaceC0194a {
        private final Context a;
        private final a.InterfaceC0194a b;
        private sq8 c;

        public a(Context context) {
            this(context, new d.b());
        }

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0194a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            c cVar = new c(this.a, this.b.a());
            sq8 sq8Var = this.c;
            if (sq8Var != null) {
                cVar.i(sq8Var);
            }
            return cVar;
        }

        public a(Context context, a.InterfaceC0194a interfaceC0194a) {
            this.a = context.getApplicationContext();
            this.b = interfaceC0194a;
        }
    }

    public c(Context context, com.google.android.exoplayer2.upstream.a aVar) {
        this.a = context.getApplicationContext();
        this.c = (com.google.android.exoplayer2.upstream.a) ur.e(aVar);
    }

    private void k(com.google.android.exoplayer2.upstream.a aVar) {
        for (int i = 0; i < this.b.size(); i++) {
            aVar.i((sq8) this.b.get(i));
        }
    }

    private com.google.android.exoplayer2.upstream.a s() {
        if (this.e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.a);
            this.e = assetDataSource;
            k(assetDataSource);
        }
        return this.e;
    }

    private com.google.android.exoplayer2.upstream.a t() {
        if (this.f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.a);
            this.f = contentDataSource;
            k(contentDataSource);
        }
        return this.f;
    }

    private com.google.android.exoplayer2.upstream.a u() {
        if (this.i == null) {
            v91 v91Var = new v91();
            this.i = v91Var;
            k(v91Var);
        }
        return this.i;
    }

    private com.google.android.exoplayer2.upstream.a v() {
        if (this.d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.d = fileDataSource;
            k(fileDataSource);
        }
        return this.d;
    }

    private com.google.android.exoplayer2.upstream.a w() {
        if (this.j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.a);
            this.j = rawResourceDataSource;
            k(rawResourceDataSource);
        }
        return this.j;
    }

    private com.google.android.exoplayer2.upstream.a x() {
        if (this.g == null) {
            try {
                com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.g = aVar;
                k(aVar);
            } catch (ClassNotFoundException unused) {
                a84.j("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private com.google.android.exoplayer2.upstream.a y() {
        if (this.h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.h = udpDataSource;
            k(udpDataSource);
        }
        return this.h;
    }

    private void z(com.google.android.exoplayer2.upstream.a aVar, sq8 sq8Var) {
        if (aVar != null) {
            aVar.i(sq8Var);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) {
        ur.g(this.k == null);
        String scheme = bVar.a.getScheme();
        if (z19.y0(bVar.a)) {
            String path = bVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.k = v();
            } else {
                this.k = s();
            }
        } else if ("asset".equals(scheme)) {
            this.k = s();
        } else if ("content".equals(scheme)) {
            this.k = t();
        } else if ("rtmp".equals(scheme)) {
            this.k = x();
        } else if ("udp".equals(scheme)) {
            this.k = y();
        } else if ("data".equals(scheme)) {
            this.k = u();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.k = w();
        } else {
            this.k = this.c;
        }
        return this.k.b(bVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        com.google.android.exoplayer2.upstream.a aVar = this.k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map f() {
        com.google.android.exoplayer2.upstream.a aVar = this.k;
        return aVar == null ? Collections.emptyMap() : aVar.f();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        com.google.android.exoplayer2.upstream.a aVar = this.k;
        if (aVar == null) {
            return null;
        }
        return aVar.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void i(sq8 sq8Var) {
        ur.e(sq8Var);
        this.c.i(sq8Var);
        this.b.add(sq8Var);
        z(this.d, sq8Var);
        z(this.e, sq8Var);
        z(this.f, sq8Var);
        z(this.g, sq8Var);
        z(this.h, sq8Var);
        z(this.i, sq8Var);
        z(this.j, sq8Var);
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        return ((com.google.android.exoplayer2.upstream.a) ur.e(this.k)).read(bArr, i, i2);
    }
}
