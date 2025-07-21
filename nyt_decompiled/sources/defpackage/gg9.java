package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class gg9 {
    private static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair b(DrmSession drmSession) {
        Map g = drmSession.g();
        if (g == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(g, "LicenseDurationRemaining")), Long.valueOf(a(g, "PlaybackDurationRemaining")));
    }
}
