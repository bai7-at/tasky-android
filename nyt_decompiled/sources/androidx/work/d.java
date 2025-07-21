package androidx.work;

import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.dk9;
import defpackage.gv0;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class d {
    public static final b d = new b(null);
    private final UUID a;
    private final dk9 b;
    private final Set c;

    public static abstract class a {
        private final Class a;
        private boolean b;
        private UUID c;
        private dk9 d;
        private final Set e;

        public a(Class cls) {
            zq3.h(cls, "workerClass");
            this.a = cls;
            UUID randomUUID = UUID.randomUUID();
            zq3.g(randomUUID, "randomUUID()");
            this.c = randomUUID;
            String uuid = this.c.toString();
            zq3.g(uuid, "id.toString()");
            String name = cls.getName();
            zq3.g(name, "workerClass.name");
            this.d = new dk9(uuid, name);
            String name2 = cls.getName();
            zq3.g(name2, "workerClass.name");
            this.e = b0.h(name2);
        }

        public final a a(String str) {
            zq3.h(str, "tag");
            this.e.add(str);
            return g();
        }

        public final d b() {
            d c = c();
            gv0 gv0Var = this.d.j;
            boolean z = gv0Var.g() || gv0Var.h() || gv0Var.i() || gv0Var.j();
            dk9 dk9Var = this.d;
            if (dk9Var.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (dk9Var.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (dk9Var.k() == null) {
                dk9 dk9Var2 = this.d;
                dk9Var2.p(d.d.b(dk9Var2.c));
            }
            UUID randomUUID = UUID.randomUUID();
            zq3.g(randomUUID, "randomUUID()");
            k(randomUUID);
            return c;
        }

        public abstract d c();

        public final boolean d() {
            return this.b;
        }

        public final UUID e() {
            return this.c;
        }

        public final Set f() {
            return this.e;
        }

        public abstract a g();

        public final dk9 h() {
            return this.d;
        }

        public final a i(BackoffPolicy backoffPolicy, long j, TimeUnit timeUnit) {
            zq3.h(backoffPolicy, "backoffPolicy");
            zq3.h(timeUnit, "timeUnit");
            this.b = true;
            dk9 dk9Var = this.d;
            dk9Var.l = backoffPolicy;
            dk9Var.o(timeUnit.toMillis(j));
            return g();
        }

        public final a j(gv0 gv0Var) {
            zq3.h(gv0Var, "constraints");
            this.d.j = gv0Var;
            return g();
        }

        public final a k(UUID uuid) {
            zq3.h(uuid, "id");
            this.c = uuid;
            String uuid2 = uuid.toString();
            zq3.g(uuid2, "id.toString()");
            this.d = new dk9(uuid2, this.d);
            return g();
        }

        public a l(long j, TimeUnit timeUnit) {
            zq3.h(timeUnit, "timeUnit");
            this.d.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.d.g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a m(Data data) {
            zq3.h(data, "inputData");
            this.d.e = data;
            return g();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            List F0 = h.F0(str, new String[]{InstructionFileId.DOT}, false, 0, 6, null);
            String str2 = F0.size() == 1 ? (String) F0.get(0) : (String) i.w0(F0);
            return str2.length() <= 127 ? str2 : h.l1(str2, 127);
        }

        private b() {
        }
    }

    public d(UUID uuid, dk9 dk9Var, Set set) {
        zq3.h(uuid, "id");
        zq3.h(dk9Var, "workSpec");
        zq3.h(set, "tags");
        this.a = uuid;
        this.b = dk9Var;
        this.c = set;
    }

    public UUID a() {
        return this.a;
    }

    public final String b() {
        String uuid = a().toString();
        zq3.g(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.c;
    }

    public final dk9 d() {
        return this.b;
    }
}
