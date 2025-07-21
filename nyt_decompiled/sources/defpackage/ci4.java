package defpackage;

import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import defpackage.os6;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public final class ci4 {
    private final RecentlyViewedManager a;

    public ci4(RecentlyViewedManager recentlyViewedManager) {
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        this.a = recentlyViewedManager;
    }

    private final z18 b(NYTMediaItem nYTMediaItem) {
        long parseLong = Long.parseLong(nYTMediaItem.D());
        String A = nYTMediaItem.A();
        String z = nYTMediaItem.z();
        if (z == null) {
            z = "";
        }
        String str = z;
        String valueOf = String.valueOf(nYTMediaItem.x());
        String valueOf2 = String.valueOf(nYTMediaItem.J());
        OffsetDateTime now = OffsetDateTime.now();
        zq3.g(now, "now(...)");
        OffsetDateTime now2 = OffsetDateTime.now();
        zq3.g(now2, "now(...)");
        return new z18(parseLong, A, null, str, valueOf, valueOf2, null, now, now2, 0, nYTMediaItem.E(), nYTMediaItem.u(), 0);
    }

    public final void a(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        String u = nYTMediaItem.u();
        if (u == null || this.a.u(u)) {
            return;
        }
        os6.a.a(this.a, b(nYTMediaItem), null, 2, null);
    }
}
