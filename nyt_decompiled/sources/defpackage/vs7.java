package defpackage;

import defpackage.jc5;
import rx.internal.producers.SingleDelayedProducer;

/* loaded from: classes5.dex */
public class vs7 {
    static t47 b = r47.b().f();
    final jc5.a a;

    class a implements jc5.a {
        final /* synthetic */ b a;

        /* renamed from: vs7$a$a, reason: collision with other inner class name */
        class C0551a extends ut7 {
            final /* synthetic */ SingleDelayedProducer b;
            final /* synthetic */ wa8 c;

            C0551a(SingleDelayedProducer singleDelayedProducer, wa8 wa8Var) {
                this.b = singleDelayedProducer;
                this.c = wa8Var;
            }

            @Override // defpackage.ut7
            public void b(Throwable th) {
                this.c.onError(th);
            }

            @Override // defpackage.ut7
            public void c(Object obj) {
                this.b.b(obj);
            }
        }

        a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.w3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(wa8 wa8Var) {
            SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(wa8Var);
            wa8Var.setProducer(singleDelayedProducer);
            gb8 c0551a = new C0551a(singleDelayedProducer, wa8Var);
            wa8Var.add(c0551a);
            this.a.call(c0551a);
        }
    }

    public interface b extends w3 {
    }

    protected vs7(b bVar) {
        this.a = new a(bVar);
    }
}
