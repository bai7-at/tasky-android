package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class gf2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String t = ku4.t(str);
        t.hashCode();
        switch (t.hashCode()) {
            case -2123537834:
                if (t.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (t.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (t.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (t.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (t.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (t.equals("image/jpeg")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (t.equals("application/mp4")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (t.equals("video/x-msvideo")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (t.equals("text/vtt")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (t.equals("audio/x-matroska")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (t.equals("application/webm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (t.equals("video/x-flv")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (t.equals("audio/ac3")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (t.equals("audio/ac4")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (t.equals("audio/amr")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (t.equals("audio/mp4")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (t.equals("audio/ogg")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (t.equals("audio/wav")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (t.equals("video/mp4")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (t.equals("audio/3gpp")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (t.equals("audio/eac3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (t.equals("audio/flac")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (t.equals("audio/midi")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (t.equals("audio/mpeg")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (t.equals("audio/webm")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (t.equals("video/x-matroska")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    public static int b(Map map) {
        List list = (List) map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }
}
