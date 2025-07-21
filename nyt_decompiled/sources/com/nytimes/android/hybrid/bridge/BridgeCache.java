package com.nytimes.android.hybrid.bridge;

import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.hybrid.bridge.BridgeCache;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c04;
import defpackage.et3;
import defpackage.qs2;
import defpackage.zq3;
import java.util.List;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class BridgeCache {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final c04 b;

    @et3(generateAdapter = true)
    public static final class CacheInt {
        private final String a;
        private final int b;

        public CacheInt(String str, int i) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            this.a = str;
            this.b = i;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheInt)) {
                return false;
            }
            CacheInt cacheInt = (CacheInt) obj;
            return zq3.c(this.a, cacheInt.a) && this.b == cacheInt.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "CacheInt(key=" + this.a + ", value=" + this.b + ")";
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public BridgeCache(SharedPreferences sharedPreferences, final i iVar) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(iVar, "moshi");
        this.a = sharedPreferences;
        this.b = c.a(new qs2() { // from class: com.nytimes.android.hybrid.bridge.BridgeCache$cacheIntAdapter$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final JsonAdapter mo865invoke() {
                return i.this.d(j.j(List.class, BridgeCache.CacheInt.class));
            }
        });
    }
}
