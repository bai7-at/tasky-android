package defpackage;

import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ymb extends a0 {
    private final wib a;
    private final boolean c;
    private final boolean d;
    private int e;
    private jrc f;
    private boolean g;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private xua n;
    private final Object b = new Object();
    private boolean h = true;

    public ymb(wib wibVar, float f, boolean z, boolean z2) {
        this.a = wibVar;
        this.i = f;
        this.c = z;
        this.d = z2;
    }

    private final void D6(final int i, final int i2, final boolean z, final boolean z2) {
        pgb.e.execute(new Runnable() { // from class: xmb
            @Override // java.lang.Runnable
            public final void run() {
                ymb.this.y6(i, i2, z, z2);
            }
        });
    }

    private final void E6(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        pgb.e.execute(new Runnable() { // from class: wmb
            @Override // java.lang.Runnable
            public final void run() {
                ymb.this.z6(hashMap);
            }
        });
    }

    public final void A6(zzfk zzfkVar) {
        Object obj = this.b;
        boolean z = zzfkVar.zza;
        boolean z2 = zzfkVar.zzb;
        boolean z3 = zzfkVar.zzc;
        synchronized (obj) {
            this.l = z2;
            this.m = z3;
        }
        E6("initialState", CollectionUtils.mapOf("muteStart", true != z ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "customControlsRequested", true != z2 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "clickToExpandRequested", true != z3 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
    }

    public final void B6(float f) {
        synchronized (this.b) {
            this.j = f;
        }
    }

    public final void C6(xua xuaVar) {
        synchronized (this.b) {
            this.n = xuaVar;
        }
    }

    @Override // defpackage.znc
    public final void W5(jrc jrcVar) {
        synchronized (this.b) {
            this.f = jrcVar;
        }
    }

    @Override // defpackage.znc
    public final void b0(boolean z) {
        E6(true != z ? "unmute" : "mute", null);
    }

    public final void c() {
        boolean z;
        int i;
        synchronized (this.b) {
            z = this.h;
            i = this.e;
            this.e = 3;
        }
        D6(i, 3, z, z);
    }

    public final void x6(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.b) {
            try {
                z2 = true;
                if (f2 == this.i && f3 == this.k) {
                    z2 = false;
                }
                this.i = f2;
                this.j = f;
                z3 = this.h;
                this.h = z;
                i2 = this.e;
                this.e = i;
                float f4 = this.k;
                this.k = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.a.h().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                xua xuaVar = this.n;
                if (xuaVar != null) {
                    xuaVar.zze();
                }
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
        D6(i2, i, z3, z);
    }

    final /* synthetic */ void y6(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        jrc jrcVar;
        jrc jrcVar2;
        jrc jrcVar3;
        synchronized (this.b) {
            try {
                boolean z5 = this.g;
                if (z5 || i2 != 1) {
                    i3 = i2;
                    z3 = false;
                } else {
                    i2 = 1;
                    i3 = 1;
                    z3 = true;
                }
                boolean z6 = i != i2;
                if (z6 && i3 == 1) {
                    z4 = true;
                    i3 = 1;
                } else {
                    z4 = false;
                }
                boolean z7 = z6 && i3 == 2;
                boolean z8 = z6 && i3 == 3;
                this.g = z5 || z3;
                if (z3) {
                    try {
                        jrc jrcVar4 = this.f;
                        if (jrcVar4 != null) {
                            jrcVar4.zzi();
                        }
                    } catch (RemoteException e) {
                        fgb.i("#007 Could not call remote method.", e);
                    }
                }
                if (z4 && (jrcVar3 = this.f) != null) {
                    jrcVar3.zzh();
                }
                if (z7 && (jrcVar2 = this.f) != null) {
                    jrcVar2.zzg();
                }
                if (z8) {
                    jrc jrcVar5 = this.f;
                    if (jrcVar5 != null) {
                        jrcVar5.zze();
                    }
                    this.a.l();
                }
                if (z != z2 && (jrcVar = this.f) != null) {
                    jrcVar.S(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void z6(Map map) {
        this.a.t("pubVideoCmd", map);
    }

    @Override // defpackage.znc
    public final float zze() {
        float f;
        synchronized (this.b) {
            f = this.k;
        }
        return f;
    }

    @Override // defpackage.znc
    public final float zzf() {
        float f;
        synchronized (this.b) {
            f = this.j;
        }
        return f;
    }

    @Override // defpackage.znc
    public final float zzg() {
        float f;
        synchronized (this.b) {
            f = this.i;
        }
        return f;
    }

    @Override // defpackage.znc
    public final int zzh() {
        int i;
        synchronized (this.b) {
            i = this.e;
        }
        return i;
    }

    @Override // defpackage.znc
    public final jrc zzi() {
        jrc jrcVar;
        synchronized (this.b) {
            jrcVar = this.f;
        }
        return jrcVar;
    }

    @Override // defpackage.znc
    public final void zzk() {
        E6("pause", null);
    }

    @Override // defpackage.znc
    public final void zzl() {
        E6("play", null);
    }

    @Override // defpackage.znc
    public final void zzn() {
        E6("stop", null);
    }

    @Override // defpackage.znc
    public final boolean zzo() {
        boolean z;
        Object obj = this.b;
        boolean zzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zzp) {
                try {
                    if (this.m && this.d) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // defpackage.znc
    public final boolean zzp() {
        boolean z;
        synchronized (this.b) {
            try {
                z = false;
                if (this.c && this.l) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.znc
    public final boolean zzq() {
        boolean z;
        synchronized (this.b) {
            z = this.h;
        }
        return z;
    }
}
