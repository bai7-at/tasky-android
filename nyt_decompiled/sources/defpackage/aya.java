package defpackage;

import com.google.android.gms.common.util.CollectionUtils;
import com.nytimes.android.api.cms.Tag;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aya implements uxa {
    static final Map d = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final ela a;
    private final k6b b;
    private final r6b c;

    public aya(ela elaVar, k6b k6bVar, r6b r6bVar) {
        this.a = elaVar;
        this.b = k6bVar;
        this.c = r6bVar;
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        int intValue = ((Integer) d.get((String) map.get(Tag.A))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                ela elaVar = this.a;
                if (!elaVar.c()) {
                    elaVar.b(null);
                    return;
                }
                if (intValue == 1) {
                    this.b.i(map);
                    return;
                }
                if (intValue == 3) {
                    new n6b(wlbVar, map).i();
                    return;
                }
                if (intValue == 4) {
                    new h6b(wlbVar, map).j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.b.h(true);
                        return;
                    } else if (intValue != 7) {
                        fgb.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (wlbVar == null) {
            fgb.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        wlbVar.B0(i);
    }
}
