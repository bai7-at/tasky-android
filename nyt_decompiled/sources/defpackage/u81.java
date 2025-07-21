package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.k;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.ki7;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes2.dex */
public class u81 extends DefaultHandler implements i.a {
    private static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern c = Pattern.compile("CC([1-4])=.*");
    private static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    private final XmlPullParserFactory a;

    protected static final class a {
        public final t0 a;
        public final ImmutableList b;
        public final ki7 c;
        public final String d;
        public final ArrayList e;
        public final ArrayList f;
        public final long g;
        public final List h;
        public final List i;

        public a(t0 t0Var, List list, ki7 ki7Var, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j) {
            this.a = t0Var;
            this.b = ImmutableList.t(list);
            this.c = ki7Var;
            this.d = str;
            this.e = arrayList;
            this.f = arrayList2;
            this.h = list2;
            this.i = list3;
            this.g = j;
        }
    }

    public u81() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    protected static int D(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            xm1 xm1Var = (xm1) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(xm1Var.a) && (str = xm1Var.b) != null) {
                Matcher matcher = c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                a84.j("MpdParser", "Unable to parse CEA-608 channel number from: " + xm1Var.b);
            }
        }
        return -1;
    }

    protected static int E(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            xm1 xm1Var = (xm1) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(xm1Var.a) && (str = xm1Var.b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                a84.j("MpdParser", "Unable to parse CEA-708 service block number from: " + xm1Var.b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : z19.K0(attributeValue);
    }

    protected static xm1 I(XmlPullParser xmlPullParser, String str) {
        String r0 = r0(xmlPullParser, "schemeIdUri", "");
        String r02 = r0(xmlPullParser, "value", null);
        String r03 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!bm9.d(xmlPullParser, str));
        return new xm1(r0, r02, r03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int J(XmlPullParser xmlPullParser) {
        char c2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String e2 = tr.e(attributeValue);
        e2.hashCode();
        switch (e2.hashCode()) {
            case 1596796:
                if (e2.equals("4000")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2937391:
                if (e2.equals("a000")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3094035:
                if (e2.equals("f801")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3133436:
                if (e2.equals("fa01")) {
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
        }
        return -1;
    }

    protected static int K(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    protected static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    protected static long M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : z19.L0(attributeValue);
    }

    protected static String N(List list) {
        for (int i = 0; i < list.size(); i++) {
            xm1 xm1Var = (xm1) list.get(i);
            String str = xm1Var.a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(xm1Var.b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(xm1Var.b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    protected static float S(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    protected static int U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long W(List list) {
        for (int i = 0; i < list.size(); i++) {
            xm1 xm1Var = (xm1) list.get(i);
            if (tr.a("http://dashif.org/guidelines/last-segment-number", xm1Var.a)) {
                return Long.parseLong(xm1Var.b);
            }
        }
        return -1L;
    }

    protected static long X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static int Z(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U < 0) {
            return -1;
        }
        int[] iArr = e;
        if (U < iArr.length) {
            return iArr[U];
        }
        return -1;
    }

    private long b(List list, long j, long j2, int i, long j3) {
        int m = i >= 0 ? i + 1 : (int) z19.m(j3 - j, j2);
        for (int i2 = 0; i2 < m; i2++) {
            list.add(m(j, j2));
            j += j2;
        }
        return j;
    }

    private static int p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        ur.g(i == i2);
        return i;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        ur.g(str.equals(str2));
        return str;
    }

    private static void r(ArrayList arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i);
            if (zf0.c.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i2);
            if (zf0.b.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(zf0.c, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(size);
            if (!schemeData.c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((DrmInitData.SchemeData) arrayList.get(i)).a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    protected static String s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!bm9.d(xmlPullParser, str));
        return str2;
    }

    private static long t(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    private static String u(String str, String str2) {
        if (ku4.o(str)) {
            return ku4.c(str2);
        }
        if (ku4.s(str)) {
            return ku4.n(str2);
        }
        if (ku4.r(str) || ku4.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g = ku4.g(str2);
        return "text/vtt".equals(g) ? "application/x-mp4-vtt" : g;
    }

    private boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (bm9.e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (bm9.e(xmlPullParser)) {
                    i++;
                } else if (bm9.c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int A(XmlPullParser xmlPullParser) {
        char c2;
        String r0 = r0(xmlPullParser, "schemeIdUri", null);
        r0.hashCode();
        int i = -1;
        switch (r0.hashCode()) {
            case -2128649360:
                if (r0.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (r0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (r0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (r0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (r0.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (r0.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (r0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 6;
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
            case 4:
                i = K(xmlPullParser);
                break;
            case 1:
                i = U(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i = J(xmlPullParser);
                break;
            case 3:
                i = Z(xmlPullParser);
                break;
            case 5:
                i = L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!bm9.d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    protected long B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List C(XmlPullParser xmlPullParser, List list, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : RecyclerView.UNDEFINED_DURATION;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String s0 = s0(xmlPullParser, "BaseURL");
        if (yy8.b(s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = s0;
            }
            return k.j(new i60(s0, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            i60 i60Var = (i60) list.get(i);
            String d2 = yy8.d(i60Var.a, s0);
            String str = attributeValue3 == null ? d2 : attributeValue3;
            if (z) {
                parseInt = i60Var.c;
                parseInt2 = i60Var.d;
                str = i60Var.b;
            }
            arrayList.add(new i60(d2, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Type inference failed for: r3v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.util.Pair F(org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u81.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (AssetConstants.AUDIO_TYPE.equals(attributeValue)) {
            return 1;
        }
        if (AssetConstants.VIDEO_TYPE.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return AssetConstants.IMAGE_TYPE.equals(attributeValue) ? 4 : -1;
    }

    protected Pair O(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) {
        long X = X(xmlPullParser, "id", 0L);
        long X2 = X(xmlPullParser, "duration", -9223372036854775807L);
        long X3 = X(xmlPullParser, "presentationTime", 0L);
        long Q0 = z19.Q0(X2, 1000L, j);
        long Q02 = z19.Q0(X3 - j2, 1000000L, j);
        String r0 = r0(xmlPullParser, "messageData", null);
        byte[] P = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(Q02);
        if (r0 != null) {
            P = z19.o0(r0);
        }
        return Pair.create(valueOf, d(str, str2, X, Q0, P));
    }

    protected byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, zj0.c.name());
        xmlPullParser.nextToken();
        while (!bm9.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected d52 Q(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        ArrayList arrayList;
        String r0 = r0(xmlPullParser, "schemeIdUri", "");
        String r02 = r0(xmlPullParser, "value", "");
        long X = X(xmlPullParser, "timescale", 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j2 = X2;
                j = X2;
                arrayList = arrayList2;
                arrayList.add(O(xmlPullParser, r0, r02, X, j2, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = X2;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (bm9.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            X2 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return e(r0, r02, X, jArr, eventMessageArr);
    }

    protected to6 T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    protected String V(XmlPullParser xmlPullParser) {
        return s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e6 A[LOOP:0: B:18:0x00a2->B:26:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.t81 Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u81.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):t81");
    }

    protected Pair a0(XmlPullParser xmlPullParser, List list, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j6;
        ki7 l0;
        u81 u81Var = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long M = M(xmlPullParser2, "start", j);
        long j7 = -9223372036854775807L;
        long j8 = j3 != -9223372036854775807L ? j3 + M : -9223372036854775807L;
        long M2 = M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j9 = j2;
        boolean z2 = false;
        long j10 = -9223372036854775807L;
        ki7 ki7Var = null;
        xm1 xm1Var = null;
        while (true) {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j9 = u81Var.B(xmlPullParser2, j9);
                    z2 = true;
                }
                arrayList6.addAll(u81Var.C(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j6 = j7;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (bm9.f(xmlPullParser2, "AdaptationSet")) {
                    j5 = j9;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, ki7Var, M2, j9, j10, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j5 = j9;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (bm9.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (bm9.f(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        ki7Var = j0(xmlPullParser2, null);
                        obj = null;
                        j9 = j5;
                        j6 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (bm9.f(xmlPullParser2, "SegmentList")) {
                            long B = B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            l0 = k0(xmlPullParser, null, j8, M2, j5, B, j4);
                            j10 = B;
                            j9 = j5;
                            j6 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (bm9.f(xmlPullParser2, "SegmentTemplate")) {
                                long B2 = B(xmlPullParser2, -9223372036854775807L);
                                j6 = -9223372036854775807L;
                                l0 = l0(xmlPullParser, null, ImmutableList.x(), j8, M2, j5, B2, j4);
                                j10 = B2;
                                j9 = j5;
                            } else {
                                j6 = -9223372036854775807L;
                                if (bm9.f(xmlPullParser2, "AssetIdentifier")) {
                                    xm1Var = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser);
                                }
                                j9 = j5;
                            }
                        }
                        ki7Var = l0;
                    }
                }
                obj = null;
                j6 = -9223372036854775807L;
                j9 = j5;
            }
            if (bm9.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M, arrayList2, arrayList3, xm1Var), Long.valueOf(M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j7 = j6;
            u81Var = this;
        }
    }

    protected String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected f8 c(long j, int i, List list, List list2, List list3, List list4) {
        return new f8(j, i, list, list2, list3, list4);
    }

    protected q46 c0(XmlPullParser xmlPullParser) {
        String str = null;
        String r0 = r0(xmlPullParser, "moreInformationURL", null);
        String r02 = r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (bm9.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (bm9.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str3;
            if (bm9.d(xmlPullParser, "ProgramInformation")) {
                return new q46(str, str2, str4, r0, r02);
            }
            str3 = str4;
        }
    }

    protected EventMessage d(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    protected to6 d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return i(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return i(attributeValue, j, j2);
    }

    protected d52 e(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new d52(str, str2, j, jArr, eventMessageArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01f0 A[LOOP:0: B:2:0x006a->B:11:0x01f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01f0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected u81.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List r46, java.util.List r47, java.util.List r48, java.util.List r49, defpackage.ki7 r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u81.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, ki7, long, long, long, long, long, boolean):u81$a");
    }

    protected t0 f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String u = u(str2, str5);
        if ("audio/eac3".equals(u)) {
            u = N(list4);
            if ("audio/eac3-joc".equals(u)) {
                str5 = "ec+3";
            }
        }
        int p0 = p0(list);
        int i0 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair t0 = t0(list3);
        t0.b X = new t0.b().U(str).M(str2).g0(u).K(str5).b0(i5).i0(p0).e0(i0).X(str3);
        int i6 = -1;
        t0.b m0 = X.l0(t0 != null ? ((Integer) t0.first).intValue() : -1).m0(t0 != null ? ((Integer) t0.second).intValue() : -1);
        if (ku4.s(u)) {
            m0.n0(i).S(i2).R(f);
        } else if (ku4.o(u)) {
            m0.J(i3).h0(i4);
        } else if (ku4.r(u)) {
            if ("application/cea-608".equals(u)) {
                i6 = D(list2);
            } else if ("application/cea-708".equals(u)) {
                i6 = E(list2);
            }
            m0.H(i6);
        } else if (ku4.p(u)) {
            m0.n0(i).S(i2);
        }
        return m0.G();
    }

    protected int f0(List list) {
        int u0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            xm1 xm1Var = (xm1) list.get(i2);
            if (tr.a("urn:mpeg:dash:role:2011", xm1Var.a)) {
                u0 = g0(xm1Var.b);
            } else if (tr.a("urn:tva:metadata:cs:AudioPurposeCS:2007", xm1Var.a)) {
                u0 = u0(xm1Var.b);
            }
            i |= u0;
        }
        return i;
    }

    protected t81 g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, q46 q46Var, q19 q19Var, cl7 cl7Var, Uri uri, List list) {
        return new t81(j, j2, j3, z, j4, j5, j6, j7, q46Var, q19Var, cl7Var, uri, list);
    }

    protected int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected dr5 h(String str, long j, List list, List list2, xm1 xm1Var) {
        return new dr5(str, j, list, list2, xm1Var);
    }

    protected int h0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (tr.a("http://dashif.org/guidelines/trickmode", ((xm1) list.get(i2)).a)) {
                i = Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i;
    }

    protected to6 i(String str, long j, long j2) {
        return new to6(str, j, j2);
    }

    protected int i0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            xm1 xm1Var = (xm1) list.get(i2);
            if (tr.a("urn:mpeg:dash:role:2011", xm1Var.a)) {
                i |= g0(xm1Var.b);
            }
        }
        return i;
    }

    protected cy6 j(a aVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        t0.b c2 = aVar.a.c();
        if (str != null) {
            c2.W(str);
        }
        String str3 = aVar.d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            c2.O(new DrmInitData(str2, arrayList3));
        }
        ArrayList arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return cy6.o(aVar.g, c2.G(), aVar.b, aVar.c, arrayList4, aVar.h, aVar.i, null);
    }

    protected ki7.e j0(XmlPullParser xmlPullParser, ki7.e eVar) {
        long j;
        long j2;
        long X = X(xmlPullParser, "timescale", eVar != null ? eVar.b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.c : 0L);
        long j3 = eVar != null ? eVar.d : 0L;
        long j4 = eVar != null ? eVar.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        to6 to6Var = eVar != null ? eVar.a : null;
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "Initialization")) {
                to6Var = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!bm9.d(xmlPullParser, "SegmentBase"));
        return n(to6Var, X, X2, j2, j);
    }

    protected ki7.b k(to6 to6Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        return new ki7.b(to6Var, j, j2, j3, j4, list, j5, list2, z19.D0(j6), z19.D0(j7));
    }

    protected ki7.b k0(XmlPullParser xmlPullParser, ki7.b bVar, long j, long j2, long j3, long j4, long j5) {
        long X = X(xmlPullParser, "timescale", bVar != null ? bVar.b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.c : 0L);
        long X3 = X(xmlPullParser, "duration", bVar != null ? bVar.e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", bVar != null ? bVar.d : 1L);
        long t = t(j3, j4);
        List list = null;
        List list2 = null;
        to6 to6Var = null;
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "Initialization")) {
                to6Var = T(xmlPullParser);
            } else if (bm9.f(xmlPullParser, "SegmentTimeline")) {
                list = m0(xmlPullParser, X, j2);
            } else if (bm9.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!bm9.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (to6Var == null) {
                to6Var = bVar.a;
            }
            if (list == null) {
                list = bVar.f;
            }
            if (list2 == null) {
                list2 = bVar.j;
            }
        }
        return k(to6Var, X, X2, X4, X3, list, t, list2, j5, j);
    }

    protected ki7.c l(to6 to6Var, long j, long j2, long j3, long j4, long j5, List list, long j6, jz8 jz8Var, jz8 jz8Var2, long j7, long j8) {
        return new ki7.c(to6Var, j, j2, j3, j4, j5, list, j6, jz8Var, jz8Var2, z19.D0(j7), z19.D0(j8));
    }

    protected ki7.c l0(XmlPullParser xmlPullParser, ki7.c cVar, List list, long j, long j2, long j3, long j4, long j5) {
        long X = X(xmlPullParser, "timescale", cVar != null ? cVar.b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.c : 0L);
        long X3 = X(xmlPullParser, "duration", cVar != null ? cVar.e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", cVar != null ? cVar.d : 1L);
        long W = W(list);
        long t = t(j3, j4);
        List list2 = null;
        jz8 v0 = v0(xmlPullParser, "media", cVar != null ? cVar.k : null);
        jz8 v02 = v0(xmlPullParser, "initialization", cVar != null ? cVar.j : null);
        to6 to6Var = null;
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "Initialization")) {
                to6Var = T(xmlPullParser);
            } else if (bm9.f(xmlPullParser, "SegmentTimeline")) {
                list2 = m0(xmlPullParser, X, j2);
            } else {
                w(xmlPullParser);
            }
        } while (!bm9.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (to6Var == null) {
                to6Var = cVar.a;
            }
            if (list2 == null) {
                list2 = cVar.f;
            }
        }
        return l(to6Var, X, X2, X4, W, X3, list2, t, v02, v0, j5, j);
    }

    protected ki7.d m(long j, long j2) {
        return new ki7.d(j, j2);
    }

    protected List m0(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, QueryKeys.SCREEN_WIDTH)) {
                long X = X(xmlPullParser, QueryKeys.TOKEN, -9223372036854775807L);
                if (z) {
                    j3 = b(arrayList, j3, j4, i, X);
                }
                if (X == -9223372036854775807L) {
                    X = j3;
                }
                j4 = X(xmlPullParser, QueryKeys.SUBDOMAIN, -9223372036854775807L);
                i = U(xmlPullParser, QueryKeys.EXTERNAL_REFERRER, 0);
                z = true;
                j3 = X;
            } else {
                w(xmlPullParser);
            }
        } while (!bm9.d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            b(arrayList, j3, j4, i, z19.Q0(j2, j, 1000L));
        }
        return arrayList;
    }

    protected ki7.e n(to6 to6Var, long j, long j2, long j3, long j4) {
        return new ki7.e(to6Var, j, j2, j3, j4);
    }

    protected to6 n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    protected q19 o(String str, String str2) {
        return new q19(str, str2);
    }

    protected int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int p0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            xm1 xm1Var = (xm1) list.get(i2);
            if (tr.a("urn:mpeg:dash:role:2011", xm1Var.a)) {
                i |= o0(xm1Var.b);
            }
        }
        return i;
    }

    protected cl7 q0(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (bm9.f(xmlPullParser, "Latency")) {
                j = X(xmlPullParser, "target", -9223372036854775807L);
                j2 = X(xmlPullParser, "min", -9223372036854775807L);
                j3 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (bm9.f(xmlPullParser, "PlaybackRate")) {
                f = R(xmlPullParser, "min", -3.4028235E38f);
                f2 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (bm9.d(xmlPullParser, "ServiceDescription")) {
                return new cl7(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    protected Pair t0(List list) {
        String str;
        char c2 = 0;
        for (int i = 0; i < list.size(); i++) {
            xm1 xm1Var = (xm1) list.get(i);
            if ((tr.a("http://dashif.org/thumbnail_tile", xm1Var.a) || tr.a("http://dashif.org/guidelines/thumbnail_tile", xm1Var.a)) && (str = xm1Var.b) != null) {
                String[] V0 = z19.V0(str, QueryKeys.SCROLL_POSITION_TOP);
                if (V0.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(V0[c2])), Integer.valueOf(Integer.parseInt(V0[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    protected int u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected jz8 v0(XmlPullParser xmlPullParser, String str, jz8 jz8Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? jz8.b(attributeValue) : jz8Var;
    }

    protected q19 w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.i.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public t81 a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw ParserException.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw ParserException.c(null, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x030e A[LOOP:0: B:2:0x007e->B:10:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02d0 A[EDGE_INSN: B:11:0x02d0->B:12:0x02d0 BREAK  A[LOOP:0: B:2:0x007e->B:10:0x030e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.f8 y(org.xmlpull.v1.XmlPullParser r56, java.util.List r57, defpackage.ki7 r58, long r59, long r61, long r63, long r65, long r67, boolean r69) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u81.y(org.xmlpull.v1.XmlPullParser, java.util.List, ki7, long, long, long, long, long, boolean):f8");
    }

    protected void z(XmlPullParser xmlPullParser) {
        w(xmlPullParser);
    }
}
