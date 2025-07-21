package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.j;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;

/* loaded from: classes4.dex */
public class ef7 {
    private static final ImmutableSet b = ImmutableSet.D(SectionAdapterItemType.AD_MODULE, SectionAdapterItemType.FLEX_FRAME_AD, SectionAdapterItemType.PHOTOSPOT, SectionAdapterItemType.SAVED_GET_MORE, SectionAdapterItemType.DAILY_BRIEFING, SectionAdapterItemType.ARTICLE, SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE, SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE, SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_HORIZONTAL_IMAGE, SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_VERTICAL_OR_NO_IMAGE, SectionAdapterItemType.AUDIO, SectionAdapterItemType.VIDEO, SectionAdapterItemType.VIDEO_LEDE, SectionAdapterItemType.PHOTOVIDEO);
    private final int a;

    public ef7(int i) {
        this.a = i;
    }

    private boolean c(SectionAdapterItemType sectionAdapterItemType) {
        return this.a == 1 || b.contains(sectionAdapterItemType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(re7 re7Var) {
        return c(re7Var.a);
    }

    public ImmutableList b(ImmutableList immutableList) {
        return ImmutableList.p().j(j.c(immutableList, new i16() { // from class: df7
            @Override // defpackage.i16
            public final boolean apply(Object obj) {
                boolean d;
                d = ef7.this.d((re7) obj);
                return d;
            }
        })).k();
    }
}
