package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableMap;
import defpackage.tr;
import defpackage.ur;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h {
    public final int a;
    public final int b;
    public final t0 c;
    public final ImmutableMap d;
    public final String e;

    public h(t0 t0Var, int i, int i2, Map map, String str) {
        this.a = i;
        this.b = i2;
        this.c = t0Var;
        this.d = ImmutableMap.f(map);
        this.e = str;
    }

    public static String a(String str) {
        String f = tr.f(str);
        f.hashCode();
        switch (f) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                return "audio/mp4a-latm";
            case "L8":
            case "L16":
                return "audio/raw";
            case "AC3":
                return "audio/ac3";
            case "AMR":
                return "audio/3gpp";
            case "VP8":
                return "video/x-vnd.on2.vp8";
            case "VP9":
                return "video/x-vnd.on2.vp9";
            case "H264":
                return "video/avc";
            case "H265":
                return "video/hevc";
            case "OPUS":
                return "audio/opus";
            case "PCMA":
                return "audio/g711-alaw";
            case "PCMU":
                return "audio/g711-mlaw";
            case "AMR-WB":
                return "audio/amr-wb";
            case "MP4V-ES":
                return "video/mp4v-es";
            case "H263-1998":
            case "H263-2000":
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        ur.a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    static boolean c(a aVar) {
        String f = tr.f(aVar.j.b);
        f.hashCode();
        switch (f) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "MP4A-LATM":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c.equals(hVar.c) && this.d.equals(hVar.d) && this.e.equals(hVar.e);
    }

    public int hashCode() {
        return ((((((((217 + this.a) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
