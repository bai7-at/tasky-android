package defpackage;

import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public abstract class ul8 {
    public static final b a = new b(null);
    private static final ArrayList b = new ArrayList();
    private static volatile c[] c = new c[0];

    public static class a extends c {
        public static final C0547a Companion = new C0547a(null);
        private static final Pattern c = Pattern.compile("(\\$\\d+)+$");
        private final List b = i.o(ul8.class.getName(), b.class.getName(), c.class.getName(), a.class.getName());

        /* renamed from: ul8$a$a, reason: collision with other inner class name */
        public static final class C0547a {
            public /* synthetic */ C0547a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0547a() {
            }
        }

        @Override // ul8.c
        public String k() {
            String k = super.k();
            if (k != null) {
                return k;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            zq3.g(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.b.contains(stackTraceElement.getClassName())) {
                    return w(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // ul8.c
        protected void p(int i, String str, String str2, Throwable th) {
            int min;
            zq3.h(str2, "message");
            if (str2.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i, str, str2);
                    return;
                }
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int a0 = h.a0(str2, '\n', i2, false, 4, null);
                if (a0 == -1) {
                    a0 = length;
                }
                while (true) {
                    min = Math.min(a0, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i, str, substring);
                    }
                    if (min >= a0) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }

        protected abstract String w(StackTraceElement stackTraceElement);
    }

    public static final class b extends c {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return ul8.c.length;
        }

        @Override // ul8.c
        public void a(String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void b(Throwable th) {
            for (c cVar : ul8.c) {
                cVar.b(th);
            }
        }

        @Override // ul8.c
        public void c(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.c(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void d(String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void e(Throwable th) {
            for (c cVar : ul8.c) {
                cVar.e(th);
            }
        }

        @Override // ul8.c
        public void f(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.f(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void l(String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.l(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void m(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.m(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        protected void p(int i, String str, String str2, Throwable th) {
            zq3.h(str2, "message");
            throw new AssertionError();
        }

        @Override // ul8.c
        public void q(int i, Throwable th) {
            for (c cVar : ul8.c) {
                cVar.q(i, th);
            }
        }

        @Override // ul8.c
        public void r(int i, Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.r(i, th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void t(String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.t(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void u(String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.u(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ul8.c
        public void v(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            for (c cVar : ul8.c) {
                cVar.v(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final List w() {
            List unmodifiableList;
            synchronized (ul8.b) {
                unmodifiableList = Collections.unmodifiableList(i.X0(ul8.b));
                zq3.g(unmodifiableList, "unmodifiableList(trees.toList())");
            }
            return unmodifiableList;
        }

        public final void x(c cVar) {
            zq3.h(cVar, "tree");
            if (!(cVar != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (ul8.b) {
                ul8.b.add(cVar);
                Object[] array = ul8.b.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                ul8.c = (c[]) array;
                ww8 ww8Var = ww8.a;
            }
        }

        public final void y(c... cVarArr) {
            zq3.h(cVarArr, "trees");
            int length = cVarArr.length;
            int i = 0;
            while (i < length) {
                c cVar = cVarArr[i];
                i++;
                if (cVar == null) {
                    throw new IllegalArgumentException("trees contained null");
                }
                if (!(cVar != this)) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.");
                }
            }
            synchronized (ul8.b) {
                Collections.addAll(ul8.b, Arrays.copyOf(cVarArr, cVarArr.length));
                Object[] array = ul8.b.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                ul8.c = (c[]) array;
                ww8 ww8Var = ww8.a;
            }
        }

        public final c z(String str) {
            zq3.h(str, "tag");
            c[] cVarArr = ul8.c;
            int length = cVarArr.length;
            int i = 0;
            while (i < length) {
                c cVar = cVarArr[i];
                i++;
                cVar.i().set(str);
            }
            return this;
        }

        private b() {
        }
    }

    public static abstract class c {
        private final ThreadLocal a = new ThreadLocal();

        private final String j(Throwable th) {
            StringWriter stringWriter = new StringWriter(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            zq3.g(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void s(int i, Throwable th, String str, Object... objArr) {
            String k = k();
            if (o(k, i)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = g(str, objArr);
                    }
                    if (th != null) {
                        str = ((Object) str) + '\n' + j(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = j(th);
                }
                p(i, k, str, th);
            }
        }

        public void a(String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void b(Throwable th) {
            s(3, th, null, new Object[0]);
        }

        public void c(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(3, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(Throwable th) {
            s(6, th, null, new Object[0]);
        }

        public void f(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(6, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        protected String g(String str, Object[] objArr) {
            zq3.h(str, "message");
            zq3.h(objArr, "args");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            zq3.g(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public final /* synthetic */ ThreadLocal i() {
            return this.a;
        }

        public /* synthetic */ String k() {
            String str = (String) this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        public void l(String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void m(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(4, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        protected boolean n(int i) {
            return true;
        }

        protected boolean o(String str, int i) {
            return n(i);
        }

        protected abstract void p(int i, String str, String str2, Throwable th);

        public void q(int i, Throwable th) {
            s(i, th, null, new Object[0]);
        }

        public void r(int i, Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(i, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void t(String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void u(String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void v(Throwable th, String str, Object... objArr) {
            zq3.h(objArr, "args");
            s(5, th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
