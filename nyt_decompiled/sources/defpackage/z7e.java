package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class z7e {
    private final odd a;
    private final String b;
    private final String c;
    private final String d;
    private final Context e;
    private final h1e f;
    private final l1e g;
    private final Clock h;
    private final gfa i;

    public z7e(odd oddVar, zzcei zzceiVar, String str, String str2, Context context, h1e h1eVar, l1e l1eVar, Clock clock, gfa gfaVar) {
        this.a = oddVar;
        this.b = zzceiVar.zza;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = h1eVar;
        this.g = l1eVar;
        this.h = clock;
        this.i = gfaVar;
    }

    public static final List f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(j((String) it2.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(j((String) it2.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List h(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(j((String) it2.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        return TextUtils.isEmpty(str) ? "" : egb.k() ? "fakeForAdDebugLog" : str;
    }

    private static String j(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List c(g1e g1eVar, v0e v0eVar, List list) {
        return d(g1eVar, v0eVar, false, "", "", list);
    }

    public final List d(g1e g1eVar, v0e v0eVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            boolean z2 = true;
            String j = j(j(j((String) it2.next(), "@gw_adlocid@", g1eVar.a.a.f), "@gw_adnetrefresh@", true != z ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), "@gw_sdkver@", this.b);
            if (v0eVar != null) {
                j = eeb.c(j(j(j(j, "@gw_qdata@", v0eVar.z), "@gw_adnetid@", v0eVar.y), "@gw_allocid@", v0eVar.x), this.e, v0eVar.X);
            }
            String j2 = j(j(j(j(j, "@gw_adnetstatus@", this.a.g()), "@gw_ttr@", Long.toString(this.a.a(), 10)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z3 = false;
            if (((Boolean) pla.c().a(mpa.p3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            } else if (isEmpty) {
                arrayList.add(j2);
            }
            if (this.i.f(Uri.parse(j2))) {
                Uri.Builder buildUpon = Uri.parse(j2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                j2 = buildUpon.build().toString();
            }
            arrayList.add(j2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[LOOP:0: B:10:0x005a->B:12:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(defpackage.v0e r10, java.util.List r11, defpackage.iab r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.h
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La9
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La9
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La9
            zoa r4 = defpackage.mpa.q3
            kpa r5 = defpackage.pla.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            l1e r4 = r9.g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfwz r4 = com.google.android.gms.internal.ads.zzfwz.c()
            goto L3c
        L32:
            h1e r4 = r4.a
        L34:
            com.google.android.gms.internal.ads.zzfwz r4 = com.google.android.gms.internal.ads.zzfwz.d(r4)
            goto L3c
        L39:
            h1e r4 = r9.f
            goto L34
        L3c:
            x7e r5 = new defpackage.gge() { // from class: x7e
                static {
                    /*
                        x7e r0 = new x7e
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:x7e) x7e.a x7e
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.x7e.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.x7e.<init>():void");
                }

                @Override // defpackage.gge
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        h1e r1 = (defpackage.h1e) r1
                        java.lang.String r0 = defpackage.z7e.a(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.x7e.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfwz r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            y7e r7 = new defpackage.gge() { // from class: y7e
                static {
                    /*
                        y7e r0 = new y7e
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:y7e) y7e.a y7e
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.y7e.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.y7e.<init>():void");
                }

                @Override // defpackage.gge
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        h1e r1 = (defpackage.h1e) r1
                        java.lang.String r0 = defpackage.z7e.b(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.y7e.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfwz r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L5a:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La8
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = j(r6, r7, r12)
            java.lang.String r7 = r9.b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = j(r6, r8, r7)
            android.content.Context r7 = r9.e
            boolean r8 = r10.X
            java.lang.String r6 = defpackage.eeb.c(r6, r7, r8)
            r0.add(r6)
            goto L5a
        La8:
            return r0
        La9:
            r9 = move-exception
            java.lang.String r10 = "Unable to determine award type and amount."
            defpackage.fgb.e(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7e.e(v0e, java.util.List, iab):java.util.List");
    }
}
