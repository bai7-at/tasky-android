package com.nytimes.android.menu.item;

import android.view.MenuItem;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.fragment.article.ArticleFragmentType;
import com.nytimes.android.menu.MenuData;
import defpackage.kq4;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class Refresh extends MenuData {
    public Refresh() {
        super(nk6.menu_content_refresh, ng6.webRefresh, 0, null, null, 0, null, null, false, null, null, 2012, null);
        setPreparer(new ss2() { // from class: com.nytimes.android.menu.item.Refresh.1
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
                MenuItem findItem = kq4Var.c().findItem(Refresh.this.getId());
                if (findItem != null) {
                    findItem.setVisible(kq4Var.a() == ArticleFragmentType.WEB && !AssetUtils.isLegacyCollection(kq4Var.b()));
                }
            }
        });
    }
}
