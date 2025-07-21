package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f0;
import defpackage.s14;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements f0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0077a implements f0.a {
        protected static void f(Iterable iterable, List list) {
            t.a(iterable);
            if (!(iterable instanceof s14)) {
                if (iterable instanceof m0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    g(iterable, list);
                    return;
                }
            }
            List h = ((s14) iterable).h();
            s14 s14Var = (s14) list;
            int size = list.size();
            for (Object obj : h) {
                if (obj == null) {
                    String str = "Element at index " + (s14Var.size() - size) + " is null.";
                    for (int size2 = s14Var.size() - 1; size2 >= size; size2--) {
                        s14Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    s14Var.F0((ByteString) obj);
                } else {
                    s14Var.add((String) obj);
                }
            }
        }

        private static void g(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static UninitializedMessageException k(f0 f0Var) {
            return new UninitializedMessageException(f0Var);
        }

        protected abstract AbstractC0077a h(a aVar);

        @Override // androidx.datastore.preferences.protobuf.f0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public AbstractC0077a C(f0 f0Var) {
            if (d().getClass().isInstance(f0Var)) {
                return h((a) f0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static void f(Iterable iterable, List list) {
        AbstractC0077a.f(iterable, list);
    }

    abstract int g();

    int h(r0 r0Var) {
        int g = g();
        if (g != -1) {
            return g;
        }
        int d = r0Var.d(this);
        k(d);
        return d;
    }

    UninitializedMessageException i() {
        return new UninitializedMessageException(this);
    }

    abstract void k(int i);

    public void l(OutputStream outputStream) {
        CodedOutputStream Z = CodedOutputStream.Z(outputStream, CodedOutputStream.C(b()));
        e(Z);
        Z.W();
    }
}
