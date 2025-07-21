package com.nytimes.android.utils;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import com.squareup.moshi.JsonAdapter;
import defpackage.a92;
import defpackage.bq5;
import defpackage.js5;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.ve2;
import defpackage.wv4;
import defpackage.y82;
import defpackage.zq3;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public class MoshiFileSystemPersister implements js5 {
    private final ve2 a;
    private final JsonAdapter b;
    private final bq5 c;
    private final y82 d;
    private final a92 e;

    public MoshiFileSystemPersister(ve2 ve2Var, JsonAdapter jsonAdapter, bq5 bq5Var) {
        zq3.h(ve2Var, "fileSystem");
        zq3.h(jsonAdapter, "adapter");
        zq3.h(bq5Var, "itemsPathResolver");
        this.a = ve2Var;
        this.b = jsonAdapter;
        this.c = bq5Var;
        this.d = new y82(ve2Var, bq5Var);
        this.e = new a92(ve2Var, bq5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ss2Var.invoke(obj);
    }

    @Override // defpackage.js5
    public Single b(Object obj, Object obj2) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(obj2, "raw");
        Single c = this.e.c(obj, wv4.a(this.b, obj2));
        zq3.g(c, "write(...)");
        return c;
    }

    @Override // defpackage.js5
    public Maybe d(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        Maybe c = this.d.c(obj);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.utils.MoshiFileSystemPersister$read$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sd0 sd0Var) {
                JsonAdapter jsonAdapter;
                zq3.h(sd0Var, "it");
                jsonAdapter = MoshiFileSystemPersister.this.b;
                Object fromJson = jsonAdapter.fromJson(sd0Var);
                zq3.e(fromJson);
                return fromJson;
            }
        };
        Maybe map = c.map(new Function() { // from class: vv4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                Object e;
                e = MoshiFileSystemPersister.e(ss2.this, obj2);
                return e;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }
}
