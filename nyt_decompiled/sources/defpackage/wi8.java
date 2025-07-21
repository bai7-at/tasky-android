package defpackage;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* loaded from: classes.dex */
public class wi8 extends sw3 {

    class a extends cd4 {
        final /* synthetic */ qc4 d;
        final /* synthetic */ cd4 e;
        final /* synthetic */ DocumentData f;

        a(qc4 qc4Var, cd4 cd4Var, DocumentData documentData) {
            this.d = qc4Var;
            this.e = cd4Var;
            this.f = documentData;
        }

        @Override // defpackage.cd4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public DocumentData a(qc4 qc4Var) {
            this.d.h(qc4Var.f(), qc4Var.a(), ((DocumentData) qc4Var.g()).a, ((DocumentData) qc4Var.b()).a, qc4Var.d(), qc4Var.c(), qc4Var.e());
            String str = (String) this.e.a(this.d);
            DocumentData documentData = (DocumentData) (qc4Var.c() == 1.0f ? qc4Var.b() : qc4Var.g());
            this.f.a(str, documentData.b, documentData.c, documentData.d, documentData.e, documentData.f, documentData.g, documentData.h, documentData.i, documentData.j, documentData.k, documentData.l, documentData.m);
            return this.f;
        }
    }

    public wi8(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public DocumentData i(rw3 rw3Var, float f) {
        Object obj;
        cd4 cd4Var = this.e;
        if (cd4Var == null) {
            return (f != 1.0f || (obj = rw3Var.c) == null) ? (DocumentData) rw3Var.b : (DocumentData) obj;
        }
        float f2 = rw3Var.g;
        Float f3 = rw3Var.h;
        float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        Object obj2 = rw3Var.b;
        DocumentData documentData = (DocumentData) obj2;
        Object obj3 = rw3Var.c;
        return (DocumentData) cd4Var.b(f2, floatValue, documentData, obj3 == null ? (DocumentData) obj2 : (DocumentData) obj3, f, d(), f());
    }

    public void r(cd4 cd4Var) {
        super.o(new a(new qc4(), cd4Var, new DocumentData()));
    }
}
