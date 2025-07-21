package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.viewholder.e;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.utils.NetworkStatus;

/* loaded from: classes4.dex */
public abstract class q1 extends e {
    protected TextView r0;

    public q1(View view, Activity activity, pr prVar, FooterBinder footerBinder, NetworkStatus networkStatus, RecentlyViewedManager recentlyViewedManager, hb5 hb5Var, FeedStore feedStore, mi4 mi4Var) {
        super(view, activity, prVar, footerBinder, networkStatus, recentlyViewedManager, hb5Var, feedStore, mi4Var);
        this.r0 = (TextView) view.findViewById(pg6.row_sf_package_headline);
    }
}
