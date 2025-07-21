package defpackage;

import com.nytimes.android.external.cache3.CacheBuilder;
import com.nytimes.android.external.cache3.CacheLoader;
import com.nytimes.android.external.store3.base.RecordState;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class cf2 implements ve2 {
    private final b29 a;
    private final a74 b;
    private final File c;

    class a extends CacheLoader {
        final /* synthetic */ File a;

        a(File file) {
            this.a = file;
        }

        @Override // com.nytimes.android.external.cache3.CacheLoader
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v82 a(String str) {
            return new v82(this.a, str);
        }
    }

    cf2(File file) {
        b29 b29Var = new b29();
        this.a = b29Var;
        this.c = file;
        this.b = CacheBuilder.x().v(20L).b(new a(file));
        b29Var.a(file);
    }

    private String g(String str) {
        return this.a.e(str);
    }

    private Collection h(String str) {
        File file = new File(this.c, this.a.e(str));
        if (file.exists() && file.isFile()) {
            throw new FileNotFoundException(String.format("expecting a directory at %s, instead found a file", str));
        }
        ArrayList arrayList = new ArrayList();
        ic0 ic0Var = new ic0(file);
        while (ic0Var.hasNext()) {
            arrayList.add((v82) this.b.a(this.a.e(((File) ic0Var.next()).getPath().replaceFirst(this.c.getPath(), ""))));
        }
        return arrayList;
    }

    private v82 i(String str) {
        return (v82) this.b.a(g(str));
    }

    @Override // defpackage.ve2
    public void a(String str) {
        i(str).a();
    }

    @Override // defpackage.ve2
    public void b(String str) {
        Iterator it2 = h(str).iterator();
        while (it2.hasNext()) {
            ((v82) it2.next()).a();
        }
    }

    @Override // defpackage.ve2
    public sd0 c(String str) {
        return i(str).d();
    }

    @Override // defpackage.ve2
    public boolean d(String str) {
        return i(str).b();
    }

    @Override // defpackage.ve2
    public void e(String str, sd0 sd0Var) {
        i(str).e(sd0Var);
    }

    @Override // defpackage.ve2
    public RecordState f(TimeUnit timeUnit, long j, String str) {
        v82 i = i(str);
        if (i.b()) {
            return i.c() < System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert(j, timeUnit) ? RecordState.STALE : RecordState.FRESH;
        }
        return RecordState.MISSING;
    }
}
