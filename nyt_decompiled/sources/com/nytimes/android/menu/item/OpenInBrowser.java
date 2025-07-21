package com.nytimes.android.menu.item;

import android.app.Activity;
import android.view.MenuItem;
import com.nytimes.android.WebActivity;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.fragment.article.ArticleFragmentType;
import com.nytimes.android.menu.MenuData;
import defpackage.ke6;
import defpackage.kq4;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.qh6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class OpenInBrowser extends MenuData {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenInBrowser(final Activity activity) {
        super(nk6.open_in_chrome_title, ng6.action_open_in_chrome, 0, null, null, 1, null, Integer.valueOf(ke6.ic_app_bar_web), false, null, null, 1884, null);
        zq3.h(activity, "activity");
        setPreparer(new ss2() { // from class: com.nytimes.android.menu.item.OpenInBrowser.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((kq4) obj);
                return ww8.a;
            }

            public final void invoke(kq4 kq4Var) {
                zq3.h(kq4Var, "param");
                MenuItem findItem = kq4Var.c().findItem(OpenInBrowser.this.getId());
                if (findItem != null) {
                    OpenInBrowser openInBrowser = OpenInBrowser.this;
                    Activity activity2 = activity;
                    findItem.setVisible(kq4Var.a() == ArticleFragmentType.WEB && !AssetUtils.isLegacyCollection(kq4Var.b()));
                    openInBrowser.setOrderInGrp(Integer.valueOf(activity2 instanceof WebActivity ? qh6.menu_second_position_item : qh6.menu_first_position_item));
                }
            }
        });
    }
}
