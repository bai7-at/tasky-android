package defpackage;

/* loaded from: classes5.dex */
public class dq0 {
    static final dq0 b = a(new a());
    static final dq0 c = a(new c());
    static final n47 d = r47.b().a();
    private final d a;

    static class a implements d {
        a() {
        }
    }

    class b implements d {
        final /* synthetic */ eb7 a;

        b(eb7 eb7Var) {
            this.a = eb7Var;
        }
    }

    static class c implements d {
        c() {
        }
    }

    public interface d extends w3 {
    }

    public interface e {
        void a(gb8 gb8Var);

        void onCompleted();

        void onError(Throwable th);
    }

    protected dq0(d dVar) {
        this.a = dVar;
    }

    public static dq0 a(d dVar) {
        b(dVar);
        try {
            return new dq0(dVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            d.a(th);
            throw d(th);
        }
    }

    static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    static NullPointerException d(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public final dq0 c(eb7 eb7Var) {
        b(eb7Var);
        return a(new b(eb7Var));
    }
}
