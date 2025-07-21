package org.jsoup.nodes;

import defpackage.a95;
import defpackage.o48;
import defpackage.u29;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class b implements Iterable, Cloneable {
    private static final String[] d = new String[0];
    private int a = 0;
    String[] b;
    String[] c;

    class a implements Iterator {
        int a = 0;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.jsoup.nodes.a next() {
            b bVar = b.this;
            String[] strArr = bVar.b;
            int i = this.a;
            org.jsoup.nodes.a aVar = new org.jsoup.nodes.a(strArr[i], bVar.c[i], bVar);
            this.a++;
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.a < b.this.a) {
                b bVar = b.this;
                if (!bVar.E(bVar.b[this.a])) {
                    break;
                }
                this.a++;
            }
            return this.a < b.this.a;
        }

        @Override // java.util.Iterator
        public void remove() {
            b bVar = b.this;
            int i = this.a - 1;
            this.a = i;
            bVar.K(i);
        }
    }

    public b() {
        String[] strArr = d;
        this.b = strArr;
        this.c = strArr;
    }

    private int B(String str) {
        u29.i(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equalsIgnoreCase(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    static String D(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i) {
        u29.b(i >= this.a);
        int i2 = (this.a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.c;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.a - 1;
        this.a = i4;
        this.b[i4] = null;
        this.c[i4] = null;
    }

    private void n(int i) {
        u29.c(i >= this.a);
        String[] strArr = this.b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 2 ? 2 * this.a : 2;
        if (i <= i2) {
            i = i2;
        }
        this.b = q(strArr, i);
        this.c = q(this.c, i);
    }

    static String o(String str) {
        return str == null ? "" : str;
    }

    private static String[] q(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    int A(String str) {
        u29.i(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equals(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public void F() {
        for (int i = 0; i < this.a; i++) {
            String[] strArr = this.b;
            strArr[i] = a95.a(strArr[i]);
        }
    }

    public b H(String str, String str2) {
        u29.i(str);
        int A = A(str);
        if (A != -1) {
            this.c[A] = str2;
        } else {
            f(str, str2);
        }
        return this;
    }

    public b I(org.jsoup.nodes.a aVar) {
        u29.i(aVar);
        H(aVar.getKey(), aVar.getValue());
        aVar.c = this;
        return this;
    }

    void J(String str, String str2) {
        int B = B(str);
        if (B == -1) {
            f(str, str2);
            return;
        }
        this.c[B] = str2;
        if (this.b[B].equals(str)) {
            return;
        }
        this.b[B] = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && Arrays.equals(this.b, bVar.b)) {
            return Arrays.equals(this.c, bVar.c);
        }
        return false;
    }

    public b f(String str, String str2) {
        n(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = str2;
        this.a = i + 1;
        return this;
    }

    public void g(b bVar) {
        if (bVar.size() == 0) {
            return;
        }
        n(this.a + bVar.a);
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            I((org.jsoup.nodes.a) it2.next());
        }
    }

    public int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    public boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public List k() {
        ArrayList arrayList = new ArrayList(this.a);
        for (int i = 0; i < this.a; i++) {
            if (!E(this.b[i])) {
                arrayList.add(new org.jsoup.nodes.a(this.b[i], this.c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.a = this.a;
            this.b = q(this.b, this.a);
            this.c = q(this.c, this.a);
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            if (!E(this.b[i2])) {
                i++;
            }
        }
        return i;
    }

    public int t(org.jsoup.parser.d dVar) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean d2 = dVar.d();
        int i2 = 0;
        while (i < this.b.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.b;
                if (i4 < strArr.length && (str = strArr[i4]) != null) {
                    if (!d2 || !strArr[i].equals(str)) {
                        if (!d2) {
                            String[] strArr2 = this.b;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    K(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    public String toString() {
        return y();
    }

    public String u(String str) {
        int A = A(str);
        return A == -1 ? "" : o(this.c[A]);
    }

    public String v(String str) {
        int B = B(str);
        return B == -1 ? "" : o(this.c[B]);
    }

    public boolean w(String str) {
        return A(str) != -1;
    }

    public boolean x(String str) {
        return B(str) != -1;
    }

    public String y() {
        StringBuilder b = o48.b();
        try {
            z(b, new Document("").N0());
            return o48.m(b);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    final void z(Appendable appendable, Document.OutputSettings outputSettings) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!E(this.b[i2])) {
                String str = this.b[i2];
                String str2 = this.c[i2];
                appendable.append(' ').append(str);
                if (!org.jsoup.nodes.a.i(str, str2, outputSettings)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    Entities.e(appendable, str2, outputSettings, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }
}
