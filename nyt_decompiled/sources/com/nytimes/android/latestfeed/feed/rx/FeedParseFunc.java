package com.nytimes.android.latestfeed.feed.rx;

import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionMeta;
import defpackage.b04;
import defpackage.bg0;
import defpackage.bp5;
import defpackage.gm0;
import defpackage.sd0;
import defpackage.ub2;
import defpackage.yj0;
import defpackage.zq3;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* loaded from: classes4.dex */
public final class FeedParseFunc implements bp5 {
    public static final a Companion = new a(null);
    private final b04 a;
    private ub2 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FeedParseFunc(b04 b04Var) {
        zq3.h(b04Var, "parser");
        this.a = b04Var;
    }

    private final void d(LatestFeed latestFeed) {
        Object obj;
        List<SectionMeta> sections = latestFeed.getSections();
        if (sections == null || sections.size() < 1) {
            throw new IllegalStateException("Invalid num sections fewer than 1");
        }
        Iterator<T> it2 = sections.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (zq3.c(((SectionMeta) obj).getName(), "homepage")) {
                    break;
                }
            }
        }
        if (obj == null) {
            throw new IllegalStateException("Missing required section homepage");
        }
    }

    @Override // defpackage.bp5, io.reactivex.functions.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LatestFeed apply(sd0 sd0Var) {
        zq3.h(sd0Var, "data");
        return b(sd0Var, Dispatchers.getDefault());
    }

    public final LatestFeed b(sd0 sd0Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(sd0Var, "data");
        zq3.h(coroutineDispatcher, "dispatcher");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(sd0Var.t1(), yj0.b);
            try {
                LatestFeed a2 = ((bg0) this.a.get()).a(inputStreamReader);
                zq3.e(a2);
                d(a2);
                ub2 ub2Var = this.b;
                if (ub2Var != null) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, coroutineDispatcher, null, new FeedParseFunc$apply$1$1$1$1(ub2Var, null), 2, null);
                }
                gm0.a(inputStreamReader, null);
                zq3.e(a2);
                return a2;
            } finally {
            }
        } catch (Exception e) {
            ub2 ub2Var2 = this.b;
            if (ub2Var2 != null) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, coroutineDispatcher, null, new FeedParseFunc$apply$2$1(ub2Var2, null), 2, null);
            }
            throw e;
        }
    }

    public final void c(ub2 ub2Var) {
        this.b = ub2Var;
    }
}
