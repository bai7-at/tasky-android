package com.google.accompanist.pager;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.pn5;
import defpackage.zq3;

/* loaded from: classes2.dex */
final class b implements pn5 {
    private final PagerState a;

    public b(PagerState pagerState) {
        zq3.h(pagerState, TransferTable.COLUMN_STATE);
        this.a = pagerState;
    }
}
