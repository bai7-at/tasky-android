package rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    static final class CompositeExceptionCausalChain extends RuntimeException {
        static String a = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        CompositeExceptionCausalChain() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return a;
        }
    }

    private static abstract class b {
        private b() {
        }

        abstract Object a();

        abstract void b(Object obj);
    }

    private static class c extends b {
        private final PrintStream a;

        c(PrintStream printStream) {
            super();
            this.a = printStream;
        }

        @Override // rx.exceptions.CompositeException.b
        Object a() {
            return this.a;
        }

        @Override // rx.exceptions.CompositeException.b
        void b(Object obj) {
            this.a.println(obj);
        }
    }

    private static class d extends b {
        private final PrintWriter a;

        d(PrintWriter printWriter) {
            super();
            this.a = printWriter;
        }

        @Override // rx.exceptions.CompositeException.b
        Object a() {
            return this.a;
        }

        @Override // rx.exceptions.CompositeException.b
        void b(Object obj) {
            this.a.println(obj);
        }
    }

    public CompositeException(String str, Collection collection) {
        this.cause = null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                Throwable th = (Throwable) it2.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = unmodifiableList;
        this.message = unmodifiableList.size() + " exceptions occurred. ";
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append("\n");
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    private List c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            if (cause.getCause() == null) {
                return arrayList;
            }
            cause = cause.getCause();
        }
    }

    private void d(b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :");
            sb.append("\n");
            a(sb, th, "\t");
            i++;
        }
        synchronized (bVar.a()) {
            bVar.b(sb.toString());
        }
    }

    public List b() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.cause == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it2 = this.exceptions.iterator();
                Throwable th = compositeExceptionCausalChain;
                while (it2.hasNext()) {
                    Throwable next = it2.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : c(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            th.initCause(next);
                            th = th.getCause();
                        } catch (Throwable unused) {
                            th = next;
                        }
                    }
                }
                this.cause = compositeExceptionCausalChain;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        d(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        d(new d(printWriter));
    }

    public CompositeException(Collection collection) {
        this(null, collection);
    }
}
