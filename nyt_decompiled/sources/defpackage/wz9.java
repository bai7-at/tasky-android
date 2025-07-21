package defpackage;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
abstract class wz9 {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rz9 a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz9.a(java.lang.String):rz9");
    }

    private static zzgaa b(XmlPullParser xmlPullParser, String str, String str2) {
        h9 h9Var = new h9();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (nhe.c(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String a2 = nhe.a(xmlPullParser, concat2);
                String a3 = nhe.a(xmlPullParser, concat3);
                String a4 = nhe.a(xmlPullParser, concat4);
                String a5 = nhe.a(xmlPullParser, concat5);
                if (a2 == null || a3 == null) {
                    return zzgaa.t();
                }
                h9Var.g(new pz9(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!nhe.b(xmlPullParser, str.concat(":Directory")));
        return h9Var.j();
    }
}
