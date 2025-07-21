package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.e;
import defpackage.c12;
import defpackage.ku0;
import defpackage.wb5;
import defpackage.xb5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class e {
    private final Map a;
    private final Map b;
    private final wb5 c;

    public static final class a implements c12 {
        private static final wb5 d = new wb5() { // from class: l76
            @Override // defpackage.wb5
            public final void a(Object obj, Object obj2) {
                e.a.e(obj, (xb5) obj2);
            }
        };
        private final Map a = new HashMap();
        private final Map b = new HashMap();
        private wb5 c = d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, xb5 xb5Var) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public e c() {
            return new e(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(ku0 ku0Var) {
            ku0Var.a(this);
            return this;
        }

        @Override // defpackage.c12
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, wb5 wb5Var) {
            this.a.put(cls, wb5Var);
            this.b.remove(cls);
            return this;
        }
    }

    e(Map map, Map map2, wb5 wb5Var) {
        this.a = map;
        this.b = map2;
        this.c = wb5Var;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new d(outputStream, this.a, this.b, this.c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
