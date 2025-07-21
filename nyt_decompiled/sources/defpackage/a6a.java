package defpackage;

import android.text.Layout;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.internal.ads.zzakn;
import com.nytimes.android.api.cms.Tag;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class a6a implements t4a {
    private static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    private static final y5a i = new y5a(30.0f, 1, 1);
    private final XmlPullParserFactory a;

    public a6a() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long c(java.lang.String r13, defpackage.y5a r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6a.c(java.lang.String, y5a):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment d(String str) {
        char c2;
        String a = yfe.a(str);
        switch (a.hashCode()) {
            case -1364013995:
                if (a.equals("center")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (a.equals("end")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (a.equals("left")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (a.equals("right")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (a.equals("start")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c2 == 2 || c2 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c2 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static d6a e(d6a d6aVar) {
        return d6aVar == null ? new d6a() : d6aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static d6a f(XmlPullParser xmlPullParser, d6a d6aVar) {
        ?? r7;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        d6a d6aVar2 = d6aVar;
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            ?? r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            ?? r112 = -1;
            r11 = -1;
            r11 = -1;
            ?? r113 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            ?? r114 = -1;
            r11 = -1;
            r11 = -1;
            ?? r115 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r7 = 6;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r7 = 3;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r7 = 7;
                        break;
                    }
                    r7 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r7 = 12;
                        break;
                    }
                    r7 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r7 = 5;
                        break;
                    }
                    r7 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r7 = z;
                        break;
                    }
                    r7 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r7 = 10;
                        break;
                    }
                    r7 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r7 = 2;
                        break;
                    }
                    r7 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r7 = 14;
                        break;
                    }
                    r7 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r7 = 9;
                        break;
                    }
                    r7 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r7 = 4;
                        break;
                    }
                    r7 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r7 = 13;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r7 = 11;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r7 = 1;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r7 = 8;
                        break;
                    }
                    r7 = -1;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.C(attributeValue);
                        break;
                    }
                case 1:
                    d6aVar2 = e(d6aVar2);
                    try {
                        d6aVar2.w(ied.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        ezd.f("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    d6aVar2 = e(d6aVar2);
                    try {
                        d6aVar2.y(ied.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        ezd.f("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    d6aVar2 = e(d6aVar2);
                    d6aVar2.z(attributeValue);
                    break;
                case 4:
                    try {
                        d6aVar2 = e(d6aVar2);
                        int i3 = khe.a;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = d.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzakn("Invalid number of entries for fontSize: " + length + InstructionFileId.DOT);
                            }
                            matcher = d.matcher(split[1]);
                            ezd.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzakn("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode != 37) {
                            if (hashCode != 3240) {
                                if (hashCode == 3592 && group.equals("px")) {
                                    r11 = 0;
                                }
                            } else if (group.equals(Tag.EM)) {
                                r11 = 1;
                            }
                        } else if (group.equals("%")) {
                            r11 = 2;
                        }
                        if (r11 == 0) {
                            d6aVar2.B(1);
                        } else if (r11 == 1) {
                            d6aVar2.B(2);
                        } else {
                            if (r11 != 2) {
                                throw new zzakn("Invalid unit for fontSize: '" + group + "'.");
                            }
                            d6aVar2.B(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        d6aVar2.A(Float.parseFloat(group2));
                        break;
                    } catch (zzakn unused3) {
                        ezd.f("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    d6aVar2 = e(d6aVar2);
                    d6aVar2.x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    d6aVar2 = e(d6aVar2);
                    d6aVar2.D("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    d6aVar2 = e(d6aVar2);
                    d6aVar2.J(d(attributeValue));
                    break;
                case 8:
                    d6aVar2 = e(d6aVar2);
                    d6aVar2.F(d(attributeValue));
                    break;
                case 9:
                    String a = yfe.a(attributeValue);
                    int hashCode2 = a.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && a.equals("none")) {
                            r115 = z;
                        }
                    } else if (a.equals("all")) {
                        r115 = 1;
                    }
                    if (r115 == 0) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.a(z);
                        break;
                    } else if (r115 == 1) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.a(true);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    String a2 = yfe.a(attributeValue);
                    switch (a2.hashCode()) {
                        case -618561360:
                            if (a2.equals("baseContainer")) {
                                r114 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (a2.equals("container")) {
                                r114 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (a2.equals("delimiter")) {
                                r114 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (a2.equals("textContainer")) {
                                r114 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (a2.equals("base")) {
                                r114 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (a2.equals("text")) {
                                r114 = 3;
                                break;
                            }
                            break;
                    }
                    if (r114 == 0) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.H(1);
                        break;
                    } else if (r114 != 1 && r114 != 2) {
                        if (r114 != 3 && r114 != 4) {
                            if (r114 == 5) {
                                d6aVar2 = e(d6aVar2);
                                d6aVar2.H(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            d6aVar2 = e(d6aVar2);
                            d6aVar2.H(3);
                            break;
                        }
                    } else {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.H(2);
                        break;
                    }
                case 11:
                    String a3 = yfe.a(attributeValue);
                    int hashCode3 = a3.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && a3.equals("after")) {
                            r113 = 1;
                        }
                    } else if (a3.equals("before")) {
                        r113 = z;
                    }
                    if (r113 == 0) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.G(1);
                        break;
                    } else if (r113 == 1) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.G(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String a4 = yfe.a(attributeValue);
                    switch (a4.hashCode()) {
                        case -1461280213:
                            if (a4.equals("nounderline")) {
                                r112 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (a4.equals("underline")) {
                                r112 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (a4.equals("nolinethrough")) {
                                r112 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (a4.equals("linethrough")) {
                                r112 = z;
                                break;
                            }
                            break;
                    }
                    if (r112 == 0) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.E(true);
                        break;
                    } else if (r112 == 1) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.E(z);
                        break;
                    } else if (r112 == 2) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.c(true);
                        break;
                    } else if (r112 == 3) {
                        d6aVar2 = e(d6aVar2);
                        d6aVar2.c(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    d6aVar2 = e(d6aVar2);
                    d6aVar2.b(w5a.a(attributeValue));
                    break;
                case 14:
                    d6a e2 = e(d6aVar2);
                    Matcher matcher2 = e.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e3) {
                            ezd.g("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e3);
                        }
                    } else {
                        ezd.f("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    e2.I(f2);
                    d6aVar2 = e2;
                    break;
            }
            i2++;
            z = false;
        }
        return d6aVar2;
    }

    private static String[] g(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i2 = khe.a;
        return trim.split("\\s+", -1);
    }

    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i2, int i3, s4a s4aVar, pgd pgdVar) {
        o4a.a(b(bArr, i2, i3), s4aVar, pgdVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:264|(6:265|266|267|(8:269|270|271|(2:275|(2:277|(3:279|(2:281|(2:283|(3:295|296|(1:298)))(2:302|(1:304)))(2:305|(1:307))|285)(2:308|309))(1:310))(1:311)|286|287|288|290)|333|334)|(4:(3:336|337|(4:339|(1:341)(1:378)|342|(1:344)(9:377|346|(2:348|(1:350)(2:(5:365|366|367|368|(1:370))(1:375)|371))(1:376)|351|352|353|354|355|(1:357)))(1:379))(1:380)|354|355|(0))|345|346|(0)(0)|351|352|353) */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0772, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0773, code lost:
    
        r11 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05b9 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006d, B:7:0x0077, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01af, B:38:0x0210, B:41:0x021e, B:43:0x0224, B:45:0x022c, B:47:0x0234, B:49:0x023c, B:51:0x0244, B:53:0x024c, B:55:0x0252, B:57:0x025a, B:59:0x0262, B:61:0x0268, B:63:0x026e, B:65:0x0274, B:67:0x027c, B:70:0x0285, B:73:0x080b, B:74:0x02bb, B:76:0x02c1, B:78:0x02ca, B:80:0x02d9, B:82:0x02e4, B:84:0x02f8, B:86:0x02fe, B:88:0x05c3, B:98:0x0317, B:100:0x031f, B:102:0x0325, B:104:0x032e, B:106:0x0336, B:107:0x0347, B:114:0x0368, B:119:0x05b9, B:121:0x0387, B:123:0x038f, B:128:0x03ac, B:130:0x03b2, B:132:0x03bf, B:133:0x042c, B:135:0x0432, B:139:0x0441, B:141:0x0447, B:143:0x0454, B:144:0x04a7, B:146:0x04af, B:159:0x04f5, B:161:0x04fd, B:177:0x0544, B:195:0x0465, B:199:0x0467, B:201:0x0468, B:203:0x0470, B:206:0x047a, B:209:0x0484, B:211:0x048a, B:213:0x0495, B:217:0x0552, B:220:0x0554, B:221:0x0555, B:222:0x055e, B:223:0x0569, B:226:0x03d5, B:229:0x03d7, B:231:0x03d8, B:232:0x03e6, B:235:0x03f2, B:239:0x0409, B:242:0x040f, B:245:0x0416, B:247:0x041c, B:251:0x0578, B:255:0x0582, B:258:0x0581, B:262:0x058b, B:263:0x059e, B:266:0x05fd, B:270:0x061f, B:296:0x0689, B:298:0x0691, B:288:0x06d8, B:294:0x077c, B:302:0x06a6, B:305:0x06b0, B:309:0x06be, B:310:0x06c8, B:311:0x06d0, B:336:0x06e9, B:352:0x074c, B:355:0x075a, B:357:0x075f, B:367:0x0735, B:384:0x01b8, B:386:0x01c4, B:389:0x01cf, B:391:0x01d5, B:393:0x01e0, B:396:0x01ed, B:399:0x01ef, B:400:0x01f0, B:401:0x012c, B:404:0x013a, B:407:0x0143, B:409:0x0149, B:412:0x0150, B:414:0x0156, B:419:0x016c, B:422:0x0173, B:424:0x01a6, B:431:0x0198, B:437:0x01a5, B:449:0x07a3, B:456:0x07b6, B:459:0x07ba, B:461:0x07c4, B:463:0x07ce, B:464:0x07de, B:467:0x07d9, B:471:0x07fb, B:474:0x0806, B:479:0x082e), top: B:2:0x0010, inners: #1, #8, #9, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04af A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006d, B:7:0x0077, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01af, B:38:0x0210, B:41:0x021e, B:43:0x0224, B:45:0x022c, B:47:0x0234, B:49:0x023c, B:51:0x0244, B:53:0x024c, B:55:0x0252, B:57:0x025a, B:59:0x0262, B:61:0x0268, B:63:0x026e, B:65:0x0274, B:67:0x027c, B:70:0x0285, B:73:0x080b, B:74:0x02bb, B:76:0x02c1, B:78:0x02ca, B:80:0x02d9, B:82:0x02e4, B:84:0x02f8, B:86:0x02fe, B:88:0x05c3, B:98:0x0317, B:100:0x031f, B:102:0x0325, B:104:0x032e, B:106:0x0336, B:107:0x0347, B:114:0x0368, B:119:0x05b9, B:121:0x0387, B:123:0x038f, B:128:0x03ac, B:130:0x03b2, B:132:0x03bf, B:133:0x042c, B:135:0x0432, B:139:0x0441, B:141:0x0447, B:143:0x0454, B:144:0x04a7, B:146:0x04af, B:159:0x04f5, B:161:0x04fd, B:177:0x0544, B:195:0x0465, B:199:0x0467, B:201:0x0468, B:203:0x0470, B:206:0x047a, B:209:0x0484, B:211:0x048a, B:213:0x0495, B:217:0x0552, B:220:0x0554, B:221:0x0555, B:222:0x055e, B:223:0x0569, B:226:0x03d5, B:229:0x03d7, B:231:0x03d8, B:232:0x03e6, B:235:0x03f2, B:239:0x0409, B:242:0x040f, B:245:0x0416, B:247:0x041c, B:251:0x0578, B:255:0x0582, B:258:0x0581, B:262:0x058b, B:263:0x059e, B:266:0x05fd, B:270:0x061f, B:296:0x0689, B:298:0x0691, B:288:0x06d8, B:294:0x077c, B:302:0x06a6, B:305:0x06b0, B:309:0x06be, B:310:0x06c8, B:311:0x06d0, B:336:0x06e9, B:352:0x074c, B:355:0x075a, B:357:0x075f, B:367:0x0735, B:384:0x01b8, B:386:0x01c4, B:389:0x01cf, B:391:0x01d5, B:393:0x01e0, B:396:0x01ed, B:399:0x01ef, B:400:0x01f0, B:401:0x012c, B:404:0x013a, B:407:0x0143, B:409:0x0149, B:412:0x0150, B:414:0x0156, B:419:0x016c, B:422:0x0173, B:424:0x01a6, B:431:0x0198, B:437:0x01a5, B:449:0x07a3, B:456:0x07b6, B:459:0x07ba, B:461:0x07c4, B:463:0x07ce, B:464:0x07de, B:467:0x07d9, B:471:0x07fb, B:474:0x0806, B:479:0x082e), top: B:2:0x0010, inners: #1, #8, #9, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04fd A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006d, B:7:0x0077, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01af, B:38:0x0210, B:41:0x021e, B:43:0x0224, B:45:0x022c, B:47:0x0234, B:49:0x023c, B:51:0x0244, B:53:0x024c, B:55:0x0252, B:57:0x025a, B:59:0x0262, B:61:0x0268, B:63:0x026e, B:65:0x0274, B:67:0x027c, B:70:0x0285, B:73:0x080b, B:74:0x02bb, B:76:0x02c1, B:78:0x02ca, B:80:0x02d9, B:82:0x02e4, B:84:0x02f8, B:86:0x02fe, B:88:0x05c3, B:98:0x0317, B:100:0x031f, B:102:0x0325, B:104:0x032e, B:106:0x0336, B:107:0x0347, B:114:0x0368, B:119:0x05b9, B:121:0x0387, B:123:0x038f, B:128:0x03ac, B:130:0x03b2, B:132:0x03bf, B:133:0x042c, B:135:0x0432, B:139:0x0441, B:141:0x0447, B:143:0x0454, B:144:0x04a7, B:146:0x04af, B:159:0x04f5, B:161:0x04fd, B:177:0x0544, B:195:0x0465, B:199:0x0467, B:201:0x0468, B:203:0x0470, B:206:0x047a, B:209:0x0484, B:211:0x048a, B:213:0x0495, B:217:0x0552, B:220:0x0554, B:221:0x0555, B:222:0x055e, B:223:0x0569, B:226:0x03d5, B:229:0x03d7, B:231:0x03d8, B:232:0x03e6, B:235:0x03f2, B:239:0x0409, B:242:0x040f, B:245:0x0416, B:247:0x041c, B:251:0x0578, B:255:0x0582, B:258:0x0581, B:262:0x058b, B:263:0x059e, B:266:0x05fd, B:270:0x061f, B:296:0x0689, B:298:0x0691, B:288:0x06d8, B:294:0x077c, B:302:0x06a6, B:305:0x06b0, B:309:0x06be, B:310:0x06c8, B:311:0x06d0, B:336:0x06e9, B:352:0x074c, B:355:0x075a, B:357:0x075f, B:367:0x0735, B:384:0x01b8, B:386:0x01c4, B:389:0x01cf, B:391:0x01d5, B:393:0x01e0, B:396:0x01ed, B:399:0x01ef, B:400:0x01f0, B:401:0x012c, B:404:0x013a, B:407:0x0143, B:409:0x0149, B:412:0x0150, B:414:0x0156, B:419:0x016c, B:422:0x0173, B:424:0x01a6, B:431:0x0198, B:437:0x01a5, B:449:0x07a3, B:456:0x07b6, B:459:0x07ba, B:461:0x07c4, B:463:0x07ce, B:464:0x07de, B:467:0x07d9, B:471:0x07fb, B:474:0x0806, B:479:0x082e), top: B:2:0x0010, inners: #1, #8, #9, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x075f A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, zzakn -> 0x0763, TRY_LEAVE, TryCatch #15 {zzakn -> 0x0763, blocks: (B:355:0x075a, B:357:0x075f), top: B:354:0x075a }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x01b8 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006d, B:7:0x0077, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01af, B:38:0x0210, B:41:0x021e, B:43:0x0224, B:45:0x022c, B:47:0x0234, B:49:0x023c, B:51:0x0244, B:53:0x024c, B:55:0x0252, B:57:0x025a, B:59:0x0262, B:61:0x0268, B:63:0x026e, B:65:0x0274, B:67:0x027c, B:70:0x0285, B:73:0x080b, B:74:0x02bb, B:76:0x02c1, B:78:0x02ca, B:80:0x02d9, B:82:0x02e4, B:84:0x02f8, B:86:0x02fe, B:88:0x05c3, B:98:0x0317, B:100:0x031f, B:102:0x0325, B:104:0x032e, B:106:0x0336, B:107:0x0347, B:114:0x0368, B:119:0x05b9, B:121:0x0387, B:123:0x038f, B:128:0x03ac, B:130:0x03b2, B:132:0x03bf, B:133:0x042c, B:135:0x0432, B:139:0x0441, B:141:0x0447, B:143:0x0454, B:144:0x04a7, B:146:0x04af, B:159:0x04f5, B:161:0x04fd, B:177:0x0544, B:195:0x0465, B:199:0x0467, B:201:0x0468, B:203:0x0470, B:206:0x047a, B:209:0x0484, B:211:0x048a, B:213:0x0495, B:217:0x0552, B:220:0x0554, B:221:0x0555, B:222:0x055e, B:223:0x0569, B:226:0x03d5, B:229:0x03d7, B:231:0x03d8, B:232:0x03e6, B:235:0x03f2, B:239:0x0409, B:242:0x040f, B:245:0x0416, B:247:0x041c, B:251:0x0578, B:255:0x0582, B:258:0x0581, B:262:0x058b, B:263:0x059e, B:266:0x05fd, B:270:0x061f, B:296:0x0689, B:298:0x0691, B:288:0x06d8, B:294:0x077c, B:302:0x06a6, B:305:0x06b0, B:309:0x06be, B:310:0x06c8, B:311:0x06d0, B:336:0x06e9, B:352:0x074c, B:355:0x075a, B:357:0x075f, B:367:0x0735, B:384:0x01b8, B:386:0x01c4, B:389:0x01cf, B:391:0x01d5, B:393:0x01e0, B:396:0x01ed, B:399:0x01ef, B:400:0x01f0, B:401:0x012c, B:404:0x013a, B:407:0x0143, B:409:0x0149, B:412:0x0150, B:414:0x0156, B:419:0x016c, B:422:0x0173, B:424:0x01a6, B:431:0x0198, B:437:0x01a5, B:449:0x07a3, B:456:0x07b6, B:459:0x07ba, B:461:0x07c4, B:463:0x07ce, B:464:0x07de, B:467:0x07d9, B:471:0x07fb, B:474:0x0806, B:479:0x082e), top: B:2:0x0010, inners: #1, #8, #9, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021e A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_ENTER, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006d, B:7:0x0077, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01af, B:38:0x0210, B:41:0x021e, B:43:0x0224, B:45:0x022c, B:47:0x0234, B:49:0x023c, B:51:0x0244, B:53:0x024c, B:55:0x0252, B:57:0x025a, B:59:0x0262, B:61:0x0268, B:63:0x026e, B:65:0x0274, B:67:0x027c, B:70:0x0285, B:73:0x080b, B:74:0x02bb, B:76:0x02c1, B:78:0x02ca, B:80:0x02d9, B:82:0x02e4, B:84:0x02f8, B:86:0x02fe, B:88:0x05c3, B:98:0x0317, B:100:0x031f, B:102:0x0325, B:104:0x032e, B:106:0x0336, B:107:0x0347, B:114:0x0368, B:119:0x05b9, B:121:0x0387, B:123:0x038f, B:128:0x03ac, B:130:0x03b2, B:132:0x03bf, B:133:0x042c, B:135:0x0432, B:139:0x0441, B:141:0x0447, B:143:0x0454, B:144:0x04a7, B:146:0x04af, B:159:0x04f5, B:161:0x04fd, B:177:0x0544, B:195:0x0465, B:199:0x0467, B:201:0x0468, B:203:0x0470, B:206:0x047a, B:209:0x0484, B:211:0x048a, B:213:0x0495, B:217:0x0552, B:220:0x0554, B:221:0x0555, B:222:0x055e, B:223:0x0569, B:226:0x03d5, B:229:0x03d7, B:231:0x03d8, B:232:0x03e6, B:235:0x03f2, B:239:0x0409, B:242:0x040f, B:245:0x0416, B:247:0x041c, B:251:0x0578, B:255:0x0582, B:258:0x0581, B:262:0x058b, B:263:0x059e, B:266:0x05fd, B:270:0x061f, B:296:0x0689, B:298:0x0691, B:288:0x06d8, B:294:0x077c, B:302:0x06a6, B:305:0x06b0, B:309:0x06be, B:310:0x06c8, B:311:0x06d0, B:336:0x06e9, B:352:0x074c, B:355:0x075a, B:357:0x075f, B:367:0x0735, B:384:0x01b8, B:386:0x01c4, B:389:0x01cf, B:391:0x01d5, B:393:0x01e0, B:396:0x01ed, B:399:0x01ef, B:400:0x01f0, B:401:0x012c, B:404:0x013a, B:407:0x0143, B:409:0x0149, B:412:0x0150, B:414:0x0156, B:419:0x016c, B:422:0x0173, B:424:0x01a6, B:431:0x0198, B:437:0x01a5, B:449:0x07a3, B:456:0x07b6, B:459:0x07ba, B:461:0x07c4, B:463:0x07ce, B:464:0x07de, B:467:0x07d9, B:471:0x07fb, B:474:0x0806, B:479:0x082e), top: B:2:0x0010, inners: #1, #8, #9, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c1 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, LOOP:1: B:76:0x02c1->B:90:0x05d1, LOOP_START, PHI: r2 r6 r7 r10 r13 r30 r31 r32 r33 r34 r36
      0x02c1: PHI (r2v19 y5a) = (r2v16 y5a), (r2v44 y5a) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r6v20 java.lang.String) = (r6v4 java.lang.String), (r6v49 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r7v12 java.lang.String) = (r7v1 java.lang.String), (r7v32 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r10v21 java.lang.String) = (r10v4 java.lang.String), (r10v36 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r13v12 java.util.HashMap) = (r13v1 java.util.HashMap), (r13v29 java.util.HashMap) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r30v10 java.util.HashMap) = (r30v1 java.util.HashMap), (r30v11 java.util.HashMap) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r31v2 java.lang.String) = (r31v1 java.lang.String), (r31v3 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r32v5 java.lang.String) = (r32v2 java.lang.String), (r32v17 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r33v2 java.lang.String) = (r33v1 java.lang.String), (r33v3 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r34v11 java.util.HashMap) = (r34v8 java.util.HashMap), (r34v22 java.util.HashMap) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r36v7 java.lang.String) = (r36v1 java.lang.String), (r36v11 java.lang.String) binds: [B:75:0x02bf, B:90:0x05d1] A[DONT_GENERATE, DONT_INLINE], TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006d, B:7:0x0077, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01af, B:38:0x0210, B:41:0x021e, B:43:0x0224, B:45:0x022c, B:47:0x0234, B:49:0x023c, B:51:0x0244, B:53:0x024c, B:55:0x0252, B:57:0x025a, B:59:0x0262, B:61:0x0268, B:63:0x026e, B:65:0x0274, B:67:0x027c, B:70:0x0285, B:73:0x080b, B:74:0x02bb, B:76:0x02c1, B:78:0x02ca, B:80:0x02d9, B:82:0x02e4, B:84:0x02f8, B:86:0x02fe, B:88:0x05c3, B:98:0x0317, B:100:0x031f, B:102:0x0325, B:104:0x032e, B:106:0x0336, B:107:0x0347, B:114:0x0368, B:119:0x05b9, B:121:0x0387, B:123:0x038f, B:128:0x03ac, B:130:0x03b2, B:132:0x03bf, B:133:0x042c, B:135:0x0432, B:139:0x0441, B:141:0x0447, B:143:0x0454, B:144:0x04a7, B:146:0x04af, B:159:0x04f5, B:161:0x04fd, B:177:0x0544, B:195:0x0465, B:199:0x0467, B:201:0x0468, B:203:0x0470, B:206:0x047a, B:209:0x0484, B:211:0x048a, B:213:0x0495, B:217:0x0552, B:220:0x0554, B:221:0x0555, B:222:0x055e, B:223:0x0569, B:226:0x03d5, B:229:0x03d7, B:231:0x03d8, B:232:0x03e6, B:235:0x03f2, B:239:0x0409, B:242:0x040f, B:245:0x0416, B:247:0x041c, B:251:0x0578, B:255:0x0582, B:258:0x0581, B:262:0x058b, B:263:0x059e, B:266:0x05fd, B:270:0x061f, B:296:0x0689, B:298:0x0691, B:288:0x06d8, B:294:0x077c, B:302:0x06a6, B:305:0x06b0, B:309:0x06be, B:310:0x06c8, B:311:0x06d0, B:336:0x06e9, B:352:0x074c, B:355:0x075a, B:357:0x075f, B:367:0x0735, B:384:0x01b8, B:386:0x01c4, B:389:0x01cf, B:391:0x01d5, B:393:0x01e0, B:396:0x01ed, B:399:0x01ef, B:400:0x01f0, B:401:0x012c, B:404:0x013a, B:407:0x0143, B:409:0x0149, B:412:0x0150, B:414:0x0156, B:419:0x016c, B:422:0x0173, B:424:0x01a6, B:431:0x0198, B:437:0x01a5, B:449:0x07a3, B:456:0x07b6, B:459:0x07ba, B:461:0x07c4, B:463:0x07ce, B:464:0x07de, B:467:0x07d9, B:471:0x07fb, B:474:0x0806, B:479:0x082e), top: B:2:0x0010, inners: #1, #8, #9, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05d1 A[LOOP:1: B:76:0x02c1->B:90:0x05d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05c9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p4a b(byte[] r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6a.b(byte[], int, int):p4a");
    }
}
