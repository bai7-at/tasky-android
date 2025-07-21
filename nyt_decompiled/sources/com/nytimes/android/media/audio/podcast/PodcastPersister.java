package com.nytimes.android.media.audio.podcast;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.external.store3.base.impl.BarCode;
import com.nytimes.android.media.audio.podcast.PodcastPersister;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.a92;
import defpackage.bq5;
import defpackage.js5;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.ve2;
import defpackage.wd5;
import defpackage.y82;
import defpackage.yj0;
import defpackage.zq3;
import defpackage.zv5;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.ByteArrayInputStream;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PodcastPersister implements js5 {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private static final bq5 f = new bq5() { // from class: iw5
        @Override // defpackage.bq5
        public final String a(Object obj) {
            String h;
            h = PodcastPersister.h((BarCode) obj);
            return h;
        }
    };
    private final y82 a;
    private final a92 b;
    private final i c;
    private final JsonAdapter d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PodcastPersister a(ve2 ve2Var) {
            zq3.h(ve2Var, "fileSystem");
            return new PodcastPersister(new y82(ve2Var, PodcastPersister.f), new a92(ve2Var, PodcastPersister.f), null);
        }

        private a() {
        }
    }

    public /* synthetic */ PodcastPersister(y82 y82Var, a92 a92Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(y82Var, a92Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(BarCode barCode) {
        zq3.h(barCode, "it");
        return "podcasts";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (String) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (List) ss2Var.invoke(obj);
    }

    @Override // defpackage.js5
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Maybe d(BarCode barCode) {
        zq3.h(barCode, TransferTable.COLUMN_KEY);
        Maybe c = this.a.c(barCode);
        final PodcastPersister$read$1 podcastPersister$read$1 = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastPersister$read$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(sd0 sd0Var) {
                zq3.h(sd0Var, "it");
                return new String(sd0Var.B0(), yj0.b);
            }
        };
        Maybe map = c.map(new Function() { // from class: jw5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String j;
                j = PodcastPersister.j(ss2.this, obj);
                return j;
            }
        });
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastPersister$read$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List invoke(String str) {
                JsonAdapter jsonAdapter;
                zq3.h(str, "it");
                jsonAdapter = PodcastPersister.this.d;
                return (List) jsonAdapter.fromJson(str);
            }
        };
        Maybe map2 = map.map(new Function() { // from class: kw5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List k;
                k = PodcastPersister.k(ss2.this, obj);
                return k;
            }
        });
        zq3.g(map2, "map(...)");
        return map2;
    }

    @Override // defpackage.js5
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Single b(BarCode barCode, List list) {
        zq3.h(barCode, TransferTable.COLUMN_KEY);
        zq3.h(list, "raw");
        String json = this.d.toJson(list);
        zq3.g(json, "toJson(...)");
        byte[] bytes = json.getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        Single c = this.b.c(barCode, wd5.d(wd5.l(new ByteArrayInputStream(bytes))));
        zq3.g(c, "write(...)");
        return c;
    }

    private PodcastPersister(y82 y82Var, a92 a92Var) {
        this.a = y82Var;
        this.b = a92Var;
        i.b bVar = new i.b();
        PolymorphicJsonAdapterFactory a2 = PolymorphicJsonAdapterFactory.a(zv5.class, "_json_type_");
        zq3.g(a2, "of(...)");
        PolymorphicJsonAdapterFactory b = a2.b(PodcastOverview.class, "PodcastOverview");
        zq3.g(b, "withSubtype(...)");
        i d = bVar.a(b).d();
        this.c = d;
        zq3.g(d, "moshi");
        JsonAdapter d2 = d.d(j.j(List.class, Podcast.class));
        zq3.g(d2, "adapter(...)");
        this.d = d2;
    }
}
