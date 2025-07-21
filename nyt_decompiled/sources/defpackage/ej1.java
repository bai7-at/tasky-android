package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes2.dex */
public final class ej1 {
    public a47 a(h hVar) {
        String str = (String) ur.e(hVar.c.l);
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return new t37(hVar);
            case "video/hevc":
                return new v37(hVar);
            case "audio/amr-wb":
            case "audio/3gpp":
                return new s37(hVar);
            case "audio/mp4a-latm":
                return hVar.e.equals("MP4A-LATM") ? new w37(hVar) : new q37(hVar);
            case "audio/ac3":
                return new r37(hVar);
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return new b47(hVar);
            case "video/mp4v-es":
                return new x37(hVar);
            case "video/avc":
                return new u37(hVar);
            case "audio/opus":
                return new y37(hVar);
            case "video/x-vnd.on2.vp8":
                return new e47(hVar);
            case "video/x-vnd.on2.vp9":
                return new f47(hVar);
            default:
                return null;
        }
    }
}
