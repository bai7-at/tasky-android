package com.nytimes.android.performancetracker.lib;

import android.os.SystemClock;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.b22;
import defpackage.j32;
import defpackage.uy8;
import defpackage.zq3;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.BroadcastChannelKt;

/* loaded from: classes4.dex */
public final class PerformanceTracker {
    private CoroutineScope a = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
    private uy8 b = new c();
    private final BroadcastChannel c = BroadcastChannelKt.BroadcastChannel(-2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind START = new Kind("START", 0);
        public static final Kind END = new Kind("END", 1);
        public static final Kind TRIGGER = new Kind("TRIGGER", 2);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{START, END, TRIGGER};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Kind(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public static final class a {
        private final String a;
        private final Kind b;
        private final Map c;
        private final long d;
        private final UUID e;
        private final kotlin.time.b f;

        public /* synthetic */ a(String str, Kind kind, Map map, long j, UUID uuid, kotlin.time.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kind, map, j, uuid, bVar);
        }

        public final Map a() {
            return this.c;
        }

        public final Kind b() {
            return this.b;
        }

        public final kotlin.time.b c() {
            return this.f;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && zq3.c(this.c, aVar.c) && kotlin.time.b.l(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            Map map = this.c;
            int hashCode2 = (((((hashCode + (map == null ? 0 : map.hashCode())) * 31) + kotlin.time.b.A(this.d)) * 31) + this.e.hashCode()) * 31;
            kotlin.time.b bVar = this.f;
            return hashCode2 + (bVar != null ? kotlin.time.b.A(bVar.N()) : 0);
        }

        public String toString() {
            return "Entry(type=" + this.a + ", kind=" + this.b + ", info=" + this.c + ", timestamp=" + kotlin.time.b.L(this.d) + ", uuid=" + this.e + ", totalTime=" + this.f + ")";
        }

        private a(String str, Kind kind, Map map, long j, UUID uuid, kotlin.time.b bVar) {
            zq3.h(str, TransferTable.COLUMN_TYPE);
            zq3.h(kind, "kind");
            zq3.h(uuid, "uuid");
            this.a = str;
            this.b = kind;
            this.c = map;
            this.d = j;
            this.e = uuid;
            this.f = bVar;
        }

        public /* synthetic */ a(String str, Kind kind, Map map, long j, UUID uuid, kotlin.time.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kind, map, j, uuid, (i & 32) != 0 ? null : bVar, null);
        }
    }

    public static final class b {
        private final String a;
        private final UUID b;
        private final Deferred c;
        private final long d;

        public /* synthetic */ b(String str, UUID uuid, Deferred deferred, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uuid, deferred, j);
        }

        public final Deferred a() {
            return this.c;
        }

        public final long b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final UUID d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && kotlin.time.b.l(this.d, bVar.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + kotlin.time.b.A(this.d);
        }

        public String toString() {
            return "Token(type=" + this.a + ", uuid=" + this.b + ", info=" + this.c + ", startTimestamp=" + kotlin.time.b.L(this.d) + ")";
        }

        private b(String str, UUID uuid, Deferred deferred, long j) {
            zq3.h(str, TransferTable.COLUMN_TYPE);
            zq3.h(uuid, "uuid");
            zq3.h(deferred, "info");
            this.a = str;
            this.b = uuid;
            this.c = deferred;
            this.d = j;
        }
    }

    public static final class c implements uy8 {
        c() {
        }

        @Override // defpackage.uy8
        public long a() {
            return SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long d() {
        return kotlin.time.c.t(this.b.a(), DurationUnit.MILLISECONDS);
    }

    public final b c(j32 j32Var) {
        Deferred async$default;
        zq3.h(j32Var, TransferTable.COLUMN_TYPE);
        UUID randomUUID = UUID.randomUUID();
        long d = d();
        async$default = BuildersKt__Builders_commonKt.async$default(this.a, null, null, new PerformanceTracker$begin$deferredParams$1(j32Var, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new PerformanceTracker$begin$1(this, j32Var, async$default, d, randomUUID, null), 3, null);
        String a2 = j32Var.a();
        zq3.e(randomUUID);
        return new b(a2, randomUUID, async$default, d, null);
    }

    public final void e(b bVar, Map map) {
        zq3.h(bVar, "token");
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new PerformanceTracker$end$1(this, bVar, map, d(), null), 3, null);
    }

    public final void f(com.nytimes.android.performancetracker.lib.a aVar) {
        zq3.h(aVar, "observer");
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new PerformanceTracker$observe$1(this, aVar, null), 3, null);
    }

    public final void g(j32 j32Var) {
        zq3.h(j32Var, TransferTable.COLUMN_TYPE);
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new PerformanceTracker$track$1(this, j32Var, null), 3, null);
    }

    public final Map h(Map map, Map map2) {
        if (map != null && map2 != null) {
            Map x = t.x(map);
            x.putAll(map2);
            return x;
        }
        if (map != null) {
            return map;
        }
        if (map2 != null) {
            return map2;
        }
        return null;
    }
}
