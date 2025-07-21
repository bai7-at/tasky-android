package defpackage;

import android.text.TextUtils;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class qcb {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, String str2) {
        char c2;
        nbb c3;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c2 = '\n';
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
                return 9;
            case 1:
                if (str2 == null || (c3 = c(str2)) == null) {
                    return 0;
                }
                return c3.a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (h(str)) {
            return 2;
        }
        if ("text".equals(i(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (AssetConstants.IMAGE_TYPE.equals(i(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        lh4.a(arrayList.get(0));
        throw null;
    }

    static nbb c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new nbb(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String e(String str) {
        char c2;
        if (str == null) {
            return null;
        }
        String a2 = yfe.a(str);
        switch (a2.hashCode()) {
            case -1007807498:
                if (a2.equals("audio/x-flac")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -979095690:
                if (a2.equals("application/x-mpegurl")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -586683234:
                if (a2.equals("audio/x-wav")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -432836268:
                if (a2.equals("audio/mpeg-l1")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -432836267:
                if (a2.equals("audio/mpeg-l2")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 187090231:
                if (a2.equals("audio/mp3")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? a2 : "audio/mpeg-L2" : "audio/mpeg-L1" : "application/x-mpegURL" : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean f(String str, String str2) {
        char c2;
        nbb c3;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
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
            case '\n':
                if (str2 != null && (c3 = c(str2)) != null && (a2 = c3.a()) != 0 && a2 != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean g(String str) {
        return AssetConstants.AUDIO_TYPE.equals(i(str));
    }

    public static boolean h(String str) {
        return AssetConstants.VIDEO_TYPE.equals(i(str));
    }

    private static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
