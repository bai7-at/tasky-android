package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import defpackage.ew4;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
abstract class dm9 {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static ew4 a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            a84.j("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static ew4 b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!bm9.f(newPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        ImmutableList x = ImmutableList.x();
        long j = -9223372036854775807L;
        do {
            newPullParser.next();
            if (bm9.f(newPullParser, "rdf:Description")) {
                if (!d(newPullParser)) {
                    return null;
                }
                j = e(newPullParser);
                x = c(newPullParser);
            } else if (bm9.f(newPullParser, "Container:Directory")) {
                x = f(newPullParser, "Container", "Item");
            } else if (bm9.f(newPullParser, "GContainer:Directory")) {
                x = f(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!bm9.d(newPullParser, "x:xmpmeta"));
        if (x.isEmpty()) {
            return null;
        }
        return new ew4(j, x);
    }

    private static ImmutableList c(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String a2 = bm9.a(xmlPullParser, str);
            if (a2 != null) {
                return ImmutableList.z(new ew4.a("image/jpeg", "Primary", 0L, 0L), new ew4.a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0L));
            }
        }
        return ImmutableList.x();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : a) {
            String a2 = bm9.a(xmlPullParser, str);
            if (a2 != null) {
                return Integer.parseInt(a2) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String a2 = bm9.a(xmlPullParser, str);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static ImmutableList f(XmlPullParser xmlPullParser, String str, String str2) {
        ImmutableList.a p = ImmutableList.p();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, str3)) {
                String a2 = bm9.a(xmlPullParser, str2 + ":Mime");
                String a3 = bm9.a(xmlPullParser, str2 + ":Semantic");
                String a4 = bm9.a(xmlPullParser, str2 + ":Length");
                String a5 = bm9.a(xmlPullParser, str2 + ":Padding");
                if (a2 == null || a3 == null) {
                    return ImmutableList.x();
                }
                p.a(new ew4.a(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!bm9.d(xmlPullParser, str4));
        return p.k();
    }
}
