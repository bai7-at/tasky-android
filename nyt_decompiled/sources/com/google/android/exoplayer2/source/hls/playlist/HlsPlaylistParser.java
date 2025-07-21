package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.amazonaws.event.ProgressEvent;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.i;
import com.google.common.collect.j;
import defpackage.a84;
import defpackage.e93;
import defpackage.ku4;
import defpackage.ur;
import defpackage.w76;
import defpackage.yy8;
import defpackage.z19;
import defpackage.zf0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class HlsPlaylistParser implements i.a {
    private final d a;
    private final c b;
    private static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern w = c("CAN-SKIP-DATERANGES");
    private static final Pattern x = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern y = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern B = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern H = c("CAN-BLOCK-RELOAD");
    private static final Pattern L = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern M = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern N = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern Q = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern S = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern X = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern Y = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern Z = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern e0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern f0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern g0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern h0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern i0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern j0 = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern k0 = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern l0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern m0 = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern n0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern o0 = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern p0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern q0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern r0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern s0 = c("AUTOSELECT");
    private static final Pattern t0 = c("DEFAULT");
    private static final Pattern u0 = c("FORCED");
    private static final Pattern v0 = c("INDEPENDENT");
    private static final Pattern w0 = c("GAP");
    private static final Pattern x0 = c("PRECISE");
    private static final Pattern y0 = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern z0 = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern A0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    private static class a {
        private final BufferedReader a;
        private final Queue b;
        private String c;

        public a(Queue queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) ur.e((String) this.b.poll());
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(d.n, null);
    }

    private static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String B(String str, Map map) {
        Matcher matcher = A0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z || !z19.x0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C = C(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (C != "#EXTM3U".charAt(i2)) {
                return false;
            }
            C = bufferedReader.read();
        }
        return z19.x0(C(bufferedReader, false, C));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData d(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            schemeDataArr2[i2] = schemeDataArr[i2].b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String e(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    private static d.b f(ArrayList arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            d.b bVar = (d.b) arrayList.get(i2);
            if (str.equals(bVar.d)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b g(ArrayList arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            d.b bVar = (d.b) arrayList.get(i2);
            if (str.equals(bVar.e)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b h(ArrayList arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            d.b bVar = (d.b) arrayList.get(i2);
            if (str.equals(bVar.c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static DrmInitData.SchemeData k(String str, String str2, Map map) {
        String u2 = u(str, i0, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z = z(str, j0, map);
            return new DrmInitData.SchemeData(zf0.d, "video/mp4", Base64.decode(z.substring(z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(zf0.d, "hls", z19.o0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(u2)) {
            return null;
        }
        String z2 = z(str, j0, map);
        byte[] decode = Base64.decode(z2.substring(z2.indexOf(44)), 0);
        UUID uuid = zf0.e;
        return new DrmInitData.SchemeData(uuid, "video/mp4", w76.a(uuid, decode));
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c o(d dVar, c cVar, a aVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        long j2;
        boolean z;
        int i2;
        c.b bVar;
        int i3;
        String v;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z2;
        Object obj;
        d dVar2 = dVar;
        c cVar2 = cVar;
        boolean z3 = dVar2.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        c.f fVar = new c.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z4 = false;
        String str3 = "";
        boolean z5 = z3;
        c.f fVar2 = fVar;
        int i4 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i6 = 0;
        boolean z10 = false;
        String str4 = str3;
        String str5 = null;
        long j7 = -9223372036854775807L;
        long j8 = 0;
        long j9 = 0;
        int i7 = 1;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        DrmInitData drmInitData = null;
        long j12 = 0;
        Object obj2 = null;
        long j13 = 0;
        long j14 = -1;
        String str6 = null;
        String str7 = null;
        long j15 = 0;
        long j16 = 0;
        c.d dVar3 = null;
        long j17 = 0;
        long j18 = 0;
        ArrayList arrayList7 = arrayList4;
        c.b bVar2 = null;
        while (aVar.a()) {
            String b = aVar.b();
            if (b.startsWith("#EXT")) {
                arrayList6.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z11 = z(b, t, hashMap);
                if ("VOD".equals(z11)) {
                    i4 = 1;
                } else if ("EVENT".equals(z11)) {
                    i4 = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z10 = true;
            } else if (b.startsWith("#EXT-X-START")) {
                j7 = (long) (j(b, X) * 1000000.0d);
                z6 = q(b, x0, z4);
            } else if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar2 = y(b);
            } else if (b.startsWith("#EXT-X-PART-INF")) {
                j11 = (long) (j(b, r) * 1000000.0d);
            } else if (b.startsWith("#EXT-X-MAP")) {
                String z12 = z(b, j0, hashMap);
                String v2 = v(b, Z, hashMap);
                if (v2 != null) {
                    String[] V0 = z19.V0(v2, "@");
                    j14 = Long.parseLong(V0[z4 ? 1 : 0]);
                    if (V0.length > 1) {
                        j12 = Long.parseLong(V0[1]);
                    }
                }
                if (j14 == -1) {
                    j12 = 0;
                }
                String str8 = str6;
                if (str5 != null && str8 == null) {
                    throw ParserException.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                dVar3 = new c.d(z12, j12, j14, str5, str8);
                if (j14 != -1) {
                    j12 += j14;
                }
                str6 = str8;
                j14 = -1;
            } else {
                String str9 = str6;
                if (b.startsWith("#EXT-X-TARGETDURATION")) {
                    j10 = 1000000 * m(b, m);
                } else {
                    if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j16 = n(b, L);
                        str6 = str9;
                        j9 = j16;
                    } else if (b.startsWith("#EXT-X-VERSION")) {
                        i7 = m(b, s);
                    } else {
                        if (b.startsWith("#EXT-X-DEFINE")) {
                            String v3 = v(b, z0, hashMap);
                            if (v3 != null) {
                                String str10 = (String) dVar2.l.get(v3);
                                if (str10 != null) {
                                    hashMap.put(v3, str10);
                                }
                            } else {
                                hashMap.put(z(b, o0, hashMap), z(b, y0, hashMap));
                            }
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            str2 = str7;
                            j2 = j16;
                            z = false;
                            i2 = i4;
                        } else if (b.startsWith("#EXTINF")) {
                            j17 = A(b, M);
                            str4 = u(b, N, str3, hashMap);
                        } else {
                            String str11 = str3;
                            if (b.startsWith("#EXT-X-SKIP")) {
                                int m2 = m(b, x);
                                ur.g(cVar2 != null && arrayList3.isEmpty());
                                int i8 = (int) (j9 - ((c) z19.j(cVar)).k);
                                int i9 = m2 + i8;
                                if (i8 < 0 || i9 > cVar2.r.size()) {
                                    throw new DeltaUpdateException();
                                }
                                str3 = str11;
                                String str12 = str9;
                                long j19 = j15;
                                while (i8 < i9) {
                                    c.d dVar4 = (c.d) cVar2.r.get(i8);
                                    ArrayList arrayList8 = arrayList7;
                                    ArrayList arrayList9 = arrayList6;
                                    if (j9 != cVar2.k) {
                                        dVar4 = dVar4.b(j19, (cVar2.j - i5) + dVar4.d);
                                    }
                                    arrayList3.add(dVar4);
                                    j19 += dVar4.c;
                                    long j20 = dVar4.j;
                                    if (j20 != -1) {
                                        i3 = i9;
                                        j12 = dVar4.i + j20;
                                    } else {
                                        i3 = i9;
                                    }
                                    int i10 = dVar4.d;
                                    c.d dVar5 = dVar4.b;
                                    DrmInitData drmInitData2 = dVar4.f;
                                    String str13 = dVar4.g;
                                    String str14 = dVar4.h;
                                    if (str14 == null || !str14.equals(Long.toHexString(j16))) {
                                        str12 = dVar4.h;
                                    }
                                    j16++;
                                    i8++;
                                    cVar2 = cVar;
                                    obj2 = drmInitData2;
                                    str5 = str13;
                                    j13 = j19;
                                    i9 = i3;
                                    i6 = i10;
                                    dVar3 = dVar5;
                                    arrayList7 = arrayList8;
                                    arrayList6 = arrayList9;
                                }
                                dVar2 = dVar;
                                cVar2 = cVar;
                                j15 = j19;
                                str6 = str12;
                            } else {
                                ArrayList arrayList10 = arrayList7;
                                arrayList2 = arrayList6;
                                str3 = str11;
                                if (b.startsWith("#EXT-X-KEY")) {
                                    String z13 = z(b, g0, hashMap);
                                    String u2 = u(b, h0, "identity", hashMap);
                                    if ("NONE".equals(z13)) {
                                        treeMap.clear();
                                        v = null;
                                        str5 = null;
                                    } else {
                                        v = v(b, k0, hashMap);
                                        if (!"identity".equals(u2)) {
                                            String str15 = str7;
                                            str7 = str15 == null ? l(z13) : str15;
                                            DrmInitData.SchemeData k2 = k(b, u2, hashMap);
                                            if (k2 != null) {
                                                treeMap.put(u2, k2);
                                                str5 = null;
                                            }
                                        } else if ("AES-128".equals(z13)) {
                                            str5 = z(b, j0, hashMap);
                                            dVar2 = dVar;
                                            cVar2 = cVar;
                                            str6 = v;
                                        }
                                        str5 = null;
                                        dVar2 = dVar;
                                        cVar2 = cVar;
                                        str6 = v;
                                    }
                                    obj2 = str5;
                                    dVar2 = dVar;
                                    cVar2 = cVar;
                                    str6 = v;
                                } else {
                                    String str16 = str7;
                                    if (b.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] V02 = z19.V0(z(b, Y, hashMap), "@");
                                        j14 = Long.parseLong(V02[0]);
                                        if (V02.length > 1) {
                                            j12 = Long.parseLong(V02[1]);
                                        }
                                    } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i5 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                        dVar2 = dVar;
                                        cVar2 = cVar;
                                        str7 = str16;
                                        str6 = str9;
                                        arrayList7 = arrayList10;
                                        arrayList6 = arrayList2;
                                        z4 = false;
                                        z7 = true;
                                    } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                        i6++;
                                    } else {
                                        if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j8 == 0) {
                                                j8 = z19.D0(z19.K0(b.substring(b.indexOf(58) + 1))) - j15;
                                            } else {
                                                i2 = i4;
                                                str2 = str16;
                                            }
                                        } else if (b.equals("#EXT-X-GAP")) {
                                            dVar2 = dVar;
                                            cVar2 = cVar;
                                            str7 = str16;
                                            str6 = str9;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z4 = false;
                                            z9 = true;
                                        } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            dVar2 = dVar;
                                            cVar2 = cVar;
                                            str7 = str16;
                                            str6 = str9;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z4 = false;
                                            z5 = true;
                                        } else if (b.equals("#EXT-X-ENDLIST")) {
                                            dVar2 = dVar;
                                            cVar2 = cVar;
                                            str7 = str16;
                                            str6 = str9;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z4 = false;
                                            z8 = true;
                                        } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            i2 = i4;
                                            str2 = str16;
                                            arrayList5.add(new c.C0188c(Uri.parse(yy8.d(str, z(b, j0, hashMap))), t(b, Q, -1L), s(b, S, -1)));
                                        } else {
                                            i2 = i4;
                                            str2 = str16;
                                            if (!b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j2 = j16;
                                                if (b.startsWith("#EXT-X-PART")) {
                                                    String e2 = e(j2, str5, str9);
                                                    String z14 = z(b, j0, hashMap);
                                                    long j21 = (long) (j(b, n) * 1000000.0d);
                                                    c.b bVar3 = bVar2;
                                                    boolean q = q(b, v0, false) | (z5 && arrayList10.isEmpty());
                                                    boolean q2 = q(b, w0, false);
                                                    String v4 = v(b, Z, hashMap);
                                                    if (v4 != null) {
                                                        String[] V03 = z19.V0(v4, "@");
                                                        j4 = Long.parseLong(V03[0]);
                                                        if (V03.length > 1) {
                                                            j18 = Long.parseLong(V03[1]);
                                                        }
                                                        j3 = -1;
                                                    } else {
                                                        j3 = -1;
                                                        j4 = -1;
                                                    }
                                                    if (j4 == j3) {
                                                        j18 = 0;
                                                    }
                                                    if (obj2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData3 = new DrmInitData(str2, schemeDataArr);
                                                        if (drmInitData == null) {
                                                            drmInitData = d(str2, schemeDataArr);
                                                        }
                                                        obj2 = drmInitData3;
                                                    }
                                                    arrayList10.add(new c.b(z14, dVar3, j21, i6, j13, obj2, str5, e2, j18, j4, q2, q, false));
                                                    j13 += j21;
                                                    if (j4 != j3) {
                                                        j18 += j4;
                                                    }
                                                    dVar2 = dVar;
                                                    cVar2 = cVar;
                                                    str6 = str9;
                                                    i4 = i2;
                                                    bVar2 = bVar3;
                                                    j16 = j2;
                                                    str7 = str2;
                                                    arrayList7 = arrayList10;
                                                    arrayList6 = arrayList2;
                                                } else {
                                                    bVar = bVar2;
                                                    arrayList = arrayList10;
                                                    if (b.startsWith("#")) {
                                                        z = false;
                                                        dVar2 = dVar;
                                                        str6 = str9;
                                                        i4 = i2;
                                                        bVar2 = bVar;
                                                        j16 = j2;
                                                        str7 = str2;
                                                        arrayList7 = arrayList;
                                                        arrayList6 = arrayList2;
                                                        z4 = z;
                                                        cVar2 = cVar;
                                                    } else {
                                                        String e3 = e(j2, str5, str9);
                                                        long j22 = j2 + 1;
                                                        String B2 = B(b, hashMap);
                                                        c.d dVar6 = (c.d) hashMap2.get(B2);
                                                        if (j14 == -1) {
                                                            j5 = 0;
                                                        } else {
                                                            if (z10 && dVar3 == null && dVar6 == null) {
                                                                dVar6 = new c.d(B2, 0L, j12, null, null);
                                                                hashMap2.put(B2, dVar6);
                                                            }
                                                            j5 = j12;
                                                        }
                                                        if (obj2 != null || treeMap.isEmpty()) {
                                                            j6 = j22;
                                                            z2 = false;
                                                            obj = obj2;
                                                        } else {
                                                            j6 = j22;
                                                            z2 = false;
                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            obj = new DrmInitData(str2, schemeDataArr2);
                                                            if (drmInitData == null) {
                                                                drmInitData = d(str2, schemeDataArr2);
                                                            }
                                                        }
                                                        arrayList3.add(new c.d(B2, dVar3 != null ? dVar3 : dVar6, str4, j17, i6, j15, obj, str5, e3, j5, j14, z9, arrayList));
                                                        j13 = j15 + j17;
                                                        arrayList7 = new ArrayList();
                                                        if (j14 != -1) {
                                                            j5 += j14;
                                                        }
                                                        j12 = j5;
                                                        dVar2 = dVar;
                                                        z9 = z2;
                                                        str6 = str9;
                                                        obj2 = obj;
                                                        str4 = str3;
                                                        j15 = j13;
                                                        i4 = i2;
                                                        bVar2 = bVar;
                                                        arrayList6 = arrayList2;
                                                        j14 = -1;
                                                        j17 = 0;
                                                        str7 = str2;
                                                        j16 = j6;
                                                        cVar2 = cVar;
                                                        z4 = z9;
                                                    }
                                                }
                                            } else if (bVar2 == null && "PART".equals(z(b, m0, hashMap))) {
                                                String z15 = z(b, j0, hashMap);
                                                long t2 = t(b, e0, -1L);
                                                long t3 = t(b, f0, -1L);
                                                long j23 = j16;
                                                String e4 = e(j23, str5, str9);
                                                if (obj2 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData4 = new DrmInitData(str2, schemeDataArr3);
                                                    if (drmInitData == null) {
                                                        drmInitData = d(str2, schemeDataArr3);
                                                    }
                                                    obj2 = drmInitData4;
                                                }
                                                if (t2 == -1 || t3 != -1) {
                                                    bVar2 = new c.b(z15, dVar3, 0L, i6, j13, obj2, str5, e4, t2 != -1 ? t2 : 0L, t3, false, false, true);
                                                }
                                                dVar2 = dVar;
                                                cVar2 = cVar;
                                                j16 = j23;
                                                str6 = str9;
                                                arrayList7 = arrayList10;
                                                i4 = i2;
                                                arrayList6 = arrayList2;
                                                str7 = str2;
                                            }
                                        }
                                        arrayList = arrayList10;
                                        j2 = j16;
                                        z = false;
                                    }
                                    dVar2 = dVar;
                                    cVar2 = cVar;
                                    str7 = str16;
                                    str6 = str9;
                                }
                                arrayList7 = arrayList10;
                                arrayList6 = arrayList2;
                            }
                        }
                        bVar = bVar2;
                        dVar2 = dVar;
                        str6 = str9;
                        i4 = i2;
                        bVar2 = bVar;
                        j16 = j2;
                        str7 = str2;
                        arrayList7 = arrayList;
                        arrayList6 = arrayList2;
                        z4 = z;
                        cVar2 = cVar;
                    }
                    z4 = false;
                }
                str6 = str9;
                z4 = false;
            }
        }
        int i11 = i4;
        c.b bVar4 = bVar2;
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList6;
        int i12 = z4 ? 1 : 0;
        HashMap hashMap3 = new HashMap();
        for (int i13 = i12; i13 < arrayList5.size(); i13++) {
            c.C0188c c0188c = (c.C0188c) arrayList5.get(i13);
            long j24 = c0188c.b;
            if (j24 == -1) {
                j24 = (j9 + arrayList3.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i14 = c0188c.c;
            if (i14 == -1 && j11 != -9223372036854775807L) {
                i14 = (arrayList11.isEmpty() ? ((c.d) j.e(arrayList3)).m : arrayList11).size() - 1;
            }
            Uri uri = c0188c.a;
            hashMap3.put(uri, new c.C0188c(uri, j24, i14));
        }
        if (bVar4 != null) {
            arrayList11.add(bVar4);
        }
        return new c(i11, str, arrayList12, j7, z6, j8, z7, i5, j9, i7, j10, j11, z5, z8, j8 != 0, drmInitData, arrayList3, arrayList11, fVar2, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x033e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    private static d p(a aVar, String str) {
        char c2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        int i2;
        String str4;
        int i3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i4;
        int i5;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Uri e2;
        HashMap hashMap;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!aVar.a()) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList19 = arrayList12;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList16;
                ArrayList arrayList24 = arrayList17;
                ArrayList arrayList25 = arrayList18;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i6 = 0;
                while (i6 < arrayList11.size()) {
                    d.b bVar = (d.b) arrayList11.get(i6);
                    if (hashSet.add(bVar.a)) {
                        ur.g(bVar.b.j == null);
                        i3 = 1;
                        arrayList26.add(bVar.a(bVar.b.c().Z(new Metadata(new HlsTrackMetadataEntry(null, null, (List) ur.e((ArrayList) hashMap4.get(bVar.a))))).G()));
                    } else {
                        i3 = 1;
                    }
                    i6 += i3;
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                t0 t0Var = null;
                int i7 = 0;
                while (i7 < arrayList23.size()) {
                    ArrayList arrayList28 = arrayList23;
                    String str7 = (String) arrayList28.get(i7);
                    String z3 = z(str7, p0, hashMap3);
                    String z4 = z(str7, o0, hashMap3);
                    t0.b X2 = new t0.b().U(z3 + ":" + z4).W(z4).M(str6).i0(x(str7)).e0(w(str7, hashMap3)).X(v(str7, n0, hashMap3));
                    String v = v(str7, j0, hashMap3);
                    Uri e3 = v == null ? uri : yy8.e(str, v);
                    String str8 = str6;
                    arrayList23 = arrayList28;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(z3, z4, Collections.emptyList()));
                    String z5 = z(str7, l0, hashMap3);
                    z5.hashCode();
                    switch (z5.hashCode()) {
                        case -959297733:
                            if (z5.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (z5.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (z5.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (z5.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            d.b g2 = g(arrayList11, z3);
                            if (g2 != null) {
                                String M2 = z19.M(g2.b.i, 3);
                                X2.K(M2);
                                str2 = ku4.g(M2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            X2.g0(str2).Z(metadata);
                            if (e3 != null) {
                                d.a aVar2 = new d.a(e3, X2.G(), z3, z4);
                                arrayList3 = arrayList21;
                                arrayList3.add(aVar2);
                            } else {
                                arrayList3 = arrayList21;
                                a84.j("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            i2 = 1;
                            break;
                        case 1:
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            String z6 = z(str7, r0, hashMap3);
                            if (z6.startsWith("CC")) {
                                parseInt = Integer.parseInt(z6.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z6.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            X2.g0(str3).H(parseInt);
                            arrayList27.add(X2.G());
                            arrayList3 = arrayList21;
                            i2 = 1;
                            break;
                        case 2:
                            arrayList2 = arrayList19;
                            d.b f2 = f(arrayList11, z3);
                            if (f2 != null) {
                                String M3 = z19.M(f2.b.i, 1);
                                X2.K(M3);
                                str4 = ku4.g(M3);
                            } else {
                                str4 = null;
                            }
                            String v2 = v(str7, i, hashMap3);
                            if (v2 != null) {
                                X2.J(Integer.parseInt(z19.W0(v2, "/")[0]));
                                if ("audio/eac3".equals(str4) && v2.endsWith("/JOC")) {
                                    X2.K("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            X2.g0(str4);
                            if (e3 == null) {
                                arrayList = arrayList20;
                                if (f2 != null) {
                                    t0Var = X2.G();
                                    arrayList3 = arrayList21;
                                    i2 = 1;
                                    break;
                                }
                            } else {
                                X2.Z(metadata);
                                arrayList = arrayList20;
                                arrayList.add(new d.a(e3, X2.G(), z3, z4));
                            }
                            arrayList3 = arrayList21;
                            i2 = 1;
                            break;
                        case 3:
                            d.b h2 = h(arrayList11, z3);
                            if (h2 != null) {
                                t0 t0Var2 = h2.b;
                                String M4 = z19.M(t0Var2.i, 2);
                                X2.K(M4).g0(ku4.g(M4)).n0(t0Var2.t).S(t0Var2.u).R(t0Var2.w);
                            }
                            if (e3 != null) {
                                X2.Z(metadata);
                                arrayList2 = arrayList19;
                                arrayList2.add(new d.a(e3, X2.G(), z3, z4));
                                arrayList3 = arrayList21;
                                arrayList = arrayList20;
                                i2 = 1;
                                break;
                            }
                        default:
                            arrayList3 = arrayList21;
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            i2 = 1;
                            break;
                    }
                    i7 += i2;
                    arrayList21 = arrayList3;
                    arrayList19 = arrayList2;
                    arrayList20 = arrayList;
                    str6 = str8;
                    uri = null;
                }
                return new d(str, arrayList25, arrayList26, arrayList19, arrayList20, arrayList21, arrayList22, t0Var, z2 ? Collections.emptyList() : arrayList27, z, hashMap3, arrayList24);
            }
            String b = aVar.b();
            if (b.startsWith("#EXT")) {
                arrayList18.add(b);
            }
            boolean startsWith = b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(z(b, o0, hashMap3), z(b, y0, hashMap3));
            } else {
                if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList5 = arrayList15;
                    arrayList10 = arrayList16;
                    arrayList4 = arrayList17;
                    arrayList6 = arrayList18;
                    z = true;
                } else if (b.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(b);
                } else if (b.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData k2 = k(b, u(b, h0, "identity", hashMap3), hashMap3);
                    if (k2 != null) {
                        arrayList17.add(new DrmInitData(l(z(b, g0, hashMap3)), k2));
                    }
                } else if (b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    z2 |= b.contains("CLOSED-CAPTIONS=NONE");
                    int i8 = startsWith ? Http2.INITIAL_MAX_FRAME_SIZE : 0;
                    int m2 = m(b, h);
                    arrayList4 = arrayList17;
                    arrayList5 = arrayList15;
                    int s2 = s(b, c, -1);
                    String v3 = v(b, j, hashMap3);
                    arrayList6 = arrayList18;
                    String v4 = v(b, k, hashMap3);
                    if (v4 != null) {
                        arrayList7 = arrayList14;
                        String[] V0 = z19.V0(v4, QueryKeys.SCROLL_POSITION_TOP);
                        i5 = Integer.parseInt(V0[0]);
                        i4 = Integer.parseInt(V0[1]);
                        if (i5 <= 0 || i4 <= 0) {
                            i4 = -1;
                            i5 = -1;
                        }
                        arrayList8 = arrayList13;
                    } else {
                        arrayList7 = arrayList14;
                        arrayList8 = arrayList13;
                        i4 = -1;
                        i5 = -1;
                    }
                    String v5 = v(b, l, hashMap3);
                    float parseFloat = v5 != null ? Float.parseFloat(v5) : -1.0f;
                    arrayList9 = arrayList12;
                    String v6 = v(b, d, hashMap3);
                    arrayList10 = arrayList16;
                    String v7 = v(b, e, hashMap3);
                    HashMap hashMap5 = hashMap2;
                    String v8 = v(b, f, hashMap3);
                    String v9 = v(b, g, hashMap3);
                    if (startsWith) {
                        e2 = yy8.e(str5, z(b, j0, hashMap3));
                    } else {
                        if (!aVar.a()) {
                            throw ParserException.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        e2 = yy8.e(str5, B(aVar.b(), hashMap3));
                    }
                    arrayList11.add(new d.b(e2, new t0.b().T(arrayList11.size()).M("application/x-mpegURL").K(v3).I(s2).b0(m2).n0(i5).S(i4).R(parseFloat).e0(i8).G(), v6, v7, v8, v9));
                    hashMap = hashMap5;
                    ArrayList arrayList29 = (ArrayList) hashMap.get(e2);
                    if (arrayList29 == null) {
                        arrayList29 = new ArrayList();
                        hashMap.put(e2, arrayList29);
                    }
                    arrayList29.add(new HlsTrackMetadataEntry.VariantInfo(s2, m2, v6, v7, v8, v9));
                }
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            }
            hashMap = hashMap2;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList5 = arrayList15;
            arrayList10 = arrayList16;
            arrayList4 = arrayList17;
            arrayList6 = arrayList18;
            hashMap2 = hashMap;
            arrayList17 = arrayList4;
            arrayList15 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
            str5 = str;
        }
    }

    private static boolean q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    private static double r(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) ur.e(matcher.group(1))) : d2;
    }

    private static int s(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) ur.e(matcher.group(1))) : i2;
    }

    private static long t(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) ur.e(matcher.group(1))) : j2;
    }

    private static String u(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) ur.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    private static String v(String str, Pattern pattern, Map map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map map) {
        String v = v(str, q0, map);
        if (TextUtils.isEmpty(v)) {
            return 0;
        }
        String[] V0 = z19.V0(v, ",");
        int i2 = z19.s(V0, "public.accessibility.describes-video") ? 512 : 0;
        if (z19.s(V0, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= ProgressEvent.PART_FAILED_EVENT_CODE;
        }
        if (z19.s(V0, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return z19.s(V0, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean q = q(str, t0, false);
        ?? r02 = q;
        if (q(str, u0, false)) {
            r02 = (q ? 1 : 0) | 2;
        }
        return q(str, s0, false) ? r02 | 4 : r02;
    }

    private static c.f y(String str) {
        double r2 = r(str, u, -9.223372036854776E18d);
        long j2 = r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r2 * 1000000.0d);
        boolean q = q(str, w, false);
        double r3 = r(str, y, -9.223372036854776E18d);
        long j3 = r3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r3 * 1000000.0d);
        double r4 = r(str, B, -9.223372036854776E18d);
        return new c.f(j2, q, j3, r4 != -9.223372036854776E18d ? (long) (r4 * 1000000.0d) : -9223372036854775807L, q(str, H, false));
    }

    private static String z(String str, Pattern pattern, Map map) {
        String v = v(str, pattern, map);
        if (v != null) {
            return v;
        }
        throw ParserException.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e93 a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw ParserException.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    z19.n(bufferedReader);
                    throw ParserException.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return p(new a(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return o(this.a, this.b, new a(arrayDeque, bufferedReader), uri.toString());
        } finally {
            z19.n(bufferedReader);
        }
    }

    public HlsPlaylistParser(d dVar, c cVar) {
        this.a = dVar;
        this.b = cVar;
    }
}
