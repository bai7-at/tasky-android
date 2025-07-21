package defpackage;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class dk7 {

    public static final class a implements Iterator, yu3 {
        private int a;
        final /* synthetic */ SerialDescriptor b;

        a(SerialDescriptor serialDescriptor) {
            this.b = serialDescriptor;
            this.a = serialDescriptor.e();
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.b;
            int e = serialDescriptor.e();
            int i = this.a;
            this.a = i - 1;
            return serialDescriptor.h(e - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, yu3 {
        private int a;
        final /* synthetic */ SerialDescriptor b;

        b(SerialDescriptor serialDescriptor) {
            this.b = serialDescriptor;
            this.a = serialDescriptor.e();
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.b;
            int e = serialDescriptor.e();
            int i = this.a;
            this.a = i - 1;
            return serialDescriptor.f(e - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, yu3 {
        final /* synthetic */ SerialDescriptor a;

        public c(SerialDescriptor serialDescriptor) {
            this.a = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.a);
        }
    }

    public static final class d implements Iterable, yu3 {
        final /* synthetic */ SerialDescriptor a;

        public d(SerialDescriptor serialDescriptor) {
            this.a = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.a);
        }
    }

    public static final Iterable a(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "<this>");
        return new c(serialDescriptor);
    }

    public static final Iterable b(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "<this>");
        return new d(serialDescriptor);
    }
}
