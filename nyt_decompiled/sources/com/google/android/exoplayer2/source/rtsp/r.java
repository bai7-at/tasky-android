package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.d0;
import defpackage.j15;
import defpackage.ur;
import defpackage.wm0;
import defpackage.xo5;
import defpackage.z19;

/* loaded from: classes2.dex */
final class r {
    public final h a;
    public final Uri b;

    public r(m mVar, a aVar, Uri uri) {
        ur.b(aVar.i.containsKey("control"), "missing attribute control");
        this.a = b(aVar);
        this.b = a(mVar, uri, (String) z19.j((String) aVar.i.get("control")));
    }

    private static Uri a(m mVar, Uri uri, String str) {
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        if (!TextUtils.isEmpty(mVar.d("Content-Base"))) {
            uri = Uri.parse(mVar.d("Content-Base"));
        } else if (!TextUtils.isEmpty(mVar.d("Content-Location"))) {
            uri = Uri.parse(mVar.d("Content-Location"));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static h b(a aVar) {
        int i;
        char c;
        t0.b bVar = new t0.b();
        int i2 = aVar.e;
        if (i2 > 0) {
            bVar.I(i2);
        }
        a.c cVar = aVar.j;
        int i3 = cVar.a;
        String str = cVar.b;
        String a = h.a(str);
        bVar.g0(a);
        int i4 = aVar.j.c;
        if (AssetConstants.AUDIO_TYPE.equals(aVar.a)) {
            i = d(aVar.j.d, a);
            bVar.h0(i4).J(i);
        } else {
            i = -1;
        }
        ImmutableMap a2 = aVar.a();
        switch (a.hashCode()) {
            case -1664118616:
                if (a.equals("video/3gpp")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (a.equals("video/hevc")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (a.equals("audio/amr-wb")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (a.equals("audio/mp4a-latm")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (a.equals("audio/ac3")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (a.equals("audio/raw")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (a.equals("video/mp4v-es")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (a.equals("video/avc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (a.equals("audio/3gpp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (a.equals("audio/opus")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (a.equals("video/x-vnd.on2.vp8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (a.equals("video/x-vnd.on2.vp9")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (a.equals("audio/g711-alaw")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (a.equals("audio/g711-mlaw")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ur.a(i != -1);
                ur.b(!a2.isEmpty(), "missing attribute fmtp");
                if (str.equals("MP4A-LATM")) {
                    ur.b(a2.containsKey("cpresent") && ((String) a2.get("cpresent")).equals("0"), "Only supports cpresent=0 in AAC audio.");
                    String str2 = (String) a2.get("config");
                    ur.f(str2, "AAC audio stream must include config fmtp parameter");
                    ur.b(str2.length() % 2 == 0, "Malformat MPEG4 config: " + str2);
                    d0.b e = e(str2);
                    bVar.h0(e.a).J(e.b).K(e.c);
                }
                f(bVar, a2, str, i, i4);
                break;
            case 1:
            case 2:
                ur.b(i == 1, "Multi channel AMR is not currently supported.");
                ur.b(!a2.isEmpty(), "fmtp parameters must include octet-align.");
                ur.b(a2.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                ur.b(!a2.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                break;
            case 3:
                ur.a(i != -1);
                ur.b(i4 == 48000, "Invalid OPUS clock rate.");
                break;
            case 4:
                ur.a(!a2.isEmpty());
                i(bVar, a2);
                break;
            case 5:
                bVar.n0(352).S(288);
                break;
            case 6:
                ur.b(!a2.isEmpty(), "missing attribute fmtp");
                g(bVar, a2);
                break;
            case 7:
                ur.b(!a2.isEmpty(), "missing attribute fmtp");
                h(bVar, a2);
                break;
            case '\b':
                bVar.n0(320).S(240);
                break;
            case '\t':
                bVar.n0(320).S(240);
                break;
            case '\n':
                bVar.a0(h.b(str));
                break;
        }
        ur.a(i4 > 0);
        return new h(bVar.G(), i3, i4, a2, str);
    }

    private static byte[] c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = j15.a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    private static int d(int i, String str) {
        return i != -1 ? i : str.equals("audio/ac3") ? 6 : 1;
    }

    private static d0.b e(String str) {
        xo5 xo5Var = new xo5(z19.K(str));
        ur.b(xo5Var.h(1) == 0, "Only supports audio mux version 0.");
        ur.b(xo5Var.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        xo5Var.r(6);
        ur.b(xo5Var.h(4) == 0, "Only supports one program.");
        ur.b(xo5Var.h(3) == 0, "Only supports one numLayer.");
        try {
            return defpackage.d0.e(xo5Var, false);
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void f(t0.b bVar, ImmutableMap immutableMap, String str, int i, int i2) {
        String str2 = (String) immutableMap.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        ur.b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.K("mp4a.40." + str2);
        bVar.V(ImmutableList.y(defpackage.d0.a(i2, i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void g(t0.b bVar, ImmutableMap immutableMap) {
        ur.b(immutableMap.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] V0 = z19.V0((String) ur.e((String) immutableMap.get("sprop-parameter-sets")), ",");
        ur.b(V0.length == 2, "empty sprop value");
        ImmutableList z = ImmutableList.z(c(V0[0]), c(V0[1]));
        bVar.V(z);
        byte[] bArr = (byte[]) z.get(0);
        j15.c l = j15.l(bArr, j15.a.length, bArr.length);
        bVar.c0(l.h);
        bVar.S(l.g);
        bVar.n0(l.f);
        String str = (String) immutableMap.get("profile-level-id");
        if (str == null) {
            bVar.K(wm0.a(l.a, l.b, l.c));
            return;
        }
        bVar.K("avc1." + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void h(t0.b bVar, ImmutableMap immutableMap) {
        if (immutableMap.containsKey("sprop-max-don-diff")) {
            int parseInt = Integer.parseInt((String) ur.e((String) immutableMap.get("sprop-max-don-diff")));
            ur.b(parseInt == 0, "non-zero sprop-max-don-diff " + parseInt + " is not supported");
        }
        ur.b(immutableMap.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) ur.e((String) immutableMap.get("sprop-vps"));
        ur.b(immutableMap.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) ur.e((String) immutableMap.get("sprop-sps"));
        ur.b(immutableMap.containsKey("sprop-pps"), "missing sprop-pps parameter");
        ImmutableList A = ImmutableList.A(c(str), c(str2), c((String) ur.e((String) immutableMap.get("sprop-pps"))));
        bVar.V(A);
        byte[] bArr = (byte[]) A.get(1);
        j15.a h = j15.h(bArr, j15.a.length, bArr.length);
        bVar.c0(h.m);
        bVar.S(h.l).n0(h.k);
        bVar.K(wm0.c(h.a, h.b, h.c, h.d, h.h, h.i));
    }

    private static void i(t0.b bVar, ImmutableMap immutableMap) {
        String str = (String) immutableMap.get("config");
        if (str != null) {
            byte[] K = z19.K(str);
            bVar.V(ImmutableList.y(K));
            Pair f = wm0.f(K);
            bVar.n0(((Integer) f.first).intValue()).S(((Integer) f.second).intValue());
        } else {
            bVar.n0(352).S(288);
        }
        String str2 = (String) immutableMap.get("profile-level-id");
        StringBuilder sb = new StringBuilder();
        sb.append("mp4v.");
        if (str2 == null) {
            str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        sb.append(str2);
        bVar.K(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b);
    }

    public int hashCode() {
        return ((217 + this.a.hashCode()) * 31) + this.b.hashCode();
    }
}
