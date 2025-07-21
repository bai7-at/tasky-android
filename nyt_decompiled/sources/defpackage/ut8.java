package defpackage;

import android.text.Layout;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.nytimes.android.api.cms.AssetConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class ut8 extends rs7 {
    private static final Pattern p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern v = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b w = new b(30.0f, 1, 1);
    private static final a x = new a(32, 15);
    private final XmlPullParserFactory o;

    private static final class a {
        final int a;
        final int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private static final class b {
        final float a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    private static final class c {
        final int a;
        final int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public ut8() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static yt8 B(yt8 yt8Var) {
        return yt8Var == null ? new yt8() : yt8Var;
    }

    private static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals(AssetConstants.IMAGE_TYPE) || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment D(String str) {
        String e = tr.e(str);
        e.hashCode();
        switch (e) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a E(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = v.matcher(attributeValue);
        if (!matcher.matches()) {
            a84.j("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) ur.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) ur.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            a84.j("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void F(String str, yt8 yt8Var) {
        Matcher matcher;
        String str2;
        String[] V0 = z19.V0(str, "\\s+");
        if (V0.length == 1) {
            matcher = r.matcher(str);
        } else {
            if (V0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + V0.length + InstructionFileId.DOT);
            }
            matcher = r.matcher(V0[1]);
            a84.j("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) ur.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                yt8Var.z(3);
                break;
            case "em":
                yt8Var.z(2);
                break;
            case "px":
                yt8Var.z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        yt8Var.y(Float.parseFloat((String) ur.e(matcher.group(1))));
    }

    private static b G(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (z19.V0(attributeValue2, " ").length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        b bVar = w;
        int i = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f, i, i2);
    }

    private static Map H(XmlPullParser xmlPullParser, Map map, a aVar, c cVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "style")) {
                String a2 = bm9.a(xmlPullParser, "style");
                yt8 M = M(xmlPullParser, new yt8());
                if (a2 != null) {
                    for (String str : N(a2)) {
                        M.a((yt8) map.get(str));
                    }
                }
                String g = M.g();
                if (g != null) {
                    map.put(g, M);
                }
            } else if (bm9.f(xmlPullParser, "region")) {
                wt8 K = K(xmlPullParser, aVar, cVar);
                if (K != null) {
                    map2.put(K.a, K);
                }
            } else if (bm9.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!bm9.d(xmlPullParser, "head"));
        return map;
    }

    private static void I(XmlPullParser xmlPullParser, Map map) {
        String a2;
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, AssetConstants.IMAGE_TYPE) && (a2 = bm9.a(xmlPullParser, "id")) != null) {
                map.put(a2, xmlPullParser.nextText());
            }
        } while (!bm9.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static vt8 J(XmlPullParser xmlPullParser, vt8 vt8Var, Map map, b bVar) {
        long j;
        long j2;
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        yt8 M = M(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        String[] strArr = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
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
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = O(attributeValue, bVar);
                    break;
                case 2:
                    j4 = O(attributeValue, bVar);
                    break;
                case 3:
                    j3 = O(attributeValue, bVar);
                    break;
                case 4:
                    String[] N = N(attributeValue);
                    if (N.length > 0) {
                        strArr = N;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (vt8Var != null) {
            long j6 = vt8Var.d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (vt8Var != null) {
                long j8 = vt8Var.e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return vt8.c(xmlPullParser.getName(), j7, j2, M, strArr, str2, str, vt8Var);
        }
        j2 = j4;
        return vt8.c(xmlPullParser.getName(), j7, j2, M, strArr, str2, str, vt8Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ac, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.wt8 K(org.xmlpull.v1.XmlPullParser r18, ut8.a r19, ut8.c r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.K(org.xmlpull.v1.XmlPullParser, ut8$a, ut8$c):wt8");
    }

    private static float L(String str) {
        Matcher matcher = s.matcher(str);
        if (!matcher.matches()) {
            a84.j("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) ur.e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            a84.k("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static yt8 M(XmlPullParser xmlPullParser, yt8 yt8Var) {
        char c2;
        boolean z;
        boolean z2;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 14;
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
                    yt8Var = B(yt8Var).B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    yt8Var = B(yt8Var).x(attributeValue);
                    break;
                case 2:
                    yt8Var = B(yt8Var).H(D(attributeValue));
                    break;
                case 3:
                    String e = tr.e(attributeValue);
                    e.hashCode();
                    switch (e.hashCode()) {
                        case -1461280213:
                            if (e.equals("nounderline")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1026963764:
                            if (e.equals("underline")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 913457136:
                            if (e.equals("nolinethrough")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1679736913:
                            if (e.equals("linethrough")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            yt8Var = B(yt8Var).K(false);
                            break;
                        case true:
                            yt8Var = B(yt8Var).K(true);
                            break;
                        case true:
                            yt8Var = B(yt8Var).C(false);
                            break;
                        case true:
                            yt8Var = B(yt8Var).C(true);
                            break;
                    }
                case 4:
                    yt8Var = B(yt8Var).v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        yt8Var = B(yt8Var).A(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String e2 = tr.e(attributeValue);
                    e2.hashCode();
                    switch (e2.hashCode()) {
                        case -618561360:
                            if (e2.equals("baseContainer")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -410956671:
                            if (e2.equals("container")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -250518009:
                            if (e2.equals("delimiter")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -136074796:
                            if (e2.equals("textContainer")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3016401:
                            if (e2.equals("base")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3556653:
                            if (e2.equals("text")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                            yt8Var = B(yt8Var).F(2);
                            break;
                        case true:
                            yt8Var = B(yt8Var).F(1);
                            break;
                        case true:
                            yt8Var = B(yt8Var).F(4);
                            break;
                        case true:
                        case true:
                            yt8Var = B(yt8Var).F(3);
                            break;
                    }
                case 7:
                    yt8Var = B(yt8Var);
                    try {
                        yt8Var.w(bo0.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        a84.j("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    yt8Var = B(yt8Var).G(L(attributeValue));
                    break;
                case '\t':
                    String e3 = tr.e(attributeValue);
                    e3.hashCode();
                    if (e3.equals("all")) {
                        yt8Var = B(yt8Var).I(true);
                        break;
                    } else if (e3.equals("none")) {
                        yt8Var = B(yt8Var).I(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        yt8Var = B(yt8Var);
                        F(attributeValue, yt8Var);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        a84.j("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    yt8Var = B(yt8Var).J(ai8.a(attributeValue));
                    break;
                case '\f':
                    String e4 = tr.e(attributeValue);
                    e4.hashCode();
                    if (e4.equals("before")) {
                        yt8Var = B(yt8Var).E(1);
                        break;
                    } else if (e4.equals("after")) {
                        yt8Var = B(yt8Var).E(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    yt8Var = B(yt8Var);
                    try {
                        yt8Var.u(bo0.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        a84.j("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    yt8Var = B(yt8Var).D(D(attributeValue));
                    break;
            }
        }
        return yt8Var;
    }

    private static String[] N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : z19.V0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long O(java.lang.String r13, ut8.b r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.O(java.lang.String, ut8$b):long");
    }

    private static c P(XmlPullParser xmlPullParser) {
        String a2 = bm9.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = u.matcher(a2);
        if (!matcher.matches()) {
            a84.j("TtmlDecoder", "Ignoring non-pixel tts extent: " + a2);
            return null;
        }
        try {
            return new c(Integer.parseInt((String) ur.e(matcher.group(1))), Integer.parseInt((String) ur.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            a84.j("TtmlDecoder", "Ignoring malformed tts extent: " + a2);
            return null;
        }
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new wt8(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = w;
            a aVar = x;
            int i2 = 0;
            zt8 zt8Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                vt8 vt8Var = (vt8) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = G(newPullParser);
                            aVar = E(newPullParser, x);
                            cVar = P(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    vt8 J = J(newPullParser, vt8Var, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (vt8Var != null) {
                                        vt8Var.a(J);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    a84.k("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            a84.g("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar2 = bVar3;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((vt8) ur.e(vt8Var)).a(vt8.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            zt8Var = new zt8((vt8) ur.e((vt8) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (zt8Var != null) {
                return zt8Var;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
