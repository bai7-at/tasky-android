package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;

/* loaded from: classes.dex */
public class z {
    private final a a;
    private final Object b;
    private final Object c;

    static class a {
        public final WireFormat.FieldType a;
        public final Object b;
        public final WireFormat.FieldType c;
        public final Object d;

        public a(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.a = fieldType;
            this.b = obj;
            this.c = fieldType2;
            this.d = obj2;
        }
    }

    private z(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.a = new a(fieldType, obj, fieldType2, obj2);
        this.b = obj;
        this.c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return p.b(aVar.a, 1, obj) + p.b(aVar.c, 2, obj2);
    }

    public static z d(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        return new z(fieldType, obj, fieldType2, obj2);
    }

    static void e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        p.u(codedOutputStream, aVar.a, 1, obj);
        p.u(codedOutputStream, aVar.c, 2, obj2);
    }

    public int a(int i, Object obj, Object obj2) {
        return CodedOutputStream.P(i) + CodedOutputStream.y(b(this.a, obj, obj2));
    }

    a c() {
        return this.a;
    }
}
