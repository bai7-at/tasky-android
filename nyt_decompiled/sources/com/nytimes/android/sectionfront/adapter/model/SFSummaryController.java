package com.nytimes.android.sectionfront.adapter.model;

import android.app.Application;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.sectionfront.adapter.model.b;
import defpackage.b24;
import defpackage.bt5;
import defpackage.u57;

/* loaded from: classes4.dex */
public class SFSummaryController {
    Application application;
    b24 ledeSFSummaryProcessor;
    bt5 phoenixDeviceUtils;
    u57 sfSummaryProcessor;

    public SFSummaryController(Application application, bt5 bt5Var, u57 u57Var, b24 b24Var) {
        this.application = application;
        this.phoenixDeviceUtils = bt5Var;
        this.sfSummaryProcessor = u57Var;
        this.ledeSFSummaryProcessor = b24Var;
    }

    u57 a(SectionAdapterItemType sectionAdapterItemType) {
        if (c(sectionAdapterItemType)) {
            return this.sfSummaryProcessor;
        }
        if (d(sectionAdapterItemType)) {
            return this.ledeSFSummaryProcessor;
        }
        return null;
    }

    public void b(b.a aVar, Asset asset, SectionFront sectionFront, SectionAdapterItemType sectionAdapterItemType) {
        u57 a = a(sectionAdapterItemType);
        if (a != null) {
            a.c(aVar, sectionFront, asset);
        }
    }

    boolean c(SectionAdapterItemType sectionAdapterItemType) {
        return sectionAdapterItemType == SectionAdapterItemType.ARTICLE || sectionAdapterItemType == SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_VERTICAL_OR_NO_IMAGE || sectionAdapterItemType == SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE || (sectionAdapterItemType == SectionAdapterItemType.PHOTOSPOT && !this.phoenixDeviceUtils.a(this.application)) || sectionAdapterItemType == SectionAdapterItemType.VIDEO || sectionAdapterItemType == SectionAdapterItemType.AUDIO;
    }

    boolean d(SectionAdapterItemType sectionAdapterItemType) {
        return sectionAdapterItemType == SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE || sectionAdapterItemType == SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_HORIZONTAL_IMAGE || sectionAdapterItemType == SectionAdapterItemType.PHOTOSPOT || sectionAdapterItemType == SectionAdapterItemType.VIDEO_LEDE;
    }
}
