package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.a;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.ov6;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;

/* loaded from: classes.dex */
final class SaveableHolder implements fa7, ov6 {
    private ea7 a;
    private a b;
    private String c;
    private Object d;
    private Object[] e;
    private a.InterfaceC0052a f;
    private final qs2 g = new qs2() { // from class: androidx.compose.runtime.saveable.SaveableHolder$valueProvider$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Object mo865invoke() {
            ea7 ea7Var;
            Object obj;
            ea7Var = SaveableHolder.this.a;
            SaveableHolder saveableHolder = SaveableHolder.this;
            obj = saveableHolder.d;
            if (obj != null) {
                return ea7Var.a(saveableHolder, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    };

    public SaveableHolder(ea7 ea7Var, a aVar, String str, Object obj, Object[] objArr) {
        this.a = ea7Var;
        this.b = aVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    private final void h() {
        a aVar = this.b;
        if (this.f == null) {
            if (aVar != null) {
                RememberSaveableKt.c(aVar, this.g.mo865invoke());
                this.f = aVar.b(this.c, this.g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f + ") is not null").toString());
    }

    @Override // defpackage.fa7
    public boolean a(Object obj) {
        a aVar = this.b;
        return aVar == null || aVar.a(obj);
    }

    @Override // defpackage.ov6
    public void c() {
        h();
    }

    @Override // defpackage.ov6
    public void d() {
        a.InterfaceC0052a interfaceC0052a = this.f;
        if (interfaceC0052a != null) {
            interfaceC0052a.unregister();
        }
    }

    @Override // defpackage.ov6
    public void e() {
        a.InterfaceC0052a interfaceC0052a = this.f;
        if (interfaceC0052a != null) {
            interfaceC0052a.unregister();
        }
    }

    public final Object g(Object[] objArr) {
        if (Arrays.equals(objArr, this.e)) {
            return this.d;
        }
        return null;
    }

    public final void i(ea7 ea7Var, a aVar, String str, Object obj, Object[] objArr) {
        boolean z;
        boolean z2 = true;
        if (this.b != aVar) {
            this.b = aVar;
            z = true;
        } else {
            z = false;
        }
        if (zq3.c(this.c, str)) {
            z2 = z;
        } else {
            this.c = str;
        }
        this.a = ea7Var;
        this.d = obj;
        this.e = objArr;
        a.InterfaceC0052a interfaceC0052a = this.f;
        if (interfaceC0052a == null || !z2) {
            return;
        }
        if (interfaceC0052a != null) {
            interfaceC0052a.unregister();
        }
        this.f = null;
        h();
    }
}
