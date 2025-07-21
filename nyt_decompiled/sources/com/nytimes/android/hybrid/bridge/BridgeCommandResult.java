package com.nytimes.android.hybrid.bridge;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class BridgeCommandResult {
    public static final a Companion = new a(null);
    private final int a;
    private final boolean b;
    private final String c;
    private final String d;
    private final Map e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BridgeCommandResult b(a aVar, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            return aVar.a(i, str, str2);
        }

        public static /* synthetic */ BridgeCommandResult d(a aVar, int i, Map map, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                map = null;
            }
            return aVar.c(i, map);
        }

        public final BridgeCommandResult a(int i, String str, String str2) {
            return new BridgeCommandResult(i, false, str, str2, null, 16, null);
        }

        public final BridgeCommandResult c(int i, Map map) {
            return new BridgeCommandResult(i, true, null, null, map, 12, null);
        }

        private a() {
        }
    }

    public BridgeCommandResult(int i, boolean z, String str, String str2, Map map) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = map;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final Map e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeCommandResult)) {
            return false;
        }
        BridgeCommandResult bridgeCommandResult = (BridgeCommandResult) obj;
        return this.a == bridgeCommandResult.a && this.b == bridgeCommandResult.b && zq3.c(this.c, bridgeCommandResult.c) && zq3.c(this.d, bridgeCommandResult.d) && zq3.c(this.e, bridgeCommandResult.e);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.e;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "BridgeCommandResult(id=" + this.a + ", success=" + this.b + ", error=" + this.c + ", errorDetails=" + this.d + ", values=" + this.e + ")";
    }

    public /* synthetic */ BridgeCommandResult(int i, boolean z, String str, String str2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : map);
    }
}
