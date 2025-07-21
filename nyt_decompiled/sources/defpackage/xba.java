package defpackage;

import com.google.android.gms.internal.atv_ads_framework.zzaq;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class xba {
    private static final Set a = b("http", "https", "mailto", "ftp");
    private static final Set b = b("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska");
    private static final Set c = Collections.emptySet();

    public static String a(String str, String str2) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        Set set = c;
        String lowerCase = str.toLowerCase();
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            if (lowerCase.startsWith(String.valueOf((String) it2.next()).concat(":"))) {
                return str;
            }
        }
        if (!lowerCase.startsWith("data:")) {
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                if (lowerCase.startsWith(String.valueOf(((zzaq) it3.next()).name().toLowerCase().replace('_', '-')).concat(":"))) {
                    return str;
                }
            }
            for (int i2 = 0; i2 < str.length() && (charAt = str.charAt(i2)) != '#' && charAt != '/'; i2++) {
                if (charAt != ':') {
                    if (charAt == '?') {
                        return str;
                    }
                }
            }
            return str;
        }
        String lowerCase2 = str.toLowerCase();
        if (lowerCase2.startsWith("data:") && lowerCase2.length() > 5) {
            int i3 = 5;
            while (i3 < lowerCase2.length() && (charAt3 = lowerCase2.charAt(i3)) != ';' && charAt3 != ',') {
                i3++;
            }
            if (b.contains(lowerCase2.substring(5, i3)) && lowerCase2.startsWith(";base64,", i3) && (i = i3 + 8) < lowerCase2.length()) {
                while (i < lowerCase2.length() && (charAt2 = lowerCase2.charAt(i)) != '=') {
                    if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                        break;
                    }
                    i++;
                }
                while (i < lowerCase2.length()) {
                    if (lowerCase2.charAt(i) == '=') {
                        i++;
                    }
                }
                return str;
            }
        }
        return "about:invalid#zTvAdsFrameworkz";
    }

    private static final Set b(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
