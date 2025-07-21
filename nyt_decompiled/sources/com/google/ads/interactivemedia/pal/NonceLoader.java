package com.google.ads.interactivemedia.pal;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.pal.a3;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzil;
import com.google.android.gms.internal.pal.zzjc;
import defpackage.cy0;
import defpackage.f0a;
import defpackage.ipa;
import defpackage.l7f;
import defpackage.o7f;
import defpackage.o9f;
import defpackage.og8;
import defpackage.ola;
import defpackage.q7f;
import defpackage.rna;
import defpackage.ue5;
import defpackage.vea;
import defpackage.vg8;
import defpackage.wm;
import defpackage.yfa;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes2.dex */
public final class NonceLoader {
    public static final /* synthetic */ int zza = 0;
    private static final Random zzb = new Random();
    private final Context zzc;
    private final f0a zzd;
    private final f0a zze;
    private final og8 zzf;
    private final vea zzg;
    private final ipa zzh;
    private final ipa zzi;
    private final ipa zzj;
    private final rna zzk;
    private final zzx zzl;
    private final long zzm;
    private long zzn;
    private final String zzo;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NonceLoader(final android.content.Context r13, com.google.ads.interactivemedia.pal.ConsentSettings r14) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.pal.NonceLoader.<init>(android.content.Context, com.google.ads.interactivemedia.pal.ConsentSettings):void");
    }

    static /* synthetic */ Map zzb(a3 a3Var, og8 og8Var, og8 og8Var2, og8 og8Var3, og8 og8Var4, og8 og8Var5) throws Exception {
        a3Var.b((Map) zze(og8Var).a(new o7f() { // from class: com.google.ads.interactivemedia.pal.zzaf
            @Override // defpackage.o7f
            public final Object zza(Object obj) {
                yfa yfaVar = (yfa) obj;
                int i = NonceLoader.zza;
                return zzjc.i(zzak.ADVERTISING_ID.zza(), yfaVar.a(), zzak.ID_TYPE.zza(), yfaVar.b(), zzak.LIMIT_AD_TRACKING.zza(), true != yfaVar.c() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            }
        }).c(zzjc.d()));
        a3Var.b(((Boolean) zze(og8Var).a(new o7f() { // from class: com.google.ads.interactivemedia.pal.zzab
            @Override // defpackage.o7f
            public final Object zza(Object obj) {
                yfa yfaVar = (yfa) obj;
                int i = NonceLoader.zza;
                boolean z = false;
                if (!yfaVar.c() && !l7f.a(yfaVar.a(), "00000000-0000-0000-0000-000000000000")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).c(Boolean.FALSE)).booleanValue() ? zzjc.d() : (zzjc) zze(og8Var2).a(new o7f() { // from class: com.google.ads.interactivemedia.pal.zzac
            @Override // defpackage.o7f
            public final Object zza(Object obj) {
                wm wmVar = (wm) obj;
                int i = NonceLoader.zza;
                return zzjc.h(zzak.PER_VENDOR_ID.zza(), wmVar.a(), zzak.PER_VENDOR_ID_SCOPE.zza(), String.valueOf(wmVar.b()));
            }
        }).c(zzjc.d()));
        a3Var.b((Map) zze(og8Var3).a(new o7f() { // from class: com.google.ads.interactivemedia.pal.zzag
            @Override // defpackage.o7f
            public final Object zza(Object obj) {
                int i = NonceLoader.zza;
                return zzjc.f(zzak.MOBILE_SPAM.zza(), (String) obj);
            }
        }).c(zzjc.d()));
        a3Var.b((Map) zze(og8Var4).a(new o7f() { // from class: com.google.ads.interactivemedia.pal.zzah
            @Override // defpackage.o7f
            public final Object zza(Object obj) {
                int i = NonceLoader.zza;
                return zzjc.f(zzak.ADS_IDENTITY_TOKEN.zza(), (String) obj);
            }
        }).c(zzjc.d()));
        return a3Var.c();
    }

    private static zzil zze(og8 og8Var) {
        return !og8Var.q() ? zzil.e() : (zzil) og8Var.m();
    }

    private static String zzf() {
        return Integer.toString(zzb.nextInt(Integer.MAX_VALUE));
    }

    private static String zzg(String str) {
        try {
            return URLEncoder.encode(str, Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            Log.e("NonceGenerator", "Failed to encode the input string.");
            return "";
        }
    }

    private static String zzh(Context context) {
        return "h.3.2.2/n.android.3.2.2/".concat(String.valueOf(context.getApplicationContext().getPackageName()));
    }

    public og8 loadNonceManager(final NonceRequest nonceRequest) {
        String str;
        if (nonceRequest == null) {
            this.zzl.zza(103);
            return vg8.d(NonceLoaderException.zzb(103));
        }
        final String zzf = zzf();
        final a3 a3Var = new a3();
        if (nonceRequest.zzi().length() <= 500) {
            a3Var.a(zzak.DESCRIPTION_URL.zza(), zzg(nonceRequest.zzi()));
        }
        if (nonceRequest.zzo().length() <= 200) {
            a3Var.a(zzak.PPID.zza(), zzg(nonceRequest.zzo()));
        }
        if (nonceRequest.zzl().length() > 0 && nonceRequest.zzl().length() <= 200) {
            a3Var.a(zzak.OMID_VERSION.zza(), zzg(nonceRequest.zzl()));
        }
        if (nonceRequest.zzm().length() <= 200) {
            a3Var.a(zzak.PLAYER_TYPE.zza(), zzg(nonceRequest.zzm()));
        }
        if (nonceRequest.zzn().length() <= 200) {
            a3Var.a(zzak.PLAYER_VERSION.zza(), zzg(nonceRequest.zzn()));
        }
        if (nonceRequest.zzj().length() == 0 || nonceRequest.zzj().length() > 200 || nonceRequest.zzk().length() == 0 || nonceRequest.zzk().length() > 200) {
            str = "";
        } else {
            str = nonceRequest.zzj() + "/" + nonceRequest.zzk();
        }
        a3Var.a(zzak.OMID_PARTNER.zza(), zzg(str));
        TreeSet treeSet = new TreeSet(nonceRequest.zzq());
        if (!str.isEmpty()) {
            treeSet.add(7);
        }
        String zza2 = zzak.API_FRAMEWORKS.zza();
        Iterator it2 = treeSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            q7f.b(sb, it2, ",");
            a3Var.a(zza2, sb.toString());
            Integer zzg = nonceRequest.zzg();
            if (zzg != null) {
                String zza3 = zzak.PLAYER_HEIGHT.zza();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzg);
                a3Var.a(zza3, sb2.toString());
            }
            Integer zzh = nonceRequest.zzh();
            if (zzh != null) {
                String zza4 = zzak.PLAYER_WIDTH.zza();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(zzh);
                a3Var.a(zza4, sb3.toString());
            }
            if (zzg != null && zzh != null) {
                a3Var.a(zzak.ORIENTATION.zza(), zzg.intValue() <= zzh.intValue() ? "l" : "p");
            }
            Boolean zzd = nonceRequest.zzd();
            if (zzd != null) {
                a3Var.a(zzak.PLAY_ACTIVATION.zza(), true != zzd.booleanValue() ? "click" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
            Boolean zzc = nonceRequest.zzc();
            String zza5 = zzak.WTA_SUPPORTED.zza();
            boolean booleanValue = zzc.booleanValue();
            String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            a3Var.a(zza5, true != booleanValue ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            Boolean zze = nonceRequest.zze();
            if (zze != null) {
                a3Var.a(zzak.PLAY_MUTED.zza(), true == zze.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            }
            Boolean zzb2 = nonceRequest.zzb();
            if (zzb2 != null) {
                String zza6 = zzak.CONTINUOUS_PLAYBACK.zza();
                if (true == zzb2.booleanValue()) {
                    str2 = "2";
                }
                a3Var.a(zza6, str2);
            }
            a3Var.a(zzak.SESSION_ID.zza(), nonceRequest.zzp());
            final a3 a3Var2 = new a3();
            a3Var2.a(zzak.PAL_VERSION.zza(), zzat.zza);
            a3Var2.a(zzak.SDK_VERSION.zza(), zzh(this.zzc));
            a3Var2.a(zzak.APP_NAME.zza(), this.zzc.getApplicationContext().getPackageName());
            a3Var2.a(zzak.PAGE_CORRELATOR.zza(), this.zzo);
            a3Var2.a(zzak.AD_SPAM_CAPABILITIES.zza(), "3");
            a3Var2.a(zzak.SPAM_CORRELATOR.zza(), zzf);
            final og8 b = this.zzi.b();
            final og8 b2 = this.zzj.b();
            final og8 b3 = this.zzg.b();
            final og8 b4 = this.zzh.b();
            final og8 h = vg8.i(b, b2, b3, b4).h(new cy0() { // from class: com.google.ads.interactivemedia.pal.zzae
                @Override // defpackage.cy0
                public final Object then(og8 og8Var) {
                    return NonceLoader.zzb(a3.this, b, b2, b3, b4, og8Var);
                }
            });
            PlatformSignalCollector zza7 = nonceRequest.zza();
            final og8 e = zza7 == null ? vg8.e(zzjc.d()) : zza7.collectSignals(this.zzc, Executors.newSingleThreadExecutor());
            final og8 b5 = this.zzk.b();
            final long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
            return vg8.i(h, b5, e).i(Executors.newSingleThreadExecutor(), new cy0() { // from class: com.google.ads.interactivemedia.pal.zzz
                @Override // defpackage.cy0
                public final Object then(og8 og8Var) {
                    return NonceLoader.this.zza(a3Var, h, e, b5, nonceRequest, zzf, currentTimeMillis, og8Var);
                }
            }).d(new ue5() { // from class: com.google.ads.interactivemedia.pal.zzaa
                @Override // defpackage.ue5
                public final void onFailure(Exception exc) {
                    NonceLoader.this.zzc(exc);
                }
            });
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public void release() {
        this.zzg.e();
        this.zzh.e();
        this.zzi.e();
        this.zzj.e();
        this.zzk.e();
    }

    final /* synthetic */ NonceManager zza(a3 a3Var, og8 og8Var, og8 og8Var2, og8 og8Var3, NonceRequest nonceRequest, String str, long j, og8 og8Var4) throws Exception {
        a3Var.b((Map) og8Var.m());
        if (og8Var2.q()) {
            a3Var.b((Map) og8Var2.m());
        }
        ola olaVar = (ola) ((zzil) og8Var3.m()).b();
        zzjc c = a3Var.c();
        StringBuilder sb = new StringBuilder();
        o9f g = c.entrySet().g();
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            if (entry.getValue() != null && ((String) entry.getValue()).length() != 0) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
        }
        String a = olaVar.a(sb.toString());
        Integer zzf = nonceRequest.zzf();
        if (zzf != null && a.length() > zzf.intValue()) {
            Log.e("NonceGenerator", "Nonce length limit crossed.");
            throw NonceLoaderException.zzb(104);
        }
        String zzh = zzh(this.zzc);
        String str2 = this.zzo;
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(zzh);
        zzeVar.zza(str2);
        zzax zzaxVar = new zzax(new zzs(zzeVar.zzd()), str);
        int length = a.length();
        zzh zzhVar = new zzh();
        zzagc zzagcVar = zzagc.a;
        zzhVar.zzc(zzagcVar);
        zzhVar.zzd(zzagc.a(j - this.zzm));
        zzhVar.zzb(zzagc.a(DefaultClock.getInstance().currentTimeMillis() - this.zzm));
        zzhVar.zzf(zzagcVar);
        zzhVar.zze(zzagc.a(this.zzn - this.zzm));
        zzhVar.zza(length);
        this.zzl.zzb(zzhVar.zzg());
        return new NonceManager(this.zzc, zzaj.zza(), Executors.newSingleThreadExecutor(), this.zzf, zzaxVar, a);
    }

    final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof NonceLoaderException) {
            this.zzl.zza(((NonceLoaderException) exc).zza());
        } else {
            this.zzl.zza(100);
        }
    }

    final /* synthetic */ void zzd(og8 og8Var) {
        this.zzn = DefaultClock.getInstance().currentTimeMillis();
    }
}
