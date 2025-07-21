package com.nytimes.android.section.sectionfront;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.SectionMeta;
import com.nytimes.android.api.cms.SectionQueryData;
import com.nytimes.android.api.cms.SectionQueryType;
import com.nytimes.android.io.Id;
import defpackage.zq3;
import io.reactivex.annotations.SchedulerSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a extends Id {
    public static final C0402a Companion = new C0402a(null);
    private final SectionMeta a;

    /* renamed from: com.nytimes.android.section.sectionfront.a$a, reason: collision with other inner class name */
    public static final class C0402a {
        public /* synthetic */ C0402a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a c(C0402a c0402a, String str, String str2, SectionQueryType sectionQueryType, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                sectionQueryType = SectionQueryType.LEGACY_COLLECTION;
            }
            if ((i & 8) != 0) {
                str3 = "TRENDING";
            }
            return c0402a.b(str, str2, sectionQueryType, str3);
        }

        public final a a(SectionMeta sectionMeta) {
            zq3.h(sectionMeta, "sectionMeta");
            return new a(sectionMeta.getName(), sectionMeta);
        }

        public final a b(String str, String str2, SectionQueryType sectionQueryType, String str3) {
            zq3.h(str, "queryId");
            zq3.h(sectionQueryType, "queryType");
            zq3.h(str3, "queryParam");
            return new a(str, new SectionMeta(SchedulerSupport.CUSTOM, "title", null, str, new SectionQueryData(sectionQueryType, str3), null, null, null, null, null, str2, 996, null));
        }

        private C0402a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, SectionMeta sectionMeta) {
        super(SectionFront.class, str);
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(sectionMeta, "sectionMeta");
        this.a = sectionMeta;
    }

    public static final a b(SectionMeta sectionMeta) {
        return Companion.a(sectionMeta);
    }

    public final SectionMeta a() {
        return this.a;
    }
}
