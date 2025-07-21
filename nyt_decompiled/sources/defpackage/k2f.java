package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k2f implements kye {
    private final Context a;
    private final List b = new ArrayList();
    private final kye c;
    private kye d;
    private kye e;
    private kye f;
    private kye g;
    private kye h;
    private kye i;
    private kye j;
    private kye k;

    public k2f(Context context, kye kyeVar) {
        this.a = context.getApplicationContext();
        this.c = kyeVar;
    }

    private final kye k() {
        if (this.e == null) {
            pue pueVar = new pue(this.a);
            this.e = pueVar;
            l(pueVar);
        }
        return this.e;
    }

    private final void l(kye kyeVar) {
        for (int i = 0; i < this.b.size(); i++) {
            kyeVar.h((f6f) this.b.get(i));
        }
    }

    private static final void m(kye kyeVar, f6f f6fVar) {
        if (kyeVar != null) {
            kyeVar.h(f6fVar);
        }
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        kye kyeVar = this.k;
        kyeVar.getClass();
        return kyeVar.b(bArr, i, i2);
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        kye kyeVar;
        wad.f(this.k == null);
        String scheme = u1fVar.a.getScheme();
        Uri uri = u1fVar.a;
        int i = khe.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || TransferTable.COLUMN_FILE.equals(scheme2)) {
            String path = u1fVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    b5f b5fVar = new b5f();
                    this.d = b5fVar;
                    l(b5fVar);
                }
                this.k = this.d;
            } else {
                this.k = k();
            }
        } else if ("asset".equals(scheme)) {
            this.k = k();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                aye ayeVar = new aye(this.a);
                this.f = ayeVar;
                l(ayeVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    kye kyeVar2 = (kye) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = kyeVar2;
                    l(kyeVar2);
                } catch (ClassNotFoundException unused) {
                    ezd.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                a7f a7fVar = new a7f(2000);
                this.h = a7fVar;
                l(a7fVar);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                dye dyeVar = new dye();
                this.i = dyeVar;
                l(dyeVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    z5f z5fVar = new z5f(this.a);
                    this.j = z5fVar;
                    l(z5fVar);
                }
                kyeVar = this.j;
            } else {
                kyeVar = this.c;
            }
            this.k = kyeVar;
        }
        return this.k.e(u1fVar);
    }

    @Override // defpackage.kye
    public final void h(f6f f6fVar) {
        f6fVar.getClass();
        this.c.h(f6fVar);
        this.b.add(f6fVar);
        m(this.d, f6fVar);
        m(this.e, f6fVar);
        m(this.f, f6fVar);
        m(this.g, f6fVar);
        m(this.h, f6fVar);
        m(this.i, f6fVar);
        m(this.j, f6fVar);
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        kye kyeVar = this.k;
        if (kyeVar == null) {
            return null;
        }
        return kyeVar.zzc();
    }

    @Override // defpackage.kye
    public final void zzd() {
        kye kyeVar = this.k;
        if (kyeVar != null) {
            try {
                kyeVar.zzd();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.kye
    public final Map zze() {
        kye kyeVar = this.k;
        return kyeVar == null ? Collections.emptyMap() : kyeVar.zze();
    }
}
